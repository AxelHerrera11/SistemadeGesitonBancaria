package Codigo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;

public class LogicaReportesTXT {

    private String noCuentaReportes;
    private String nombreResportes;
    private String apellidosReportes;
    private String dpiReportes;
    private String fechaReportes;
    private String tipoCuentaReportes;
    private String nombreEncontrado;
    private String apellidosEncontrado;
    private String direccionEncontrada;
    private String numTelEncontrado;
    private String correoEncontrado;
    private String ocupacionEncontrada;
    private String rutaArchivoNoCuenta;
    private String fechaTranEnc;
    private String depositoTransEnc;
    private String retiroTransEnc;
    private String saldoTransEnc;
    private String avisoNoCueIn = "";
    private boolean valCuenExiEn = true;
    private String ruArchivoRepDia;
    private String fechaDia;
    private String fechaDiaEnc;
    private double depositoDiaEnc;
    private double retiroDiaEnc;
    private double totalDepoDia = 0;
    private double totalRetiDia = 0;
    private String cantiDepDia;
    private String cantiRetDia;
    private String avisoArchivoCreado = "";
    private String avisoEstadoCuenta = "";

    public LogicaReportesTXT() {
    }

    public LogicaReportesTXT(String noCuentaReportes) {
        this.noCuentaReportes = noCuentaReportes;
    }

    public String getNoCuentaReportes() {
        return noCuentaReportes;
    }

    public void setNoCuentaReportes(String noCuentaReportes) {
        this.noCuentaReportes = noCuentaReportes;
    }

    public String getRutaArchivoNoCuenta() {
        return rutaArchivoNoCuenta;
    }

    public void setRutaArchivoNoCuenta(String rutaArchivoNoCuenta) {
        this.rutaArchivoNoCuenta = rutaArchivoNoCuenta;
    }

    public String getAvisoNoCueIn() {
        return avisoNoCueIn;
    }

    public void setAvisoNoCueIn(String avisoNoCueIn) {
        this.avisoNoCueIn = avisoNoCueIn;
    }

    public boolean isValCuenExiEn() {
        return valCuenExiEn;
    }

    public void setValCuenExiEn(boolean valCuenExiEn) {
        this.valCuenExiEn = valCuenExiEn;
    }

    public String getRuArchivoRepDia() {
        return ruArchivoRepDia;
    }

    public void setRuArchivoRepDia(String ruArchivoRepDia) {
        this.ruArchivoRepDia = ruArchivoRepDia;
    }

    public double getTotalDepoDia() {
        return totalDepoDia;
    }

    public void setTotalDepoDia(double totalDepoDia) {
        this.totalDepoDia = totalDepoDia;
    }

    public double getTotalRetiDia() {
        return totalRetiDia;
    }

    public void setTotalRetiDia(double totalRetiDia) {
        this.totalRetiDia = totalRetiDia;
    }

    public String getFechaTranEnc() {
        return fechaTranEnc;
    }

    public void setFechaTranEnc(String fechaTranEnc) {
        this.fechaTranEnc = fechaTranEnc;
    }

    public String getDepositoTransEnc() {
        return depositoTransEnc;
    }

    public void setDepositoTransEnc(String depositoTransEnc) {
        this.depositoTransEnc = depositoTransEnc;
    }

    public double getDepositoDiaEnc() {
        return depositoDiaEnc;
    }

    public void setDepositoDiaEnc(double depositoDiaEnc) {
        this.depositoDiaEnc = depositoDiaEnc;
    }

    public double getRetiroDiaEnc() {
        return retiroDiaEnc;
    }

    public void setRetiroDiaEnc(double retiroDiaEnc) {
        this.retiroDiaEnc = retiroDiaEnc;
    }

    public String getCantiDepDia() {
        return cantiDepDia;
    }

    public void setCantiDepDia(String cantiDepDia) {
        this.cantiDepDia = cantiDepDia;
    }

    public String getCantiRetDia() {
        return cantiRetDia;
    }

    public void setCantiRetDia(String cantiRetDia) {
        this.cantiRetDia = cantiRetDia;
    }

    public String getFechaDiaEnc() {
        return fechaDiaEnc;
    }

    public void setFechaDiaEnc(String fechaDiaEnc) {
        this.fechaDiaEnc = fechaDiaEnc;
    }

    public String getAvisoArchivoCreado() {
        return avisoArchivoCreado;
    }

    public void setAvisoArchivoCreado(String avisoArchivoCreado) {
        this.avisoArchivoCreado = avisoArchivoCreado;
    }

    public String getAvisoEstadoCuenta() {
        return avisoEstadoCuenta;
    }

    public void setAvisoEstadoCuenta(String avisoEstadoCuenta) {
        this.avisoEstadoCuenta = avisoEstadoCuenta;
    }

    
    
    boolean validacionCuentaExiste = true;
    boolean verificacionDpi = true;
    String rutaArchivo = System.getProperty("user.dir") + "/base_de_datos/Resgistro_de_usuarios.txt";
    String rutaArchivoApeCuen = System.getProperty("user.dir") + "/base_de_datos/apertura_cuenta.txt";

    public void estadoCuenta() {
        validarCuentaExistente();
        String rutaArchivoEsCu = System.getProperty("user.dir") + "/base_de_datos/reportes/estados_de_cuenta/" + "estado_cuenta_no_" + noCuentaReportes + ".txt";
        String rutaArchivoD = System.getProperty("user.dir") + "/base_de_datos/cuentas_clientes/" + noCuentaReportes + ".txt";
        FileReader lector = null;
        BufferedReader br = null;

        if (valCuenExiEn == false) {
            setAvisoNoCueIn("El numero de cuenta ingresado es inválido");
        } else {
            try {
                lector = new FileReader(rutaArchivo);

                br = new BufferedReader(lector);

                String linea2;
                while ((linea2 = br.readLine()) != null) {

                    String[] parteLinea2 = linea2.split(",");

                    String busquedaDpi = parteLinea2[0];
                    String busquedaNombre = parteLinea2[1];
                    String busquedaApellidos = parteLinea2[2];
                    String busquedaDireccion = parteLinea2[3];
                    String busquedaNumeroTel = parteLinea2[4];
                    String busquedaCorreo = parteLinea2[5];
                    String busquedaOcupacion = parteLinea2[6];

                    if (busquedaDpi.equals(dpiReportes)) {
                        nombreEncontrado = busquedaNombre;
                        apellidosEncontrado = busquedaApellidos;
                        direccionEncontrada = busquedaDireccion;
                        numTelEncontrado = busquedaNumeroTel;
                        correoEncontrado = busquedaCorreo;
                        ocupacionEncontrada = busquedaOcupacion;
                        setAvisoEstadoCuenta("Estado de Cuenta creado con éxito.");
                        verificacionDpi = true;
                    } else {
                        verificacionDpi = false;
                    }
                }

            } catch (Exception e) {
                System.out.println("Error al buscar los datos. " + e.getMessage());
            } finally {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar el archivo. " + e.getMessage());
                }
            }

        }

        FileWriter escritor = null;
        BufferedWriter bw = null;
        if (valCuenExiEn == false) {

        } else {

            try {
                escritor = new FileWriter(rutaArchivoEsCu, true);
                bw = new BufferedWriter(escritor);

                String datos = "Número de Cuenta: \t" + noCuentaReportes + "\n"
                        + "Tipo de Cuenta: \t" + tipoCuentaReportes + "\n"
                        + "Numero de DPI: \t\t" + dpiReportes + "\n"
                        + "Nombre:  \t\t" + nombreEncontrado + " " + apellidosEncontrado + "\n"
                        + "Dirección: \t\t" + direccionEncontrada + "\n"
                        + "Teléfono: \t\t" + numTelEncontrado + "\n"
                        + "Correo: \t\t" + correoEncontrado + "\n"
                        + "Ocupación: \t\t" + ocupacionEncontrada + "\n\n";
                String hola = "| \t" + "Fecha" + "\t\t | \t" + "Deposito" + " | \t" + "Retiro" + "\t | \t" + "Saldo" + "\t |";

                bw.write(datos);
                bw.newLine();
                bw.write(hola);
                bw.newLine();

            } catch (Exception e) {
                System.out.println("Error al duardar los datos del cliente:  " + e.getMessage());
            } finally {

                try {
                    bw.close();
                } catch (Exception e) {
                    System.out.println("Error al guardar el archivo. " + e.getMessage());
                }
            }

            try {
                lector = new FileReader(rutaArchivoD);

                br = new BufferedReader(lector);

                String linea3;
                while ((linea3 = br.readLine()) != null) {

                    String[] parteLinea3 = linea3.split(",");

                    String fechaTransBus = parteLinea3[0];
                    String depositoTransBus = parteLinea3[1];
                    String retiroTransBus = parteLinea3[2];
                    String saldoTransBus = parteLinea3[3];

                    saldoTransEnc = saldoTransBus;

                    try {
                        escritor = new FileWriter(rutaArchivoEsCu, true);
                        bw = new BufferedWriter(escritor);

                        String registros = "| \t" + fechaTransBus + "\t | \t" + depositoTransBus + "\t | \t" + retiroTransBus + "\t | \t" + saldoTransBus + "\t |";

                        bw.write(registros);
                        bw.newLine();

                    } catch (Exception e) {
                        System.out.println("Error al guardar los datos del registro " + e.getMessage());
                    } finally {

                        try {
                            bw.close();
                        } catch (Exception e) {
                            System.out.println("Error al guardar el archivo. " + e.getMessage());
                        }
                    }
                }

                try {
                    escritor = new FileWriter(rutaArchivoEsCu, true);
                    bw = new BufferedWriter(escritor);

                    String saldoFinal = "\n\n" + "Saldo Actual: " + saldoTransEnc;
                    bw.write(saldoFinal);

                    bw.newLine();

                } catch (Exception e) {
                    System.out.println("Error al guardar los datos: " + e.getMessage());
                } finally {

                    try {
                        bw.close();
                    } catch (Exception e) {
                        System.out.println("Error al guardar el archivo. " + e.getMessage());
                    }
                }

            } catch (Exception e) {
                System.out.println("Error al leer los datos. " + e.getMessage());
            } finally {
                try {
                    br.close();
                } catch (Exception e) {
                    System.out.println("Error al cerrar el archivo. " + e.getMessage());
                }
            }
        }
    }

    public void validarCuentaExistente() {
        FileReader lector = null;
        BufferedReader br = null;

        try {
            lector = new FileReader(rutaArchivoApeCuen);

            br = new BufferedReader(lector);

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] parteLinea = linea.split(",");

                String dpiBusqueda = parteLinea[0];
                String tipoCuentaBusqueda = parteLinea[1];
                String noCuentaBusqueda = parteLinea[2];
                String fechaBusqueda = parteLinea[3];

                if (noCuentaBusqueda.equals(noCuentaReportes)) {
                    dpiReportes = dpiBusqueda;
                    tipoCuentaReportes = tipoCuentaBusqueda;
                    fechaReportes = fechaBusqueda;
                    validacionCuentaExiste = true;
                    setRutaArchivoNoCuenta(noCuentaReportes);
                } else {
                    validacionCuentaExiste = false;
                }

            }

            if (validacionCuentaExiste == false) {
                setValCuenExiEn(true);
            } else {
                setValCuenExiEn(false);
            }

        } catch (Exception e) {
            System.out.println("Error al buscar el dpi. " + e.getMessage());
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                System.out.println("Error al cerrar el archivo. " + e.getMessage());
            }
        }

    }

    String rutaArchivoApeCuenA = System.getProperty("user.dir") + "/base_de_datos/apertura_cuenta.txt";
    String saldoAsigTem;
    String rutaArchivoReporteDia = System.getProperty("user.dir") + "/base_de_datos/operaciones_del_dia_" + LocalDate.now() + ".txt";

    public void realizarReporteOperacionesDia() {

        FileReader lector = null;
        BufferedReader br = null;
        FileWriter escritor = null;
        BufferedWriter bw = null;
        try {
            escritor = new FileWriter(rutaArchivoReporteDia, true);
            bw = new BufferedWriter(escritor);

            String datosDia = "REGISTROS DEL DÍA " + LocalDate.now() + "\n\n"
                    + "| \t" + "Fecha" + "\t\t | \t" + "Depositos" + "\t | \t" + "Restiros" + "\t |";

            bw.write(datosDia);
            bw.newLine();

        } catch (Exception e) {
            System.out.println("Error al guardar los datos del registro " + e.getMessage());
        } finally {

            try {
                bw.close();
            } catch (Exception e) {
                System.out.println("Error al guardar el archivo. " + e.getMessage());
            }
        }
        try {
            lector = new FileReader(this.rutaArchivoApeCuenA);

            br = new BufferedReader(lector);

            String linea;
            while ((linea = br.readLine()) != null) {

                String[] parteLinea = linea.split(",");

                String noCuentaBus = parteLinea[2];

                setRuArchivoRepDia(noCuentaBus);

                buscarEnArchivoCuentaDia();

            }
            
            try {
                escritor = new FileWriter(rutaArchivoReporteDia, true);
                bw = new BufferedWriter(escritor);

                String totalDia = "\n\n Total de Dinero Depositado: \t" + totalDepoDia
                        + "\n Total de Dinero Retirado: \t" + totalRetiDia;

                bw.write(totalDia);
                bw.newLine();
                
                setAvisoArchivoCreado("Registro del día creado con éxito.");

            } catch (Exception e) {
                System.out.println("Error al guardar los datos del registro " + e.getMessage());
            } finally {

                try {
                    bw.close();
                } catch (Exception e) {
                    System.out.println("Error al guardar el archivo. " + e.getMessage());
                }
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

    }

    public void buscarEnArchivoCuentaDia() {
        String rutaArchivoDR = System.getProperty("user.dir") + "/base_de_datos/cuentas_clientes/" + ruArchivoRepDia + ".txt";
        FileReader lector = null;
        BufferedReader br = null;
        FileWriter escritor = null;
        BufferedWriter bw = null;

        try {
            lector = new FileReader(rutaArchivoDR);

            br = new BufferedReader(lector);
            fechaDia = String.valueOf(LocalDate.now());
            String linea2;
            while ((linea2 = br.readLine()) != null) {

                String[] parteLinea2 = linea2.split(",");

                String fechaDiaBus = parteLinea2[0];
                String depositoDiaBus = parteLinea2[1];
                String retiroDiaBus = parteLinea2[2];

                if (fechaDiaBus.equals(fechaDia)) {
                    fechaDiaEnc = fechaDiaBus;
                    depositoDiaEnc = Double.parseDouble(depositoDiaBus);
                    retiroDiaEnc = Double.parseDouble(retiroDiaBus);

                    setFechaDiaEnc(fechaDiaBus);
                    setCantiDepDia(depositoDiaBus);
                    setCantiRetDia(retiroDiaBus);

                    System.out.println(fechaDiaBus + " | " + depositoDiaBus + " | " + retiroDiaBus);

                    totalDepoDia = totalDepoDia + depositoDiaEnc;
                    totalRetiDia = totalRetiDia + retiroDiaEnc;

                    try {
                        escritor = new FileWriter(rutaArchivoReporteDia, true);
                        bw = new BufferedWriter(escritor);

                        String registrosDia = "| \t" + fechaDiaBus + "\t | \t" + depositoDiaBus + "\t\t | \t" + retiroDiaBus + "\t\t |";

                        bw.write(registrosDia);
                        bw.newLine();

                    } catch (Exception e) {
                        System.out.println("Error al guardar los datos del registro " + e.getMessage());
                    } finally {

                        try {
                            bw.close();
                        } catch (Exception e) {
                            System.out.println("Error al guardar el archivo. " + e.getMessage());
                        }
                    }
                } else {
                    setFechaDiaEnc("--------");
                    setCantiDepDia("Hola");
                    setCantiRetDia("0.0");
                }

            }

            setTotalDepoDia(totalDepoDia);
            setTotalRetiDia(totalRetiDia);

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
