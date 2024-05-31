package Codigo;

public class LogicaInfoClientes {
    private String noCuenta;
    private String saldoActual;

    public LogicaInfoClientes() {
    }

    public LogicaInfoClientes(String noCuenta, String saldoActual) {
        this.noCuenta = noCuenta;
        this.saldoActual = saldoActual;
    }

    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(String saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}
