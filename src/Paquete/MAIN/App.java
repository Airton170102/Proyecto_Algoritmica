package Paquete.MAIN;

import Controladores.ControladorLogin;
import Controladores.ControladorPrincipal;
import Controladores.ControladorRegistroCandidato1;
import Controladores.ControladorSeleccionCandidato;
import Modelo.UsuarioArreglo;
import Vista.frmLogin;
import java.io.Serializable;
import Vista.frmRegistroCandidato1;
import Vista.frmPrincipal;
import Vista.frmSeleccionCandidatos;

public class App implements Serializable{
     public static void main(String[] args) {
        UsuarioArreglo arreglo = new UsuarioArreglo(100);
        
        frmLogin fLogin = new frmLogin();
        ControladorLogin controlLogin = new ControladorLogin(arreglo,fLogin);
        controlLogin.iniciar();
        
        //ESTO ES PARA GUARDAR LOS DATOS DEL CANDIDATO
        frmRegistroCandidato1 candidato = new frmRegistroCandidato1();
        ControladorRegistroCandidato1 controlCandidato = new ControladorRegistroCandidato1(null,candidato); // Acá el primer parámetro deberia ser un  objeto de la clase Usuario, pero le puse null
        
        //ESTO ES PARA MOSTRAR LOS DATOS DE TODOS LOS CANDIDATOS
        
        frmPrincipal princ = new frmPrincipal();
        ControladorPrincipal controlPrincipal = new ControladorPrincipal(null,princ);
        
        //AGREGAR A LISTA DE FUTUROS ENTREVISTADOS 

        frmSeleccionCandidatos seleccion = new frmSeleccionCandidatos();
        ControladorSeleccionCandidato controlSeleccionCandidato = new ControladorSeleccionCandidato(null, seleccion);
    }
}