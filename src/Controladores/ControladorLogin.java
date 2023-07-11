
package Controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Modelo.PersonaArreglo;
import Vista.frmLogin;
import Vista.frmPrincipal;
import Vista.frmRegistro;

public class ControladorLogin {
    PersonaArreglo pa;
    frmLogin fl;

    public ControladorLogin (PersonaArreglo pa, frmLogin fl) {
        this.pa = pa;
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
                ControladorPrincipal controlPrincipal = new ControladorPrincipal(pa,fPrincipal);
                controlPrincipal.iniciar();
            }
        
        });   
        this.fl.btnRegistro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Librerias.SerializadoraGen.serializar("Datos", Configuracion.Datos.personas);
                fl.setVisible(false);
                frmRegistro fRegistro = new frmRegistro();
                ControladorRegistro controlRegistro = new ControladorRegistro(pa,fRegistro);
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
