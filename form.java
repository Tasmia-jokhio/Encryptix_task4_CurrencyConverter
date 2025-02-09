package com.mycompany.currency_con;
import com.google.gson.JsonObject;
import java.io.IOException;
import javax.swing.JOptionPane;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**S
 *
 * @author jokhi
 */
public class form extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    public form() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        amounttxt = new javax.swing.JTextField();
        tocb = new javax.swing.JComboBox<>();
        fromcb = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(135, 163, 163));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(153, 189, 189));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 87, 87)));
        jPanel2.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 61, 61));
        jLabel1.setFont(new java.awt.Font("Calisto MT", 3, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 87, 87));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("WELCOME TO CURRENCY CONVERTER ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 20, 510, 100);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(1, 87, 87));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Amount");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 130, 90, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(1, 87, 87));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("From");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(120, 200, 80, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(1, 87, 87));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("To");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, 270, 80, 25);

        amounttxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amounttxtActionPerformed(evt);
            }
        });
        jPanel2.add(amounttxt);
        amounttxt.setBounds(230, 130, 170, 40);

        tocb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"select target currency", "USD", "EUR", "GBP", "INR" }));
        jPanel2.add(tocb);
        tocb.setBounds(230, 260, 170, 40);

        fromcb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select base currency", "USD", "EUR", "GBP", "INR"}));
        jPanel2.add(fromcb);
        fromcb.setBounds(230, 190, 170, 40);

        jButton1.setBackground(new java.awt.Color(193, 215, 215));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(1, 87, 87));
        jButton1.setText("Convert");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(250, 330, 120, 34);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 520, 440);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void amounttxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amounttxtActionPerformed
        
               
    }//GEN-LAST:event_amounttxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         String amtstr=amounttxt.getText();
         String from=(String) fromcb.getSelectedItem();
         String to=(String) tocb.getSelectedItem();
        if(amtstr.isEmpty()){ 
            JOptionPane.showMessageDialog(this, "please enter your amount to convert", "Validation Error", JOptionPane.ERROR_MESSAGE);
         }
        
        else if(from.equals("select base currency")){
            JOptionPane.showMessageDialog(this, "please select a base currency", "Validation Error", JOptionPane.ERROR_MESSAGE);
        
        }
        
         else if(to.equals("select target currency")){
            JOptionPane.showMessageDialog(this, "please select a target currency", "Validation Error", JOptionPane.ERROR_MESSAGE);
        
        }
            else {
             double amt = Double.parseDouble(amtstr);
             try {
        
        double convertedamount = Currencyconvert(amt, from, to);

                 // this switch case will display conversion result to user with targert currency symbol
                 switch (to) {
                     case "USD":
                         JOptionPane.showMessageDialog(this, " your amount in " + to +" $ "+" is "+ convertedamount , "Conversion Result", JOptionPane.INFORMATION_MESSAGE);
                         break;
                     case "EUR":
                         JOptionPane.showMessageDialog(this, " your amount in " + to +" € " +" is "+ convertedamount , "Conversion Result", JOptionPane.INFORMATION_MESSAGE);
                         break;
                     case "GBP":
                         JOptionPane.showMessageDialog(this, " your amount in " + to +" £ " +" is "+ convertedamount , "Conversion Result", JOptionPane.INFORMATION_MESSAGE);
                         break;
                     default:
                         JOptionPane.showMessageDialog(this, " your amount in " + to +" ₹ " +" is "+ convertedamount , "Conversion Result", JOptionPane.INFORMATION_MESSAGE);
                         break;
                 }    
        
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Failed to convert currency please try again : " + e.getMessage(), "Conversion Error", JOptionPane.ERROR_MESSAGE);
    }
             
                     
                }
       
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private double Currencyconvert(double amount, String from, String to) throws IOException {
    //this url will fetch latest exchange rates for the from currency 
    String apiurl = "https://v6.exchangerate-api.com/v6/3bab90d7428b36bbf15dc76f/latest/" + from; 

    OkHttpClient c = new OkHttpClient();
    Request r= new Request.Builder()
            .url(apiurl)
            .build();

    try (Response resp = c.newCall(r).execute()) {
        if (resp.isSuccessful() && resp.body() != null) {
            String jsonresp = resp.body().string();
            JsonObject Object = JsonParser.parseString(jsonresp).getAsJsonObject();
            JsonObject convRates = Object.getAsJsonObject("conversion_rates");
            double rate = convRates.get(to).getAsDouble();
            return amount * rate;
        } else {
            throw new IOException(" Your API request is failed " + resp.message());
        }
    }
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
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amounttxt;
    private javax.swing.JComboBox<String> fromcb;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> tocb;
    // End of variables declaration//GEN-END:variables
}
