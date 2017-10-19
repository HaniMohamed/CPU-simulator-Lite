/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proga.CPUsimLite;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JEditorPane;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author hani
 */
public class MainGUI extends javax.swing.JFrame {

    List<String> finalCode = new ArrayList<>();
    String[] availRegisters = {"R1", "R2", "R3", "R4"};

    String code;

    static MainGUI m = new MainGUI();

    /**
     * Creates new form MainGUI
     */
    public MainGUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnDone = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        saveCode = new javax.swing.JButton();
        loadCode = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        runItem = new javax.swing.JMenuItem();
        loadItem = new javax.swing.JMenuItem();
        saveItem = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        exitItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        aboutItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CPU Simulator");

        jLabel2.setText("Enter Simulation Code :");

        btnDone.setText("Run");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(175, 22, 24));
        jLabel3.setText("   ");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(4, 124, 2));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Available Instructions");

        jTextArea2.setEditable(false);
        jTextArea2.setBackground(java.awt.SystemColor.controlHighlight);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("//two operands instructions:\nADD\t; add value of 2nd operand from value of 1st operand.\nSUB\t; subtract value of 2nd operand from value of 1st operand.\nMOV\t; transfer value from 2nd operand to 1 operand.\nBNZ\t; if value of 2nd operand is not zero branch to location of value of 2nd operand.\n\n//one operand instructions:\nSKZ\t; skip next instruction if value of the operand is zero.\nINC\t; increment value of the opernad.\nDEC\t; decrement value of the operand.\nINP\t; get input value and store it to the operand.\nOUT\t; output value of the opernad.\nPUSH\t;push value of the opernad to the stack;\nPOP\t;pop top of stack to location of the operand.\nSKIP\t; skip \"n\" of Instructios=> n =  value of operand.\nSKIPZ\t;pop top of stack if equal zero skip  \"n\" of Instructios.\n\n//zero operand instructions\nNEGATE\t; negate the stack top\nADD\t; pop the top two elements of stack sum them then push the result.:\nMULTIPLY\t; pop the top two elements of stack multiply them then push the result.\nEND\t; end program.");
        jScrollPane2.setViewportView(jTextArea2);

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(4, 124, 2));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Registers");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea4.setEditable(false);
        jTextArea4.setBackground(java.awt.SystemColor.controlHighlight);
        jTextArea4.setColumns(20);
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(5);
        jTextArea4.setText("Four General Purpose Registerts:\n\nR1 - R2 - R3 - R4");
        jScrollPane4.setViewportView(jTextArea4);

        saveCode.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        saveCode.setText("Save to File");
        saveCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveCodeActionPerformed(evt);
            }
        });

        loadCode.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        loadCode.setText("Load from File");
        loadCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadCodeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(4, 124, 2));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Addressing Modes");

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea5.setEditable(false);
        jTextArea5.setBackground(java.awt.SystemColor.controlHighlight);
        jTextArea5.setColumns(20);
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(5);
        jTextArea5.setText("Operand Addressing Modes:\n\nImmediate=>  #10\nMemory Indirect=>  (10)\nRegister=>  R2\nRegister Indirect=>  (R2)");
        jScrollPane5.setViewportView(jTextArea5);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setText("File");

        runItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        runItem.setText("Run");
        runItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runItemActionPerformed(evt);
            }
        });
        jMenu1.add(runItem);

        loadItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        loadItem.setText("Load from file");
        loadItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadItem);

        saveItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        saveItem.setText("Save to file");
        saveItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveItem);
        jMenu1.add(jSeparator1);

        exitItem.setText("Exit");
        exitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitItem);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Info");

        aboutItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.ALT_MASK));
        aboutItem.setText("About");
        aboutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutItemActionPerformed(evt);
            }
        });
        jMenu2.add(aboutItem);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(saveCode)
                                .addGap(18, 18, 18)
                                .addComponent(loadCode)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClose))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDone)
                    .addComponent(btnClose)
                    .addComponent(saveCode)
                    .addComponent(loadCode))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        if (checkCode()) {
            String[] codeLines = code.split("\n");
            for (int i = 0; i < jTextArea1.getLineCount(); i++) {
                finalCode.add(codeLines[i].substring(0, (codeLines[i].indexOf(";") + 1)));
            }

            m.setVisible(false);

            ProgramRun run = new ProgramRun(finalCode);

        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void saveCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveCodeActionPerformed
        // TODO add your handling code here:
        saveFile();
    }//GEN-LAST:event_saveCodeActionPerformed

    private void loadCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadCodeActionPerformed
        // TODO add your handling code here:
        loadFile();
    }//GEN-LAST:event_loadCodeActionPerformed

    private void exitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitItemActionPerformed
        // TODO add your handling code here:
        btnCloseActionPerformed(evt);
    }//GEN-LAST:event_exitItemActionPerformed

    private void aboutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutItemActionPerformed
      AboutGUI about = new AboutGUI();    

    }//GEN-LAST:event_aboutItemActionPerformed

    private void runItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runItemActionPerformed
        // TODO add your handling code here:
        btnDoneActionPerformed(evt);
    }//GEN-LAST:event_runItemActionPerformed

    private void saveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveItemActionPerformed
        // TODO add your handling code here:
        saveCodeActionPerformed(evt);
    }//GEN-LAST:event_saveItemActionPerformed

    private void loadItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadItemActionPerformed
        // TODO add your handling code here:
        loadCodeActionPerformed(evt);
    }//GEN-LAST:event_loadItemActionPerformed

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
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                m.setVisible(true);
                m.setResizable(false);
                m.setLocationRelativeTo(null);

            }
        });
    }

    public boolean checkCode() {
        boolean valid = false;
        code = jTextArea1.getText();
        String[] codeLines = code.split("\n");

        //Check for semicolon and Deleting comments if exist
        for (int i = 0; i < codeLines.length; i++) {
            if (codeLines[i].contains(";")) {
                codeLines[i] = codeLines[i].substring(0, (codeLines[i].indexOf(";") + 1));
            } else {
                showError(i);
                return false;
            }
        }

        if (code.equals("")) {
            jLabel3.setText("Error: No code entered !");

        } else {
            for (int i = 0; i < jTextArea1.getLineCount(); i++) {

                String[] words = codeLines[i].replaceAll("[;,]", "").split("\\s+");

                switch (words[0]) {
                    case "ADD":
                        //two or zero operand
                        valid = words.length == 1 || words.length == 3;
                        break;
                    case "SUB":
                        //check two operands
                        valid = words.length == 3;
                        break;
                    case "MOV":
                        //check two operands
                        valid = words.length == 3;
                        break;
                    case "BNZ":
                        //check two operands
                        valid = words.length == 3;
                        break;
                    case "SKZ":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "INP":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "INC":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "OUT":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "DEC":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "PUSH":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "POP":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "SKIP":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "SKIPZ":
                        //check one operand
                        valid = words.length == 2;
                        break;
                    case "NEGATE":
                        //zero operand
                        valid = words.length == 1;
                        break;
                    case "MULTIPLY":
                        //zero operand
                        valid = words.length == 1;
                        break;
                    case "END":
                        //zero operand
                        valid = words.length == 1;
                        break;
                    default:
                        valid = false;
                        break;
                }

                if (!valid) {
                    showError(i);
                    break;
                }
            }
        }
        if (!codeLines[codeLines.length - 1].replaceAll("[;,]", "").equals("END")) {
            valid = false;
            jLabel3.setText("Program must end with the 'END' Instruction");
        }
        return valid;
    }

    public void showError(int i) {
        jLabel3.setText("Error: in line" + (i + 1));

    }

    public void saveFile() {

        JFileChooser fileChooser = new JFileChooser();
        Component modalToComponent = null;

        if (fileChooser.showSaveDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try {
                BufferedWriter out = new BufferedWriter(new FileWriter(file.getPath()));
                out.write(jTextArea1.getText());
                out.close();
            } catch (IOException e) {
                System.out.println("Exception ");

            }
        }
    }

    public void loadFile() {
        String content = null;

        JFileChooser fileChooser = new JFileChooser();
        Component modalToComponent = null;
        if (fileChooser.showOpenDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();

            try {
                content = readFile(file.getPath(), Charset.defaultCharset());
            } catch (IOException ex) {
                Logger.getLogger(MainGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        jTextArea1.setText(content);

    }

    static String readFile(String path, Charset encoding)
            throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutItem;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnDone;
    private javax.swing.JMenuItem exitItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JButton loadCode;
    private javax.swing.JMenuItem loadItem;
    private javax.swing.JMenuItem runItem;
    private javax.swing.JButton saveCode;
    private javax.swing.JMenuItem saveItem;
    // End of variables declaration//GEN-END:variables
}
