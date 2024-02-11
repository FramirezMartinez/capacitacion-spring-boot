/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package to;

/**
 *
 * @author francisco
 */
public class PersonaTO
{
 private String nombre;
 private String primerApellido;
 private String segunodApelllido;
 private String curp;
 private byte edad;
 private  String ciudadNacimineto;
 
 //un controuctor se llama de la misma clase que puede  recibir   
    public PersonaTO(String nombre, String primerApellido, String segunodApelllido, String curp, byte edad) {
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segunodApelllido = segunodApelllido;
        this.curp = curp;
        this.edad = edad;
    }

    public String getCiudadNacimineto() {
        return ciudadNacimineto;
    }

    public void setCiudadNacimineto(String ciudadNacimineto) {
        this.ciudadNacimineto = ciudadNacimineto;
    }

    
    //encapsolución
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegunodApelllido() {
        return segunodApelllido;
    }

    public void setSegunodApelllido(String segunodApelllido) {
        this.segunodApelllido = segunodApelllido;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

}
