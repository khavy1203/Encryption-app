
import com.sun.javafx.embed.HostDragStartListener;
import java.awt.Label;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author khavy
 */
public class MainGUI extends javax.swing.JFrame {

    

    private static MainGUI checkMainGUI =null;
    public MainGUI() {
        initComponents();
        setIcon();
        setLocationRelativeTo(null);
    }

    public static MainGUI testMainGUI(){
        if(checkMainGUI == null){
            checkMainGUI = new MainGUI();
        }
        return checkMainGUI;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnRSA = new javax.swing.JButton();
        btnAES = new javax.swing.JButton();
        btnBowlsFish = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu1 = new javax.swing.JMenu();
        menuFile1 = new javax.swing.JMenuItem();
        menuFile2 = new javax.swing.JMenuItem();
        menuFile3 = new javax.swing.JMenuItem();
        menuFile4 = new javax.swing.JMenuItem();
        menuFile5 = new javax.swing.JMenuItem();
        menuFile6 = new javax.swing.JMenuItem();
        menu2 = new javax.swing.JMenu();
        menuMb1 = new javax.swing.JMenuItem();
        menuMb2 = new javax.swing.JMenuItem();
        menuMb3 = new javax.swing.JMenuItem();
        menuBrief = new javax.swing.JMenu();
        menuBrief1 = new javax.swing.JMenuItem();
        menuBrief2 = new javax.swing.JMenuItem();
        menuBrief3 = new javax.swing.JMenuItem();
        menu3 = new javax.swing.JMenu();
        menuHelp1 = new javax.swing.JMenuItem();
        menuHelp2 = new javax.swing.JMenuItem();
        menuHelp3 = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("M?? H??A ???NG D???NG");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel1MouseReleased(evt);
            }
        });

        btnRSA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRSA.setForeground(new java.awt.Color(255, 0, 0));
        btnRSA.setText("RSA");
        btnRSA.setFocusable(false);
        btnRSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRSAActionPerformed(evt);
            }
        });

        btnAES.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnAES.setText("AES");
        btnAES.setFocusable(false);
        btnAES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAESActionPerformed(evt);
            }
        });

        btnBowlsFish.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnBowlsFish.setForeground(new java.awt.Color(0, 0, 255));
        btnBowlsFish.setText("BowlFish");
        btnBowlsFish.setFocusable(false);
        btnBowlsFish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBowlsFishActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("---------------------------------------------------");

        menu1.setText("File");

        menuFile1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        menuFile1.setText("Gi???i thi???u");
        menuFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile1ActionPerformed(evt);
            }
        });
        menu1.add(menuFile1);

        menuFile2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuFile2.setText("M??? AES");
        menuFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile2ActionPerformed(evt);
            }
        });
        menu1.add(menuFile2);

        menuFile3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuFile3.setText("M??? RSA");
        menuFile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile3ActionPerformed(evt);
            }
        });
        menu1.add(menuFile3);

        menuFile4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuFile4.setText("M??? BlowsFish");
        menuFile4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile4ActionPerformed(evt);
            }
        });
        menu1.add(menuFile4);

        menuFile5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_QUOTE, 0));
        menuFile5.setText("T???t t???t c??? m?? h??a");
        menuFile5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile5ActionPerformed(evt);
            }
        });
        menu1.add(menuFile5);

        menuFile6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuFile6.setText("Tho??t ch????ng tr??nh");
        menuFile6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile6ActionPerformed(evt);
            }
        });
        menu1.add(menuFile6);

        jMenuBar1.add(menu1);

        menu2.setText("Th??nh vi??n");

        menuMb1.setText("Ph???m Xu??n Kh??? Vy");
        menuMb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMb1ActionPerformed(evt);
            }
        });
        menu2.add(menuMb1);

        menuMb2.setText("Ph???m Quang Kh??nh");
        menuMb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMb2ActionPerformed(evt);
            }
        });
        menu2.add(menuMb2);

        menuMb3.setText("????o Qu???c ?????t");
        menuMb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMb3ActionPerformed(evt);
            }
        });
        menu2.add(menuMb3);

        jMenuBar1.add(menu2);

        menuBrief.setText("T??m t???t");

        menuBrief1.setText("AES");
        menuBrief1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBrief1ActionPerformed(evt);
            }
        });
        menuBrief.add(menuBrief1);

        menuBrief2.setText("RSA");
        menuBrief2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBrief2ActionPerformed(evt);
            }
        });
        menuBrief.add(menuBrief2);

        menuBrief3.setText("BowlFish");
        menuBrief3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBrief3ActionPerformed(evt);
            }
        });
        menuBrief.add(menuBrief3);

        jMenuBar1.add(menuBrief);

        menu3.setText("H?????ng d???n");

        menuHelp1.setText("AES");
        menuHelp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelp1ActionPerformed(evt);
            }
        });
        menu3.add(menuHelp1);

        menuHelp2.setText("RSA");
        menuHelp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelp2ActionPerformed(evt);
            }
        });
        menu3.add(menuHelp2);

        menuHelp3.setText("BowlFish");
        menuHelp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHelp3ActionPerformed(evt);
            }
        });
        menu3.add(menuHelp3);

        jMenuBar1.add(menu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAES, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRSA, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBowlsFish, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAES, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRSA, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBowlsFish, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAESActionPerformed
        AES.testGuiAES().setVisible(true);
    }//GEN-LAST:event_btnAESActionPerformed

    private void btnRSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRSAActionPerformed
        RSA.testGuiRSA().setVisible(true);
    }//GEN-LAST:event_btnRSAActionPerformed

    private void menuMb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMb2ActionPerformed
        JOptionPane.showMessageDialog(null, 
                "<html><span style='color:blue'>H??? v?? t??n: </span>Ph???m Quang Kh??nh</html>"
                + "\n" + "<html><span style='color:blue'>L???p: </span>D17_TH08  </html>"
                + "\n" + "<html><span style='color:blue'>MSSV: </span>DH51703549</html>"
                + "\n" + "<html><span style='color:blue'>Ph??n chia c??ng vi???c: </span>30%</html>" 
                + "\n" + "<html><span style='color:blue'>N???i dung: </span>Code AES. Test th??? ???ng d???ng.</html>"
                , "Th??nh vi??n 2", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuMb2ActionPerformed

    private void menuMb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMb3ActionPerformed
        JOptionPane.showMessageDialog(null, 
                "<html><span style='color:blue'>H??? v?? t??n: </span>????o Qu???c ?????t  </html>" 
                + "\n" + "<html><span style='color:blue'>L???p: </span>D17_TH08  </html>"
                + "\n" + "<html><span style='color:blue'>MSSV: </span>DH51703313</html>" 
                + "\n" + "<html><span style='color:blue'>Ph??n chia c??ng vi???c: </span>30%</html>" 
                + "\n" + "<html><span style='color:blue'>N???i dung: </span>Code RSA. L??m menu ch??nh.</html>"
                , "Th??nh vi??n 3", JOptionPane.PLAIN_MESSAGE);


    }//GEN-LAST:event_menuMb3ActionPerformed

    private void menuMb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMb1ActionPerformed
        JOptionPane.showMessageDialog(null,
                "<html><span style='color:blue'>H??? v?? t??n: </span>Ph???m Xu??n Kh??? Vy</html>" 
                + "\n" + "<html><span style='color:blue'>L???p: </span>D17_TH08  </html>"
                + "\n" + "<html><span style='color:blue'>MSSV: </span>DH51704561</html>"
                + "\n" + "<html><span style='color:blue'>Ph??n chia c??ng vi???c: </span>40%</html>" 
                + "\n" + "<html><span style='color:blue'>N???i dung: </span>Code Blowsfish. H??? tr??? RSA v?? AES.</html>"
                , "Th??nh vi??n 1", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuMb1ActionPerformed

    //m??? nhanh AES
    private void menuFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile2ActionPerformed
        AES.testGuiAES().setVisible(true);
    }//GEN-LAST:event_menuFile2ActionPerformed

    private void menuFile4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile4ActionPerformed
        Blowfish.testBlowFish().setVisible(true);
    }//GEN-LAST:event_menuFile4ActionPerformed

    //Gi???i thi???u
    private void menuFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile1ActionPerformed
        JOptionPane.showMessageDialog(null, "???ng d???ng d??ng ????? m?? h??a th??ng tin b??nh th?????ng th??nh d???ng kh??ng th??? hi???u v?? gi???i m?? ng?????c l???i."
                + "\nNh???m t??ng t??nh b???o m???t th??ng tin.\nG???m 3 phn????ng ph??p m?? h??a v?? gi???i m?? l??: AES, RSA, BowlsFish."
                ,  "GI???I THI???U" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuFile1ActionPerformed

    //t???t t???t c??? c??c form ??ang hi???n h??nh
    private void menuFile5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile5ActionPerformed
     
       AES.testGuiAES().setVisible(false);
       RSA.testGuiRSA().setVisible(false);
        Blowfish.testBlowFish().setVisible(false);
        
    }//GEN-LAST:event_menuFile5ActionPerformed

    //m??? nhanh RSA
    private void menuFile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile3ActionPerformed
        RSA.testGuiRSA().setVisible(true);
    }//GEN-LAST:event_menuFile3ActionPerformed

    //t???t ch????ng tr??nh nhanh
    private void menuFile6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile6ActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "B???n c?? ch???c ch???n mu???n tho??t", "EXIT?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        
        if(n == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuFile6ActionPerformed

    //H?????ng d???n s??? d???ng AES
    private void menuHelp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelp1ActionPerformed
        JOptionPane.showMessageDialog(null, "<html><span style='color:blue'>C?? 2 L???A CH???N ( CHOOSE KEY TYPE ) t???i key ????? tr?????c khi m?? h??a</span></html> \n"
                +"---------------------------------------------------------------------------------------------\n"
                + "<html>---*<span style='color:blue'> L???A CH???N 1 ( AUTO RANDOM ) -  D??NG AUTO SINH KEY </span>*--- </html>\n"
                + "Ch???n s??? b??t c???a key c???n t???o th??ng qua KEY RANDOM LENGTH \n"
                + "Sau ???? nh???n CREATE RANDOM KEY \n"
                + "Sau khi sinh key xong th?? m?? h??a nh?? b??nh th?????ng \n\n"
                + "<html>---*<span style='color:blue'> L???A CH???N 2( HAND ) - T??? NH???P KEY </span>*---</html>\n"
                + "Nh???p key b???ng tay v??o ?? SECRET KEY HAND N"
                + "L??u ?? key nh???p c?? ????? d??i 128 bit ho???c 192 bit ho???c 256 bit \n"
                + "Sau khi nh???p key xong th?? m?? h??a nh?? b??nh th?????ng \n"
                + "--------------------------.-----------------------", "H?????NG D???N AES", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuHelp1ActionPerformed

    //H?????ng d???n s??? d???ng RSA
    private void menuHelp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelp2ActionPerformed
        JOptionPane.showMessageDialog(null,"<html><span style='color:blue'>NH???P</span> ho???c <span style='color:blue'>NH???N RANDOM KEY</span> ????? sinh KEY. </html>"
                + "\nNh???p th??ng tin v??o PlantText \n<html><span style='color:blue'>Nh???n ENCRYPTION</span> ????? ti???n h??nh <span style='color:blue'>M?? H??A</span>.</html>"
                + "\n<html><span style='color:blue'>Nh???n DECRYPTION</span> ????? ti???n h??nh <span style='color:blue'>GI???I M??</span>.</html>"
                ,"H?????NG D???N RSA",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuHelp2ActionPerformed

    
    //T??m t???t n???i dung AES
    private void menuBrief1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrief1ActionPerformed
        JOptionPane.showMessageDialog(null,"- AES(Advanced Encryption Standard) l?? m???t m???t m?? kh???i(Block Cipher)."
                + "\n- Thu???t to??n ???????c x??y d???ng d???a tr??n Rijndael Cipher ph??t tri???n b???i 2 nh?? m???t m?? h???c ng?????i B???: Joan Daemen v?? Vincent Rijmen."
                + "\n- AES l??m vi???c v???i c??c kh???i d??? li???u 128bit v?? ????? d??i kh??a 128bit, 192bit ho???c 256bit. "
                + "\n- T??y thu???c v??o ????? d??i c???a kh??a khi s??? d???ng 128bit, 192bit hay 256bit m?? thu???t to??n ???????c th???c hi???n v???i s??? l???n l???p kh??c nhau."
                ,"T??M T???T AES",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuBrief1ActionPerformed

    //T??m t???t n???i dung RSA
    private void menuBrief2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrief2ActionPerformed
        JOptionPane.showMessageDialog(null,"- RSA l?? m???t h??? m?? h??a b???t ?????i x???ng."
                +"\n- Thu???t to??n  ???????c ph??t tri???n b???i Ron Rivest, Adi Shamir v?? Leonard Adleman (t??n c???a n?? c??ng ch??nh l?? t??n vi???t t???t c???a 3 t??c gi??? n??y)."
                +"\n- RSA ???????c s??? d???ng r???ng r??i trong c??ng t??c m?? ho?? v?? c??ng ngh??? ch??? k?? ??i???n t???."
                +"\n- S??? d???ng c???p kh??a Public Key v?? Private Key."
                +"\n- Ho???t ?????ng c???a RSA d???a tr??n 4 b?????c ch??nh: sinh kh??a, chia s??? key, m?? h??a v?? gi???i m??."
                ,"T??M T???T RSA",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuBrief2ActionPerformed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        JOptionPane.showMessageDialog(null, "???ng d???ng d??ng ????? m?? h??a th??ng tin b??nh th?????ng th??nh d???ng kh??ng th??? hi???u v?? gi???i m?? ng?????c l???i."
                + "\nNh???m t??ng t??nh b???o m???t th??ng tin.\nG???m 3 phn????ng ph??p m?? h??a v?? gi???i m?? l??: AES, RSA, BowlFish."
                ,  "GI???I THI???U" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel1MouseReleased

    private void menuHelp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelp3ActionPerformed
        JOptionPane.showMessageDialog(rootPane, 
                 "<html>- <span style='color:blue'> T???o KEY </span> tr?????c khi M?? H??A th?? m???c <span style='color:blue'> ho???c</span> n???u ???? c?? KEY r???i th?? <span style='color:blue'>nh???p LINK KEY</span> (*.txt).</html> \n"
                +"<html>- Ch???n <span style='color:blue'> th?? m???c </span> ch???a FILE ????? <span style='color:blue'>M?? H??A</span>.</html> \n"
                +"<html>- Ch???n <span style='color:blue'> th?? m???c </span> ch???a c??c <span style='color:blue'>FILE ???? M?? H??A</span> ????? <span style='color:blue'>GI???I M??</span>.</html> \n"
                +"(PH???I CH???N ????NG KEY M?? B???N ???? M?? H??A TR?????C ???? M???I C?? TH??? GI???I M?? ???????C) \n"
                +"<html>- H??? th???ng s??? <span style='color:blue'> b??o l???i </span> n???u ch???n <span style='color:blue'>th?? m???c kh??ng h???p l???</span> . </html>"
                +"\n<html>- <span style='color:blue'> Kh??ng ???????c l??u KEY </span> t???i c??c th?? m???c M?? H??A ho???c GI???I M?? ho???c FOLDER ????? M?? H??A.</html>", "H?????NG D???N S??? D???NG", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuHelp3ActionPerformed

    private void btnBowlsFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBowlsFishActionPerformed
        Blowfish.testBlowFish().setVisible(true);
    }//GEN-LAST:event_btnBowlsFishActionPerformed

    private void menuBrief3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrief3ActionPerformed
        JOptionPane.showMessageDialog(null, "Blowfish l?? m???t m???t m?? kh???i kh??a ?????i x???ng, ???????c thi???t k??? v??o n??m 1993 b???i Bruce Schneier. "
                + "\nBlowfish cung c???p m???t t???c ????? m?? h??a t???t trong ph???n m???m v?? cho ?????n nay kh??ng c?? s??? ph??n t??ch m?? h??a hi???u qu??? n??o c???a n??"
                + "\nBlowfish c?? k??ch th?????c kh???i 64 bit v?? ????? d??i kh??a thay ?????i t??? 32 bit l??n t???i 448 bit."             
                ,  "T??m t???t BowlFish" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuBrief3ActionPerformed

   
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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAES;
    private javax.swing.JButton btnBowlsFish;
    private javax.swing.JButton btnRSA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menu1;
    private javax.swing.JMenu menu2;
    private javax.swing.JMenu menu3;
    private javax.swing.JMenu menuBrief;
    private javax.swing.JMenuItem menuBrief1;
    private javax.swing.JMenuItem menuBrief2;
    private javax.swing.JMenuItem menuBrief3;
    private javax.swing.JMenuItem menuFile1;
    private javax.swing.JMenuItem menuFile2;
    private javax.swing.JMenuItem menuFile3;
    private javax.swing.JMenuItem menuFile4;
    private javax.swing.JMenuItem menuFile5;
    private javax.swing.JMenuItem menuFile6;
    private javax.swing.JMenuItem menuHelp1;
    private javax.swing.JMenuItem menuHelp2;
    private javax.swing.JMenuItem menuHelp3;
    private javax.swing.JMenuItem menuMb1;
    private javax.swing.JMenuItem menuMb2;
    private javax.swing.JMenuItem menuMb3;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("iconMeo.jpg")));
    }
}
