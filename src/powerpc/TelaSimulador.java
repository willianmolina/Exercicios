/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerpc;

import javax.swing.JOptionPane;
import powerpc.memoria.Memoria;
import powerpc.memoria.Registrador;
import powerpc.memoria.Uc;
import powerpc.memoria.Ula;
import powerpc.memoria.VetorRegistrador;

/**
 *
 * @author Usuario
 */
public class TelaSimulador extends javax.swing.JFrame {
    
    Registrador[] vetorRE = new Registrador[32];
    String opcode;
    String[] textocaixaentrada;
    String aux1;
    String aux2;
    String aux3;
    int programcounter = 0;
    Ula ula;
    Uc uc;
    Memoria memoria;
    Registrador r1;
    Registrador r2;
    Registrador r3;
    Registrador r4;
    Registrador r5;
    Registrador r6;
    Registrador r7;
    Registrador r8;
    Registrador r9;
    Registrador r10;
    Registrador r11;
    Registrador r12;
    Registrador r13;
    Registrador r14;
    Registrador r15;
    Registrador r16;
    Registrador r17;
    Registrador r18;
    Registrador r19;
    Registrador r20;
    Registrador r21;
    Registrador r22;
    Registrador r23;
    Registrador r24;
    Registrador r25;
    Registrador r26;
    Registrador r27;
    Registrador r28;
    Registrador r29;
    Registrador r30;
    Registrador r31;
    Registrador r32;
    
    
  

    public TelaSimulador() {
        
        ula = new Ula();
        memoria = new Memoria();
        uc = new Uc(memoria);
        
        r1 = new Registrador(memoria);
        r2 = new Registrador(memoria);
        r3 = new Registrador(memoria); 
        r4 = new Registrador(memoria);
        r5 = new Registrador(memoria);
        r6 = new Registrador(memoria);
        r7 = new Registrador(memoria);
        r8 = new Registrador(memoria);
        r9 = new Registrador(memoria);
        r10 = new Registrador(memoria);
        r11 = new Registrador(memoria);
        r12 = new Registrador(memoria); 
        r13 = new Registrador(memoria);
        r14 = new Registrador(memoria);
        r15 = new Registrador(memoria);
        r16 = new Registrador(memoria);
        r17 = new Registrador(memoria);
        r18 = new Registrador(memoria);
        r19 = new Registrador(memoria);
        r20 = new Registrador(memoria);
        r21 = new Registrador(memoria);
        r22 = new Registrador(memoria);
        r23 = new Registrador(memoria);
        r24 = new Registrador(memoria);
        r25 = new Registrador(memoria);
        r26 = new Registrador(memoria);
        r27 = new Registrador(memoria);
        r28 = new Registrador(memoria);
        r29 = new Registrador(memoria);
        r30 = new Registrador(memoria);
        r31 = new Registrador(memoria);
        r32 = new Registrador(memoria);
        vetorRE[0] = r1;
        vetorRE[1] = r2;
        vetorRE[2] = r3;
        vetorRE[3] = r4;
        vetorRE[4] = r5;
        vetorRE[5] = r6;
        vetorRE[6] = r7;
        vetorRE[7] = r8;
        vetorRE[8] = r9;
        vetorRE[9] = r10;
        vetorRE[10] = r11;
        vetorRE[11] = r12;
        vetorRE[12] = r13;
        vetorRE[13] = r14;
        vetorRE[14] = r15;
        vetorRE[15] = r16;
        vetorRE[16] = r17;
        vetorRE[17] = r18;
        vetorRE[18] = r19;
        vetorRE[19] = r20;
        vetorRE[20] = r21; 
        vetorRE[21] = r22; 
        vetorRE[22] = r23;       
        vetorRE[23] = r24;
        vetorRE[24] = r25; 
        vetorRE[25] = r26; 
        vetorRE[26] = r27;
        vetorRE[27] = r28;
        vetorRE[28] = r29; 
        vetorRE[29] = r30; 
        vetorRE[30] = r31;
        vetorRE[31] = r32; 
        
        memoria.store(0, 5);
        memoria.store(1, 10);
        memoria.store(2, 30);
      
     /*
        vetorRE[0].load(1);
        vetorRE[1].load(2);
*/
        initComponents();

        Update();
   
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        rr1 = new javax.swing.JTextField();
        rr3 = new javax.swing.JTextField();
        rr2 = new javax.swing.JTextField();
        rr4 = new javax.swing.JTextField();
        rr5 = new javax.swing.JTextField();
        rr6 = new javax.swing.JTextField();
        rr7 = new javax.swing.JTextField();
        rr8 = new javax.swing.JTextField();
        rr9 = new javax.swing.JTextField();
        rr10 = new javax.swing.JTextField();
        rr11 = new javax.swing.JTextField();
        rr12 = new javax.swing.JTextField();
        rr13 = new javax.swing.JTextField();
        rr14 = new javax.swing.JTextField();
        rr15 = new javax.swing.JTextField();
        rr16 = new javax.swing.JTextField();
        rr17 = new javax.swing.JTextField();
        rr18 = new javax.swing.JTextField();
        rr19 = new javax.swing.JTextField();
        rr20 = new javax.swing.JTextField();
        rr21 = new javax.swing.JTextField();
        rr22 = new javax.swing.JTextField();
        rr23 = new javax.swing.JTextField();
        rr24 = new javax.swing.JTextField();
        rr25 = new javax.swing.JTextField();
        rr26 = new javax.swing.JTextField();
        rr27 = new javax.swing.JTextField();
        rr28 = new javax.swing.JTextField();
        rr29 = new javax.swing.JTextField();
        rr30 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        rr31 = new javax.swing.JTextField();
        rr32 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        caixaentrada = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        m1 = new javax.swing.JTextField();
        m2 = new javax.swing.JTextField();
        m3 = new javax.swing.JTextField();
        m4 = new javax.swing.JTextField();
        m5 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel42 = new javax.swing.JLabel();
        pc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Registradores");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, 40));

        jLabel2.setText("R1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, -1, -1));

        jLabel3.setText("R2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        jLabel4.setText("R3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, -1, -1));

        jLabel5.setText("R4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        jLabel6.setText("R5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, -1, -1));

        jLabel7.setText("R6");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));

        jLabel8.setText("R7");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, -1, -1));

        jLabel9.setText("R8");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 390, -1, -1));

        jLabel10.setText("R9");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 430, -1, -1));

        jLabel11.setText("R10");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, -1, -1));

        jLabel12.setText("R11");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

        jLabel13.setText("R12");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 550, -1, -1));

        jLabel14.setText("R13");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 590, -1, -1));

        jLabel15.setText("R14");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 630, -1, -1));

        jLabel16.setText("R15");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 670, -1, -1));

        jLabel17.setText("R16");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 710, -1, -1));

        jLabel18.setText("R17");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 110, -1, -1));

        jLabel19.setText("R18");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 150, -1, -1));

        jLabel20.setText("R19");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 190, -1, -1));

        jLabel21.setText("R20");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 230, -1, -1));

        jLabel22.setText("R21");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, -1, -1));

        jLabel23.setText("R22");
        jLabel23.setToolTipText("");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 310, -1, -1));

        jLabel24.setText("R23");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, -1, -1));

        jLabel25.setText("R24");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, -1, -1));

        jLabel26.setText("R25");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, -1, -1));

        jLabel27.setText("R26");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, -1, -1));

        jLabel28.setText("R27");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, -1, -1));

        jLabel29.setText("R28");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 550, -1, 10));

        jLabel30.setText("R29");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, -1, -1));

        jLabel31.setText("R30");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 630, -1, -1));

        rr1.setEditable(false);
        rr1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 110, 50, 20));

        rr3.setEditable(false);
        rr3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 190, 50, -1));

        rr2.setEditable(false);
        rr2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr2ActionPerformed(evt);
            }
        });
        getContentPane().add(rr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 50, -1));

        rr4.setEditable(false);
        rr4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 50, -1));

        rr5.setEditable(false);
        rr5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 50, -1));

        rr6.setEditable(false);
        rr6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr6ActionPerformed(evt);
            }
        });
        getContentPane().add(rr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 50, -1));

        rr7.setEditable(false);
        rr7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr7ActionPerformed(evt);
            }
        });
        getContentPane().add(rr7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 350, 50, -1));

        rr8.setEditable(false);
        rr8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr8ActionPerformed(evt);
            }
        });
        getContentPane().add(rr8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 390, 50, -1));

        rr9.setEditable(false);
        rr9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr9ActionPerformed(evt);
            }
        });
        getContentPane().add(rr9, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 50, -1));

        rr10.setEditable(false);
        rr10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr10ActionPerformed(evt);
            }
        });
        getContentPane().add(rr10, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 50, -1));

        rr11.setEditable(false);
        rr11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr11ActionPerformed(evt);
            }
        });
        getContentPane().add(rr11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 50, -1));

        rr12.setEditable(false);
        rr12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr12ActionPerformed(evt);
            }
        });
        getContentPane().add(rr12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 50, -1));

        rr13.setEditable(false);
        rr13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr13ActionPerformed(evt);
            }
        });
        getContentPane().add(rr13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 590, 50, -1));

        rr14.setEditable(false);
        rr14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr14ActionPerformed(evt);
            }
        });
        getContentPane().add(rr14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 630, 50, -1));

        rr15.setEditable(false);
        rr15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr15ActionPerformed(evt);
            }
        });
        getContentPane().add(rr15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 670, 50, -1));

        rr16.setEditable(false);
        rr16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr16, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 710, 50, -1));

        rr17.setEditable(false);
        rr17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr17ActionPerformed(evt);
            }
        });
        getContentPane().add(rr17, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 110, 50, -1));

        rr18.setEditable(false);
        rr18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr18, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 150, 50, -1));

        rr19.setEditable(false);
        rr19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr19, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 190, 50, -1));

        rr20.setEditable(false);
        rr20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr20ActionPerformed(evt);
            }
        });
        getContentPane().add(rr20, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, 50, -1));

        rr21.setEditable(false);
        rr21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr21, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 50, -1));

        rr22.setEditable(false);
        rr22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr22, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 310, 50, -1));

        rr23.setEditable(false);
        rr23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rr23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rr23ActionPerformed(evt);
            }
        });
        getContentPane().add(rr23, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 350, 50, -1));

        rr24.setEditable(false);
        rr24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr24, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 390, 50, -1));

        rr25.setEditable(false);
        rr25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr25, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 430, 50, -1));

        rr26.setEditable(false);
        rr26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr26, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 470, 50, -1));

        rr27.setEditable(false);
        rr27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr27, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 510, 50, -1));

        rr28.setEditable(false);
        rr28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr28, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 550, 50, -1));

        rr29.setEditable(false);
        rr29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr29, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 590, 50, -1));

        rr30.setEditable(false);
        rr30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr30, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 630, 50, -1));

        jLabel32.setText("R31");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 670, -1, -1));

        jLabel33.setText("R32");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 710, -1, -1));

        rr31.setEditable(false);
        rr31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr31, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 670, 50, -1));

        rr32.setEditable(false);
        rr32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(rr32, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 710, 50, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel34.setText("Entrada");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 68, -1, -1));

        caixaentrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caixaentradaActionPerformed(evt);
            }
        });
        getContentPane().add(caixaentrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 184, 29));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel36.setText("Memórias");
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("M2");
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel39.setText("M3");
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel40.setText("M1");
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("M4");
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel41.setText("M5");
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        m1.setEditable(false);
        m1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 98, -1));

        m2.setEditable(false);
        m2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 98, -1));

        m3.setEditable(false);
        m3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(m3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 98, -1));

        m4.setEditable(false);
        m4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(m4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 590, 98, -1));

        m5.setEditable(false);
        m5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(m5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 660, 98, -1));

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("Tutorial:\n\nLOAD:  Registrador, Memória\nSTORE: Memória, valor \nADD:   Registrador Destino, Registrador Operando1, Registrador Operando2\nSUB:   Registrador Destino, Registrador Operando1, Registrador Operando2\nMULT:  Registrador Destino, Registrador Operando1, Registrador Operando2\nDIV:   Registrador Destino, Registrador Operando1, Registrador Operando2\nMemória: começa em '0' na chave e '1' no Nome\nRegistrador: começa em '0' na posição");
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 588, 190));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("PC");
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, -1, -1));

        pc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 80, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr6ActionPerformed

    private void rr7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr7ActionPerformed

    private void rr8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr8ActionPerformed

    private void rr9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr9ActionPerformed

    private void rr10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr10ActionPerformed

    private void rr11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr11ActionPerformed

    private void rr12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr12ActionPerformed

    private void rr13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr13ActionPerformed

    private void rr14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr14ActionPerformed

    private void rr15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr15ActionPerformed

    private void rr17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr17ActionPerformed

    private void rr20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr20ActionPerformed

    private void rr23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr23ActionPerformed

    private void caixaentradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caixaentradaActionPerformed
        textocaixaentrada = caixaentrada.getText().split(" ");
        opcode = textocaixaentrada[0];

          try {
              
            aux1 = textocaixaentrada[1];
           
            aux2 = textocaixaentrada[2];
           
            aux3 = textocaixaentrada[3];
            
            
            
        } catch (Exception e) {

        }
        
          finally{
              
        if(opcode != null && aux1!= null && aux2 != null && aux3!= null){
       
            uc.interpretador(opcode, vetorRE[Integer.parseInt(aux1)], vetorRE[Integer.parseInt(aux2)], vetorRE[Integer.parseInt(aux3)]);        
        
               aux1 = null;
               aux2 = null;
               aux3 = null;   
               programcounter+=1;
               
         
        }
        
        else if(opcode != null && aux1 != null && aux2 != null && aux3 == null){
   
            uc.interpretador(opcode, Integer.parseInt(aux2) , vetorRE[Integer.parseInt(aux1)]);
          
            aux1 = null;
            aux2 = null;
            aux3 = null;
            programcounter+=1;
               
        
        }
        
        
        else {
                JOptionPane.showMessageDialog(null, "Digite uma entrada correta");
                
                caixaentrada.setText("");
            }
        
          }
          
          caixaentrada.setText("");
          
        Update();
        
       
          
    }//GEN-LAST:event_caixaentradaActionPerformed

    private void rr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rr2ActionPerformed

    
     
       
    
    public void Update() {
        this.m1.setText("" + memoria.ler(0));
        this.m2.setText("" + memoria.ler(1));
        this.m3.setText("" + memoria.ler(2));
        this.m4.setText("" + memoria.ler(3));
        this.m5.setText("" + memoria.ler(4));
        
 
        this.rr1.setText("" + vetorRE[0].ler());
        this.rr2.setText("" + vetorRE[1].ler());
        this.rr3.setText("" + vetorRE[2].ler());
        this.rr4.setText("" + vetorRE[3].ler());
        this.rr5.setText("" + vetorRE[4].ler()); 
        this.rr6.setText("" + vetorRE[5].ler()); 
        this.rr7.setText("" + vetorRE[6].ler()); 
        this.rr8.setText("" + vetorRE[7].ler()); 
        this.rr9.setText("" + vetorRE[8].ler());
        this.rr10.setText("" + vetorRE[9].ler()); 
        this.rr11.setText("" + vetorRE[10].ler()); 
        this.rr12.setText("" + vetorRE[11].ler());
        this.rr13.setText("" + vetorRE[12].ler()); 
        this.rr14.setText("" + vetorRE[13].ler());
        this.rr15.setText("" + vetorRE[14].ler());
        this.rr16.setText("" + vetorRE[15].ler()); 
        this.rr17.setText("" + vetorRE[16].ler()); 
        this.rr18.setText("" + vetorRE[17].ler());
        this.rr19.setText("" + vetorRE[18].ler()); 
        this.rr20.setText("" + vetorRE[19].ler()); 
        this.rr21.setText("" + vetorRE[20].ler()); 
        this.rr22.setText("" + vetorRE[21].ler()); 
        this.rr23.setText("" + vetorRE[22].ler()); 
        this.rr24.setText("" + vetorRE[23].ler()); 
        this.rr25.setText("" + vetorRE[24].ler()); 
        this.rr26.setText("" + vetorRE[25].ler()); 
        this.rr27.setText("" + vetorRE[26].ler());
        this.rr28.setText("" + vetorRE[27].ler()); 
        this.rr29.setText("" + vetorRE[28].ler()); 
        this.rr30.setText("" + vetorRE[29].ler()); 
        this.rr31.setText("" + vetorRE[30].ler()); 
        this.rr32.setText("" + vetorRE[31].ler()); 
        
        this.pc.setText(""+ programcounter);
    
    }
    
    
    
   

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
            java.util.logging.Logger.getLogger(TelaSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSimulador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSimulador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField caixaentrada;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField m1;
    private javax.swing.JTextField m2;
    private javax.swing.JTextField m3;
    private javax.swing.JTextField m4;
    private javax.swing.JTextField m5;
    private javax.swing.JTextField pc;
    private javax.swing.JTextField rr1;
    private javax.swing.JTextField rr10;
    private javax.swing.JTextField rr11;
    private javax.swing.JTextField rr12;
    private javax.swing.JTextField rr13;
    private javax.swing.JTextField rr14;
    private javax.swing.JTextField rr15;
    private javax.swing.JTextField rr16;
    private javax.swing.JTextField rr17;
    private javax.swing.JTextField rr18;
    private javax.swing.JTextField rr19;
    private javax.swing.JTextField rr2;
    private javax.swing.JTextField rr20;
    private javax.swing.JTextField rr21;
    private javax.swing.JTextField rr22;
    private javax.swing.JTextField rr23;
    private javax.swing.JTextField rr24;
    private javax.swing.JTextField rr25;
    private javax.swing.JTextField rr26;
    private javax.swing.JTextField rr27;
    private javax.swing.JTextField rr28;
    private javax.swing.JTextField rr29;
    private javax.swing.JTextField rr3;
    private javax.swing.JTextField rr30;
    private javax.swing.JTextField rr31;
    private javax.swing.JTextField rr32;
    private javax.swing.JTextField rr4;
    private javax.swing.JTextField rr5;
    private javax.swing.JTextField rr6;
    private javax.swing.JTextField rr7;
    private javax.swing.JTextField rr8;
    private javax.swing.JTextField rr9;
    // End of variables declaration//GEN-END:variables
}
