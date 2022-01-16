
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
        jLabel1.setText("MÃ HÓA ỨNG DỤNG");
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
        menuFile1.setText("Giới thiệu");
        menuFile1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile1ActionPerformed(evt);
            }
        });
        menu1.add(menuFile1);

        menuFile2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        menuFile2.setText("Mở AES");
        menuFile2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile2ActionPerformed(evt);
            }
        });
        menu1.add(menuFile2);

        menuFile3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        menuFile3.setText("Mở RSA");
        menuFile3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile3ActionPerformed(evt);
            }
        });
        menu1.add(menuFile3);

        menuFile4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        menuFile4.setText("Mở BlowsFish");
        menuFile4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile4ActionPerformed(evt);
            }
        });
        menu1.add(menuFile4);

        menuFile5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_QUOTE, 0));
        menuFile5.setText("Tắt tất cả mã hóa");
        menuFile5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile5ActionPerformed(evt);
            }
        });
        menu1.add(menuFile5);

        menuFile6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        menuFile6.setText("Thoát chương trình");
        menuFile6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFile6ActionPerformed(evt);
            }
        });
        menu1.add(menuFile6);

        jMenuBar1.add(menu1);

        menu2.setText("Thành viên");

        menuMb1.setText("Phạm Xuân Khả Vy");
        menuMb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMb1ActionPerformed(evt);
            }
        });
        menu2.add(menuMb1);

        menuMb2.setText("Phạm Quang Khánh");
        menuMb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMb2ActionPerformed(evt);
            }
        });
        menu2.add(menuMb2);

        menuMb3.setText("Đào Quốc Đạt");
        menuMb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuMb3ActionPerformed(evt);
            }
        });
        menu2.add(menuMb3);

        jMenuBar1.add(menu2);

        menuBrief.setText("Tóm tắt");

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

        menu3.setText("Hướng dẫn");

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
                "<html><span style='color:blue'>Họ và tên: </span>Phạm Quang Khánh</html>"
                + "\n" + "<html><span style='color:blue'>Lớp: </span>D17_TH08  </html>"
                + "\n" + "<html><span style='color:blue'>MSSV: </span>DH51703549</html>"
                + "\n" + "<html><span style='color:blue'>Phân chia công việc: </span>30%</html>" 
                + "\n" + "<html><span style='color:blue'>Nội dung: </span>Code AES. Test thử ứng dụng.</html>"
                , "Thành viên 2", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuMb2ActionPerformed

    private void menuMb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMb3ActionPerformed
        JOptionPane.showMessageDialog(null, 
                "<html><span style='color:blue'>Họ và tên: </span>Đào Quốc Đạt  </html>" 
                + "\n" + "<html><span style='color:blue'>Lớp: </span>D17_TH08  </html>"
                + "\n" + "<html><span style='color:blue'>MSSV: </span>DH51703313</html>" 
                + "\n" + "<html><span style='color:blue'>Phân chia công việc: </span>30%</html>" 
                + "\n" + "<html><span style='color:blue'>Nội dung: </span>Code RSA. Làm menu chính.</html>"
                , "Thành viên 3", JOptionPane.PLAIN_MESSAGE);


    }//GEN-LAST:event_menuMb3ActionPerformed

    private void menuMb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuMb1ActionPerformed
        JOptionPane.showMessageDialog(null,
                "<html><span style='color:blue'>Họ và tên: </span>Phạm Xuân Khả Vy</html>" 
                + "\n" + "<html><span style='color:blue'>Lớp: </span>D17_TH08  </html>"
                + "\n" + "<html><span style='color:blue'>MSSV: </span>DH51704561</html>"
                + "\n" + "<html><span style='color:blue'>Phân chia công việc: </span>40%</html>" 
                + "\n" + "<html><span style='color:blue'>Nội dung: </span>Code Blowsfish. Hỗ trợ RSA và AES.</html>"
                , "Thành viên 1", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuMb1ActionPerformed

    //mở nhanh AES
    private void menuFile2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile2ActionPerformed
        AES.testGuiAES().setVisible(true);
    }//GEN-LAST:event_menuFile2ActionPerformed

    private void menuFile4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile4ActionPerformed
        Blowfish.testBlowFish().setVisible(true);
    }//GEN-LAST:event_menuFile4ActionPerformed

    //Giới thiệu
    private void menuFile1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile1ActionPerformed
        JOptionPane.showMessageDialog(null, "Ứng dụng dùng để mã hóa thông tin bình thường thành dạng không thể hiểu và giải mã ngược lại."
                + "\nNhằm tăng tính bảo mật thông tin.\nGồm 3 phnương pháp mã hóa và giải mã là: AES, RSA, BowlsFish."
                ,  "GIỚI THIỆU" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuFile1ActionPerformed

    //tắt tất cả các form đang hiện hành
    private void menuFile5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile5ActionPerformed
     
       AES.testGuiAES().setVisible(false);
       RSA.testGuiRSA().setVisible(false);
        Blowfish.testBlowFish().setVisible(false);
        
    }//GEN-LAST:event_menuFile5ActionPerformed

    //mở nhanh RSA
    private void menuFile3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile3ActionPerformed
        RSA.testGuiRSA().setVisible(true);
    }//GEN-LAST:event_menuFile3ActionPerformed

    //tắt chương trình nhanh
    private void menuFile6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFile6ActionPerformed
        int n = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thoát", "EXIT?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        
        if(n == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_menuFile6ActionPerformed

    //Hướng dẫn sử dụng AES
    private void menuHelp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelp1ActionPerformed
        JOptionPane.showMessageDialog(null, "<html><span style='color:blue'>Có 2 LỰA CHỌN ( CHOOSE KEY TYPE ) tại key để trước khi mã hóa</span></html> \n"
                +"---------------------------------------------------------------------------------------------\n"
                + "<html>---*<span style='color:blue'> LỰA CHỌN 1 ( AUTO RANDOM ) -  DÙNG AUTO SINH KEY </span>*--- </html>\n"
                + "Chọn số bít của key cần tạo thông qua KEY RANDOM LENGTH \n"
                + "Sau đó nhấn CREATE RANDOM KEY \n"
                + "Sau khi sinh key xong thì mã hóa như bình thường \n\n"
                + "<html>---*<span style='color:blue'> LỰA CHỌN 2( HAND ) - TỰ NHẬP KEY </span>*---</html>\n"
                + "Nhập key bằng tay vào ô SECRET KEY HAND N"
                + "Lưu ý key nhập có độ dài 128 bit hoặc 192 bit hoặc 256 bit \n"
                + "Sau khi nhập key xong thì mã hóa như bình thường \n"
                + "--------------------------.-----------------------", "HƯỚNG DẪN AES", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuHelp1ActionPerformed

    //Hướng dấn sử dụng RSA
    private void menuHelp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelp2ActionPerformed
        JOptionPane.showMessageDialog(null,"<html><span style='color:blue'>NHẬP</span> hoặc <span style='color:blue'>NHẤN RANDOM KEY</span> để sinh KEY. </html>"
                + "\nNhập thông tin vào PlantText \n<html><span style='color:blue'>Nhấn ENCRYPTION</span> để tiến hành <span style='color:blue'>MÃ HÓA</span>.</html>"
                + "\n<html><span style='color:blue'>Nhấn DECRYPTION</span> để tiến hành <span style='color:blue'>GIẢI MÃ</span>.</html>"
                ,"HƯỚNG DẪN RSA",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuHelp2ActionPerformed

    
    //Tóm tắt nội dung AES
    private void menuBrief1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrief1ActionPerformed
        JOptionPane.showMessageDialog(null,"- AES(Advanced Encryption Standard) là một mật mã khối(Block Cipher)."
                + "\n- Thuật toán được xây dựng dựa trên Rijndael Cipher phát triển bởi 2 nhà mật mã học người Bỉ: Joan Daemen và Vincent Rijmen."
                + "\n- AES làm việc với các khối dữ liệu 128bit và độ dài khóa 128bit, 192bit hoặc 256bit. "
                + "\n- Tùy thuộc vào độ dài của khóa khi sử dụng 128bit, 192bit hay 256bit mà thuật toán được thực hiện với số lần lặp khác nhau."
                ,"TÓM TẮT AES",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuBrief1ActionPerformed

    //Tóm tắt nội dung RSA
    private void menuBrief2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrief2ActionPerformed
        JOptionPane.showMessageDialog(null,"- RSA là một hệ mã hóa bất đối xứng."
                +"\n- Thuật toán  được phát triển bởi Ron Rivest, Adi Shamir và Leonard Adleman (tên của nó cũng chính là tên viết tắt của 3 tác giả này)."
                +"\n- RSA được sử dụng rộng rãi trong công tác mã hoá và công nghệ chữ ký điện tử."
                +"\n- Sử dụng cặp khóa Public Key và Private Key."
                +"\n- Hoạt động của RSA dựa trên 4 bước chính: sinh khóa, chia sẻ key, mã hóa và giải mã."
                ,"TÓM TẮT RSA",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuBrief2ActionPerformed

    private void jLabel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseReleased
        JOptionPane.showMessageDialog(null, "Ứng dụng dùng để mã hóa thông tin bình thường thành dạng không thể hiểu và giải mã ngược lại."
                + "\nNhằm tăng tính bảo mật thông tin.\nGồm 3 phnương pháp mã hóa và giải mã là: AES, RSA, BowlFish."
                ,  "GIỚI THIỆU" , JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel1MouseReleased

    private void menuHelp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHelp3ActionPerformed
        JOptionPane.showMessageDialog(rootPane, 
                 "<html>- <span style='color:blue'> Tạo KEY </span> trước khi MÃ HÓA thư mục <span style='color:blue'> hoặc</span> nếu đã có KEY rồi thì <span style='color:blue'>nhập LINK KEY</span> (*.txt).</html> \n"
                +"<html>- Chọn <span style='color:blue'> thư mục </span> chứa FILE để <span style='color:blue'>MÃ HÓA</span>.</html> \n"
                +"<html>- Chọn <span style='color:blue'> thư mục </span> chứa các <span style='color:blue'>FILE đã MÃ HÓA</span> để <span style='color:blue'>GIẢI MÃ</span>.</html> \n"
                +"(PHẢI CHỌN ĐÚNG KEY MÀ BẠN ĐÃ MÃ HÓA TRƯỚC ĐÓ MỚI CÓ THỂ GIẢI MÃ ĐƯỢC) \n"
                +"<html>- Hệ thống sẽ <span style='color:blue'> báo lỗi </span> nếu chọn <span style='color:blue'>thư mục không hợp lệ</span> . </html>"
                +"\n<html>- <span style='color:blue'> Không được lưu KEY </span> tại các thư mục MÃ HÓA hoặc GIẢI MÃ hoặc FOLDER để MÃ HÓA.</html>", "HƯỚNG DẪN SỬ DỤNG", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_menuHelp3ActionPerformed

    private void btnBowlsFishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBowlsFishActionPerformed
        Blowfish.testBlowFish().setVisible(true);
    }//GEN-LAST:event_btnBowlsFishActionPerformed

    private void menuBrief3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBrief3ActionPerformed
        JOptionPane.showMessageDialog(null, "Blowfish là một mật mã khối khóa đối xứng, được thiết kế vào năm 1993 bởi Bruce Schneier. "
                + "\nBlowfish cung cấp một tốc độ mã hóa tốt trong phần mềm và cho đến nay không có sự phân tích mã hóa hiệu quả nào của nó"
                + "\nBlowfish có kích thước khối 64 bit và độ dài khóa thay đổi từ 32 bit lên tới 448 bit."             
                ,  "Tóm tắt BowlFish" , JOptionPane.INFORMATION_MESSAGE);
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
