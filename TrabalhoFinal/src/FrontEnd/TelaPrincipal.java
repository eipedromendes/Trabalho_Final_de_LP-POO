package FrontEnd;

import BackEnd.Produto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class TelaPrincipal extends JFrame {

    private List<Produto> produtos;
    private List<Produto> produtosCarrinho;

    public TelaPrincipal() {
        setTitle("Tela Principal");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a tela no centro da tela do monitor

        produtosCarrinho = new ArrayList<>();

        try {
            inicializarProdutos();
        } catch (Exception e) {
            System.out.println("Erro ao inicializar produtos: " + e.getMessage());
            e.printStackTrace();
        }

        JPanel painelPrincipal = new JPanel(new BorderLayout());

        DefaultListModel<String> modelListaProdutos = new DefaultListModel<>();
        for (Produto produto : produtos) {
            modelListaProdutos.addElement(produto.getNome() + " - R$" + produto.getPreco() + " - Quantidade: " + produto.getQuantidadeEmEstoque());
        }

        JList<String> listaProdutos = new JList<>(modelListaProdutos);
        listaProdutos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JScrollPane scrollPane = new JScrollPane(listaProdutos);
        painelPrincipal.add(scrollPane, BorderLayout.CENTER);

        // Botão para adicionar ao carrinho
        JButton botaoAdicionarCarrinho = new JButton("Adicionar ao Carrinho");
        botaoAdicionarCarrinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = listaProdutos.getSelectedIndex();
                if (selectedIndex != -1) {
                    Produto produtoSelecionado = produtos.get(selectedIndex);
                    produtosCarrinho.add(produtoSelecionado);
                    System.out.println("Produto adicionado ao carrinho: " + produtoSelecionado.getNome());
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione um produto para adicionar ao carrinho.");
                }
            }
        });

        // Botão para abrir o carrinho
        JButton botaoAbrirCarrinho = new JButton("Abrir Carrinho");
        botaoAbrirCarrinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    abrirTelaCarrinho();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao abrir a tela do carrinho: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }
        });

        JPanel painelBotoes = new JPanel();
        painelBotoes.add(botaoAdicionarCarrinho);
        painelBotoes.add(botaoAbrirCarrinho);

        painelPrincipal.add(painelBotoes, BorderLayout.SOUTH);

        add(painelPrincipal);
    }

    private void inicializarProdutos() throws Exception {
        try {
            System.out.println("Inicializando produtos...");
            produtos = new ArrayList<>();
            produtos.add(new Produto("Capinha de Celular", 29.90, 10));
            produtos.add(new Produto("Película Protetora", 19.90, 15));
            produtos.add(new Produto("Carregador Power Bank", 89.90, 5));
            produtos.add(new Produto("Carregador por Indução", 119.90, 3));
            produtos.add(new Produto("Carregador de Caixinha", 39.90, 8));
            produtos.add(new Produto("Cabo HDMI", 24.90, 20));
            produtos.add(new Produto("Cabo USB", 14.90, 25));
            produtos.add(new Produto("Cabo USB-C", 19.90, 18));
            produtos.add(new Produto("Cabo P2", 9.90, 30));
            produtos.add(new Produto("Cabo para iPhone", 29.90, 12));
            produtos.add(new Produto("Fone de Ouvido com Fio", 49.90, 10));
            produtos.add(new Produto("Fone de Ouvido Bluetooth", 99.90, 7));
            produtos.add(new Produto("Suporte para Celular (Tripé)", 79.90, 5));
            produtos.add(new Produto("Suporte para Moto", 59.90, 6));
            produtos.add(new Produto("Suporte para Carro", 49.90, 8));
            produtos.add(new Produto("Gimbal", 299.90, 2));
            produtos.add(new Produto("Memória Externa (Pen Drive)", 39.90, 15));
            produtos.add(new Produto("Memória Externa (Cartão de Memória)", 59.90, 12));
            produtos.add(new Produto("Memória Externa (HD Externo)", 199.90, 4));
            produtos.add(new Produto("Caixa de Som", 149.90, 6));
            produtos.add(new Produto("Controle (Manete) de Jogos", 129.90, 10));
            produtos.add(new Produto("Estojo à Prova d’Água", 69.90, 8));
            // Adicione outros produtos conforme necessário
        } catch (Exception e) {
            System.out.println("Erro ao inicializar produtos: " + e.getMessage());
            e.printStackTrace();
            throw new Exception("Erro ao inicializar produtos.", e);
        }
    }

    private void abrirTelaCarrinho() {
        TelaCarrinho telaCarrinho = new TelaCarrinho(produtosCarrinho, this);
        telaCarrinho.setVisible(true); // Exibe a tela de carrinho
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    new TelaPrincipal().setVisible(true); // Exibe a tela principal
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Erro ao iniciar a tela principal: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }
}