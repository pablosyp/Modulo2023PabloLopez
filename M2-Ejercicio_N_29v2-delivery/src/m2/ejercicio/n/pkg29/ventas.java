/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package m2.ejercicio.n.pkg29;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author F4121
 */
public class ventas extends javax.swing.JInternalFrame {


    /**
     * Creates new form ventas
     */
    public ventas() {
        initComponents();
        Date fecha1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        fecha.setText(sdf.format(fecha1));
        //this.setVisible(true);
        
    }
    int Saborescontar;
    int Saborespote;
    public void limpiar(){
        nombre.setText("");
        correo.setText("");
        cono.setSelected(false);
        cuarto.setSelected(false);
        medio.setSelected(false);
        kilo.setSelected(false);
        GA.setSelected(false);
        GB.setSelected(false);
        GC.setSelected(false);
        GD.setSelected(false);
        GE.setSelected(false);
        GF.setSelected(false);
        GG.setSelected(false);
        GH.setSelected(false);
        GI.setSelected(false);
        Saborescontar = 0;
        Saborespote = 0;
        gusto.setText(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondoq = new javax.swing.JPanel();
        correo = new javax.swing.JTextField();
        salir = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        generar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        GA = new javax.swing.JCheckBox();
        GB = new javax.swing.JCheckBox();
        GC = new javax.swing.JCheckBox();
        GD = new javax.swing.JCheckBox();
        GE = new javax.swing.JCheckBox();
        GF = new javax.swing.JCheckBox();
        GG = new javax.swing.JCheckBox();
        GH = new javax.swing.JCheckBox();
        GI = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cono = new javax.swing.JRadioButton();
        cuarto = new javax.swing.JRadioButton();
        medio = new javax.swing.JRadioButton();
        kilo = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        gusto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        delivery = new javax.swing.JButton();
        fecha = new javax.swing.JLabel();

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        salir.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        salir.setText("SALIR");
        salir.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        limpiar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        limpiar.setText("LIMPIAR");
        limpiar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });

        generar.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        generar.setText("GENERAR");
        generar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Fecha");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/1.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        GA.setText("Chocolate");
        GA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GAActionPerformed(evt);
            }
        });

        GB.setText("Frutilla");
        GB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GBActionPerformed(evt);
            }
        });

        GC.setText("Vainilla");
        GC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GCActionPerformed(evt);
            }
        });

        GD.setText("Kinoto al Whiski");
        GD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GDActionPerformed(evt);
            }
        });

        GE.setText("Banana Split");
        GE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GEActionPerformed(evt);
            }
        });

        GF.setText("Menta Granizado");
        GF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GFActionPerformed(evt);
            }
        });

        GG.setText("Granizado");
        GG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GGActionPerformed(evt);
            }
        });

        GH.setText("Chocolate Amargo");
        GH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GHActionPerformed(evt);
            }
        });

        GI.setText("Cereza");
        GI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GIActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("SABORES");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(GB, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GA, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(GH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(GG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GD)
                    .addComponent(GA)
                    .addComponent(GG))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GB, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GE)
                    .addComponent(GH))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GC)
                    .addComponent(GF)
                    .addComponent(GI))
                .addGap(18, 18, 18))
        );

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Correo");

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        cono.setText("Conito una bocha");
        cono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conoActionPerformed(evt);
            }
        });

        cuarto.setText("Pote de 1/4 Kilo");
        cuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuartoActionPerformed(evt);
            }
        });

        medio.setText("Pote de 1/2 Kilo");
        medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medioActionPerformed(evt);
            }
        });

        kilo.setText("Pote de 1 Kilo");
        kilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiloActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setText("Gustos a elegir");

        gusto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Productos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(medio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kilo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(101, 101, 101))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cuarto)
                    .addComponent(cono))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medio)
                    .addComponent(kilo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gusto))
                .addContainerGap())
        );

        delivery.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        delivery.setText("DELIVERY");
        delivery.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryActionPerformed(evt);
            }
        });

        fecha.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        fecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout fondoqLayout = new javax.swing.GroupLayout(fondoq);
        fondoq.setLayout(fondoqLayout);
        fondoqLayout.setHorizontalGroup(
            fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoqLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoqLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(correo, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(fecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(fondoqLayout.createSequentialGroup()
                        .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(fondoqLayout.createSequentialGroup()
                                .addGap(201, 201, 201)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delivery)
                            .addComponent(generar)
                            .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fondoqLayout.setVerticalGroup(
            fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoqLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoqLayout.createSequentialGroup()
                        .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fondoqLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(fondoqLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(delivery))))
                    .addComponent(jLabel1))
                .addGroup(fondoqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondoqLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(limpiar)
                        .addGap(35, 35, 35)
                        .addComponent(generar)
                        .addGap(32, 32, 32)
                        .addComponent(salir))
                    .addGroup(fondoqLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondoq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_salirActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        limpiar();
        GA.setEnabled(true);
        GB.setEnabled(true);
        GC.setEnabled(true);
        GD.setEnabled(true);
        GE.setEnabled(true);
        GF.setEnabled(true);
        GG.setEnabled(true);
        GH.setEnabled(true);
        GI.setEnabled(true);
    }//GEN-LAST:event_limpiarActionPerformed

    private void generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generarActionPerformed
        pedido P = new pedido ();
        this.setVisible(true);
        P.setVisible(true);
        String Nombre = nombre.getText();
        String Correo = correo.getText();
        pedido.nombrep.setText(nombre.getText());
        pedido.correop.setText(correo.getText());
        String pote;
        if (cono.isSelected()){
            pote = cono.getText();
            pedido.potep.setText(cono.getText());
        }else if(cuarto.isSelected()){
            pote = cuarto.getText();
            pedido.potep.setText(cuarto.getText());
        }else if(medio.isSelected()){
            pote = medio.getText();
            pedido.potep.setText(medio.getText());
        }else if(kilo.isSelected()){
            pote = kilo.getText();
            pedido.potep.setText(kilo.getText());
               }
        String sabor [] = new String[9];
        if (GA.isSelected()){
            sabor[0]=GA.getText();
            pedido.saborA.setText(GA.getText());
        }if(GB.isSelected()){
            sabor[1]=GA.getText();
            pedido.saborB.setText(GB.getText());
        }if(GC.isSelected()){
            sabor[2]=GA.getText();
            pedido.saborC.setText(GC.getText());
        }if(GD.isSelected()){
            sabor[3]=GA.getText();
            pedido.saborD.setText(GD.getText());
        }if(GE.isSelected()){
            sabor[4]=GA.getText();
            pedido.saborE.setText(GE.getText());
        }if(GF.isSelected()){
            sabor[5]=GA.getText();
            pedido.saborF.setText(GF.getText());
        }if(GG.isSelected()){
            sabor[6]=GA.getText();
            pedido.saborG.setText(GG.getText());
        }if(GH.isSelected()){
            sabor[7]=GA.getText();
            pedido.saborH.setText(GH.getText());
        }if(GI.isSelected()){
            sabor[8]=GA.getText();
            pedido.saborI.setText(GI.getText());
        }

    }//GEN-LAST:event_generarActionPerformed

    private void GAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GAActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GAActionPerformed

    private void GBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GBActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GBActionPerformed

    private void GCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GCActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GCActionPerformed

    private void GDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GDActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GDActionPerformed

    private void GEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GEActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GEActionPerformed

    private void GFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GFActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GFActionPerformed

    private void GGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GGActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GGActionPerformed

    private void GHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GHActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GHActionPerformed

    private void GIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GIActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_GIActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        Saborescontar ++;
        if (Saborescontar>=Saborespote){
            GA.setEnabled(false);
            GB.setEnabled(false);
            GC.setEnabled(false);
            GD.setEnabled(false);
            GE.setEnabled(false);
            GF.setEnabled(false);
            GG.setEnabled(false);
            GH.setEnabled(false);
            GI.setEnabled(false);
            JOptionPane.showMessageDialog(null, "No puede elegir mas gustos");
        }
    }//GEN-LAST:event_nombreActionPerformed

    private void conoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conoActionPerformed
        medio.setSelected(false);
        cuarto.setSelected(false);
        kilo.setSelected(false);
        if (cono.isSelected()) {
            Saborespote = 1;
            String cant = Integer.toString(Saborespote);
            gusto.setText(cant);
        }
    }//GEN-LAST:event_conoActionPerformed

    private void cuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuartoActionPerformed
        medio.setSelected(false);
        cono.setSelected(false);
        kilo.setSelected(false);
        if (cuarto.isSelected()) {
            Saborespote = 2;
            String cant = Integer.toString(Saborespote);
            gusto.setText(cant);
        }
    }//GEN-LAST:event_cuartoActionPerformed

    private void medioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medioActionPerformed
        cuarto.setSelected(false);
        kilo.setSelected(false);
        cono.setSelected(false);
        if (medio.isSelected()) {
            Saborespote = 3;
            String cant = Integer.toString(Saborespote);
            gusto.setText(cant);
        }
    }//GEN-LAST:event_medioActionPerformed

    private void kiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiloActionPerformed
        cuarto.setSelected(false);
        cono.setSelected(false);
        medio.setSelected(false);
        if (kilo.isSelected()) {
            Saborespote = 4;
            String cant = Integer.toString(Saborespote);
            gusto.setText(cant);
        }
    }//GEN-LAST:event_kiloActionPerformed

    private void deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryActionPerformed
        delivery D = new delivery ();
        this.setVisible(true);
        D.setVisible(true);

    }//GEN-LAST:event_deliveryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox GA;
    private javax.swing.JCheckBox GB;
    private javax.swing.JCheckBox GC;
    private javax.swing.JCheckBox GD;
    private javax.swing.JCheckBox GE;
    private javax.swing.JCheckBox GF;
    private javax.swing.JCheckBox GG;
    private javax.swing.JCheckBox GH;
    private javax.swing.JCheckBox GI;
    private javax.swing.JRadioButton cono;
    private javax.swing.JTextField correo;
    private javax.swing.JRadioButton cuarto;
    private javax.swing.JButton delivery;
    private javax.swing.JLabel fecha;
    private javax.swing.JPanel fondoq;
    private javax.swing.JButton generar;
    private javax.swing.JLabel gusto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton kilo;
    private javax.swing.JButton limpiar;
    private javax.swing.JRadioButton medio;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
