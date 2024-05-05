package sesion01;


public class Principal extends javax.swing.JFrame {
    //Como atributo , vamos a crear un objeto de la clase empleado
    Empleado empleado;
    public Principal() {
        initComponents();
        //57.56
        cbxArea.addItem("Sistemas");
        cbxArea.addItem("Marketing");
        cbxArea.addItem("Administración");
        cbxTipoSeguro.addItem("AFP");
        cbxTipoSeguro.addItem("ONP");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCódigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        cbxTipoSeguro = new javax.swing.JComboBox<>();
        txtSueldoBase = new javax.swing.JTextField();
        txtHorasExtras = new javax.swing.JTextField();
        cbxArea = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSalida = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridLayout(2, 3));

        txtCódigo.setBorder(javax.swing.BorderFactory.createTitledBorder("Código "));
        jPanel1.add(txtCódigo);

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombre\n"));
        jPanel1.add(txtNombre);

        cbxTipoSeguro.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo Seguro"));
        jPanel1.add(cbxTipoSeguro);

        txtSueldoBase.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldo Base "));
        txtSueldoBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoBaseActionPerformed(evt);
            }
        });
        jPanel1.add(txtSueldoBase);

        txtHorasExtras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Extras\n"));
        jPanel1.add(txtHorasExtras);

        cbxArea.setBorder(javax.swing.BorderFactory.createTitledBorder("Área"));
        cbxArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAreaActionPerformed(evt);
            }
        });
        jPanel1.add(cbxArea);

        jButton1.setText("Crear Objeto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jButton2.setText("MostrarInfo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);

        jButton3.setText("Limpiar");
        jPanel2.add(jButton3);

        jButton4.setText("Salir");
        jPanel2.add(jButton4);

        jPanel3.setLayout(new javax.swing.BoxLayout(jPanel3, javax.swing.BoxLayout.LINE_AXIS));

        txaSalida.setColumns(20);
        txaSalida.setRows(5);
        jScrollPane1.setViewportView(txaSalida);

        jPanel3.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSueldoBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoBaseActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Boton para mostrar info
        //setText te limpia y append te agrega 
        txaSalida.setText("Codigo:\t:\t"+empleado.codigo+"\n"); //Ese ultimo es un salto de linea xd 
        txaSalida.append("Nombre\t:\t"+empleado.nombre+"\n");
        txaSalida.append("Monto Descuento\t:\t"+empleado.montoDescuentoTotal()+ "\n"); //Aca agregue el metodo 
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbxAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxAreaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Capturar el valor y guardarlo en la variable cod 
        //Cuando ingrese los datos se van a ir a todas las variables de aca 
        //Ahora podre usar los constructores
        String cod = txtCódigo.getText();
        String nom = txtNombre.getText();
        String area = cbxArea.getSelectedItem().toString();
        String tipo_seg = cbxTipoSeguro.getSelectedItem().toString();
        //Guarda la variable tipo double en el sb XD 
        double sb = Double.parseDouble(txtSueldoBase.getText());
        double he = Double.parseDouble(txtHorasExtras.getText());
        //Instanciando el objeto  : Profesor nombre_objeto  new Profesor , llamo al constructor 
        empleado = new Empleado(cod, nom, tipo_seg, area, sb, he);//Aca debo poner el de todos los atributos , aca sigo teniendo el problema que no hace el llamado xd 
        //Mostrar informacion 
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxArea;
    private javax.swing.JComboBox<String> cbxTipoSeguro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txaSalida;
    private javax.swing.JTextField txtCódigo;
    private javax.swing.JTextField txtHorasExtras;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtSueldoBase;
    // End of variables declaration//GEN-END:variables
}
