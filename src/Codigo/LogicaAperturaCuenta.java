
package Codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;

public class LogicaAperturaCuenta {
    private Double montoInicial;
    private String tipoCuenta;
    private String noCuenta;
    private String fechaApertura;
    private String dpi;
    private String codigoCliente;
    private String nombreEncontrado;
    private String apellidosEncontrado;
    private String noCuentaArchivo;
    private boolean dpiExistente = true;
    private String avisoExistenciaDpi = "";
    private String validacionDPIVista = "verdad";

    public LogicaAperturaCuenta() {
    }

    public LogicaAperturaCuenta(Double montoInicial, String tipoCuenta, String dpi) {
        this.montoInicial = montoInicial;
        this.tipoCuenta = tipoCuenta;
        this.dpi = dpi;

    }

    public Double getMontoInicial() {
        return montoInicial;
    }

    public void setMontoInicial(Double montoInicial) {
        this.montoInicial = montoInicial;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(String fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNombreEncontrado() {
        return nombreEncontrado;
    }

    public void setNombreEncontrado(String nombreEncontrado) {
        this.nombreEncontrado = nombreEncontrado;
    }

    public String getApellidosEncontrado() {
        return apellidosEncontrado;
    }

    public void setApellidosEncontrado(String apellidosEncontrado) {
        this.apellidosEncontrado = apellidosEncontrado;
    }

    public String getNoCuentaArchivo() {
        return noCuentaArchivo;
    }

    public void setNoCuentaArchivo(String noCuentaArchivo) {
        this.noCuentaArchivo = noCuentaArchivo;
    }

    public boolean isDpiExistente() {
        return dpiExistente;
    }

    public void setDpiExistente(boolean dpiExistente) {
        this.dpiExistente = dpiExistente;
    }

    public String getAvisoExistenciaDpi() {
        return avisoExistenciaDpi;
    }

    public void setAvisoExistenciaDpi(String avisoExistenciaDpi) {
        this.avisoExistenciaDpi = avisoExistenciaDpi;
    }

    public String getValidacionDPIVista() {
        return validacionDPIVista;
    }

    public void setValidacionDPIVista(String validacionDPIVista) {
        this.validacionDPIVista = validacionDPIVista;
    }
    
    
    
    String rutaArchivo = System.getProperty("user.dir") + "/base_de_datos/Resgistro_de_usuarios.txt";
    String rutaArchivoApeCuen = System.getProperty("user.dir") + "/base_de_datos/apertura_cuenta.txt";

    public void abrirCuenta(){
        
        if(dpiExistente == false){
            setAvisoExistenciaDpi("El DPI ingresado es inválido.");
            setValidacionDPIVista("No");
        }else{
            FileWriter escritor = null;
            BufferedWriter bw = null;

            int noAleatorio1 = (int)(Math.random()*100);
            int noAleatorio2 = (int)(Math.random()*100);
            int noAleatorio3 = (int)(Math.random()*100);
            int noAleatorio4 = (int)(Math.random()*1000);

            noCuenta = String.valueOf(noAleatorio1) + String.valueOf(noAleatorio2) + String.valueOf(noAleatorio3) + String.valueOf(noAleatorio4);

            int noAleatorio5 = (int)(Math.random()*100);
            int noAleatorio6 = (int)(Math.random()*100);
            int noAleatorio7 = (int)(Math.random()*100);

            codigoCliente = String.valueOf(noAleatorio5) + String.valueOf(noAleatorio6) + String.valueOf(noAleatorio7);

            fechaApertura = String.valueOf(LocalDate.now());

            try {
                escritor = new FileWriter(rutaArchivoApeCuen, true);
                bw = new BufferedWriter(escritor);

                String aperturaCuenta = dpi + "," + tipoCuenta + "," + noCuenta + "," + fechaApertura + "," + codigoCliente;
                setNoCuentaArchivo(noCuenta);
                bw.write(aperturaCuenta);
                bw.newLine();

            } catch (Exception e) {
                System.out.println("Error al abrir la cuenta: " + e.getMessage());
            } finally {
                try {
                    bw.close();
                } catch (Exception e) {
                    System.out.println("Error al guardar el archivo. " + e.getMessage());
                }
            }
        }
    }

    public void abrirCuentaArchivo(){
        if(dpiExistente == false){
            setAvisoExistenciaDpi("El DPI ingresado es inválido.");
            setValidacionDPIVista("No");
        }else{
            String rutaArchivoDR = System.getProperty("user.dir") + "/base_de_datos/cuentas_clientes/" + noCuentaArchivo + ".txt";

            FileWriter escritor = null;
            BufferedWriter bw = null;
            
            fechaApertura = String.valueOf(LocalDate.now());

            try {
                escritor = new FileWriter(rutaArchivoDR, true);
                bw = new BufferedWriter(escritor);

                String cuenta = fechaApertura + "," + "0.0" + "," + "0.0" + "," + montoInicial;

                bw.write(cuenta);
                bw.newLine();

            } catch (Exception e) {
                System.out.println("Error al crear el archivo la cuenta: " + e.getMessage());
            } finally {

                try {
                    bw.close();
                } catch (Exception e) {
                    System.out.println("Error al guardar el archivo. " + e.getMessage());
                }
            }
        }
    }
    boolean verificacionDpi = true;
    public void verNombreYApellidos() {
        
        FileReader lector = null;
        BufferedReader br = null;
        
        try {
            lector = new FileReader(rutaArchivo);
            
            br = new BufferedReader(lector);
            
            
            String linea;
            while((linea = br.readLine()) != null) {
                
                String[] parteLinea = linea.split(",");
                
                String busquedaDpi = parteLinea[0];
                String busquedaNombre = parteLinea[1];
                String busquedaApellidos = parteLinea[2];
                
                
                if(busquedaDpi.equals(dpi)){
                    nombreEncontrado = busquedaNombre;
                    apellidosEncontrado = busquedaApellidos;
                    verificacionDpi = true;
                }else{
                    verificacionDpi = false;
                }           
            }
            
            if(verificacionDpi == false){
                setDpiExistente(false);
            }else{
                setDpiExistente(true);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el nombre y apellido. " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }
    }
}
