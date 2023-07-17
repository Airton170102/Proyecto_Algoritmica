
package Controladores;

import Modelo.Usuario;
import Vista.frmRegistroCandidato1;

public class ControladorRegistroCandidato1 {
    Usuario u;
    frmRegistroCandidato1 fRC1;
    
    
    public void iniciar(){
        this.fRC1.setLocationRelativeTo(null);
        //limpiarControles();
        this.fRC1.setVisible(true);
    }
    
    public void limpiarControles(){
        /*
        fRC1.txtPassword.setText("");
        fRC1.txtCorreo.setText("");
*/
    }
}
