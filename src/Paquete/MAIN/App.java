package Paquete.MAIN;

import Controladores.ControladorLogin;
import Controladores.ControladorPrincipal;
import Controladores.ControladorRegistroCandidato;
import Controladores.ControladorSeleccionCandidato;
import Modelo.UsuarioArreglo;
import Vista.frmLogin;
import java.io.Serializable;
import Vista.frmRegistroCandidato1;
import Vista.frmPrincipal;
import Vista.frmSeleccionCandidatos;

public class App implements Serializable{
     public static void main(String[] args) {
        frmLogin fLogin = new frmLogin();
        UsuarioArreglo arreglo = new UsuarioArreglo(100);
        ControladorLogin controlLogin = new ControladorLogin(arreglo,fLogin);
        controlLogin.iniciar();
        
        //ESTO ES PARA GUARDAR LOS DATOS DEL CANDIDATO
        frmRegistroCandidato1 candidato = new frmRegistroCandidato1();
        ControladorRegistroCandidato controlCandidato = new ControladorRegistroCandidato(null,candidato); // Acá el primer parámetro deberia ser un  objeto de la clase Usuario, pero le puse null
        
        //ESTO ES PARA MOSTRAR LOS DATOS DE TODOS LOS CANDIDATOS
        
        frmPrincipal princ = new frmPrincipal();
        ControladorPrincipal controlPrincipal = new ControladorPrincipal(null,princ);
        
        //BOTÓN AGREGAR A LISTA DE FUTUROS ENTREVISTADOS 
        /*
        Normal llama al Constructor de ControladorSeleccionCandidato -> Ahí es donde se pone el Evento
        del botón "Agregar" para que se agregue un candidato a la parte de Entrevista
        La cosa es que normal me llama al Constructor, pero no accede a la parte del botón, no se cumple lo 
        que está dentro del Evento al dar CLICK al boton Agregar
        */
        frmSeleccionCandidatos seleccion = new frmSeleccionCandidatos();
        ControladorSeleccionCandidato controlSeleccionCandidato = new ControladorSeleccionCandidato(null, seleccion);
      
        
        /*
        ¿QUÉ FALTA?
        - Al presionar el botón Agregar, que sale en la vista de SeleccionCandidato, este botón 
        debe coger el ID que se escribira previamente, para usarlo en una BÚSQUEDA, esta BÚSQUEDA se 
        hará en el txt "registro.txt", donde el ID mencionado será el ID de los candidatos que pasarán a la
        Entrevista. Una vez identificado un ID, se debe identificar también toda la LÍNEA que acompaña el ID, para así
        guardar toda esa LÍNEA en otro TXT llamado "entrevista.txt" , este txt contendrá a todos los candidatos 
        que recibirán una entrevista.
        
        - Ahora luego de esto creo que en el frmPrincipal se deberia crear un botón más llamado "CONTRATAR CANDIDATO", este 
        nuevo botón te debe llevar a una nueva vista , en la cual se deberá LEER el TXT "entrevista.txt" 
        y del mismo modo que la vista aneterior, deberá haber un campo para ingresar el ID del candidao que se desee 
        contratar (Se supone que para este entonces esos candidatos ya han recibido su entrevista de manera presencial) y 
        para contratarlo se presionará un botón llamado "CONTRATAR".
        
        - Luego de presionar el botón contratar se repetirá el proceso de buscar el ID del Contratado, se buscará el ID 
        en el TXT de "entrevistatxt", y cuando se encuentre el ID , se debera identificar tambien a toda la línea a la cual 
        pertenece ese ID, y una vez identificada esa Línea, deberá ser guardada en otro TXT " llamado "empleados.txt"
        
        - Por último para darle funcionalidad al último botón del frmPrincipal, el cual sería "LISTA DE EMPLEADOS" , al dar 
        click en este botón se tendrá que leer el TXT "empleados.txt" para que así se muestren los empleados en una 
        nueva vista , estos empleados se deben mostrar en un textArea así ocmo el frmSelecconCandidatos
        */
    }
}