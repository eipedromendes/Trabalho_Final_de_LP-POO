package FrontEnd;

import BackEnd.Produto;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TelaEstoque extends JFrame {

    private List<Produto> produtos;

    public TelaEstoque() {
        try {
            inicializarProdutos(); // Inicializa os produtos ao criar a tela

            setTitle("Tela de Estoque");
            setSize(800, 600);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setLocationRelativeTo(null); // Centraliza a tela no centro da tela do monitor

            JPanel painelEstoque = new JPanel(new GridLayout(produtos.size(), 1));

            for (Produto produto : produtos) {
                JLabel labelProduto = new JLabel(produto.getNome() + " - R$" + produto.getPreco() +
                        " | Estoque: " + produto.getQuantidadeEmEstoque());
                painelEstoque.add(labelProduto);
            }

            JButton botaoAdicionarProduto = new JButton("Adicionar Produto");
            botaoAdicionarProduto.addActionListener(e -> {
                JOptionPane.showMessageDialog(null, "Implementar lógica para adicionar produto ao estoque."); // Ação de adicionar produto ao estoque (futuro)
            });
            painelEstoque.add(botaoAdicionarProduto);

            add(painelEstoque);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inicializar tela de estoque: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void inicializarProdutos() throws Exception {
        try {
            System.out.println("Inicializando produtos...");
            produtos = new ArrayList<>();
            produtos.add(new Produto("Capinha de Celular", 29.90, 100));
            produtos.add(new Produto("Película Protetora", 19.90, 150));
            produtos.add(new Produto("Carregador Power Bank", 89.90, 50));
            produtos.add(new Produto("Carregador por Indução", 119.90, 3));
            produtos.add(new Produto("Carregador de Caixinha", 39.90, 80));
            produtos.add(new Produto("Cabo HDMI", 24.90, 200));
            produtos.add(new Produto("Cabo USB", 14.90, 250));
            produtos.add(new Produto("Cabo USB-C", 19.90, 180));
            produtos.add(new Produto("Cabo P2", 9.90, 30));
            produtos.add(new Produto("Cabo para iPhone", 29.90, 120));
            produtos.add(new Produto("Fone de Ouvido com Fio", 49.90, 100));
            produtos.add(new Produto("Fone de Ouvido Bluetooth", 99.90, 7));
            produtos.add(new Produto("Suporte para Celular (Tripé)", 79.90, 5));
            produtos.add(new Produto("Suporte para Moto", 59.90, 6));
            produtos.add(new Produto("Suporte para Carro", 49.90, 8));
            produtos.add(new Produto("Gimbal", 299.90, 2));
            produtos.add(new Produto("Memória Externa (Pen Drive)", 39.90, 105));
            produtos.add(new Produto("Memória Externa (Cartão de Memória)", 59.90, 20));
            produtos.add(new Produto("Memória Externa (Pen Drive)", 39.90, 150));
            produtos.add(new Produto("Memória Externa (Cartão de Memória)", 59.90, 12));
            produtos.add(new Produto("Memória Externa (HD Externo)", 199.90, 4));
            produtos.add(new Produto("Caixa de Som", 149.90, 6));
            produtos.add(new Produto("Controle (Manete) de Jogos", 129.90, 10));
            produtos.add(new Produto("Estojo à Prova d’Água", 69.90, 8));
        } catch (Exception e) {
            System.out.println("Erro ao inicializar produtos: " + e.getMessage());
            throw new Exception("Erro ao inicializar produtos.", e);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true); // Inicia a tela de estoque
            }
        });
    }
}