/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise6;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ex4 extends javax.swing.JFrame {

    DefaultListModel model = new DefaultListModel();
    int[] in;

    /**
     * Creates new form ex4
     */
    public ex4() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(rootPaneCheckingEnabled);
    }

    private boolean isPrime(int n) {
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
        jPanel1 = new javax.swing.JPanel();
        btSoChan = new javax.swing.JButton();
        btSoLe = new javax.swing.JButton();
        btSoNguyenTo = new javax.swing.JButton();
        btBoTo = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btTong = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btNhap = new javax.swing.JButton();
        tfNhap = new javax.swing.JTextField();
        cbSoAm = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXERCISE4");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)), "Chọn thao tác"));

        btSoChan.setText("Tô đen số chẵn");
        btSoChan.setToolTipText("");
        btSoChan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSoChanActionPerformed(evt);
            }
        });

        btSoLe.setText("Tô đen số lẻ");
        btSoLe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSoLeActionPerformed(evt);
            }
        });

        btSoNguyenTo.setText("Tô đen số nguyên tố");
        btSoNguyenTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSoNguyenToActionPerformed(evt);
            }
        });

        btBoTo.setText("Bỏ tô đen");
        btBoTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBoToActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa các giá trị tô đen");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btTong.setText("Tổng giá trị");
        btTong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btSoChan)
                    .addComponent(btSoLe)
                    .addComponent(btSoNguyenTo)
                    .addComponent(btBoTo)
                    .addComponent(btXoa)
                    .addComponent(btTong))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btBoTo, btSoChan, btSoLe, btSoNguyenTo, btTong, btXoa});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btSoChan, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSoLe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSoNguyenTo)
                .addGap(18, 18, 18)
                .addComponent(btBoTo)
                .addGap(18, 18, 18)
                .addComponent(btXoa)
                .addGap(18, 18, 18)
                .addComponent(btTong)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btBoTo, btSoChan, btSoLe, btSoNguyenTo, btTong, btXoa});

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)));

        jButton7.setText("Đóng chương trình");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(234, 234, 234))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 0, 0)), "Nhập thông tin"));

        btNhap.setText("Nhập");
        btNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNhapActionPerformed(evt);
            }
        });

        cbSoAm.setText("Cho nhập số âm");

        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btNhap)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNhap)
                .addGap(18, 18, 18)
                .addComponent(cbSoAm))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNhap)
                    .addComponent(tfNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSoAm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel1, jPanel2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "Có muốn đóng chương trình không", "",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            if(JOptionPane.showConfirmDialog(rootPane, "Chắc chưa", "", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                System.exit(0);
            }{
            }
            
            //System.exit(0);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void btNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNhapActionPerformed
        int i;
        if (!cbSoAm.isSelected()) {
            try {
                i = Integer.parseInt(tfNhap.getText().toString());
                if (i >= 0) {
                    model.addElement(i);
                    jList1.setModel(model);
                    tfNhap.setText("");
                } else {
                    tfNhap.setText("");
                    JOptionPane.showMessageDialog(rootPane, "Nhập số nguyên lớn hơn 0 ");
                    tfNhap.requestFocus();
                }
            } catch (Exception e) {
                tfNhap.setText("");
                JOptionPane.showMessageDialog(rootPane, "Nhập số nguyên");
                tfNhap.requestFocus();
            }
        } else {
            try {
                i = Integer.parseInt(tfNhap.getText().toString());
                model.addElement(i);
                jList1.setModel(model);
                tfNhap.setText("");
            } catch (Exception e) {
                tfNhap.setText("");
                JOptionPane.showMessageDialog(rootPane, "Nhập số nguyên");
                tfNhap.requestFocus();
            }
        }

    }//GEN-LAST:event_btNhapActionPerformed

    private void btSoChanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSoChanActionPerformed
        ArrayList al = new ArrayList();
        int j = 0;
        for (int i = 0; i < model.size(); i++) {
            if ((Integer.parseInt(model.get(i).toString()) % 2) == 0) {
                al.add(i);
            }
        }
        in = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            in[i] = (int) al.get(i);
        }
        jList1.setSelectedIndices(in);
    }//GEN-LAST:event_btSoChanActionPerformed

    private void btSoLeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSoLeActionPerformed
        ArrayList al = new ArrayList();
        int j = 0;
        for (int i = 0; i < model.size(); i++) {
            if ((Integer.parseInt(model.get(i).toString()) % 2) != 0) {
                al.add(i);
            }
        }
        in = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            in[i] = (int) al.get(i);
        }
        jList1.setSelectedIndices(in);
    }//GEN-LAST:event_btSoLeActionPerformed

    private void btSoNguyenToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSoNguyenToActionPerformed
        ArrayList al = new ArrayList();
        int j = 0;
        for (int i = 0; i < model.size(); i++) {
            if (Integer.parseInt(model.get(i).toString()) == 1
                    || Integer.parseInt(model.get(i).toString()) == 2) {
                al.add(i);
            } else if (isPrime((int) model.get(i))) {
                al.add(i);
            }
        }
        in = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            in[i] = (int) al.get(i);
        }
        jList1.setSelectedIndices(in);
    }//GEN-LAST:event_btSoNguyenToActionPerformed

    private void btBoToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBoToActionPerformed
        jList1.clearSelection();
    }//GEN-LAST:event_btBoToActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        for (int i = 0; i < model.size(); i++) {
            if (!jList1.isSelectionEmpty()) {
                int index = jList1.getSelectedIndex();
                model.remove(index);
            }
        }
        jList1.setModel(model);
    }//GEN-LAST:event_btXoaActionPerformed

    private void btTongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTongActionPerformed
        int k = 0;
        for (int i = 0; i < model.size(); i++) {
            k += Integer.parseInt(model.get(i).toString());
        }
        JOptionPane.showMessageDialog(rootPane, k);
    }//GEN-LAST:event_btTongActionPerformed

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
            java.util.logging.Logger.getLogger(ex4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ex4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ex4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ex4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ex4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBoTo;
    private javax.swing.JButton btNhap;
    private javax.swing.JButton btSoChan;
    private javax.swing.JButton btSoLe;
    private javax.swing.JButton btSoNguyenTo;
    private javax.swing.JButton btTong;
    private javax.swing.JButton btXoa;
    private javax.swing.JCheckBox cbSoAm;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tfNhap;
    // End of variables declaration//GEN-END:variables
}
