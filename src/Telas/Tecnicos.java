/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

/**
 *
 * @author felip
 */
public class Tecnicos extends javax.swing.JFrame {

    /**
     * Creates new form Tecnicos
     */
    public Tecnicos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFotoTecnico = new javax.swing.JLabel();
        pnlTecnicos = new javax.swing.JPanel();
        lblNomeTecnico = new javax.swing.JLabel();
        txtNomeTecnicos = new javax.swing.JTextField();
        lblSobrenomeTecnicos = new javax.swing.JLabel();
        txtSobrenomeTecnicos = new javax.swing.JTextField();
        lblCPFTecnicos = new javax.swing.JLabel();
        txtCPFTecnicos = new javax.swing.JTextField();
        lblIdadeTecnicos = new javax.swing.JLabel();
        lblSexoTecnicos = new javax.swing.JLabel();
        txtSexoTecnicos = new javax.swing.JTextField();
        btnPesquisarTecnicos = new javax.swing.JButton();
        spnMes = new javax.swing.JSpinner();
        spnAno = new javax.swing.JSpinner();
        spnDia = new javax.swing.JSpinner();
        btnNovoTecnico = new javax.swing.JButton();
        btnSalvarTecnico = new javax.swing.JButton();
        btnCancelarTecnico = new javax.swing.JButton();
        btnEditarTecnico = new javax.swing.JButton();
        btnExcluirTecnico = new javax.swing.JButton();
        btnPesquisarTecnico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTecnicos = new javax.swing.JTable();
        btnSairTecnico = new javax.swing.JButton();

        lblFotoTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/pep.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Técnicos");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/manager.png")).getImage());

        pnlTecnicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados dos Técnicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        pnlTecnicos.setToolTipText("Dados dos Técnicos");

        lblNomeTecnico.setText("Nome:");

        txtNomeTecnicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeTecnicosActionPerformed(evt);
            }
        });

        lblSobrenomeTecnicos.setText("Sobrenome:");

        lblCPFTecnicos.setText("CPF:");

        lblIdadeTecnicos.setText("Data de Nascimento:");

        lblSexoTecnicos.setText("Sexo:");

        btnPesquisarTecnicos.setText("Pesquisar");

        javax.swing.GroupLayout pnlTecnicosLayout = new javax.swing.GroupLayout(pnlTecnicos);
        pnlTecnicos.setLayout(pnlTecnicosLayout);
        pnlTecnicosLayout.setHorizontalGroup(
            pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTecnicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTecnicosLayout.createSequentialGroup()
                        .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTecnicosLayout.createSequentialGroup()
                                .addComponent(lblNomeTecnico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNomeTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTecnicosLayout.createSequentialGroup()
                                .addComponent(lblSexoTecnicos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSexoTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlTecnicosLayout.createSequentialGroup()
                                .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSobrenomeTecnicos)
                                    .addComponent(lblCPFTecnicos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                                .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCPFTecnicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSobrenomeTecnicos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisarTecnicos)
                        .addGap(528, 528, 528))
                    .addGroup(pnlTecnicosLayout.createSequentialGroup()
                        .addComponent(lblIdadeTecnicos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlTecnicosLayout.setVerticalGroup(
            pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTecnicosLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeTecnico)
                    .addComponent(txtNomeTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSobrenomeTecnicos)
                    .addComponent(txtSobrenomeTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPFTecnicos)
                    .addComponent(txtCPFTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarTecnicos))
                .addGap(18, 18, 18)
                .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdadeTecnicos)
                    .addComponent(spnMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlTecnicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexoTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSexoTecnicos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovoTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adicionar.png"))); // NOI18N
        btnNovoTecnico.setText("Novo");

        btnSalvarTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Salvar.png"))); // NOI18N
        btnSalvarTecnico.setText("Salvar");

        btnCancelarTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        btnCancelarTecnico.setText("Cancelar");

        btnEditarTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editarCliente.png"))); // NOI18N
        btnEditarTecnico.setText("Editar");

        btnExcluirTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/excluirCliente.png"))); // NOI18N
        btnExcluirTecnico.setText("Excluir");

        btnPesquisarTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pesquisar.png"))); // NOI18N
        btnPesquisarTecnico.setText("Pesquisar");

        tblTecnicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Sobrenome", "CPF", "Idade", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTecnicos);

        btnSairTecnico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sair.png"))); // NOI18N
        btnSairTecnico.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btnNovoTecnico)
                        .addGap(55, 55, 55)
                        .addComponent(btnSalvarTecnico)
                        .addGap(46, 46, 46)
                        .addComponent(btnCancelarTecnico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarTecnico)
                        .addGap(43, 43, 43)
                        .addComponent(btnExcluirTecnico)
                        .addGap(45, 45, 45)
                        .addComponent(btnPesquisarTecnico)
                        .addGap(40, 40, 40))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlTecnicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(btnSairTecnico)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTecnicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoTecnico)
                        .addComponent(btnSalvarTecnico)
                        .addComponent(btnCancelarTecnico))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnExcluirTecnico)
                        .addComponent(btnPesquisarTecnico)
                        .addComponent(btnEditarTecnico)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSairTecnico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeTecnicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeTecnicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeTecnicosActionPerformed

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
            java.util.logging.Logger.getLogger(Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tecnicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tecnicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarTecnico;
    private javax.swing.JButton btnEditarTecnico;
    private javax.swing.JButton btnExcluirTecnico;
    private javax.swing.JButton btnNovoTecnico;
    private javax.swing.JButton btnPesquisarTecnico;
    private javax.swing.JButton btnPesquisarTecnicos;
    private javax.swing.JButton btnSairTecnico;
    private javax.swing.JButton btnSalvarTecnico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPFTecnicos;
    private javax.swing.JLabel lblFotoTecnico;
    private javax.swing.JLabel lblIdadeTecnicos;
    private javax.swing.JLabel lblNomeTecnico;
    private javax.swing.JLabel lblSexoTecnicos;
    private javax.swing.JLabel lblSobrenomeTecnicos;
    private javax.swing.JPanel pnlTecnicos;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JSpinner spnDia;
    private javax.swing.JSpinner spnMes;
    private javax.swing.JTable tblTecnicos;
    private javax.swing.JTextField txtCPFTecnicos;
    private javax.swing.JTextField txtNomeTecnicos;
    private javax.swing.JTextField txtSexoTecnicos;
    private javax.swing.JTextField txtSobrenomeTecnicos;
    // End of variables declaration//GEN-END:variables
}
