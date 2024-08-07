/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ilist.view;

/**
 *
 * @author Aluno
 */
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import br.com.ilist.dto.ItemDTO;
import br.com.ilist.ctr.ItemCTR;
import br.com.ilist.dto.UsuarioDTO;
import br.com.ilist.ctr.UsuarioCTR;

public class ItemVIEW extends javax.swing.JInternalFrame {

    ItemDTO itemDTO = new ItemDTO();
    ItemCTR itemCTR = new ItemCTR();
    UsuarioDTO usuarioDTO = new UsuarioDTO();
    UsuarioCTR usuarioCTR = new UsuarioCTR();

    ResultSet rs;
    int gravar_alterar;
    DefaultTableModel modelo_jtl_consultar_item;

    /**
     * Creates new form ItemVIEW
     */
    public ItemVIEW(UsuarioDTO usuarioDTO) {
        this.usuarioDTO = usuarioDTO;
        initComponents();
        
        this.setSize(758, 560);
        //Chama o metodo liberaCamposNovo
        liberaCampos(false);
        //Chama o método lieraBotoes
        liberaBotoes(true, false, false, false);
        //Atribui um modelo para manipular a tabela 
        modelo_jtl_consultar_item = (DefaultTableModel) jtl_consultar_item.getModel();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
        /**
     * Método para centralizar o internalFrame.
     */
    public void setPosicao() {
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2); 
    }//Fecha método setPosicao()
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        preco = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        nome_mercado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pesquisa_nome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtl_consultar_item = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnNovo = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Itens");

        jPanel1.setName(""); // NOI18N

        jLabel1.setText("Nome do Item:");

        jLabel3.setText("Nome do Mercado:");

        preco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precoActionPerformed(evt);
            }
        });

        nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeActionPerformed(evt);
            }
        });

        nome_mercado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nome_mercadoActionPerformed(evt);
            }
        });

        jLabel4.setText("Preço Estimado:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nome, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(preco, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nome_mercado))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nome_mercado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(preco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setText("Pesquisar");

        pesquisa_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisa_nomeActionPerformed(evt);
            }
        });

        jtl_consultar_item.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item na Lista", "Mercado", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtl_consultar_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtl_consultar_itemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtl_consultar_item);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ilist/view/imagens/pesquisar.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pesquisa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(pesquisa_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ilist/view/imagens/novo.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ilist/view/imagens/excluir.png"))); // NOI18N
        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ilist/view/imagens/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ilist/view/imagens/salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(btnNovo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addGap(12, 12, 12)
                .addComponent(btnCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRemover)
                .addContainerGap(581, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovo)
                    .addComponent(btnRemover)
                    .addComponent(btnCancelar)
                    .addComponent(btnSalvar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nome_mercadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nome_mercadoActionPerformed

    }//GEN-LAST:event_nome_mercadoActionPerformed

    private void pesquisa_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisa_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesquisa_nomeActionPerformed

    private void precoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precoActionPerformed

    private void nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(verificaPreenchimento()){ 
            if(gravar_alterar==1){
                gravar();
                gravar_alterar=0;
                limpaCampos();
                liberaCampos(false);
                liberaBotoes(true, false, false, false);
            }
            else{
                if(gravar_alterar==2){
                    if(verificaPreenchimento()){
                        alterar();
                        preencheTabela(pesquisa_nome.getText().toUpperCase());
                        gravar_alterar=0;
                        limpaCampos();
                        liberaCampos(false);
                        liberaBotoes(true, false, false, false);
                    } 
                }
                else{
                    JOptionPane.showMessageDialog(null, "Erro no Sistema!!!");
                }
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        preencheTabela(pesquisa_nome.getText());
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
         liberaCampos(true);
        liberaBotoes(false, true, true, false);
        gravar_alterar=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
            limpaCampos();
        liberaCampos(false);
        modelo_jtl_consultar_item.setNumRows(0);
        liberaBotoes(true, false, false, false);
        gravar_alterar=0;
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtl_consultar_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtl_consultar_itemMouseClicked
        // TODO add your handling code here:
            preencheCampos(Integer.parseInt(String.valueOf(jtl_consultar_item.getValueAt(jtl_consultar_item.getSelectedRow(), 0))));
        liberaBotoes(false, true, true, true);
    }//GEN-LAST:event_jtl_consultar_itemMouseClicked

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        // TODO add your handling code here:
         excluir();
        limpaCampos();
        liberaCampos(false);
        liberaBotoes(true, false, false, false);
        preencheTabela(pesquisa_nome.getText());
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void gravar() {

        try {
//            itemDTO.setId_usuario(itemDTO.getId_usuario());
            itemDTO.setNome(nome.getText());
            itemDTO.setNome_mercado(nome_mercado.getText());
            itemDTO.setPreco(preco.getText());
            //itemDTO.setId_usuario(usuarioDTO.getId_usuario());

            JOptionPane.showMessageDialog(null,
                    itemCTR.inserirItem(itemDTO, usuarioDTO)
            );

        } catch (Exception e) {
            System.out.println("Erro ao gravar" + e.getMessage()
            );
        }
    }

    private void alterar() {

        try {

            itemDTO.setNome(nome.getText());
            itemDTO.setNome_mercado(nome_mercado.getText());
            itemDTO.setPreco(preco.getText());

            JOptionPane.showMessageDialog(null,
                    itemCTR.editarItem(itemDTO, usuarioDTO)
            );

        } catch (Exception e) {
            System.out.println("Erro ao alterar" + e.getMessage()
            );
        }
    }
    
        private void excluir(){
       if(JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o Item?","Aviso", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null,
                    itemCTR.removerItem(itemDTO, usuarioDTO)
            );
       }
    }//Fecha método excluir()
    

    private void preencheTabela(String nome) {
        try {
            modelo_jtl_consultar_item.setNumRows(0);

            itemDTO.setNome(nome);
            rs = itemCTR.selecionarItem(itemDTO, usuarioDTO, 1);
            while (rs.next()) {
                modelo_jtl_consultar_item.addRow(new Object[]{
                    rs.getString("id_item"),
                    rs.getString("nome"),
                    rs.getString("nome_mercado"),
                    rs.getString("preco"),
                });
            }
        } catch (Exception erTab) {
            System.out.println("Erro SQL: " + erTab);
        }
    }
    
    private void preencheCampos(int id_item){
        try{
            itemDTO.setId_item(id_item);
            rs = itemCTR.selecionarItem(itemDTO, usuarioDTO, 2);
            if(rs.next()){
                limpaCampos();
                
                nome.setText(rs.getString("nome"));
                nome_mercado.setText(rs.getString("nome_mercado"));
                preco.setText(rs.getString("preco"));
                
                
                gravar_alterar = 2;
                liberaCampos(true);
            }
        }
        catch(Exception erTab){
            System.out.println("Erro SQL: "+erTab);
        }
    }
    private void liberaCampos(boolean a){
        nome.setEnabled(a);
        nome_mercado.setEnabled(a);
        preco.setEnabled(a);
    }
    
    private void limpaCampos(){
        nome.setText("");
        nome_mercado.setText("");
        preco.setText("");
    }

       private void liberaBotoes(boolean a, boolean b, boolean c, boolean d){
        btnNovo.setEnabled(a);
        btnSalvar.setEnabled(b);
        btnCancelar.setEnabled(c);
        btnRemover.setEnabled(d);
    }//Fecha método liberaBotoes(boolean a, boolean b, boolean c, boolean d, boolean e)

    
        private boolean verificaPreenchimento() { 
        if((nome.getText().equalsIgnoreCase("")) || (nome.getText().equalsIgnoreCase("  /  /    "))){
            JOptionPane.showMessageDialog(null, "O campo Nome do Item deve ser preenchido");
            nome.requestFocus();
            return false;
        }
        else{
            if((nome_mercado.getText().equalsIgnoreCase(""))){
                JOptionPane.showMessageDialog(null, "O campo Nome do Mercado deve ser preenchido");
                nome_mercado.requestFocus();
                return false;
            }
            else{
                if((preco.getText().equalsIgnoreCase(""))){
                    JOptionPane.showMessageDialog(null, "O campo Preço deve ser preenchido");
                    preco.requestFocus();
                    return false;
                } 
                else{
                    return true;
                }//Fecha else 
            }//Fecha else 
        }//Fecha else 
    }//Fecha método verificaPreenchimento()

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtl_consultar_item;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField nome_mercado;
    private javax.swing.JTextField pesquisa_nome;
    private javax.swing.JTextField preco;
    // End of variables declaration//GEN-END:variables
}
