package frontend;


import static frontend.LibrarySystem.librarian;
import static frontend.Validation.hasNoSpace;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LibrarianSignIn extends javax.swing.JFrame{
    /**
     * Creates new form NewJFrame2
     */
    public LibrarianSignIn() {
        initComponents();
        this.setVisible(true);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        signin = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        signinbutton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setBackground(new java.awt.Color(255, 246, 232));
        username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        username.setForeground(new java.awt.Color(140, 98, 56));
        username.setText("Enter username");
        username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usernameMouseClicked(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 250, 40));

        password.setBackground(new java.awt.Color(255, 246, 232));
        password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password.setForeground(new java.awt.Color(140, 98, 56));
        password.setText("Enter password");
        password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passwordMouseClicked(evt);
            }
        });
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 358, 250, 40));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 64, 64));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/minimize.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 64, 64));

        signin.setFont(new java.awt.Font("Ebrima", 0, 35)); // NOI18N
        signin.setForeground(new java.awt.Color(140, 98, 56));
        signin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        signin.setText("Sign In");
        signin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        signin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(signin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 228, 120, 40));

        title.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(140, 56, 56));
        title.setText("Librarian");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        signinbutton.setFont(new java.awt.Font("Ebrima", 0, 28)); // NOI18N
        signinbutton.setForeground(new java.awt.Color(140, 98, 56));
        signinbutton.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        signinbutton.setText("Sign In");
        signinbutton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        signinbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signinbuttonMouseClicked(evt);
            }
        });
        getContentPane().add(signinbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 90, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/signbackground.jpg"))); // NOI18N
        background.setText("user name");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usernameMouseClicked
        clear(username);
    }//GEN-LAST:event_usernameMouseClicked

    private void passwordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordMouseClicked
        clear(password);
    }//GEN-LAST:event_passwordMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        new LibrarySystem();
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void signinbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signinbuttonMouseClicked
        if("Enter username".equals(username.getText()) || "Enter password".equals(password.getText()) || username.getText().isEmpty() || password.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter username and password","EMPTY FIELDS",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!hasNoSpace(username.getText())){
            JOptionPane.showMessageDialog(this,"Enter valid Username","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);    
        }
        else if(!hasNoSpace(password.getText())){
            JOptionPane.showMessageDialog(this,"Enter valid Password","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);    
        }
        else if(!librarian.contains(username.getText())){
            JOptionPane.showMessageDialog(this,"User account doesn't exist","DOESN'T EXIST",JOptionPane.INFORMATION_MESSAGE);  
        }
        else if(!(librarian.getRecord(username.getText()).getpassword().equals(password.getText()))){
            JOptionPane.showMessageDialog(this,"Wrong password!","WRONG INPUT",JOptionPane.INFORMATION_MESSAGE);      
        }
        else{
            new LibrarianMain();
            this.dispose();
        }
    }//GEN-LAST:event_signinbuttonMouseClicked

    /**
     * @param t
     */
    public void clear(JTextField t){
    t.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(LibrarianSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianSignIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField password;
    private javax.swing.JLabel signin;
    private javax.swing.JLabel signinbutton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
