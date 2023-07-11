
package Controladores;

import Modelo.PersonaArreglo;
import Vista.frmLogin;
import Vista.frmRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorRegistro {
    PersonaArreglo pa;
    frmRegistro fr;

    public ControladorRegistro (PersonaArreglo pa, frmRegistro fr) {
        this.pa = pa;
        this.fr = fr;
        this.fr.btnVolver.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Librerias.SerializadoraGen.serializar("Datos", Configuracion.Datos.personas);
                fr.setVisible(false);
                frmLogin fLogin = new frmLogin();
                ControladorLogin controlLogin = new ControladorLogin(pa,fLogin);
                controlLogin.iniciar();
            }
        });
        this.fr.btnRegistro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Librerias.SerializadoraGen.serializar("Datos", Configuracion.Datos.personas);
                
                
                
                fr.setVisible(false);
                frmLogin fLogin = new frmLogin();
                ControladorLogin controlLogin = new ControladorLogin(pa,fLogin);
                controlLogin.iniciar();
                
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
