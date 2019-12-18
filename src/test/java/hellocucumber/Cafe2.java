/*
 * Created by JFormDesigner on Mon Dec 16 15:00:00 ICT 2019
 */

package hellocucumber;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class Cafe2 extends JFrame {
    Stepdefs a = new Stepdefs();
    public Cafe2() {
        initComponents();
    }

    private void DineInActionPerformed(ActionEvent e) {
        // TODO add your code here
        a.saya_memilih_jenis_order(1);
        NomorMeja.setEditable(true);

    }

    private void TakeAwayActionPerformed(ActionEvent e) {
        // TODO add your code here
        a.saya_memilih_jenis_order(2);
        a.mencatat_keterangan_order("Take Away");
        NomorMeja.setEditable(false);
    }

    private void buttonokActionPerformed(ActionEvent e) {
        // TODO add your code here
        a.mencatat_keterangan_order(NomorMeja.getText());
    }


    private void data_pelangganActionPerformed(ActionEvent e) {
        // TODO add your code here
        a.saya_mengisi_form_data_pelanggan(field_Nama.getText(),field_No_Hp.getText(),field_Alamat.getText());
    }

    private void saveActionPerformed(ActionEvent e) {
        // TODO add your code here
        a.mencatat_form_data_pelanggan(field_Nama.getText(),field_No_Hp.getText(),field_Alamat.getText());
        JOptionPane.showMessageDialog(null,"Berhasil disimpan");
    }

    private void okmenuActionPerformed(ActionEvent e) {
        // TODO add your code here
        String tempNama;
        int tempHarga, tempJml;

        if((Integer)jmlNasiGoreng.getValue() > 0)
        {
            tempNama = labelNasiGoreng.getText();
            tempJml = (Integer) jmlNasiGoreng.getValue();
            tempHarga = Integer.parseInt(hargaNasiGoreng.getText()) * tempJml;
            a.saya_memilih_sebanyak_dengan_harga(tempNama, tempJml, tempHarga);
        }
        if((Integer) jmlNasiAyamGeprek.getValue() > 0)
        {
            tempNama = labelNasiAyamGeprek.getText();
            tempJml = (Integer) jmlNasiAyamGeprek.getValue();
            tempHarga = Integer.parseInt(hargaNasiAyamGeprek.getText()) * tempJml;
            a.saya_memilih_sebanyak_dengan_harga(tempNama, tempJml, tempHarga);
        }
        if((Integer)jmlNasiAyamBakar.getValue() > 0)
        {
            tempNama = labelNasiAyamBakar.getText();
            tempJml = (Integer)jmlNasiAyamBakar.getValue();
            tempHarga = Integer.parseInt(hargaNasiAyamBakar.getText()) * tempJml;
            a.saya_memilih_sebanyak_dengan_harga(tempNama, tempJml, tempHarga);
        }
        if((Integer)jmlTehManis.getValue() > 0)
        {
            tempNama = labelTehManis.getText();
            tempJml = (Integer)jmlTehManis.getValue();
            tempHarga = Integer.parseInt(hargaTehManis.getText()) * tempJml;
            a.saya_memilih_sebanyak_dengan_harga(tempNama, tempJml, tempHarga);
        }
        a.menampilkan();
        int tempTotalBayar = a.menghitung_total_bayar();
        totalbayar.setText(String.valueOf(tempTotalBayar));
    }

    private void field_NamaActionPerformed(ActionEvent e) {
        // TODO add your code here
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Abdul Hadi Nur Haq
        JenisOrderPanel = new JPanel();
        DineIn = new JRadioButton();
        TakeAway = new JRadioButton();
        NomorMeja = new JTextField();
        NomorMejaLabel = new JLabel();
        buttonok = new JButton();
        CustomerPanel = new JPanel();
        Nama = new JLabel();
        No_Hp = new JLabel();
        Alamat = new JLabel();
        field_Nama = new JTextField();
        field_No_Hp = new JTextField();
        field_Alamat = new JTextField();
        save = new JButton();
        MenuPanel = new JPanel();
        hargaNasiGoreng = new JLabel();
        jmlNasiGoreng = new JSpinner();
        hargaNasiAyamGeprek = new JLabel();
        labelNasiGoreng = new JLabel();
        labelNasiAyamGeprek = new JLabel();
        jmlNasiAyamGeprek = new JSpinner();
        labelNasiAyamBakar = new JLabel();
        hargaNasiAyamBakar = new JLabel();
        jmlNasiAyamBakar = new JSpinner();
        labelTehManis = new JLabel();
        hargaTehManis = new JLabel();
        jmlTehManis = new JSpinner();
        totalbayar = new JTextField();
        okmenu = new JButton();

        //======== this ========
        setTitle("Cafe");
        Container contentPane = getContentPane();

        //======== JenisOrderPanel ========
        {
            JenisOrderPanel.setBorder(new TitledBorder("Jenis Order"));
            JenisOrderPanel.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (
            new javax. swing. border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion"
            , javax. swing. border. TitledBorder. CENTER, javax. swing. border. TitledBorder. BOTTOM
            , new java .awt .Font ("Dia\u006cog" ,java .awt .Font .BOLD ,12 )
            , java. awt. Color. red) ,JenisOrderPanel. getBorder( )) ); JenisOrderPanel. addPropertyChangeListener (
            new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( )
            ; }} );

            //---- DineIn ----
            DineIn.setText("Dine In");
            DineIn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    DineInActionPerformed(e);
                }
            });

            //---- TakeAway ----
            TakeAway.setText("Take Away");
            TakeAway.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    TakeAwayActionPerformed(e);
                }
            });

            //---- NomorMeja ----
            NomorMeja.setEditable(false);

            //---- NomorMejaLabel ----
            NomorMejaLabel.setText("Nomor Meja");

            //---- buttonok ----
            buttonok.setText("OK");
            buttonok.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    buttonokActionPerformed(e);
                }
            });

            GroupLayout JenisOrderPanelLayout = new GroupLayout(JenisOrderPanel);
            JenisOrderPanel.setLayout(JenisOrderPanelLayout);
            JenisOrderPanelLayout.setHorizontalGroup(
                JenisOrderPanelLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, JenisOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JenisOrderPanelLayout.createParallelGroup()
                            .addGroup(JenisOrderPanelLayout.createSequentialGroup()
                                .addComponent(TakeAway)
                                .addGap(0, 216, Short.MAX_VALUE))
                            .addGroup(JenisOrderPanelLayout.createSequentialGroup()
                                .addGroup(JenisOrderPanelLayout.createParallelGroup()
                                    .addGroup(JenisOrderPanelLayout.createSequentialGroup()
                                        .addComponent(DineIn)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(GroupLayout.Alignment.TRAILING, JenisOrderPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(NomorMejaLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(NomorMeja, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(GroupLayout.Alignment.TRAILING, JenisOrderPanelLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonok)
                        .addContainerGap())
            );
            JenisOrderPanelLayout.setVerticalGroup(
                JenisOrderPanelLayout.createParallelGroup()
                    .addGroup(JenisOrderPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(DineIn)
                        .addGap(1, 1, 1)
                        .addGroup(JenisOrderPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(NomorMeja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(NomorMejaLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addComponent(TakeAway)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonok)
                        .addContainerGap())
            );
        }

        //======== CustomerPanel ========
        {
            CustomerPanel.setBorder(new TitledBorder("Data Customer"));

            //---- Nama ----
            Nama.setText("Nama");

            //---- No_Hp ----
            No_Hp.setText("No. Hp");

            //---- Alamat ----
            Alamat.setText("Alamat");

            //---- field_Nama ----
            field_Nama.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    field_NamaActionPerformed(e);
                    data_pelangganActionPerformed(e);
                }
            });

            //---- field_No_Hp ----
            field_No_Hp.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    data_pelangganActionPerformed(e);
                }
            });

            //---- field_Alamat ----
            field_Alamat.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    data_pelangganActionPerformed(e);
                }
            });

            //---- save ----
            save.setText("SAVE");
            save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    saveActionPerformed(e);
                }
            });

            GroupLayout CustomerPanelLayout = new GroupLayout(CustomerPanel);
            CustomerPanel.setLayout(CustomerPanelLayout);
            CustomerPanelLayout.setHorizontalGroup(
                CustomerPanelLayout.createParallelGroup()
                    .addGroup(CustomerPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(CustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(CustomerPanelLayout.createSequentialGroup()
                                .addComponent(Nama, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(field_Nama, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE))
                            .addGroup(CustomerPanelLayout.createSequentialGroup()
                                .addGroup(CustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(No_Hp, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Alamat, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(CustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                    .addComponent(field_Alamat, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                    .addComponent(field_No_Hp))))
                        .addGap(18, 18, 18)
                        .addComponent(save)
                        .addContainerGap(25, Short.MAX_VALUE))
            );
            CustomerPanelLayout.setVerticalGroup(
                CustomerPanelLayout.createParallelGroup()
                    .addGroup(CustomerPanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(CustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(field_Nama, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nama))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(field_No_Hp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(No_Hp)
                            .addComponent(save))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CustomerPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(field_Alamat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(Alamat))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //======== MenuPanel ========
        {
            MenuPanel.setBorder(new TitledBorder("Menu"));

            //---- hargaNasiGoreng ----
            hargaNasiGoreng.setText("10000");

            //---- jmlNasiGoreng ----
            jmlNasiGoreng.setModel(new SpinnerNumberModel(0, 0, null, 1));

            //---- hargaNasiAyamGeprek ----
            hargaNasiAyamGeprek.setText("13000");

            //---- labelNasiGoreng ----
            labelNasiGoreng.setText("Nasi Goreng");

            //---- labelNasiAyamGeprek ----
            labelNasiAyamGeprek.setText("Nasi Ayam Geprek");

            //---- jmlNasiAyamGeprek ----
            jmlNasiAyamGeprek.setModel(new SpinnerNumberModel(0, 0, null, 1));

            //---- labelNasiAyamBakar ----
            labelNasiAyamBakar.setText("Nasi Ayam Bakar");

            //---- hargaNasiAyamBakar ----
            hargaNasiAyamBakar.setText("13000");

            //---- jmlNasiAyamBakar ----
            jmlNasiAyamBakar.setModel(new SpinnerNumberModel(0, 0, null, 1));

            //---- labelTehManis ----
            labelTehManis.setText("Teh Manis");

            //---- hargaTehManis ----
            hargaTehManis.setText("3000");

            //---- jmlTehManis ----
            jmlTehManis.setModel(new SpinnerNumberModel(0, 0, null, 1));

            GroupLayout MenuPanelLayout = new GroupLayout(MenuPanel);
            MenuPanel.setLayout(MenuPanelLayout);
            MenuPanelLayout.setHorizontalGroup(
                MenuPanelLayout.createParallelGroup()
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addComponent(labelTehManis)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                                .addComponent(hargaTehManis))
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addComponent(labelNasiAyamBakar)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addComponent(hargaNasiAyamBakar))
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addComponent(labelNasiGoreng, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(hargaNasiGoreng))
                            .addGroup(MenuPanelLayout.createSequentialGroup()
                                .addComponent(labelNasiAyamGeprek)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(hargaNasiAyamGeprek)))
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addComponent(jmlNasiGoreng, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmlNasiAyamGeprek, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jmlNasiAyamBakar, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(jmlTehManis, GroupLayout.DEFAULT_SIZE, 1, Short.MAX_VALUE))
                        .addContainerGap(36, Short.MAX_VALUE))
            );
            MenuPanelLayout.setVerticalGroup(
                MenuPanelLayout.createParallelGroup()
                    .addGroup(MenuPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNasiGoreng)
                            .addComponent(jmlNasiGoreng, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaNasiGoreng))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNasiAyamGeprek)
                            .addComponent(jmlNasiAyamGeprek, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaNasiAyamGeprek))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNasiAyamBakar)
                            .addComponent(jmlNasiAyamBakar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaNasiAyamBakar))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(MenuPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTehManis)
                            .addComponent(jmlTehManis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaTehManis))
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        //---- totalbayar ----
        totalbayar.setEditable(false);

        //---- okmenu ----
        okmenu.setText("OK");
        okmenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonokActionPerformed(e);
                okmenuActionPerformed(e);
                okmenuActionPerformed(e);
            }
        });

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(CustomerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JenisOrderPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(okmenu)
                            .addComponent(MenuPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addComponent(totalbayar, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(11, Short.MAX_VALUE))
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(contentPaneLayout.createParallelGroup()
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(MenuPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(okmenu)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(totalbayar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(118, Short.MAX_VALUE))
                        .addGroup(contentPaneLayout.createSequentialGroup()
                            .addComponent(CustomerPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(JenisOrderPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(24, 24, 24))))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- JenisOrder ----
        ButtonGroup JenisOrder = new ButtonGroup();
        JenisOrder.add(DineIn);
        JenisOrder.add(TakeAway);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents


    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Abdul Hadi Nur Haq
    private JPanel JenisOrderPanel;
    private JRadioButton DineIn;
    private JRadioButton TakeAway;
    private JTextField NomorMeja;
    private JLabel NomorMejaLabel;
    private JButton buttonok;
    private JPanel CustomerPanel;
    private JLabel Nama;
    private JLabel No_Hp;
    private JLabel Alamat;
    private JTextField field_Nama;
    private JTextField field_No_Hp;
    private JTextField field_Alamat;
    private JButton save;
    private JPanel MenuPanel;
    private JLabel hargaNasiGoreng;
    private JSpinner jmlNasiGoreng;
    private JLabel hargaNasiAyamGeprek;
    private JLabel labelNasiGoreng;
    private JLabel labelNasiAyamGeprek;
    private JSpinner jmlNasiAyamGeprek;
    private JLabel labelNasiAyamBakar;
    private JLabel hargaNasiAyamBakar;
    private JSpinner jmlNasiAyamBakar;
    private JLabel labelTehManis;
    private JLabel hargaTehManis;
    private JSpinner jmlTehManis;
    private JTextField totalbayar;
    private JButton okmenu;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cafe2().setVisible(true);
            }
        });
    }
}
