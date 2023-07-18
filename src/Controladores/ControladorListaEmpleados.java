

package Controladores;

import Modelo.Usuario;
import Vista.frmListaEmpleados;
import Vista.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorListaEmpleados 
{
    Usuario u;
    frmListaEmpleados frLE;
    
    public ControladorListaEmpleados(Usuario u, frmListaEmpleados frLE)
    {
        this.u = u;
        this.frLE = frLE;
        this.frLE.btnVolver.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                frLE.setVisible(false);
                frmPrincipal fp = new frmPrincipal();
                ControladorPrincipal controlPrincipal = new ControladorPrincipal(u,fp);
                controlPrincipal.iniciar();
            }
         
            
        });
    }
    
    public void iniciar()
    {
        this.frLE.setLocationRelativeTo(null);
        this.frLE.setVisible(true);
    }
}
