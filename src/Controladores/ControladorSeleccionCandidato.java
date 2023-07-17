
package Controladores;

import Vista.frmSeleccionCandidatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControladorSeleccionCandidato {
    frmSeleccionCandidatos frSelecCand;
    
    public ControladorSeleccionCandidato(frmSeleccionCandidatos frSelecCand)
    {
        this.frSelecCand = frSelecCand;
        
        System.out.println("Si yo pongo algo aca, normal aparece en Pantalla, pero si lo pongo adentro del ActionListener, eso ya no se ejecuta");
        this.frSelecCand.botonAgregar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frSelecCand, "Candidato Agregado");
            }
            
        });
    }

}
