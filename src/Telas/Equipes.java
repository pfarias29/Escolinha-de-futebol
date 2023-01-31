/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import Classes.Equipe;
import static Telas.Tecnicos.listaTecnicos;
import java.awt.Cursor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.*;

/**
 *
 * @author felip
 */
public class Equipes extends javax.swing.JFrame {
    static ArrayList<Equipe> listaEquipes = new ArrayList<>();
    private String botão;

    /**
     * Creates new form Equipes
     */
    public Equipes() {
        initComponents();

        File arquivo = new File("src/Dados/dadosEquipes.txt");
        
        try {
            FileReader fr = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(fr);
            
            while(br.ready()) {
                String[] linha = br.readLine().split(";");
                Equipe equipe = new Equipe(linha[0], linha[1], linha[2]);
                listaEquipes.add(equipe);
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }       
        
        carregarTabelaEquipes();
        
        setLocationRelativeTo(null);
        
        //Habilitar ou desabilitar funções
        btnNovoEquipe.setEnabled(true);
        btnSalvarEquipe.setEnabled(false);
        btnCancelarEquipe.setEnabled(false);
        btnEditarEquipe.setEnabled(false);
        btnExcluirEquipe.setEnabled(false);
        btnPesquisarEquipe.setEnabled(true);
        btnOKEquipe.setEnabled(false);
        btnVisualizarEquipe.setEnabled(false);
        
        //Habilitar ou desabilitar campos de textos
        txtNomeEquipe.setEnabled(false);
        cbSexoEquipe.setEnabled(false);
        cbCategoriaEquipe.setEnabled(false);
    }
    
    public void carregarTabelaEquipes(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[] {"Nome","Categoria","Sexo"},0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }            
        };
        
        for(int i=0;i<listaEquipes.size();i++){
            Object linha[] = new Object[] {listaEquipes.get(i).getNomeEquipe(),
                                           listaEquipes.get(i).getCategoria(),
                                           listaEquipes.get(i).getSexo()};
            modelo.addRow(linha);
        }
        
        //Tabela recebe modelo
        tblEquipes.setModel(modelo);
        
        tblEquipes.getColumnModel().getColumn(0).setPreferredWidth(5);
        tblEquipes.getColumnModel().getColumn(1).setPreferredWidth(20);
        tblEquipes.getColumnModel().getColumn(2).setPreferredWidth(50);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEquipes = new javax.swing.JPanel();
        lblNomeEquipes = new javax.swing.JLabel();
        txtNomeEquipe = new javax.swing.JTextField();
        lblSexoEquipes = new javax.swing.JLabel();
        cbSexoEquipe = new javax.swing.JComboBox<>();
        lblCategoria = new javax.swing.JLabel();
        cbCategoriaEquipe = new javax.swing.JComboBox<>();
        btnOKEquipe = new javax.swing.JButton();
        btnNovoEquipe = new javax.swing.JButton();
        btnSalvarEquipe = new javax.swing.JButton();
        btnCancelarEquipe = new javax.swing.JButton();
        btnEditarEquipe = new javax.swing.JButton();
        btnExcluirEquipe = new javax.swing.JButton();
        btnPesquisarEquipe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEquipes = new javax.swing.JTable();
        btnSairEquipe = new javax.swing.JButton();
        btnVisualizarEquipe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Equipes");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/team.png")).getImage());

        pnlEquipes.setBackground(new java.awt.Color(0, 153, 102));
        pnlEquipes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados das Equipes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        lblNomeEquipes.setText("Nome:");

        lblSexoEquipes.setText("Sexo:");

        cbSexoEquipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha o sexo", "Masculino", "Feminino" }));
        cbSexoEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSexoEquipeActionPerformed(evt);
            }
        });

        lblCategoria.setText("Categoria:");

        cbCategoriaEquipe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Escolha a categoria", "Júnior", "Juvenil", "Infanto Juvenil", "Infantil", "Mirim" }));

        btnOKEquipe.setText("OK");
        btnOKEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKEquipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlEquipesLayout = new javax.swing.GroupLayout(pnlEquipes);
        pnlEquipes.setLayout(pnlEquipesLayout);
        pnlEquipesLayout.setHorizontalGroup(
            pnlEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEquipesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEquipesLayout.createSequentialGroup()
                        .addGroup(pnlEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeEquipes)
                            .addComponent(lblSexoEquipes))
                        .addGap(24, 24, 24)
                        .addGroup(pnlEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSexoEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlEquipesLayout.createSequentialGroup()
                                .addComponent(txtNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnOKEquipe))))
                    .addGroup(pnlEquipesLayout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoriaEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEquipesLayout.setVerticalGroup(
            pnlEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEquipesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEquipes)
                    .addComponent(txtNomeEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOKEquipe))
                .addGap(18, 18, 18)
                .addGroup(pnlEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexoEquipes)
                    .addComponent(cbSexoEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnlEquipesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbCategoriaEquipe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNovoEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/adicionar.png"))); // NOI18N
        btnNovoEquipe.setText("Novo");
        btnNovoEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoEquipeMouseEntered(evt);
            }
        });
        btnNovoEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoEquipeActionPerformed(evt);
            }
        });

        btnSalvarEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/salvar1.png"))); // NOI18N
        btnSalvarEquipe.setText("Salvar");
        btnSalvarEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalvarEquipeMouseEntered(evt);
            }
        });
        btnSalvarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEquipeActionPerformed(evt);
            }
        });

        btnCancelarEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Cancelar.png"))); // NOI18N
        btnCancelarEquipe.setText("Cancelar");
        btnCancelarEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCancelarEquipeMouseEntered(evt);
            }
        });
        btnCancelarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarEquipeActionPerformed(evt);
            }
        });

        btnEditarEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Editar.png"))); // NOI18N
        btnEditarEquipe.setText("Editar");
        btnEditarEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEditarEquipeMouseEntered(evt);
            }
        });
        btnEditarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEquipeActionPerformed(evt);
            }
        });

        btnExcluirEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deletar.png"))); // NOI18N
        btnExcluirEquipe.setText("Excluir");
        btnExcluirEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExcluirEquipeMouseEntered(evt);
            }
        });
        btnExcluirEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEquipeActionPerformed(evt);
            }
        });

        btnPesquisarEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Pesquisar.png"))); // NOI18N
        btnPesquisarEquipe.setText("Pesquisar");
        btnPesquisarEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarEquipeMouseEntered(evt);
            }
        });
        btnPesquisarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarEquipeActionPerformed(evt);
            }
        });

        tblEquipes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Categoria", "Sexo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEquipes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEquipesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEquipes);

        btnSairEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/sair.png"))); // NOI18N
        btnSairEquipe.setText("Sair");
        btnSairEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSairEquipeMouseEntered(evt);
            }
        });
        btnSairEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairEquipeActionPerformed(evt);
            }
        });

        btnVisualizarEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/squad.png"))); // NOI18N
        btnVisualizarEquipe.setText("Visualizar Equipe");
        btnVisualizarEquipe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVisualizarEquipeMouseEntered(evt);
            }
        });
        btnVisualizarEquipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarEquipeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(pnlEquipes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNovoEquipe)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSalvarEquipe)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCancelarEquipe)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditarEquipe)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExcluirEquipe)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPesquisarEquipe)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(btnSairEquipe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVisualizarEquipe)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlEquipes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoEquipe)
                    .addComponent(btnSalvarEquipe)
                    .addComponent(btnCancelarEquipe)
                    .addComponent(btnEditarEquipe)
                    .addComponent(btnExcluirEquipe)
                    .addComponent(btnPesquisarEquipe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSairEquipe)
                    .addComponent(btnVisualizarEquipe))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSexoEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSexoEquipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSexoEquipeActionPerformed

    private void btnSairEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairEquipeActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairEquipeActionPerformed

    private void btnSalvarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEquipeActionPerformed
        if(txtNomeEquipe.getText().equals("") || cbSexoEquipe.getSelectedItem().equals("Escolha o sexo") || cbCategoriaEquipe.getSelectedItem().equals("Escolha a categoria")){
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser inseridos", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{
             String nome = txtNomeEquipe.getText();
             String categoria = String.valueOf(cbCategoriaEquipe.getSelectedItem());
             String sexo = String.valueOf(cbSexoEquipe.getSelectedItem());
             if(botão.equals("novo")){
                 Equipe equipe = new Equipe(nome,categoria,sexo);
                 listaEquipes.add(equipe);
                 File arquivo = new File("src/Dados/dadosEquipes.txt");
                 try {
                     FileWriter fw = new FileWriter(arquivo, true);
                     BufferedWriter bw = new BufferedWriter(fw);
                     bw.write(nome + ";" + categoria + ";" + sexo);
                     bw.newLine();
                     bw.close();
                 } catch (IOException ex) {
                     JOptionPane.showMessageDialog(null, "Não foi possível abrir o arquivo.", "Erro", JOptionPane.ERROR_MESSAGE);
                     return;
                 }
                 JOptionPane.showMessageDialog(null, "Equipe cadastrada com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
             }
             else if(botão.equals("editar")){
                int index = tblEquipes.getSelectedRow();
                File arquivo = new File("src/Dados/dadosEquipes.txt");
                try { 
                ArrayList<String> temp = new ArrayList<>();
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);
                for(int j = 0; br.ready(); j++) {
                    if(j != index) {
                        String linha = br.readLine();
                        temp.add(linha);
                    } else {
                        br.readLine();
                        temp.add(nome + ";" + categoria + ";" + sexo);
                    }
                }
                br.close();
                FileWriter fw = new FileWriter(arquivo);
                BufferedWriter bw = new BufferedWriter(fw);
                for(String linha : temp) {
                    bw.write(linha);
                    bw.newLine();
                }
                bw.close();
             } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, "Não foi posssível abrir o arquivo.", "Erro", 0);
                 return;
             }
                 listaEquipes.get(index).setNomeEquipe(nome);
                 listaEquipes.get(index).setCategoria(categoria);
                 listaEquipes.get(index).setSexo(sexo);
             }

             //Carregar os dados do gerente na tabela
             carregarTabelaEquipes();
             
             //Limpar os campos
             txtNomeEquipe.setText("");
             cbCategoriaEquipe.setSelectedIndex(0);
             cbSexoEquipe.setSelectedIndex(0);


             //Habilitar ou desabiltiar botões
             btnNovoEquipe.setEnabled(true);
             btnSalvarEquipe.setEnabled(false);
             btnCancelarEquipe.setEnabled(false);
             btnEditarEquipe.setEnabled(false);
             btnExcluirEquipe.setEnabled(false);
             btnPesquisarEquipe.setEnabled(true);
             btnOKEquipe.setEnabled(false);
             btnVisualizarEquipe.setEnabled(false);

             //Habilitar ou desabilitar campos de texto
            txtNomeEquipe.setEnabled(false);
            cbSexoEquipe.setEnabled(false);
            cbCategoriaEquipe.setEnabled(false);
        }
    }//GEN-LAST:event_btnSalvarEquipeActionPerformed

    private void btnNovoEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoEquipeActionPerformed
        botão = "novo";
        //Limpar os campos
        txtNomeEquipe.setText("");
        cbCategoriaEquipe.setSelectedIndex(0);
        cbSexoEquipe.setSelectedIndex(0);

        //Habilitar ou desabilitar botões
        btnNovoEquipe.setEnabled(false);
        btnSalvarEquipe.setEnabled(true);
        btnCancelarEquipe.setEnabled(true);
        btnEditarEquipe.setEnabled(false);
        btnExcluirEquipe.setEnabled(false);
        btnPesquisarEquipe.setEnabled(false);
        btnOKEquipe.setEnabled(false);
        btnVisualizarEquipe.setEnabled(false);
        
        //Habilitar ou desabilitar campos de texto
        txtNomeEquipe.setEnabled(true);
        cbSexoEquipe.setEnabled(true);
        cbCategoriaEquipe.setEnabled(true);
        
        //Deixar cursor no txtcódigo
        txtNomeEquipe.requestFocus();
    }//GEN-LAST:event_btnNovoEquipeActionPerformed

    private void btnCancelarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarEquipeActionPerformed
        //Limpar os campos
        txtNomeEquipe.setText("");
        cbSexoEquipe.setSelectedIndex(0);
        cbCategoriaEquipe.setSelectedIndex(0);
        

        //Habilitar ou desabiltiar botões
        btnNovoEquipe.setEnabled(true);
        btnSalvarEquipe.setEnabled(false);
        btnCancelarEquipe.setEnabled(false);
        btnEditarEquipe.setEnabled(false);
        btnExcluirEquipe.setEnabled(false);
        btnPesquisarEquipe.setEnabled(true);
        btnOKEquipe.setEnabled(false);
        btnVisualizarEquipe.setEnabled(false);
        
        //Habilitar ou desabilitar campos de texto
        txtNomeEquipe.setEnabled(false);
        cbSexoEquipe.setEnabled(false);
        cbCategoriaEquipe.setEnabled(false);
    }//GEN-LAST:event_btnCancelarEquipeActionPerformed

    private void tblEquipesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEquipesMouseClicked
        int i = tblEquipes.getSelectedRow();
        
        if(i>=0 && i<listaEquipes.size()){
            Equipe equipe = listaEquipes.get(i);
            txtNomeEquipe.setText(String.valueOf(equipe.getNomeEquipe()));
            cbCategoriaEquipe.setSelectedItem(String.valueOf(equipe.getCategoria()));
            cbSexoEquipe.setSelectedItem(String.valueOf(equipe.getSexo()));
        }
        
        //Habilitar ou desabiltiar botões
        btnNovoEquipe.setEnabled(true);
        btnSalvarEquipe.setEnabled(false);
        btnCancelarEquipe.setEnabled(false);
        btnEditarEquipe.setEnabled(true);
        btnExcluirEquipe.setEnabled(true);
        btnPesquisarEquipe.setEnabled(true);
        btnOKEquipe.setEnabled(false);
        btnVisualizarEquipe.setEnabled(true);
        
        //Habilitar ou desabilitar campos de texto
        txtNomeEquipe.setEnabled(false);
        cbSexoEquipe.setEnabled(false);
        cbCategoriaEquipe.setEnabled(false);
    }//GEN-LAST:event_tblEquipesMouseClicked

    private void btnEditarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEquipeActionPerformed
        botão = "editar";
        
        //Habilitar ou desabiltiar botões
        btnNovoEquipe.setEnabled(false);
        btnSalvarEquipe.setEnabled(true);
        btnCancelarEquipe.setEnabled(true);
        btnEditarEquipe.setEnabled(false);
        btnExcluirEquipe.setEnabled(false);
        btnPesquisarEquipe.setEnabled(false);
        btnOKEquipe.setEnabled(false);
        btnVisualizarEquipe.setEnabled(false);
        
        //Habilitar ou desabilitar campos de texto
        txtNomeEquipe.setEnabled(true);
        cbSexoEquipe.setEnabled(true);
        cbCategoriaEquipe.setEnabled(true);
        
        txtNomeEquipe.requestFocus();
    }//GEN-LAST:event_btnEditarEquipeActionPerformed

    private void btnExcluirEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEquipeActionPerformed
        int index = tblEquipes.getSelectedRow();

        int j = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir essa equipe?", "Atenção!", JOptionPane.WARNING_MESSAGE);
        if(j==0){

            String equipe = listaEquipes.get(index).getNomeEquipe() + ";" + listaEquipes.get(index).getCategoria() + listaEquipes.get(index).getSexo();
            
            File arquivo = new File("src/Dados/dadosEquipes.txt");

            try{
                FileReader fr = new FileReader(arquivo);
                BufferedReader br = new BufferedReader(fr);

                String linha = br.readLine();
                ArrayList<String> salvar = new ArrayList();

                while(linha!= null){
                    if(linha.equals(equipe) == false  ){
                        salvar.add(linha);
                    }
                    linha = br.readLine();
                }


                br.close();
                fr.close();
                FileWriter fw2 = new FileWriter(arquivo,true);
                fw2.close();

                FileWriter fw = new FileWriter(arquivo);
                BufferedWriter bw = new BufferedWriter(fw);

                for(int i=0;i<salvar.size();i++){
                    bw.write(salvar.get(i));
                    bw.newLine();
                }
                fw.close();
                bw.close();

            }catch(IOException  ex){
                JOptionPane.showMessageDialog(null, "Não foi posssível abrir o arquivo.", "Erro", 0);
                return;
            }           
            
            if(index>=0 && index<listaEquipes.size()){
                listaEquipes.remove(index);
            }

            carregarTabelaEquipes();

            //Limpar os campos
            txtNomeEquipe.setText("");
            cbCategoriaEquipe.setSelectedIndex(0);
            cbSexoEquipe.setSelectedIndex(0);


            //Habilitar ou desabiltiar botões
            btnNovoEquipe.setEnabled(true);
            btnSalvarEquipe.setEnabled(false);
            btnCancelarEquipe.setEnabled(false);
            btnEditarEquipe.setEnabled(false);
            btnExcluirEquipe.setEnabled(false);
            btnPesquisarEquipe.setEnabled(true);
            btnOKEquipe.setEnabled(false);
            btnVisualizarEquipe.setEnabled(false);

            //Habilitar ou desabilitar campos de texto
            txtNomeEquipe.setEnabled(false);
            cbSexoEquipe.setEnabled(false);
            cbCategoriaEquipe.setEnabled(false);
        }
    }//GEN-LAST:event_btnExcluirEquipeActionPerformed

    private void btnPesquisarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarEquipeActionPerformed
        if(listaEquipes.isEmpty()){
            JOptionPane.showMessageDialog(null,"Nenhuma equipe está cadastrada", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            //Limpar os campos
            txtNomeEquipe.setText("");
            cbCategoriaEquipe.setSelectedIndex(0);
            cbSexoEquipe.setSelectedIndex(0);


           //Habilitar ou desabiltiar botões
           btnNovoEquipe.setEnabled(false);
           btnSalvarEquipe.setEnabled(false);
           btnCancelarEquipe.setEnabled(true);
           btnEditarEquipe.setEnabled(false);
           btnExcluirEquipe.setEnabled(false);
           btnPesquisarEquipe.setEnabled(false);
           btnOKEquipe.setEnabled(true);
           btnVisualizarEquipe.setEnabled(false);

           //Habilitar ou desabilitar campos de texto
            txtNomeEquipe.setEnabled(true);
            cbSexoEquipe.setEnabled(false);
            cbCategoriaEquipe.setEnabled(false);

           txtNomeEquipe.requestFocus();   
        }
    }//GEN-LAST:event_btnPesquisarEquipeActionPerformed

    private void btnOKEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKEquipeActionPerformed
        if(txtNomeEquipe.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O nome da equipe deve ser informado", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            Equipe equipe;
            String nome = "",categoria="",sexo="";
            String nomeEquipe = txtNomeEquipe.getText();
            for(int i=0;i<listaEquipes.size();i++){
                equipe = listaEquipes.get(i);
                if(nomeEquipe.equals(equipe.getNomeEquipe())){
                    nome = equipe.getNomeEquipe();
                    categoria = equipe.getCategoria();
                    sexo = equipe.getSexo();
                }
            }
            
            if(nome.equals("")){
                JOptionPane.showMessageDialog(null, "Esta equipe não existe", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                //Limpar os campos
                txtNomeEquipe.setText("");
                cbCategoriaEquipe.setSelectedIndex(0);
                cbSexoEquipe.setSelectedIndex(0);
            }
            else{
                txtNomeEquipe.setText(nome);
                cbCategoriaEquipe.setSelectedItem(categoria);
                cbSexoEquipe.setSelectedItem(sexo);
            }
            
            txtNomeEquipe.selectAll();
            txtNomeEquipe.requestFocus();
        }
    }//GEN-LAST:event_btnOKEquipeActionPerformed

    private void btnVisualizarEquipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarEquipeActionPerformed
        new DadosEquipe().setVisible(true);
    }//GEN-LAST:event_btnVisualizarEquipeActionPerformed

    private void btnNovoEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoEquipeMouseEntered
        btnNovoEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnNovoEquipeMouseEntered

    private void btnSalvarEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarEquipeMouseEntered
        btnSalvarEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSalvarEquipeMouseEntered

    private void btnCancelarEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarEquipeMouseEntered
        btnCancelarEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCancelarEquipeMouseEntered

    private void btnEditarEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditarEquipeMouseEntered
        btnEditarEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEditarEquipeMouseEntered

    private void btnExcluirEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirEquipeMouseEntered
        btnExcluirEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnExcluirEquipeMouseEntered

    private void btnPesquisarEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarEquipeMouseEntered
        btnPesquisarEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnPesquisarEquipeMouseEntered


    private void btnSairEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairEquipeMouseEntered
        btnSairEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnSairEquipeMouseEntered

    private void btnVisualizarEquipeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVisualizarEquipeMouseEntered
        btnVisualizarEquipe.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnVisualizarEquipeMouseEntered

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
            java.util.logging.Logger.getLogger(Equipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Equipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Equipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Equipes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Equipes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarEquipe;
    private javax.swing.JButton btnEditarEquipe;
    private javax.swing.JButton btnExcluirEquipe;
    private javax.swing.JButton btnNovoEquipe;
    private javax.swing.JButton btnOKEquipe;
    private javax.swing.JButton btnPesquisarEquipe;
    private javax.swing.JButton btnSairEquipe;
    private javax.swing.JButton btnSalvarEquipe;
    private javax.swing.JButton btnVisualizarEquipe;
    private javax.swing.JComboBox<String> cbCategoriaEquipe;
    private javax.swing.JComboBox<String> cbSexoEquipe;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNomeEquipes;
    private javax.swing.JLabel lblSexoEquipes;
    private javax.swing.JPanel pnlEquipes;
    private javax.swing.JTable tblEquipes;
    private javax.swing.JTextField txtNomeEquipe;
    // End of variables declaration//GEN-END:variables
}
