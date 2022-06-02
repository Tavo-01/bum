/*
 * Grupo        :
 * Alumno       :
 * Numero Exp   :
 * Fecha
 */


package agenda;

import exceptions.ContactoRepetidoException;
import java.util.ArrayList;

/**
 *
 * @author loned
 */
public class Main {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Contacto c1,c2,c3;
        System.out.println("Practica5.- Pruebas Junit");
        Agenda Lista = new Agenda();
        Contacto contacto1 = new Contacto("email_1","555 555 551","empleado_1");
        Contacto contacto2 = new Contacto("rmsces2122@gmail.com","555 555 552","Ramón");
        //Contacto contacto2 = new Contacto(null,null,null);
        System.out.println("-- Añadiendo los contactos ---");
            try {
                c1=Lista.addContacto(contacto1);
                c2=Lista.addContacto(contacto2);
            } catch (ContactoRepetidoException ex) {
                 System.out.println(ex); 
            }
        System.out.println("-- Listando los contactos añadidos ---");
           System.out.println(Lista.getContactos().toString());
           //ListaAgenda(Lista);
        System.out.println("-- Eliminando contacto con email_1 ...");
            Lista.eliminarContacto("email_1");
        System.out.println("-- Buscando contacto2  ..."); 
            c3 =Lista.buscarContacto(contacto2.getEmail());
            if (c3 != null){ System.out.println(c3.toString()); 
           }
            else{
                System.out.println("Contacto no encontrado!");
            }
        System.out.println("..........................");
      
        System.out.println("Cerrando la Agenda!");
    }
    }
    
