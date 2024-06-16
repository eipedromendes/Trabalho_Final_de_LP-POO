package FrontEnd;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true); // Inicia a tela de login como ponto de entrada da aplicação
            }
        });
    }
}