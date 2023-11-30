
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author F4121
 */
public class seguro extends javax.swing.JInternalFrame {
    
    boolean arroba = false;
    boolean punto = false;
    int paso = 0;
    String mail;
    /**
     * Creates new form seguro
     */
    public seguro() {
        initComponents();
    }
public void validararroba(){
        mail = this.demail.getText();
        
         for (int i = 0; i<mail.length(); i++) {

        for (int j = 0; j<mail.length(); j++) {

            if(mail.charAt(i)=='@' && mail.charAt(j)=='.') {

                arroba = true;
                punto = true;
            }

        }

    }

    if (arroba == true && punto == true) {
        paso = 1;
        System.out.println("El mail ingresado es correcto");
    }
    else {
        System.out.println("El mail ingresado es incorrecto");
        }

    }
          
   
public void Crearh(){
        String archivo = "Seguro.txt";
        
            ArrayList cobertura = new ArrayList();
            if (CI.isSelected()) {
            cobertura.add(CI.getText()+"-"+ TCI.getSelectedItem()+",");
            }
            if (CR.isSelected()) {
            cobertura.add(CR.getText()+"-"+ TCR.getSelectedItem()+",");
            }
            if (CIN.isSelected()) {
            cobertura.add(CIN.getText()+"-"+ TCIN.getSelectedItem()+",");
            }
            
            ArrayList elementos = new ArrayList();
            if (EH.isSelected()) {
            elementos.add(EH.getText()+",");
            }
            if (EL.isSelected()) {
            elementos.add(EL.getText()+",");
            }
            if (EC.isSelected()) {
            elementos.add(EC.getText()+",");
            }
            if (EN.isSelected()) {
            elementos.add(EN.getText()+"-"+ ENC.getText()+",");
            }
            if (ECG.isSelected()) {
            elementos.add(ECG.getText()+",");
            }
            if (ET.isSelected()) {
            elementos.add(ET.getText()+"-"+ ETC.getText()+",");
            }
            //Hogar
            if(dcuil.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Llene los campos para contratar el seguro");
            }else{
                try {
                    try ( //Escribimos el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                        escribir.write("Seguro Hogar"+","+ dcuil.getText()+ "," +
                                dnombre.getText()+ "," +
                                dtelefono.getText() + "," +
                                login.lusuarios.getSelectedItem()+ "\r\n");
                                //cobertura+ "," + 
                                //elementos + "\r\n");
                    }

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            this.setVisible(false);
            }
            
}
public void Crearv(){ 
    String archivo = "Seguro.txt";
    
            ArrayList datovehiculo = new ArrayList();
            if (DD.isVisible()) {
            datovehiculo.add(DD.getText()+",");
            }
            if (DM.isEnabled()) {
            datovehiculo.add(DM.getSelectedItem()+",");
            }
            if (DMO.isEnabled()) {
            datovehiculo.add(DMO.getSelectedItem()+",");
            }
            if (DF.isEnabled()) {
            datovehiculo.add(DF.getSelectedItem()+",");
            }
            
            ArrayList coberturavehiulo = new ArrayList();
            if (CTC.isSelected()) {
            coberturavehiulo.add(CTC.getText()+",");
            }
            if (CRC.isSelected()) {
            coberturavehiulo.add(CRC.getText()+",");
            }
            if (CTRSF.isSelected()) {
            coberturavehiulo.add(CTRSF.getText()+",");
            }
            if (CTRCF.isSelected()) {
            coberturavehiulo.add(CTRCF.getText()+",");
            }
            if (CG.isSelected()) {
            coberturavehiulo.add(CG.getText()+",");
            }
            //Vehiculo
            if(dcuil.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Llene los campos para contratar el seguro");
            }else{
                try {
                    try ( //Escribimos el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                        escribir.write("Seguro Vehiculo"+","+dcuil.getText()+ "," +
                                dnombre.getText()+ "," +
                                dtelefono.getText() + "," +
                                login.lusuarios.getSelectedItem()+ "\r\n");
                                //datovehiculo+ "," + 
                                //coberturavehiulo + "\r\n");
                    }

                } catch (IOException ex) {
                    System.out.println(ex);
                }
            this.setVisible(false);
            }
        }
public void Crearvi(){ 
    String archivo = "Seguro.txt";
    
            ArrayList coberturavida = new ArrayList();
            if (CMN.isSelected()) {
            coberturavida.add(CMN.getText()+",");
            }
            if (CMA.isSelected()) {
            coberturavida.add(CMA.getText()+",");
            }
            if (CINT.isSelected()) {
            coberturavida.add(CINT.getText()+"-"+ CDI.getSelectedItem()+",");
            }
            if (CP.isSelected()) {
            coberturavida.add(CP.getText()+",");
            }
            
            ArrayList veneficiario = new ArrayList();
            if (VNA.isVisible()) {
            veneficiario.add(VNA.getText()+","+ PA.getSelectedItem()+",");
            }
            if (VNB.isVisible()) {
            veneficiario.add(VNB.getText()+","+ PB.getSelectedItem()+",");
            }
            if (VNC.isVisible()) {
            veneficiario.add(VNC.getText()+","+ PC.getSelectedItem()+",");
            }
            if (VND.isVisible()) {
            veneficiario.add(VND.getText()+","+ PD.getSelectedItem()+",");
            }
    
            //Vida
            if(dcuil.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Llene los campos para contratar el seguro");
            }else{
                try {
                    try ( //Escribimos el archivo
                        FileWriter escribir = new FileWriter(archivo,true)) {
                        escribir.write("Seguro Vida"+","+dcuil.getText()+ "," +
                                dnombre.getText()+ "," +
                                dtelefono.getText() + "," +
                                login.lusuarios.getSelectedItem()+ "\r\n");
                                //coberturavida+ "," + 
                                //veneficiario + ",");
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

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        contratarh = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        CI = new javax.swing.JCheckBox();
        CR = new javax.swing.JCheckBox();
        CIN = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        TCI = new javax.swing.JComboBox<>();
        TCR = new javax.swing.JComboBox<>();
        TCIN = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        EH = new javax.swing.JCheckBox();
        EL = new javax.swing.JCheckBox();
        EC = new javax.swing.JCheckBox();
        EN = new javax.swing.JCheckBox();
        ECG = new javax.swing.JCheckBox();
        ET = new javax.swing.JCheckBox();
        ENC = new javax.swing.JTextField();
        ETC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        label_status_hogar = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        HBUSCAR = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        contratarv = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        DD = new javax.swing.JTextField();
        DM = new javax.swing.JComboBox<>();
        DMO = new javax.swing.JComboBox<>();
        DF = new javax.swing.JComboBox<>();
        jPanel9 = new javax.swing.JPanel();
        CTC = new javax.swing.JCheckBox();
        CRC = new javax.swing.JCheckBox();
        CTRSF = new javax.swing.JCheckBox();
        CTRCF = new javax.swing.JCheckBox();
        CG = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        AN = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        label_status_vehiculo = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        ABUSCAR = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        contratarvi = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        CMN = new javax.swing.JCheckBox();
        CMA = new javax.swing.JCheckBox();
        CINT = new javax.swing.JCheckBox();
        CP = new javax.swing.JCheckBox();
        CDI = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        VNA = new javax.swing.JTextField();
        VNB = new javax.swing.JTextField();
        VNC = new javax.swing.JTextField();
        VND = new javax.swing.JTextField();
        PA = new javax.swing.JComboBox<>();
        PB = new javax.swing.JComboBox<>();
        PC = new javax.swing.JComboBox<>();
        PD = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        label_status_vida = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        VBUSCAR = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dcuil = new javax.swing.JTextField();
        dnombre = new javax.swing.JTextField();
        dtelefono = new javax.swing.JTextField();
        demail = new javax.swing.JTextField();

        setClosable(true);
        setTitle("SEGUROS");

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        contratarh.setText("Contratar");
        contratarh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarhActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cobertura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14))); // NOI18N

        CI.setText("Incendio");

        CR.setText("Robo");

        CIN.setText("Inundacion");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CIN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CI, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CI)
                .addGap(18, 18, 18)
                .addComponent(CR)
                .addGap(18, 18, 18)
                .addComponent(CIN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Cobertura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14))); // NOI18N

        TCI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Parcial", "Total" }));

        TCR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Parcial", "Total" }));

        TCIN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Parcial", "Total" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TCIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TCR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TCIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Elementos Dañados / Robados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14))); // NOI18N

        EH.setText("Heladera");

        EL.setText("Lavarropas");

        EC.setText("Cocina");

        EN.setText("Notebook");

        ECG.setText("Consola Gamer");
        ECG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ECGActionPerformed(evt);
            }
        });

        ET.setText("Televisor");

        jLabel7.setText("Cant.");

        jLabel8.setText("Cant.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EH, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EC, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(ET, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ETC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(EN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ENC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(ECG)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EH)
                    .addComponent(EN)
                    .addComponent(ENC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EL)
                    .addComponent(ECG))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EC)
                    .addComponent(ET)
                    .addComponent(ETC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("ALTA SEGURO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        label_status_hogar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton4.setText("MODIFICAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("BUSCAR");

        jButton8.setText("ELIMINAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(HBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(label_status_hogar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contratarh)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton4)
                            .addComponent(jButton1)
                            .addComponent(HBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton8))
                        .addComponent(contratarh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label_status_hogar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Hogar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));

        contratarv.setText("Contratar");
        contratarv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarvActionPerformed(evt);
            }
        });

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Vehiculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14))); // NOI18N

        jLabel10.setText("Dominio");

        jLabel11.setText("Marca");

        jLabel12.setText("Modelo");

        jLabel13.setText("Franquicia");

        DM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Ford", "Fiat", "Renault" }));

        DMO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Taunus", "Toro", "Logan" }));

        DF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "10000", "20000", "30000" }));
        DF.setEnabled(false);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addGap(38, 38, 38)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(DF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(DD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(DM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(DMO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(DF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cobertura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14))); // NOI18N

        CTC.setText("Terceros Completo");

        CRC.setText("Responsabilidad Civil");

        CTRSF.setText("Todo Riezgo sin Franquicia");

        CTRCF.setText("Todo Riezgo con Franquicia");
        CTRCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CTRCFActionPerformed(evt);
            }
        });

        CG.setText("Granizo");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(CG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CTRSF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CRC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CTC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CTRCF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(38, 38, 38))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CTC)
                .addGap(18, 18, 18)
                .addComponent(CRC)
                .addGap(18, 18, 18)
                .addComponent(CTRSF)
                .addGap(18, 18, 18)
                .addComponent(CTRCF)
                .addGap(18, 18, 18)
                .addComponent(CG)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setText("AÑO");

        AN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANActionPerformed(evt);
            }
        });

        jButton2.setText("ALTA SEGURO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        label_status_vehiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton6.setText("MODIFICAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("BUSCAR");

        jButton12.setText("ELIMINAR");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contratarv)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AN, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ABUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)
                        .addComponent(label_status_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(AN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140)
                        .addComponent(contratarv))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton2)
                            .addComponent(jButton12)
                            .addComponent(jButton7)
                            .addComponent(ABUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(label_status_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))))
        );

        jTabbedPane5.addTab("Vehiculo", jPanel2);

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        contratarvi.setText("Contratar");
        contratarvi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratarviActionPerformed(evt);
            }
        });

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cobertura", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14))); // NOI18N

        CMN.setText("Muerte natural");

        CMA.setText("Muerte accidente");

        CINT.setText("Internacion");

        CP.setText("Paralisis");

        CDI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "30", "60", "90" }));
        CDI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CDIActionPerformed(evt);
            }
        });

        jLabel16.setText("Dias");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CINT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CMA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CMN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CMN)
                .addGap(18, 18, 18)
                .addComponent(CMA)
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CINT)
                    .addComponent(CDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addComponent(CP)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Veneficiario", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14))); // NOI18N

        VNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VNCActionPerformed(evt);
            }
        });

        PA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "20%", "40%", "60%", "80%", "100%" }));

        PB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "20%", "40%", "60%", "80%", "100%" }));

        PC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "20%", "40%", "60%", "80%", "100%" }));

        PD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "20%", "40%", "60%", "80%", "100%" }));

        jLabel14.setText("Nombre y Apellido");

        jLabel15.setText("Nombre y Apellido");

        jLabel17.setText("Nombre y Apellido");

        jLabel18.setText("Nombre y Apellido");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VND)
                    .addComponent(VNC)
                    .addComponent(VNB)
                    .addComponent(VNA))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VNA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VNB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VNC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton3.setText("ALTA SEGURO");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        label_status_vida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButton10.setText("MODIFICAR");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton9.setText("BUSCAR");

        jButton11.setText("ELIMINAR");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(VBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(label_status_vida, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contratarvi)
                        .addGap(32, 32, 32))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contratarvi))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton10)
                            .addComponent(jButton9)
                            .addComponent(VBUSCAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label_status_vida, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("Vida", jPanel3);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/seguro.png"))); // NOI18N

        jLabel2.setText("CUIL/CUIL");

        jLabel3.setText("Nombre y Apellido");

        jLabel4.setText("Telefono");

        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("POLIZA DE SEGUROS");

        dcuil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dcuilActionPerformed(evt);
            }
        });
        dcuil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dcuilKeyTyped(evt);
            }
        });

        dnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnombreActionPerformed(evt);
            }
        });
        dnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dnombreKeyTyped(evt);
            }
        });

        dtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dtelefonoKeyTyped(evt);
            }
        });

        demail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dcuil, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                            .addComponent(dnombre)
                            .addComponent(dtelefono)
                            .addComponent(demail))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(95, 95, 95)))
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dcuil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(dtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(demail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane5)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(7, 7, 7)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(330, 330, 330)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contratarhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarhActionPerformed
        validararroba();
        if(paso == 1){
            Crearh();
            this.setVisible(true);
        }
    }//GEN-LAST:event_contratarhActionPerformed

    private void ECGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ECGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ECGActionPerformed

    private void contratarvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarvActionPerformed
        Crearv();
        this.setVisible(true);
    }//GEN-LAST:event_contratarvActionPerformed

    private void CTRCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CTRCFActionPerformed
        DF.setEnabled(true);
    }//GEN-LAST:event_CTRCFActionPerformed

    private void ANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ANActionPerformed

    private void contratarviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratarviActionPerformed
        Crearvi();
        this.setVisible(true);
    }//GEN-LAST:event_contratarviActionPerformed

    private void CDIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CDIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CDIActionPerformed

    private void VNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VNCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VNCActionPerformed

    private void dcuilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dcuilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dcuilActionPerformed

    private void dcuilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dcuilKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >=48 && key <= 57;

        if(!numeros){
            evt.consume();
        }
        if(dcuil.getText().length()>=11){
            evt.consume();
        }
    }//GEN-LAST:event_dcuilKeyTyped

    private void dnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnombreActionPerformed

    private void dnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dnombreKeyTyped
        int key = evt.getKeyChar();
        boolean min = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean may = key >= 65 && key <= 90;

        if (!(min||espacio||may)){
            evt.consume();
        }
        if(dnombre.getText().length()>=50){
            evt.consume();
        }
    }//GEN-LAST:event_dnombreKeyTyped

    private void dtelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dtelefonoKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >=48 && key <= 57;

        if(!numeros){
            evt.consume();
        }
        if(dtelefono.getText().length()>=8){
            evt.consume();
        }
    }//GEN-LAST:event_dtelefonoKeyTyped

    private void demailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_demailActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            // Crear
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            if (conexion!=null){
                JOptionPane.showMessageDialog(null, "Conectado a la Base");}
            //Enviando la sentencia SQL cantidad de ? por tablas
            PreparedStatement sq = conexion.prepareStatement("insert into seguro values(?,?,?,?,?,?)");

            //Especifico los campos
            sq.setString(1, "0");
            sq.setString(2, "SEGURO HOGAR");
            sq.setString(3, dcuil.getText().trim());
            sq.setString(4, dnombre.getText().trim());
            sq.setString(5, dtelefono.getText().trim());
            sq.setString(6, (String) login.lusuarios.getSelectedItem());

            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            //informar la carga
            label_status_hogar.setText("SEGURO CREADO");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            // Crear
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            if (conexion!=null){
                JOptionPane.showMessageDialog(null, "Conectado a la Base");}
            //Enviando la sentencia SQL cantidad de ? por tablas
            PreparedStatement sq = conexion.prepareStatement("insert into seguro values(?,?,?,?,?,?)");

            //Especifico los campos
            sq.setString(1, "0");
            sq.setString(2, "SEGURO VEHICULO");
            sq.setString(3, dcuil.getText().trim());
            sq.setString(4, dnombre.getText().trim());
            sq.setString(5, dtelefono.getText().trim());
            sq.setString(6, (String) login.lusuarios.getSelectedItem());

            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            //informar la carga
            label_status_vehiculo.setText("SEGURO CREADO");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            // Crear
            // Conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            if (conexion!=null){
                JOptionPane.showMessageDialog(null, "Conectado a la Base");}
            //Enviando la sentencia SQL cantidad de ? por tablas
            PreparedStatement sq = conexion.prepareStatement("insert into seguro values(?,?,?,?,?,?)");

            //Especifico los campos
            sq.setString(1, "0");
            sq.setString(2, "SEGURO VIDA");
            sq.setString(3, dcuil.getText().trim());
            sq.setString(4, dnombre.getText().trim());
            sq.setString(5, dtelefono.getText().trim());
            sq.setString(6, (String) login.lusuarios.getSelectedItem());

            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            //informar la carga
            label_status_vida.setText("SEGURO CREADO");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            // Modificar
            // conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            // Enviando la sentencia sql

            String ID = HBUSCAR.getText().trim();
            PreparedStatement sq = conexion.prepareStatement("update seguro set CUIT=?,NOMBRE=?,TELEFONO=? where IdSEGURO="+ ID);
            //Especifico los campos
            sq.setString(1, dcuil.getText().trim());
            sq.setString(2, dnombre.getText().trim());
            sq.setString(3, dtelefono.getText().trim());
            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            // informar la carga
            label_status_hogar.setText("DATOS MODIFICADOS");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try{
            // Eliminar
            // conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            // Enviando la sentencia sql
            PreparedStatement sq = conexion.prepareStatement("delete from seguro where IdSEGURO= ?");
            //Especifico los campos
            sq.setString(1, HBUSCAR.getText().trim());

            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            // informar la carga
            label_status_hogar.setText("SEGURO ELIMINADO");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
            // Modificar
            // conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            // Enviando la sentencia sql

            String ID = ABUSCAR.getText().trim();
            PreparedStatement sq = conexion.prepareStatement("update seguro set CUIT=?,NOMBRE=?,TELEFONO=? where IdSEGURO="+ ID);
            //Especifico los campos
            sq.setString(1, dcuil.getText().trim());
            sq.setString(2, dnombre.getText().trim());
            sq.setString(3, dtelefono.getText().trim());
            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            // informar la carga
            label_status_vehiculo.setText("DATOS MODIFICADOS");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        try{
            // Eliminar
            // conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            // Enviando la sentencia sql
            PreparedStatement sq = conexion.prepareStatement("delete from seguro where IdSEGURO= ?");
            //Especifico los campos
            sq.setString(1, ABUSCAR.getText().trim());

            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            // informar la carga
            label_status_vehiculo.setText("SEGURO ELIMINADO");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try{
            // Modificar
            // conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            // Enviando la sentencia sql

            String ID = VBUSCAR.getText().trim();
            PreparedStatement sq = conexion.prepareStatement("update seguro set CUIT=?,NOMBRE=?,TELEFONO=? where IdSEGURO="+ ID);
            //Especifico los campos
            sq.setString(1, dcuil.getText().trim());
            sq.setString(2, dnombre.getText().trim());
            sq.setString(3, dtelefono.getText().trim());
            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            // informar la carga
            label_status_vida.setText("DATOS MODIFICADOS");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        try{
            // Eliminar
            // conectar a la base de datos
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tpclientes", "root", "");
            // Enviando la sentencia sql
            PreparedStatement sq = conexion.prepareStatement("delete from seguro where IdSEGURO= ?");
            //Especifico los campos
            sq.setString(1, VBUSCAR.getText().trim());

            //Todo lo pedido que lo ejecute y cierre la base
            sq.executeUpdate();

            // informar la carga
            label_status_vida.setText("SEGURO ELIMINADO");

        }catch(SQLException e){

        }
    }//GEN-LAST:event_jButton11ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ABUSCAR;
    private javax.swing.JTextField AN;
    private javax.swing.JComboBox<String> CDI;
    private javax.swing.JCheckBox CG;
    private javax.swing.JCheckBox CI;
    private javax.swing.JCheckBox CIN;
    private javax.swing.JCheckBox CINT;
    private javax.swing.JCheckBox CMA;
    private javax.swing.JCheckBox CMN;
    private javax.swing.JCheckBox CP;
    private javax.swing.JCheckBox CR;
    private javax.swing.JCheckBox CRC;
    private javax.swing.JCheckBox CTC;
    private javax.swing.JCheckBox CTRCF;
    private javax.swing.JCheckBox CTRSF;
    private javax.swing.JTextField DD;
    private javax.swing.JComboBox<String> DF;
    private javax.swing.JComboBox<String> DM;
    private javax.swing.JComboBox<String> DMO;
    private javax.swing.JCheckBox EC;
    private javax.swing.JCheckBox ECG;
    private javax.swing.JCheckBox EH;
    private javax.swing.JCheckBox EL;
    private javax.swing.JCheckBox EN;
    private javax.swing.JTextField ENC;
    private javax.swing.JCheckBox ET;
    private javax.swing.JTextField ETC;
    private javax.swing.JTextField HBUSCAR;
    private javax.swing.JComboBox<String> PA;
    private javax.swing.JComboBox<String> PB;
    private javax.swing.JComboBox<String> PC;
    private javax.swing.JComboBox<String> PD;
    private javax.swing.JComboBox<String> TCI;
    private javax.swing.JComboBox<String> TCIN;
    private javax.swing.JComboBox<String> TCR;
    private javax.swing.JTextField VBUSCAR;
    private javax.swing.JTextField VNA;
    private javax.swing.JTextField VNB;
    private javax.swing.JTextField VNC;
    private javax.swing.JTextField VND;
    private javax.swing.JButton contratarh;
    private javax.swing.JButton contratarv;
    private javax.swing.JButton contratarvi;
    private javax.swing.JTextField dcuil;
    private javax.swing.JTextField demail;
    private javax.swing.JTextField dnombre;
    private javax.swing.JTextField dtelefono;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JLabel label_status_hogar;
    private javax.swing.JLabel label_status_vehiculo;
    private javax.swing.JLabel label_status_vida;
    // End of variables declaration//GEN-END:variables
}
