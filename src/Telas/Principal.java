/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Telas;

import java.awt.Cursor;

/**
 *
 * @author felip
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnJogadoresPrincipal = new javax.swing.JButton();
        btnTécnicosPrincipal = new javax.swing.JButton();
        btnArbitrosPrincipal = new javax.swing.JButton();
        btnEquipesPrincipal = new javax.swing.JButton();
        btnCampeonatosPrincipal = new javax.swing.JButton();
        btnPartidasPrincipal = new javax.swing.JButton();
        btnFecharPrincipal = new javax.swing.JButton();
        lblTituloPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Escolinha de Futebol Tok de Bola");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/images/ball.png")).getImage());

        jPanel1.setBackground(new java.awt.Color(0, 153, 102));

        btnJogadoresPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/player.png"))); // NOI18N
        btnJogadoresPrincipal.setText("Jogadores");
        btnJogadoresPrincipal.setToolTipText("Dados de todos os jogadores da escolinha");
        btnJogadoresPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnJogadoresPrincipalMouseEntered(evt);
            }
        });
        btnJogadoresPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogadoresPrincipalActionPerformed(evt);
            }
        });

        btnTécnicosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manager.png"))); // NOI18N
        btnTécnicosPrincipal.setText("Técnicos");
        btnTécnicosPrincipal.setToolTipText("Dados de todos os técnicos da escolinha");
        btnTécnicosPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTécnicosPrincipalMouseEntered(evt);
            }
        });
        btnTécnicosPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTécnicosPrincipalActionPerformed(evt);
            }
        });

        btnArbitrosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/referee.png"))); // NOI18N
        btnArbitrosPrincipal.setText("Árbitros");
        btnArbitrosPrincipal.setToolTipText("Dados de todos os árbitros da escolinha");
        btnArbitrosPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnArbitrosPrincipalMouseEntered(evt);
            }
        });
        btnArbitrosPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbitrosPrincipalActionPerformed(evt);
            }
        });

        btnEquipesPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/team.png"))); // NOI18N
        btnEquipesPrincipal.setText("Equipes");
        btnEquipesPrincipal.setToolTipText("Dados de todas as equipes da escolinha");
        btnEquipesPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEquipesPrincipalMouseEntered(evt);
            }
        });
        btnEquipesPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEquipesPrincipalActionPerformed(evt);
            }
        });

        btnCampeonatosPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/league.png"))); // NOI18N
        btnCampeonatosPrincipal.setText("Campeonatos");
        btnCampeonatosPrincipal.setToolTipText("Dados de todos os campeonatos da escolinha");
        btnCampeonatosPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCampeonatosPrincipalMouseEntered(evt);
            }
        });
        btnCampeonatosPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCampeonatosPrincipalActionPerformed(evt);
            }
        });

        btnPartidasPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/match.png"))); // NOI18N
        btnPartidasPrincipal.setText("Partidas");
        btnPartidasPrincipal.setToolTipText("Dados de todas as partidas da escolinha");
        btnPartidasPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPartidasPrincipalMouseEntered(evt);
            }
        });
        btnPartidasPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPartidasPrincipalActionPerformed(evt);
            }
        });

        btnFecharPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SairMaior1.png"))); // NOI18N
        btnFecharPrincipal.setText("Fechar");
        btnFecharPrincipal.setToolTipText("Sair do programa");
        btnFecharPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFecharPrincipalMouseEntered(evt);
            }
        });
        btnFecharPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharPrincipalActionPerformed(evt);
            }
        });

        lblTituloPrincipal.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 36)); // NOI18N
        lblTituloPrincipal.setText("Escolinha de Futebol Tok de Bola");
        lblTituloPrincipal.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTituloPrincipal)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnJogadoresPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEquipesPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTécnicosPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCampeonatosPrincipal))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPartidasPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnArbitrosPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(btnFecharPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTituloPrincipal)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTécnicosPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnJogadoresPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArbitrosPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnEquipesPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCampeonatosPrincipal))
                    .addComponent(btnPartidasPrincipal))
                .addGap(39, 39, 39)
                .addComponent(btnFecharPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnJogadoresPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnJogadoresPrincipalMouseEntered
        btnJogadoresPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnJogadoresPrincipalMouseEntered

    private void btnTécnicosPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTécnicosPrincipalMouseEntered
        btnTécnicosPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnTécnicosPrincipalMouseEntered

    private void btnArbitrosPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnArbitrosPrincipalMouseEntered
        btnArbitrosPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnArbitrosPrincipalMouseEntered

    private void btnEquipesPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEquipesPrincipalMouseEntered
        btnEquipesPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnEquipesPrincipalMouseEntered

    private void btnCampeonatosPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCampeonatosPrincipalMouseEntered
        btnCampeonatosPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnCampeonatosPrincipalMouseEntered

    private void btnPartidasPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPartidasPrincipalMouseEntered
        btnPartidasPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnPartidasPrincipalMouseEntered

    private void btnFecharPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharPrincipalMouseEntered
        btnFecharPrincipal.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnFecharPrincipalMouseEntered

    private void btnTécnicosPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTécnicosPrincipalActionPerformed
        new Tecnicos().setVisible(true);
    }//GEN-LAST:event_btnTécnicosPrincipalActionPerformed

    private void btnEquipesPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEquipesPrincipalActionPerformed
        new Equipes().setVisible(true);
    }//GEN-LAST:event_btnEquipesPrincipalActionPerformed

    private void btnCampeonatosPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCampeonatosPrincipalActionPerformed
        new Campeonatos().setVisible(true);
    }//GEN-LAST:event_btnCampeonatosPrincipalActionPerformed

    private void btnPartidasPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPartidasPrincipalActionPerformed
        new CriandoPartida().setVisible(true);
    }//GEN-LAST:event_btnPartidasPrincipalActionPerformed

    private void btnFecharPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharPrincipalActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btnFecharPrincipalActionPerformed

    private void btnJogadoresPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogadoresPrincipalActionPerformed
        new CriandoJogador().setVisible(true);
    }//GEN-LAST:event_btnJogadoresPrincipalActionPerformed

    private void btnArbitrosPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbitrosPrincipalActionPerformed
        new Arbitros().setVisible(true);
    }//GEN-LAST:event_btnArbitrosPrincipalActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbitrosPrincipal;
    private javax.swing.JButton btnCampeonatosPrincipal;
    private javax.swing.JButton btnEquipesPrincipal;
    private javax.swing.JButton btnFecharPrincipal;
    private javax.swing.JButton btnJogadoresPrincipal;
    private javax.swing.JButton btnPartidasPrincipal;
    private javax.swing.JButton btnTécnicosPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
