/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qldsinhvien;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class frmMenu extends javax.swing.JFrame {

    private frmChuyenNganh chuyennganh;
    private frmKhoaHoc khoahoc;
    private frmLop lop;
    private frmMonHoc monhoc;
    private frmKetQua kqht;
    private frmHSSinhVien hssv;
    private frmTraCuu tcd;
    private frmTraCuuTT tctt;

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
        initComponents();
        setSize(900, 900);
        setLocationRelativeTo(null);

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabMenu = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniThoat = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniChuyenNganh = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniLop = new javax.swing.JMenuItem();
        mniMon = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniHSSV = new javax.swing.JMenuItem();
        mniKQHT = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mniTraCuuTT = new javax.swing.JMenuItem();
        mniTraCuuDiem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("H??? TH???NG QU???N L?? ??I???M SINH VI??N");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(166, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/report_hard.png"))); // NOI18N
        jMenu1.setText("H??? th???ng");

        mniThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_male_logout.png"))); // NOI18N
        mniThoat.setText("????ng Xu???t");
        mniThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniThoatActionPerformed(evt);
            }
        });
        jMenu1.add(mniThoat);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/system_paste.png"))); // NOI18N
        jMenu2.setText("Danh M???c");

        mniChuyenNganh.setText("Chuy??n Ng??nh");
        mniChuyenNganh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyenNganhActionPerformed(evt);
            }
        });
        jMenu2.add(mniChuyenNganh);

        mniKhoaHoc.setText("Kh??a H???c");
        mniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        jMenu2.add(mniKhoaHoc);

        mniLop.setText("L???p");
        mniLop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLopActionPerformed(evt);
            }
        });
        jMenu2.add(mniLop);

        mniMon.setText("M??n H???c");
        mniMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniMonActionPerformed(evt);
            }
        });
        jMenu2.add(mniMon);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user_male_edit.png"))); // NOI18N
        jMenu3.setText("Qu???n L??");

        mniHSSV.setText("H??? S?? Sinh Vi??n");
        mniHSSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHSSVActionPerformed(evt);
            }
        });
        jMenu3.add(mniHSSV);

        mniKQHT.setText("K???t Qu??? H???c T???p");
        mniKQHT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKQHTActionPerformed(evt);
            }
        });
        jMenu3.add(mniKQHT);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit_find_replace.png"))); // NOI18N
        jMenu4.setText("Tra C???u");

        mniTraCuuTT.setText("Tra C???u Th??ng Tin SV");
        mniTraCuuTT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTraCuuTTActionPerformed(evt);
            }
        });
        jMenu4.add(mniTraCuuTT);

        mniTraCuuDiem.setText("Tra C???u ??i???m  SV");
        mniTraCuuDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniTraCuuDiemActionPerformed(evt);
            }
        });
        jMenu4.add(mniTraCuuDiem);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tabMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 714, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonClose(String title) {
        int index = tabMenu.indexOfTab(title);
        JPanel pnlTab = new JPanel(new GridBagLayout());
        pnlTab.setOpaque(false);
        JLabel lblTitle = new JLabel(title);
        JButton btnClose = new JButton("x");

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 1;

        pnlTab.add(lblTitle, gbc);

        gbc.gridx++;
        gbc.weightx = 0;

        pnlTab.add(btnClose, gbc);

        tabMenu.setTabComponentAt(index, pnlTab);
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Component selected = tabMenu.getSelectedComponent();
                if (selected != null) {
                    tabMenu.remove(selected);
                }
            }
        });
    }
    private void mniChuyenNganhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyenNganhActionPerformed
        if (tabMenu.indexOfTab("Chuy??n Ng??nh") <= -1) {
            tabMenu.add("Chuy??n Ng??nh", new frmChuyenNganh());
            ButtonClose("Chuy??n Ng??nh");
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("Chuy??n Ng??nh"));
        } else {
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("Chuy??n Ng??nh"));
            JOptionPane.showMessageDialog(this, "M???c n??y ??ang ???????c m??? !");
        }
    }//GEN-LAST:event_mniChuyenNganhActionPerformed

    private void mniThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniThoatActionPerformed
       new frmDangNhap().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_mniThoatActionPerformed

    private void mniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoaHocActionPerformed
        if (tabMenu.indexOfTab("Kh??a H???c") <= -1) {
            tabMenu.add("Kh??a H???c", new frmKhoaHoc());
            ButtonClose("Kh??a H???c");
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("Kh??a H???c"));
        } else {
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("Kh??a H???c"));
            JOptionPane.showMessageDialog(this, "M???c n??y ??ang ???????c m??? !");
        }
    }//GEN-LAST:event_mniKhoaHocActionPerformed

    private void mniLopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLopActionPerformed
        if (tabMenu.indexOfTab("L???p H???c") <= -1) {
            tabMenu.add("L???p H???c", new frmLop());
            ButtonClose("L???p H???c");
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("L???p H???c"));
        } else {
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("L???p H???c"));
            JOptionPane.showMessageDialog(this, "M???c n??y ??ang ???????c m??? !");
        }
    }//GEN-LAST:event_mniLopActionPerformed

    private void mniMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniMonActionPerformed
        if (tabMenu.indexOfTab("M??n H???c") <= -1) {
            tabMenu.add("M??n H???c", new frmMonHoc());
            ButtonClose("M??n H???c");
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("M??n H???c"));
        } else {
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("M??n H???c"));
            JOptionPane.showMessageDialog(this, "M???c n??y ??ang ???????c m??? !");
        }
    }//GEN-LAST:event_mniMonActionPerformed

    private void mniHSSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHSSVActionPerformed
         if (tabMenu.indexOfTab("H??? S?? Sinh Vi??n") <= -1) {
            tabMenu.add("H??? S?? Sinh Vi??n", new frmHSSinhVien());
            ButtonClose("H??? S?? Sinh Vi??n");
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("H??? S?? Sinh Vi??n"));
        } else {
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("H??? S?? Sinh Vi??n"));
            JOptionPane.showMessageDialog(this, "M???c n??y ??ang ???????c m??? !");
        }

    }//GEN-LAST:event_mniHSSVActionPerformed

    private void mniKQHTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKQHTActionPerformed
        if (tabMenu.indexOfTab("K???t Qu??? H???c T???p") <= -1) {
            tabMenu.add("K???t Qu??? H???c T???p", new frmKetQua());
            ButtonClose("K???t Qu??? H???c T???p");
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("K???t Qu??? H???c T???p"));
        } else {
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("K???t Qu??? H???c T???p"));
            JOptionPane.showMessageDialog(this, "M???c n??y ??ang ???????c m??? !");
        }
    }//GEN-LAST:event_mniKQHTActionPerformed

    private void mniTraCuuDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTraCuuDiemActionPerformed
        if (tabMenu.indexOfTab("Tra C???u ??i???m") <= -1) {
            tabMenu.add("Tra C???u ??i???m", new frmTraCuu());
            ButtonClose("Tra C???u ??i???m");
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("Tra C???u ??i???m"));
        } else {
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("Tra C???u ??i???m"));
            JOptionPane.showMessageDialog(this, "M???c n??y ??ang ???????c m??? !");
        }
        
    }//GEN-LAST:event_mniTraCuuDiemActionPerformed

    private void mniTraCuuTTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniTraCuuTTActionPerformed
        if (tabMenu.indexOfTab("Tra C???u TT") <= -1) {
            tabMenu.add("Tra C???u TT", new frmTraCuuTT());
            ButtonClose("Tra C???u TT");
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("Tra C???u TT"));
        } else {
            tabMenu.setSelectedIndex(tabMenu.indexOfTab("Tra C???u TT"));
            JOptionPane.showMessageDialog(this, "M???c n??y ??ang ???????c m??? !");
        }
    }//GEN-LAST:event_mniTraCuuTTActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mniChuyenNganh;
    private javax.swing.JMenuItem mniHSSV;
    private javax.swing.JMenuItem mniKQHT;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniLop;
    private javax.swing.JMenuItem mniMon;
    private javax.swing.JMenuItem mniThoat;
    private javax.swing.JMenuItem mniTraCuuDiem;
    private javax.swing.JMenuItem mniTraCuuTT;
    private javax.swing.JTabbedPane tabMenu;
    // End of variables declaration//GEN-END:variables
}
