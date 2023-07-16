
package Controladores;

import Modelo.Usuario;
import Vista.frmPrincipal;

public class ControladorPrincipal {
    Usuario u;
    frmPrincipal fp;

    public ControladorPrincipal(Usuario u, frmPrincipal fp) {
        this.u = u;
        this.fp = fp;
    }
    
    public void iniciar(){
        this.fp.setLocationRelativeTo(null);
        this.fp.setVisible(true);
    }
}
