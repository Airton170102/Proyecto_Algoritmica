
package Controladores;

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
                JOptionPane.showMessageDialog(fSC, "Candidato Agregado");
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
        /*
        System.out.println("Si yo pongo algo aca, normal aparece en Pantalla, pero si lo pongo adentro del ActionListener, eso ya no se ejecuta");
        this.frSelecCand.botonAgregar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frSelecCand, "Candidato Agregado");
            }
            
        });
    */}
    public void iniciar(){
        this.fSC.setLocationRelativeTo(null);
        this.fSC.setVisible(true);
    }

}
