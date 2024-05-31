package Codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class LogicaActualizacionCliente {
    
    private String dpiAC;
    private String direccionAC;
    private String numTelefonoAC;
    private String correoAC;
    private String ocupacionAC;
    private String ingresomensualAC;
    private String nombreAC;
    private String apellidosAC;
    private String avisoActualizacion = "";
    private String avisoError = "";

    public LogicaActualizacionCliente() {
    }

    public LogicaActualizacionCliente(String dpiAC, String direccionAC, String numTelefonoAC, String correoAC, String ocupacionAC, String ingresomensualAC) {
        this.dpiAC = dpiAC;
        this.direccionAC = direccionAC;
        this.numTelefonoAC = numTelefonoAC;
        this.correoAC = correoAC;
        this.ocupacionAC = ocupacionAC;
        this.ingresomensualAC = ingresomensualAC;
    }

    public String getDpiAC() {
        return dpiAC;
    }

    public void setDpiAC(String dpiAC) {
        this.dpiAC = dpiAC;
    }

    public String getDireccionAC() {
        return direccionAC;
    }

    public void setDireccionAC(String direccionAC) {
        this.direccionAC = direccionAC;
    }

    public String getNumTelefonoAC() {
        return numTelefonoAC;
    }

    public void setNumTelefonoAC(String numTelefonoAC) {
        this.numTelefonoAC = numTelefonoAC;
    }

    public String getCorreoAC() {
        return correoAC;
    }

    public void setCorreoAC(String correoAC) {
        this.correoAC = correoAC;
    }

    public String getOcupacionAC() {
        return ocupacionAC;
    }

    public void setOcupacionAC(String ocupacionAC) {
        this.ocupacionAC = ocupacionAC;
    }

    public String getIngresomensualAC() {
        return ingresomensualAC;
    }

    public void setIngresomensualAC(String ingresomensualAC) {
        this.ingresomensualAC = ingresomensualAC;
    }

    public String getNombreAC() {
        return nombreAC;
    }

    public void setNombreAC(String nombreAC) {
        this.nombreAC = nombreAC;
    }

    public String getApellidosAC() {
        return apellidosAC;
    }

    public void setApellidosAC(String apellidosAC) {
        this.apellidosAC = apellidosAC;
    }

    public String getAvisoActualizacion() {
        return avisoActualizacion;
    }

    public void setAvisoActualizacion(String avisoActualizacion) {
        this.avisoActualizacion = avisoActualizacion;
    }

    public String getAvisoError() {
        return avisoError;
    }

    public void setAvisoError(String avisoError) {
        this.avisoError = avisoError;
    }

    
    
    String rutaArchivo = System.getProperty("user.dir") + "/base_de_datos/Resgistro_de_usuarios.txt";
    
       public void buscarDpi(String dpi) {
        FileReader lector = null;
        BufferedReader br = null;

        try {
            lector = new FileReader(rutaArchivo);
            br = new BufferedReader(lector);
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] partesLinea = linea.split(",");

                String Dpi = partesLinea[0];
                if (Dpi.equals(dpi)) {
                    setAvisoError("");
                    setNombreAC(partesLinea[1]);
                    setApellidosAC(partesLinea[2]);
                    setDireccionAC(partesLinea[3]);
                    setNumTelefonoAC(partesLinea[4]);
                    setCorreoAC(partesLinea[5]);
                    setOcupacionAC(partesLinea[6]);
                    setIngresomensualAC(partesLinea[7]);
                    break;
                    
                }else{
                    setAvisoError("No se encontró el DPI ingresado.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error al busacr el dpi.");
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerra el archivo");
            }
        }
    }
    public void actualizarCliente(String dpi, String direccion, String numTelefono, String correo,
        String ocupacion, String ingresomensual) {

    FileWriter escritor = null;
    BufferedWriter bw = null;

    FileReader lector = null;
    BufferedReader br = null;

    try {
        lector = new FileReader(rutaArchivo);
        br = new BufferedReader(lector);
        StringBuilder contenido = new StringBuilder();
        String linea;

        while ((linea = br.readLine()) != null) {
            String[] partesLinea = linea.split(",");
            String Dpi = partesLinea[0];
            
            if (Dpi.equals(dpi)) {
                linea = partesLinea[0] + "," + partesLinea[1] + "," + partesLinea[2] + ","
                        + direccion + "," + numTelefono + "," + correo + "," + ocupacion + "," + ingresomensual;
                setAvisoActualizacion("Actualización Exitosa.");
            }

            contenido.append(linea).append(System.lineSeparator());
        }

        br.close();

        escritor = new FileWriter(rutaArchivo);
        bw = new BufferedWriter(escritor);
        bw.write(contenido.toString());

    } catch (Exception e) {
        System.out.println("Error al guardar el archivo: " + e.getMessage());
    } finally {
        try {
            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }
        } catch (Exception e) {
            System.out.println("Error al cerrar el archivo: " + e.getMessage());
        }
    }
}
}
