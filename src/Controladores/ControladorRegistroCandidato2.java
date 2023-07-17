
package Controladores;

import Modelo.Usuario;
import Vista.frmPrincipal;
import Vista.frmRegistroCandidato1;
import Vista.frmRegistroCandidato2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorRegistroCandidato2 {
    Usuario u;
    frmRegistroCandidato2 fRC2;

    public ControladorRegistroCandidato2(Usuario u, frmRegistroCandidato2 fRC2) {
        this.u = u;
        this.fRC2 = fRC2;
        this.fRC2.btnRegistrar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String c1 = fRC2.txtExperiencia.getText();
                String c2 = fRC2.txtCertificaciones.getText();
                String c3 = fRC2.txtHabilidades.getText();
                String c4 = fRC2.txtObjetivo.getText();
                String c5 = fRC2.txtContratoFirmado.getText();
                if (c1.isEmpty() || c2.isEmpty() || c3.isEmpty() || c4.isEmpty() || c5.isEmpty()){
                    JOptionPane.showMessageDialog( fRC2, "Todos los campos deben ser rellenados");
                }
                else {
                    
                    JOptionPane.showMessageDialog( fRC2, "Registro de candidato exitoso");
                    fRC2.setVisible(false);
                    frmPrincipal fPrincipal = new frmPrincipal();
                    ControladorPrincipal controlPrincipal = new ControladorPrincipal(u,fPrincipal);
                    controlPrincipal.iniciar();
                }
            }
        });
        this.fRC2.btnVolver2.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fRC2.setVisible(false);
                frmRegistroCandidato1 fRC1 = new frmRegistroCandidato1();
                ControladorRegistroCandidato1 controlRC1 = new ControladorRegistroCandidato1(u,fRC1);
                controlRC1.iniciar();
            }
        });
    }
    public void iniciar(){
        this.fRC2.setLocationRelativeTo(null);
        //limpiarControles();
        this.fRC2.setVisible(true);
    }
    
    public void limpiarControles(){
        /*
        fRC2.txtPassword.setText("");
        fRC2.txtCorreo.setText("");
*/
    }
}
