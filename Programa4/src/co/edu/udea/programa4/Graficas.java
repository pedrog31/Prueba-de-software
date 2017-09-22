/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.programa4;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class Graficas extends javax.swing.JFrame {
    ListaLigada columnaX = null, columnaY = null, coeficiente = null;
    DefaultTableModel modelo;
    String nombreX, nombreY;    
    double valueVerySmall, valueSmall, valueMedium, valueLarge, valueVeryLarge;
    Calculos calculos = new Calculos();
    /**
     * Creates new form Graficas
     */
    public Graficas() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel();
        modelo.addColumn("");
        modelo.addColumn("");
        modelo.addColumn("");
        this.datos.setModel(modelo);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelYk = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        textSmall = new javax.swing.JTextField();
        textMedium = new javax.swing.JTextField();
        textLarge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textVerySmall = new javax.swing.JTextField();
        textVeryLarge = new javax.swing.JTextField();
        labelResultYk = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCargarDatos = new javax.swing.JButton();
        btnCalcularDatos = new javax.swing.JButton();

        labelYk.setText("X(k)");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programa4");
        setBackground(new java.awt.Color(207, 207, 207));

        jDesktopPane1.setBackground(new java.awt.Color(204, 204, 255));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        datos.setBackground(new java.awt.Color(209, 232, 245));
        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(datos);

        textSmall.setEditable(false);
        textSmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSmallActionPerformed(evt);
            }
        });

        textMedium.setEditable(false);
        textMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMediumActionPerformed(evt);
            }
        });

        textLarge.setEditable(false);
        textLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLargeActionPerformed(evt);
            }
        });

        jLabel5.setText("Medium");

        jLabel3.setText("Very Small");

        jLabel4.setText("Small");

        textVerySmall.setEditable(false);
        textVerySmall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVerySmallActionPerformed(evt);
            }
        });

        textVeryLarge.setEditable(false);
        textVeryLarge.setText(" ");
        textVeryLarge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textVeryLargeActionPerformed(evt);
            }
        });

        labelResultYk.setText("Very Large");

        jLabel6.setText("Large");

        jLabel7.setText("Relative Range Size");

        btnCargarDatos.setBackground(new java.awt.Color(0, 153, 204));
        btnCargarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarDatos.setText("Cargar datos");
        btnCargarDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        btnCalcularDatos.setBackground(new java.awt.Color(0, 153, 204));
        btnCalcularDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcularDatos.setText("Calcular ");
        btnCalcularDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCalcularDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(btnCalcularDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(86, 86, 86))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(textVerySmall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(textSmall, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textMedium, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(textLarge, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textVeryLarge, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(labelResultYk)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(btnCargarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCalcularDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(labelResultYk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textVerySmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textSmall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textMedium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textLarge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textVeryLarge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularDatosActionPerformed
        if(columnaX!=null && columnaY!=null){

            valueVerySmall = calculos.getVs();
            valueSmall = calculos.getSmall();
            valueMedium = calculos.getMedium();
            valueLarge = calculos.getLarge();
            valueVeryLarge = calculos.getVl();

            valueVerySmall = Calculos.roundDouble(valueVerySmall, 4);
            valueSmall = Calculos.roundDouble(valueSmall, 4);
            valueMedium = Calculos.roundDouble(valueMedium, 4);
            valueLarge = Calculos.roundDouble(valueLarge, 4);
            valueVeryLarge = Calculos.roundDouble(valueVeryLarge, 4);

            this.textVerySmall.setText(String.valueOf(valueVerySmall));
            this.textSmall.setText(String.valueOf(valueSmall));
            this.textMedium.setText(String.valueOf(valueMedium));
            this.textLarge.setText(String.valueOf(valueLarge));
            this.textVeryLarge.setText(String.valueOf(valueVeryLarge));
        }
    }//GEN-LAST:event_btnCalcularDatosActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        try {
            obtenerDatos();
        } catch (IOException ex) {
            Logger.getLogger(Graficas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void textSmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSmallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSmallActionPerformed

    private void textMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMediumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textMediumActionPerformed

    private void textLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLargeActionPerformed

    private void textVerySmallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVerySmallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVerySmallActionPerformed

    private void textVeryLargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textVeryLargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textVeryLargeActionPerformed

    public void obtenerDatos() throws IOException{
        GestionDatos g = new GestionDatos();
        columnaX = g.leerDatos(",");
        nombreX = g.getChoosenFileName();
        columnaY = g.leerDatos(",");
        nombreY = g.getChoosenFileName();
        if (columnaX.getCantidadNodos() != columnaY.getCantidadNodos()) {
            JOptionPane.showMessageDialog(null, "Las columnas deben tener el mismo tamaño", "Error al abrir los archivos", JOptionPane.ERROR_MESSAGE);
            columnaX = null;
            columnaY = null;
            nombreX = "";
            nombreY = "";
            return;
        }
        
        coeficiente = calculos.calcularDatos(columnaX, columnaY);
        
        Nodo p,q,r;
        p = columnaX.getPrimero();
        q = columnaY.getPrimero();
        r = coeficiente.getPrimero();
        String[] datosXYZ = new String[(int)columnaX.getCabeza().getDato()];
        while(p!=null || q!=null){
            datosXYZ[0] = String.valueOf(p.getDato());
            datosXYZ[1] = String.valueOf(q.getDato());
            datosXYZ[2] = String.valueOf(r.getDato());
            modelo.addRow(datosXYZ);
            p = p.getSiguiente();
            q = q.getSiguiente();
            r = r.getSiguiente();
        }
        
        JTableHeader th = this.datos.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();
        TableColumn tc = tcm.getColumn(0);
        tc.setHeaderValue(nombreX);
        System.out.println(nombreX);
        tc = tcm.getColumn(1);
        tc.setHeaderValue(nombreY);
        System.out.println(nombreY);
        tc = tcm.getColumn(2);
        tc.setHeaderValue("Coeficiente");
        System.out.println("Coeficiente");
        
        th.repaint(th.getHeaderRect(0));
        th.repaint(th.getHeaderRect(1));
        th.repaint(th.getHeaderRect(2));
        
    }
    
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
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Graficas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Graficas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcularDatos;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JTable datos;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelResultYk;
    private javax.swing.JLabel labelYk;
    private javax.swing.JTextField textLarge;
    private javax.swing.JTextField textMedium;
    private javax.swing.JTextField textSmall;
    private javax.swing.JTextField textVeryLarge;
    private javax.swing.JTextField textVerySmall;
    // End of variables declaration//GEN-END:variables
}
