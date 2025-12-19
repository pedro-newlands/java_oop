package front;

import javax.swing.*;

import java.awt.*;

import auth.LoginService;
import auth.AuthenticationService;
import auth.UserSession;
import model.User;

public class AcessoSistema {
    public static void main(String args[]){
        JFrame frame = new JFrame(": Acesso ao Sistema");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,350);

        JPanel painel = new JPanel();
        painel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        
        
        JLabel labelUser = new JLabel("Usuario: ");
        JTextField campoUser = new JTextField(20);
        campoUser.setPreferredSize(new Dimension(200, 20));
        gbc.insets = new Insets(10, 10, 10, 10);
        
        
        JLabel labelPassword = new JLabel("Senha: ");
        JTextField campoPassword = new JTextField(20);
        campoPassword.setPreferredSize(new Dimension(250, 20));
     
	   
        JButton btnEntrar = new JButton("Entrar");
        JButton btnCancelar = new JButton("Cancelar");
        JButton btnNovoUsuario = new JButton("Novo Usuario");

        gbc.gridx = 0; gbc.gridy = 0; painel.add(labelUser, gbc);
        gbc.gridx = 1; ; painel.add(campoUser, gbc);

        gbc.gridx = 0; gbc.gridy = 1; painel.add(labelPassword, gbc);
        gbc.gridx = 1; painel.add(campoPassword, gbc);

        gbc.gridx = 0; gbc.gridy = 2; gbc.gridwidth = 2; painel.add(btnEntrar, gbc);
        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2; painel.add(btnCancelar, gbc);
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 2; painel.add(btnNovoUsuario, gbc);

        frame.add(painel);

        btnEntrar.addActionListener(e -> {
            try{
                String usuario = campoUser.getText().trim();  
                String senha = campoPassword.getText();     
                if (usuario.isEmpty()){
                    throw new IllegalArgumentException("Login inválido!");
                } else if (usuario.equals("Isa") && senha.equals("max123")){
                    JOptionPane.showMessageDialog(frame, "Bem-vindo(a), " + usuario);
                } else if (senha.isEmpty()){
                    throw new IllegalArgumentException("Login inválido!");
                } else {
                    throw new IllegalArgumentException("Login inválido!");
                }
            }catch(IllegalArgumentException ex){
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Validação", JOptionPane.WARNING_MESSAGE);
            }finally{
                campoUser.setText("");
                campoPassword.setText("");
            }
        });

        btnCancelar.addActionListener(e -> {
            System.exit(0);
        });

        btnNovoUsuario.addActionListener(e -> {
            JOptionPane.showMessageDialog(frame, "Em desenvolvimento");
        });
        frame.setVisible(true);

    }
}
