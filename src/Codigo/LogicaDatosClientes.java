package Codigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class LogicaDatosClientes {

    private String noCuentaEnc;
    private String saldoCuentaEnc;

    public String getNoCuentaEnc() {
        return noCuentaEnc;
    }

    public void setNoCuentaEnc(String noCuentaEnc) {
        this.noCuentaEnc = noCuentaEnc;
    }

    public String getSaldoCuentaEnc() {
        return saldoCuentaEnc;
    }

    public void setSaldoCuentaEnc(String saldoCuentaEnc) {
        this.saldoCuentaEnc = saldoCuentaEnc;
    }

    String rutaArchivoApeCuen = System.getProperty("user.dir") + "/base_de_datos/apertura_cuenta.txt";
    String saldoAsigTem;

    public List<LogicaInfoClientes> llenarLista() {

        List<LogicaInfoClientes> listaClientes = new ArrayList<>();


        FileReader lector = null;
        BufferedReader br = null;

        try {
            lector = new FileReader(this.rutaArchivoApeCuen);

            br = new BufferedReader(lector);

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] parteLinea = linea.split(",");

                String noCuentaBus = parteLinea[2];

                setNoCuentaEnc(noCuentaBus);

                buscarEnArchivoCuenta();
                LogicaInfoClientes cliente = new LogicaInfoClientes(noCuentaEnc, saldoCuentaEnc);
                listaClientes.add(cliente);

            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo de apertura cuenta. " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }
        return listaClientes;

    }

    public void buscarEnArchivoCuenta() {
        String rutaArchivoDR = System.getProperty("user.dir") + "/base_de_datos/cuentas_clientes/" + noCuentaEnc + ".txt";
        FileReader lector = null;
        BufferedReader br = null;
        
        try {
            lector = new FileReader(rutaArchivoDR);

            br = new BufferedReader(lector);

            String linea2;
            while ((linea2 = br.readLine()) != null) {

                String[] parteLinea2 = linea2.split(",");

                String saldoCuenBus = parteLinea2[3];

                saldoAsigTem = saldoCuenBus;

            }
            setSaldoCuentaEnc(saldoAsigTem);

        } catch (Exception e) {
            System.out.println("Error al leer el archivo de Cuenta. " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }

    }

}
