
package Controladores;

import Modelo.Persona;
import Modelo.PersonaArreglo;
import Modelo.Usuario;
import Vista.frmPrincipal;
import Vista.frmRegistroCandidato1;
import Vista.frmRegistroCandidato2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorRegistroCandidato1 {
    Usuario u;
    frmRegistroCandidato1 fRC1;

    public ControladorRegistroCandidato1(Usuario u, frmRegistroCandidato1 fRC1) {
        this.u = u;
        this.fRC1 = fRC1;
        this.fRC1.btnSiguiente.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String c1 = fRC1.txtID.getText();
                String c2 = fRC1.txtNombres.getText();
                String c3 = fRC1.txtApellidos.getText();
                String c4 = fRC1.txtTelefono.getText();
                String c5 = fRC1.txtNacimiento.getText();
                String c6 = fRC1.txtDireccion.getText();
                String c7 = fRC1.txtEducacion.getText();
                if (c1.isEmpty() || c2.isEmpty() || c3.isEmpty() || c4.isEmpty() || c5.isEmpty() || c6.isEmpty() || c7.isEmpty()){
                    JOptionPane.showMessageDialog( fRC1, "Todos los campos deben ser rellenados");
                }
                else {
                    PersonaArreglo personas = new PersonaArreglo(100);
                    Persona persona = new Persona(c1,c2,c3,c4,c5,c6,c7);
                    personas.registrarPersona(persona);
                    fRC1.setVisible(false);
                    frmRegistroCandidato2 fRC2 = new frmRegistroCandidato2();
                    ControladorRegistroCandidato2 controlRC2 = new ControladorRegistroCandidato2(u,fRC2);
                    controlRC2.iniciar();
                }
            }
        });
        this.fRC1.btnVolver1.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fRC1.setVisible(false);
                frmPrincipal fp = new frmPrincipal();
                ControladorPrincipal controlPrincipal = new ControladorPrincipal(u,fp);
                controlPrincipal.iniciar();
            }
        });
    }
    
    public void iniciar(){
        this.fRC1.setLocationRelativeTo(null);
        this.fRC1.setVisible(true);
    }
}

