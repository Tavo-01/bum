/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author sonix
 */
public class Contacto {
    private String email;
    private String telefono;
    private String nombre;
    private int n;

    public Contacto() {
    }

    public Contacto(String email, String telefono, String nombre) {
        this.email = email;
        this.telefono = telefono;
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Contacto{" + "email=" + email + ", telefono=" + telefono + ", nombre=" + nombre + ", n=" + n + '}';
    }
   
}
