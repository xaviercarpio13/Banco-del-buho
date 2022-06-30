
package proyectoprimerbimestre;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalTime;


public class PantallaPrincipal extends javax.swing.JFrame {
       public Usuario usuario;
    
    public PantallaPrincipal(Usuario cliente) {
        
        initComponents();
        DecimalFormat frmt=new DecimalFormat();
        frmt.setMaximumFractionDigits(2);
        
        this.usuario=cliente;
       
        
        lblBienvenido.setText("Bienvenido,");
        txtNombreCliente.setText(cliente.getNombre()+" "+cliente.getApellido());
        LocalDate fechaActualIngreso=LocalDate.now();
        LocalTime horaActual=LocalTime.now();
        String ingresoFechaHora = "Ultimo ingreso: "+String.valueOf(fechaActualIngreso)+
                                  " a las "+String.valueOf(horaActual).substring(0, 8); 
        txtHoraFecha.setText(String.valueOf(ingresoFechaHora));
        switch (cliente.getCantidadCuentas()) {
            case 1:
                txtTipoCuenta4.setText(""); txtSaldoCuenta4.setText(""); txtNumeroCuenta4.setText("");
                txtTipoCuenta3.setText(""); txtSaldoCuenta3.setText(""); txtNumeroCuenta3.setText("");
                txtTipoCuenta2.setText(""); txtSaldoCuenta2.setText(""); txtNumeroCuenta2.setText("");
                txtTipoCuenta1.setText(String.valueOf(cliente.getTipoDeCuenta(0))); 
                txtSaldoCuenta1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                txtNumeroCuenta1.setText(String.valueOf(cliente.getNumeroDeCuenta(0)));
                break;
            case 2:
                txtTipoCuenta4.setText(""); txtSaldoCuenta4.setText(""); txtNumeroCuenta4.setText("");
                txtTipoCuenta3.setText(""); txtSaldoCuenta3.setText(""); txtNumeroCuenta3.setText("");
                txtTipoCuenta1.setText(String.valueOf(cliente.getTipoDeCuenta(0))); 
                txtSaldoCuenta1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                txtNumeroCuenta1.setText(String.valueOf(cliente.getNumeroDeCuenta(0)));
                txtTipoCuenta2.setText(String.valueOf(cliente.getTipoDeCuenta(1))); 
                txtSaldoCuenta2.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
                txtNumeroCuenta2.setText(String.valueOf(cliente.getNumeroDeCuenta(1)));
                break;
            case 3:
                txtTipoCuenta4.setText(""); txtSaldoCuenta4.setText(""); txtNumeroCuenta4.setText("");
                txtTipoCuenta1.setText(String.valueOf(cliente.getTipoDeCuenta(0))); 
                txtSaldoCuenta1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                txtNumeroCuenta1.setText(String.valueOf(cliente.getNumeroDeCuenta(0)));
                txtTipoCuenta2.setText(String.valueOf(cliente.getTipoDeCuenta(1))); 
                txtSaldoCuenta2.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
                txtNumeroCuenta2.setText(String.valueOf(cliente.getNumeroDeCuenta(1)));
                txtTipoCuenta3.setText(String.valueOf(cliente.getTipoDeCuenta(2))); 
                txtSaldoCuenta3.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
                txtNumeroCuenta3.setText(String.valueOf(cliente.getNumeroDeCuenta(2)));
                break;
            default:
                txtTipoCuenta1.setText(String.valueOf(cliente.getTipoDeCuenta(0))); 
                txtSaldoCuenta1.setText(String.valueOf(frmt.format(cliente.getSaldo(0))));
                txtNumeroCuenta1.setText(String.valueOf(cliente.getNumeroDeCuenta(0)));
                txtTipoCuenta2.setText(String.valueOf(cliente.getTipoDeCuenta(1))); 
                txtSaldoCuenta2.setText(String.valueOf(frmt.format(cliente.getSaldo(1))));
                txtNumeroCuenta2.setText(String.valueOf(cliente.getNumeroDeCuenta(1)));
                txtTipoCuenta3.setText(String.valueOf(cliente.getTipoDeCuenta(2))); 
                txtSaldoCuenta3.setText(String.valueOf(frmt.format(cliente.getSaldo(2))));
                txtNumeroCuenta3.setText(String.valueOf(cliente.getNumeroDeCuenta(2)));
                txtTipoCuenta4.setText(String.valueOf(cliente.getTipoDeCuenta(3))); 
                txtSaldoCuenta4.setText(String.valueOf(frmt.format(cliente.getSaldo(3))));
                txtNumeroCuenta4.setText(String.valueOf(cliente.getNumeroDeCuenta(3)));
                break;
        }
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator4 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        PanelAzulFooter = new javax.swing.JPanel();
        lblBienvenido = new javax.swing.JLabel();
        txtNombreCliente = new javax.swing.JLabel();
        txtHoraFecha = new javax.swing.JLabel();
        txtOperaciones = new javax.swing.JLabel();
        PanelRojoFooter = new javax.swing.JPanel();
        imgUsuario = new javax.swing.JLabel();
        txtTipoCuenta4 = new javax.swing.JLabel();
        txtNumeroCuenta4 = new javax.swing.JLabel();
        txtTipoCuenta2 = new javax.swing.JLabel();
        txtTipoCuenta3 = new javax.swing.JLabel();
        txtTipoCuenta1 = new javax.swing.JLabel();
        txtSaldoCuenta4 = new javax.swing.JLabel();
        txtNumeroCuenta2 = new javax.swing.JLabel();
        txtNumeroCuenta3 = new javax.swing.JLabel();
        txtNumeroCuenta1 = new javax.swing.JLabel();
        txtSaldoCuenta1 = new javax.swing.JLabel();
        txtSaldoCuenta2 = new javax.swing.JLabel();
        txtSaldoCuenta3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        txtMisCuentas = new javax.swing.JLabel();
        btnTransferencia = new javax.swing.JPanel();
        imgTransferencia = new javax.swing.JLabel();
        bntCreditos = new javax.swing.JPanel();
        imgCreditos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnInfoCuenta1 = new javax.swing.JPanel();
        imgFlechaAccesoCuenta1 = new javax.swing.JLabel();
        btnInfoCuenta2 = new javax.swing.JPanel();
        imgFlechaAccesoCuenta2 = new javax.swing.JLabel();
        btnInfoCuenta3 = new javax.swing.JPanel();
        imgFlechaAccesoCuenta3 = new javax.swing.JLabel();
        btnInfoCuenta4 = new javax.swing.JPanel();
        imgFlechaAccesoCuenta4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 125));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.setMaximumSize(new java.awt.Dimension(281, 500));
        jPanel1.setMinimumSize(new java.awt.Dimension(301, 466));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzulFooter.setBackground(new java.awt.Color(15, 34, 64));

        javax.swing.GroupLayout PanelAzulFooterLayout = new javax.swing.GroupLayout(PanelAzulFooter);
        PanelAzulFooter.setLayout(PanelAzulFooterLayout);
        PanelAzulFooterLayout.setHorizontalGroup(
            PanelAzulFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelAzulFooterLayout.setVerticalGroup(
            PanelAzulFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(PanelAzulFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 280, 30));

        lblBienvenido.setBackground(new java.awt.Color(0, 0, 0));
        lblBienvenido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblBienvenido.setForeground(new java.awt.Color(15, 34, 64));
        lblBienvenido.setText("Bienvenido,");
        jPanel1.add(lblBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 180, 20));

        txtNombreCliente.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        txtNombreCliente.setText("Bicho Serresiete");
        jPanel1.add(txtNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 180, 20));

        txtHoraFecha.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        txtHoraFecha.setForeground(new java.awt.Color(153, 153, 153));
        txtHoraFecha.setText("Ultimo ingreso: 2022-06-28 a las 14:33:28");
        jPanel1.add(txtHoraFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 180, -1));

        txtOperaciones.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        txtOperaciones.setText("Operaciones");
        jPanel1.add(txtOperaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        PanelRojoFooter.setBackground(new java.awt.Color(227, 29, 26));

        javax.swing.GroupLayout PanelRojoFooterLayout = new javax.swing.GroupLayout(PanelRojoFooter);
        PanelRojoFooter.setLayout(PanelRojoFooterLayout);
        PanelRojoFooterLayout.setHorizontalGroup(
            PanelRojoFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelRojoFooterLayout.setVerticalGroup(
            PanelRojoFooterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(PanelRojoFooter, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 10));

        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoPersona.png"))); // NOI18N
        imgUsuario.setToolTipText("");
        jPanel1.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        txtTipoCuenta4.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtTipoCuenta4.setText("AHORROS");
        jPanel1.add(txtTipoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 70, -1));

        txtNumeroCuenta4.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtNumeroCuenta4.setText("#5895896356");
        jPanel1.add(txtNumeroCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 80, -1));

        txtTipoCuenta2.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtTipoCuenta2.setText("Corriente");
        jPanel1.add(txtTipoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        txtTipoCuenta3.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtTipoCuenta3.setText("AHORROS");
        jPanel1.add(txtTipoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 70, -1));

        txtTipoCuenta1.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtTipoCuenta1.setText("C. Ahorros");
        jPanel1.add(txtTipoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 70, -1));

        txtSaldoCuenta4.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtSaldoCuenta4.setText("$25486.36");
        jPanel1.add(txtSaldoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 60, -1));

        txtNumeroCuenta2.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtNumeroCuenta2.setText("#5895896356");
        jPanel1.add(txtNumeroCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 80, -1));

        txtNumeroCuenta3.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtNumeroCuenta3.setText("#5895896356");
        jPanel1.add(txtNumeroCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 80, -1));

        txtNumeroCuenta1.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtNumeroCuenta1.setText("#5895896356");
        jPanel1.add(txtNumeroCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 80, -1));

        txtSaldoCuenta1.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtSaldoCuenta1.setText("$25486.36");
        jPanel1.add(txtSaldoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 60, -1));

        txtSaldoCuenta2.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtSaldoCuenta2.setText("$25486.36");
        jPanel1.add(txtSaldoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 60, -1));

        txtSaldoCuenta3.setFont(new java.awt.Font("Segoe UI Variable", 0, 11)); // NOI18N
        txtSaldoCuenta3.setText("$25486.36");
        jPanel1.add(txtSaldoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 60, -1));

        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator2.setEnabled(false);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 240, 10));

        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 240, 10));

        txtMisCuentas.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        txtMisCuentas.setText("Mis Cuentas");
        jPanel1.add(txtMisCuentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        btnTransferencia.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        btnTransferencia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));
        btnTransferencia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTransferencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnTransferenciaMousePressed(evt);
            }
        });

        imgTransferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgTransferencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoFlechasDobleDireccion.png"))); // NOI18N

        javax.swing.GroupLayout btnTransferenciaLayout = new javax.swing.GroupLayout(btnTransferencia);
        btnTransferencia.setLayout(btnTransferenciaLayout);
        btnTransferenciaLayout.setHorizontalGroup(
            btnTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        btnTransferenciaLayout.setVerticalGroup(
            btnTransferenciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgTransferencia, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        jPanel1.add(btnTransferencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 80, 70));

        bntCreditos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        bntCreditos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));
        bntCreditos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bntCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bntCreditosMousePressed(evt);
            }
        });

        imgCreditos.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        imgCreditos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoSimboloDolarMoneda.png"))); // NOI18N

        javax.swing.GroupLayout bntCreditosLayout = new javax.swing.GroupLayout(bntCreditos);
        bntCreditos.setLayout(bntCreditosLayout);
        bntCreditosLayout.setHorizontalGroup(
            bntCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCreditos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );
        bntCreditosLayout.setVerticalGroup(
            bntCreditosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgCreditos, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
        );

        jPanel1.add(bntCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 80, 70));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Créditos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 80, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Transferencia");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 80, 20));

        btnSalir.setBackground(new java.awt.Color(227, 29, 26));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setFocusPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 50, 20));

        btnInfoCuenta1.setBackground(new java.awt.Color(234, 243, 251));
        btnInfoCuenta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));

        imgFlechaAccesoCuenta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFlechaAccesoCuenta1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoFlechaDerechaContinuar.png"))); // NOI18N

        javax.swing.GroupLayout btnInfoCuenta1Layout = new javax.swing.GroupLayout(btnInfoCuenta1);
        btnInfoCuenta1.setLayout(btnInfoCuenta1Layout);
        btnInfoCuenta1Layout.setHorizontalGroup(
            btnInfoCuenta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInfoCuenta1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgFlechaAccesoCuenta1))
        );
        btnInfoCuenta1Layout.setVerticalGroup(
            btnInfoCuenta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInfoCuenta1Layout.createSequentialGroup()
                .addComponent(imgFlechaAccesoCuenta1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnInfoCuenta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 16, 16));

        btnInfoCuenta2.setBackground(new java.awt.Color(234, 243, 251));
        btnInfoCuenta2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));

        imgFlechaAccesoCuenta2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFlechaAccesoCuenta2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoFlechaDerechaContinuar.png"))); // NOI18N
        imgFlechaAccesoCuenta2.setPreferredSize(new java.awt.Dimension(16, 16));

        javax.swing.GroupLayout btnInfoCuenta2Layout = new javax.swing.GroupLayout(btnInfoCuenta2);
        btnInfoCuenta2.setLayout(btnInfoCuenta2Layout);
        btnInfoCuenta2Layout.setHorizontalGroup(
            btnInfoCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInfoCuenta2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgFlechaAccesoCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnInfoCuenta2Layout.setVerticalGroup(
            btnInfoCuenta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInfoCuenta2Layout.createSequentialGroup()
                .addComponent(imgFlechaAccesoCuenta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnInfoCuenta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 16, 16));

        btnInfoCuenta3.setBackground(new java.awt.Color(234, 243, 251));
        btnInfoCuenta3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));

        imgFlechaAccesoCuenta3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFlechaAccesoCuenta3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoFlechaDerechaContinuar.png"))); // NOI18N

        javax.swing.GroupLayout btnInfoCuenta3Layout = new javax.swing.GroupLayout(btnInfoCuenta3);
        btnInfoCuenta3.setLayout(btnInfoCuenta3Layout);
        btnInfoCuenta3Layout.setHorizontalGroup(
            btnInfoCuenta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInfoCuenta3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgFlechaAccesoCuenta3))
        );
        btnInfoCuenta3Layout.setVerticalGroup(
            btnInfoCuenta3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInfoCuenta3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgFlechaAccesoCuenta3))
        );

        jPanel1.add(btnInfoCuenta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 16, 16));

        btnInfoCuenta4.setBackground(new java.awt.Color(234, 243, 251));
        btnInfoCuenta4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 222, 222)));

        imgFlechaAccesoCuenta4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgFlechaAccesoCuenta4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoFlechaDerechaContinuar.png"))); // NOI18N

        javax.swing.GroupLayout btnInfoCuenta4Layout = new javax.swing.GroupLayout(btnInfoCuenta4);
        btnInfoCuenta4.setLayout(btnInfoCuenta4Layout);
        btnInfoCuenta4Layout.setHorizontalGroup(
            btnInfoCuenta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInfoCuenta4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(imgFlechaAccesoCuenta4))
        );
        btnInfoCuenta4Layout.setVerticalGroup(
            btnInfoCuenta4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnInfoCuenta4Layout.createSequentialGroup()
                .addComponent(imgFlechaAccesoCuenta4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(btnInfoCuenta4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTransferenciaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTransferenciaMousePressed
        Transferencias ventanaTransferencias=new Transferencias();
        ventanaTransferencias.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnTransferenciaMousePressed

    private void bntCreditosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bntCreditosMousePressed
        PagoTarjetas ventanaPagoDeServicios=new PagoTarjetas(usuario);
        ventanaPagoDeServicios.setVisible(true);
        dispose();
    }//GEN-LAST:event_bntCreditosMousePressed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal(null).setVisible(true);
            }
        });
        
        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelAzulFooter;
    private javax.swing.JPanel PanelRojoFooter;
    private javax.swing.JPanel bntCreditos;
    private javax.swing.JPanel btnInfoCuenta1;
    private javax.swing.JPanel btnInfoCuenta2;
    private javax.swing.JPanel btnInfoCuenta3;
    private javax.swing.JPanel btnInfoCuenta4;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel btnTransferencia;
    private javax.swing.JLabel imgCreditos;
    private javax.swing.JLabel imgFlechaAccesoCuenta1;
    private javax.swing.JLabel imgFlechaAccesoCuenta2;
    private javax.swing.JLabel imgFlechaAccesoCuenta3;
    private javax.swing.JLabel imgFlechaAccesoCuenta4;
    private javax.swing.JLabel imgTransferencia;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel txtHoraFecha;
    private javax.swing.JLabel txtMisCuentas;
    private javax.swing.JLabel txtNombreCliente;
    private javax.swing.JLabel txtNumeroCuenta1;
    private javax.swing.JLabel txtNumeroCuenta2;
    private javax.swing.JLabel txtNumeroCuenta3;
    private javax.swing.JLabel txtNumeroCuenta4;
    private javax.swing.JLabel txtOperaciones;
    private javax.swing.JLabel txtSaldoCuenta1;
    private javax.swing.JLabel txtSaldoCuenta2;
    private javax.swing.JLabel txtSaldoCuenta3;
    private javax.swing.JLabel txtSaldoCuenta4;
    private javax.swing.JLabel txtTipoCuenta1;
    private javax.swing.JLabel txtTipoCuenta2;
    private javax.swing.JLabel txtTipoCuenta3;
    private javax.swing.JLabel txtTipoCuenta4;
    // End of variables declaration//GEN-END:variables
}
