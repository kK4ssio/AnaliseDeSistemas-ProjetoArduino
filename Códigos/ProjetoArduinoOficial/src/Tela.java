
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;
import javax.swing.JOptionPane;

public class Tela extends javax.swing.JFrame {

    private SerialPort serialPort;

    public Tela() {
        initComponents();
         preencherPortasDisponiveis();
    }
  private void preencherPortasDisponiveis() {
        // Limpar as portas existentes na JComboBox
        SelectPortas.removeAllItems();
        
        // Obter a lista de portas seriais disponíveis
        String[] portNames = SerialPortList.getPortNames();
        
        // Adicionar cada porta serial disponível à JComboBox
        for (String portName : portNames) {
            SelectPortas.addItem(portName);
        }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        AbrirComunica = new javax.swing.JButton();
        PararComunica = new javax.swing.JButton();
        texto = new javax.swing.JTextField();
        SelectPortas = new javax.swing.JComboBox<>();
        Imprimir = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AbrirComunica.setText("INICIAR");
        AbrirComunica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirComunicaActionPerformed(evt);
            }
        });

        PararComunica.setText("PARAR");
        PararComunica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararComunicaActionPerformed(evt);
            }
        });

        texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoActionPerformed(evt);
            }
        });

        SelectPortas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        SelectPortas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectPortasActionPerformed(evt);
            }
        });

        Imprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AbrirComunica, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(PararComunica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(154, 154, 154))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texto)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(SelectPortas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(texto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SelectPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Imprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(AbrirComunica)
                .addGap(18, 18, 18)
                .addComponent(PararComunica)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoActionPerformed
             try {
        if (serialPort != null && serialPort.isOpened()) {
            String texto = Imprimir.getText();
            serialPort.writeString(texto);
            JOptionPane.showMessageDialog(this, "Texto enviado para a porta serial: " + texto);
        } else {
            JOptionPane.showMessageDialog(this, "Comunicação serial não está aberta.");
        }
    } catch (SerialPortException ex) {
        JOptionPane.showMessageDialog(this, "Erro ao enviar dados pela comunicação serial: " + ex.getMessage());
        
    }
      
        
        
        
        
    }//GEN-LAST:event_textoActionPerformed

    private void PararComunicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararComunicaActionPerformed
        try {
            if (serialPort != null && serialPort.isOpened()) {
                serialPort.closePort();
                JOptionPane.showMessageDialog(this, "Comunicação serial fechada com sucesso.");
            }
        }catch (SerialPortException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao fechar a comunicação serial: " + ex.getMessage());
                

        }
    }//GEN-LAST:event_PararComunicaActionPerformed

    private void ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImprimirActionPerformed
  if (serialPort != null && serialPort.isOpened()) {
        Imprimir.setText("Conexão serial está aberta.");
    } else {
        Imprimir.setText("Conexão serial não está aberta.");
    }
    }//GEN-LAST:event_ImprimirActionPerformed

    private void AbrirComunicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirComunicaActionPerformed
        serialPort = new SerialPort("COM6");

        try {
            serialPort.openPort();
            serialPort.setParams(9600, 8, 1, 0);
            JOptionPane.showMessageDialog(this, "Comunicação serial aberta com sucesso.");

        } catch (SerialPortException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao abrir a comunicação serial: " + ex.getMessage());
        }

    }//GEN-LAST:event_AbrirComunicaActionPerformed

    private void SelectPortasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectPortasActionPerformed
          // Limpar as portas existentes na JComboBox
    SelectPortas.removeAllItems();
    
    // Obter a lista de portas seriais disponíveis
    String[] portNames = SerialPortList.getPortNames();
    
    // Adicionar cada porta serial disponível à JComboBox
    for (String portName : portNames) {
        SelectPortas.addItem(portName);
    }
    }//GEN-LAST:event_SelectPortasActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirComunica;
    private javax.swing.JTextField Imprimir;
    private javax.swing.JButton PararComunica;
    private javax.swing.JComboBox<String> SelectPortas;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JTextField texto;
    // End of variables declaration//GEN-END:variables
}
