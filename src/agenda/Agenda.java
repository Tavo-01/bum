
package agenda;

//import exceptions.ContactoInexistenteException;
import exceptions.ContactoRepetidoException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author loned
 */
public class Agenda {

    private HashMap<String, Contacto> contactos = new HashMap();
    private static int n = 0;
    private static int count = 0;
 /** 
  * Añade un objeto contacto a la agenda
  * @param contacto , objeto contacto que se quiere añadir
  * @return devuelve contacto añadido si se realiza correctamente o exception
  * @throws ContactoRepetidoException , excepcion especifica programada en el paquete exception
  */
    public Contacto addContacto(Contacto contacto) throws ContactoRepetidoException {
        if (contactos.containsKey(contacto.getEmail())) {
            //
            throw new ContactoRepetidoException("Ya existe un contacto con email: " + contacto.getEmail());
        }
        n++;
        contacto.setN(n);
        contactos.put(contacto.getEmail(), contacto);
        count++;
        return contacto;
    }

    public Contacto eliminarContacto(String email) { 
        Contacto contacto = buscarContacto(email);
        if (contacto != null) {
        contactos.remove(email);
        count--;
        }
        return contacto;
    }

    public Contacto buscarContacto(String email) { 
        Contacto contacto = null;
        if (!contactos.containsKey(email)) {

            return null;
        }
        else{
        return contactos.get(email);
        }
    }

    public ArrayList<Contacto> getContactos() {
        ArrayList<Contacto> contactosList = new ArrayList<>();
        contactosList.addAll(contactos.values());
        return contactosList;
    }
    
    

}
