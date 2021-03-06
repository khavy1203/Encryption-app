
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.stage.FileChooser;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
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
public class Blowfish extends javax.swing.JFrame {

    private static Blowfish checkBlowFish = null;
    public Blowfish() {
        initComponents();
    }

    public static Blowfish testBlowFish(){
        if(checkBlowFish == null){
            checkBlowFish = new Blowfish();
        }
        return checkBlowFish;
    }
    private String cutURLfile(String fn) {
        return fn.substring(fn.lastIndexOf("\\") + 1, fn.length());
    }

    private void fetchChildmh(File file, String strkey) throws BadPaddingException {

        if (!file.isDirectory()) {

            try {
                SecretKeySpec key = new SecretKeySpec(strkey.getBytes("UTF-8"), "Blowfish");
                Cipher cipher = Cipher.getInstance("Blowfish");
                cipher.init(Cipher.ENCRYPT_MODE, key);
                FileInputStream fis = null;
                byte[] bFile = new byte[(int) file.length()];
                fis = new FileInputStream(file);
                fis.read(bFile);
                fis.close();
                byte[] encryp = cipher.doFinal(bFile);

                FileOutputStream fos = null;

                fos = new FileOutputStream(txtlinkluumh.getText() + "\\" + cutURLfile(file.getAbsolutePath()));
                fos.write(encryp);
                fos.close();
            } catch (UnsupportedEncodingException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C CH???A FILE V?? KEY ???? CH???N \n NULL");
                return;
            } catch (NoSuchAlgorithmException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C CH???A FILE V?? KEY ???? CH???N \n NULL");
                return;
            } catch (NoSuchPaddingException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C CH???A FILE V?? KEY ???? CH???N \n NULL");
                return;
            } catch (InvalidKeyException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C CH???A FILE V?? KEY ???? CH???N \n NULL");
                return;
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C CH???A FILE V?? KEY ???? CH???N \n NULL");
                return;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C CH???A FILE V?? KEY ???? CH???N \n NULL");
                return;
            } catch (IllegalBlockSizeException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C CH???A FILE V?? KEY ???? CH???N \n NULL");
                return;
            }

        }

        if (file.isDirectory()) {

            File[] children = file.listFiles();

            for (File child : children) {
                // ????? quy (Recursive)
                this.fetchChildmh(child, strkey);
            }
        }

    }

    private void fetchChildgm(File file, String strkey) {

        if (file.isDirectory()) {

            File[] children = file.listFiles();

            for (File child : children) {

                try {
                    SecretKeySpec key = new SecretKeySpec(strkey.getBytes("UTF-8"), "Blowfish");
                    Cipher cipher = Cipher.getInstance("Blowfish");
                    cipher.init(Cipher.DECRYPT_MODE, key);
                    FileInputStream fis = null;
                    byte[] bFile = new byte[(int) child.length()];
                    fis = new FileInputStream(child);
                    fis.read(bFile);
                    fis.close();
                    byte[] decryp = cipher.doFinal(bFile);

                    FileOutputStream fos = null;

                    fos = new FileOutputStream(txtthumucluugiaima.getText() + "\\" + cutURLfile(child.getAbsolutePath()));
                    fos.write(decryp);

                    fos.close();
                } catch (UnsupportedEncodingException ex) {
                    JOptionPane.showMessageDialog(rootPane, " GI???I M?? TH?? M???C TH??T B???I \n C???N KI???M TRA C??C TH?? M???C ???? CH???N V?? KEY\n  NULL");
                    return;
                } catch (NoSuchAlgorithmException ex) {
                    JOptionPane.showMessageDialog(rootPane, "GI???I M?? TH?? M???C TH??T B???I \n C???N KI???M TRA C??C TH?? M???C ???? CH???N V?? KEY\n  NULL");
                    return;
                } catch (NoSuchPaddingException ex) {
                    JOptionPane.showMessageDialog(rootPane, "GI???I M?? TH?? M???C TH??T B???I \n C???N KI???M TRA C??C TH?? M???C ???? CH???N V?? KEY\n  NULL");
                    return;
                } catch (InvalidKeyException ex) {
                    JOptionPane.showMessageDialog(rootPane, "GI???I M?? TH?? M???C TH??T B???I \n C???N KI???M TRA C??C TH?? M???C ???? CH???N V?? KEY\n  NULL");
                    return;
                } catch (FileNotFoundException ex) {
                    JOptionPane.showMessageDialog(rootPane, "GI???I M?? TH?? M???C TH??T B???I \n C???N KI???M TRA C??C TH?? M???C ???? CH???N V?? KEY\n  NULL");
                    return;
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, "GI???I M?? TH?? M???C TH??T B???I \n C???N KI???M TRA C??C TH?? M???C ???? CH???N V?? KEY\n  NULL");
                    return;
                } catch (IllegalBlockSizeException ex) {
                    JOptionPane.showMessageDialog(rootPane, "GI???I M?? TH?? M???C TH??T B???I \n C???N KI???M TRA C??C TH?? M???C ???? CH???N V?? KEY\n  NULL");
                    return;
                } catch (BadPaddingException ex) {
                    JOptionPane.showMessageDialog(rootPane, "GI???I M?? TH?? M???C TH??T B???I \n C???N KI???M TRA C??C TH?? M???C ???? CH???N V?? KEY\n  NULL");
                    return;
                }
            }
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

        jLabel1 = new javax.swing.JLabel();
        mhfile = new javax.swing.JButton();
        inputkey = new javax.swing.JButton();
        btncreatekey = new javax.swing.JButton();
        txtkeycreate = new javax.swing.JTextField();
        btngiaima = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtlinkkeycreate = new javax.swing.JLabel();
        txtnhaplinkkey = new javax.swing.JLabel();
        txtlinkluumh = new javax.swing.JLabel();
        txtthumucmahoa = new javax.swing.JLabel();
        txtthumucluugiaima = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnthumucluucgiaima = new javax.swing.JButton();
        txtthumuccangiaima = new javax.swing.JLabel();
        btnthumucgiaima = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtnamekey = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BLOWFISH");

        mhfile.setBackground(new java.awt.Color(0, 0, 0));
        mhfile.setForeground(new java.awt.Color(240, 240, 240));
        mhfile.setText("M?? H??A TH?? M???C");
        mhfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mhfileActionPerformed(evt);
            }
        });

        inputkey.setText("Ch???n ???????ng d???n");
        inputkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputkeyActionPerformed(evt);
            }
        });

        btncreatekey.setBackground(new java.awt.Color(0, 0, 0));
        btncreatekey.setForeground(new java.awt.Color(240, 240, 240));
        btncreatekey.setText("T???O KEY");
        btncreatekey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncreatekeyActionPerformed(evt);
            }
        });

        txtkeycreate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtkeycreate.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btngiaima.setBackground(new java.awt.Color(0, 0, 0));
        btngiaima.setForeground(new java.awt.Color(240, 240, 240));
        btngiaima.setText("GI???I M?? TH?? M???C");
        btngiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiaimaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Key: ");

        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Link l??u file:");

        jButton2.setText("Ch???n ???????ng d???n");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Ch???n ???????ng d???n");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtlinkkeycreate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtlinkkeycreate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtnhaplinkkey.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtnhaplinkkey.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtlinkluumh.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtlinkluumh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtthumucmahoa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtthumucmahoa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        txtthumucluugiaima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtthumucluugiaima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setText("-------->");

        btnthumucluucgiaima.setText("Ch???n ???????ng d???n");
        btnthumucluucgiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthumucluucgiaimaActionPerformed(evt);
            }
        });

        txtthumuccangiaima.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtthumuccangiaima.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnthumucgiaima.setText("Ch???n ???????ng d???n");
        btnthumucgiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthumucgiaimaActionPerformed(evt);
            }
        });

        jLabel3.setText("-------->");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("T??n file Key: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("H?????NG D???N S??? D???NG");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel8MouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 102));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("----- KEY -----");

        jLabel10.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 102));
        jLabel10.setText("----- M?? H??A -----");

        jLabel11.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("-----GI???I M?? -----");

        jLabel12.setText("--------------------------------------------------------------------------------------------------------------");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 255));
        jLabel13.setText("Th?? m???c c???n m?? h??a: ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 255));
        jLabel14.setText("V??? tr?? l??u file");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 255));
        jLabel15.setText("Th?? m???c c???n gi???i m??: ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 255));
        jLabel16.setText("V??? tr?? l??u files c???n gi???i m??: ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 102));
        jLabel18.setText("T??? NH???P KEY");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 102));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("C?? S???N FILE KEY");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 255));
        jLabel20.setText("File Key: ");

        jLabel21.setText("--------------------------------------------------------------------------------------------------------------");

        jLabel22.setText("--------------------------------------------------------------------------------------------------------------");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("L??U ??!");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel6MouseReleased(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem1.setText("M??? menu");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMenuItem2.setText("M??? AES");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jMenuItem3.setText("M??? RSA");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jMenuItem4.setText("M??? BlowFish");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_BACK_QUOTE, 0));
        jMenuItem5.setText("T???t t???t c??? m?? h??a");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem6.setText("T???t ch????ng tr??nh");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtlinkluumh, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtthumucmahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel15)
                                    .addComponent(txtthumuccangiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)
                                    .addComponent(txtthumucluugiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnthumucluucgiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnthumucgiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btngiaima, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(mhfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtkeycreate, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(txtnamekey, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(btncreatekey, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputkey, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(txtnhaplinkkey, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19)
                .addGap(245, 245, 245))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtlinkkeycreate, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(jLabel10))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(jLabel21)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(382, 382, 382))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(3, 3, 3)
                .addComponent(jLabel22)
                .addGap(5, 5, 5)
                .addComponent(jLabel9)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtnhaplinkkey, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(inputkey, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtlinkkeycreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnamekey, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtkeycreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btncreatekey, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtthumucmahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlinkluumh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mhfile, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(9, 9, 9)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtthumuccangiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnthumucgiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(jLabel16))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnthumucluucgiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtthumucluugiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btngiaima, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiaimaActionPerformed
        if (txtnhaplinkkey.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "B???N CH??A CH???N FILE KEY");
            return;
        }
        if (txtthumucluugiaima.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "B???N CH??A CH???N TH?? M???C ????? L??U C??C FILES GI???I M??");
            return;
        }
        if (txtthumuccangiaima.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "B???N CH??A CH???N TH?? M???C ????? GI???I M??");
            return;
        }
        FileInputStream fis = null;
        try {
            // TODO add your handling code here:
            File f = new File(txtnhaplinkkey.getText());
            fis = new FileInputStream(f);
            byte[] bFile = new byte[(int) f.length()];
            fis.read(bFile);
            fis.close();
            File filegm = new File(txtthumuccangiaima.getText());
            fetchChildgm(filegm, new String(Base64.getDecoder().decode(bFile)));
            JOptionPane.showMessageDialog(rootPane, "GI???I M?? TH??NH C??NG");
            return;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA KEY ???? CH???N \n NULL");
            return;
        }

    }//GEN-LAST:event_btngiaimaActionPerformed

    private void btncreatekeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncreatekeyActionPerformed

        if (txtkeycreate.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "CH??A NH???P KEY ????? T???O");
            return;
        }
        if (txtnamekey.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "CH??A NH???P T??N FILE ????? L??U KEY");
            return;
        }
        if (!txtnamekey.getText().contains(".txt")) {
            JOptionPane.showMessageDialog(rootPane, "CH??A NH???P T??N FILE ????? L??U KEY D?????I D???NG .txt \n V?? D???: KEY123.txt");
            return;
        }
        JFileChooser c = new JFileChooser();
        c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {

            try {
                String filename = c.getSelectedFile().toString();

                FileOutputStream fis = new FileOutputStream(filename + "\\" + txtnamekey.getText());
                byte[] b = Base64.getEncoder().encode(txtkeycreate.getText().getBytes());
                fis.write(b);
                fis.close();
                txtlinkkeycreate.setText(filename + "\\" + txtnamekey.getText());
                txtnhaplinkkey.setText(filename + "\\" + txtnamekey.getText());
                JOptionPane.showMessageDialog(rootPane, "T???O KEY TH??NH C??NG");
                return;

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C ???? CH???N \n NULL");
                return;
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA C??C TH?? M???C ???? CH???N \n NULL");
                return;

            }
        }

    }//GEN-LAST:event_btncreatekeyActionPerformed

    private void mhfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mhfileActionPerformed

        if (txtnhaplinkkey.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "B???N CH??A CH???N FILE KEY");
            return;
        }

        if (txtlinkluumh.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "B???N CH??A CH???N TH?? M???C ????? L??U FILE M?? H??A");
            return;
        }
        if (txtthumucmahoa.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "B???N CH??A CH???N TH?? M???C ????? M?? H??A");
            return;
        }
        FileInputStream fis = null;
        try {
            File f = new File(txtnhaplinkkey.getText());
            fis = new FileInputStream(f);
            byte[] bFile = new byte[(int) f.length()];
            fis.read(bFile);
            fis.close();
            File filethumucmahoa = new File(txtthumucmahoa.getText());
            fetchChildmh(filethumucmahoa, new String(Base64.getDecoder().decode(bFile)));
            JOptionPane.showMessageDialog(rootPane, "M?? H??A TH??NH C??NG");
            return;
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {

        } catch (BadPaddingException ex) {

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(rootPane, "C???N KI???M TRA KEY ???? CH???N \n NULL");
            return;
        }


    }//GEN-LAST:event_mhfileActionPerformed

    private void inputkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputkeyActionPerformed
        // TODO add your handling code here:
        JFileChooser c = new JFileChooser();
        c.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {

            String con = c.getSelectedFile().toString();
            txtnhaplinkkey.setText(con);
        }


    }//GEN-LAST:event_inputkeyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JFileChooser c = new JFileChooser();
        c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {

            String con = c.getSelectedFile().toString();
            txtlinkluumh.setText(con);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JFileChooser c = new JFileChooser();
        c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {

            String con = c.getSelectedFile().toString();
            txtthumucmahoa.setText(con);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnthumucluucgiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthumucluucgiaimaActionPerformed
        // TODO add your handling code here:
        JFileChooser c = new JFileChooser();
        c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {

            String con = c.getSelectedFile().toString();
            txtthumucluugiaima.setText(con);
        }
    }//GEN-LAST:event_btnthumucluucgiaimaActionPerformed

    private void btnthumucgiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthumucgiaimaActionPerformed
        // TODO add your handling code here:
        JFileChooser c = new JFileChooser();
        c.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int rVal = c.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {

            String con = c.getSelectedFile().toString();
            txtthumuccangiaima.setText(con);
        }
    }//GEN-LAST:event_btnthumucgiaimaActionPerformed

    private void jLabel8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseReleased
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(rootPane, "-T???O KEY TR?????C KHI M??  H??A TH?? M???C C??N N???U ???? C?? KEY R???I TH?? NH???P LINK KEY (*.txt) \n"
                + "-CH???N TH?? M???C CH???A C??C FILE ????? M?? H??A \n"
                +"-CH???N TH?? M???C CH???A C??C FILE ???? M?? H??A ????? GI???I M?? \n (PH???I CH???N ????NG KEY M?? B???N ???? M?? H??A TR?????C ???? M???I C?? TH??? GI???I M?? ???????C) \n"
                + "-H??? TH???NG S??? B??O L???I N???U CH???N TH?? M???C KH??NG H???P L??? \n "
                +"-KH??NG ???????C L??U KEY T???I C??C TH?? M???C M?? H??A HO???C GI???I M?? HO???C FOLDER ????? M?? H??A ", "H?????NG D???N S??? D???NG", JOptionPane.PLAIN_MESSAGE);
        
        
    }//GEN-LAST:event_jLabel8MouseReleased

    private void jLabel6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseReleased
        JOptionPane.showMessageDialog(null, "Kh??ng n??n l??u file ngo??i DESKTOP. N??n T???O 1 th?? m???c r???i L??U v??o th?? m???c ???? cho d??? d??ng trong vi???c M?? H??A  v?? GI???I M??!","L??u ??",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jLabel6MouseReleased

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        RSA.testGuiRSA().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null,"Form BlowFish ???? ho???t ?????ng!"
                ,"Th??ng b??o",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        MainGUI.testMainGUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       AES.testGuiAES().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        AES.testGuiAES().setVisible(false);
       RSA.testGuiRSA().setVisible(false);
       Blowfish.testBlowFish().setVisible(false);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
       int n = JOptionPane.showConfirmDialog(null, "B???n c?? ch???c ch???n mu???n tho??t", "EXIT?", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null);
        
        if(n == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncreatekey;
    private javax.swing.JButton btngiaima;
    private javax.swing.JButton btnthumucgiaima;
    private javax.swing.JButton btnthumucluucgiaima;
    private javax.swing.JButton inputkey;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JButton mhfile;
    private javax.swing.JTextField txtkeycreate;
    private javax.swing.JLabel txtlinkkeycreate;
    private javax.swing.JLabel txtlinkluumh;
    private javax.swing.JTextField txtnamekey;
    private javax.swing.JLabel txtnhaplinkkey;
    private javax.swing.JLabel txtthumuccangiaima;
    private javax.swing.JLabel txtthumucluugiaima;
    private javax.swing.JLabel txtthumucmahoa;
    // End of variables declaration//GEN-END:variables
}
