
package Controladores;

import Modelo.ContratarCandidato;
import Modelo.Usuario;
import Vista.frmContratarCandidatos;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorContratarCandidatos 
{
    Usuario u;
    frmContratarCandidatos frCont;
    
    public ControladorContratarCandidatos(Usuario u, frmContratarCandidatos frCont)
    {
        this.u = u;
        this.frCont = frCont;
        this.frCont.btnContratar.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frCont, "Candidato Contratado");
                ContratarCandidato contCand = new ContratarCandidato();
                contCand.agregarListaEmpleado(frCont);
            }
        });
        this.frCont.btnVolver.addActionListener( new ActionListener(){
           public void actionPerformed(ActionEvent e)
           {
               frCont.setVisible(false);
               frmPrincipal fp = new frmPrincipal();
               ControladorPrincipal controlPrincipal = new ControladorPrincipal(u,fp);
               controlPrincipal.iniciar();
           }
        });
    }
    
    public void iniciar(){
        this.frCont.setLocationRelativeTo(null);
        this.frCont.setVisible(true);
    }
}
