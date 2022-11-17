package frontend;

import backend.AdminRole;
import java.awt.Color;
import javax.swing.JFrame;

public class AdminMain extends javax.swing.JFrame {

    public static AdminRole a1=new AdminRole();
    
    
    public AdminMain() {
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

        close = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        addLibrarian = new javax.swing.JLabel();
        viewLibrarians = new javax.swing.JLabel();
        removeLibrarian = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
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

        addLibrarian.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        addLibrarian.setForeground(new java.awt.Color(140, 56, 56));
        addLibrarian.setText("Add Librarian");
        addLibrarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLibrarianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addLibrarianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addLibrarianMouseExited(evt);
            }
        });
        getContentPane().add(addLibrarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, -1, -1));

        viewLibrarians.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        viewLibrarians.setForeground(new java.awt.Color(140, 56, 56));
        viewLibrarians.setText("View Librarians");
        viewLibrarians.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewLibrariansMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewLibrariansMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewLibrariansMouseExited(evt);
            }
        });
        getContentPane().add(viewLibrarians, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        removeLibrarian.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        removeLibrarian.setForeground(new java.awt.Color(140, 56, 56));
        removeLibrarian.setText("Remove Librarian");
        removeLibrarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeLibrarianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeLibrarianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeLibrarianMouseExited(evt);
            }
        });
        getContentPane().add(removeLibrarian, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, -1, -1));

        logout.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        logout.setForeground(new java.awt.Color(140, 56, 56));
        logout.setText("Logout");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 530, -1, -1));

        background.setBackground(new java.awt.Color(242, 239, 234));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/background.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        new AdminSignIn();
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void addLibrarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLibrarianMouseClicked
        new AddLibarian();
        this.dispose();
    }//GEN-LAST:event_addLibrarianMouseClicked

    private void addLibrarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLibrarianMouseEntered
        addLibrarian.setForeground(new Color(250,56,56));
    }//GEN-LAST:event_addLibrarianMouseEntered

    private void addLibrarianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLibrarianMouseExited
        addLibrarian.setForeground(new Color(140,56,56));
    }//GEN-LAST:event_addLibrarianMouseExited

    private void viewLibrariansMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLibrariansMouseClicked
        new ViewLibrarians();
        this.dispose();
    }//GEN-LAST:event_viewLibrariansMouseClicked

    private void viewLibrariansMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLibrariansMouseEntered
        viewLibrarians.setForeground(new Color(250,56,56));
    }//GEN-LAST:event_viewLibrariansMouseEntered

    private void viewLibrariansMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewLibrariansMouseExited
        viewLibrarians.setForeground(new Color(140,56,56));
    }//GEN-LAST:event_viewLibrariansMouseExited

    private void removeLibrarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLibrarianMouseClicked
        new RemoveLibrarian();
        this.dispose();
    }//GEN-LAST:event_removeLibrarianMouseClicked

    private void removeLibrarianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLibrarianMouseEntered
        removeLibrarian.setForeground(new Color(250,56,56));
    }//GEN-LAST:event_removeLibrarianMouseEntered

    private void removeLibrarianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeLibrarianMouseExited
        removeLibrarian.setForeground(new Color(140,56,56));
    }//GEN-LAST:event_removeLibrarianMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        a1.logout();
        new LibrarySystem();
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout.setForeground(new Color(250,56,56));
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout.setForeground(new Color(140,56,56));
    }//GEN-LAST:event_logoutMouseExited

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
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLibrarian;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel removeLibrarian;
    private javax.swing.JLabel title;
    private javax.swing.JLabel viewLibrarians;
    // End of variables declaration//GEN-END:variables
}
