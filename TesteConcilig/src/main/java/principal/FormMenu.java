package principal;

import view.PessoaView1;
import view.ProdutoView;
import view.ContratoView;

public class FormMenu extends javax.swing.JFrame {

    public FormMenu() {
        System.out.println(getClass().getResource("/imagens/primeiro.png"));
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCadastro = new javax.swing.JMenu();
        miPessoa = new javax.swing.JMenuItem();
        miProduto = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        miContrato = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuCadastro.setText("Cadastros");

        miPessoa.setText("Pessoa");
        miPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPessoaActionPerformed(evt);
            }
        });
        menuCadastro.add(miPessoa);

        miProduto.setText("Produto");
        miProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProdutoActionPerformed(evt);
            }
        });
        menuCadastro.add(miProduto);

        jMenuBar1.add(menuCadastro);

        jMenu1.setText("Movimentos");

        miContrato.setText("Contrato");
        miContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miContratoActionPerformed(evt);
            }
        });
        jMenu1.add(miContrato);

        jMenuBar1.add(jMenu1);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });
        jMenuBar1.add(menuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void miPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPessoaActionPerformed

        PessoaView1 objpes = null;
        objpes = new PessoaView1();
        objpes.setVisible(true);
    }//GEN-LAST:event_miPessoaActionPerformed

    private void miProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProdutoActionPerformed
        ProdutoView objpro = null;
        objpro = new ProdutoView();
        objpro.setVisible(true);
    }//GEN-LAST:event_miProdutoActionPerformed

    private void miContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miContratoActionPerformed
        // TODO add your handling code here:
        ContratoView objvenda = null;
        objvenda = new ContratoView();
        objvenda.setVisible(true);

    }//GEN-LAST:event_miContratoActionPerformed

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
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuCadastro;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem miContrato;
    private javax.swing.JMenuItem miPessoa;
    private javax.swing.JMenuItem miProduto;
    // End of variables declaration//GEN-END:variables
}
