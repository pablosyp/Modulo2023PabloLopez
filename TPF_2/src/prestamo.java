
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author F4121
 */
public class prestamo extends javax.swing.JInternalFrame {
    double int80=80,int100=100,int150=150;  
    double capital, tiempo, interes, resultado, cuotas;
    /**
     * Creates new form prestamo
     */
    public prestamo() {
        initComponents();
    }
public void limpiar(){
        pcuit.setText("");
        pcapital.setText("");
        ptiempo.setText("");
        pinteres.setSelectedIndex(0);
        ptotal.setText("");
        pcuotas.setText("");
    }
public void Crear(){
 
        String archivo = "Prestamo.txt";
        
        String cuit = pcuit.getText();
        String capital = pcapital.getText();
        String tiempo = ptiempo.getText();
        //String interes = pinteres.setSelectedIndex(0);
        String total = ptotal.getText();
        String cuotas = pcuotas.getText();
        
    
        if(pcuit.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese CUIT - Dato obligatorio");
        }else{
            try {
                try ( //Escribimos el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                    escribir.write(pcuit.getText()+ "-" + pcapital.getText()+ "-"
                    + ptiempo.getText()+ "-"+ ptotal.getText()+ "-"+ pcuotas.getText()+ "-"+ login.lusuarios.getSelectedItem()+ "-"+ "\r\n");
                }
                
            } catch (IOException ex) {
                System.out.println(ex);
            }
        this.setVisible(false);

        
    }
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pcapital = new javax.swing.JTextField();
        ptiempo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ptotal = new javax.swing.JTextField();
        pcuotas = new javax.swing.JTextField();
        pinteres = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pcuit = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("PRESTAMOS");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel3.setText("CAPITAL");

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setText("TIEMPO");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel5.setText("INTERES %");

        pcapital.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pcapitalKeyTyped(evt);
            }
        });

        ptiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptiempoActionPerformed(evt);
            }
        });
        ptiempo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ptiempoKeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton2.setText("CALCULAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel6.setText("TOTAL $");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("CUOTAS DE");

        pcuotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcuotasActionPerformed(evt);
            }
        });

        pinteres.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "80", "100", "150" }));

        jButton3.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jButton3.setText("CONTRATAR PRESTAMO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setText("CUIT/CUIL");

        pcuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcuitActionPerformed(evt);
            }
        });
        pcuit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pcuitKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ptotal, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                            .addComponent(jLabel8))
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(pcapital, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pinteres, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pcuotas, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(ptiempo)
                    .addComponent(pcuit))
                .addGap(47, 47, 47))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pcuit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pcapital, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ptiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pinteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcuotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton3)
                .addGap(16, 16, 16))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bc.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("SOLICITUD DE PRESTAMOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pcuotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcuotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcuotasActionPerformed

    private void pcapitalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcapitalKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >=48 && key <= 57;

        if(!numeros){
            evt.consume();
        }
        if(pcapital.getText().length()>=9){
            evt.consume();
        }
    }//GEN-LAST:event_pcapitalKeyTyped

    private void ptiempoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ptiempoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >=48 && key <= 57;
        
        if(!numeros){
            evt.consume();
        }
        if(ptiempo.getText().length()>=3){
            evt.consume();
        }
    }//GEN-LAST:event_ptiempoKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        capital=Double.parseDouble(pcapital.getText());
        tiempo=Double.parseDouble(ptiempo.getText());
        interes=Double.parseDouble((String) pinteres.getSelectedItem());
        
        //monto=Math.pow(1+tiempo, interes)*capital;
        //interes=monto-capital;
        
        ptotal.setText(Double.toString(interes));
        pcuotas.setText(Double.toString(cuotas));
        
        switch(pinteres.getSelectedIndex()){
        case(1) -> {
            resultado=((capital * 80) /100) + capital;
            pcuotas.setText(String.format("%.2f",resultado / tiempo));
            }
        case(2) -> {
            resultado=((capital * 100) /100) + capital;
            pcuotas.setText(String.format("%.2f", resultado / tiempo));
            }
        case(3) -> {
            resultado=((capital * 150) /100) + capital;
            pcuotas.setText(String.format("%.2f", resultado / tiempo));
            }
        }
        ptotal.setText(String.format("%.2f",resultado));
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ptiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptiempoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        /*formularioprestamo P = new formularioprestamo ();
        gestor.fondo.add(P);
        P.show();
        this.setVisible(false);
*/
        Crear();
        this.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void pcuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcuitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcuitActionPerformed

    private void pcuitKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pcuitKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >=48 && key <= 57;

        if(!numeros){
            evt.consume();
        }
        if(pcuit.getText().length()>=11){
            evt.consume();
        }
    }//GEN-LAST:event_pcuitKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField pcapital;
    private javax.swing.JTextField pcuit;
    private javax.swing.JTextField pcuotas;
    private javax.swing.JComboBox<String> pinteres;
    private javax.swing.JTextField ptiempo;
    private javax.swing.JTextField ptotal;
    // End of variables declaration//GEN-END:variables

}
