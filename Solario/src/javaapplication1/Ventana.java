package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        setLocationRelativeTo(null);
        buttonGroup1.add(mercurio);
        buttonGroup1.add(venus);
        buttonGroup1.add(tierra);
        buttonGroup1.add(marte);
        buttonGroup1.add(jupiter);
        buttonGroup1.add(saturno);
        buttonGroup1.add(urano);
        buttonGroup1.add(neptuno);
        sat1.setVisible(false);
        sat2.setVisible(false);
        sat3.setVisible(false);
        sat4.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tituloo = new javax.swing.JLabel();
        nombre2 = new javax.swing.JLabel();
        img2 = new javax.swing.JLabel();
        marte = new javax.swing.JButton();
        mercurio = new javax.swing.JButton();
        tierra = new javax.swing.JButton();
        venus = new javax.swing.JButton();
        jupiter = new javax.swing.JButton();
        saturno = new javax.swing.JButton();
        urano = new javax.swing.JButton();
        neptuno = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlabelradio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        radio = new javax.swing.JLabel();
        distancia = new javax.swing.JLabel();
        periodo = new javax.swing.JLabel();
        temperatura = new javax.swing.JLabel();
        superficie = new javax.swing.JLabel();
        satelite = new javax.swing.JLabel();
        sol = new javax.swing.JButton();
        jlabeldis = new javax.swing.JLabel();
        jComp = new javax.swing.JLabel();
        tipos = new javax.swing.JLabel();
        radios = new javax.swing.JLabel();
        temperaturas = new javax.swing.JLabel();
        distancias = new javax.swing.JLabel();
        composicion = new javax.swing.JLabel();
        sat1 = new javax.swing.JButton();
        sat2 = new javax.swing.JButton();
        sat3 = new javax.swing.JButton();
        sat4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(60, 85, 186));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setForeground(new java.awt.Color(0, 6, 22));
        setResizable(false);

        tituloo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tituloo.setText("PRÁCTICA INTERMODULAR - SISTEMA SOLAR");

        nombre2.setText("Estrella Sol:");

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/sol.png"))); // NOI18N

        marte.setBackground(new java.awt.Color(255, 0, 0));
        marte.setForeground(new java.awt.Color(255, 255, 255));
        marte.setText("Marte");
        marte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marteActionPerformed(evt);
            }
        });

        mercurio.setBackground(new java.awt.Color(77, 39, 0));
        mercurio.setForeground(new java.awt.Color(255, 255, 255));
        mercurio.setText("Mercurio");
        mercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mercurioActionPerformed(evt);
            }
        });

        tierra.setBackground(new java.awt.Color(102, 153, 255));
        tierra.setForeground(new java.awt.Color(255, 102, 0));
        tierra.setText("Tierra");
        tierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tierraActionPerformed(evt);
            }
        });

        venus.setBackground(new java.awt.Color(56, 57, 58));
        venus.setForeground(new java.awt.Color(255, 255, 255));
        venus.setText("Venus");
        venus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venusActionPerformed(evt);
            }
        });

        jupiter.setBackground(new java.awt.Color(255, 144, 62));
        jupiter.setForeground(new java.awt.Color(255, 255, 255));
        jupiter.setText("Jupiter");
        jupiter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jupiterActionPerformed(evt);
            }
        });

        saturno.setBackground(new java.awt.Color(255, 204, 153));
        saturno.setText("Saturno");
        saturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saturnoActionPerformed(evt);
            }
        });

        urano.setBackground(new java.awt.Color(0, 153, 255));
        urano.setForeground(new java.awt.Color(255, 255, 255));
        urano.setText("Urano");
        urano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uranoActionPerformed(evt);
            }
        });

        neptuno.setBackground(new java.awt.Color(0, 0, 204));
        neptuno.setForeground(new java.awt.Color(255, 255, 255));
        neptuno.setText("Neptuno");
        neptuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neptunoActionPerformed(evt);
            }
        });

        jLabel2.setText("Tipo: ");

        jLabel3.setText("Radio:");

        jLabel4.setText("Temperatura: ");

        jlabelradio.setText("Radio:");

        jLabel5.setText("Distancia del sol:");

        jLabel6.setText("Periodo Orbital:");

        jLabel7.setText("Temperatura Media: ");

        jLabel8.setText("Tipo superficie:");

        jLabel9.setText("Numero de satelites:");

        sol.setText("Ver datos Sol");
        sol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solActionPerformed(evt);
            }
        });

        jlabeldis.setText("Distancia de la tierra:");

        jComp.setText("Composicion:");

        sat1.setText("jButton1");
        sat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sat1ActionPerformed(evt);
            }
        });

        sat2.setText("jButton1");
        sat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sat2ActionPerformed(evt);
            }
        });

        sat3.setText("jButton2");
        sat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sat3ActionPerformed(evt);
            }
        });

        sat4.setText("jButton3");
        sat4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sat4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tituloo)
                .addGap(167, 167, 167))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jComp, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlabeldis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radios)
                                    .addComponent(tipos)
                                    .addComponent(temperaturas)
                                    .addComponent(distancias)
                                    .addComponent(composicion))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sat1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sat2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mercurio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tierra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(marte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(venus, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(neptuno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jupiter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(saturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(urano, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sat3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sat4)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlabelradio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio)
                            .addComponent(distancia)
                            .addComponent(periodo)
                            .addComponent(temperatura)
                            .addComponent(superficie)
                            .addComponent(satelite))))
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sol)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(tituloo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(nombre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nombre2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jupiter)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(saturno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(urano)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(neptuno))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(mercurio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(venus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tierra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(marte))))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addComponent(sol)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlabelradio)
                    .addComponent(radio)
                    .addComponent(tipos)
                    .addComponent(sat1)
                    .addComponent(sat2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(distancia)
                    .addComponent(radios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(periodo)
                    .addComponent(temperaturas)
                    .addComponent(sat3)
                    .addComponent(sat4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(temperatura)
                    .addComponent(jlabeldis)
                    .addComponent(distancias))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(superficie)
                    .addComponent(jComp)
                    .addComponent(composicion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(satelite))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mercurioActionPerformed
        nombre.setText("Mercurio");
        String nombr = nombre.getText();
        icono(nombr);

        datos(nombr);
        sat1.setVisible(false);
        sat2.setVisible(false);
        sat3.setVisible(false);
        sat4.setVisible(false);
    }//GEN-LAST:event_mercurioActionPerformed

    private void venusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venusActionPerformed
        nombre.setText("Venus");
        String nombr = nombre.getText();
        icono(nombr);
        datos(nombr);
        sat1.setVisible(false);
        sat2.setVisible(false);
        sat3.setVisible(false);
        sat4.setVisible(false);
    }//GEN-LAST:event_venusActionPerformed

    private void tierraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tierraActionPerformed
        nombre.setText("Tierra");
        String nombr = nombre.getText();
        icono(nombr);
        datos(nombr);
        sat1.setVisible(true);
        sat1.setText("Luna");
        sat2.setVisible(false);
        sat3.setVisible(false);
        sat4.setVisible(false);

    }//GEN-LAST:event_tierraActionPerformed

    private void marteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marteActionPerformed
        nombre.setText("Marte");
        String nombr = nombre.getText();
        icono(nombr);
        datos(nombr);
        sat1.setVisible(true);
        sat1.setText("Fobos");
        sat2.setVisible(true);
        sat2.setText("Deimos");
        sat3.setVisible(false);
        sat4.setVisible(false);
    }//GEN-LAST:event_marteActionPerformed

    private void jupiterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jupiterActionPerformed
        nombre.setText("Jupiter");
        String nombr = nombre.getText();
        icono(nombr);
        datos(nombr);
        sat1.setVisible(true);
        sat1.setText("IO");
        sat2.setVisible(true);
        sat2.setText("Europa");
        sat3.setVisible(true);
        sat3.setText("Ganimedes");
        sat4.setVisible(true);
        sat4.setText("Calisto");
    }//GEN-LAST:event_jupiterActionPerformed

    private void saturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saturnoActionPerformed
        nombre.setText("Saturno");
        String nombr = nombre.getText();
        icono(nombr);
        datos(nombr);
        sat1.setVisible(true);
        sat1.setText("Titan");
        sat2.setVisible(true);
        sat2.setText("Encelado");
        sat3.setVisible(false);
        sat4.setVisible(false);
    }//GEN-LAST:event_saturnoActionPerformed

    private void uranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uranoActionPerformed
        nombre.setText("Urano");
        String nombr = nombre.getText();
        icono(nombr);
        datos(nombr);
        sat1.setVisible(true);
        sat1.setText("Titania");
        sat2.setVisible(true);
        sat2.setText("Oberon");
        sat3.setVisible(false);
        sat4.setVisible(false);
    }//GEN-LAST:event_uranoActionPerformed

    private void neptunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neptunoActionPerformed
        nombre.setText("Neptuno");
        String nombr = nombre.getText();
        icono(nombr);
        datos(nombr);
        sat1.setVisible(false);
        sat2.setVisible(false);
        sat3.setVisible(false);
        sat4.setVisible(false);
    }//GEN-LAST:event_neptunoActionPerformed

    private void solActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solActionPerformed
        // TODO add your handling code here:
        Connection connection = null;

        try {
            String BD = "practica_intermodular";
            String USUARIO = "root";
            String PASS = "";
            String HOST = "localhost";

            connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/"
                    + BD + "?user=" + USUARIO + "&password=" + PASS);

            String consulta = "SELECT * FROM estrella";
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(consulta);
            while (rset.next()) {
                String tip = rset.getString("tipo");
                float rad = rset.getFloat("radio");
                float temperat = rset.getFloat("temperatura_superficie");
                float distanc = rset.getFloat("distancia_tierra");
                String composici = rset.getString("composicion");

                tipos.setText(tip);
                radios.setText(rad + " ");
                temperaturas.setText(temperat + " ");
                distancias.setText(distanc + " ");
                composicion.setText(composici);
                jComp.setText("Composicion");

            }

        } catch (SQLException ex) {
        }
    }//GEN-LAST:event_solActionPerformed

    private void sat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat1ActionPerformed
        String nombr = sat1.getText();
        datosSat(nombr);
    }//GEN-LAST:event_sat1ActionPerformed

    private void sat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat2ActionPerformed
        String nombr = sat2.getText();
        datosSat(nombr);
    }//GEN-LAST:event_sat2ActionPerformed

    private void sat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat3ActionPerformed
        String nombr = sat3.getText();
        datosSat(nombr);
    }//GEN-LAST:event_sat3ActionPerformed

    private void sat4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sat4ActionPerformed
        String nombr = sat4.getText();
        datosSat(nombr);
    }//GEN-LAST:event_sat4ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new Ventana().setVisible(true);
            }
        });
    }

    public void datos(String nombr) {
        Connection connection = null;

        try {
            String BD = "practica_intermodular";
            String USUARIO = "root";
            String PASS = "";
            String HOST = "localhost";

            connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/"
                    + BD + "?user=" + USUARIO + "&password=" + PASS);

            String consulta = "SELECT * FROM planeta WHERE nombre = '" + nombr + "'";
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(consulta);
            while (rset.next()) {
                float rad = rset.getFloat("radio");
                float distanc = rset.getFloat("distancia_sol");
                float peri = rset.getFloat("periodo_orbital");
                float temperat = rset.getFloat("temperatura_media");
                String tip = rset.getString("tipo");
                int satelit = rset.getInt("num_satelites");

                radio.setText(rad + " ");
                distancia.setText(distanc + " ");
                periodo.setText(peri + " ");
                temperatura.setText(temperat + " ");
                superficie.setText(tip);
                satelite.setText(satelit + " ");

            }

        } catch (SQLException ex) {
        }
    }

    public void datosSat(String nombr) {
        Connection connection = null;

        try {
            String BD = "practica_intermodular";
            String USUARIO = "root";
            String PASS = "";
            String HOST = "localhost";

            connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/"
                    + BD + "?user=" + USUARIO + "&password=" + PASS);

            String consulta = "SELECT * FROM satelite WHERE nombre = '" + nombr + "'" ;
            Statement stmt = connection.createStatement();
            ResultSet rset = stmt.executeQuery(consulta);
            while (rset.next()) {
                String tip = rset.getString("tipo");
                float rad = rset.getFloat("radio");
                float temperat = rset.getFloat("temperatura_media");
                float distanc = rset.getFloat("distancia_planeta");
                float peri = rset.getFloat("periodo_orbital");

                tipos.setText(tip);
                radios.setText(rad + " ");
                temperaturas.setText(temperat + " ");
                distancias.setText(distanc + " ");
                composicion.setText(peri+ " ");
                jComp.setText("Periodo Orbital");

            }

        } catch (SQLException ex) {
        }
    }

    public void icono(String planet) {
        planet = planet.toLowerCase();
        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/" + planet + ".png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel composicion;
    private javax.swing.JLabel distancia;
    private javax.swing.JLabel distancias;
    private javax.swing.JLabel img;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel jComp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jlabeldis;
    private javax.swing.JLabel jlabelradio;
    private javax.swing.JButton jupiter;
    private javax.swing.JButton marte;
    private javax.swing.JButton mercurio;
    private javax.swing.JButton neptuno;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombre2;
    private javax.swing.JLabel periodo;
    private javax.swing.JLabel radio;
    private javax.swing.JLabel radios;
    private javax.swing.JButton sat1;
    private javax.swing.JButton sat2;
    private javax.swing.JButton sat3;
    private javax.swing.JButton sat4;
    private javax.swing.JLabel satelite;
    private javax.swing.JButton saturno;
    private javax.swing.JButton sol;
    private javax.swing.JLabel superficie;
    private javax.swing.JLabel temperatura;
    private javax.swing.JLabel temperaturas;
    private javax.swing.JButton tierra;
    private javax.swing.JLabel tipos;
    private javax.swing.JLabel tituloo;
    private javax.swing.JButton urano;
    private javax.swing.JButton venus;
    // End of variables declaration//GEN-END:variables
}
