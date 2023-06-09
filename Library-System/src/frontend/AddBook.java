package frontend;


import java.awt.Color;
import static frontend.Validation.*;
import javax.swing.*;

public class AddBook extends javax.swing.JFrame {

    public AddBook() {
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
        bookID = new javax.swing.JLabel();
        booktitle = new javax.swing.JLabel();
        authorname = new javax.swing.JLabel();
        publisher = new javax.swing.JLabel();
        NoOfCopies = new javax.swing.JLabel();
        authorText = new javax.swing.JTextField();
        NOCText = new javax.swing.JTextField();
        add = new javax.swing.JLabel();
        publisherText = new javax.swing.JTextField();
        bookIDText = new javax.swing.JTextField();
        titleText = new javax.swing.JTextField();
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
        title.setText("Librarian Role");
        title.setPreferredSize(new java.awt.Dimension(100, 44));
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 220, -1));

        subtitle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        subtitle.setForeground(new java.awt.Color(140, 56, 56));
        subtitle.setText("Add Book");
        getContentPane().add(subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, -1, -1));

        bookID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bookID.setForeground(new java.awt.Color(140, 56, 56));
        bookID.setText("Book ID");
        getContentPane().add(bookID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        booktitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        booktitle.setForeground(new java.awt.Color(140, 56, 56));
        booktitle.setText("Title");
        getContentPane().add(booktitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        authorname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        authorname.setForeground(new java.awt.Color(140, 56, 56));
        authorname.setText("Author name");
        getContentPane().add(authorname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        publisher.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        publisher.setForeground(new java.awt.Color(140, 56, 56));
        publisher.setText("Publisher name");
        getContentPane().add(publisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        NoOfCopies.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NoOfCopies.setForeground(new java.awt.Color(140, 56, 56));
        NoOfCopies.setText("No. of copies");
        getContentPane().add(NoOfCopies, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, -1, -1));

        authorText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        authorText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(authorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 180, -1));

        NOCText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        NOCText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(NOCText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 530, 180, -1));

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

        publisherText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        publisherText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(publisherText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, 180, -1));

        bookIDText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bookIDText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(bookIDText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 180, -1));

        titleText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        titleText.setForeground(new java.awt.Color(140, 56, 56));
        getContentPane().add(titleText, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 180, -1));

        background.setBackground(new java.awt.Color(242, 239, 234));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/frontend/background.jpg"))); // NOI18N
        background.setText("jLabel1");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        new LibrarianMain();
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
        if(authorText.getText().isEmpty() || NOCText.getText().isEmpty() ||publisherText.getText().isEmpty() ||bookIDText.getText().isEmpty() ||titleText.getText().isEmpty()){
        JOptionPane.showMessageDialog(this,"Some fields are empty","EMPTY FIELDS",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!hasNoSpace(bookIDText.getText())){
            JOptionPane.showMessageDialog(this,"Please enter valid BookID.","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!isAlphabetic(titleText.getText())){
            JOptionPane.showMessageDialog(this,"Please enter valid Book title.","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!isAlphabetic(authorText.getText())){
            JOptionPane.showMessageDialog(this,"Please enter valid author name.","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
         else if(!isAlphabetic(publisherText.getText())){
            JOptionPane.showMessageDialog(this,"Please enter valid publisher name.","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(!isInt(NOCText.getText())){
            JOptionPane.showMessageDialog(this,"Please enter valid nuber of copies.","INVALID INPUT",JOptionPane.INFORMATION_MESSAGE);
        }
        else if(LibrarianMain.l1.getBookDatabase().contains(bookIDText.getText())){
            JOptionPane.showMessageDialog(this,"The book with ID="+bookIDText.getText()+" already exist.","ALREADY EXIST ",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            LibrarianMain.l1.addBook(bookIDText.getText(),titleText.getText(),authorText.getText(),publisherText.getText(), Integer.parseInt(NOCText.getText()));
            JOptionPane.showMessageDialog(this,"The book with ID="+bookIDText.getText()+" has been successfully added.","SUCCESSFULLY ADDED ",JOptionPane.INFORMATION_MESSAGE);
            clear(NOCText);
            clear(authorText);
            clear(bookIDText);
            clear(titleText);
            clear(publisherText);
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
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NOCText;
    private javax.swing.JLabel NoOfCopies;
    private javax.swing.JLabel add;
    private javax.swing.JTextField authorText;
    private javax.swing.JLabel authorname;
    private javax.swing.JLabel background;
    private javax.swing.JLabel bookID;
    private javax.swing.JTextField bookIDText;
    private javax.swing.JLabel booktitle;
    private javax.swing.JLabel close;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel publisher;
    private javax.swing.JTextField publisherText;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JTextField titleText;
    // End of variables declaration//GEN-END:variables
}
