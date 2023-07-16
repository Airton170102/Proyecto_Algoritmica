
package Controladores;

import Vista.frmLogin;
import Vista.frmRegistro;
import Modelo.UsuarioArreglo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorRegistroUsuario {
    UsuarioArreglo ua;
    frmRegistro fr;

    public ControladorRegistroUsuario (UsuarioArreglo ua, frmRegistro fr) {
        this.ua = ua;
        this.fr = fr;
        this.fr.btnVolver.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fr.setVisible(false);
                frmLogin fLogin = new frmLogin();
                ControladorLogin controlLogin = new ControladorLogin(ua,fLogin);
                controlLogin.iniciar();
            }
        });
        this.fr.btnRegistro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String c = fr.txtCorreo.getText();
                String p = fr.txtPassword.getText();
                if (c.contains("@")){
                    ua.registrarCorreoYPassword(c,p);
                    JOptionPane.showMessageDialog( fr, "Registro exitoso");
                    fr.setVisible(false);
                    frmLogin fLogin = new frmLogin();
                    ControladorLogin controlLogin = new ControladorLogin(ua,fLogin);
                    controlLogin.iniciar();
                } else{
                    JOptionPane.showMessageDialog( fr, "Credencial de correo invalida" );
                }
                limpiarControles();
            }
        });
    }
    public void iniciar(){
        this.fr.setLocationRelativeTo(null);
        //limpiarControles();
        this.fr.setVisible(true);
    }
    
    public void limpiarControles(){
        fr.txtPassword.setText("");
        fr.txtCorreo.setText("");
    }
}
