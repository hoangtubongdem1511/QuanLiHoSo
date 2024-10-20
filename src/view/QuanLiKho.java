/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.Account;

/**
 *
 * 
 */
public class QuanLiKho extends javax.swing.JFrame {

    /**
     * Creates new form Navbar
     */
    Color DefaultColor, ClickedColor;
    private Account currentAcc;

    public Account getCurrentAcc() {
        return currentAcc;
    }

    public void setCurrentAcc(Account currentAcc) {
        this.currentAcc = currentAcc;
    }

    public QuanLiKho() throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new FlatLightLaf());
        UIManager.put("Table.showVerticalLines", true);
        UIManager.put("Table.showHorizontalLines", true);
        initComponents();
        setLocationRelativeTo(null);
        HoSoForm pf = new HoSoForm();
        MainContent.add(pf).setVisible(true);
        DefaultColor = new Color(89, 168, 105);
        ClickedColor = new Color(26, 188, 156);
        NavbarMenu.setBackground(DefaultColor);
        HoSo.setBackground(ClickedColor);
        NhanVien.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        ImageIcon logo = new ImageIcon(getClass().getResource("/icon/logo.png"));
        setIconImage(logo.getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavbarMenu = new javax.swing.JPanel();
        HoSo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        DangXuat = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        NhanVien = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        NameUser = new javax.swing.JLabel();
        TonKho = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Account = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MainContent = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý hồ sơ");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavbarMenu.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        NavbarMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HoSo.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        HoSo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HoSo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HoSoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HoSoMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_product_25px_2.png"))); // NOI18N
        jLabel1.setText("HỒ SƠ");

        javax.swing.GroupLayout HoSoLayout = new javax.swing.GroupLayout(HoSo);
        HoSo.setLayout(HoSoLayout);
        HoSoLayout.setHorizontalGroup(
            HoSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoSoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        HoSoLayout.setVerticalGroup(
            HoSoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoSoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        NavbarMenu.add(HoSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 240, 60));

        DangXuat.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        DangXuat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DangXuatMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DangXuatMousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_shutdown_25px.png"))); // NOI18N
        jLabel5.setText("ĐĂNG XUẤT");

        javax.swing.GroupLayout DangXuatLayout = new javax.swing.GroupLayout(DangXuat);
        DangXuat.setLayout(DangXuatLayout);
        DangXuatLayout.setHorizontalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        DangXuatLayout.setVerticalGroup(
            DangXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DangXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        NavbarMenu.add(DangXuat, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 690, 240, -1));

        NhanVien.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        NhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NhanVienMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NhanVienMousePressed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8_supplier_25px.png"))); // NOI18N
        jLabel6.setText("NHÂN VIÊN");

        javax.swing.GroupLayout NhanVienLayout = new javax.swing.GroupLayout(NhanVien);
        NhanVien.setLayout(NhanVienLayout);
        NhanVienLayout.setHorizontalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel6)
                .addContainerGap(82, Short.MAX_VALUE))
        );
        NhanVienLayout.setVerticalGroup(
            NhanVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanVienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        NavbarMenu.add(NhanVien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 240, 60));

        NameUser.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        NameUser.setForeground(new java.awt.Color(255, 255, 255));
        NameUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NameUser.setText("ADMIN");
        NameUser.setToolTipText("");
        NavbarMenu.add(NameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 160, -1));

        TonKho.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        TonKho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TonKho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TonKhoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TonKhoMousePressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-warehouse-25.png"))); // NOI18N
        jLabel10.setText("TỒN KHO");

        javax.swing.GroupLayout TonKhoLayout = new javax.swing.GroupLayout(TonKho);
        TonKho.setLayout(TonKhoLayout);
        TonKhoLayout.setHorizontalGroup(
            TonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TonKhoLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        TonKhoLayout.setVerticalGroup(
            TonKhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TonKhoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        NavbarMenu.add(TonKho, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 240, 60));

        Account.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Green"));
        Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AccountMousePressed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-information-25.png"))); // NOI18N
        jLabel14.setText("THÔNG TIN");

        javax.swing.GroupLayout AccountLayout = new javax.swing.GroupLayout(Account);
        Account.setLayout(AccountLayout);
        AccountLayout.setHorizontalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        AccountLayout.setVerticalGroup(
            AccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        NavbarMenu.add(Account, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 640, 240, -1));

        jLabel9.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("VIỆN KIỂM SÁT");
        jLabel9.setToolTipText("");
        NavbarMenu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 180, 50));

        jLabel8.setFont(new java.awt.Font("SF Pro Display", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("QUẬN 5");
        jLabel8.setToolTipText("");
        NavbarMenu.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 100, 50));

        getContentPane().add(NavbarMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 750));

        MainContent.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MainContentLayout = new javax.swing.GroupLayout(MainContent);
        MainContent.setLayout(MainContentLayout);
        MainContentLayout.setHorizontalGroup(
            MainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1180, Short.MAX_VALUE)
        );
        MainContentLayout.setVerticalGroup(
            MainContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );

        getContentPane().add(MainContent, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1180, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HoSoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoSoMousePressed
        // TODO add your handling code here:
        HoSo.setBackground(ClickedColor);
        NhanVien.setBackground(DefaultColor);
        TonKho.setBackground(DefaultColor);
        MainContent.removeAll();
        HoSoForm p = new HoSoForm();
        MainContent.add(p).setVisible(true);
    }//GEN-LAST:event_HoSoMousePressed

    private void NhanVienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienMousePressed
        // TODO add your handling code here:
        HoSo.setBackground(DefaultColor);
        NhanVien.setBackground(ClickedColor);
        TonKho.setBackground(DefaultColor);
    }//GEN-LAST:event_NhanVienMousePressed

    private void HoSoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HoSoMouseClicked
        // TODO add your handling code here:
        HoSoForm ac = new HoSoForm();
        MainContent.removeAll();
        MainContent.add(ac).setVisible(true);
    }//GEN-LAST:event_HoSoMouseClicked

    private void TonKhoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TonKhoMousePressed
        // TODO add your handling code here:
        HoSo.setBackground(DefaultColor);
        NhanVien.setBackground(DefaultColor);
        TonKho.setBackground(ClickedColor);
    }//GEN-LAST:event_TonKhoMousePressed

    private void DangXuatMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DangXuatMousePressed

    private void NhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NhanVienMouseClicked
        // TODO add your handling code here:
        NhanVienForm af = new NhanVienForm();
        MainContent.removeAll();
        MainContent.add(af).setVisible(true);
    }//GEN-LAST:event_NhanVienMouseClicked

    private void TonKhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TonKhoMouseClicked
        // TODO add your handling code here:
        TonKhoForm px = new TonKhoForm();
        MainContent.removeAll();
        MainContent.add(px).setVisible(true);

    }//GEN-LAST:event_TonKhoMouseClicked

    private void DangXuatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DangXuatMouseClicked
        // TODO add your handling code here:
        int relly = JOptionPane.showConfirmDialog(
                null,
                "Bạn muốn thoát khỏi chương trình ?",
                "Xác nhận",
                JOptionPane.YES_NO_OPTION);
        if (relly == JOptionPane.YES_OPTION) {
            this.dispose();
            Login a = new Login();
            a.setVisible(true);
        } else {
            DangXuat.setBackground(DefaultColor);
        }
    }//GEN-LAST:event_DangXuatMouseClicked

    private void AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMouseClicked
        // TODO add your handling code here:
        ChangePassword cp = new ChangePassword(this, rootPaneCheckingEnabled, getCurrentAcc());
        cp.setVisible(true);
    }//GEN-LAST:event_AccountMouseClicked

    private void AccountMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_AccountMousePressed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int resp = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn thoát ?", "Exit?", JOptionPane.YES_NO_OPTION);
        if (resp == JOptionPane.YES_OPTION) {
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        } else {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new QuanLiKho().setVisible(true);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(QuanLiKho.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    public void setName(String name) {
        this.NameUser.setText(name);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Account;
    private javax.swing.JPanel DangXuat;
    private javax.swing.JPanel HoSo;
    private javax.swing.JPanel MainContent;
    private javax.swing.JLabel NameUser;
    private javax.swing.JPanel NavbarMenu;
    private javax.swing.JPanel NhanVien;
    private javax.swing.JPanel TonKho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
