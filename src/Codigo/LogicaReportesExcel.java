package Codigo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class LogicaReportesExcel {
    private String avisoArchivoCreado = "";

    public String getAvisoArchivoCreado() {
        return avisoArchivoCreado;
    }

    public void setAvisoArchivoCreado(String avisoArchivoCreado) {
        this.avisoArchivoCreado = avisoArchivoCreado;
    }
    
    
    LogicaDatosClientes datosClientes = new LogicaDatosClientes();
    public void generarReporteExcel() {

        List<LogicaInfoClientes> listaClienteses = new ArrayList<>();

        listaClienteses = datosClientes.llenarLista();

        String nombreReporte = System.getProperty("user.dir") + "/reporte.xlsx";

        Workbook workbook = new XSSFWorkbook();

        Sheet hoja = workbook.createSheet("Reporte");

        String[] titulos = {"NO DE CUENTA", "SALDO ACTUAL"};

        Row filaEncabezados = hoja.createRow(0);

        for(int i = 0; i < titulos.length; i++) {
            Cell celda = filaEncabezados.createCell(i);
            celda.setCellValue(titulos[i]);
            hoja.autoSizeColumn(i);
        }

        for(int i = 0; i<listaClienteses.size(); i++) {
            
            Row filaDatos = hoja.createRow(i+1);
            
            for(int dato = 0; dato < titulos.length; dato++) { 
            
                Cell celdaDato = filaDatos.createCell(dato);
                
                String noCuenta = listaClienteses.get(i).getNoCuenta()!= null ? listaClienteses.get(i).getNoCuenta() : "";
                String saldoActual = listaClienteses.get(i).getSaldoActual()!= null ? listaClienteses.get(i).getSaldoActual(): "";

                switch (dato) {
                    case 0: { celdaDato.setCellValue(noCuenta); break; }
                    case 1: { celdaDato.setCellValue(saldoActual); break; }
                }
                
                hoja.autoSizeColumn(dato);
                
            }
            
        }

        try (FileOutputStream fileOut = new FileOutputStream(nombreReporte)) {
            workbook.write(fileOut);
            setAvisoArchivoCreado("Archivo Excel creado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            workbook.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
