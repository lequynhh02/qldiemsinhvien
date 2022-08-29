/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldsinhvien;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmMonHoc extends javax.swing.JPanel {

    String timkiem = "";
    boolean ktThem;
    String macu;
    String sql;
    DefaultTableModel btn = new DefaultTableModel();

    public frmMonHoc() {
        initComponents();
        showdata();
        KhoaMo(false);
    }

    private void KhoaMo(boolean b) {
        txtMaMon.setEditable(b);
        txtTenMon.setEditable(b);
        txtSoTiet.setEditable(b);

        cmdThem.setEnabled(!b);
        cmdSua.setEnabled(!b);
        cmdXoa.setEnabled(!b);

        cmdLuu.setEnabled(b);
        cmdHuy.setEnabled(b);

        tblMonHoc.setEnabled(!b);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtTim = new javax.swing.JTextField();
        cmdTimKiem = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMonHoc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        txtTenMon = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSoTiet = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        cmdThem = new javax.swing.JButton();
        cmdSua = new javax.swing.JButton();
        cmdXoa = new javax.swing.JButton();
        cmdLuu = new javax.swing.JButton();
        cmdHuy = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(714, 714));

        cmdTimKiem.setText("Tìm Kiếm");
        cmdTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(cmdTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdTimKiem)
                    .addComponent(txtTim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Môn Học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 12))); // NOI18N

        tblMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblMonHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMonHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMonHoc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin Chi Tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 12))); // NOI18N
        jPanel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Mã Môn:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Tên Môn:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Số Tiết:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenMon)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSoTiet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        cmdThem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        cmdThem.setText("Thêm ");
        cmdThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdThemActionPerformed(evt);
            }
        });

        cmdSua.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btSua.png"))); // NOI18N
        cmdSua.setText("Sửa");
        cmdSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSuaActionPerformed(evt);
            }
        });

        cmdXoa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        cmdXoa.setText("Xóa");
        cmdXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdXoaActionPerformed(evt);
            }
        });

        cmdLuu.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tick.png"))); // NOI18N
        cmdLuu.setText("Lưu");
        cmdLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLuuActionPerformed(evt);
            }
        });

        cmdHuy.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btHuy.png"))); // NOI18N
        cmdHuy.setText("Hủy");
        cmdHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(cmdThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdLuu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdHuy))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Quản Lý Môn Học");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(67, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void showdata() {
        try {
            tblMonHoc.removeAll();
            String[] arr = {"Mã Môn", "Tên Môn", "Số Tiết"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection connection = KetNoi.getConnection();
            String query = "SELECT * FROM dbo.[MONHOC]";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("MaMon"));
                vector.add(rs.getString("TenMon"));
                vector.add(rs.getString("SoTiet"));

                model.addRow(vector);
            }
            tblMonHoc.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        cmdLuu.setEnabled(false);
    }

    public void xoatrang() {
        txtMaMon.setText("");
        txtTenMon.setText("");
        txtSoTiet.setText("");
    }
    private void tblMonHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMonHocMouseClicked
        if (tblMonHoc.getSelectedRow() >= 0) {
            txtMaMon.setText(tblMonHoc.getValueAt(tblMonHoc.getSelectedRow(), 0) + "");
            txtTenMon.setText(tblMonHoc.getValueAt(tblMonHoc.getSelectedRow(), 1) + "");
            txtSoTiet.setText(tblMonHoc.getValueAt(tblMonHoc.getSelectedRow(), 2) + "");
        }

    }//GEN-LAST:event_tblMonHocMouseClicked

    private void cmdThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThemActionPerformed
        xoatrang();
        txtMaMon.requestFocus();
        ktThem = true;
        KhoaMo (true);
    }//GEN-LAST:event_cmdThemActionPerformed
    public boolean ktTrungThem(String manhap) throws ClassNotFoundException, SQLException {
        int row = 0;
        Connection conn = KetNoi.getConnection();
        sql = "Select * from MonHoc where MaMon=N'" + manhap + "'";
        PreparedStatement ps = conn.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            row++;
        }
        if (row > 0) { //ktra có dữ liệu k
            return true;
        } else {
            return false;
        }
    }
    private void cmdLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLuuActionPerformed
        if (txtMaMon.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập mã môn.");
            txtMaMon.requestFocus();
            return;
        }
        if (txtTenMon.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập tên môn.");
            txtTenMon.requestFocus();
            return;
        }
        if (txtSoTiet.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập số tiết.");
            txtSoTiet.requestFocus();
            return;
        }
        if (ktThem == true) {
            try {
                if (ktTrungThem(txtMaMon.getText()) == true) {
                    JOptionPane.showMessageDialog(null, "Trùng mã thêm: " + txtMaMon.getText().trim() + " !"/*, "Error", JOptionPane.ERROR_MESSAGE*/);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            Connection conn = KetNoi.getConnection();
            if (ktThem == true) {
                sql = "insert into MonHoc(MaMon,TenMon,SoTiet) "
                        + "values(N'" + txtMaMon.getText() + "', N'" + txtTenMon.getText() + "', N'" + txtSoTiet.getText() + "')";
            } else {
                sql = "update MonHoc set MaMon= N'" + txtMaMon.getText()
                        + "', TenMon= N'" + txtTenMon.getText() + "', SoTiet= N'" + txtSoTiet.getText() + "' "
                        + "where MaMon= N'" + macu + "'";
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
           KetNoi.closeConnection(conn);

            if (ktThem == true) {
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            } else {
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        KhoaMo(false);
        showdata();
    }//GEN-LAST:event_cmdLuuActionPerformed

    private void cmdSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSuaActionPerformed
         if (txtMaMon.getText().equals("")) {
            return;
        }
        KhoaMo(true);
        txtMaMon.setEnabled(false);
        ktThem = false;
        macu = txtMaMon.getText();
    }//GEN-LAST:event_cmdSuaActionPerformed

    private void cmdXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXoaActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
        if (result == 0) {
            int position = tblMonHoc.getSelectedRow();
            String data = tblMonHoc.getModel().getValueAt(position, 0).toString();
            System.out.println(data);
            try {
                Connection connection = KetNoi.getConnection();
                String query = " DELETE FROM dbo.[MONHOC] WHERE MAMON=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, data);

                ps.executeUpdate();
                KetNoi.closeConnection(connection);
                showdata();
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cmdXoaActionPerformed

    private void cmdHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHuyActionPerformed
        if (tblMonHoc.getSelectedRow() >= 0) {
            txtMaMon.setText(tblMonHoc.getValueAt(tblMonHoc.getSelectedRow(), 0) + "");
            txtTenMon.setText(tblMonHoc.getValueAt(tblMonHoc.getSelectedRow(), 1) + "");
            txtSoTiet.setText(tblMonHoc.getValueAt(tblMonHoc.getSelectedRow(), 2) + "");
        }
        txtMaMon.setEnabled(true);
        KhoaMo(false);
    }//GEN-LAST:event_cmdHuyActionPerformed

    private void cmdTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTimKiemActionPerformed
        if (txtTim.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu.");
        }
        timkiem = txtTim.getText();

        try {

            timkiem = txtTim.getText();
            tblMonHoc.removeAll();
            String[] arr = {"Mã Môn", "Tên Môn", "Số Tiết"};
            DefaultTableModel model = new DefaultTableModel(arr, 0); //tạo TableModel chứa dữ liệu cho Jtable
            String query = "select * from MonHoc where TenMon like N'%" + timkiem + "%'";

            Connection connection = KetNoi.getConnection();

            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            // hiển thị dữ liệu lên jtable
            while (rs.next()) {
                Vector vector = new Vector(); // khỏi tạo 1 vector
                vector.add(rs.getString("MAMON"));
                vector.add(rs.getString("TENMON"));
                vector.add(rs.getString("SOTIET"));
                model.addRow(vector);

            }
            tblMonHoc.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cmdTimKiemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdHuy;
    private javax.swing.JButton cmdLuu;
    private javax.swing.JButton cmdSua;
    private javax.swing.JButton cmdThem;
    private javax.swing.JButton cmdTimKiem;
    private javax.swing.JButton cmdXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMonHoc;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtSoTiet;
    private javax.swing.JTextField txtTenMon;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
