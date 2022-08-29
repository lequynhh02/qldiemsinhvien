/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldsinhvien;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.JFileChooser;

/**
 *
 * @author Admin
 */
public class frmKetQua extends javax.swing.JPanel {

    String timkiem = "";
    boolean ktThem;
    String macu;
    String sql;
    DefaultTableModel btn = new DefaultTableModel();
    Float  diemhs2,diemthi,diemthilai;
    

    public frmKetQua() {
        initComponents();
        combo();
        LayNguonSV();
        KhoaMo(false);
        txtMaSV.setEnabled(false);
        txtHoTen.setEnabled(false);
        
        //tinhdiemtb();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSua = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTTSV = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKetQua = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbLopTim = new javax.swing.JComboBox<>();
        btnHienALL = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbMonHoc = new javax.swing.JComboBox<>();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtDHS1 = new javax.swing.JTextField();
        txtDiemThi = new javax.swing.JTextField();
        txtDHS2 = new javax.swing.JTextField();
        txtDiemTL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDiemTB = new javax.swing.JTextField();
        cmdXuat = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setPreferredSize(new java.awt.Dimension(714, 714));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btSua.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnHuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/btHuy.png"))); // NOI18N
        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnLuu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Tick.png"))); // NOI18N
        btnLuu.setText("Lưu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Sinh Viên"));

        tblTTSV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Mã Lớp", "Họ Tên", "Ngày Sinh", "Giới Tính", "SDT", "Dịa Chỉ"
            }
        ));
        tblTTSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTTSVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblTTSV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Kết quả"));

        tblKetQua.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Mã Môn", "Điểm HS1", "Điểm HS2", "Điểm Thi", "Điểm Thi Lại"
            }
        ));
        tblKetQua.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKetQuaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblKetQua);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setText("Chọn Lớp:");

        cbLopTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLopTimActionPerformed(evt);
            }
        });

        btnHienALL.setText("Hiện tất cả");
        btnHienALL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHienALLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbLopTim, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnHienALL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbLopTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienALL))
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel16.setText("Kết Quả Học Tập");

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Thông Tin Chi Tiết"));

        jLabel1.setText("Mã SV:");

        jLabel4.setText("Họ Tên:");

        jLabel6.setText("Môn Học:");

        jLabel12.setText("Điểm HS1:");

        jLabel13.setText("Điểm HS2:");

        jLabel14.setText("Điểm Thi:");

        jLabel15.setText("Điểm thi lại:");

        jLabel2.setText("Điểm TB: ");

        txtDiemTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiemTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(31, 31, 31)
                        .addComponent(txtHoTen))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36)
                        .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(24, 24, 24)
                            .addComponent(cbMonHoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDHS2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDHS1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtDiemTL, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtDHS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDHS2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemThi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtDiemTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmdXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Open file.png"))); // NOI18N
        cmdXuat.setText("Xuất ra Excel");
        cmdXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThem)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSua)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnXoa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLuu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnHuy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addComponent(cmdXuat)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHuy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem)
                        .addComponent(btnLuu)
                        .addComponent(cmdXuat)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
 public void xoatrang() {
        txtDHS1.setText("");
        txtDHS2.setText("");
        txtDiemThi.setText("");
        txtDiemTL.setText("");
    }

    private void KhoaMo(boolean b) {
        txtDHS1.setEditable(b);
        txtDHS2.setEditable(b);
        txtDiemThi.setEditable(b);
        txtDiemTL.setEditable(b);

        btnThem.setEnabled(!b);
        btnSua.setEnabled(!b);
        btnXoa.setEnabled(!b);

        btnLuu.setEnabled(b);
        btnHuy.setEnabled(b);

        tblKetQua.setEnabled(!b);
    }

    public void combo() {
        try {
            Connection connection = KetNoi.getConnection();
            PreparedStatement TKKhoa = connection.prepareStatement("SELECT malop FROM Lop group by malop ");
            PreparedStatement CBmakhoa = connection.prepareStatement("SELECT mamon FROM MonHoc group by mamon ");

            ResultSet rs1 = TKKhoa.executeQuery();
            ResultSet rs2 = CBmakhoa.executeQuery();
            //combo khóa tìm
            while (rs1.next()) {
                cbLopTim.addItem(rs1.getString("malop"));
            }//combo mã khóa
            while (rs2.next()) {
                cbMonHoc.addItem(rs2.getString("mamon"));
            }//combo mã ngành
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void LayNguonSV() {
        try {
            tblTTSV.removeAll();
            String[] arr = {"Mã SV", "Họ Tên", "Mã Lớp", "Ngày Sinh", "Giới Tính", "SĐT", "Địa Chỉ"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);

            Connection connection = KetNoi.getConnection();
            String query = "SELECT MaSV, HoTen,MaLop,NgaySinh,GioiTinh=(case GioiTinh when 'True' then N'Nam' when 'False' then N'Nữ' end), SDT, DiaChi FROM SinhVien";
            //String query = "select * from sinhvien";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("MaSV"));
                vector.add(rs.getString("HoTen"));
                vector.add(rs.getString("MaLop"));
                vector.add(rs.getString("NgaySinh"));
                vector.add(rs.getString("GioiTinh"));
                vector.add(rs.getString("SDT"));
                vector.add(rs.getString("DiaChi"));

                model.addRow(vector);
            }
            tblTTSV.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(frmKetQua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void LayNguonKQ() {
        try {
            String masv = txtMaSV.getText();
            tblKetQua.removeAll();
            String[] arr = {"Mã SV", "Mã Môn", "Điểm HS1", "Điểm HS2", "Điểm Thi", "Điểm TL"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);

            Connection connection = KetNoi.getConnection();
            String query = "select * from KetQua where MaSV = N'" + masv + "'";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString("MaSV"));
                vector.add(rs.getString("MaMon"));
                vector.add(rs.getString("DiemHS1"));
                vector.add(rs.getString("DiemHS2"));
                vector.add(rs.getString("DiemThi"));
                vector.add(rs.getString("DiemThiLai"));

                model.addRow(vector);
            }
            tblKetQua.setModel(model);
        } catch (SQLException ex) {
            ex.printStackTrace();
            Logger.getLogger(frmKetQua.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (txtMaSV.getText().equals("") || cbMonHoc.getSelectedItem().toString().equals("")) {
            return;
        }
        KhoaMo(true);
        cbMonHoc.setEnabled(false);
        ktThem = false;
        macu = txtMaSV.getText();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        xoatrang();
        KhoaMo(true);
        ktThem = true;
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        cbMonHoc.setEnabled(true);
        KhoaMo(false);
        xoatrang();
        if (tblKetQua.getSelectedRow() >= 0) {
            cbMonHoc.setSelectedItem(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 1));
            txtDHS1.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 2) + "");
            txtDHS2.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 3) + "");
            txtDiemThi.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 4) + "");
            txtDiemTL.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 5) + "");
        }
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (txtMaSV.getText().equals("") || cbMonHoc.getSelectedItem().toString().equals("")) {
            return;
        }
        int result = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không?");
        if (result == 0) {
            int position = tblKetQua.getSelectedRow();
            String data = tblKetQua.getModel().getValueAt(position, 0).toString();
            System.out.println(data);
            try {
                Connection connection = KetNoi.getConnection();
                String query = " DELETE FROM ketqua WHERE masv = ? and mamon = N'" + cbMonHoc.getSelectedItem().toString() + "'";  //áp dụng cho xóa
                PreparedStatement ps = connection.prepareStatement(query);  //mã môn là combobox nên để lấy dc gt thì gọi hàm còn maSV là dạng text nên k cần
                ps.setString(1, data);
                ps.executeUpdate();

                KetNoi.closeConnection(connection);
                JOptionPane.showMessageDialog(null, "Xóa thành công");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        xoatrang();
        LayNguonKQ();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        if (txtDHS1.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập điểm HS1");
            txtDHS1.requestFocus();
            return;
        }
        if (txtDHS2.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập điểm HS2");
            txtDHS2.requestFocus();
            return;
        }
        if (txtDiemThi.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Chưa nhập điểm thi");
            txtDiemThi.requestFocus();
            return;
        }
       
        {
            Float diemhs1 =   Float.parseFloat(txtDHS1.getText());
            if (diemhs1 <= 0 || diemhs1 > 10) {
                txtDHS1.requestFocus();
                JOptionPane.showMessageDialog(this, "Điểm HS1 không hợp lệ. Nhập lại!");
                return;
            }
            diemhs2 = Float.parseFloat(txtDHS2.getText().trim());
            if (diemhs2 <= 0 || diemhs2 > 10) {
                txtDHS2.requestFocus();
                JOptionPane.showMessageDialog(this, "Điểm HS2 không hợp lệ. Nhập lại!");
                return;
            }
            
            diemthi = Float.parseFloat(txtDiemThi.getText().trim());
            if (diemthi <= 0 || diemthi > 10) {
                txtDiemThi.requestFocus();
                JOptionPane.showMessageDialog(this, "Điểm Thi không hợp lệ. Nhập lại!");
                return;
            }
   
            diemthilai = Float.parseFloat(txtDiemTL.getText().trim());
            if(txtDiemTL.getText().equals("")) txtDiemTL.setText("-1");
            if (diemthilai < -1 || diemthilai > 10) {
            txtDiemTL.requestFocus();
                 JOptionPane.showMessageDialog(this, "Điểm Thi không hợp lệ. Nhập lại!");
                 return;
        }
            
            if (ktThem == true) {
                try {
                    if (ktTrungThem() == true) {
                        JOptionPane.showMessageDialog(null, "Trùng mã môn học: " + cbMonHoc.getSelectedItem().toString() + " !");
                        return;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                Connection conn = KetNoi.getConnection();
                if (ktThem == true) {
                    sql = "insert into KetQua (masv, mamon, DiemHS1, DiemHS2, Diemthi, DiemThilai) "
                            + "values(N'" + txtMaSV.getText() + "', N'" + cbMonHoc.getSelectedItem().toString() + "', N'"
                            + txtDHS1.getText() + "', N'" + txtDHS2.getText() + "', N'"
                            + txtDiemThi.getText() + "', N'" + txtDiemTL.getText() + "')";
                } else {
                    sql = "update KetQua set DiemHS1= N'" + txtDHS1.getText() + "', DiemHS2= N'" + txtDHS2.getText()
                            + "', Diemthi= N'" + txtDiemThi.getText() + "', DiemThilai= N'" + txtDiemTL.getText() + "' "
                            + "where masv = N'" + txtMaSV.getText() + "' And mamon = N'" + cbMonHoc.getSelectedItem().toString() + "'";
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
            cbMonHoc.setEnabled(true);
            KhoaMo(false);
            LayNguonKQ();
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void tblTTSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTTSVMouseClicked
        if (tblTTSV.getSelectedRow() >= 0) {
            txtMaSV.setText(tblTTSV.getValueAt(tblTTSV.getSelectedRow(), 0) + "");
            txtHoTen.setText(tblTTSV.getValueAt(tblTTSV.getSelectedRow(), 1) + "");
        }
        LayNguonKQ();
        xoatrang();
    }//GEN-LAST:event_tblTTSVMouseClicked

    private void tblKetQuaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKetQuaMouseClicked
        if (tblKetQua.getSelectedRow() >= 0) {
            txtMaSV.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 0) + "");
            cbMonHoc.setSelectedItem(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 1));
            txtDHS1.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 2) + "");
            txtDHS2.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 3) + "");
            txtDiemThi.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 4) + "");
            txtDiemTL.setText(tblKetQua.getValueAt(tblKetQua.getSelectedRow(), 5) + "");
        }
        String a = txtDHS1.getText();
          float diemhs1 =   Float.parseFloat(a);
        String b = txtDHS2.getText();
         diemhs2 = Float.parseFloat(b);
        String c = txtDiemThi.getText();
        diemthi = Float.parseFloat(c);
        String d = txtDiemTL.getText();
        diemthilai = Float.parseFloat(d);
        if(diemthilai== -1) {
            txtDiemTB.setText(""+(float)(diemhs1*0.1 + diemhs2*0.2 + diemthi*0.7));
        }
        else {
            txtDiemTB.setText(""+(float)(diemhs1*0.1 + diemhs2*0.2 + diemthilai*0.7));
        }
        

    }//GEN-LAST:event_tblKetQuaMouseClicked

    private void cbLopTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLopTimActionPerformed
        try {
            String makhoatim = "";
            makhoatim = cbLopTim.getSelectedItem().toString();
            tblTTSV.removeAll();
            String[] arr = {"Mã SV", "Họ Tên", "Mã Lớp", "Ngày Sinh", "Giới Tính", "SĐT", "Địa Chỉ"};
            DefaultTableModel model = new DefaultTableModel(arr, 0); //tạo TableModel chứa dữ liệu cho Jtable
            String query = "SELECT MaSV, HoTen,MaLop,NgaySinh,GioiTinh=(case GioiTinh when 'True' then N'Nam' when 'False' then N'Nữ' end), SDT, DiaChi FROM SinhVien where MaLop = '" + makhoatim + "'";

            Connection connection = KetNoi.getConnection();
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            // hiển thị dữ liệu lên jtable
            while (rs.next()) {
                Vector vector = new Vector(); // khỏi tạo 1 vector
                vector.add(rs.getString("MaSV"));
                vector.add(rs.getString("HoTen"));
                vector.add(rs.getString("MaLop"));
                vector.add(rs.getString("NgaySinh"));
                vector.add(rs.getString("GioiTinh"));
                vector.add(rs.getString("SDT"));
                vector.add(rs.getString("DiaChi"));

                model.addRow(vector);
            }
            tblTTSV.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_cbLopTimActionPerformed

    private void btnHienALLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHienALLActionPerformed
        LayNguonSV();
    }//GEN-LAST:event_btnHienALLActionPerformed

    private void cmdXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdXuatActionPerformed
        JFileChooser xuatfile = new JFileChooser("C:\\Users\\Admin\\Desktop");
        xuatfile.setDialogTitle("Save As");
        FileOutputStream excelFOU = null;
        BufferedOutputStream excelBOU = null;
        XSSFWorkbook excelJTableExporter = null;
        // Onliny filter files with these extensions "xls","xlsx","xlsm"
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("EXCEL FILES ", "xls", "xlsx", "xlsm");
        xuatfile.setFileFilter(fnef);
        int xuat = xuatfile.showSaveDialog(null);
        if (xuat == JFileChooser.APPROVE_OPTION) {

            try {
                excelJTableExporter = new XSSFWorkbook();
                XSSFSheet excelsheet = excelJTableExporter.createSheet("Kết quả học tập");
                for (int i = 0; i < tblKetQua.getRowCount(); i++) {
                    XSSFRow excelRow = excelsheet.createRow(i);
                    for (int j = 0; j < tblKetQua.getColumnCount(); j++) {
                        XSSFCell excelCell = excelRow.createCell(j);

                        excelCell.setCellValue(tblKetQua.getValueAt(i, j).toString());

                    }
                }
                excelFOU = new FileOutputStream(xuatfile.getSelectedFile() + ".xlsx");
                excelBOU = new BufferedOutputStream(excelFOU);
                excelJTableExporter.write(excelBOU);
                JOptionPane.showMessageDialog(null, " Xuất thành công !!!");
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            } finally {

                try {
                    if (excelBOU != null) {
                        excelBOU.close();
                    }
                    if (excelFOU != null) {
                        excelFOU.close();
                    }
                    if (excelJTableExporter != null) {
                        excelJTableExporter.close();
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }

        }
    }//GEN-LAST:event_cmdXuatActionPerformed

    private void txtDiemTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiemTBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiemTBActionPerformed
   
    

    public boolean ktTrungThem() throws ClassNotFoundException, SQLException {
        int row = 0;
        Connection conn = KetNoi.getConnection();
        sql = "Select * from KetQua where masv = N'" + txtMaSV.getText() + "' And mamon = N'"
                + cbMonHoc.getSelectedItem().toString() + "'";
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienALL;
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbLopTim;
    private javax.swing.JComboBox<String> cbMonHoc;
    private javax.swing.JButton cmdXuat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblKetQua;
    private javax.swing.JTable tblTTSV;
    private javax.swing.JTextField txtDHS1;
    private javax.swing.JTextField txtDHS2;
    private javax.swing.JTextField txtDiemTB;
    private javax.swing.JTextField txtDiemTL;
    private javax.swing.JTextField txtDiemThi;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    // End of variables declaration//GEN-END:variables
}
