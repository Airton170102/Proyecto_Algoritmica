
package Controladores;

import Modelo.UsuarioArreglo;
import Vista.frmPrincipal;

public class ControladorPrincipal {
    UsuarioArreglo ua;
    frmPrincipal fp;

    public ControladorPrincipal(UsuarioArreglo ua, frmPrincipal fp) {
        this.ua = ua;
        this.fp = fp;
    }
    
    public void iniciar(){
        this.fp.setLocationRelativeTo(null);
        this.fp.setVisible(true);
    }
}
