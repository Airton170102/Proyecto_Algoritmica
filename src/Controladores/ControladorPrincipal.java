
package Controladores;

import Modelo.Candidato;
import Modelo.ContratarCandidato;
import Modelo.ListaEmpleados;
import Modelo.Usuario;
import Vista.frmContratarCandidatos;
import Vista.frmListaEmpleados;
import Vista.frmPrincipal;
import Vista.frmRegistroCandidato1;
import Vista.frmSeleccionCandidatos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorPrincipal {
    Usuario u;
    frmPrincipal fp;

    public ControladorPrincipal(Usuario u, frmPrincipal fp) {
        this.u = u;
        this.fp = fp;
        this.fp.btnRegistro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fp.setVisible(false);
                frmRegistroCandidato1 fRC1 = new frmRegistroCandidato1();
                ControladorRegistroCandidato controlRC1 = new ControladorRegistroCandidato(u,fRC1);
                controlRC1.iniciar();
            }
        });
        this.fp.btnSeleccion.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                fp.setVisible(false);
                Candidato cand = new Candidato();
                frmSeleccionCandidatos fSC = new frmSeleccionCandidatos();
                ControladorSeleccionCandidato controlSC = new ControladorSeleccionCandidato(u,fSC);
                controlSC.iniciar();
                cand.mostrarCandidatos(fSC); //Muestra Candidatos en el TXT

            }
        });
        this.fp.btnContratarCandidatos.addActionListener( new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                fp.setVisible(false);
                ContratarCandidato contratar = new ContratarCandidato();
                frmContratarCandidatos frmCC = new frmContratarCandidatos();
                ControladorContratarCandidatos controlCC = new ControladorContratarCandidatos(u,frmCC);
                contratar.mostrarCandidatosContratar(frmCC);
                controlCC.iniciar();
            }   
            
        });
        this.fp.btnEmpleados.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fp.setVisible(false);
                frmListaEmpleados frLE = new frmListaEmpleados();
                ListaEmpleados empleado = new ListaEmpleados();
                ControladorListaEmpleados controlLE = new ControladorListaEmpleados(u,frLE);
                empleado.mostrarEmpleados(frLE);
                controlLE.iniciar();
            }
        });
        
    }
    
    public void iniciar(){
        this.fp.setLocationRelativeTo(null);
        this.fp.setVisible(true);
    }
}
