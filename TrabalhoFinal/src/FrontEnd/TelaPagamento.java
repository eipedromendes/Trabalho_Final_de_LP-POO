package FrontEnd;

import BackEnd.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaPagamento extends JFrame {

    private List<Produto> produtosCarrinho;

    public TelaPagamento(List<Produto> produtosCarrinho) {
        this.produtosCarrinho = produtosCarrinho;

        setTitle("Pagamento");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a tela no centro da tela do monitor

        JPanel painelPagamento = new JPanel(new GridLayout(3, 1));

        JLabel labelTitulo = new JLabel("Selecione a Forma de Pagamento:");
        painelPagamento.add(labelTitulo);

        JComboBox<String> comboBoxFormaPagamento = new JComboBox<>();
        comboBoxFormaPagamento.addItem("Cartão de Crédito");
        comboBoxFormaPagamento.addItem("Boleto Bancário");
        comboBoxFormaPagamento.addItem("Transferência Bancária");
        painelPagamento.add(comboBoxFormaPagamento);

        JButton botaoPagar = new JButton("Pagar");
        botaoPagar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String formaPagamento = (String) comboBoxFormaPagamento.getSelectedItem();
                    realizarPagamento(formaPagamento);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao processar pagamento: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
        painelPagamento.add(botaoPagar);

        add(painelPagamento);
    }

    private void realizarPagamento(String formaPagamento) {
        try {
            // Lógica de simulação de pagamento (pode ser integrada com sistemas de pagamento reais)
            boolean pagamentoEfetuado = simularPagamento(formaPagamento);

            if (pagamentoEfetuado) {
                JOptionPane.showMessageDialog(null, "Pagamento efetuado com sucesso! Compra concluída.");
                // Liberar os produtos do carrinho (simulação: aumenta a quantidade em estoque)
                for (Produto produto : produtosCarrinho) {
                    produto.setQuantidadeEmEstoque(produto.getQuantidadeEmEstoque() + 1);
                }
                // Fechar a tela de pagamento
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Falha no pagamento. Por favor, tente novamente.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao realizar pagamento: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private boolean simularPagamento(String formaPagamento) {
        // Lógica de simulação de pagamento (pode ser integrada com sistemas de pagamento reais)
        // Aqui estamos simulando um pagamento bem-sucedido
        return true;
    }

    public static void main(String[] args) {
        // Exemplo de utilização da tela de pagamento
        List<Produto> produtosCarrinho = new ArrayList<>(); // Supondo que aqui teríamos os produtos do carrinho

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPagamento(produtosCarrinho).setVisible(true); // Exibe a tela de pagamento
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao iniciar tela de pagamento: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }
}