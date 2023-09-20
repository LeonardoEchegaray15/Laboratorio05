/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio005;

/**
 *
 * @author Leonardo
 */
public class Estudiante {
    String Nombre;
    String Apellido;
    String Codigo;

    public Estudiante(String Nombre, String Apellido, String Codigo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Codigo = Codigo;
    }
    
    public Estudiante(){
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    String getTexto(){
    
        return this.Apellido + ", "+this.Nombre;
    }
    
}
