/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USUARIO
 */
public class GuiSocio extends javax.swing.JInternalFrame {

    DefaultTableModel dtm=new DefaultTableModel();
    
    int xMouse, yMouse;
    
    TableRowSorter trs;

    public GuiSocio() {
        initComponents();
        String[] titulo=new String[]{"Numero Socio","Nombre Socio","Dirrecion"};
        dtm.setColumnIdentifiers(titulo);
        tblDatos.setModel(dtm);
    }

void agregar(){
        dtm.addRow(new Object[]{txtNumeroSocio.getText(),txtNombreSocio.getText(),txtDirrecion.getText()});
    }
    
    void eliminar(){
        int fila=tblDatos.getSelectedRow();
        dtm.removeRow(fila);
    }
    
    void actualizar(){
        int fila=tblDatos.getSelectedRow();
        dtm.setValueAt(txtNumeroSocio.getText(), fila, 0);
        dtm.setValueAt(txtNombreSocio.getText(), fila, 1);
        dtm.setValueAt(txtDirrecion.getText(), fila, 2);
    }
    void limpiar(){
        txtNumeroSocio.setText("");
        txtNombreSocio.setText("");
        txtDirrecion.setText("");
    }
    
    
    void limpiarTabla(){
        int fila=dtm.getRowCount();
        for (int i = 0; i < fila; i++) {
            dtm.removeRow(0);
            
        }
    }
    
    void grabarArchivoTabla(){
        try {
            FileOutputStream fos=new FileOutputStream("Socio2.txt",true);
            DataOutputStream dos=new DataOutputStream(fos);
            for (int i = 0; i < tblDatos.getRowCount(); i++) {
                dos.writeUTF(dtm.getValueAt(i, 0).toString());
                dos.writeUTF(dtm.getValueAt(i, 1).toString());
                dos.writeUTF(dtm.getValueAt(i, 2).toString());
            }
            JOptionPane.showMessageDialog(null,"Archivo Grabado");    
        } catch (Exception e) {
        }
        limpiarTabla();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroSocio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDirrecion = new javax.swing.JTextField();
        txtNombreSocio = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnGrabarArchivo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Socios");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Socios");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Numero");

        txtNumeroSocio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNumeroSocio.setBorder(null);
        txtNumeroSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroSocioMousePressed(evt);
            }
        });
        txtNumeroSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroSocioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel4.setText("Direccion");

        txtDirrecion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtDirrecion.setBorder(null);
        txtDirrecion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDirrecionMousePressed(evt);
            }
        });
        txtDirrecion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirrecionActionPerformed(evt);
            }
        });

        txtNombreSocio.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        txtNombreSocio.setBorder(null);
        txtNombreSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreSocioMousePressed(evt);
            }
        });
        txtNombreSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreSocioActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/icons8-guardar-48.png"))); // NOI18N
        btnRegistrar.setText("Resgistrar Socio");
        btnRegistrar.setToolTipText("");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/icons8-eliminar-48.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/icons8-editar-archivo-48.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnGrabarArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/book-open-page-variant.png"))); // NOI18N
        btnGrabarArchivo.setText("Grabar Archivo");
        btnGrabarArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarArchivoActionPerformed(evt);
            }
        });

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGrabarArchivo)
                            .addComponent(btnModificar)
                            .addComponent(btnRegistrar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabarArchivo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroSocioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroSocioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroSocioMousePressed

    private void txtNumeroSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroSocioActionPerformed

    private void txtDirrecionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDirrecionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirrecionMousePressed

    private void txtDirrecionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirrecionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirrecionActionPerformed

    private void txtNombreSocioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreSocioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSocioMousePressed

    private void txtNombreSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreSocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreSocioActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
       agregar();
        limpiar();
        txtNumeroSocio.requestFocus();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        actualizar();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnGrabarArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarArchivoActionPerformed
        // TODO add your handling code here:
    grabarArchivoTabla();
    }//GEN-LAST:event_btnGrabarArchivoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabarArchivo;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtDirrecion;
    private javax.swing.JTextField txtNombreSocio;
    private javax.swing.JTextField txtNumeroSocio;
    // End of variables declaration//GEN-END:variables
}
