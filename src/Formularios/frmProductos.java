
package Formularios;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import mr22058.pkg2023.poo.pkg6.CongeladosPorAgua;
import mr22058.pkg2023.poo.pkg6.CongeladosPorAire;
import mr22058.pkg2023.poo.pkg6.CongeladosPorNitrogeno;
import mr22058.pkg2023.poo.pkg6.Frescos;
import mr22058.pkg2023.poo.pkg6.Productos;
import mr22058.pkg2023.poo.pkg6.Refrigerados;

public class frmProductos extends javax.swing.JFrame {
    private String paisSeleccionado = null;
    Productos producto;
    Frescos fresco;
    Refrigerados refrigerado;
    CongeladosPorAire congeladosAire;
    CongeladosPorAgua congeladosAgua;
    CongeladosPorNitrogeno congeladosNitrogeno;
    
    public frmProductos() {
        initComponents();
        num(txtTemperaturaRecomendada, false);//falso para que permita punto 
        num(txtLote, true);
        num(txtCodigoAlimentario,true);
        num(txtPNitrogeno,false);
        num(txtPOxigeno,false);
        num(txtPDioxidoCarbono,false);
        num(txtPVaporAgua,false);
        num(txtSalinidad,false);
        num(txtTiempoExposicion,false);
        
    }

    private void num(JTextField a, boolean soloEnteros) {
        a.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (soloEnteros) { // para permitir solo numeros enteros
                    if (!Character.isDigit(c) && c != '\b') {
                        e.consume();
                        mostrarMensajeError("Debe ingresar números enteros únicamente.");
                    }
                } else {
                    if (!Character.isDigit(c) && c!= '\b' && c != '.') { //para permitir numeros double y un punto y la tecla borrar
                        e.consume();
                        mostrarMensajeError("Debe ingresar números o decimales.");
                    }
                    if (c == '.' && a.getText().contains(".")) {
                        e.consume();
                        mostrarMensajeError("Solo se permite un punto decimal.");
                    }
                }
            }
        });
    }
    
    private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.WARNING_MESSAGE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngProductos = new javax.swing.ButtonGroup();
        btngCongelados = new javax.swing.ButtonGroup();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFechaCaducidad = new javax.swing.JLabel();
        ftxtFechaCaducidad = new javax.swing.JFormattedTextField();
        lblLote = new javax.swing.JLabel();
        btnCrear = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        rbtnFrescos = new javax.swing.JRadioButton();
        rbtnCongelados = new javax.swing.JRadioButton();
        rbtnRefrigerados = new javax.swing.JRadioButton();
        txtLote = new javax.swing.JTextField();
        lblFechaEnvasado = new javax.swing.JLabel();
        ftxtFechaEnvasado = new javax.swing.JFormattedTextField();
        lblPais = new javax.swing.JLabel();
        cmbPais = new javax.swing.JComboBox<>();
        rbtnAire = new javax.swing.JRadioButton();
        rbtnAgua = new javax.swing.JRadioButton();
        rbtnNitrogeno = new javax.swing.JRadioButton();
        lblPNitrogeno = new javax.swing.JLabel();
        lblPOxigeno = new javax.swing.JLabel();
        lblPDioxidoCarbono = new javax.swing.JLabel();
        lblPVaporAgua = new javax.swing.JLabel();
        txtPNitrogeno = new javax.swing.JTextField();
        txtPOxigeno = new javax.swing.JTextField();
        txtPDioxidoCarbono = new javax.swing.JTextField();
        txtPVaporAgua = new javax.swing.JTextField();
        lblSalinidad = new javax.swing.JLabel();
        txtSalinidad = new javax.swing.JTextField();
        lblMetodoCongelacion = new javax.swing.JLabel();
        txtMetodoCongelacion = new javax.swing.JTextField();
        lblTiempoExposicion = new javax.swing.JLabel();
        txtTiempoExposicion = new javax.swing.JTextField();
        lblCodigoAlimentario = new javax.swing.JLabel();
        txtCodigoAlimentario = new javax.swing.JTextField();
        lblTemperaturaRecomendada = new javax.swing.JLabel();
        txtTemperaturaRecomendada = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inventario Maxi Pali");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/producto.png")).getImage());

        lblNombre.setText("Nombre del  Producto");

        lblFechaCaducidad.setText("Fecha de Caducidad");

        ftxtFechaCaducidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        ftxtFechaCaducidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtFechaCaducidadActionPerformed(evt);
            }
        });

        lblLote.setText("Lote     #");

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btngProductos.add(rbtnFrescos);
        rbtnFrescos.setText("Frescos");
        rbtnFrescos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFrescosActionPerformed(evt);
            }
        });

        btngProductos.add(rbtnCongelados);
        rbtnCongelados.setText("Congelados");
        rbtnCongelados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCongeladosActionPerformed(evt);
            }
        });

        btngProductos.add(rbtnRefrigerados);
        rbtnRefrigerados.setText("Refrigerados");
        rbtnRefrigerados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRefrigeradosActionPerformed(evt);
            }
        });

        txtLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoteActionPerformed(evt);
            }
        });

        lblFechaEnvasado.setText("Fecha de envasado");

        ftxtFechaEnvasado.setEnabled(false);
        ftxtFechaEnvasado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ftxtFechaEnvasadoActionPerformed(evt);
            }
        });

        lblPais.setText("Pais de origen");

        cmbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione un país>", "México", "Guatemala", "Honduras", "Nicaragua", "Costa Rica", "Panamá" }));
        cmbPais.setEnabled(false);
        cmbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPaisActionPerformed(evt);
            }
        });

        btngCongelados.add(rbtnAire);
        rbtnAire.setText("Congelado por Aire");
        rbtnAire.setEnabled(false);
        rbtnAire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAireActionPerformed(evt);
            }
        });

        btngCongelados.add(rbtnAgua);
        rbtnAgua.setText("Congelado por Agua");
        rbtnAgua.setEnabled(false);
        rbtnAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAguaActionPerformed(evt);
            }
        });

        btngCongelados.add(rbtnNitrogeno);
        rbtnNitrogeno.setText("Congelado Por Nitrogeno");
        rbtnNitrogeno.setEnabled(false);
        rbtnNitrogeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNitrogenoActionPerformed(evt);
            }
        });

        lblPNitrogeno.setText("Nitrogeno %");

        lblPOxigeno.setText("Oxígeno    %");

        lblPDioxidoCarbono.setText("Dioxido de carbono %");

        lblPVaporAgua.setText("Vapor de Agua %");

        txtPNitrogeno.setEnabled(false);
        txtPNitrogeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNitrogenoActionPerformed(evt);
            }
        });

        txtPOxigeno.setEnabled(false);
        txtPOxigeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPOxigenoActionPerformed(evt);
            }
        });

        txtPDioxidoCarbono.setEnabled(false);
        txtPDioxidoCarbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPDioxidoCarbonoActionPerformed(evt);
            }
        });

        txtPVaporAgua.setEnabled(false);
        txtPVaporAgua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPVaporAguaActionPerformed(evt);
            }
        });

        lblSalinidad.setText("Salinidad del agua g/L");

        txtSalinidad.setEnabled(false);

        lblMetodoCongelacion.setText("Metodo de congelación");

        txtMetodoCongelacion.setEnabled(false);
        txtMetodoCongelacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetodoCongelacionActionPerformed(evt);
            }
        });

        lblTiempoExposicion.setText("Tiempo de Exposición  m/s");

        txtTiempoExposicion.setEnabled(false);

        lblCodigoAlimentario.setText("Codigo Alimentario");

        txtCodigoAlimentario.setEnabled(false);
        txtCodigoAlimentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlimentarioActionPerformed(evt);
            }
        });

        lblTemperaturaRecomendada.setText("Temperatura Recomendada C°");

        txtTemperaturaRecomendada.setEnabled(false);
        txtTemperaturaRecomendada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTemperaturaRecomendadaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnFrescos)
                            .addComponent(lblFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLote, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnAire)
                            .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaEnvasado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtPNitrogeno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblSalinidad)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtSalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtPOxigeno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(txtPVaporAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(249, 249, 249)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(lblMetodoCongelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMetodoCongelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(rbtnNitrogeno)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(btnSalir)
                                            .addComponent(lblTiempoExposicion))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTiempoExposicion, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ftxtFechaEnvasado, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(lblCodigoAlimentario, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtCodigoAlimentario, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblTemperaturaRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(btnCrear)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnMostrar)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtTemperaturaRecomendada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(78, 78, 78)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(rbtnAgua)
                                            .addComponent(rbtnRefrigerados))
                                        .addGap(202, 202, 202)
                                        .addComponent(rbtnCongelados)))
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ftxtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPOxigeno)
                            .addComponent(lblPDioxidoCarbono)
                            .addComponent(lblPNitrogeno)
                            .addComponent(lblPVaporAgua))
                        .addGap(24, 24, 24)
                        .addComponent(txtPDioxidoCarbono, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxtFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLote, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnFrescos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnRefrigerados, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnCongelados, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaEnvasado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftxtFechaEnvasado, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoAlimentario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodigoAlimentario, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPais, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTemperaturaRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTemperaturaRecomendada, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnAire, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnNitrogeno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPNitrogeno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPNitrogeno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalinidad, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMetodoCongelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMetodoCongelacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPOxigeno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPOxigeno, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTiempoExposicion)
                    .addComponent(txtTiempoExposicion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPDioxidoCarbono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPDioxidoCarbono, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPVaporAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPVaporAgua, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ftxtFechaCaducidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtFechaCaducidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtFechaCaducidadActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        boolean esProductoFresco = false;
        boolean esProductoRefrigearo = false;
        if (txtNombre.getText().isEmpty()) {
            mostrarMensajeError("Debe ingresar el nombre del producto");
            txtNombre.requestFocus();
            return;
        }
        if (ftxtFechaCaducidad.getText().isEmpty()) {
            mostrarMensajeError("Debe ingresar la fecha de caducidad");
            ftxtFechaCaducidad.requestFocus();
            return;
        }
        if (txtLote.getText().isEmpty()) {
            mostrarMensajeError("Debe ingresar el número de lote");
            txtLote.requestFocus();
            return;
        }
        if (rbtnFrescos.isSelected()) { // Validación específica para "Productos Frescos"
            if (ftxtFechaEnvasado.getText().isEmpty()) {
                mostrarMensajeError("Debe ingresar la fecha de envasado");
                ftxtFechaEnvasado.requestFocus();
                return;
            }
            if (cmbPais.getSelectedIndex() == 0) {
                mostrarMensajeError("Debe seleccionar un país de origen");
                cmbPais.requestFocus();
                return;
            }
            fresco = new Frescos(txtNombre.getText(), ftxtFechaCaducidad.getText(), Integer.parseInt(txtLote.getText()), ftxtFechaEnvasado.getText(), paisSeleccionado);
            JOptionPane.showMessageDialog(null, "Producto Fresco creado con éxito");
        } else if (rbtnRefrigerados.isSelected()) {
            if (txtCodigoAlimentario.getText().isEmpty()) {
                mostrarMensajeError("Debe ingresar el código alimentario");
                txtCodigoAlimentario.requestFocus();
                return;
            }
            if (txtTemperaturaRecomendada.getText().isEmpty()) {
                mostrarMensajeError("Debe ingresar la temperatura recomendada");
                txtTemperaturaRecomendada.requestFocus();
                return;
            }
            
            else if(rbtnAire.isSelected()){
                if(txtPNitrogeno.getText().isEmpty()){
                mostrarMensajeError("Debe ingresar el porcentage de nitrogeno");
                txtPNitrogeno.requestFocus();
                return;
                }
                if(txtPOxigeno.getText().isEmpty()){
                mostrarMensajeError("Debe ingresar el porcentage de Oxigeno");
                txtPOxigeno.requestFocus();
                return;
                }
                if(txtPDioxidoCarbono.getText().isEmpty()){
                mostrarMensajeError("Debe ingresar el porcentage de nitrogeno");
                txtPDioxidoCarbono.requestFocus();
                return;
                }
                if(txtPVaporAgua.getText().isEmpty()){
                mostrarMensajeError("Debe ingresar el porcentage de vapor de agua");
                txtPVaporAgua.requestFocus();
                return;
                }
            }
            else if(rbtnAgua.isSelected()){
                if(txtSalinidad.getText().isEmpty()){
                mostrarMensajeError("Debe ingresar el porcentage de salinidad del agua");
                txtSalinidad.requestFocus();
                return;
                }
            }
            else if(rbtnNitrogeno.isSelected()){
                if(txtMetodoCongelacion.getText().isEmpty()){
                mostrarMensajeError("Debe ingresar el metodo de congelacion");
                txtMetodoCongelacion.requestFocus();
                return;
                }
                if(txtTiempoExposicion.getText().isEmpty()){
                mostrarMensajeError("Debe ingresar el tiempo de exposicion");
                txtTiempoExposicion.requestFocus();
                return;
                }
            }
            
           refrigerado = new Refrigerados(txtNombre.getText(),ftxtFechaCaducidad.getText(),Integer.parseInt(txtLote.getText()),ftxtFechaEnvasado.getText(),paisSeleccionado,
                                 Integer.parseInt(txtCodigoAlimentario.getText()),Double.parseDouble(txtTemperaturaRecomendada.getText()));
           JOptionPane.showMessageDialog(null, "Producto Refrigerado creado con éxito");
           
           congeladosAire = new CongeladosPorAire(txtNombre.getText(),ftxtFechaCaducidad.getText(),Integer.parseInt(txtLote.getText()),ftxtFechaEnvasado.getText(),paisSeleccionado,
                                 Double.parseDouble(txtTemperaturaRecomendada.getText()),Double.parseDouble(txtPNitrogeno.getText()),Double.parseDouble(txtPOxigeno.getText()),Double.parseDouble(txtPDioxidoCarbono.getText()),Double.parseDouble(txtPVaporAgua.getText()));
            JOptionPane.showMessageDialog(null, "Producto congelado por aire creado con éxito");
            
            congeladosAgua = new CongeladosPorAgua(txtNombre.getText(),ftxtFechaCaducidad.getText(),Integer.parseInt(txtLote.getText()),ftxtFechaEnvasado.getText(),paisSeleccionado,
                                 Double.parseDouble(txtTemperaturaRecomendada.getText()),Double.parseDouble(txtSalinidad.getText()));
            JOptionPane.showMessageDialog(null, "Producto congelado por agua creado con éxito");
            
            congeladosNitrogeno = new CongeladosPorNitrogeno(txtNombre.getText(), ftxtFechaCaducidad.getText(), Integer.parseInt(txtLote.getText()), ftxtFechaEnvasado.getText(), paisSeleccionado,Double.parseDouble(txtTemperaturaRecomendada.getText()),txtMetodoCongelacion.getText(),Double.parseDouble(txtTiempoExposicion.getText()));
            JOptionPane.showMessageDialog(null, "Producto congelado por nitrogeno creado con éxito");
            
        } else {
            producto = new Productos(txtNombre.getText(), ftxtFechaCaducidad.getText(),
                    Integer.parseInt(txtLote.getText()));
            JOptionPane.showMessageDialog(null, "Producto creado con éxito");
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed

        if (refrigerado != null) {
            refrigerado.mostrar();
        } else if (fresco != null) {
            fresco.mostrar();
        } else if (producto != null) {
            producto.mostrar();
        } else {
            JOptionPane.showMessageDialog(this, "No se ha creado ningún producto todavía.");
        }
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void rbtnFrescosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFrescosActionPerformed
        if (rbtnFrescos.isSelected()){
            ftxtFechaEnvasado.setEnabled(true);
            cmbPais.setEnabled(true);
            txtCodigoAlimentario.setEnabled(false);
            txtTemperaturaRecomendada.setEnabled(false);
            ftxtFechaEnvasado.requestFocus();
        }
    }//GEN-LAST:event_rbtnFrescosActionPerformed

    private void cmbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPaisActionPerformed
        String seleccion = (String) cmbPais.getSelectedItem();

        // Guarda la selección del país en la variable de clase
        paisSeleccionado = (seleccion.equals("<Seleccione un país>")) ? null : seleccion;

    }//GEN-LAST:event_cmbPaisActionPerformed

    private void txtLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoteActionPerformed
        //
    }//GEN-LAST:event_txtLoteActionPerformed

    private void rbtnNitrogenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNitrogenoActionPerformed
        if (rbtnNitrogeno.isSelected()) {
            txtPNitrogeno.setEnabled(false);
            txtPOxigeno.setEnabled(false);
            txtPDioxidoCarbono.setEnabled(false);
            txtPVaporAgua.setEnabled(false);
            txtSalinidad.setEnabled(false);
            txtCodigoAlimentario.setEnabled(false);
            txtTemperaturaRecomendada.setEnabled(true);
            txtMetodoCongelacion.setEnabled(true);
            txtTiempoExposicion.setEnabled(true);
        }

    }//GEN-LAST:event_rbtnNitrogenoActionPerformed

    private void txtPNitrogenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNitrogenoActionPerformed
         if (rbtnAire.isSelected()) {
            rbtnAire.setEnabled(true);
            rbtnAgua.setEnabled(false);
            rbtnNitrogeno.setEnabled(false);
        }
        else{
            rbtnAire.setEnabled(false);
        }
    }//GEN-LAST:event_txtPNitrogenoActionPerformed

    private void rbtnAireActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAireActionPerformed
        if (rbtnAire.isSelected()) {
            txtPNitrogeno.setEnabled(true); // Habilitar el JTextField
            txtPOxigeno.setEnabled(true);
            txtPDioxidoCarbono.setEnabled(true);
            txtPVaporAgua.setEnabled(true);
            txtSalinidad.setEnabled(false);
            txtMetodoCongelacion.setEnabled(false);
            txtTiempoExposicion.setEnabled(false);
        } 
    }//GEN-LAST:event_rbtnAireActionPerformed

    private void rbtnCongeladosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCongeladosActionPerformed
        if (rbtnCongelados.isSelected()) {
            rbtnAire.setEnabled(true);
            rbtnAgua.setEnabled(true);
            rbtnNitrogeno.setEnabled(true);
        } else {
            rbtnAire.setEnabled(false);
            rbtnAgua.setEnabled(false);
            rbtnNitrogeno.setEnabled(false);
        }
    }//GEN-LAST:event_rbtnCongeladosActionPerformed

    private void txtPOxigenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPOxigenoActionPerformed
        if (rbtnAire.isSelected()) {
            txtPNitrogeno.setEnabled(true); // Habilitar el JTextField
        } else {
            txtPNitrogeno.setEnabled(false); // Deshabilitar el JTextField
        }
    }//GEN-LAST:event_txtPOxigenoActionPerformed

    private void txtPDioxidoCarbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPDioxidoCarbonoActionPerformed
        if (rbtnAire.isSelected()) {
            txtPNitrogeno.setEnabled(true); // Habilitar el JTextField
        } else {
            txtPNitrogeno.setEnabled(false); // Deshabilitar el JTextField
        }
    }//GEN-LAST:event_txtPDioxidoCarbonoActionPerformed

    private void txtPVaporAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPVaporAguaActionPerformed
        //
    }//GEN-LAST:event_txtPVaporAguaActionPerformed

    private void rbtnAguaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAguaActionPerformed
        txtPNitrogeno.setEnabled(false);
        txtPOxigeno.setEnabled(false);
        txtPDioxidoCarbono.setEnabled(false);
        txtPVaporAgua.setEnabled(false);
        txtSalinidad.setEnabled(true);
        txtMetodoCongelacion.setEnabled(false);
        txtTiempoExposicion.setEnabled(false);
    }//GEN-LAST:event_rbtnAguaActionPerformed

    private void rbtnRefrigeradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRefrigeradosActionPerformed
        if (rbtnRefrigerados.isSelected()) {
            txtCodigoAlimentario.setEnabled(true);
            txtTemperaturaRecomendada.setEnabled(true);
            rbtnCongelados.setEnabled(false);
        }
    }//GEN-LAST:event_rbtnRefrigeradosActionPerformed

    private void ftxtFechaEnvasadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ftxtFechaEnvasadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ftxtFechaEnvasadoActionPerformed

    private void txtCodigoAlimentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlimentarioActionPerformed
       //Todo add your handlin code here:
    }//GEN-LAST:event_txtCodigoAlimentarioActionPerformed

    private void txtTemperaturaRecomendadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTemperaturaRecomendadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemperaturaRecomendadaActionPerformed

    private void txtMetodoCongelacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetodoCongelacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetodoCongelacionActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        ftxtFechaCaducidad.setText("");
        txtLote.setText("");
        ftxtFechaEnvasado.setText("");
        cmbPais.setSelectedIndex(0); // Vuelve a seleccionar el primer elemento en el ComboBox
        txtCodigoAlimentario.setText("");
        txtTemperaturaRecomendada.setText("");
        txtPNitrogeno.setText("");
        txtPOxigeno.setText("");
        txtPDioxidoCarbono.setText("");
        txtPVaporAgua.setText("");
        txtSalinidad.setText("");
        txtMetodoCongelacion.setText("");
        txtTiempoExposicion.setText("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "Desea salir del Programa", "salir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngCongelados;
    private javax.swing.ButtonGroup btngProductos;
    private javax.swing.JComboBox<String> cmbPais;
    private javax.swing.JFormattedTextField ftxtFechaCaducidad;
    private javax.swing.JFormattedTextField ftxtFechaEnvasado;
    private javax.swing.JLabel lblCodigoAlimentario;
    private javax.swing.JLabel lblFechaCaducidad;
    private javax.swing.JLabel lblFechaEnvasado;
    private javax.swing.JLabel lblLote;
    private javax.swing.JLabel lblMetodoCongelacion;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPDioxidoCarbono;
    private javax.swing.JLabel lblPNitrogeno;
    private javax.swing.JLabel lblPOxigeno;
    private javax.swing.JLabel lblPVaporAgua;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblSalinidad;
    private javax.swing.JLabel lblTemperaturaRecomendada;
    private javax.swing.JLabel lblTiempoExposicion;
    private javax.swing.JRadioButton rbtnAgua;
    private javax.swing.JRadioButton rbtnAire;
    private javax.swing.JRadioButton rbtnCongelados;
    private javax.swing.JRadioButton rbtnFrescos;
    private javax.swing.JRadioButton rbtnNitrogeno;
    private javax.swing.JRadioButton rbtnRefrigerados;
    private javax.swing.JTextField txtCodigoAlimentario;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtMetodoCongelacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPDioxidoCarbono;
    private javax.swing.JTextField txtPNitrogeno;
    private javax.swing.JTextField txtPOxigeno;
    private javax.swing.JTextField txtPVaporAgua;
    private javax.swing.JTextField txtSalinidad;
    private javax.swing.JTextField txtTemperaturaRecomendada;
    private javax.swing.JTextField txtTiempoExposicion;
    // End of variables declaration//GEN-END:variables
}
