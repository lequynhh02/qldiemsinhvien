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
import javax.swing.table.TableModel;

/**
 *
 * @author Admin
 */
public class frmHSSinhVien extends javax.swing.JPanel {

    boolean ktThem = true;
    String timkiem = "";
    String sql;

    public frmHSSinhVien() {
        initComponents();
        comboLopTim();
        KhoaMo(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        cboLopTim = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        cmdHienToanBo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaSv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        cboLop = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        cmdThem = new javax.swing.JButton();
        cmdSua = new javax.swing.JButton();
        cmdXoa = new javax.swing.JButton();
        cmdLuu = new javax.swing.JButton();
        cmdHuy = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(714, 714));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Danh Sách Sinh Viên"));

        tblSinhVien.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        cboLopTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboLopTimActionPerformed(evt);
            }
        });

        jLabel6.setText("Chọn Lớp:");

        cmdHienToanBo.setText("Hiện Toàn Bộ");
        cmdHienToanBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdHienToanBoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(cboLopTim, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmdHienToanBo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLopTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(cmdHienToanBo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Chi Tiết"));

        jLabel2.setText("Mã SV");

        jLabel3.setText("Họ Tên");

        jLabel4.setText("Giới Tính");

        buttonGroup1.add(rdNam);
        rdNam.setSelected(true);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setText("Nữ");

        jLabel5.setText("Lớp");

        jLabel7.setText("Ngày Sinh");

        jLabel9.setText("SĐT");

        jLabel8.setText("Địa Chỉ");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3))
                .addGap(18, 59, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaSv)
                            .addComponent(txtNgaySinh)
                            .addComponent(cboLop, 0, 166, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(txtDiaChi))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(rdNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(rdNu)
                                .addGap(12, 12, 12))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(rdNam)
                    .addComponent(rdNu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboLop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(42, 42, 42)
                .addComponent(cmdLuu)
                .addGap(38, 38, 38)
                .addComponent(cmdHuy))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdSua)
                    .addComponent(cmdHuy)
                    .addComponent(cmdThem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdLuu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 20)); // NOI18N
        jLabel10.setText("Quản Lý Sinh Viên");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel10)))
                .addGap(18, 30, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void showdata() {
        try {
            timkiem = cboLopTim.getSelectedItem().toString();
            tblSinhVien.removeAll();//loại bỏ tất cả các phần tử
            String[] arr = {"Mã SV", "Họ Tên", "Lớp", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "SĐT"};
            DefaultTableModel model = new DefaultTableModel(arr, 0); //tạo TableModel chứa dữ liệu cho Jtable
            String query = "SELECT MaSV, HoTen,MaLop,NgaySinh,GioiTinh=(case GioiTinh when 'True' then N'Nam' when 'False' then N'Nữ' end), SDT, DiaChi FROM SinhVien";
            Connection connection = KetNoi.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            // hiển thị dữ liệu lên jtable
            while (rs.next()) {
                Vector vector = new Vector(); // khỏi tạo 1 vector
                vector.add(rs.getString("MASV"));
                vector.add(rs.getString("HOTEN"));
                vector.add(rs.getString("MALOP"));
                vector.add(rs.getString("NGAYSINH"));
                vector.add(rs.getString("GIOITINH"));
                vector.add(rs.getString("DIACHI"));
                vector.add(rs.getString("SDT"));

                model.addRow(vector);
            }
            tblSinhVien.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void KhoaMo(boolean b) {
        txtMaSv.setEditable(b);
        txtHoTen.setEditable(b);
        txtNgaySinh.setEditable(b);
        txtDiaChi.setEditable(b);
        txtSDT.setEditable(b);

        cmdThem.setEnabled(!b);
        cmdSua.setEnabled(!b);
        cmdXoa.setEnabled(!b);

        cmdLuu.setEnabled(b);
        cmdHuy.setEnabled(b);

        tblSinhVien.setEnabled(!b);
    }
    public void comboLopTim() {
        try {
            Connection connection = KetNoi.getConnection();
            PreparedStatement ps = connection.prepareStatement("SELECT MALOP FROM dbo.[LOP] group by MALOP ");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cboLopTim.addItem(rs.getString("MALOP"));
                cboLop.addItem(rs.getString("MALOP"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void xoatrang() {
        txtMaSv.setText("");
        txtHoTen.setText("");
        txtNgaySinh.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
    }
    private void cboLopTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboLopTimActionPerformed
        try {
            timkiem = cboLopTim.getSelectedItem().toString();
            tblSinhVien.removeAll();//xóa dữ liệu trong table
            String[] arr = {"Mã SV", "Họ Tên", "Lớp", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "SĐT"};
            DefaultTableModel model = new DefaultTableModel(arr, 0); //tạo TableModel chứa dữ liệu cho Jtable
            String query = "SELECT MaSV, HoTen,MaLop,NgaySinh,GioiTinh=(case GioiTinh when 'True' then N'Nam' when 'False' then N'Nữ' end), SDT, DiaChi FROM SinhVien where MaLop = '" + timkiem + "'";
            Connection connection = KetNoi.getConnection();

            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            // hiển thị dữ liệu lên jtable
            while (rs.next()) {
                Vector vector = new Vector(); // khỏi tạo 1 vector
                vector.add(rs.getString("MASV"));
                vector.add(rs.getString("HOTEN"));
                vector.add(rs.getString("MALOP"));
                vector.add(rs.getString("NGAYSINH"));
                vector.add(rs.getString("GIOITINH"));
                vector.add(rs.getString("DIACHI"));
                vector.add(rs.getString("SDT"));

                model.addRow(vector);

            }
            tblSinhVien.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cboLopTimActionPerformed

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        //if (tblSinhVien.getSelectedRow() >= 0) {
        int i = tblSinhVien.getSelectedRow();
        TableModel model = tblSinhVien.getModel(); //tạo TableModel chứa dữ liệu của tblSinhVien
        txtMaSv.setText(model.getValueAt(i, 0).toString());
        txtHoTen.setText(model.getValueAt(i, 1).toString());
        cboLop.setSelectedItem(model.getValueAt(i, 2).toString());
        txtNgaySinh.setText(model.getValueAt(i, 3).toString());
        String gt = model.getValueAt(i, 4).toString();
        if (gt.equals("1")) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        txtDiaChi.setText(model.getValueAt(i, 5).toString());
        txtSDT.setText(model.getValueAt(i, 6).toString());
        

    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void cmdHienToanBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHienToanBoActionPerformed
        showdata();
    }//GEN-LAST:event_cmdHienToanBoActionPerformed

    private void cmdThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdThemActionPerformed
        txtMaSv.requestFocus();
        ktThem = true;
        xoatrang();
        KhoaMo(true);
        
    }//GEN-LAST:event_cmdThemActionPerformed
    public boolean ktTrungThem(String manhap) throws ClassNotFoundException, SQLException {
        int row = 0;
        Connection conn = KetNoi.getConnection();
        sql = "Select * from SinhVien where MaSV=N'" + manhap + "'";
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

    private void cmdSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSuaActionPerformed
        if (txtMaSv.getText().equals("")) {
            return;
        }
        KhoaMo(true);
        txtMaSv.setEnabled(false);
        ktThem = false;
       
    }//GEN-LAST:event_cmdSuaActionPerformed

    private void cmdXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXoaActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
        if (result == 0) {
            int position = tblSinhVien.getSelectedRow();
            String data = tblSinhVien.getModel().getValueAt(position, 0).toString();
            System.out.println(data);
            try {
                Connection connection = KetNoi.getConnection();
                String query = " DELETE FROM dbo.[SINHVIEN] WHERE MASV=?";
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

    private void cmdLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLuuActionPerformed
        if (txtMaSv.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Mã SINH VIÊN không được rỗng");
            txtMaSv.requestFocus();
            return;
        }
        if (txtHoTen.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Tên SINH VIÊN không được rỗng");
            txtHoTen.requestFocus();
            return;
        }

        if (ktThem == true) {
            try {
                if (ktTrungThem(txtMaSv.getText()) == true) {
                    JOptionPane.showMessageDialog(null, "Trùng mã thêm: " + txtMaSv.getText().trim() + " !"/*, "Error", JOptionPane.ERROR_MESSAGE*/);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        try {
            if (ktThem == true) {
                Connection connection = KetNoi.getConnection();
                String query = " INSERT INTO sinhvien(masv, hoten, malop, ngaysinh, gioitinh, SDT, Diachi)" + "VALUES(?,?,?,?,?,?,?)";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, txtMaSv.getText());
                ps.setString(2, txtHoTen.getText());
                ps.setString(3, cboLop.getSelectedItem().toString());
                ps.setString(4, txtNgaySinh.getText());
                if (rdNam.isSelected()) {
                    ps.setBoolean(5, true);
                } else {
                    ps.setBoolean(5, false);
                }

                ps.setString(6, txtSDT.getText());
                ps.setString(7, txtDiaChi.getText());
                ps.executeUpdate();
                KetNoi.closeConnection(connection);
                showdata();
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            } 
            else{
                Connection connection = KetNoi.getConnection();
                String query = " UPDATE sinhvien SET hoten=?, malop=?, ngaysinh=?, gioitinh=?, SDT=?, diachi=? WHERE masv=?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(7, txtMaSv.getText());
                ps.setString(1, txtHoTen.getText());
                ps.setString(2, cboLop.getSelectedItem().toString());
                ps.setString(3, txtNgaySinh.getText());
                if (rdNam.isSelected()) {
                    ps.setBoolean(4, true);
                } else {
                    ps.setBoolean(4, false);
                }

                ps.setString(5, txtSDT.getText());
                ps.setString(6, txtDiaChi.getText());
                ps.executeUpdate();
                KetNoi.closeConnection(connection);
                showdata();
                JOptionPane.showMessageDialog(null, "Sửa thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        KhoaMo(false);
        showdata();
    }//GEN-LAST:event_cmdLuuActionPerformed

    private void cmdHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdHuyActionPerformed
        int i = tblSinhVien.getSelectedRow();
        TableModel model = tblSinhVien.getModel();
        txtMaSv.setText(model.getValueAt(i, 0).toString());
        txtHoTen.setText(model.getValueAt(i, 1).toString());
        cboLop.setSelectedItem(model.getValueAt(i, 2).toString());
        txtNgaySinh.setText(model.getValueAt(i, 3).toString());
        txtDiaChi.setText(model.getValueAt(i, 5).toString());
        txtSDT.setText(model.getValueAt(i, 6).toString());
        String gt = model.getValueAt(i, 4).toString();
        if (gt.equals("1")) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        txtMaSv.setEnabled(true);
        KhoaMo(false);
    }//GEN-LAST:event_cmdHuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboLop;
    private javax.swing.JComboBox<String> cboLopTim;
    private javax.swing.JButton cmdHienToanBo;
    private javax.swing.JButton cmdHuy;
    private javax.swing.JButton cmdLuu;
    private javax.swing.JButton cmdSua;
    private javax.swing.JButton cmdThem;
    private javax.swing.JButton cmdXoa;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSv;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables

}
