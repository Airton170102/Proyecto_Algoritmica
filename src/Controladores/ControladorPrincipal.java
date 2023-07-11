
package Controladores;

import Modelo.PersonaArreglo;
import Vista.frmPrincipal;

public class ControladorPrincipal {
    PersonaArreglo pa;
    frmPrincipal fp;

    public ControladorPrincipal(PersonaArreglo pa, frmPrincipal fp) {
        this.pa = pa;
        this.fp = fp;
    }
    
    public void iniciar(){
        this.fp.setLocationRelativeTo(null);
        this.fp.setVisible(true);
    }
}
