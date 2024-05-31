/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Codigo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author anyi4
 */
public class LogicaRegistroCliente {
    
    private String dpi;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String correo;
    private String ocupacion;
    private Float ingresomensual;
    
    
    String rutaArchivo = System.getProperty("user.dir") + "/base_de_datos/Resgistro_de_usuarios.txt";
    
    public void registro(){
                
    }
    public LogicaRegistroCliente(String dpi, String nombre, String apellido, String direccion, String telefono, String correo, String ocupacion, Float ingresomensual) {
        this.dpi = dpi;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.ocupacion = ocupacion;
        this.ingresomensual = ingresomensual;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public Float getIngresomensual() {
        return ingresomensual;
    }

    public void setIngresomensual(Float ingresomensual) {
        this.ingresomensual = ingresomensual;
    }
    
    public void DatoDPI(String dpi){
        this.dpi = dpi;
    }

    public void realizarRegistroUsuario(){
        
        FileWriter escritor = null;
        BufferedWriter bw = null;
        try {
            escritor = new FileWriter(rutaArchivo, true);
            bw = new BufferedWriter(escritor);
            
            String tarea = dpi + "," + nombre + "," + apellido + "," + direccion + "," + telefono + "," + correo + "," + ocupacion + "," + ingresomensual;
            
            bw.write(tarea);
            bw.newLine();
                    
        } catch (Exception e) {
            System.out.println("Error al guardar la tarea: " + e.getMessage());
        } finally {
            try {
                bw.close();
            } catch (Exception e) {
                System.out.println("Error al guardar el archivo. " + e.getMessage());
            }
        }
    }   
}
