/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package agenda;

//import exceptions.ContactoInexistenteException;
//import exceptions.ContactoRepetidoException;
import exceptions.ContactoRepetidoException;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import org.junit.jupiter.api.function.Executable;
//import org.junit.jupiter.api.function.ThrowingSupplier;

/**
 *
 * @author loned
 */
public class AgendaTest {
   public Agenda Lista; 
    public AgendaTest() {
    Lista = new Agenda(); }

    @Test
    public void testAddContacto() throws Exception {
        System.out.println("Test:testAddContacto()");
        
        //1. Setup
        
       Contacto contacto1 = new Contacto("email1","nombre1","555 555 551");
       Contacto contacto1espe = new Contacto("email1","nombre1","555 555 551");
        //2.Exercise
        Contacto contacto2 = Lista.addContacto(contacto1);
         //3.Verify
        assertEquals(contacto1,contacto2);

        /*
 *      Los objetos se pasan en java por referencia, con lo que al añadirlo en
 *      la agenda, los cambios que se hagan allí, afectan al objeto creado.
 *      Al añadir un registro se cambia su valor N, si comparamos como hemos
 *      hecho, el assert dará true, pero si utilizamos
        assertEqual(contacto1espe, contacto2) fallarán porque su N, son distintos
        Deberíamos pues comprobar los atributos que no se cambian
 */    
        //assertEquals(contacto1espe,contacto2);
        //assertEquals(contacto1espe.getEmail(),contacto2.getEmail());
        //assertEquals(contacto1espe.getNombre(),contacto2.getNombre());
        //assertEquals(contacto1espe.getTelefono(),contacto2.getTelefono());
 
        //4.TearDown
        //fail("Test no implementado");
    }
    @Test
    public void testAddContacto_repe() throws Exception {
        System.out.println("Test:testAddContacto()");
        
        //1. Setup
        
        Contacto contacto1 = new Contacto("email1","nombre1","555 555 551");
        //2.Exercise
        Lista.addContacto(contacto1);
        //3.Verify
        ContactoRepetidoException thrown = assertThrows(ContactoRepetidoException.class, () -> {
         //Code under test
         Lista.addContacto(contacto1);
  });
        //4.TearDown
        //fail("Test no implementado");
    }
    @Test
    public void testEliminarContacto() throws Exception {
        System.out.println("Test:testEliminarContacto()");
        //1. Setup
       
        Contacto contacto1 = new Contacto("email1","nombre1","555 555 551");
        Lista.addContacto(contacto1);
        //2.Exercise
        //3.Verify
        assertNotNull(Lista.eliminarContacto("email1"));
        //4.TearDown
        //fail("Test no implementado");
    }
    @Test
    public void testEliminarContacto_noex() throws Exception {
        System.out.println("Test:testEliminarContacto_noex()");
        //1. Setup
       
        Contacto contacto1 = new Contacto("email1","nombre1","555 555 551");
        Lista.addContacto(contacto1);
        //2.Exercise
        //3.Verify
         assertNull(Lista.eliminarContacto("email2"));
         //4.TearDown
        //fail("Test no implementado");
    }
    @Test
    public void testBuscarContacto() throws Exception {
        System.out.println("Test:testBuscarContacto()");
        //1. Setup
        
        Contacto contacto1 = new Contacto("email1","nombre1","555 555 551");
        Lista.addContacto(contacto1);
        //2.Exercise
        //3.Verify
        assertNotNull(Lista.buscarContacto("email1"));
        //4.TearDown
        //fail("Test no implementado")

    }
    @Test
    public void testBuscarContacto_noex() throws Exception {
        System.out.println("Test:testBuscarContacto_noex()");
        //1. Setup
        
        Contacto contacto1 = new Contacto("email1","nombre1","555 555 551");
        Lista.addContacto(contacto1);
        //2.Exercise
        //3.Verify
        assertNull(Lista.buscarContacto("email2"));
        //4.TearDown
        //fail("Test no implementado")

    }
    @Test
    public void testGetContactos() {
        System.out.println("Test:testGetContactos()");
        //1. Setup
       
        Contacto contacto1 = new Contacto("email1","nombre1","555 555 551");
        Contacto contacto2 = new Contacto("email2","nombre2","555 555 552");
        Contacto contacto3 = new Contacto("email3","nombre3","555 555 553");
        try {
            Lista.addContacto(contacto1);
            Lista.addContacto(contacto2);
            Lista.addContacto(contacto3);
        } catch (ContactoRepetidoException ex) {
            System.out.println(ex);
        }
        //2.Exercise
        assertEquals(3, Lista.getContactos().size());
        //4.TearDown
        //fail("Test no implementado")


    }
    
}

