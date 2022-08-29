/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldsinhvien;

import java.sql.*;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class frmKhoaHoc extends javax.swing.JPanel {

    boolean ktThem = true;
    DefaultTableModel btn = new DefaultTableModel();
    String timkiem= "";
    String sql;
    String macu;

    public frmKhoaHoc() {
        initComponents();
        showdata();
        KhoaMo(false);
    }

    private void showdata() {
        try {
            tblKhoaHoc.removeAll();
            String[] arr = {"Mã Khóa", "Tên Khóa", "Niên Khóa"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection connection = KetNoi.getConnection();
            String query = "SELECT * FROM dbo.[KHOA]";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("MaKhoa"));
                vector.add(rs.getString("TenKhoa"));
                vector.add(rs.getString("NienKhoa"));

                model.addRow(vector);
            }
            tblKhoaHoc.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        cmdLuu.setEnabled(false);
    }

    public void xoatrang() {
        txtMaKhoa.setText("");
        txtTenKhoa.setText("");
        txtNienKhoa.setText("");
    }
    private void KhoaMo(boolean b) {
        txtMaKhoa.setEditable(b);
        txtTenKhoa.setEditable(b);
        txtNienKhoa.setEditable(b);

        cmdThem.setEnabled(!b);
        cmdSua.setEnabled(!b);
        cmdXoa.setEnabled(!b);

        cmdLuu.setEnabled(b);
        cmdHuy.setEnabled(b);

        tblKhoaHoc.setEnabled(!b);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtTim = new javax.swing.JTextField();
        cmdTimKiem = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaKhoa = new javax.swing.JTextField();
        txtTenKhoa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNienKhoa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        cmdThem = new javax.swing.JButton();
        cmdSua = new javax.swing.JButton();
        cmdXoa = new javax.swing.JButton();
        cmdLuu = new javax.swing.JButton();
        cmdHuy = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setMaximumSize(new java.awt.Dimension(618, 528));
        setMinimumSize(new java.awt.Dimension(618, 528));
        setPreferredSize(new java.awt.Dimension(714, 714));

        txtTim.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        cmdTimKiem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifier_left.png"))); // NOI18N
        cmdTimKiem.setText("Tìm Kiếm");
        cmdTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(cmdTimKiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdTimKiem)
                    .addComponent(txtTim))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Khóa Học", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 12))); // NOI18N

        tblKhoaHoc.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblKhoaHoc);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Chi tiết", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 12))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Mã Khóa:");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Tên Khóa:");

        txtMaKhoa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtTenKhoa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Niên Khóa:");

        txtNienKhoa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenKhoa)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 248, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTenKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNienKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        cmdThem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cmdThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add (1).png"))); // NOI18N
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(cmdThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdXoa)
                .addGap(28, 28, 28)
                .addComponent(cmdLuu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdHuy)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmdHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmdLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(cmdThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cmdSua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Quản Lý Khóa Học");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(61, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaHocMouseClicked
        if (tblKhoaHoc.getSelectedRow() >= 0) {
            txtMaKhoa.setText(tblKhoaHoc.getValueAt(tblKhoaHoc.getSelectedRow(), 0) + "");
            txtTenKhoa.setText(tblKhoaHoc.getValueAt(tblKhoaHoc.getSelectedRow(), 1) + "");
            txtNienKhoa.setText(tblKhoaHoc.getValueAt(tblKhoaHoc.getSelectedRow(), 2) + "");
        }

    }//GEN-LAST:event_tblKhoaHocMouseClicked

    private void cmdThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThemActionPerformed
        xoatrang();
        txtMaKhoa.requestFocus();
        ktThem = true;
        cmdLuu.setEnabled(true);
        cmdSua.setEnabled(false);
        cmdXoa.setEnabled(false);
        cmdHuy.setEnabled(true);
    }//GEN-LAST:event_cmdThemActionPerformed
    public boolean ktTrungThem(String manhap) throws ClassNotFoundException, SQLException {
        int row = 0;
        Connection conn = KetNoi.getConnection();
        sql = "Select * from Khoa where MaKhoa=N'" + manhap + "'";
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
        if (txtMaKhoa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Mã khóa không được rỗng");
            txtMaKhoa.requestFocus();
            return;
        }
        if (txtTenKhoa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tên khóa không được rỗng");
            txtTenKhoa.requestFocus();
            return;
        }
        if (ktThem == true) {
            try {
                if (ktTrungThem(txtMaKhoa.getText()) == true) {
                    JOptionPane.showMessageDialog(null, "Trùng mã thêm: " + txtMaKhoa.getText().trim() + " !"/*, "Error", JOptionPane.ERROR_MESSAGE*/);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            Connection conn = KetNoi.getConnection();
            if (ktThem == true) {
                sql = "insert into Khoa(MaKhoa,TenKhoa,NienKhoa) "
                        + "values(N'" + txtMaKhoa.getText() + "', N'" + txtTenKhoa.getText() + "', N'" + txtNienKhoa.getText() + "')";
            } else {
                sql = "update Khoa set MaKhoa= N'" + txtMaKhoa.getText()
                        + "', TenKhoa= N'" + txtTenKhoa.getText() + "', NienKhoa= N'" + txtTenKhoa.getText() + "' "
                        + "where MaKhoa= N'" + macu + "'";
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
       if (txtMaKhoa.getText().equals("")) {
            return;
        }
        KhoaMo(true);
        txtMaKhoa.setEnabled(false);
        ktThem = false;
        macu = txtMaKhoa.getText();
    }//GEN-LAST:event_cmdSuaActionPerformed

    private void cmdXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXoaActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
        if (result == 0) {
            int position = tblKhoaHoc.getSelectedRow();
            String data = tblKhoaHoc.getModel().getValueAt(position, 0).toString();
            System.out.println(data);
            try {
                Connection connection = KetNoi.getConnection();
                String query = " DELETE FROM dbo.[KHOA] WHERE MAKHOA=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, data);

                ps.executeUpdate();
                KetNoi.closeConnection(connection);
                showdata();
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                xoatrang();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_cmdXoaActionPerformed

    private void cmdHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHuyActionPerformed
       if (tblKhoaHoc.getSelectedRow() >= 0) {
            txtMaKhoa.setText(tblKhoaHoc.getValueAt(tblKhoaHoc.getSelectedRow(), 0) + "");
            txtTenKhoa.setText(tblKhoaHoc.getValueAt(tblKhoaHoc.getSelectedRow(), 1) + "");
            txtNienKhoa.setText(tblKhoaHoc.getValueAt(tblKhoaHoc.getSelectedRow(), 2) + "");
        }
       txtMaKhoa.setEnabled(true);
       KhoaMo(false);
       
    }//GEN-LAST:event_cmdHuyActionPerformed

    private void cmdTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTimKiemActionPerformed
       if (txtTim.getText().equals(""))
            {
               JOptionPane.showMessageDialog(null, "Chưa nhập dữ liệu.");
            }
            timkiem = txtTim.getText();

        try {
                 
            timkiem = txtTim.getText();
        tblKhoaHoc.removeAll();
        String[] arr= {"Mã Khóa", "Tên Khóa"};
        DefaultTableModel model= new DefaultTableModel(arr,0); //tạo TableModel chứa dữ liệu cho Jtable
        String query ="select * from KhoaHoc where TenKhoa like N'%" + timkiem + "%'";
        
        Connection connection = KetNoi.getConnection();
        
        PreparedStatement ps = connection.prepareStatement(query);
        ResultSet rs= ps.executeQuery();
        // hiển thị dữ liệu lên jtable
        while(rs.next()){
            Vector vector= new Vector(); // khỏi tạo 1 vector
            vector.add(rs.getString("MAKHOA"));
            vector.add(rs.getString("TENKHOA"));
            vector.add(rs.getString("NIENKHOA"));
            model.addRow(vector);
            
        }
        tblKhoaHoc.setModel(model);
        
        
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTextField txtMaKhoa;
    private javax.swing.JTextField txtNienKhoa;
    private javax.swing.JTextField txtTenKhoa;
    private javax.swing.JTextField txtTim;
    // End of variables declaration//GEN-END:variables
}
