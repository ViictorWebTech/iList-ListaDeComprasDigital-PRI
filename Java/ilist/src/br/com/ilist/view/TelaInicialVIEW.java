/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ilist.view;


import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import br.com.ilist.dto.UsuarioDTO;

public class TelaInicialVIEW extends javax.swing.JFrame {
UsuarioDTO usuarioDTO = new UsuarioDTO();
    /**
     * Creates new form PrincipalVIEW
     */
    public TelaInicialVIEW(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
        initComponents();
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon imageicon = new ImageIcon(getClass().getResource("imagens/organizacao.png"));
        Image image = imageicon.getImage();
        desktopPane = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics graphics){
                graphics.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        };
        menuBar = new javax.swing.JMenuBar();
        menuLogin = new javax.swing.JMenu();
        itemMenuCadastrar = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        itemMenuItem = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(204, 204, 255));
        desktopPane.setForeground(new java.awt.Color(204, 204, 255));

        menuLogin.setMnemonic('h');
        menuLogin.setText("Cadastros");
        menuLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLoginMouseClicked(evt);
            }
        });

        itemMenuCadastrar.setMnemonic('o');
        itemMenuCadastrar.setText("Cadastrar");
        itemMenuCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuCadastrarActionPerformed(evt);
            }
        });
        menuLogin.add(itemMenuCadastrar);

        menuBar.add(menuLogin);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Item");

        itemMenuItem.setMnemonic('o');
        itemMenuItem.setText("Cadastrar");
        itemMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(itemMenuItem);

        menuBar.add(fileMenu);

        menuSair.setMnemonic('h');
        menuSair.setText("Sair");
        menuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuSairMouseClicked(evt);
            }
        });
        menuBar.add(menuSair);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1160, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuItemActionPerformed
        // TODO add your handling code here:
        ItemVIEW itemVIEW = new ItemVIEW(usuarioDTO);
        this.desktopPane.add(itemVIEW);
        itemVIEW.setVisible(true);
        itemVIEW.setPosicao();

    }//GEN-LAST:event_itemMenuItemActionPerformed

    private void menuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuSairMouseClicked
        // TODO add your handling code here:
        sair();
    }//GEN-LAST:event_menuSairMouseClicked

    
    
    private void sair(){
        Object[] options = { "Sair", "Cancelar" };
        if(JOptionPane.showOptionDialog(null, "Deseja Sair do Sistema", "Informação", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]) == 0){
            System.exit(0);
        } 
    } 
    private void menuLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLoginMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuLoginMouseClicked

    private void itemMenuCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuCadastrarActionPerformed
        // TODO add your handling code here:
         CadastrarVIEW cadastrarVIEW = new CadastrarVIEW();
        this.desktopPane.add(cadastrarVIEW);
        cadastrarVIEW.setVisible(true);
        cadastrarVIEW.setPosicao();
    }//GEN-LAST:event_itemMenuCadastrarActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(TelaInicialVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(TelaInicialVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(TelaInicialVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(TelaInicialVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new TelaInicialVIEW().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem itemMenuCadastrar;
    private javax.swing.JMenuItem itemMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuLogin;
    private javax.swing.JMenu menuSair;
    // End of variables declaration//GEN-END:variables

}
