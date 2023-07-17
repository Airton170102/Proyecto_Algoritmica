
package Controladores;

import Modelo.Usuario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.UsuarioArreglo;
import Vista.frmLogin;
import Vista.frmPrincipal;
import Vista.frmRegistroUsuario;
import javax.swing.JOptionPane;

public class ControladorLogin {
    UsuarioArreglo ua;
    frmLogin fl;

    public ControladorLogin (UsuarioArreglo ua, frmLogin fl) {
        this.ua = ua;
        this.fl = fl;
        this.fl.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        this.fl.btnIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String c = fl.txtCorreo.getText();
                String p = new String(fl.txtPassword.getPassword());
                if (ua.exist(fl.txtCorreo.getText(), new String(fl.txtPassword.getPassword()))) {
                    JOptionPane.showMessageDialog( fl, "Ingreso de sesion exitoso");
                    fl.setVisible(false);
                    frmPrincipal fPrincipal = new frmPrincipal();
                    Usuario u = new Usuario(c,p);
                    ControladorPrincipal controlPrincipal = new ControladorPrincipal(u,fPrincipal);
                    controlPrincipal.iniciar();
                }
                else {
                    JOptionPane.showMessageDialog( fl, "Credencial de correo invalida");
                }
                limpiarControles();
            }
        });   
        this.fl.btnRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Librerias.SerializadoraGen.serializar("Datos", Configuracion.Datos.personas);
                fl.setVisible(false);
                frmRegistroUsuario fRegistro = new frmRegistroUsuario();
                ControladorRegistroUsuario controlRegistro = new ControladorRegistroUsuario(ua,fRegistro);
                controlRegistro.iniciar();
            }
        });
    }
    
    public void iniciar(){
        this.fl.setLocationRelativeTo(null);
        //limpiarControles();
        this.fl.setVisible(true);
    }
    
    public void limpiarControles(){
        fl.txtPassword.setText("");
        fl.txtCorreo.setText("");
    }
}
