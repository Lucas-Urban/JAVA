package frontend;

import geradorcertificado.dadosPessoa.Contato;
import geradorcertificado.dadosPessoa.Endereco;
import geradorcertificado.dadosPessoa.Pessoa;
import geradorcertificado.dadosPessoa.PessoaFisica;
import geradorcertificado.dadosPessoa.PessoaJuridica;

/**
 *
 * @author Thiag
 */
public class ViewPessoa extends javax.swing.JFrame {
    Pessoa pessoa;
    MainFrame mainFrame;
    
    public ViewPessoa(Pessoa pessoa, MainFrame mainFrame) {
        this.pessoa=pessoa;
        this.mainFrame=mainFrame;
        initComponents();
        panelPessoaJuridica.setVisible(false);
        LoadToForm();
    }
    
    void LoadToForm(){
        tbNome.setText(pessoa.getNome());
        tbNascimento.setText(pessoa.getNascimento());
        tbCEP.setText(pessoa.getEndereco().getCEP());
        tbBairro.setText(pessoa.getEndereco().getBairro());
        tbUF.setText(pessoa.getEndereco().getUF());
        tbEndereco.setText(pessoa.getEndereco().getEndereco());
        tbCidade.setText(pessoa.getEndereco().getCidade());
        tbEmail.setText(pessoa.getContato().getEmail());
        tbTelefone.setText(pessoa.getContato().getTelefone());
        tbSite.setText(pessoa.getContato().getSite());
        if(pessoa instanceof PessoaFisica){
            PessoaFisica pessoaFisica=(PessoaFisica)pessoa;
            tbCPF.setText(pessoaFisica.getCPF());
            tbRG.setText(pessoaFisica.getRG());
            if(pessoaFisica.getSexo().equalsIgnoreCase("Masculino"))
                rbMasculino.setSelected(true);
            else
                rbFeminino.setSelected(true);
            rbPessoaFisica.setSelected(true);
            panelPessoaFisica.setVisible(true);
            panelPessoaJuridica.setVisible(false);
        }else{
            PessoaJuridica pessoaJuridica = (PessoaJuridica)pessoa;
            tbCNPJ.setText(pessoaJuridica.getCNPJ());
            tbInscricaoEstadual.setText(pessoaJuridica.getInscricaoEstadual());
            tbInscricaoMunicipal.setText(pessoaJuridica.getInscricaoMunicial());
            rbPessoaJuridica.setSelected(true);
            panelPessoaFisica.setVisible(false);
            panelPessoaJuridica.setVisible(true);
        }
    }
    
    Pessoa LoadFromForm(){
        Pessoa novaPessoa;
        if(rbPessoaFisica.isSelected())
            novaPessoa = new PessoaFisica(tbCPF.getText(), tbRG.getText(), rbMasculino.isSelected()? "Masculino":"Feminino", null, null, null, null);
        else
            novaPessoa = new PessoaJuridica(tbCNPJ.getText(), tbInscricaoEstadual.getText(), tbInscricaoMunicipal.getText(), null, null, null, null);
        novaPessoa.setEndereco(new Endereco(tbUF.getText(), tbCidade.getText(), tbBairro.getText(), tbEndereco.getText(), tbCEP.getText()));
        novaPessoa.setContato(new Contato(tbEmail.getText(), tbTelefone.getText(), tbSite.getText()));
        novaPessoa.setNome(tbNome.getText());
        novaPessoa.setNascimento(tbNascimento.getText());
        return novaPessoa;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rgPessoa = new javax.swing.ButtonGroup();
        rgSexo = new javax.swing.ButtonGroup();
        rbPessoaFisica = new javax.swing.JRadioButton();
        rbPessoaJuridica = new javax.swing.JRadioButton();
        tbNome = new javax.swing.JTextField();
        tbNascimento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tbEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        panelPessoaJuridica = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tbCNPJ = new javax.swing.JTextField();
        tbInscricaoEstadual = new javax.swing.JTextField();
        tbInscricaoMunicipal = new javax.swing.JTextField();
        panelPessoaFisica = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tbCPF = new javax.swing.JTextField();
        tbRG = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tbTelefone = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tbSite = new javax.swing.JTextField();
        tbBairro = new javax.swing.JTextField();
        tbEndereco = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tbCEP = new javax.swing.JTextField();
        tbUF = new javax.swing.JTextField();
        tbCidade = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        rgPessoa.add(rbPessoaFisica);
        rbPessoaFisica.setSelected(true);
        rbPessoaFisica.setText("Física");
        rbPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaFisicaActionPerformed(evt);
            }
        });

        rgPessoa.add(rbPessoaJuridica);
        rbPessoaJuridica.setText("Jurídica");
        rbPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaJuridicaActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Nascimento");

        jLabel6.setText("Pessoa");

        jLabel8.setText("Email");

        jLabel11.setText("CNPJ");

        jLabel10.setText("Inscrição Estadual");

        jLabel9.setText("Inscrição Municial");

        javax.swing.GroupLayout panelPessoaJuridicaLayout = new javax.swing.GroupLayout(panelPessoaJuridica);
        panelPessoaJuridica.setLayout(panelPessoaJuridicaLayout);
        panelPessoaJuridicaLayout.setHorizontalGroup(
            panelPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPessoaJuridicaLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbInscricaoMunicipal, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPessoaJuridicaLayout.setVerticalGroup(
            panelPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPessoaJuridicaLayout.createSequentialGroup()
                .addGroup(panelPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(tbCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tbInscricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(tbInscricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        jLabel3.setText("CPF");

        jLabel4.setText("RG");

        jLabel5.setText("Sexo");

        rgSexo.add(rbMasculino);
        rbMasculino.setSelected(true);
        rbMasculino.setText("Masculino");

        rgSexo.add(rbFeminino);
        rbFeminino.setText("Feminino");

        javax.swing.GroupLayout panelPessoaFisicaLayout = new javax.swing.GroupLayout(panelPessoaFisica);
        panelPessoaFisica.setLayout(panelPessoaFisicaLayout);
        panelPessoaFisicaLayout.setHorizontalGroup(
            panelPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPessoaFisicaLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbCPF)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbRG, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbFeminino)
                .addContainerGap())
        );
        panelPessoaFisicaLayout.setVerticalGroup(
            panelPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPessoaFisicaLayout.createSequentialGroup()
                .addGroup(panelPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(tbCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(tbRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(rbFeminino)
                        .addComponent(rbMasculino)))
                .addGap(0, 0, 0))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel12.setText("Telefone");

        jLabel13.setText("Site");

        jLabel14.setText("Bairro");

        jLabel15.setText("CEP");

        jLabel16.setText("UF");

        jLabel17.setText("Cidade");

        jLabel18.setText("Endereço");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPessoaFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelPessoaJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalvar))
                            .addComponent(tbNascimento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbEndereco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbUF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbCidade)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbBairro))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(70, 70, 70)
                                .addComponent(rbPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPessoaJuridica))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbSite, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbTelefone)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbPessoaFisica)
                    .addComponent(rbPessoaJuridica)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tbNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tbSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(tbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tbCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(tbUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(tbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(tbBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(panelPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        mainFrame.TrocarPessoa(pessoa, LoadFromForm());
        this.dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void rbPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaFisicaActionPerformed
        panelPessoaJuridica.setVisible(false);
        panelPessoaFisica.setVisible(true);
    }//GEN-LAST:event_rbPessoaFisicaActionPerformed

    private void rbPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaJuridicaActionPerformed
        panelPessoaJuridica.setVisible(true);
        panelPessoaFisica.setVisible(false);
    }//GEN-LAST:event_rbPessoaJuridicaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelPessoaFisica;
    private javax.swing.JPanel panelPessoaJuridica;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbPessoaFisica;
    private javax.swing.JRadioButton rbPessoaJuridica;
    private javax.swing.ButtonGroup rgPessoa;
    private javax.swing.ButtonGroup rgSexo;
    private javax.swing.JTextField tbBairro;
    private javax.swing.JTextField tbCEP;
    private javax.swing.JTextField tbCNPJ;
    private javax.swing.JTextField tbCPF;
    private javax.swing.JTextField tbCidade;
    private javax.swing.JTextField tbEmail;
    private javax.swing.JTextField tbEndereco;
    private javax.swing.JTextField tbInscricaoEstadual;
    private javax.swing.JTextField tbInscricaoMunicipal;
    private javax.swing.JTextField tbNascimento;
    private javax.swing.JTextField tbNome;
    private javax.swing.JTextField tbRG;
    private javax.swing.JTextField tbSite;
    private javax.swing.JTextField tbTelefone;
    private javax.swing.JTextField tbUF;
    // End of variables declaration//GEN-END:variables
}
