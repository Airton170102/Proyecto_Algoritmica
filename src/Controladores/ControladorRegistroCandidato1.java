
package Controladores;

import Modelo.Candidato;
import Modelo.Usuario;
import Vista.frmPrincipal;
import Vista.frmRegistroCandidato1;
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
                String d1 = fRC1.txtID.getText();
                String d2 = fRC1.txtNombres.getText();
                String d3 = fRC1.txtApellidos.getText();
                String d4 = fRC1.txtNacimiento.getText();
                String d5 = fRC1.txtDireccion.getText();
                String d6 = fRC1.txtTelefono.getText();
                String d7 = fRC1.txtEducacion.getText();
                String d8 = fRC1.txtExperiencia.getText();
                String d9 = fRC1.txtCertificaciones.getText();
                String d10 = fRC1.txtHabilidades.getText();
                String d11 = fRC1.txtObjetivo.getText();
                String d12 = fRC1.txtPuestoaPostular.getText();
                if (d1.isEmpty() || d2.isEmpty() || d3.isEmpty() || d4.isEmpty() || d5.isEmpty() || d6.isEmpty() || d7.isEmpty() || d8.isEmpty() || d9.isEmpty() || d10.isEmpty() || d11.isEmpty() || d12.isEmpty()){
                    JOptionPane.showMessageDialog( fRC1, "Todos los campos deben ser rellenados");
                }
                else 
                {
                    Candidato candidato = new Candidato(d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12);
                    candidato.registrarCandidato(d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12);
                    fRC1.setVisible(false);
                    frmPrincipal fp = new frmPrincipal();
                    ControladorPrincipal controlPrincipal = new ControladorPrincipal(u,fp);
                    controlPrincipal.iniciar();
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

