
package Controladores;

import Modelo.ProcesoSeleccion;
import Modelo.Usuario;
import Vista.frmPrincipal;
import Vista.frmSeleccionCandidatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorSeleccionCandidato {
    Usuario u;
    frmSeleccionCandidatos fSC;
    
    public ControladorSeleccionCandidato(Usuario u, frmSeleccionCandidatos fSC)
    {
        this.u = u;
        this.fSC = fSC;
        this.fSC.btnAgregar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(fSC, "Candidato Agregado para la Entrevista");
                
                ProcesoSeleccion idBuscado = new ProcesoSeleccion();
                idBuscado.agregarCandidatoEntrevista(fSC);
            }
            
        });
        this.fSC.btnVolver.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fSC.setVisible(false);
                frmPrincipal fp = new frmPrincipal();
                ControladorPrincipal controlPrincipal = new ControladorPrincipal(u,fp);
                controlPrincipal.iniciar();
            }
        });
    }
    
    public void iniciar(){
        this.fSC.setLocationRelativeTo(null);
        this.fSC.setVisible(true);
    }

}
