package view;

import controller.ContratoController;
import controller.PessoaController;
import controller.ProdutoController;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.ContratoModel;
import model.PessoaModel;
import model.ProdutoModel;

public class ContratoView extends javax.swing.JFrame {

    private String operacao;

    private ArrayList<ContratoModel> arraycontrato;
    private ContratoTableModel ftm;

    private PessoaController pessoacontroller;
    private ProdutoController produtocontroller;
    private ContratoController ContratoController;

    private String getOperacao() {
        return operacao;
    }

    private void setOperacao(String operacao) {
        Boolean ativar = (operacao.equals("") ? false : true);
        // operacao=""(consulta), operacao="incluir"(inclusão), operacao="alterar"(alteração)
        this.operacao = operacao;
        btnGRAVAR.setEnabled(ativar);
        btnGRAVAR.setEnabled(ativar);
    }

    public ContratoView() {
        ContratoController = new ContratoController();
        pessoacontroller = new PessoaController();
        produtocontroller = new ProdutoController();

        this.setPreferredSize(new Dimension(750, 650));

        initComponents();
        setOperacao(""); // inicializa o form no modo CONSULTA
        setLocationRelativeTo(null);
        consultar();
        cboxPES_NOME.setModel(new DefaultComboBoxModel(pessoacontroller.consultar("").toArray()));
        cboxPRO_NOME.setModel(new DefaultComboBoxModel(produtocontroller.consultar(" ").toArray()));
        // adiciona evento para que qdo navegar no JTable, atualize o registro nos JTextField´s
        tblConsulta.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent evt) {
                if (evt.getValueIsAdjusting()) {
                    return;
                }
                int selecionado = tblConsulta.getSelectedRow();
                if (selecionado >= 0) {
                    mostrar(arraycontrato.get(selecionado));
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        btnPRIMEIRO = new javax.swing.JButton();
        btnANTERIOR = new javax.swing.JButton();
        btnPROXIMO = new javax.swing.JButton();
        btnULTIMO = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnINCLUIR = new javax.swing.JButton();
        btnALTERAR = new javax.swing.JButton();
        btnEXCLUIR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnGRAVAR = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnIMPRIMIR = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnSAIR = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblPES_ID = new javax.swing.JLabel();
        lblPES_NOME = new javax.swing.JLabel();
        edtPES_ID = new javax.swing.JTextField();
        lblPES_CPF = new javax.swing.JLabel();
        edtPES_CPF = new javax.swing.JTextField();
        lblCON_ID = new javax.swing.JLabel();
        edtCON_ID = new javax.swing.JTextField();
        lblPRO_NOME = new javax.swing.JLabel();
        lblCON_VENCIMENTO = new javax.swing.JLabel();
        edtCON_VENCIMENTO = new javax.swing.JTextField();
        lblCON_VALOR = new javax.swing.JLabel();
        edtCON_VALOR = new javax.swing.JTextField();
        lblCON_NUMERO = new javax.swing.JLabel();
        edtCON_NUMERO = new javax.swing.JTextField();
        cboxPES_NOME = new javax.swing.JComboBox<>();
        cboxPRO_NOME = new javax.swing.JComboBox<>();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCONS_ID = new javax.swing.JLabel();
        edtCONS_ID1 = new javax.swing.JTextField();
        lblCodigo2 = new javax.swing.JLabel();
        edtCONS_ID2 = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Contratos");
        setFocusable(false);
        getContentPane().setLayout(null);

        jToolBar1.setRollover(true);

        btnPRIMEIRO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/primeiro.png"))); // NOI18N
        btnPRIMEIRO.setText("Primeiro");
        btnPRIMEIRO.setFocusable(false);
        btnPRIMEIRO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPRIMEIRO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPRIMEIRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPRIMEIROActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPRIMEIRO);

        btnANTERIOR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/anterior.png"))); // NOI18N
        btnANTERIOR.setText("Anterior");
        btnANTERIOR.setFocusable(false);
        btnANTERIOR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnANTERIOR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnANTERIOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnANTERIORActionPerformed(evt);
            }
        });
        jToolBar1.add(btnANTERIOR);

        btnPROXIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/proximo.png"))); // NOI18N
        btnPROXIMO.setText("Próximo");
        btnPROXIMO.setFocusable(false);
        btnPROXIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPROXIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPROXIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPROXIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnPROXIMO);

        btnULTIMO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ultimo.png"))); // NOI18N
        btnULTIMO.setText("Último");
        btnULTIMO.setFocusable(false);
        btnULTIMO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnULTIMO.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnULTIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnULTIMOActionPerformed(evt);
            }
        });
        jToolBar1.add(btnULTIMO);

        jSeparator1.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator1);

        btnINCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        btnINCLUIR.setText("Novo");
        btnINCLUIR.setFocusable(false);
        btnINCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnINCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnINCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnINCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnINCLUIR);

        btnALTERAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alterar.png"))); // NOI18N
        btnALTERAR.setText("Alterar");
        btnALTERAR.setFocusable(false);
        btnALTERAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnALTERAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnALTERAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnALTERAR);

        btnEXCLUIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/excluir.png"))); // NOI18N
        btnEXCLUIR.setText("Excluir");
        btnEXCLUIR.setFocusable(false);
        btnEXCLUIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEXCLUIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEXCLUIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnEXCLUIR);

        jSeparator2.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator2);

        btnGRAVAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/gravar.png"))); // NOI18N
        btnGRAVAR.setText("Gravar");
        btnGRAVAR.setFocusable(false);
        btnGRAVAR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGRAVAR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGRAVAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGRAVARActionPerformed(evt);
            }
        });
        jToolBar1.add(btnGRAVAR);

        jSeparator3.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator3);

        btnIMPRIMIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/imprimir.png"))); // NOI18N
        btnIMPRIMIR.setText("Imprimir");
        btnIMPRIMIR.setFocusable(false);
        btnIMPRIMIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIMPRIMIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnIMPRIMIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIMPRIMIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnIMPRIMIR);

        jSeparator4.setSeparatorSize(new java.awt.Dimension(30, 30));
        jToolBar1.add(jSeparator4);

        btnSAIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        btnSAIR.setText("Sair");
        btnSAIR.setFocusable(false);
        btnSAIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSAIR.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRActionPerformed(evt);
            }
        });
        jToolBar1.add(btnSAIR);

        getContentPane().add(jToolBar1);
        jToolBar1.setBounds(0, 0, 730, 71);

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Cadastro de Contratos");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(240, 70, 290, 29);

        lblPES_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPES_ID.setText("PES_ID");

        lblPES_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPES_NOME.setText("Nome");

        edtPES_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblPES_CPF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPES_CPF.setText("CPF");

        edtPES_CPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtPES_CPFActionPerformed(evt);
            }
        });

        lblCON_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCON_ID.setText("CON_ID");

        edtCON_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edtCON_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCON_IDActionPerformed(evt);
            }
        });

        lblPRO_NOME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPRO_NOME.setText("Produto");

        lblCON_VENCIMENTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCON_VENCIMENTO.setText("Vencimento");

        edtCON_VENCIMENTO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        lblCON_VALOR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCON_VALOR.setText("Valor: R$");

        lblCON_NUMERO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblCON_NUMERO.setText("Nº");

        edtCON_NUMERO.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        cboxPES_NOME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxPES_NOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPES_NOMEActionPerformed(evt);
            }
        });

        cboxPRO_NOME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPES_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edtPES_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblCON_ID)
                .addGap(26, 26, 26)
                .addComponent(edtCON_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(185, 185, 185)
                .addComponent(lblCON_NUMERO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edtCON_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPES_NOME)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cboxPES_NOME, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPES_CPF)
                            .addGap(18, 18, 18)
                            .addComponent(edtPES_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPRO_NOME)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboxPRO_NOME, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCON_VENCIMENTO)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCON_VENCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCON_VALOR)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edtCON_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCON_ID)
                        .addComponent(edtCON_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCON_NUMERO)
                        .addComponent(edtCON_NUMERO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPES_ID)
                            .addComponent(edtPES_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPES_NOME)
                    .addComponent(cboxPES_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPES_CPF)
                    .addComponent(edtPES_CPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPRO_NOME)
                    .addComponent(cboxPRO_NOME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCON_VENCIMENTO)
                    .addComponent(edtCON_VENCIMENTO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCON_VALOR)
                    .addComponent(edtCON_VALOR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dados de Pessoa", jPanel1);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCONS_ID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCONS_ID.setText("ID");

        edtCONS_ID1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblCodigo2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblCodigo2.setText("à");

        edtCONS_ID2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnConsulta.setText("Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpa");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblCONS_ID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblCodigo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCONS_ID)
                    .addComponent(edtCONS_ID1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo2)
                    .addComponent(edtCONS_ID2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsulta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(tblConsulta);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("", jPanel2);

        jTabbedPane1.addTab("Consulta", jTabbedPane2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 100, 710, 300);

        getAccessibleContext().setAccessibleName("MVC - Cadastro de Fornecedores");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPRIMEIROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPRIMEIROActionPerformed
        if (arraycontrato.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Contratos Cadastrados !");
        } else {
            int selecionado = 0;
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPRIMEIROActionPerformed

    private void btnINCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnINCLUIRActionPerformed
        limpar();
        setOperacao("incluir");

    }//GEN-LAST:event_btnINCLUIRActionPerformed

    private void btnGRAVARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGRAVARActionPerformed
        String mensagem;
        if (JOptionPane.showConfirmDialog(null, "Confirma Gravação deste Contrato ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            PessoaModel pessoamodel = new PessoaModel();
            ContratoModel contratomodel = new ContratoModel();
            ProdutoModel produtomodel = new ProdutoModel();

            //pessoamodel.setPES_ID(Integer.parseInt(edtPES_ID.getText()));
            contratomodel.setPessoa((PessoaModel) cboxPES_NOME.getSelectedItem());
            contratomodel.setProduto((ProdutoModel) cboxPRO_NOME.getSelectedItem());

            contratomodel.setCON_ID(Integer.parseInt(edtCON_ID.getText()));
            contratomodel.setCON_NUMERO(Integer.parseInt(edtCON_NUMERO.getText()));
            contratomodel.setCON_VENCIMENTO(edtCON_VENCIMENTO.getText());
            contratomodel.setCON_VALOR(Double.parseDouble(edtCON_VALOR.getText()));

            try {
                pessoacontroller.gravar(pessoamodel, getOperacao());
                produtocontroller.gravar(produtomodel, getOperacao());
                ContratoController.gravar(contratomodel, getOperacao());
                mensagem = "Dados Gravados com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Gravação do Contrato \n" + ex.getMessage();
            }
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnGRAVARActionPerformed

    private void btnALTERARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARActionPerformed
        setOperacao("alterar");
    }//GEN-LAST:event_btnALTERARActionPerformed

    private void btnSAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRActionPerformed
        dispose();
    }//GEN-LAST:event_btnSAIRActionPerformed

    private void btnANTERIORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnANTERIORActionPerformed
        int selecionado = tblConsulta.getSelectedRow() - 1;
        if (selecionado >= 0) {
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnANTERIORActionPerformed

    private void limpar() {
        edtPES_ID.setText("0");
        edtPES_CPF.setText("");
        edtCON_VENCIMENTO.setText("");
        edtCON_NUMERO.setText("0");
        edtCON_ID.setText("0");
        edtCON_VALOR.setText("0");
    }

    private void mostrar(ContratoModel contrato) {

        ArrayList<PessoaModel> listaPessoa = pessoacontroller.consultar("" + contrato.getPessoa().getPES_ID());
        listaPessoa.add(contrato.getPessoa());

        ArrayList<ProdutoModel> listaProduto = produtocontroller.consultar("" + contrato.getProduto().getPRO_ID());
        listaProduto.add(contrato.getProduto());

        edtCON_ID.setText(String.valueOf(contrato.getCON_ID()));
        edtCON_NUMERO.setText(String.valueOf(contrato.getCON_NUMERO()));
        edtCON_VALOR.setText(String.valueOf(contrato.getCON_VALOR()));
        edtCON_VENCIMENTO.setText(contrato.getCON_VENCIMENTO());

        edtPES_ID.setText(String.valueOf(contrato.getPessoa().getPES_ID()));
        edtPES_CPF.setText(contrato.getPessoa().getPES_CPF());

        cboxPES_NOME.setModel(new DefaultComboBoxModel(listaPessoa.toArray()));
        if (listaPessoa.size() > 0) {
            cboxPES_NOME.setSelectedIndex(listaPessoa.size() - 1);
        }

        cboxPRO_NOME.setModel(new DefaultComboBoxModel(listaProduto.toArray()));
        if (listaProduto.size() > 0) {
            cboxPRO_NOME.setSelectedIndex(listaProduto.size() - 1);
        }
    }

    private String filtrar() {
        String condicao = "";
        if (!edtCONS_ID1.getText().trim().equals("")) {
            condicao += "(CON_ID >= " + edtCONS_ID1.getText() + ")";
        }
        if (!edtCONS_ID2.getText().trim().equals("")) {
            if (!condicao.isEmpty()) {
                condicao += " AND ";
            }
            condicao += "(CON_ID <= " + edtCONS_ID2.getText() + ")";
        }

        if (!condicao.trim().equals("")) {
            condicao = " WHERE " + condicao;
        }
        return condicao;
    }

    private void consultar() {
        String condicao = filtrar();
        arraycontrato = null;
        arraycontrato = ContratoController.consultar(condicao);
        if (arraycontrato.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não Existem Contratos Cadastrados !");
        } else {
            ftm = new ContratoTableModel(arraycontrato);
            tblConsulta.setModel(ftm);
            tblConsulta.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            tblConsulta.changeSelection(0, 0, false, false);
            mostrar();
        }
    }

    private void mostrar() {
        int selecionado = tblConsulta.getSelectedRow();
        if (selecionado >= 0) {
            mostrar(arraycontrato.get(selecionado));
        }
    }
    private void btnPROXIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPROXIMOActionPerformed
        int selecionado = tblConsulta.getSelectedRow() + 1;
        if (selecionado < arraycontrato.size()) {
            tblConsulta.changeSelection(selecionado, 0, false, false);
        }
    }//GEN-LAST:event_btnPROXIMOActionPerformed

    private void btnULTIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnULTIMOActionPerformed
        int selecionado = arraycontrato.size() - 1;
        tblConsulta.changeSelection(selecionado, 0, false, false);
    }//GEN-LAST:event_btnULTIMOActionPerformed

    private void btnEXCLUIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRActionPerformed
        String mensagem;
        setOperacao("");
        if (JOptionPane.showConfirmDialog(null, "Confirma Exclusão deste Fornecedor ?",
                "Confirmação", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            PessoaModel pessoamodel = new PessoaModel();
            ContratoModel contratomodel = new ContratoModel();
            ProdutoModel produtomodel = new ProdutoModel();

            //pessoamodel.setPES_ID(Integer.parseInt(edtPES_ID.getText()));
            contratomodel.setPessoa((PessoaModel) cboxPES_NOME.getSelectedItem());
            contratomodel.setProduto((ProdutoModel) cboxPRO_NOME.getSelectedItem());

            contratomodel.setCON_ID(Integer.parseInt(edtCON_ID.getText()));
            contratomodel.setCON_NUMERO(Integer.parseInt(edtCON_NUMERO.getText()));
            contratomodel.setCON_VENCIMENTO(edtCON_VENCIMENTO.getText());
            contratomodel.setCON_VALOR(Double.parseDouble(edtCON_VALOR.getText()));

            try {

                pessoacontroller.excluir(pessoamodel);
                produtocontroller.excluir(produtomodel);
                ContratoController.excluir(contratomodel);

                mensagem = "Contrato Excluído com Sucesso";
            } catch (Exception ex) {
                mensagem = "Erro na Exclusão do Contrato \n" + ex.getMessage();
            }
            JOptionPane.showMessageDialog(null, mensagem);
            consultar();
        }
    }//GEN-LAST:event_btnEXCLUIRActionPerformed

    private void btnIMPRIMIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIMPRIMIRActionPerformed
        Exception retorno = ContratoController.imprimir();
        if (retorno != null) {
            JOptionPane.showMessageDialog(null, "Erro no Relatório de Contratos /n" + retorno.getMessage());
        }
    }//GEN-LAST:event_btnIMPRIMIRActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        edtCONS_ID1.setText("");
        edtCONS_ID2.setText("");

    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        consultar();
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void edtCON_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCON_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtCON_IDActionPerformed

    private void edtPES_CPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtPES_CPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edtPES_CPFActionPerformed

    private void cboxPES_NOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPES_NOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxPES_NOMEActionPerformed
    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnALTERAR;
    private javax.swing.JButton btnANTERIOR;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnEXCLUIR;
    private javax.swing.JButton btnGRAVAR;
    private javax.swing.JButton btnIMPRIMIR;
    private javax.swing.JButton btnINCLUIR;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPRIMEIRO;
    private javax.swing.JButton btnPROXIMO;
    private javax.swing.JButton btnSAIR;
    private javax.swing.JButton btnULTIMO;
    private javax.swing.JComboBox<String> cboxPES_NOME;
    private javax.swing.JComboBox<String> cboxPRO_NOME;
    private javax.swing.JTextField edtCONS_ID1;
    private javax.swing.JTextField edtCONS_ID2;
    private javax.swing.JTextField edtCON_ID;
    private javax.swing.JTextField edtCON_NUMERO;
    private javax.swing.JTextField edtCON_VALOR;
    private javax.swing.JTextField edtCON_VENCIMENTO;
    private javax.swing.JTextField edtPES_CPF;
    private javax.swing.JTextField edtPES_ID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblCONS_ID;
    private javax.swing.JLabel lblCON_ID;
    private javax.swing.JLabel lblCON_NUMERO;
    private javax.swing.JLabel lblCON_VALOR;
    private javax.swing.JLabel lblCON_VENCIMENTO;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblPES_CPF;
    private javax.swing.JLabel lblPES_ID;
    private javax.swing.JLabel lblPES_NOME;
    private javax.swing.JLabel lblPRO_NOME;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblConsulta;
    // End of variables declaration//GEN-END:variables
}
