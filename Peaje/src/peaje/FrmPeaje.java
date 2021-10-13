package peaje;

import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FrmPeaje extends javax.swing.JFrame {

    ArrayList<Peaje> Peaje;
    String placa,hora,tipoV;
    double valorAc=0,valor;
    
    public FrmPeaje() {
        initComponents();
        
        txtPlaca.setText("");
        lbRecaudo.setText("Total Recaudado: 0");
        
        Peaje = new ArrayList();
    }
    
    
    
    public void guardarDatos(){
        
        placa = txtPlaca.getText();
        hora = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)+":"+ Calendar.getInstance().get(Calendar.MINUTE);
        if(rbMoto.isSelected()){
            tipoV = "MOTO";
            valor = 5000;
            valorAc += 5000;
        }else if(rbAutoM.isSelected()){
            tipoV = "AutoMovil";
            valor = 11000;
            valorAc += 11000;
        }else if(rbBus.isSelected()){
            tipoV = "Bus";
            valor = 38000;
            valorAc += 38000;
        }else if(rbVehiC.isSelected()){
            tipoV = "Vehiculo de carga";
            valor=64000;
            valorAc += 64000;
        }
        JOptionPane.showMessageDialog(rootPane, "Datos Ingresados");
        lbRecaudo.setText("Total Recaudado: " + valorAc);
    }
    
    public void mostrarDatos(){
        for(int i=0; i<Peaje.size(); i++){
            System.out.println(Peaje.get(i).getPlaca()+" " +" " + Peaje.get(i).getHora()+ " "  + " " +  Peaje.get(i).getValor() + " " + Peaje.get(i).getTipoV());
        }
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] nombreColumnas = {"Placa", "Hora", "Valor", "Tipo"};
        tableModel.setColumnIdentifiers(nombreColumnas);
        for(int i = 0; i<Peaje.size(); i++){
            tableModel.addRow(new Object[] {Peaje.get(i).getPlaca(),Peaje.get(i).getHora(),Peaje.get(i).getValor(), Peaje.get(i).getTipoV()});
        }
        
        TableMostrar.setModel(tableModel);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        rbMoto = new javax.swing.JRadioButton();
        rbAutoM = new javax.swing.JRadioButton();
        rbBus = new javax.swing.JRadioButton();
        rbVehiC = new javax.swing.JRadioButton();
        lbRecaudo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableMostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PEAJE");

        jLabel2.setText("Placa del vehiculo");

        txtPlaca.setText("jTextField1");

        buttonGroup1.add(rbMoto);
        rbMoto.setText("MOTO");

        buttonGroup1.add(rbAutoM);
        rbAutoM.setText("AUTOMOVIL");

        buttonGroup1.add(rbBus);
        rbBus.setText("BUS");

        buttonGroup1.add(rbVehiC);
        rbVehiC.setText("VEHICULO DE CARGA");

        lbRecaudo.setText("jLabel3");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        TableMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableMostrar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbMoto))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbAutoM))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbBus))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbVehiC)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbRecaudo)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(rbMoto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbAutoM)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbBus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbVehiC))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(lbRecaudo))
                .addGap(135, 135, 135))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        guardarDatos();
        
        Peaje.add(new Peaje(placa,hora,valor,tipoV));
        
        mostrarDatos();
    }//GEN-LAST:event_btnGuardarActionPerformed

    
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
            java.util.logging.Logger.getLogger(FrmPeaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPeaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPeaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPeaje.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPeaje().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableMostrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbRecaudo;
    private javax.swing.JRadioButton rbAutoM;
    private javax.swing.JRadioButton rbBus;
    private javax.swing.JRadioButton rbMoto;
    private javax.swing.JRadioButton rbVehiC;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
