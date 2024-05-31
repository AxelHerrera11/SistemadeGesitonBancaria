
package InterfazSistema;


import Codigo.LogicaActualizacionCliente;
import java.awt.Color;
import javax.swing.table.TableModel;

public class ActualizacionCliente extends javax.swing.JFrame {

    public ActualizacionCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.advertenciaCampoAC1.setVisible(false);
        this.advertenciaCampoAC2.setVisible(false);
        this.advertenciaCampoAC5.setVisible(false);
        this.advertenciaCampoAC6.setVisible(false);
        this.advertenciaCampoAC7.setVisible(false);
        this.advertenciaCampoAC8.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoPanelActualizacionCliente = new javax.swing.JPanel();
        tituloActualizacionCliente = new javax.swing.JLabel();
        tituloApellidosAC1 = new javax.swing.JLabel();
        labelApellidosAC = new javax.swing.JLabel();
        tituloNombreAC = new javax.swing.JLabel();
        labelNombreAC = new javax.swing.JLabel();
        tituloDPI = new javax.swing.JLabel();
        ingresoDPIActualizacion = new javax.swing.JTextField();
        tituloTelefono = new javax.swing.JLabel();
        ingresoTelefonoActualizar = new javax.swing.JTextField();
        tituloCorreo = new javax.swing.JLabel();
        ingresoCorreoActualizar = new javax.swing.JTextField();
        tituloOcupacion = new javax.swing.JLabel();
        ingresoOcupacionActualizar = new javax.swing.JTextField();
        tituloDireccion = new javax.swing.JLabel();
        ingresoDireccionActualizar = new javax.swing.JTextField();
        tituloIngresosMensuales = new javax.swing.JLabel();
        advertenciaCampoAC1 = new javax.swing.JLabel();
        advertenciaCampoAC2 = new javax.swing.JLabel();
        advertenciaCampoAC5 = new javax.swing.JLabel();
        advertenciaCampoAC6 = new javax.swing.JLabel();
        advertenciaCampoAC7 = new javax.swing.JLabel();
        advertenciaCampoAC8 = new javax.swing.JLabel();
        avisoErrorDPI = new javax.swing.JLabel();
        avisoActualizacion = new javax.swing.JLabel();
        ingresoIngresosMensualesActualizar = new javax.swing.JTextField();
        botonConsultarInfo = new javax.swing.JPanel();
        tituloBotonAperturaCuenta1 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JPanel();
        tituloBotonAperturaCuenta = new javax.swing.JLabel();
        botonRegresoInicio1 = new javax.swing.JPanel();
        tituloRegresoInicio1 = new javax.swing.JLabel();
        cuadroActualizacionCliente = new javax.swing.JLabel();
        fondoActualizacionCliente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fondoPanelActualizacionCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tituloActualizacionCliente.setFont(new java.awt.Font("Unispace", 0, 24)); // NOI18N
        tituloActualizacionCliente.setForeground(new java.awt.Color(0, 0, 0));
        tituloActualizacionCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloActualizacionCliente.setText("Actualización de Cliente");
        fondoPanelActualizacionCliente.add(tituloActualizacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 50));

        tituloApellidosAC1.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloApellidosAC1.setForeground(new java.awt.Color(51, 51, 51));
        tituloApellidosAC1.setText("Apellidos");
        fondoPanelActualizacionCliente.add(tituloApellidosAC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 150, -1));

        labelApellidosAC.setBackground(new java.awt.Color(255, 255, 255));
        labelApellidosAC.setForeground(new java.awt.Color(0, 0, 0));
        labelApellidosAC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        labelApellidosAC.setOpaque(true);
        fondoPanelActualizacionCliente.add(labelApellidosAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 340, 40));

        tituloNombreAC.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloNombreAC.setForeground(new java.awt.Color(51, 51, 51));
        tituloNombreAC.setText("Nombre");
        fondoPanelActualizacionCliente.add(tituloNombreAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 150, -1));

        labelNombreAC.setBackground(new java.awt.Color(255, 255, 255));
        labelNombreAC.setForeground(new java.awt.Color(0, 0, 0));
        labelNombreAC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        labelNombreAC.setOpaque(true);
        fondoPanelActualizacionCliente.add(labelNombreAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 340, 40));

        tituloDPI.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloDPI.setForeground(new java.awt.Color(51, 51, 51));
        tituloDPI.setText("DPI");
        fondoPanelActualizacionCliente.add(tituloDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, -1));

        ingresoDPIActualizacion.setBackground(new java.awt.Color(255, 255, 255));
        ingresoDPIActualizacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoDPIActualizacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoDPIActualizacionFocusLost(evt);
            }
        });
        ingresoDPIActualizacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoDPIActualizacionKeyTyped(evt);
            }
        });
        fondoPanelActualizacionCliente.add(ingresoDPIActualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 340, 40));

        tituloTelefono.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloTelefono.setForeground(new java.awt.Color(51, 51, 51));
        tituloTelefono.setText("Teléfono");
        fondoPanelActualizacionCliente.add(tituloTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 150, -1));

        ingresoTelefonoActualizar.setBackground(new java.awt.Color(255, 255, 255));
        ingresoTelefonoActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoTelefonoActualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoTelefonoActualizarFocusLost(evt);
            }
        });
        ingresoTelefonoActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoTelefonoActualizarKeyTyped(evt);
            }
        });
        fondoPanelActualizacionCliente.add(ingresoTelefonoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 340, 40));

        tituloCorreo.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloCorreo.setForeground(new java.awt.Color(51, 51, 51));
        tituloCorreo.setText("Correo");
        fondoPanelActualizacionCliente.add(tituloCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 150, -1));

        ingresoCorreoActualizar.setBackground(new java.awt.Color(255, 255, 255));
        ingresoCorreoActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoCorreoActualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoCorreoActualizarFocusLost(evt);
            }
        });
        fondoPanelActualizacionCliente.add(ingresoCorreoActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 340, 40));

        tituloOcupacion.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloOcupacion.setForeground(new java.awt.Color(51, 51, 51));
        tituloOcupacion.setText("Ocupación");
        fondoPanelActualizacionCliente.add(tituloOcupacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 150, -1));

        ingresoOcupacionActualizar.setBackground(new java.awt.Color(255, 255, 255));
        ingresoOcupacionActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoOcupacionActualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoOcupacionActualizarFocusLost(evt);
            }
        });
        fondoPanelActualizacionCliente.add(ingresoOcupacionActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 340, 40));

        tituloDireccion.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloDireccion.setForeground(new java.awt.Color(51, 51, 51));
        tituloDireccion.setText("Dirección");
        fondoPanelActualizacionCliente.add(tituloDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 150, -1));

        ingresoDireccionActualizar.setBackground(new java.awt.Color(255, 255, 255));
        ingresoDireccionActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoDireccionActualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoDireccionActualizarFocusLost(evt);
            }
        });
        fondoPanelActualizacionCliente.add(ingresoDireccionActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 340, 40));

        tituloIngresosMensuales.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloIngresosMensuales.setForeground(new java.awt.Color(51, 51, 51));
        tituloIngresosMensuales.setText("Ingresos Mensuales");
        fondoPanelActualizacionCliente.add(tituloIngresosMensuales, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 180, -1));

        advertenciaCampoAC1.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampoAC1.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampoAC1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampoAC1.setText("CAMPO REQUERIDO");
        fondoPanelActualizacionCliente.add(advertenciaCampoAC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 120, -1));

        advertenciaCampoAC2.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampoAC2.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampoAC2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampoAC2.setText("CAMPO REQUERIDO");
        fondoPanelActualizacionCliente.add(advertenciaCampoAC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 120, -1));

        advertenciaCampoAC5.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampoAC5.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampoAC5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampoAC5.setText("CAMPO REQUERIDO");
        fondoPanelActualizacionCliente.add(advertenciaCampoAC5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 120, -1));

        advertenciaCampoAC6.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampoAC6.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampoAC6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampoAC6.setText("CAMPO REQUERIDO");
        fondoPanelActualizacionCliente.add(advertenciaCampoAC6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 310, 120, -1));

        advertenciaCampoAC7.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampoAC7.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampoAC7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampoAC7.setText("CAMPO REQUERIDO");
        fondoPanelActualizacionCliente.add(advertenciaCampoAC7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 120, -1));

        advertenciaCampoAC8.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        advertenciaCampoAC8.setForeground(new java.awt.Color(153, 0, 0));
        advertenciaCampoAC8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        advertenciaCampoAC8.setText("CAMPO REQUERIDO");
        fondoPanelActualizacionCliente.add(advertenciaCampoAC8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 120, -1));

        avisoErrorDPI.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        avisoErrorDPI.setForeground(new java.awt.Color(153, 0, 0));
        avisoErrorDPI.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fondoPanelActualizacionCliente.add(avisoErrorDPI, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 460, 520, 15));

        avisoActualizacion.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        avisoActualizacion.setForeground(new java.awt.Color(0, 153, 0));
        avisoActualizacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        fondoPanelActualizacionCliente.add(avisoActualizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 520, 15));

        ingresoIngresosMensualesActualizar.setBackground(new java.awt.Color(255, 255, 255));
        ingresoIngresosMensualesActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 2));
        ingresoIngresosMensualesActualizar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ingresoIngresosMensualesActualizarFocusLost(evt);
            }
        });
        ingresoIngresosMensualesActualizar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoIngresosMensualesActualizarKeyTyped(evt);
            }
        });
        fondoPanelActualizacionCliente.add(ingresoIngresosMensualesActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, 340, 40));

        botonConsultarInfo.setBackground(new java.awt.Color(204, 204, 204));
        botonConsultarInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConsultarInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonConsultarInfoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonConsultarInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonConsultarInfoMouseExited(evt);
            }
        });

        tituloBotonAperturaCuenta1.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloBotonAperturaCuenta1.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonAperturaCuenta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonAperturaCuenta1.setText("Consultar Info.");

        javax.swing.GroupLayout botonConsultarInfoLayout = new javax.swing.GroupLayout(botonConsultarInfo);
        botonConsultarInfo.setLayout(botonConsultarInfoLayout);
        botonConsultarInfoLayout.setHorizontalGroup(
            botonConsultarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonConsultarInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloBotonAperturaCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonConsultarInfoLayout.setVerticalGroup(
            botonConsultarInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonConsultarInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloBotonAperturaCuenta1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPanelActualizacionCliente.add(botonConsultarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 160, 40));

        botonGuardar.setBackground(new java.awt.Color(204, 204, 204));
        botonGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonGuardarMouseExited(evt);
            }
        });

        tituloBotonAperturaCuenta.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloBotonAperturaCuenta.setForeground(new java.awt.Color(0, 0, 0));
        tituloBotonAperturaCuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloBotonAperturaCuenta.setText("Guardar");

        javax.swing.GroupLayout botonGuardarLayout = new javax.swing.GroupLayout(botonGuardar);
        botonGuardar.setLayout(botonGuardarLayout);
        botonGuardarLayout.setHorizontalGroup(
            botonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloBotonAperturaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        botonGuardarLayout.setVerticalGroup(
            botonGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, botonGuardarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloBotonAperturaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        fondoPanelActualizacionCliente.add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 160, 40));

        botonRegresoInicio1.setBackground(new java.awt.Color(246, 245, 242));
        botonRegresoInicio1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegresoInicio1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresoInicio1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botonRegresoInicio1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botonRegresoInicio1MouseExited(evt);
            }
        });

        tituloRegresoInicio1.setFont(new java.awt.Font("Unispace", 0, 14)); // NOI18N
        tituloRegresoInicio1.setForeground(new java.awt.Color(102, 102, 102));
        tituloRegresoInicio1.setText(" Regresar al Inicio");

        javax.swing.GroupLayout botonRegresoInicio1Layout = new javax.swing.GroupLayout(botonRegresoInicio1);
        botonRegresoInicio1.setLayout(botonRegresoInicio1Layout);
        botonRegresoInicio1Layout.setHorizontalGroup(
            botonRegresoInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonRegresoInicio1Layout.createSequentialGroup()
                .addComponent(tituloRegresoInicio1, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        botonRegresoInicio1Layout.setVerticalGroup(
            botonRegresoInicio1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloRegresoInicio1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        fondoPanelActualizacionCliente.add(botonRegresoInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 720, 50));

        cuadroActualizacionCliente.setBackground(new java.awt.Color(246, 245, 242));
        cuadroActualizacionCliente.setOpaque(true);
        fondoPanelActualizacionCliente.add(cuadroActualizacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 720));

        fondoActualizacionCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondos/fondos/fondoActualizacionCliente.png"))); // NOI18N
        fondoPanelActualizacionCliente.add(fondoActualizacionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelActualizacionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoPanelActualizacionCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresoInicio1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresoInicio1MouseClicked
        Inicio regresarInicio1 = new Inicio();
        regresarInicio1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonRegresoInicio1MouseClicked

    private void botonRegresoInicio1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresoInicio1MouseEntered
        botonRegresoInicio1.setBackground(new Color(227,226,223));
    }//GEN-LAST:event_botonRegresoInicio1MouseEntered

    private void botonRegresoInicio1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresoInicio1MouseExited
        botonRegresoInicio1.setBackground(new Color(246,245,242));
    }//GEN-LAST:event_botonRegresoInicio1MouseExited

    private void botonGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseEntered
        botonGuardar.setBackground(new Color(188,188,188));
    }//GEN-LAST:event_botonGuardarMouseEntered

    private void botonGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseExited
        botonGuardar.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_botonGuardarMouseExited

    private void botonGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonGuardarMouseClicked
        if(ingresoDPIActualizacion.getText().trim().isEmpty() || ingresoTelefonoActualizar.getText().trim().isEmpty() ||
           ingresoCorreoActualizar.getText().trim().isEmpty() || ingresoOcupacionActualizar.getText().trim().isEmpty() ||
           ingresoDireccionActualizar.getText().trim().isEmpty() || ingresoIngresosMensualesActualizar.getText().trim().isEmpty()){
        
        }else{
        String dpi = ingresoDPIActualizacion.getText();
        String direccion = ingresoDireccionActualizar.getText();
        String numTelefono = ingresoTelefonoActualizar.getText();
        String correo = ingresoCorreoActualizar.getText();
        String ocupacion = ingresoOcupacionActualizar.getText();
        String ingresoMensual = ingresoIngresosMensualesActualizar.getText();
        
        
        
        LogicaActualizacionCliente actualizarInfo = new LogicaActualizacionCliente();
        actualizarInfo.actualizarCliente(dpi, direccion, numTelefono, correo, ocupacion, ingresoMensual);
        
        this.avisoActualizacion.setText(actualizarInfo.getAvisoActualizacion());
        this.advertenciaCampoAC1.setVisible(false);
        this.advertenciaCampoAC2.setVisible(false);
        this.advertenciaCampoAC5.setVisible(false);
        this.advertenciaCampoAC6.setVisible(false);
        this.advertenciaCampoAC7.setVisible(false);
        this.advertenciaCampoAC8.setVisible(false);
        }
    }//GEN-LAST:event_botonGuardarMouseClicked

    private void ingresoDPIActualizacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoDPIActualizacionKeyTyped
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <= 57;

        if(!numero){
            evt.consume();
        }

        if(ingresoDPIActualizacion.getText().length() >= 13){
            evt.consume();
        }
    }//GEN-LAST:event_ingresoDPIActualizacionKeyTyped

    private void ingresoTelefonoActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoTelefonoActualizarKeyTyped
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <= 57 || key == 32 || key == 43;

        if(!numero){
            evt.consume();
        }

        if(ingresoTelefonoActualizar.getText().length() >= 13){
            evt.consume();
        }
    }//GEN-LAST:event_ingresoTelefonoActualizarKeyTyped

    private void ingresoIngresosMensualesActualizarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoIngresosMensualesActualizarKeyTyped
        int key = evt.getKeyChar();

        boolean numero = key >= 48 && key <= 57 || key == 46;

        if(!numero){
            evt.consume();
        }
    }//GEN-LAST:event_ingresoIngresosMensualesActualizarKeyTyped

    private void botonConsultarInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarInfoMouseClicked
        if(ingresoDPIActualizacion.getText().trim().isEmpty()){
            advertenciaCampoAC1.setVisible(true);
        }else{
            advertenciaCampoAC1.setVisible(false);

            LogicaActualizacionCliente consultar = new LogicaActualizacionCliente();
            consultar.buscarDpi(ingresoDPIActualizacion.getText());
            
            avisoActualizacion.setText("");
            avisoErrorDPI.setText(consultar.getAvisoError());
            labelNombreAC.setText(consultar.getNombreAC());
            labelApellidosAC.setText(consultar.getApellidosAC());
            ingresoDireccionActualizar.setText(consultar.getDireccionAC());        
            ingresoTelefonoActualizar.setText(consultar.getNumTelefonoAC());        
            ingresoCorreoActualizar.setText(consultar.getCorreoAC());               
            ingresoOcupacionActualizar.setText(consultar.getOcupacionAC());        
            ingresoIngresosMensualesActualizar.setText(consultar.getIngresomensualAC());
        }
    }//GEN-LAST:event_botonConsultarInfoMouseClicked

    private void botonConsultarInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarInfoMouseEntered
        botonConsultarInfo.setBackground(new Color(188,188,188));
    }//GEN-LAST:event_botonConsultarInfoMouseEntered

    private void botonConsultarInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonConsultarInfoMouseExited
        botonConsultarInfo.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_botonConsultarInfoMouseExited

    private void ingresoDPIActualizacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoDPIActualizacionFocusLost
        if(ingresoDPIActualizacion.getText().trim().isEmpty()){
            advertenciaCampoAC1.setVisible(true);
        }else{
            advertenciaCampoAC1.setVisible(false);
        }
    }//GEN-LAST:event_ingresoDPIActualizacionFocusLost

    private void ingresoTelefonoActualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoTelefonoActualizarFocusLost
        if(ingresoTelefonoActualizar.getText().trim().isEmpty()){
            advertenciaCampoAC2.setVisible(true);
        }else{
            advertenciaCampoAC2.setVisible(false);
        }
    }//GEN-LAST:event_ingresoTelefonoActualizarFocusLost

    private void ingresoCorreoActualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoCorreoActualizarFocusLost
        if(ingresoCorreoActualizar.getText().trim().isEmpty()){
            advertenciaCampoAC5.setVisible(true);
        }else{
            advertenciaCampoAC5.setVisible(false);
        }
    }//GEN-LAST:event_ingresoCorreoActualizarFocusLost

    private void ingresoOcupacionActualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoOcupacionActualizarFocusLost
        if(ingresoOcupacionActualizar.getText().trim().isEmpty()){
            advertenciaCampoAC6.setVisible(true);
        }else{
            advertenciaCampoAC6.setVisible(false);
        }
    }//GEN-LAST:event_ingresoOcupacionActualizarFocusLost

    private void ingresoDireccionActualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoDireccionActualizarFocusLost
        if(ingresoDireccionActualizar.getText().trim().isEmpty()){
            advertenciaCampoAC7.setVisible(true);
        }else{
            advertenciaCampoAC7.setVisible(false);
        }
    }//GEN-LAST:event_ingresoDireccionActualizarFocusLost

    private void ingresoIngresosMensualesActualizarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ingresoIngresosMensualesActualizarFocusLost
        if(ingresoIngresosMensualesActualizar.getText().trim().isEmpty()){
            advertenciaCampoAC8.setVisible(true);
        }else{
            advertenciaCampoAC8.setVisible(false);
        }
    }//GEN-LAST:event_ingresoIngresosMensualesActualizarFocusLost

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ActualizacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizacionCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ActualizacionCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel advertenciaCampoAC1;
    private javax.swing.JLabel advertenciaCampoAC2;
    private javax.swing.JLabel advertenciaCampoAC5;
    private javax.swing.JLabel advertenciaCampoAC6;
    private javax.swing.JLabel advertenciaCampoAC7;
    private javax.swing.JLabel advertenciaCampoAC8;
    private javax.swing.JLabel avisoActualizacion;
    private javax.swing.JLabel avisoErrorDPI;
    private javax.swing.JPanel botonConsultarInfo;
    private javax.swing.JPanel botonGuardar;
    private javax.swing.JPanel botonRegresoInicio1;
    private javax.swing.JLabel cuadroActualizacionCliente;
    private javax.swing.JLabel fondoActualizacionCliente;
    private javax.swing.JPanel fondoPanelActualizacionCliente;
    private javax.swing.JTextField ingresoCorreoActualizar;
    private javax.swing.JTextField ingresoDPIActualizacion;
    private javax.swing.JTextField ingresoDireccionActualizar;
    private javax.swing.JTextField ingresoIngresosMensualesActualizar;
    private javax.swing.JTextField ingresoOcupacionActualizar;
    private javax.swing.JTextField ingresoTelefonoActualizar;
    private javax.swing.JLabel labelApellidosAC;
    private javax.swing.JLabel labelNombreAC;
    private javax.swing.JLabel tituloActualizacionCliente;
    private javax.swing.JLabel tituloApellidosAC1;
    private javax.swing.JLabel tituloBotonAperturaCuenta;
    private javax.swing.JLabel tituloBotonAperturaCuenta1;
    private javax.swing.JLabel tituloCorreo;
    private javax.swing.JLabel tituloDPI;
    private javax.swing.JLabel tituloDireccion;
    private javax.swing.JLabel tituloIngresosMensuales;
    private javax.swing.JLabel tituloNombreAC;
    private javax.swing.JLabel tituloOcupacion;
    private javax.swing.JLabel tituloRegresoInicio1;
    private javax.swing.JLabel tituloTelefono;
    // End of variables declaration//GEN-END:variables
}
