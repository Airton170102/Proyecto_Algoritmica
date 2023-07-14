
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.UsuarioArreglo;
import Vista.frmLogin;
import Vista.frmPrincipal;
import Vista.frmRegistro;

public class ControladorLogin {
    UsuarioArreglo ua;
    frmLogin fl;

    public ControladorLogin (UsuarioArreglo ua, frmLogin fl) {
        this.ua = ua;
        this.fl = fl;
        this.fl.btnSalir.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Librerias.SerializadoraGen.serializar("Datos", Configuracion.Datos.personas);
                System.exit(0);
            }
        });
        this.fl.btnIngresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                //Librerias.SerializadoraGen.serializar("Datos", Configuracion.Datos.personas);
                fl.setVisible(false);
                frmPrincipal fPrincipal = new frmPrincipal();
                ControladorPrincipal controlPrincipal = new ControladorPrincipal(ua,fPrincipal);
                controlPrincipal.iniciar();
            }
        
        });   
        this.fl.btnRegistro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Librerias.SerializadoraGen.serializar("Datos", Configuracion.Datos.personas);
                fl.setVisible(false);
                frmRegistro fRegistro = new frmRegistro();
                ControladorRegistro controlRegistro = new ControladorRegistro(ua,fRegistro);
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
