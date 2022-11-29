/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import DomainModels.Phong;
import Service.IServicePhong;
import Service.impl.ServicePhongImpl;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ViewPhong extends javax.swing.JFrame {

    ButtonGroup bg;
    DefaultTableModel dtm;
    IServicePhong servicePhong = new ServicePhongImpl();

    /**
     * Creates new form ViewPhong
     */
    public ViewPhong() {
        initComponents();
        rdPhong();
        loadTablePhong(servicePhong.getAllData());
    }

    void rdPhong() {
        bg = new ButtonGroup();
        bg.add(rdoCo);
        bg.add(rdoKhong);
    }

    public void loadTablePhong(List<Phong> list) {
        dtm = (DefaultTableModel) tbPhong.getModel();
        dtm.setRowCount(0);
        for (Phong phong : list) {
            dtm.addRow(new Object[]{
                phong.getId(),
                phong.getMa(),
                phong.getTen(),
                phong.getGia(),
                phong.getDienTich(),
                phong.getNgayTao(),
                phong.getNgaySua(),
                phong.htTrangThai(),});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jdNgayTao = new com.toedter.calendar.JDateChooser();
        jdNgaySua = new com.toedter.calendar.JDateChooser();
        txtMa = new javax.swing.JTextField();
        txtDienTich = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        rdoCo = new javax.swing.JRadioButton();
        rdoKhong = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPhong = new javax.swing.JTable();
        btThem = new javax.swing.JButton();
        btSua = new javax.swing.JButton();
        btXoa = new javax.swing.JButton();
        btBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mã");

        jLabel2.setText("Tên");

        jLabel3.setText("Giá");

        jLabel4.setText("Diện tích");

        jLabel5.setText("Ngày tạo");

        jLabel6.setText("Ngày sửa");

        jLabel7.setText("Trạng thái");

        buttonGroup1.add(rdoCo);
        rdoCo.setText("Có");

        buttonGroup1.add(rdoKhong);
        rdoKhong.setText("Không");

        tbPhong.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Mã", "Tên", "Giá", "Diện tích", "Ngày tạo", "Ngày sửa", "Trạng thái"
            }
        ));
        tbPhong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPhongMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbPhong);

        btThem.setText("Thêm");
        btThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btThemActionPerformed(evt);
            }
        });

        btSua.setText("Sửa");
        btSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSuaActionPerformed(evt);
            }
        });

        btXoa.setText("Xóa");
        btXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXoaActionPerformed(evt);
            }
        });

        btBack.setText("Back");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jdNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdoCo)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoKhong)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(btBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDienTich, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(txtMa, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTen, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btThem, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addComponent(btXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDienTich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jdNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(52, 52, 52)
                                .addComponent(jLabel6))
                            .addComponent(jdNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(rdoCo)
                            .addComponent(rdoKhong))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btThem)
                            .addComponent(btSua))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btXoa)
                            .addComponent(btBack))))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btThemActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
        } else if (txtTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên được để trống");
        } else if (txtGia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá không được để trống");
        } else if (txtDienTich.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Diện tích không được để trống");
        } else if (jdNgayTao.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (!rdoCo.isSelected() && !rdoKhong.isSelected()) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
        } else if (txtTen.getText().matches("^[a-z A-Z]+") == false) {
            JOptionPane.showMessageDialog(this, "Tên phải là chữ");
        } else if (txtGia.getText().matches("^[0-9]+") == false || Double.parseDouble(txtGia.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Giá phải là số và >0 ");
        } else if (txtDienTich.getText().matches("^[0-9]+") == false || Double.parseDouble(txtGia.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Diện tích phải là số và >0 ");
        } else if (servicePhong.findByIdPhong(txtMa.getText()).equals(txtMa.getText())) {
            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
        } else {
            Phong p = new Phong();
            p.setMa(txtMa.getText());
            p.setTen(txtTen.getText());
            p.setGia(Double.parseDouble(txtGia.getText()));
            p.setDienTich(Float.parseFloat(txtDienTich.getText()));
            p.setNgayTao(jdNgayTao.getDate());
            p.setNgaySua(jdNgaySua.getDate());
            if (rdoCo.isSelected()) {
                p.setTrangThai(1);
            } else {
                p.setTrangThai(0);
            }
            servicePhong.save(p);
            loadTablePhong(servicePhong.getAllData());
        }
    }//GEN-LAST:event_btThemActionPerformed

    private void btSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSuaActionPerformed
        // TODO add your handling code here:
        if (txtMa.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã không được để trống");
        } else if (txtTen.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên được để trống");
        } else if (txtGia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá không được để trống");
        } else if (txtDienTich.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Diện tích không được để trống");
        } else if (jdNgayTao.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày tạo không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (jdNgaySua.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Ngày sửa không được để trống");
        } else if (!rdoCo.isSelected() && !rdoKhong.isSelected()) {
            JOptionPane.showMessageDialog(this, "Trạng thái không được để trống");
        } else if (txtTen.getText().matches("^[a-z A-Z]+") == false) {
            JOptionPane.showMessageDialog(this, "Tên phải là chữ");
        } else if (txtGia.getText().matches("^[0-9]+") == false || Double.parseDouble(txtGia.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Giá phải là số và >0 ");
        } else if (txtDienTich.getText().matches("^[0-9]+") == false || Double.parseDouble(txtGia.getText()) < 0) {
            JOptionPane.showMessageDialog(this, "Diện tích phải là số và >0 ");
//        } else if (servicePhong.findByIdPhong(txtMa.getText()).equals(txtMa.getText())) {
//            JOptionPane.showMessageDialog(this, "Mã đã tồn tại");
        } else {
            int index = tbPhong.getSelectedRow();
            Phong p = servicePhong.getAllData().get(index);
            p.setMa(txtMa.getText());
            p.setTen(txtTen.getText());
            p.setGia(Double.parseDouble(txtGia.getText()));
            p.setDienTich(Float.parseFloat(txtDienTich.getText()));
            p.setNgayTao(jdNgayTao.getDate());
            p.setNgaySua(jdNgaySua.getDate());
            if (rdoCo.isSelected()) {
                p.setTrangThai(1);
            } else {
                p.setTrangThai(0);
            }
            servicePhong.save(p);
            loadTablePhong(servicePhong.getAllData());
        }
    }//GEN-LAST:event_btSuaActionPerformed

    private void btXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXoaActionPerformed
        // TODO add your handling code here:
        int index = tbPhong.getSelectedRow();
        String tt = tbPhong.getValueAt(index, 7).toString();
        if (tt.equalsIgnoreCase("Có")) {
            JOptionPane.showMessageDialog(this, "Phòng đang cho thuê không thể xóa");
        } else {
            String ma = txtMa.getText();
            servicePhong.delete(ma);
            loadTablePhong(servicePhong.getAllData());
        }
    }//GEN-LAST:event_btXoaActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        // TODO add your handling code here:
        ViewChuTro vct = new ViewChuTro();
        vct.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btBackActionPerformed

    private void tbPhongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPhongMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        int row = tbPhong.getSelectedRow();
        txtMa.setText(tbPhong.getValueAt(row, 1).toString());
        txtTen.setText(tbPhong.getValueAt(row, 2).toString());
        txtGia.setText(tbPhong.getValueAt(row, 3).toString());
        txtDienTich.setText(tbPhong.getValueAt(row, 4).toString());
        jdNgayTao.setDate((Date) tbPhong.getValueAt(row, 5));
        jdNgaySua.setDate((Date) tbPhong.getValueAt(row, 6));
        if (tbPhong.getValueAt(row, 7).toString().equalsIgnoreCase("Có")) {
            rdoCo.setSelected(true);
        } else {
            rdoKhong.setSelected(true);
        }
    }//GEN-LAST:event_tbPhongMouseClicked

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
            java.util.logging.Logger.getLogger(ViewPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPhong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPhong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btSua;
    private javax.swing.JButton btThem;
    private javax.swing.JButton btXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdNgaySua;
    private com.toedter.calendar.JDateChooser jdNgayTao;
    private javax.swing.JRadioButton rdoCo;
    private javax.swing.JRadioButton rdoKhong;
    private javax.swing.JTable tbPhong;
    private javax.swing.JTextField txtDienTich;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
