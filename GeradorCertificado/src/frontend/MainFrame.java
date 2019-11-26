package frontend;

import com.sun.glass.events.KeyEvent;
import geradorcertificado.dadosPessoa.Pessoa;
import geradorcertificado.dadosPessoa.PessoaFisica;
import geradorcertificado.gerador.BuscaArquivos;
import geradorcertificado.gerador.Gerador;
import geradorcertificado.gerador.Modelo;
import geradorcertificado.gerador.ThreadCompletada;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

/**
 *
 * @author Thiag
 */
public class MainFrame extends javax.swing.JFrame implements ThreadCompletada{
    DefaultListModel<Pessoa> pessoas;
    DefaultListModel<Modelo> modelos;
    BuscaArquivos buscaArquivos;
    
    public MainFrame(BuscaArquivos buscaArquivos) {
        initComponents();
        this.buscaArquivos=buscaArquivos;
        pessoas = new DefaultListModel<>();
        modelos = new DefaultListModel<>();
        listPessoas.setModel(pessoas);
        listModelos.setModel(modelos);
        LoadToForm();
    }
    
    void LoadToForm(){
        modelos.clear();
        for(File modelo : buscaArquivos.getModelos())
            modelos.addElement(new Modelo(modelo));
        listModelos.updateUI();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listPessoas = new javax.swing.JList<>();
        btnGerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnNovaPessoa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listModelos = new javax.swing.JList<>();
        btnAtualizar = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listPessoas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listPessoasMouseClicked(evt);
            }
        });
        listPessoas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listPessoasKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(listPessoas);

        btnGerar.setText("Gerar");
        btnGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerarActionPerformed(evt);
            }
        });

        jLabel1.setText("Pessoas");

        jLabel2.setText("Modelos");

        btnNovaPessoa.setText("Nova Pessoa");
        btnNovaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPessoaActionPerformed(evt);
            }
        });

        listModelos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listModelosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listModelos);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        lblStatus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lblStatus.setText("Programa iniciado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnNovaPessoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGerar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                                .addGap(8, 8, 8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                            .addComponent(jLabel2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGerar)
                    .addComponent(btnAtualizar)
                    .addComponent(btnNovaPessoa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStatus)
                .addContainerGap())
        );

        btnGerar.getAccessibleContext().setAccessibleName("btnGerar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerarActionPerformed
        if(pessoas.size()==0)
            JOptionPane.showMessageDialog(null, "Crie pelo menos uma pessoa antes de gerar o modelo");
        else if(modelos.size()==0)
            JOptionPane.showMessageDialog(null, "Insira pelo menos um modelo na pasta de modelos primeiro");
        else if(listModelos.getSelectedIndex()==-1)
            JOptionPane.showMessageDialog(null, "Selecione um modelo para continuar");
        else{
            ArrayList<Pessoa> pessoasArray = new ArrayList<>();
            for(int i = 0; i < pessoas.size(); i++)
                pessoasArray.add(pessoas.get(i));
            Gerador.Gerar(pessoasArray, listModelos.getSelectedValue(), buscaArquivos.getPastaSaida(), this);
        }
    }//GEN-LAST:event_btnGerarActionPerformed

    private void btnNovaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPessoaActionPerformed
        Pessoa newPessoa = new PessoaFisica();
        pessoas.addElement(newPessoa);
        new ViewPessoa(newPessoa, this).setVisible(true);
    }//GEN-LAST:event_btnNovaPessoaActionPerformed

    private void listPessoasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listPessoasMouseClicked
        if(evt.getClickCount()==2)
            if(listPessoas.getSelectedIndex()!=-1)
                new ViewPessoa(listPessoas.getSelectedValue(), this).setVisible(true);
    }//GEN-LAST:event_listPessoasMouseClicked

    private void listPessoasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listPessoasKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_DELETE && listPessoas.getSelectedIndex()!=-1){
            evt.consume();
            pessoas.remove(listPessoas.getSelectedIndex());
        }
    }//GEN-LAST:event_listPessoasKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        LoadToForm();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void listModelosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listModelosMouseClicked
        if(evt.getClickCount()==2)
            btnGerarActionPerformed(null);
    }//GEN-LAST:event_listModelosMouseClicked

    public void TrocarPessoa(Pessoa antiga, Pessoa nova){
        pessoas.set(pessoas.indexOf(antiga), nova);
        AtualizarPessoas();
    }
    
    public void AtualizarPessoas(){
        listPessoas.updateUI();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnGerar;
    private javax.swing.JButton btnNovaPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JList<Modelo> listModelos;
    private javax.swing.JList<Pessoa> listPessoas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void notificarThreadCompletada(String msg) {
        lblStatus.setText("Tarefa completou com sucesso: "+msg);
    }
}
