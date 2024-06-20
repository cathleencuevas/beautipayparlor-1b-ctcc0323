package beautipay;

import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class BeautipayForm extends javax.swing.JFrame {

    public BeautipayForm() {
        initComponents();
        
        jTable2.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable2.getColumnModel().getColumn(1).setPreferredWidth(200);
        
        
    }
    
     public BeautipayForm(String msg) {
        initComponents();
        
        jLabel11.setText(msg);
        
    }

    public void addtable(int id, String Name, int Qty, Double Price) {
        
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        
        DecimalFormat df = new DecimalFormat("00.00");
        double totPrice = Price * Double.valueOf(Qty);
        
        String TotalPrice = df.format(totPrice);
        
        
        for (int row = 0; row < jTable2.getRowCount(); row++) {
            
            if (Name == jTable2.getValueAt(row, 1)) {
                dt.removeRow(jTable2.convertRowIndexToModel(row));
                
            } 
        } 
        
        
        
        Vector v = new Vector();
        
        v.add(id);
        v.add(Name);
        v.add(Qty);
        v.add(TotalPrice);
        
        dt.addRow(v);
         
        
    }
    
    public void cal () {
        //calculate the total table values
        
        int numOfRow = jTable2.getRowCount();
        double tot = 0.0;
        
        for(int i = 0; i < numOfRow; i++) {
            
           double value = Double.valueOf(jTable2.getValueAt(i, 3).toString());
         
           tot += value;
                   
        }
        
        DecimalFormat df = new DecimalFormat("00.00");
        total.setText(df.format(tot));
        
        
        
    }
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton7 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        b2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        b6 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        bal = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        payment = new javax.swing.JTextField();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        paybtn = new javax.swing.JButton();
        print = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        jButton7.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        jButton7.setText("Full Glam Make up");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel10.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        b2.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        b2.setText("Soft Makeup");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 156, 39));

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel1.setText(" ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1225, 33, -1, 46));

        b3.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        b3.setText("Hair Syle");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 148, 39));

        b4.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        b4.setText("Hair Color");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 148, 39));

        b5.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        b5.setText("Hair Care");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        getContentPane().add(b5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 148, 39));

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 153));
        jLabel2.setText("Hair Services");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 46));

        b6.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        b6.setText("Haircut");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        getContentPane().add(b6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 148, 39));

        b8.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        b8.setText("Matte Makeup");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        getContentPane().add(b8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 156, 39));

        b9.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        b9.setText("Full Makeup");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        getContentPane().add(b9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 156, 39));

        b10.setFont(new java.awt.Font("Imprint MT Shadow", 0, 14)); // NOI18N
        b10.setText("Dewy Makeup");
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });
        getContentPane().add(b10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 156, 39));

        jLabel3.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Facial Services");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, 46));

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setForeground(new java.awt.Color(255, 204, 255));

        b.setColumns(20);
        b.setRows(5);
        b.setPreferredSize(new java.awt.Dimension(368, 46));
        jScrollPane2.setViewportView(b);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(812, 13, 390, 370));

        jLabel4.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("Total:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(484, 296, -1, 36));

        jLabel5.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Cash:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 338, -1, 32));

        jLabel6.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 0, 153));
        jLabel6.setText("Change:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, -1));

        bal.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        bal.setForeground(new java.awt.Color(153, 0, 153));
        bal.setText("00");
        getContentPane().add(bal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 149, -1));

        total.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(153, 0, 153));
        total.setText("00");
        getContentPane().add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, 149, 30));

        payment.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        payment.setForeground(new java.awt.Color(153, 0, 153));
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });
        getContentPane().add(payment, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 338, 149, 32));

        l1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        l1.setForeground(new java.awt.Color(153, 0, 153));
        l1.setText("0");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 45, 41));

        l2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        l2.setForeground(new java.awt.Color(153, 0, 153));
        l2.setText("0");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 45, 37));

        l3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        l3.setForeground(new java.awt.Color(153, 0, 153));
        l3.setText("0");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 45, 39));

        l4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        l4.setForeground(new java.awt.Color(153, 0, 153));
        l4.setText("0");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 45, 39));

        l5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        l5.setForeground(new java.awt.Color(153, 0, 153));
        l5.setText("0");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 45, 39));

        l6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        l6.setForeground(new java.awt.Color(153, 0, 153));
        l6.setText("0");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 45, 39));

        l7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        l7.setForeground(new java.awt.Color(153, 0, 153));
        l7.setText("0");
        getContentPane().add(l7, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 45, 39));

        l8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        l8.setForeground(new java.awt.Color(153, 0, 153));
        l8.setText("0");
        getContentPane().add(l8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 45, 39));

        jTable2.setFont(new java.awt.Font("Georgia", 2, 14)); // NOI18N
        jTable2.setForeground(new java.awt.Color(153, 0, 153));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Service", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 12, 341, 227));

        jButton12.setFont(new java.awt.Font("Imprint MT Shadow", 0, 11)); // NOI18N
        jButton12.setForeground(new java.awt.Color(153, 0, 153));
        jButton12.setText("Delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 245, 79, -1));

        paybtn.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        paybtn.setForeground(new java.awt.Color(153, 0, 153));
        paybtn.setText("Pay");
        paybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paybtnActionPerformed(evt);
            }
        });
        getContentPane().add(paybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(707, 338, 81, 32));

        print.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        print.setForeground(new java.awt.Color(153, 0, 153));
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        getContentPane().add(print, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, 393, 98, -1));

        jButton1.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1017, 393, 95, -1));

        jLabel8.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 153));
        jLabel8.setText("_________________________________");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 370, 40));

        jLabel9.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 153));
        jLabel9.setText("Hello,");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 60, 40));

        jLabel11.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("name");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 320, 20));

        jLabel12.setFont(new java.awt.Font("Georgia", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 0, 153));
        jLabel12.setText("Here are the available services of BeautiPay:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 370, 40));

        jButton2.setFont(new java.awt.Font("Imprint MT Shadow", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 90, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/purple bg.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 1230, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(l6.getText());
        ++i;
        l6.setText(String.valueOf(i));
        
        
        addtable(6, "Soft Makeup", i, 1500.00);
        
        cal();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here: hairtyle btn
          int i = Integer.valueOf(l2.getText());
        ++i;
        l2.setText(String.valueOf(i));
        
        
        addtable(2, "Hair Style", i, 500.00);
        
        cal();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here: Hair Color
        int i = Integer.valueOf(l3.getText());
        ++i;
        l3.setText(String.valueOf(i));
        
       
        addtable(3, "Hair Color", i, 1000.00);
        
        cal();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here: Hair Treatment
        int i = Integer.valueOf(l4.getText());
        ++i;
        l4.setText(String.valueOf(i));
        
        
        addtable(4, "Hair Care", i, 1500.00);
        
        cal();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here: haircut btn
        int i = Integer.valueOf(l1.getText());
        ++i;
        l1.setText(String.valueOf(i));
        
        
        addtable(1, "Haircut", i, 200.00);
        
        cal();
        
    }//GEN-LAST:event_b6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(l7.getText());
        ++i;
        l7.setText(String.valueOf(i));
        
        
        addtable(7, "Matte Makeup", i, 1000.00);
        
        cal();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(l5.getText());
        ++i;
        l5.setText(String.valueOf(i));
        
        
        addtable(5, "Full Makeup", i, 2000.00);
        
        cal();
    }//GEN-LAST:event_b9ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
        // TODO add your handling code here:
        int i = Integer.valueOf(l8.getText());
        ++i;
        l8.setText(String.valueOf(i));
        
        
        addtable(8, "Dewy Makeup", i, 2500.00);
        
        cal();
    }//GEN-LAST:event_b10ActionPerformed

    private void paybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paybtnActionPerformed
        // TODO add your handling code here: Payment
        
        double tot = Double.valueOf(total.getText());
        double paid = Double.valueOf(payment.getText());
        double balance = paid - tot;
        
        DecimalFormat df = new DecimalFormat("00.00");
        
        bal.setText(String.valueOf(df.format(balance)));
        
       
        
    }//GEN-LAST:event_paybtnActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        
        String r = dt.getValueAt(jTable2.getSelectedRow(), 0).toString();
         
        int rw = jTable2.getSelectedRow();
        dt.removeRow(rw);
        
        if(rw >= 0)
        {
             cal();
        }
       
    
        System.out.println(r);
        switch(r) {
            case "1" : 
                l1.setText("0");
                break;
            case "2" : 
                l2.setText("0");
                break;
            case "3" : 
                l3.setText("0");
                break;
            case "4" : 
                l4.setText("0");
                break;
            case "5" : 
                l5.setText("0");
                break;
            case "6" : 
                l6.setText("0");
                break;
            case "7" : 
                l7.setText("0");
                break;
            case "8" : 
                l8.setText("0");
                break;
            default:
                System.out.println("over");
                
            
        
    }
                
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here: Print
        try {
            b.setText("                                     BeautiPay Parlor \n");
            b.setText(b.getText() + "                                            Receipt\n");
            b.setText(b.getText() + "----------------------------------------------------------------------------------\n");
            b.setText(b.getText() + "  Item \t\tQty \tPrice" + "\n");
            b.setText(b.getText() + "----------------------------------------------------------------------------------\n");
            
            DefaultTableModel df = (DefaultTableModel) jTable2.getModel();
            
            for (int i = 0; i < jTable2.getRowCount(); i++) {
            
            String Name = df.getValueAt(i, 1).toString();
            String Qty = df.getValueAt(i, 2).toString();
            String Price = df.getValueAt(i, 3).toString();
            
            b.setText(b.getText() +  "   " +  Name + "\t\t" + Qty + "\t" + Price + "\n");
                   
            
           
            }
            b.setText(b.getText() + "--------------------------------------------------------------------------------\n");
            b.setText(b.getText() + "Sub Total : " + total.getText() + "\n");
            b.setText(b.getText() + "Cash : " + payment.getText() + "\n");
            b.setText(b.getText() + "Change : " + bal.getText() + "\n");
            b.setText(b.getText() + "---------------------------------------------------------------------------------\n");
             b.setText(b.getText() + "Thank you for supporting BeautiPay!\n");
            b.setText(b.getText() + "---------------------------------------------------------------------------------\n");
            
        } catch (Exception e) {
            
        }

    }//GEN-LAST:event_printActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        new BeautiPayEndForm().setVisible(true);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new BeautipayStartForm().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(BeautipayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BeautipayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BeautipayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BeautipayForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BeautipayForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea b;
    private javax.swing.JButton b10;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JLabel bal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JButton paybtn;
    private javax.swing.JTextField payment;
    private javax.swing.JButton print;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
