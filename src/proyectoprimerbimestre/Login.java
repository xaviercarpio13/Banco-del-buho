/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectoprimerbimestre;
import java.awt.Color;

public class Login extends javax.swing.JFrame {
    
    public Usuario cliente;
    
    public Login() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        imgLogoBanco = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JLabel();
        LecturaUsername = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        LecturaPassword = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        imgContrasenia = new javax.swing.JLabel();
        imgFondoAzulBoton = new javax.swing.JPanel();
        txtIngresar = new javax.swing.JLabel();
        panelVacio = new javax.swing.JPanel();
        txtFooter1 = new javax.swing.JLabel();
        txtFooter3 = new javax.swing.JLabel();
        txtFooter2 = new javax.swing.JLabel();
        imgFondoRojoBoton = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();
        lblValidacionUsuario = new javax.swing.JLabel();
        lblValidacionPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(500, 125));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imgLogoBanco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgLogoBanco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/LocoCuadrado.png"))); // NOI18N
        jPanel1.add(imgLogoBanco, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 280, -1));

        txtContrasenia.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        txtContrasenia.setText("Contraseña:");
        jPanel1.add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 30));

        LecturaUsername.setForeground(new java.awt.Color(204, 204, 204));
        LecturaUsername.setText("Ingrese su nombre de usuario");
        LecturaUsername.setBorder(null);
        LecturaUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LecturaUsernameMousePressed(evt);
            }
        });
        LecturaUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LecturaUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(LecturaUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 200, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 220, 10));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 220, 10));

        LecturaPassword.setForeground(new java.awt.Color(204, 204, 204));
        LecturaPassword.setText("**********");
        LecturaPassword.setBorder(null);
        LecturaPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LecturaPasswordMousePressed(evt);
            }
        });
        jPanel1.add(LecturaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 110, -1));

        txtUsuario.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        txtUsuario.setText("Usuario:");
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, 30));

        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoPersonaPequeño.png"))); // NOI18N
        jPanel1.add(imgUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        imgContrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosYLogos/iconoCandadoCerrado.png"))); // NOI18N
        jPanel1.add(imgContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        imgFondoAzulBoton.setBackground(new java.awt.Color(15, 34, 64));
        imgFondoAzulBoton.setForeground(new java.awt.Color(15, 34, 64));
        imgFondoAzulBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgFondoAzulBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imgFondoAzulBotonMouseClicked(evt);
            }
        });

        txtIngresar.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtIngresar.setForeground(new java.awt.Color(255, 255, 255));
        txtIngresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtIngresar.setText("INGRESAR");

        javax.swing.GroupLayout imgFondoAzulBotonLayout = new javax.swing.GroupLayout(imgFondoAzulBoton);
        imgFondoAzulBoton.setLayout(imgFondoAzulBotonLayout);
        imgFondoAzulBotonLayout.setHorizontalGroup(
            imgFondoAzulBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIngresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        imgFondoAzulBotonLayout.setVerticalGroup(
            imgFondoAzulBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(imgFondoAzulBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 220, 30));

        panelVacio.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelVacioLayout = new javax.swing.GroupLayout(panelVacio);
        panelVacio.setLayout(panelVacioLayout);
        panelVacioLayout.setHorizontalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        panelVacioLayout.setVerticalGroup(
            panelVacioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(panelVacio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 280, 10));

        txtFooter1.setFont(new java.awt.Font("Segoe UI Variable", 0, 9)); // NOI18N
        txtFooter1.setForeground(new java.awt.Color(153, 153, 153));
        txtFooter1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFooter1.setText("Escuela Politécnica Nacional, Ecuador");
        jPanel1.add(txtFooter1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 280, -1));

        txtFooter3.setFont(new java.awt.Font("Segoe UI Variable", 0, 9)); // NOI18N
        txtFooter3.setForeground(new java.awt.Color(153, 153, 153));
        txtFooter3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFooter3.setText("Grupo H: Carpio X. Guallichico R. & Martinez K.");
        jPanel1.add(txtFooter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, -1));

        txtFooter2.setFont(new java.awt.Font("Segoe UI Variable", 0, 9)); // NOI18N
        txtFooter2.setForeground(new java.awt.Color(153, 153, 153));
        txtFooter2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtFooter2.setText("Programación II, GR1COM, 2022A");
        jPanel1.add(txtFooter2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 280, -1));

        imgFondoRojoBoton.setBackground(new java.awt.Color(227, 29, 26));
        imgFondoRojoBoton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        imgFondoRojoBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imgFondoRojoBotonMousePressed(evt);
            }
        });

        txtSalir.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        txtSalir.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtSalir.setText("SALIR");
        txtSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout imgFondoRojoBotonLayout = new javax.swing.GroupLayout(imgFondoRojoBoton);
        imgFondoRojoBoton.setLayout(imgFondoRojoBotonLayout);
        imgFondoRojoBotonLayout.setHorizontalGroup(
            imgFondoRojoBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
        );
        imgFondoRojoBotonLayout.setVerticalGroup(
            imgFondoRojoBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtSalir, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(imgFondoRojoBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 220, 30));

        lblValidacionUsuario.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblValidacionUsuario.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValidacionUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 130, 30));

        lblValidacionPassword.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lblValidacionPassword.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblValidacionPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void LecturaUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LecturaUsernameMousePressed
    if(LecturaUsername.getText().equals("Ingrese su nombre de usuario")){
            LecturaUsername.setForeground(Color.black);
            LecturaUsername.setText("");
        }
        if(String.valueOf(LecturaPassword.getPassword()).isEmpty()){
            LecturaPassword.setForeground(Color.lightGray);
            LecturaPassword.setText("**********");
        }
    }//GEN-LAST:event_LecturaUsernameMousePressed

    private void LecturaPasswordMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LecturaPasswordMousePressed
        if(LecturaUsername.getText().isEmpty()){
            LecturaUsername.setForeground(Color.lightGray);
            LecturaUsername.setText("Ingrese su nombre de usuario");
        }
        if(String.valueOf(LecturaPassword.getPassword()).equals("**********")){
            LecturaPassword.setForeground(Color.black);
            LecturaPassword.setText("");
        }
    }//GEN-LAST:event_LecturaPasswordMousePressed

    private void imgFondoRojoBotonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFondoRojoBotonMousePressed
        System.exit(0);
    }//GEN-LAST:event_imgFondoRojoBotonMousePressed
  
    
    private void imgFondoAzulBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgFondoAzulBotonMouseClicked
        String password=new String(LecturaPassword.getPassword());
        boolean usuario=false;
        boolean letra=false;
        boolean numero=false;
        boolean caracterEspecial=false;
        
        if(LecturaUsername.getText().equals("Ingrese su nombre de usuario")||
                LecturaUsername.getText().isEmpty()){
            lblValidacionUsuario.setText("* Campo obligatorio");
        } else{
            usuario=true;
            lblValidacionUsuario.setText("");
        }
        
        if(password.equals("**********")||password.isEmpty()){
            lblValidacionPassword.setText("* Campo obligatorio");
        } else{
            if(password.length()<8){
            lblValidacionPassword.setText("* Digite mínimo 8 caracteres");
            } else{
                for(int i=0;i<password.length();i++){
                    if(Character.isDigit(password.charAt(i))){
                        numero=true;
                    }
                    if(Character.isAlphabetic(password.charAt(i))){
                        letra=true;
                    }
                    if(!(Character.isAlphabetic(password.charAt(i))||Character.isDigit(password.charAt(i)))){
                        caracterEspecial=true;
                    }
                }
                if(caracterEspecial){
                    lblValidacionPassword.setText("* Evite usar caracteres especiales");
                }
                else if(!numero||!letra){
                    lblValidacionPassword.setText("* Use al menos una letra y un número");
                } else{
                    lblValidacionPassword.setText("");
                }
            }
        }
        if(numero&&letra&&usuario&&(!caracterEspecial)){
            cliente = new Usuario();
            PantallaPrincipal menuPrincipal=new PantallaPrincipal(cliente);
            menuPrincipal.setVisible(true);
            dispose();
        } 
    }//GEN-LAST:event_imgFondoAzulBotonMouseClicked

    private void LecturaUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LecturaUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LecturaUsernameActionPerformed

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }
    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField LecturaPassword;
    private javax.swing.JTextField LecturaUsername;
    private javax.swing.JLabel imgContrasenia;
    private javax.swing.JPanel imgFondoAzulBoton;
    private javax.swing.JPanel imgFondoRojoBoton;
    private javax.swing.JLabel imgLogoBanco;
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblValidacionPassword;
    private javax.swing.JLabel lblValidacionUsuario;
    private javax.swing.JPanel panelVacio;
    private javax.swing.JLabel txtContrasenia;
    private javax.swing.JLabel txtFooter1;
    private javax.swing.JLabel txtFooter2;
    private javax.swing.JLabel txtFooter3;
    private javax.swing.JLabel txtIngresar;
    private javax.swing.JLabel txtSalir;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables
}
