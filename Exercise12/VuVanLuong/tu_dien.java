/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colection_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author TLC
 */
public class tu_dien extends javax.swing.JFrame {

    /**
     * Creates new form tu_dien
     */
    HashMap<String, String> map = new HashMap<String, String>();
    public static String tu_dien = "";

    public void ghifile(HashMap<String, String> map) {
        File file = new File("E:\\thuvienlaptrinh\\dictionary.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String d : map.keySet()) {
                bw.write(d + ",");
                bw.write(map.get(d) + "\n");
            }

            bw.close();
            fw.close();
//            bw.write(map);
        } catch (IOException ex) {
            Logger.getLogger(tu_dien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void docFile(HashMap<String, String> map) {
        File file = new File("E:\\thuvienlaptrinh\\dictionary.txt");
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            String data[];
            try {
                while ((line = br.readLine()) != null) {
                    System.out.println("line: " + line);
                    data = line.split(",");
                    map.put(data[0], data[1]);

                }
                br.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(tu_dien.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(tu_dien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public tu_dien() {
        initComponents();
        msg_show.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt_tratu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        msg_show = new javax.swing.JTextArea();
        tf_tu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        list_tu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt_tratu.setText("Tra tu");
        bt_tratu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tratuActionPerformed(evt);
            }
        });

        msg_show.setColumns(20);
        msg_show.setRows(5);
        jScrollPane1.setViewportView(msg_show);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Dictionnary");

        jButton1.setText("Clean");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xóa Khỏi từ Điển");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        list_tu.setText("Danh sách từ");
        list_tu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_tuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(37, 37, 37)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(list_tu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(bt_tratu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(tf_tu, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(tf_tu, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bt_tratu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(list_tu))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        msg_show.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_tratuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tratuActionPerformed
        if (tf_tu.getText().isEmpty()) {

            
            JOptionPane.showMessageDialog(null, "Nhập từ cần tra");
            tf_tu.requestFocus();
            return;
        } else {
           docFile(map);
            msg_show.setText("");
            String tu = tf_tu.getText();
            tu_dien = tf_tu.getText();
            if (map.containsKey(tu)) {
                msg_show.setText(" " + tu + ": " + map.get(tu));
            } else {
                int click = JOptionPane.showConfirmDialog(null, "Không có trong từ điển. Bạn có muốn thếm từ không?");
                if (click == JOptionPane.YES_OPTION) {
                    new ThemTu().setVisible(true);
                }
                if (click == JOptionPane.NO_OPTION) {
                    tf_tu.setText("");
                }
                if (click == JOptionPane.CANCEL_OPTION) {
                    tf_tu.setText("");
                }

            } 
        }
    }//GEN-LAST:event_bt_tratuActionPerformed
    public static void ghiLai(HashMap<String, String> map) {
        File file = new File("E:\\thuvienlaptrinh\\dictionary.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String d : map.keySet()) {
                bw.write(d + ",");
                bw.write(map.get(d) + "\n");
            }

            bw.close();
            fw.close();
//            bw.write(map);
        } catch (IOException ex) {
            Logger.getLogger(colection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int click = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa khỏi từ điển ?", "Question", JOptionPane.YES_NO_OPTION);
        if (click == JOptionPane.YES_OPTION) {

            map.remove(tf_tu.getText());
            tf_tu.setText("");
            msg_show.setText("");
            ghiLai(map);
            JOptionPane.showMessageDialog(null, "xóa thành công");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void list_tuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_tuActionPerformed
        JOptionPane.showMessageDialog(null, map);
    }//GEN-LAST:event_list_tuActionPerformed

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
            java.util.logging.Logger.getLogger(tu_dien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tu_dien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tu_dien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tu_dien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tu_dien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_tratu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton list_tu;
    private javax.swing.JTextArea msg_show;
    private javax.swing.JTextField tf_tu;
    // End of variables declaration//GEN-END:variables

    public JTextField getTf_tu() {
        return tf_tu;
    }

    public void setTf_tu(JTextField tf_tu) {
        this.tf_tu = tf_tu;
    }
}