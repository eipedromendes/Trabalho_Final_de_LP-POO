package FrontEnd;

import BackEnd.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class TelaCarrinho extends JFrame {

    private List<Produto> produtosCarrinho;
    private TelaPrincipal telaPrincipal;

    public TelaCarrinho(List<Produto> produtosCarrinho, TelaPrincipal telaPrincipal) {
        this.produtosCarrinho = produtosCarrinho;
        this.telaPrincipal = telaPrincipal;

        setTitle("Carrinho de Compras");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a tela no centro da tela do monitor

        JPanel painelCarrinho = new JPanel(new GridLayout(produtosCarrinho.size() + 1, 1));

        try {
            for (Produto produto : produtosCarrinho) {
                JLabel labelProduto = new JLabel(produto.getNome() + " - R$" + produto.getPreco());
                painelCarrinho.add(labelProduto);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao exibir produtos no carrinho: " + ex.getMessage());
            ex.printStackTrace();
        }

        JButton botaoVoltar = new JButton("Voltar para a Tela Principal");
        botaoVoltar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose(); // Fecha a tela de carrinho
                    telaPrincipal.setVisible(true); // Mostra a tela principal novamente
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao voltar para a tela principal: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
        painelCarrinho.add(botaoVoltar);

        JButton botaoPagamento = new JButton("Ir para a Tela de Pagamento");
        botaoPagamento.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    dispose(); // Fecha a tela de carrinho
                    new TelaPagamento(produtosCarrinho).setVisible(true); // Abre a tela de pagamento
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao ir para a tela de pagamento: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });
        painelCarrinho.add(botaoPagamento);

        add(painelCarrinho);
    }

    public static void main(String[] args) {
        // Exemplo de utilização da tela de carrinho
        List<Produto> produtosCarrinho = new ArrayList<>(); // Supondo que aqui teríamos os produtos do carrinho
        TelaPrincipal telaPrincipal = new TelaPrincipal(); // Referência à tela principal

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaCarrinho(produtosCarrinho, telaPrincipal).setVisible(true); // Exibe a tela de carrinho
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao iniciar tela de carrinho: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }
}
