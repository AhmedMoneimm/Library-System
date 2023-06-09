package frontend;


import static frontend.Validation.*;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AddLibarian extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame5
     */
    
    public AddLibarian() {
        initComponents();
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        librarianID = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        phonenumber = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        phonenumberText = new javax.swing.JTextField();
        add = new javax.swing.JLabel();
        addressText = new javax.swing.JTextField();
        librarianIDText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, -1, -1));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(140, 56, 56));
        title.setText("Admin Role");
        title.setPreferredSize(new java.awt.Dimension(100, 44));
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 190, -1));

        subtitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        subtitle.setForeground(new java.awt.Color(140, 56, 56));
        subtitle.setText("Add librarian");
        getContentPane().add(subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        librarianID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        librarianID.setForeground(new java.awt.Color(140, 56, 56));
        librarianID.setText("Librarian ID");
        getContentPane().add(librarianID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(140, 56, 56));
        name.setText("Librarian name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        email.setForeground(new java.awt.Color(140, 56, 56));
        email.setText("Email");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        address.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        address.setForeground(new java.awt.Color(140, 56, 56));
        address.setText("Address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        phonenumber.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phonenumber.setForeground(new java.awt.Color(140, 56, 56));
        phonenumber.setText("Phone number");
        getContentPane().add(phonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        emailText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(emailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 180, -1));

        phonenumberText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phonenumberText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(phonenumberText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 180, -1));

        add.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        add.setForeground(new java.awt.Color(140, 56, 56));
        add.setText("Add");
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, -1, -1));

        addressText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        addressText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(addressText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 180, -1));

        librarianIDText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        librarianIDText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(librarianIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, -1));

        nameText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nameText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(nameText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 180, -1));

        background.setBackground(new java.awt.Color(242, 239, 234));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/background.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        new AdminMain();
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        
        if(emailText.getText().isEmpty() || phonenumberText.getText().isEmpty() || addressText.getText().isEmpty() || librarianIDText.getText().isEmpty() || nameText.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Some fields are empty","EMPTY FIELDS",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!hasNoSpace(librarianIDText.getText())){
            JOptionPane.showMessageDialog(this,"Enter valid librarianID","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!isAlphabetic(nameText.getText())){
            JOptionPane.showMessageDialog(this,"Enter valid librarian name","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(! isEmail(emailText.getText())){
            JOptionPane.showMessageDialog(this,"Enter valid Email","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!isAlphabetic(address.getText())){
            JOptionPane.showMessageDialog(this,"Enter valid address","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!isPhoneNumber(phonenumberText.getText())){
            JOptionPane.showMessageDialog(this,"Enter valid phone number","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(AdminMain.a1.getDatabase().contains(librarianIDText.getText())){
            JOptionPane.showMessageDialog(this,"The librarian with ID="+librarianIDText.getText()+" username already exist.","ALREADY EXIST ",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            AdminMain.a1.addLibrarian(librarianIDText.getText(),nameText.getText(),emailText.getText(),addressText.getText(), phonenumberText.getText());
            JOptionPane.showMessageDialog(this,"The librarian with ID="+librarianIDText.getText()+" has been successfully added.","SUCCESSFULLY ADDED ",JOptionPane.INFORMATION_MESSAGE);
            clear(nameText);
            clear(addressText);
            clear(phonenumberText);
            clear(librarianIDText);
            clear(emailText);
        }
    }//GEN-LAST:event_addMouseClicked

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setForeground(new Color(250,56,56));
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setForeground(new Color(140,56,56));
    }//GEN-LAST:event_addMouseExited
    
    public void clear(JTextField t){
        t.setText("");
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(AddLibarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddLibarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddLibarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddLibarian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressText;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel librarianID;
    private javax.swing.JTextField librarianIDText;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel name;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel phonenumber;
    private javax.swing.JTextField phonenumberText;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
