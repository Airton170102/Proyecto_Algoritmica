
package Vista;


public class frmPrincipal extends javax.swing.JFrame {

    
    public frmPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panFondo = new javax.swing.JPanel();
        panTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblNombreUsuario = new javax.swing.JLabel();
        panControles = new javax.swing.JPanel();
        btnCandidatos = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnSeleccion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panFondo.setBackground(new java.awt.Color(255, 204, 0));

        panTitulo.setBackground(new java.awt.Color(255, 204, 0));

        lblTitulo.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 18)); // NOI18N
        lblTitulo.setText("SISTEMA RR.HH");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgRRHH.png"))); // NOI18N

        btnSalir.setBackground(new java.awt.Color(255, 204, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imgSalir.png"))); // NOI18N

        lblNombreUsuario.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        lblNombreUsuario.setText("USUARIO: JORGE ZAVALETA");

        javax.swing.GroupLayout panTituloLayout = new javax.swing.GroupLayout(panTitulo);
        panTitulo.setLayout(panTituloLayout);
        panTituloLayout.setHorizontalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panTituloLayout.createSequentialGroup()
                .addGroup(panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panTituloLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblImagen)
                        .addGap(137, 137, 137)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panTituloLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombreUsuario)
                            .addComponent(lblTitulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panTituloLayout.setVerticalGroup(
            panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panTituloLayout.createSequentialGroup()
                .addGroup(panTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panTituloLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagen)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombreUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panControles.setBackground(new java.awt.Color(0, 0, 0));

        btnCandidatos.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        btnCandidatos.setText("CANDIDATOS");

        btnEmpleados.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        btnEmpleados.setText("EMPLEADOS");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });

        btnSeleccion.setFont(new java.awt.Font("Rockwell Extra Bold", 0, 12)); // NOI18N
        btnSeleccion.setText("PROCESO DE SELECCIÓN");

        javax.swing.GroupLayout panControlesLayout = new javax.swing.GroupLayout(panControles);
        panControles.setLayout(panControlesLayout);
        panControlesLayout.setHorizontalGroup(
            panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panControlesLayout.createSequentialGroup()
                .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panControlesLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnCandidatos)
                        .addGap(65, 65, 65)
                        .addComponent(btnEmpleados))
                    .addGroup(panControlesLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnSeleccion)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panControlesLayout.setVerticalGroup(
            panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panControlesLayout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(panControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCandidatos)
                    .addComponent(btnEmpleados))
                .addGap(31, 31, 31)
                .addComponent(btnSeleccion)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout panFondoLayout = new javax.swing.GroupLayout(panFondo);
        panFondo.setLayout(panFondoLayout);
        panFondoLayout.setHorizontalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panFondoLayout.setVerticalGroup(
            panFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnCandidatos;
    public static javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnSalir;
    public static javax.swing.JButton btnSeleccion;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panControles;
    private javax.swing.JPanel panFondo;
    private javax.swing.JPanel panTitulo;
    // End of variables declaration//GEN-END:variables
}
