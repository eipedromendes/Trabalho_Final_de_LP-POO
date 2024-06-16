package FrontEnd;

import javax.swing.*;
import java.awt.*;

public class TelaLogin extends JFrame {

    public TelaLogin() {
        try {
            setTitle("Login");
            setSize(400, 300);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLocationRelativeTo(null); // Centraliza a tela no centro da tela do monitor

            JPanel painelLogin = new JPanel(new GridLayout(3, 1));

            JLabel labelUsuario = new JLabel("Usuário:");
            JTextField campoUsuario = new JTextField(20);
            painelLogin.add(labelUsuario);
            painelLogin.add(campoUsuario);

            JLabel labelSenha = new JLabel("Senha:");
            JPasswordField campoSenha = new JPasswordField(20);
            painelLogin.add(labelSenha);
            painelLogin.add(campoSenha);

            JButton botaoLogin = new JButton("Login");
            botaoLogin.addActionListener(e -> {
                String usuario = campoUsuario.getText();
                String senha = new String(campoSenha.getPassword());
                // Adicionar lógica de autenticação aqui
                if (usuario.equals("admin") && senha.equals("admin")) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    // Abre a tela principal após o login ser bem sucedido
                    new TelaPrincipal().setVisible(true);
                    dispose(); // Fecha a tela de login
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
                }
            });
            painelLogin.add(botaoLogin);

            add(painelLogin);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inicializar tela de login: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true); // Inicia a tela de login
            }
        });
    }
}