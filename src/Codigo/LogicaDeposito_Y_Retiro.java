package Codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;

public class LogicaDeposito_Y_Retiro {
    private String noCuenta;
    private double monto;
    private double saldo;
    private double saldoEncontrado;
    private String noCuentaEncontrado;
    private String avisoMonto = "";
    private String fechaTransaccion;
    private boolean cuentaExistente = true;
    private String avisoCuenta = "";
    private String avisoTransaccion = "";

    public LogicaDeposito_Y_Retiro() {
    }

    public LogicaDeposito_Y_Retiro(String noCuenta, double monto) {
        this.noCuenta = noCuenta;
        this.monto = monto;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoEncontrado() {
        return saldoEncontrado;
    }

    public void setSaldoEncontrado(double saldoEncontrado) {
        this.saldoEncontrado = saldoEncontrado;
    }

    public String getNoCuentaEncontrado() {
        return noCuentaEncontrado;
    }

    public void setNoCuentaEncontrado(String noCuentaEncontrado) {
        this.noCuentaEncontrado = noCuentaEncontrado;
    }

    public String getAvisoMonto() {
        return avisoMonto;
    }

    public void setAvisoMonto(String avisoMonto) {
        this.avisoMonto = avisoMonto;
    }

    public String getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(String fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public boolean isCuentaExistente() {
        return cuentaExistente;
    }

    public void setCuentaExistente(boolean cuentaExistente) {
        this.cuentaExistente = cuentaExistente;
    }

    public String getAvisoCuenta() {
        return avisoCuenta;
    }

    public void setAvisoCuenta(String avisoCuenta) {
        this.avisoCuenta = avisoCuenta;
    }

    public String getAvisoTransaccion() {
        return avisoTransaccion;
    }

    public void setAvisoTransaccion(String avisoDeposito) {
        this.avisoTransaccion = avisoDeposito;
    }
    
    
    

    double saldoAEncontrar;

    public void leerDatosCuenta() {
        String rutaArchivoD = System.getProperty("user.dir") + "/base_de_datos/cuentas_clientes/" + noCuenta + ".txt";
        FileReader lector = null;
        BufferedReader br = null;
        
        try {
            lector = new FileReader(rutaArchivoD);
            
            br = new BufferedReader(lector);
            
            
            String linea;
            while((linea = br.readLine()) != null) {
                
                String[] parteLinea = linea.split(",");
                

                String busquedaSaldo = parteLinea[3];
                
                saldoAEncontrar = Double.parseDouble(busquedaSaldo);
                
            }
            
            setSaldoEncontrado(saldoAEncontrar);
        } catch (Exception e) {
            
            setCuentaExistente(false);
            System.out.println("Error al buscar el Saldo" + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }
    }
    
    public void deposito(){
        if(cuentaExistente == false){
            setAvisoCuenta("La cuenta ingresada no existe");
        }else{
            String rutaArchivoD = System.getProperty("user.dir") + "/base_de_datos/cuentas_clientes/" + noCuenta + ".txt";
            FileWriter escritor = null;
            BufferedWriter bw = null;
            fechaTransaccion = String.valueOf(LocalDate.now());
            saldo = saldoEncontrado + monto;

            try {
                escritor = new FileWriter(rutaArchivoD, true);
                bw = new BufferedWriter(escritor);

                String depositoAR = fechaTransaccion + "," + monto + "," + "0.0" + "," + saldo;
                
                setAvisoTransaccion("El deposito fue realizado con éxito.");

                bw.write(depositoAR);
                bw.newLine();

            } catch (Exception e) {
                System.out.println("Error al realizar el deposito: " + e.getMessage());
            } finally {
                try {
                    bw.close();
                } catch (Exception e) {
                    System.out.println("Error al guardar el archivo. " + e.getMessage());
                }
            }
        }
    }
    
    public void retiro(){
        if(cuentaExistente == false){
            setAvisoCuenta("La cuenta ingresada no existe");
        }else{
            String rutaArchivoD = System.getProperty("user.dir") + "/base_de_datos/cuentas_clientes/" + noCuenta + ".txt";
            FileWriter escritor = null;
            BufferedWriter bw = null;

            if(monto <= saldoEncontrado){
                fechaTransaccion = String.valueOf(LocalDate.now());
                saldo = saldoEncontrado - monto;

                try {
                    escritor = new FileWriter(rutaArchivoD, true);
                    bw = new BufferedWriter(escritor);

                    String retiroAR = fechaTransaccion + "," + "0.0" + "," + monto + "," + saldo;
                    
                    setAvisoTransaccion("El retiro fue realizado con éxito.");

                    bw.write(retiroAR);
                    bw.newLine();

                } catch (Exception e) {
                    System.out.println("Error al realizar el deposito: " + e.getMessage());
                } finally {
                    try {
                        bw.close();
                    } catch (Exception e) {
                        System.out.println("Error al guardar el archivo. " + e.getMessage());
                    }
                }
            }else{
                avisoMonto = "El monto ingresado sobrepasa al saldo en su cuenta.";
            }
        }
    }
}
