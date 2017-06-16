/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuUtama.java
 *
 * Created on 17 Feb 13, 23:15:40
 */

package amimarketaplikasi.GUI;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author ONE-System
 */
public class MenuUtama extends javax.swing.JFrame {

    /** Creates new form MenuUtama */
    public MenuUtama() {
        initComponents();
        tampilWaktu();
    }

    public MenuUtama(Object object, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    private void tampilWaktu(){
        DateFormat waktu=new SimpleDateFormat("HH:mm:ss");
        DateFormat tgl=new SimpleDateFormat("dd/mm/yyyy");
        String hwaktu=waktu.format(Calendar.getInstance().getTime());
        String htgl=tgl.format(Calendar.getInstance().getTime());
             
    }
    public void tampilKasir(String Kasir){
        fieldUsername.setText(Kasir);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldTanggal = new javax.swing.JLabel();
        fieldUsername = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnBarang = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnBeli = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        buttonKasir = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        buttonPemasok = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        buttonLaporan = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        btnLogout = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnuLap = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Toko Ami Market Elektronik");
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Welcome To, ");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(10, 10, 90, 15);

        jLabel3.setFont(new java.awt.Font("SimHei", 1, 14)); // NOI18N
        jLabel3.setText("APLIKASI TOKO AMIFIKRI ELEKTRONIK");
        jLayeredPane1.add(jLabel3);
        jLabel3.setBounds(10, 30, 280, 17);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amimarketaplikasi/Gambar/belis.png"))); // NOI18N
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(-37, -3, 740, 410);

        jLabel5.setText("Toko Ami Market Elektronik");
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(330, 200, 169, 15);

        fieldTanggal.setText("jLabel4");
        jLayeredPane1.add(fieldTanggal);
        fieldTanggal.setBounds(560, 10, 44, 15);

        fieldUsername.setText("jLabel4");
        jLayeredPane1.add(fieldUsername);
        fieldUsername.setBounds(10, 380, 44, 15);

        jToolBar1.setBackground(new java.awt.Color(0, 153, 153));
        jToolBar1.setRollover(true);
        jToolBar1.add(jSeparator1);

        btnBarang.setBackground(new java.awt.Color(0, 153, 153));
        btnBarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amimarketaplikasi/Gambar/Barang.png"))); // NOI18N
        btnBarang.setText("Barang");
        btnBarang.setToolTipText("Klik untuk menambahkan data barang");
        btnBarang.setFocusable(false);
        btnBarang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBarang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBarangActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBarang);
        jToolBar1.add(jSeparator2);

        btnBeli.setBackground(new java.awt.Color(0, 153, 153));
        btnBeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amimarketaplikasi/Gambar/trans.png"))); // NOI18N
        btnBeli.setText("Penjualan");
        btnBeli.setToolTipText("Klik untuk menambahkan data transaksi pembelian");
        btnBeli.setFocusable(false);
        btnBeli.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBeli.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeliActionPerformed(evt);
            }
        });
        jToolBar1.add(btnBeli);
        jToolBar1.add(jSeparator3);

        buttonKasir.setBackground(new java.awt.Color(0, 153, 153));
        buttonKasir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amimarketaplikasi/Gambar/admin.png"))); // NOI18N
        buttonKasir.setText("Kasir");
        buttonKasir.setFocusable(false);
        buttonKasir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonKasir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKasirActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonKasir);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jSeparator5);

        buttonPemasok.setBackground(new java.awt.Color(0, 153, 153));
        buttonPemasok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amimarketaplikasi/Gambar/userslogiin.png"))); // NOI18N
        buttonPemasok.setText("Pemasok");
        buttonPemasok.setFocusable(false);
        buttonPemasok.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonPemasok.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonPemasok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPemasokActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonPemasok);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jSeparator4);

        buttonLaporan.setBackground(new java.awt.Color(0, 153, 153));
        buttonLaporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amimarketaplikasi/Gambar/lp.png"))); // NOI18N
        buttonLaporan.setText("Lap.Transaksi");
        buttonLaporan.setToolTipText("Klik untuk logout pengguna");
        buttonLaporan.setFocusable(false);
        buttonLaporan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        buttonLaporan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        buttonLaporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLaporanActionPerformed(evt);
            }
        });
        jToolBar1.add(buttonLaporan);

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jSeparator10);

        btnLogout.setBackground(new java.awt.Color(0, 153, 153));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/amimarketaplikasi/Gambar/logout.png"))); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.setToolTipText("Klik untuk logout pengguna");
        btnLogout.setFocusable(false);
        btnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnLogout);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));
        jToolBar1.add(jSeparator6);

        jMenu1.setText("File");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Keluar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        mnuLap.setText("Laporan");

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setText("Barang");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        mnuLap.add(jMenuItem8);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Data Penjualan");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnuLap.add(jMenuItem1);

        jMenuBar1.add(mnuLap);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 688, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(439, 439, 439))
        );

        setSize(new java.awt.Dimension(704, 549));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        dispose();
        FormLogin l=new FormLogin(null, true);
        l.setVisible(true);
       
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btnBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBarangActionPerformed
        // TODO add your handling code here:
        MasterBarang mb=new MasterBarang(null, true);
        mb.setVisible(true);
    }//GEN-LAST:event_btnBarangActionPerformed

    private void btnBeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeliActionPerformed
        // TODO add your handling code here:
        Pembelian tb=new Pembelian();
        tb.setVisible(true);
    }//GEN-LAST:event_btnBeliActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        ReportBarang rp=new ReportBarang();
        rp.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void buttonKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKasirActionPerformed
        // TODO add your handling code here:
        frmKasir fk =new frmKasir(null, true);
        fk.setVisible(true);
        
    }//GEN-LAST:event_buttonKasirActionPerformed

    private void buttonPemasokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPemasokActionPerformed
        // TODO add your handling code here:
        frmPemasok fp = new frmPemasok(null,true);
        fp.setVisible(true);
    }//GEN-LAST:event_buttonPemasokActionPerformed

    private void buttonLaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLaporanActionPerformed
        // TODO add your handling code here:
         laporanharian lh =new laporanharian();
         lh.setVisible(true);
        
    }//GEN-LAST:event_buttonLaporanActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBarang;
    private javax.swing.JButton btnBeli;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton buttonKasir;
    private javax.swing.JButton buttonLaporan;
    private javax.swing.JButton buttonPemasok;
    private javax.swing.JLabel fieldTanggal;
    private javax.swing.JLabel fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu mnuLap;
    // End of variables declaration//GEN-END:variables

}