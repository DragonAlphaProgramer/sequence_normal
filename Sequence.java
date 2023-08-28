package Sequence;

import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author PatrykK
 */
public class Sequence extends javax.swing.JFrame {

    boolean kres = true;
    int akcja = 0;
    ArrayList<Karta> talia = new ArrayList<>();
    int[][] tablica = new int[10][10];
    int biezacy_gracz = 0;
    int reka, wygrana, druzyny;
    Karta zagrana_karta;
    ArrayList<Gracz> gracze = new ArrayList<>();

    /**
     * Creates new form Sequence
     */
    public Sequence() {
        initComponents();
        Reka1.setEnabled(false);
        Reka2.setEnabled(false);
        Reka3.setEnabled(false);
        Reka4.setEnabled(false);
        Reka5.setEnabled(false);
        Reka6.setEnabled(false);
        Reka7.setEnabled(false);
        joker1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("JOKER.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        joker2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("JOKER.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        joker3.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("JOKER.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        joker4.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("JOKER.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P21.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P22.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P31.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P32.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P41.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P42.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P51.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P52.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P61.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P62.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P71.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P72.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P81.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P82.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P91.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        P92.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9P.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        PT1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TP.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        PT2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TP.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        PQ1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QP.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        PQ2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QP.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        PK1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KP.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        PK2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KP.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        PA1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AP.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        PA2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AP.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C21.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C22.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C31.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C32.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C41.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C42.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C51.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C52.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C61.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C62.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C71.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C72.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C81.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C82.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C91.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        C92.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9C.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        CT1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TC.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        CT2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TC.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        CQ1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QC.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        CQ2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QC.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        CK1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KC.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        CK2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KC.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        CA1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AC.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        CA2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AC.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T21.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T22.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T31.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T32.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T41.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T42.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T51.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T52.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T61.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T62.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T71.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T72.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T81.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T82.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T91.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        T92.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9T.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        TT1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TT.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        TT2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TT.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        TQ1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QT.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        TQ2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QT.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        TK1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KT.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        TK2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KT.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        TA1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AT.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        TA2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AT.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K21.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K22.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("2K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K31.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K32.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("3K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K41.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K42.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("4K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K51.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K52.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("5K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K61.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K62.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("6K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K71.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K72.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("7K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K81.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K82.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("8K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K91.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        K92.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("9K.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        KT1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TK.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        KT2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("TK.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        KQ1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QK.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        KQ2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("QK.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        KK1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KK.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        KK2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("KK.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        KA1.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AK.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        KA2.setIcon(new ImageIcon((new ImageIcon(this.getClass().getResource("AK.png")).getImage().getScaledInstance(52, 72, java.awt.Image.SCALE_SMOOTH))));
        inicjuj_talie();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Start = new javax.swing.JButton();
        joker1 = new javax.swing.JButton();
        Reka1 = new javax.swing.JButton();
        Reka2 = new javax.swing.JButton();
        Reka3 = new javax.swing.JButton();
        Reka4 = new javax.swing.JButton();
        Reka5 = new javax.swing.JButton();
        Reka6 = new javax.swing.JButton();
        Reka7 = new javax.swing.JButton();
        P21 = new javax.swing.JButton();
        P31 = new javax.swing.JButton();
        P41 = new javax.swing.JButton();
        P51 = new javax.swing.JButton();
        P71 = new javax.swing.JButton();
        P81 = new javax.swing.JButton();
        P61 = new javax.swing.JButton();
        P91 = new javax.swing.JButton();
        joker2 = new javax.swing.JButton();
        T51 = new javax.swing.JButton();
        T41 = new javax.swing.JButton();
        T61 = new javax.swing.JButton();
        T31 = new javax.swing.JButton();
        T21 = new javax.swing.JButton();
        KK1 = new javax.swing.JButton();
        KQ1 = new javax.swing.JButton();
        KA1 = new javax.swing.JButton();
        KT1 = new javax.swing.JButton();
        PT1 = new javax.swing.JButton();
        PA2 = new javax.swing.JButton();
        C22 = new javax.swing.JButton();
        T71 = new javax.swing.JButton();
        C32 = new javax.swing.JButton();
        C42 = new javax.swing.JButton();
        C62 = new javax.swing.JButton();
        C72 = new javax.swing.JButton();
        C52 = new javax.swing.JButton();
        K91 = new javax.swing.JButton();
        PQ1 = new javax.swing.JButton();
        PK2 = new javax.swing.JButton();
        T62 = new javax.swing.JButton();
        T81 = new javax.swing.JButton();
        T52 = new javax.swing.JButton();
        T42 = new javax.swing.JButton();
        T22 = new javax.swing.JButton();
        C82 = new javax.swing.JButton();
        T32 = new javax.swing.JButton();
        K81 = new javax.swing.JButton();
        PK1 = new javax.swing.JButton();
        PQ2 = new javax.swing.JButton();
        T72 = new javax.swing.JButton();
        T91 = new javax.swing.JButton();
        K62 = new javax.swing.JButton();
        K52 = new javax.swing.JButton();
        KA2 = new javax.swing.JButton();
        C92 = new javax.swing.JButton();
        K42 = new javax.swing.JButton();
        K71 = new javax.swing.JButton();
        PA1 = new javax.swing.JButton();
        PT2 = new javax.swing.JButton();
        T82 = new javax.swing.JButton();
        TT1 = new javax.swing.JButton();
        K72 = new javax.swing.JButton();
        K22 = new javax.swing.JButton();
        KK2 = new javax.swing.JButton();
        CT2 = new javax.swing.JButton();
        K32 = new javax.swing.JButton();
        K61 = new javax.swing.JButton();
        C21 = new javax.swing.JButton();
        TQ1 = new javax.swing.JButton();
        T92 = new javax.swing.JButton();
        CQ2 = new javax.swing.JButton();
        P92 = new javax.swing.JButton();
        KQ2 = new javax.swing.JButton();
        K92 = new javax.swing.JButton();
        K51 = new javax.swing.JButton();
        C31 = new javax.swing.JButton();
        K82 = new javax.swing.JButton();
        KT2 = new javax.swing.JButton();
        P82 = new javax.swing.JButton();
        TT2 = new javax.swing.JButton();
        TQ2 = new javax.swing.JButton();
        CA2 = new javax.swing.JButton();
        TK2 = new javax.swing.JButton();
        CK2 = new javax.swing.JButton();
        C41 = new javax.swing.JButton();
        TA2 = new javax.swing.JButton();
        TK1 = new javax.swing.JButton();
        K41 = new javax.swing.JButton();
        K31 = new javax.swing.JButton();
        P22 = new javax.swing.JButton();
        P72 = new javax.swing.JButton();
        P52 = new javax.swing.JButton();
        C51 = new javax.swing.JButton();
        K21 = new javax.swing.JButton();
        P32 = new javax.swing.JButton();
        TA1 = new javax.swing.JButton();
        P62 = new javax.swing.JButton();
        P42 = new javax.swing.JButton();
        C81 = new javax.swing.JButton();
        C91 = new javax.swing.JButton();
        CT1 = new javax.swing.JButton();
        C71 = new javax.swing.JButton();
        CA1 = new javax.swing.JButton();
        CK1 = new javax.swing.JButton();
        joker3 = new javax.swing.JButton();
        C61 = new javax.swing.JButton();
        CQ1 = new javax.swing.JButton();
        joker4 = new javax.swing.JButton();
        aktywna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Start.setText("Zacznij grę");
        Start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartActionPerformed(evt);
            }
        });

        joker1.setMaximumSize(new java.awt.Dimension(90, 65));
        joker1.setMinimumSize(new java.awt.Dimension(90, 65));
        joker1.setPreferredSize(new java.awt.Dimension(90, 65));
        joker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joker1ActionPerformed(evt);
            }
        });

        Reka1.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka1.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka1.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka1ActionPerformed(evt);
            }
        });

        Reka2.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka2.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka2.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka2ActionPerformed(evt);
            }
        });

        Reka3.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka3.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka3.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka3ActionPerformed(evt);
            }
        });

        Reka4.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka4.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka4.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka4ActionPerformed(evt);
            }
        });

        Reka5.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka5.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka5.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka5ActionPerformed(evt);
            }
        });

        Reka6.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka6.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka6.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka6ActionPerformed(evt);
            }
        });

        Reka7.setMaximumSize(new java.awt.Dimension(90, 65));
        Reka7.setMinimumSize(new java.awt.Dimension(90, 65));
        Reka7.setPreferredSize(new java.awt.Dimension(90, 65));
        Reka7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reka7ActionPerformed(evt);
            }
        });

        P21.setMaximumSize(new java.awt.Dimension(90, 65));
        P21.setMinimumSize(new java.awt.Dimension(90, 65));
        P21.setPreferredSize(new java.awt.Dimension(90, 65));
        P21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P21ActionPerformed(evt);
            }
        });

        P31.setMaximumSize(new java.awt.Dimension(90, 65));
        P31.setMinimumSize(new java.awt.Dimension(90, 65));
        P31.setPreferredSize(new java.awt.Dimension(90, 65));
        P31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P31ActionPerformed(evt);
            }
        });

        P41.setMaximumSize(new java.awt.Dimension(90, 65));
        P41.setMinimumSize(new java.awt.Dimension(90, 65));
        P41.setPreferredSize(new java.awt.Dimension(90, 65));
        P41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P41ActionPerformed(evt);
            }
        });

        P51.setMaximumSize(new java.awt.Dimension(90, 65));
        P51.setMinimumSize(new java.awt.Dimension(90, 65));
        P51.setPreferredSize(new java.awt.Dimension(90, 65));
        P51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P51ActionPerformed(evt);
            }
        });

        P71.setMaximumSize(new java.awt.Dimension(90, 65));
        P71.setMinimumSize(new java.awt.Dimension(90, 65));
        P71.setPreferredSize(new java.awt.Dimension(90, 65));
        P71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P71ActionPerformed(evt);
            }
        });

        P81.setMaximumSize(new java.awt.Dimension(90, 65));
        P81.setMinimumSize(new java.awt.Dimension(90, 65));
        P81.setPreferredSize(new java.awt.Dimension(90, 65));
        P81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P81ActionPerformed(evt);
            }
        });

        P61.setMaximumSize(new java.awt.Dimension(90, 65));
        P61.setMinimumSize(new java.awt.Dimension(90, 65));
        P61.setPreferredSize(new java.awt.Dimension(90, 65));
        P61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P61ActionPerformed(evt);
            }
        });

        P91.setMaximumSize(new java.awt.Dimension(90, 65));
        P91.setMinimumSize(new java.awt.Dimension(90, 65));
        P91.setPreferredSize(new java.awt.Dimension(90, 65));
        P91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P91ActionPerformed(evt);
            }
        });

        joker2.setMaximumSize(new java.awt.Dimension(90, 65));
        joker2.setMinimumSize(new java.awt.Dimension(90, 65));
        joker2.setPreferredSize(new java.awt.Dimension(90, 65));
        joker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joker2ActionPerformed(evt);
            }
        });

        T51.setMaximumSize(new java.awt.Dimension(90, 65));
        T51.setMinimumSize(new java.awt.Dimension(90, 65));
        T51.setPreferredSize(new java.awt.Dimension(90, 65));
        T51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T51ActionPerformed(evt);
            }
        });

        T41.setMaximumSize(new java.awt.Dimension(90, 65));
        T41.setMinimumSize(new java.awt.Dimension(90, 65));
        T41.setPreferredSize(new java.awt.Dimension(90, 65));
        T41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T41ActionPerformed(evt);
            }
        });

        T61.setMaximumSize(new java.awt.Dimension(90, 65));
        T61.setMinimumSize(new java.awt.Dimension(90, 65));
        T61.setPreferredSize(new java.awt.Dimension(90, 65));
        T61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T61ActionPerformed(evt);
            }
        });

        T31.setMaximumSize(new java.awt.Dimension(90, 65));
        T31.setMinimumSize(new java.awt.Dimension(90, 65));
        T31.setPreferredSize(new java.awt.Dimension(90, 65));
        T31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T31ActionPerformed(evt);
            }
        });

        T21.setMaximumSize(new java.awt.Dimension(90, 65));
        T21.setMinimumSize(new java.awt.Dimension(90, 65));
        T21.setPreferredSize(new java.awt.Dimension(90, 65));
        T21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T21ActionPerformed(evt);
            }
        });

        KK1.setMaximumSize(new java.awt.Dimension(90, 65));
        KK1.setMinimumSize(new java.awt.Dimension(90, 65));
        KK1.setPreferredSize(new java.awt.Dimension(90, 65));
        KK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KK1ActionPerformed(evt);
            }
        });

        KQ1.setMaximumSize(new java.awt.Dimension(90, 65));
        KQ1.setMinimumSize(new java.awt.Dimension(90, 65));
        KQ1.setPreferredSize(new java.awt.Dimension(90, 65));
        KQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KQ1ActionPerformed(evt);
            }
        });

        KA1.setMaximumSize(new java.awt.Dimension(90, 65));
        KA1.setMinimumSize(new java.awt.Dimension(90, 65));
        KA1.setPreferredSize(new java.awt.Dimension(90, 65));
        KA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KA1ActionPerformed(evt);
            }
        });

        KT1.setMaximumSize(new java.awt.Dimension(90, 65));
        KT1.setMinimumSize(new java.awt.Dimension(90, 65));
        KT1.setPreferredSize(new java.awt.Dimension(90, 65));
        KT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KT1ActionPerformed(evt);
            }
        });

        PT1.setMaximumSize(new java.awt.Dimension(90, 65));
        PT1.setMinimumSize(new java.awt.Dimension(90, 65));
        PT1.setPreferredSize(new java.awt.Dimension(90, 65));
        PT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PT1ActionPerformed(evt);
            }
        });

        PA2.setMaximumSize(new java.awt.Dimension(90, 65));
        PA2.setMinimumSize(new java.awt.Dimension(90, 65));
        PA2.setPreferredSize(new java.awt.Dimension(90, 65));
        PA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PA2ActionPerformed(evt);
            }
        });

        C22.setMaximumSize(new java.awt.Dimension(90, 65));
        C22.setMinimumSize(new java.awt.Dimension(90, 65));
        C22.setPreferredSize(new java.awt.Dimension(90, 65));
        C22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C22ActionPerformed(evt);
            }
        });

        T71.setMaximumSize(new java.awt.Dimension(90, 65));
        T71.setMinimumSize(new java.awt.Dimension(90, 65));
        T71.setPreferredSize(new java.awt.Dimension(90, 65));
        T71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T71ActionPerformed(evt);
            }
        });

        C32.setMaximumSize(new java.awt.Dimension(90, 65));
        C32.setMinimumSize(new java.awt.Dimension(90, 65));
        C32.setPreferredSize(new java.awt.Dimension(90, 65));
        C32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C32ActionPerformed(evt);
            }
        });

        C42.setMaximumSize(new java.awt.Dimension(90, 65));
        C42.setMinimumSize(new java.awt.Dimension(90, 65));
        C42.setPreferredSize(new java.awt.Dimension(90, 65));
        C42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C42ActionPerformed(evt);
            }
        });

        C62.setMaximumSize(new java.awt.Dimension(90, 65));
        C62.setMinimumSize(new java.awt.Dimension(90, 65));
        C62.setPreferredSize(new java.awt.Dimension(90, 65));
        C62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C62ActionPerformed(evt);
            }
        });

        C72.setMaximumSize(new java.awt.Dimension(90, 65));
        C72.setMinimumSize(new java.awt.Dimension(90, 65));
        C72.setPreferredSize(new java.awt.Dimension(90, 65));
        C72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C72ActionPerformed(evt);
            }
        });

        C52.setMaximumSize(new java.awt.Dimension(90, 65));
        C52.setMinimumSize(new java.awt.Dimension(90, 65));
        C52.setPreferredSize(new java.awt.Dimension(90, 65));
        C52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C52ActionPerformed(evt);
            }
        });

        K91.setMaximumSize(new java.awt.Dimension(90, 65));
        K91.setMinimumSize(new java.awt.Dimension(90, 65));
        K91.setPreferredSize(new java.awt.Dimension(90, 65));
        K91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K91ActionPerformed(evt);
            }
        });

        PQ1.setMaximumSize(new java.awt.Dimension(90, 65));
        PQ1.setMinimumSize(new java.awt.Dimension(90, 65));
        PQ1.setPreferredSize(new java.awt.Dimension(90, 65));
        PQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PQ1ActionPerformed(evt);
            }
        });

        PK2.setMaximumSize(new java.awt.Dimension(90, 65));
        PK2.setMinimumSize(new java.awt.Dimension(90, 65));
        PK2.setPreferredSize(new java.awt.Dimension(90, 65));
        PK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PK2ActionPerformed(evt);
            }
        });

        T62.setMaximumSize(new java.awt.Dimension(90, 65));
        T62.setMinimumSize(new java.awt.Dimension(90, 65));
        T62.setPreferredSize(new java.awt.Dimension(90, 65));
        T62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T62ActionPerformed(evt);
            }
        });

        T81.setMaximumSize(new java.awt.Dimension(90, 65));
        T81.setMinimumSize(new java.awt.Dimension(90, 65));
        T81.setPreferredSize(new java.awt.Dimension(90, 65));
        T81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T81ActionPerformed(evt);
            }
        });

        T52.setMaximumSize(new java.awt.Dimension(90, 65));
        T52.setMinimumSize(new java.awt.Dimension(90, 65));
        T52.setPreferredSize(new java.awt.Dimension(90, 65));
        T52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T52ActionPerformed(evt);
            }
        });

        T42.setMaximumSize(new java.awt.Dimension(90, 65));
        T42.setMinimumSize(new java.awt.Dimension(90, 65));
        T42.setPreferredSize(new java.awt.Dimension(90, 65));
        T42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T42ActionPerformed(evt);
            }
        });

        T22.setMaximumSize(new java.awt.Dimension(90, 65));
        T22.setMinimumSize(new java.awt.Dimension(90, 65));
        T22.setPreferredSize(new java.awt.Dimension(90, 65));
        T22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T22ActionPerformed(evt);
            }
        });

        C82.setMaximumSize(new java.awt.Dimension(90, 65));
        C82.setMinimumSize(new java.awt.Dimension(90, 65));
        C82.setPreferredSize(new java.awt.Dimension(90, 65));
        C82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C82ActionPerformed(evt);
            }
        });

        T32.setMaximumSize(new java.awt.Dimension(90, 65));
        T32.setMinimumSize(new java.awt.Dimension(90, 65));
        T32.setPreferredSize(new java.awt.Dimension(90, 65));
        T32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T32ActionPerformed(evt);
            }
        });

        K81.setMaximumSize(new java.awt.Dimension(90, 65));
        K81.setMinimumSize(new java.awt.Dimension(90, 65));
        K81.setPreferredSize(new java.awt.Dimension(90, 65));
        K81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K81ActionPerformed(evt);
            }
        });

        PK1.setMaximumSize(new java.awt.Dimension(90, 65));
        PK1.setMinimumSize(new java.awt.Dimension(90, 65));
        PK1.setPreferredSize(new java.awt.Dimension(90, 65));
        PK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PK1ActionPerformed(evt);
            }
        });

        PQ2.setMaximumSize(new java.awt.Dimension(90, 65));
        PQ2.setMinimumSize(new java.awt.Dimension(90, 65));
        PQ2.setPreferredSize(new java.awt.Dimension(90, 65));
        PQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PQ2ActionPerformed(evt);
            }
        });

        T72.setMaximumSize(new java.awt.Dimension(90, 65));
        T72.setMinimumSize(new java.awt.Dimension(90, 65));
        T72.setPreferredSize(new java.awt.Dimension(90, 65));
        T72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T72ActionPerformed(evt);
            }
        });

        T91.setMaximumSize(new java.awt.Dimension(90, 65));
        T91.setMinimumSize(new java.awt.Dimension(90, 65));
        T91.setPreferredSize(new java.awt.Dimension(90, 65));
        T91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T91ActionPerformed(evt);
            }
        });

        K62.setMaximumSize(new java.awt.Dimension(90, 65));
        K62.setMinimumSize(new java.awt.Dimension(90, 65));
        K62.setPreferredSize(new java.awt.Dimension(90, 65));
        K62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K62ActionPerformed(evt);
            }
        });

        K52.setMaximumSize(new java.awt.Dimension(90, 65));
        K52.setMinimumSize(new java.awt.Dimension(90, 65));
        K52.setPreferredSize(new java.awt.Dimension(90, 65));
        K52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K52ActionPerformed(evt);
            }
        });

        KA2.setMaximumSize(new java.awt.Dimension(90, 65));
        KA2.setMinimumSize(new java.awt.Dimension(90, 65));
        KA2.setPreferredSize(new java.awt.Dimension(90, 65));
        KA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KA2ActionPerformed(evt);
            }
        });

        C92.setMaximumSize(new java.awt.Dimension(90, 65));
        C92.setMinimumSize(new java.awt.Dimension(90, 65));
        C92.setPreferredSize(new java.awt.Dimension(90, 65));
        C92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C92ActionPerformed(evt);
            }
        });

        K42.setMaximumSize(new java.awt.Dimension(90, 65));
        K42.setMinimumSize(new java.awt.Dimension(90, 65));
        K42.setPreferredSize(new java.awt.Dimension(90, 65));
        K42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K42ActionPerformed(evt);
            }
        });

        K71.setMaximumSize(new java.awt.Dimension(90, 65));
        K71.setMinimumSize(new java.awt.Dimension(90, 65));
        K71.setPreferredSize(new java.awt.Dimension(90, 65));
        K71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K71ActionPerformed(evt);
            }
        });

        PA1.setMaximumSize(new java.awt.Dimension(90, 65));
        PA1.setMinimumSize(new java.awt.Dimension(90, 65));
        PA1.setPreferredSize(new java.awt.Dimension(90, 65));
        PA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PA1ActionPerformed(evt);
            }
        });

        PT2.setMaximumSize(new java.awt.Dimension(90, 65));
        PT2.setMinimumSize(new java.awt.Dimension(90, 65));
        PT2.setPreferredSize(new java.awt.Dimension(90, 65));
        PT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PT2ActionPerformed(evt);
            }
        });

        T82.setMaximumSize(new java.awt.Dimension(90, 65));
        T82.setMinimumSize(new java.awt.Dimension(90, 65));
        T82.setPreferredSize(new java.awt.Dimension(90, 65));
        T82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T82ActionPerformed(evt);
            }
        });

        TT1.setMaximumSize(new java.awt.Dimension(90, 65));
        TT1.setMinimumSize(new java.awt.Dimension(90, 65));
        TT1.setPreferredSize(new java.awt.Dimension(90, 65));
        TT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TT1ActionPerformed(evt);
            }
        });

        K72.setMaximumSize(new java.awt.Dimension(90, 65));
        K72.setMinimumSize(new java.awt.Dimension(90, 65));
        K72.setPreferredSize(new java.awt.Dimension(90, 65));
        K72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K72ActionPerformed(evt);
            }
        });

        K22.setMaximumSize(new java.awt.Dimension(90, 65));
        K22.setMinimumSize(new java.awt.Dimension(90, 65));
        K22.setPreferredSize(new java.awt.Dimension(90, 65));
        K22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K22ActionPerformed(evt);
            }
        });

        KK2.setMaximumSize(new java.awt.Dimension(90, 65));
        KK2.setMinimumSize(new java.awt.Dimension(90, 65));
        KK2.setPreferredSize(new java.awt.Dimension(90, 65));
        KK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KK2ActionPerformed(evt);
            }
        });

        CT2.setMaximumSize(new java.awt.Dimension(90, 65));
        CT2.setMinimumSize(new java.awt.Dimension(90, 65));
        CT2.setPreferredSize(new java.awt.Dimension(90, 65));
        CT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT2ActionPerformed(evt);
            }
        });

        K32.setMaximumSize(new java.awt.Dimension(90, 65));
        K32.setMinimumSize(new java.awt.Dimension(90, 65));
        K32.setPreferredSize(new java.awt.Dimension(90, 65));
        K32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K32ActionPerformed(evt);
            }
        });

        K61.setMaximumSize(new java.awt.Dimension(90, 65));
        K61.setMinimumSize(new java.awt.Dimension(90, 65));
        K61.setPreferredSize(new java.awt.Dimension(90, 65));
        K61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K61ActionPerformed(evt);
            }
        });

        C21.setMaximumSize(new java.awt.Dimension(90, 65));
        C21.setMinimumSize(new java.awt.Dimension(90, 65));
        C21.setPreferredSize(new java.awt.Dimension(90, 65));
        C21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C21ActionPerformed(evt);
            }
        });

        TQ1.setMaximumSize(new java.awt.Dimension(90, 65));
        TQ1.setMinimumSize(new java.awt.Dimension(90, 65));
        TQ1.setPreferredSize(new java.awt.Dimension(90, 65));
        TQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TQ1ActionPerformed(evt);
            }
        });

        T92.setMaximumSize(new java.awt.Dimension(90, 65));
        T92.setMinimumSize(new java.awt.Dimension(90, 65));
        T92.setPreferredSize(new java.awt.Dimension(90, 65));
        T92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T92ActionPerformed(evt);
            }
        });

        CQ2.setMaximumSize(new java.awt.Dimension(90, 65));
        CQ2.setMinimumSize(new java.awt.Dimension(90, 65));
        CQ2.setPreferredSize(new java.awt.Dimension(90, 65));
        CQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CQ2ActionPerformed(evt);
            }
        });

        P92.setMaximumSize(new java.awt.Dimension(90, 65));
        P92.setMinimumSize(new java.awt.Dimension(90, 65));
        P92.setPreferredSize(new java.awt.Dimension(90, 65));
        P92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P92ActionPerformed(evt);
            }
        });

        KQ2.setMaximumSize(new java.awt.Dimension(90, 65));
        KQ2.setMinimumSize(new java.awt.Dimension(90, 65));
        KQ2.setPreferredSize(new java.awt.Dimension(90, 65));
        KQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KQ2ActionPerformed(evt);
            }
        });

        K92.setMaximumSize(new java.awt.Dimension(90, 65));
        K92.setMinimumSize(new java.awt.Dimension(90, 65));
        K92.setPreferredSize(new java.awt.Dimension(90, 65));
        K92.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K92ActionPerformed(evt);
            }
        });

        K51.setMaximumSize(new java.awt.Dimension(90, 65));
        K51.setMinimumSize(new java.awt.Dimension(90, 65));
        K51.setPreferredSize(new java.awt.Dimension(90, 65));
        K51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K51ActionPerformed(evt);
            }
        });

        C31.setMaximumSize(new java.awt.Dimension(90, 65));
        C31.setMinimumSize(new java.awt.Dimension(90, 65));
        C31.setPreferredSize(new java.awt.Dimension(90, 65));
        C31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C31ActionPerformed(evt);
            }
        });

        K82.setMaximumSize(new java.awt.Dimension(90, 65));
        K82.setMinimumSize(new java.awt.Dimension(90, 65));
        K82.setPreferredSize(new java.awt.Dimension(90, 65));
        K82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K82ActionPerformed(evt);
            }
        });

        KT2.setMaximumSize(new java.awt.Dimension(90, 65));
        KT2.setMinimumSize(new java.awt.Dimension(90, 65));
        KT2.setPreferredSize(new java.awt.Dimension(90, 65));
        KT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KT2ActionPerformed(evt);
            }
        });

        P82.setMaximumSize(new java.awt.Dimension(90, 65));
        P82.setMinimumSize(new java.awt.Dimension(90, 65));
        P82.setPreferredSize(new java.awt.Dimension(90, 65));
        P82.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P82ActionPerformed(evt);
            }
        });

        TT2.setMaximumSize(new java.awt.Dimension(90, 65));
        TT2.setMinimumSize(new java.awt.Dimension(90, 65));
        TT2.setPreferredSize(new java.awt.Dimension(90, 65));
        TT2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TT2ActionPerformed(evt);
            }
        });

        TQ2.setMaximumSize(new java.awt.Dimension(90, 65));
        TQ2.setMinimumSize(new java.awt.Dimension(90, 65));
        TQ2.setPreferredSize(new java.awt.Dimension(90, 65));
        TQ2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TQ2ActionPerformed(evt);
            }
        });

        CA2.setMaximumSize(new java.awt.Dimension(90, 65));
        CA2.setMinimumSize(new java.awt.Dimension(90, 65));
        CA2.setPreferredSize(new java.awt.Dimension(90, 65));
        CA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA2ActionPerformed(evt);
            }
        });

        TK2.setMaximumSize(new java.awt.Dimension(90, 65));
        TK2.setMinimumSize(new java.awt.Dimension(90, 65));
        TK2.setPreferredSize(new java.awt.Dimension(90, 65));
        TK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TK2ActionPerformed(evt);
            }
        });

        CK2.setMaximumSize(new java.awt.Dimension(90, 65));
        CK2.setMinimumSize(new java.awt.Dimension(90, 65));
        CK2.setPreferredSize(new java.awt.Dimension(90, 65));
        CK2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CK2ActionPerformed(evt);
            }
        });

        C41.setMaximumSize(new java.awt.Dimension(90, 65));
        C41.setMinimumSize(new java.awt.Dimension(90, 65));
        C41.setPreferredSize(new java.awt.Dimension(90, 65));
        C41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C41ActionPerformed(evt);
            }
        });

        TA2.setMaximumSize(new java.awt.Dimension(90, 65));
        TA2.setMinimumSize(new java.awt.Dimension(90, 65));
        TA2.setPreferredSize(new java.awt.Dimension(90, 65));
        TA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TA2ActionPerformed(evt);
            }
        });

        TK1.setMaximumSize(new java.awt.Dimension(90, 65));
        TK1.setMinimumSize(new java.awt.Dimension(90, 65));
        TK1.setPreferredSize(new java.awt.Dimension(90, 65));
        TK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TK1ActionPerformed(evt);
            }
        });

        K41.setMaximumSize(new java.awt.Dimension(90, 65));
        K41.setMinimumSize(new java.awt.Dimension(90, 65));
        K41.setPreferredSize(new java.awt.Dimension(90, 65));
        K41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K41ActionPerformed(evt);
            }
        });

        K31.setMaximumSize(new java.awt.Dimension(90, 65));
        K31.setMinimumSize(new java.awt.Dimension(90, 65));
        K31.setPreferredSize(new java.awt.Dimension(90, 65));
        K31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K31ActionPerformed(evt);
            }
        });

        P22.setMaximumSize(new java.awt.Dimension(90, 65));
        P22.setMinimumSize(new java.awt.Dimension(90, 65));
        P22.setPreferredSize(new java.awt.Dimension(90, 65));
        P22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P22ActionPerformed(evt);
            }
        });

        P72.setMaximumSize(new java.awt.Dimension(90, 65));
        P72.setMinimumSize(new java.awt.Dimension(90, 65));
        P72.setPreferredSize(new java.awt.Dimension(90, 65));
        P72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P72ActionPerformed(evt);
            }
        });

        P52.setMaximumSize(new java.awt.Dimension(90, 65));
        P52.setMinimumSize(new java.awt.Dimension(90, 65));
        P52.setPreferredSize(new java.awt.Dimension(90, 65));
        P52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P52ActionPerformed(evt);
            }
        });

        C51.setMaximumSize(new java.awt.Dimension(90, 65));
        C51.setMinimumSize(new java.awt.Dimension(90, 65));
        C51.setPreferredSize(new java.awt.Dimension(90, 65));
        C51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C51ActionPerformed(evt);
            }
        });

        K21.setMaximumSize(new java.awt.Dimension(90, 65));
        K21.setMinimumSize(new java.awt.Dimension(90, 65));
        K21.setPreferredSize(new java.awt.Dimension(90, 65));
        K21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                K21ActionPerformed(evt);
            }
        });

        P32.setMaximumSize(new java.awt.Dimension(90, 65));
        P32.setMinimumSize(new java.awt.Dimension(90, 65));
        P32.setPreferredSize(new java.awt.Dimension(90, 65));
        P32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P32ActionPerformed(evt);
            }
        });

        TA1.setMaximumSize(new java.awt.Dimension(90, 65));
        TA1.setMinimumSize(new java.awt.Dimension(90, 65));
        TA1.setPreferredSize(new java.awt.Dimension(90, 65));
        TA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TA1ActionPerformed(evt);
            }
        });

        P62.setMaximumSize(new java.awt.Dimension(90, 65));
        P62.setMinimumSize(new java.awt.Dimension(90, 65));
        P62.setPreferredSize(new java.awt.Dimension(90, 65));
        P62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P62ActionPerformed(evt);
            }
        });

        P42.setMaximumSize(new java.awt.Dimension(90, 65));
        P42.setMinimumSize(new java.awt.Dimension(90, 65));
        P42.setPreferredSize(new java.awt.Dimension(90, 65));
        P42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P42ActionPerformed(evt);
            }
        });

        C81.setMaximumSize(new java.awt.Dimension(90, 65));
        C81.setMinimumSize(new java.awt.Dimension(90, 65));
        C81.setPreferredSize(new java.awt.Dimension(90, 65));
        C81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C81ActionPerformed(evt);
            }
        });

        C91.setMaximumSize(new java.awt.Dimension(90, 65));
        C91.setMinimumSize(new java.awt.Dimension(90, 65));
        C91.setPreferredSize(new java.awt.Dimension(90, 65));
        C91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C91ActionPerformed(evt);
            }
        });

        CT1.setMaximumSize(new java.awt.Dimension(90, 65));
        CT1.setMinimumSize(new java.awt.Dimension(90, 65));
        CT1.setPreferredSize(new java.awt.Dimension(90, 65));
        CT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CT1ActionPerformed(evt);
            }
        });

        C71.setMaximumSize(new java.awt.Dimension(90, 65));
        C71.setMinimumSize(new java.awt.Dimension(90, 65));
        C71.setPreferredSize(new java.awt.Dimension(90, 65));
        C71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C71ActionPerformed(evt);
            }
        });

        CA1.setMaximumSize(new java.awt.Dimension(90, 65));
        CA1.setMinimumSize(new java.awt.Dimension(90, 65));
        CA1.setPreferredSize(new java.awt.Dimension(90, 65));
        CA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CA1ActionPerformed(evt);
            }
        });

        CK1.setMaximumSize(new java.awt.Dimension(90, 65));
        CK1.setMinimumSize(new java.awt.Dimension(90, 65));
        CK1.setPreferredSize(new java.awt.Dimension(90, 65));
        CK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CK1ActionPerformed(evt);
            }
        });

        joker3.setMaximumSize(new java.awt.Dimension(90, 65));
        joker3.setMinimumSize(new java.awt.Dimension(90, 65));
        joker3.setPreferredSize(new java.awt.Dimension(90, 65));
        joker3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joker3ActionPerformed(evt);
            }
        });

        C61.setMaximumSize(new java.awt.Dimension(90, 65));
        C61.setMinimumSize(new java.awt.Dimension(90, 65));
        C61.setPreferredSize(new java.awt.Dimension(90, 65));
        C61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C61ActionPerformed(evt);
            }
        });

        CQ1.setMaximumSize(new java.awt.Dimension(90, 65));
        CQ1.setMinimumSize(new java.awt.Dimension(90, 65));
        CQ1.setPreferredSize(new java.awt.Dimension(90, 65));
        CQ1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CQ1ActionPerformed(evt);
            }
        });

        joker4.setMaximumSize(new java.awt.Dimension(90, 65));
        joker4.setMinimumSize(new java.awt.Dimension(90, 65));
        joker4.setPreferredSize(new java.awt.Dimension(90, 65));
        joker4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joker4ActionPerformed(evt);
            }
        });

        aktywna.setText("Aktywna");
        aktywna.setMaximumSize(new java.awt.Dimension(90, 65));
        aktywna.setMinimumSize(new java.awt.Dimension(90, 65));
        aktywna.setPreferredSize(new java.awt.Dimension(90, 65));
        aktywna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aktywnaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(joker1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(P41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(P51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(P61, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(P71, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(P81, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(P91, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(joker2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(T61, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(T51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(T41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(T31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(T21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(KA1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(KK1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(KQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(KT1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(PT1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(T71, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PA2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(C72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(K91, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(T81, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PK2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(T62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(T52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(T42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(T32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(T22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(C82, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(K81, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(PK1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(T91, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KA2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C92, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K71, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PA1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TT1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PT2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(T82, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(KK2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CT2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(K61, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(P92, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(T92, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(K82, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(K92, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(KT2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(KQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(CQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(K51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(C31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TK1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P82, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TT2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TK2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TA2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CA2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CK2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C41, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(joker3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CA1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CK1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CT1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C91, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C81, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C71, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C61, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(joker4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TA1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P72, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P62, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P52, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P42, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P32, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K21, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(K31, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C51, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Reka2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reka1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Start)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Reka3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reka4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Reka5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reka6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Reka7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aktywna, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(joker1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P31, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P41, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P51, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P61, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P81, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P71, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P91, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(joker2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T61, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T41, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T51, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T31, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KA1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KK1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KT1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PT1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T71, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PA2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C42, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C52, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C72, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C62, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K91, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T81, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T62, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PK2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T52, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T42, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C82, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K81, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PK1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T91, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T72, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K62, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K52, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K42, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C92, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KA2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K71, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PA1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TT1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T82, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PT2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K72, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CT2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KK2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K61, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T92, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P92, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K82, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K92, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KT2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(KQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K51, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C31, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TK1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TT2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P82, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TK2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TA2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CK2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CA2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K41, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C41, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TA1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P62, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P72, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P52, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P42, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P32, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K21, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P22, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K31, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C51, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(joker3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CK1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CA1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CQ1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CT1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C91, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C71, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C81, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C61, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(joker4, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reka4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Start, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Reka1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Reka2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Reka3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Reka6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reka5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Reka7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(aktywna, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartActionPerformed
        gracze.removeAll(gracze);
        kres = false;
        inicjuj_talie();
        int indeks = 1;
        Collections.shuffle(talia);
        Collections.shuffle(talia);
        Collections.shuffle(talia);
        Object[] opcje = {"2 graczy", "3 graczy", "2 drużyny po 2", "3 drużyny po 2",
            "2 drużyny po 3", "3 drużyny po 3", "2 drużyny po 4", "3 drużyny po 4",
            "2 drużyny po 5", "2 drużyny po 6"};
        int opcja = JOptionPane.showOptionDialog(rootPane, "Ilu ma byc graczy", "Nowa gra",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcje, null);
        int druzyna = 0;
        biezacy_gracz = 0;
        int gracz = 0;
        switch (opcja) {
            case 0:
                druzyny = 2;
                gracz = 1;
                reka = 7;
                wygrana = 2;
                break;
            case 1:
                druzyny = 3;
                gracz = 1;
                reka = 6;
                wygrana = 1;
                break;
            case 2:
                druzyny = 2;
                gracz = 2;
                wygrana = 2;
                reka = 6;
                break;
            case 3:
                druzyny = 3;
                gracz = 2;
                wygrana = 1;
                reka = 5;
                break;
            case 4:
                druzyny = 2;
                gracz = 3;
                wygrana = 2;
                reka = 5;
                break;
            case 5:
                druzyny = 3;
                gracz = 3;
                wygrana = 1;
                reka = 5;
                break;
            case 6:
                druzyny = 2;
                gracz = 4;
                wygrana = 2;
                reka = 4;
                break;
            case 7:
                druzyny = 3;
                gracz = 4;
                wygrana = 1;
                reka = 3;
                break;
            case 8:
                druzyny = 2;
                gracz = 5;
                wygrana = 2;
                reka = 3;
                break;
            case 9:
                druzyny = 2;
                gracz = 6;
                wygrana = 2;
                reka = 3;
                break;
            default:
                druzyny = 2;
                gracz = 1;
                wygrana = 2;
                reka = 7;
                break;
        }
        for (int i = 0; i < gracz; i++) {
            for (int j = 0; j < druzyny; j++) {
                Color temp = null;
                if (i == 0) {
                    do {
                        temp = JColorChooser.showDialog(rootPane, "Wybierz kolor drużyny", Color.WHITE);
                    } while (temp == null);
                } else {
                    temp = this.gracze.get(gracz == 2 ? this.gracze.size() - 1 : this.gracze.size() - 2).getKolor();
                }
                this.gracze.add(new Gracz(temp, i + 1, j + 1));
            }
        }
        for (int i = 0; i < reka; i++) {
            for (Gracz g : gracze) {
                g.doloz(talia.get(talia.size() - 1));
                talia.remove(talia.size() - 1);
            }
        }
        Reka1.setEnabled(true);
        Reka2.setEnabled(true);
        Reka3.setEnabled(true);
        Reka4.setEnabled(true);
        Reka5.setEnabled(true);
        Reka6.setEnabled(true);
        Reka7.setEnabled(true);
        pokaz_karty(biezacy_gracz);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablica[i][j] = 0;
            }
        }
        styl();
    }//GEN-LAST:event_StartActionPerformed

    private void Reka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka2ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(1), 1);
        }
    }//GEN-LAST:event_Reka2ActionPerformed

    private void Reka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka1ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(0), 0);
        }
    }//GEN-LAST:event_Reka1ActionPerformed

    private void Reka3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka3ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(2), 2);
        }
    }//GEN-LAST:event_Reka3ActionPerformed

    private void Reka4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka4ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(3), 3);
        }
    }//GEN-LAST:event_Reka4ActionPerformed

    private void Reka6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka6ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(5), 5);
        }
    }//GEN-LAST:event_Reka6ActionPerformed

    private void Reka5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka5ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(4), 4);
        }
    }//GEN-LAST:event_Reka5ActionPerformed

    private void Reka7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reka7ActionPerformed
        if (akcja == 0) {
            zagraj(gracze.get(biezacy_gracz).getReka().get(6), 6);
        }
    }//GEN-LAST:event_Reka7ActionPerformed

    private void joker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joker1ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Jokery są neutralne");
    }//GEN-LAST:event_joker1ActionPerformed

    private void P21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P21ActionPerformed
        wykonaj_akcje(0, 1, evt.getSource());
    }//GEN-LAST:event_P21ActionPerformed

    private void P31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P31ActionPerformed
        wykonaj_akcje(0, 2, evt.getSource());
    }//GEN-LAST:event_P31ActionPerformed

    private void P41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P41ActionPerformed
        wykonaj_akcje(0, 3, evt.getSource());
    }//GEN-LAST:event_P41ActionPerformed

    private void P51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P51ActionPerformed
        wykonaj_akcje(0, 4, evt.getSource());
    }//GEN-LAST:event_P51ActionPerformed

    private void P71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P71ActionPerformed
        wykonaj_akcje(0, 6, evt.getSource());
    }//GEN-LAST:event_P71ActionPerformed

    private void P81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P81ActionPerformed
        wykonaj_akcje(0, 7, evt.getSource());
    }//GEN-LAST:event_P81ActionPerformed

    private void P61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P61ActionPerformed
        wykonaj_akcje(0, 5, evt.getSource());
    }//GEN-LAST:event_P61ActionPerformed

    private void P91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P91ActionPerformed
        wykonaj_akcje(0, 8, evt.getSource());
    }//GEN-LAST:event_P91ActionPerformed

    private void joker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joker2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Jokery są neutralne");
    }//GEN-LAST:event_joker2ActionPerformed

    private void T51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T51ActionPerformed
        wykonaj_akcje(1, 1, evt.getSource());
    }//GEN-LAST:event_T51ActionPerformed

    private void T41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T41ActionPerformed
        wykonaj_akcje(1, 2, evt.getSource());
    }//GEN-LAST:event_T41ActionPerformed

    private void T61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T61ActionPerformed
        wykonaj_akcje(1, 0, evt.getSource());
    }//GEN-LAST:event_T61ActionPerformed

    private void T31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T31ActionPerformed
        wykonaj_akcje(1, 3, evt.getSource());
    }//GEN-LAST:event_T31ActionPerformed

    private void T21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T21ActionPerformed
        wykonaj_akcje(1, 4, evt.getSource());
    }//GEN-LAST:event_T21ActionPerformed

    private void KK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KK1ActionPerformed
        wykonaj_akcje(1, 6, evt.getSource());
    }//GEN-LAST:event_KK1ActionPerformed

    private void KQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KQ1ActionPerformed
        wykonaj_akcje(1, 7, evt.getSource());
    }//GEN-LAST:event_KQ1ActionPerformed

    private void KA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KA1ActionPerformed
        wykonaj_akcje(1, 5, evt.getSource());
    }//GEN-LAST:event_KA1ActionPerformed

    private void KT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KT1ActionPerformed
        wykonaj_akcje(1, 8, evt.getSource());
    }//GEN-LAST:event_KT1ActionPerformed

    private void PT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PT1ActionPerformed
        wykonaj_akcje(1, 9, evt.getSource());
    }//GEN-LAST:event_PT1ActionPerformed

    private void PA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PA2ActionPerformed
        wykonaj_akcje(2, 1, evt.getSource());
    }//GEN-LAST:event_PA2ActionPerformed

    private void C22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C22ActionPerformed
        wykonaj_akcje(2, 2, evt.getSource());
    }//GEN-LAST:event_C22ActionPerformed

    private void T71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T71ActionPerformed
        wykonaj_akcje(2, 0, evt.getSource());
    }//GEN-LAST:event_T71ActionPerformed

    private void C32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C32ActionPerformed
        wykonaj_akcje(2, 3, evt.getSource());
    }//GEN-LAST:event_C32ActionPerformed

    private void C42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C42ActionPerformed
        wykonaj_akcje(2, 4, evt.getSource());
    }//GEN-LAST:event_C42ActionPerformed

    private void C62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C62ActionPerformed
        wykonaj_akcje(2, 6, evt.getSource());
    }//GEN-LAST:event_C62ActionPerformed

    private void C72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C72ActionPerformed
        wykonaj_akcje(2, 7, evt.getSource());
    }//GEN-LAST:event_C72ActionPerformed

    private void C52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C52ActionPerformed
        wykonaj_akcje(2, 5, evt.getSource());
    }//GEN-LAST:event_C52ActionPerformed

    private void K91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K91ActionPerformed
        wykonaj_akcje(2, 8, evt.getSource());
    }//GEN-LAST:event_K91ActionPerformed

    private void PQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PQ1ActionPerformed
        wykonaj_akcje(2, 9, evt.getSource());
    }//GEN-LAST:event_PQ1ActionPerformed

    private void PK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PK2ActionPerformed
        wykonaj_akcje(3, 1, evt.getSource());
    }//GEN-LAST:event_PK2ActionPerformed

    private void T62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T62ActionPerformed
        wykonaj_akcje(3, 2, evt.getSource());
    }//GEN-LAST:event_T62ActionPerformed

    private void T81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T81ActionPerformed
        wykonaj_akcje(3, 0, evt.getSource());
    }//GEN-LAST:event_T81ActionPerformed

    private void T52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T52ActionPerformed
        wykonaj_akcje(3, 3, evt.getSource());
    }//GEN-LAST:event_T52ActionPerformed

    private void T42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T42ActionPerformed
        wykonaj_akcje(3, 4, evt.getSource());
    }//GEN-LAST:event_T42ActionPerformed

    private void T22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T22ActionPerformed
        wykonaj_akcje(3, 6, evt.getSource());
    }//GEN-LAST:event_T22ActionPerformed

    private void C82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C82ActionPerformed
        wykonaj_akcje(3, 7, evt.getSource());
    }//GEN-LAST:event_C82ActionPerformed

    private void T32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T32ActionPerformed
        wykonaj_akcje(3, 5, evt.getSource());
    }//GEN-LAST:event_T32ActionPerformed

    private void K81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K81ActionPerformed
        wykonaj_akcje(3, 8, evt.getSource());
    }//GEN-LAST:event_K81ActionPerformed

    private void PK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PK1ActionPerformed
        wykonaj_akcje(3, 9, evt.getSource());
    }//GEN-LAST:event_PK1ActionPerformed

    private void PQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PQ2ActionPerformed
        wykonaj_akcje(4, 1, evt.getSource());
    }//GEN-LAST:event_PQ2ActionPerformed

    private void T72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T72ActionPerformed
        wykonaj_akcje(4, 2, evt.getSource());
    }//GEN-LAST:event_T72ActionPerformed

    private void T91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T91ActionPerformed
        wykonaj_akcje(4, 0, evt.getSource());
    }//GEN-LAST:event_T91ActionPerformed

    private void K62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K62ActionPerformed
        wykonaj_akcje(4, 3, evt.getSource());
    }//GEN-LAST:event_K62ActionPerformed

    private void K52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K52ActionPerformed
        wykonaj_akcje(4, 4, evt.getSource());
    }//GEN-LAST:event_K52ActionPerformed

    private void KA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KA2ActionPerformed
        wykonaj_akcje(4, 6, evt.getSource());
    }//GEN-LAST:event_KA2ActionPerformed

    private void C92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C92ActionPerformed
        wykonaj_akcje(4, 7, evt.getSource());
    }//GEN-LAST:event_C92ActionPerformed

    private void K42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K42ActionPerformed
        wykonaj_akcje(4, 5, evt.getSource());
    }//GEN-LAST:event_K42ActionPerformed

    private void K71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K71ActionPerformed
        wykonaj_akcje(4, 8, evt.getSource());
    }//GEN-LAST:event_K71ActionPerformed

    private void PA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PA1ActionPerformed
        wykonaj_akcje(4, 9, evt.getSource());
    }//GEN-LAST:event_PA1ActionPerformed

    private void PT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PT2ActionPerformed
        wykonaj_akcje(5, 1, evt.getSource());
    }//GEN-LAST:event_PT2ActionPerformed

    private void T82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T82ActionPerformed
        wykonaj_akcje(5, 2, evt.getSource());
    }//GEN-LAST:event_T82ActionPerformed

    private void TT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TT1ActionPerformed
        wykonaj_akcje(5, 0, evt.getSource());
    }//GEN-LAST:event_TT1ActionPerformed

    private void K72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K72ActionPerformed
        wykonaj_akcje(5, 3, evt.getSource());
    }//GEN-LAST:event_K72ActionPerformed

    private void K22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K22ActionPerformed
        wykonaj_akcje(5, 4, evt.getSource());
    }//GEN-LAST:event_K22ActionPerformed

    private void KK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KK2ActionPerformed
        wykonaj_akcje(5, 6, evt.getSource());
    }//GEN-LAST:event_KK2ActionPerformed

    private void CT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT2ActionPerformed
        wykonaj_akcje(5, 7, evt.getSource());
    }//GEN-LAST:event_CT2ActionPerformed

    private void K32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K32ActionPerformed
        wykonaj_akcje(5, 5, evt.getSource());
    }//GEN-LAST:event_K32ActionPerformed

    private void K61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K61ActionPerformed
        wykonaj_akcje(5, 8, evt.getSource());
    }//GEN-LAST:event_K61ActionPerformed

    private void C21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C21ActionPerformed
        wykonaj_akcje(5, 9, evt.getSource());
    }//GEN-LAST:event_C21ActionPerformed

    private void TQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TQ1ActionPerformed
        wykonaj_akcje(6, 0, evt.getSource());
    }//GEN-LAST:event_TQ1ActionPerformed

    private void T92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T92ActionPerformed
        wykonaj_akcje(6, 2, evt.getSource());
    }//GEN-LAST:event_T92ActionPerformed

    private void CQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CQ2ActionPerformed
        wykonaj_akcje(6, 7, evt.getSource());
    }//GEN-LAST:event_CQ2ActionPerformed

    private void P92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P92ActionPerformed
        wykonaj_akcje(6, 1, evt.getSource());
    }//GEN-LAST:event_P92ActionPerformed

    private void KQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KQ2ActionPerformed
        wykonaj_akcje(6, 6, evt.getSource());
    }//GEN-LAST:event_KQ2ActionPerformed

    private void K92ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K92ActionPerformed
        wykonaj_akcje(6, 4, evt.getSource());
    }//GEN-LAST:event_K92ActionPerformed

    private void K51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K51ActionPerformed
        wykonaj_akcje(6, 8, evt.getSource());
    }//GEN-LAST:event_K51ActionPerformed

    private void C31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C31ActionPerformed
        wykonaj_akcje(6, 9, evt.getSource());
    }//GEN-LAST:event_C31ActionPerformed

    private void K82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K82ActionPerformed
        wykonaj_akcje(6, 3, evt.getSource());
    }//GEN-LAST:event_K82ActionPerformed

    private void KT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KT2ActionPerformed
        wykonaj_akcje(6, 5, evt.getSource());
    }//GEN-LAST:event_KT2ActionPerformed

    private void P82ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P82ActionPerformed
        wykonaj_akcje(7, 1, evt.getSource());
    }//GEN-LAST:event_P82ActionPerformed

    private void TT2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TT2ActionPerformed
        wykonaj_akcje(7, 2, evt.getSource());
    }//GEN-LAST:event_TT2ActionPerformed

    private void TQ2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TQ2ActionPerformed
        wykonaj_akcje(7, 3, evt.getSource());
    }//GEN-LAST:event_TQ2ActionPerformed

    private void CA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA2ActionPerformed
        wykonaj_akcje(7, 6, evt.getSource());
    }//GEN-LAST:event_CA2ActionPerformed

    private void TK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TK2ActionPerformed
        wykonaj_akcje(7, 4, evt.getSource());
    }//GEN-LAST:event_TK2ActionPerformed

    private void CK2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CK2ActionPerformed
        wykonaj_akcje(7, 7, evt.getSource());
    }//GEN-LAST:event_CK2ActionPerformed

    private void C41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C41ActionPerformed
        wykonaj_akcje(7, 9, evt.getSource());
    }//GEN-LAST:event_C41ActionPerformed

    private void TA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TA2ActionPerformed
        wykonaj_akcje(7, 5, evt.getSource());
    }//GEN-LAST:event_TA2ActionPerformed

    private void TK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TK1ActionPerformed
        wykonaj_akcje(7, 0, evt.getSource());
    }//GEN-LAST:event_TK1ActionPerformed

    private void K41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K41ActionPerformed
        wykonaj_akcje(7, 8, evt.getSource());
    }//GEN-LAST:event_K41ActionPerformed

    private void K31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K31ActionPerformed
        wykonaj_akcje(8, 8, evt.getSource());
    }//GEN-LAST:event_K31ActionPerformed

    private void P22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P22ActionPerformed
        wykonaj_akcje(8, 6, evt.getSource());
    }//GEN-LAST:event_P22ActionPerformed

    private void P72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P72ActionPerformed
        wykonaj_akcje(8, 1, evt.getSource());
    }//GEN-LAST:event_P72ActionPerformed

    private void P52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P52ActionPerformed
        wykonaj_akcje(8, 3, evt.getSource());
    }//GEN-LAST:event_P52ActionPerformed

    private void C51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C51ActionPerformed
        wykonaj_akcje(8, 9, evt.getSource());
    }//GEN-LAST:event_C51ActionPerformed

    private void K21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_K21ActionPerformed
        wykonaj_akcje(8, 7, evt.getSource());
    }//GEN-LAST:event_K21ActionPerformed

    private void P32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P32ActionPerformed
        wykonaj_akcje(8, 5, evt.getSource());
    }//GEN-LAST:event_P32ActionPerformed

    private void TA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TA1ActionPerformed
        wykonaj_akcje(8, 0, evt.getSource());
    }//GEN-LAST:event_TA1ActionPerformed

    private void P62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P62ActionPerformed
        wykonaj_akcje(8, 2, evt.getSource());
    }//GEN-LAST:event_P62ActionPerformed

    private void P42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P42ActionPerformed
        wykonaj_akcje(8, 4, evt.getSource());
    }//GEN-LAST:event_P42ActionPerformed

    private void C81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C81ActionPerformed
        wykonaj_akcje(9, 6, evt.getSource());
    }//GEN-LAST:event_C81ActionPerformed

    private void C91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C91ActionPerformed
        wykonaj_akcje(9, 5, evt.getSource());
    }//GEN-LAST:event_C91ActionPerformed

    private void CT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CT1ActionPerformed
        wykonaj_akcje(9, 4, evt.getSource());
    }//GEN-LAST:event_CT1ActionPerformed

    private void C71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C71ActionPerformed
        wykonaj_akcje(9, 7, evt.getSource());
    }//GEN-LAST:event_C71ActionPerformed

    private void CA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CA1ActionPerformed
        wykonaj_akcje(9, 1, evt.getSource());
    }//GEN-LAST:event_CA1ActionPerformed

    private void CK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CK1ActionPerformed
        wykonaj_akcje(9, 2, evt.getSource());
    }//GEN-LAST:event_CK1ActionPerformed

    private void joker3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joker3ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Jokery są neutralne");
    }//GEN-LAST:event_joker3ActionPerformed

    private void C61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C61ActionPerformed
        wykonaj_akcje(9, 8, evt.getSource());
    }//GEN-LAST:event_C61ActionPerformed

    private void CQ1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CQ1ActionPerformed
        wykonaj_akcje(9, 3, evt.getSource());
    }//GEN-LAST:event_CQ1ActionPerformed

    private void joker4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joker4ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Jokery są neutralne");
    }//GEN-LAST:event_joker4ActionPerformed

    private void aktywnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aktywnaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aktywnaActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sequence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Sequence().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C21;
    private javax.swing.JButton C22;
    private javax.swing.JButton C31;
    private javax.swing.JButton C32;
    private javax.swing.JButton C41;
    private javax.swing.JButton C42;
    private javax.swing.JButton C51;
    private javax.swing.JButton C52;
    private javax.swing.JButton C61;
    private javax.swing.JButton C62;
    private javax.swing.JButton C71;
    private javax.swing.JButton C72;
    private javax.swing.JButton C81;
    private javax.swing.JButton C82;
    private javax.swing.JButton C91;
    private javax.swing.JButton C92;
    private javax.swing.JButton CA1;
    private javax.swing.JButton CA2;
    private javax.swing.JButton CK1;
    private javax.swing.JButton CK2;
    private javax.swing.JButton CQ1;
    private javax.swing.JButton CQ2;
    private javax.swing.JButton CT1;
    private javax.swing.JButton CT2;
    private javax.swing.JButton K21;
    private javax.swing.JButton K22;
    private javax.swing.JButton K31;
    private javax.swing.JButton K32;
    private javax.swing.JButton K41;
    private javax.swing.JButton K42;
    private javax.swing.JButton K51;
    private javax.swing.JButton K52;
    private javax.swing.JButton K61;
    private javax.swing.JButton K62;
    private javax.swing.JButton K71;
    private javax.swing.JButton K72;
    private javax.swing.JButton K81;
    private javax.swing.JButton K82;
    private javax.swing.JButton K91;
    private javax.swing.JButton K92;
    private javax.swing.JButton KA1;
    private javax.swing.JButton KA2;
    private javax.swing.JButton KK1;
    private javax.swing.JButton KK2;
    private javax.swing.JButton KQ1;
    private javax.swing.JButton KQ2;
    private javax.swing.JButton KT1;
    private javax.swing.JButton KT2;
    private javax.swing.JButton P21;
    private javax.swing.JButton P22;
    private javax.swing.JButton P31;
    private javax.swing.JButton P32;
    private javax.swing.JButton P41;
    private javax.swing.JButton P42;
    private javax.swing.JButton P51;
    private javax.swing.JButton P52;
    private javax.swing.JButton P61;
    private javax.swing.JButton P62;
    private javax.swing.JButton P71;
    private javax.swing.JButton P72;
    private javax.swing.JButton P81;
    private javax.swing.JButton P82;
    private javax.swing.JButton P91;
    private javax.swing.JButton P92;
    private javax.swing.JButton PA1;
    private javax.swing.JButton PA2;
    private javax.swing.JButton PK1;
    private javax.swing.JButton PK2;
    private javax.swing.JButton PQ1;
    private javax.swing.JButton PQ2;
    private javax.swing.JButton PT1;
    private javax.swing.JButton PT2;
    private javax.swing.JButton Reka1;
    private javax.swing.JButton Reka2;
    private javax.swing.JButton Reka3;
    private javax.swing.JButton Reka4;
    private javax.swing.JButton Reka5;
    private javax.swing.JButton Reka6;
    private javax.swing.JButton Reka7;
    private javax.swing.JButton Start;
    private javax.swing.JButton T21;
    private javax.swing.JButton T22;
    private javax.swing.JButton T31;
    private javax.swing.JButton T32;
    private javax.swing.JButton T41;
    private javax.swing.JButton T42;
    private javax.swing.JButton T51;
    private javax.swing.JButton T52;
    private javax.swing.JButton T61;
    private javax.swing.JButton T62;
    private javax.swing.JButton T71;
    private javax.swing.JButton T72;
    private javax.swing.JButton T81;
    private javax.swing.JButton T82;
    private javax.swing.JButton T91;
    private javax.swing.JButton T92;
    private javax.swing.JButton TA1;
    private javax.swing.JButton TA2;
    private javax.swing.JButton TK1;
    private javax.swing.JButton TK2;
    private javax.swing.JButton TQ1;
    private javax.swing.JButton TQ2;
    private javax.swing.JButton TT1;
    private javax.swing.JButton TT2;
    private javax.swing.JButton aktywna;
    private javax.swing.JButton joker1;
    private javax.swing.JButton joker2;
    private javax.swing.JButton joker3;
    private javax.swing.JButton joker4;
    // End of variables declaration//GEN-END:variables

    private void pokaz_karty(int biezacy_gracz) {

        Reka6.setVisible(reka > 5);
        Reka7.setVisible(reka > 5 && reka == 7);
        Reka1.setIcon((gracze.get(biezacy_gracz).getReka().size() >= 1) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(0).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
        Reka2.setIcon((gracze.get(biezacy_gracz).getReka().size() >= 2) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(1).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
        Reka3.setIcon((gracze.get(biezacy_gracz).getReka().size() >= 3) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(2).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
        Reka4.setIcon((gracze.get(biezacy_gracz).getReka().size() >= 4) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(3).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
        Reka5.setIcon((gracze.get(biezacy_gracz).getReka().size() >= 5) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(4).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
        Reka6.setIcon((reka > 5 && gracze.get(biezacy_gracz).getReka().size() >= 6) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(5).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
        Reka7.setIcon((reka > 5 && reka == 7 && gracze.get(biezacy_gracz).getReka().size() == 7) ? (new ImageIcon(((gracze.get(biezacy_gracz).getReka().get(6).getSymbol()).getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)))) : null);
    }

    private void inicjuj_talie() {
        talia.removeAll(talia);
        talia.add(new Karta(new int[]{0, 1}, new int[]{8, 6}, 2, 4, 0, new ImageIcon(this.getClass().getResource("2P.png")), "P2"));
        talia.add(new Karta(new int[]{0, 2}, new int[]{8, 5}, 3, 4, 0, new ImageIcon(this.getClass().getResource("3P.png")), "P3"));
        talia.add(new Karta(new int[]{0, 3}, new int[]{8, 4}, 4, 4, 0, new ImageIcon(this.getClass().getResource("4P.png")), "P4"));
        talia.add(new Karta(new int[]{0, 4}, new int[]{8, 3}, 5, 4, 0, new ImageIcon(this.getClass().getResource("5P.png")), "P5"));
        talia.add(new Karta(new int[]{0, 5}, new int[]{8, 2}, 6, 4, 0, new ImageIcon(this.getClass().getResource("6P.png")), "P6"));
        talia.add(new Karta(new int[]{0, 6}, new int[]{8, 1}, 7, 4, 0, new ImageIcon(this.getClass().getResource("7P.png")), "P7"));
        talia.add(new Karta(new int[]{0, 7}, new int[]{7, 1}, 8, 4, 0, new ImageIcon(this.getClass().getResource("8P.png")), "P8"));
        talia.add(new Karta(new int[]{0, 8}, new int[]{6, 1}, 9, 4, 0, new ImageIcon(this.getClass().getResource("9P.png")), "P9"));
        talia.add(new Karta(new int[]{9, 1}, new int[]{7, 6}, 1, 2, 0, new ImageIcon(this.getClass().getResource("AC.png")), "CA"));
        talia.add(new Karta(new int[]{8, 0}, new int[]{7, 5}, 1, 3, 0, new ImageIcon(this.getClass().getResource("AT.png")), "TA"));
        talia.add(new Karta(new int[]{7, 0}, new int[]{7, 4}, 13, 3, 0, new ImageIcon(this.getClass().getResource("KT.png")), "TK"));
        talia.add(new Karta(new int[]{6, 0}, new int[]{7, 3}, 12, 3, 0, new ImageIcon(this.getClass().getResource("QT.png")), "TQ"));
        talia.add(new Karta(new int[]{5, 0}, new int[]{7, 2}, 10, 3, 0, new ImageIcon(this.getClass().getResource("TT.png")), "TT"));
        talia.add(new Karta(new int[]{4, 0}, new int[]{6, 2}, 9, 3, 0, new ImageIcon(this.getClass().getResource("9T.png")), "T9"));
        talia.add(new Karta(new int[]{3, 0}, new int[]{5, 2}, 8, 3, 0, new ImageIcon(this.getClass().getResource("8T.png")), "T8"));
        talia.add(new Karta(new int[]{1, 9}, new int[]{5, 1}, 10, 4, 0, new ImageIcon(this.getClass().getResource("TP.png")), "PT"));
        talia.add(new Karta(new int[]{9, 2}, new int[]{7, 7}, 13, 2, 0, new ImageIcon(this.getClass().getResource("KC.png")), "CK"));
        talia.add(new Karta(new int[]{1, 8}, new int[]{6, 5}, 10, 1, 0, new ImageIcon(this.getClass().getResource("TK.png")), "KT"));
        talia.add(new Karta(new int[]{2, 8}, new int[]{6, 4}, 9, 1, 0, new ImageIcon(this.getClass().getResource("9K.png")), "K9"));
        talia.add(new Karta(new int[]{3, 8}, new int[]{6, 3}, 8, 1, 0, new ImageIcon(this.getClass().getResource("8K.png")), "K8"));
        talia.add(new Karta(new int[]{4, 8}, new int[]{5, 3}, 7, 1, 0, new ImageIcon(this.getClass().getResource("7K.png")), "K7"));
        talia.add(new Karta(new int[]{5, 8}, new int[]{4, 3}, 6, 1, 0, new ImageIcon(this.getClass().getResource("6K.png")), "K6"));
        talia.add(new Karta(new int[]{2, 0}, new int[]{4, 2}, 7, 3, 0, new ImageIcon(this.getClass().getResource("7T.png")), "T7"));
        talia.add(new Karta(new int[]{2, 9}, new int[]{4, 1}, 12, 4, 0, new ImageIcon(this.getClass().getResource("QP.png")), "PQ"));
        talia.add(new Karta(new int[]{9, 3}, new int[]{6, 7}, 12, 2, 0, new ImageIcon(this.getClass().getResource("QC.png")), "CQ"));
        talia.add(new Karta(new int[]{1, 7}, new int[]{6, 6}, 12, 1, 0, new ImageIcon(this.getClass().getResource("QK.png")), "KQ"));
        talia.add(new Karta(new int[]{8, 7}, new int[]{5, 4}, 2, 1, 0, new ImageIcon(this.getClass().getResource("2K.png")), "K2"));
        talia.add(new Karta(new int[]{8, 8}, new int[]{5, 5}, 3, 1, 0, new ImageIcon(this.getClass().getResource("3K.png")), "K3"));
        talia.add(new Karta(new int[]{7, 8}, new int[]{4, 5}, 4, 1, 0, new ImageIcon(this.getClass().getResource("4K.png")), "K4"));
        talia.add(new Karta(new int[]{6, 8}, new int[]{4, 4}, 5, 1, 0, new ImageIcon(this.getClass().getResource("5K.png")), "K5"));
        talia.add(new Karta(new int[]{1, 0}, new int[]{3, 2}, 6, 3, 0, new ImageIcon(this.getClass().getResource("6T.png")), "T6"));
        talia.add(new Karta(new int[]{3, 9}, new int[]{3, 1}, 13, 4, 0, new ImageIcon(this.getClass().getResource("KP.png")), "PK"));
        talia.add(new Karta(new int[]{9, 4}, new int[]{5, 7}, 10, 2, 0, new ImageIcon(this.getClass().getResource("TC.png")), "CT"));
        talia.add(new Karta(new int[]{1, 6}, new int[]{5, 6}, 13, 1, 0, new ImageIcon(this.getClass().getResource("KK.png")), "KK"));
        talia.add(new Karta(new int[]{1, 5}, new int[]{4, 6}, 1, 1, 0, new ImageIcon(this.getClass().getResource("AK.png")), "KA"));
        talia.add(new Karta(new int[]{1, 4}, new int[]{3, 6}, 2, 3, 0, new ImageIcon(this.getClass().getResource("2T.png")), "T2"));
        talia.add(new Karta(new int[]{1, 3}, new int[]{3, 5}, 3, 3, 0, new ImageIcon(this.getClass().getResource("3T.png")), "T3"));
        talia.add(new Karta(new int[]{1, 2}, new int[]{3, 4}, 4, 3, 0, new ImageIcon(this.getClass().getResource("4T.png")), "T4"));
        talia.add(new Karta(new int[]{1, 1}, new int[]{3, 3}, 5, 3, 0, new ImageIcon(this.getClass().getResource("5T.png")), "T5"));
        talia.add(new Karta(new int[]{4, 9}, new int[]{2, 1}, 1, 4, 0, new ImageIcon(this.getClass().getResource("AP.png")), "PA"));
        talia.add(new Karta(new int[]{9, 5}, new int[]{4, 7}, 9, 2, 0, new ImageIcon(this.getClass().getResource("9C.png")), "C9"));
        talia.add(new Karta(new int[]{9, 6}, new int[]{3, 7}, 8, 2, 0, new ImageIcon(this.getClass().getResource("8C.png")), "C8"));
        talia.add(new Karta(new int[]{9, 7}, new int[]{2, 7}, 7, 2, 0, new ImageIcon(this.getClass().getResource("7C.png")), "C7"));
        talia.add(new Karta(new int[]{9, 8}, new int[]{2, 6}, 6, 2, 0, new ImageIcon(this.getClass().getResource("6C.png")), "C6"));
        talia.add(new Karta(new int[]{8, 9}, new int[]{2, 5}, 5, 2, 0, new ImageIcon(this.getClass().getResource("5C.png")), "C5"));
        talia.add(new Karta(new int[]{7, 9}, new int[]{2, 4}, 4, 2, 0, new ImageIcon(this.getClass().getResource("4C.png")), "C4"));
        talia.add(new Karta(new int[]{6, 9}, new int[]{2, 3}, 3, 2, 0, new ImageIcon(this.getClass().getResource("3C.png")), "C3"));
        talia.add(new Karta(new int[]{5, 9}, new int[]{2, 2}, 2, 2, 0, new ImageIcon(this.getClass().getResource("2C.png")), "C2"));
        talia.add(new Karta(new int[]{0, 1}, new int[]{8, 6}, 2, 4, 0, new ImageIcon(this.getClass().getResource("2P.png")), "P2"));
        talia.add(new Karta(new int[]{0, 2}, new int[]{8, 5}, 3, 4, 0, new ImageIcon(this.getClass().getResource("3P.png")), "P3"));
        talia.add(new Karta(new int[]{0, 3}, new int[]{8, 4}, 4, 4, 0, new ImageIcon(this.getClass().getResource("4P.png")), "P4"));
        talia.add(new Karta(new int[]{0, 4}, new int[]{8, 3}, 5, 4, 0, new ImageIcon(this.getClass().getResource("5P.png")), "P5"));
        talia.add(new Karta(new int[]{0, 5}, new int[]{8, 2}, 6, 4, 0, new ImageIcon(this.getClass().getResource("6P.png")), "P6"));
        talia.add(new Karta(new int[]{0, 6}, new int[]{8, 1}, 7, 4, 0, new ImageIcon(this.getClass().getResource("7P.png")), "P7"));
        talia.add(new Karta(new int[]{0, 7}, new int[]{7, 1}, 8, 4, 0, new ImageIcon(this.getClass().getResource("8P.png")), "P8"));
        talia.add(new Karta(new int[]{0, 8}, new int[]{6, 1}, 9, 4, 0, new ImageIcon(this.getClass().getResource("9P.png")), "P9"));
        talia.add(new Karta(new int[]{9, 1}, new int[]{7, 6}, 1, 2, 0, new ImageIcon(this.getClass().getResource("AC.png")), "CA"));
        talia.add(new Karta(new int[]{8, 0}, new int[]{7, 5}, 1, 3, 0, new ImageIcon(this.getClass().getResource("AT.png")), "TA"));
        talia.add(new Karta(new int[]{7, 0}, new int[]{7, 4}, 13, 3, 0, new ImageIcon(this.getClass().getResource("KT.png")), "TK"));
        talia.add(new Karta(new int[]{6, 0}, new int[]{7, 3}, 12, 3, 0, new ImageIcon(this.getClass().getResource("QT.png")), "TQ"));
        talia.add(new Karta(new int[]{5, 0}, new int[]{7, 2}, 10, 3, 0, new ImageIcon(this.getClass().getResource("TT.png")), "TT"));
        talia.add(new Karta(new int[]{4, 0}, new int[]{6, 2}, 9, 3, 0, new ImageIcon(this.getClass().getResource("9T.png")), "T9"));
        talia.add(new Karta(new int[]{3, 0}, new int[]{5, 2}, 8, 3, 0, new ImageIcon(this.getClass().getResource("8T.png")), "T8"));
        talia.add(new Karta(new int[]{1, 9}, new int[]{5, 1}, 10, 4, 0, new ImageIcon(this.getClass().getResource("TP.png")), "PT"));
        talia.add(new Karta(new int[]{9, 2}, new int[]{7, 7}, 13, 2, 0, new ImageIcon(this.getClass().getResource("KC.png")), "CK"));
        talia.add(new Karta(new int[]{1, 8}, new int[]{6, 5}, 10, 1, 0, new ImageIcon(this.getClass().getResource("TK.png")), "KT"));
        talia.add(new Karta(new int[]{2, 8}, new int[]{6, 4}, 9, 1, 0, new ImageIcon(this.getClass().getResource("9K.png")), "K9"));
        talia.add(new Karta(new int[]{3, 8}, new int[]{6, 3}, 8, 1, 0, new ImageIcon(this.getClass().getResource("8K.png")), "K8"));
        talia.add(new Karta(new int[]{4, 8}, new int[]{5, 3}, 7, 1, 0, new ImageIcon(this.getClass().getResource("7K.png")), "K7"));
        talia.add(new Karta(new int[]{5, 8}, new int[]{4, 3}, 6, 1, 0, new ImageIcon(this.getClass().getResource("6K.png")), "K6"));
        talia.add(new Karta(new int[]{2, 0}, new int[]{4, 2}, 7, 3, 0, new ImageIcon(this.getClass().getResource("7T.png")), "T7"));
        talia.add(new Karta(new int[]{2, 9}, new int[]{4, 1}, 12, 4, 0, new ImageIcon(this.getClass().getResource("QP.png")), "PQ"));
        talia.add(new Karta(new int[]{9, 3}, new int[]{6, 7}, 12, 2, 0, new ImageIcon(this.getClass().getResource("QC.png")), "CQ"));
        talia.add(new Karta(new int[]{1, 7}, new int[]{6, 6}, 12, 1, 0, new ImageIcon(this.getClass().getResource("QK.png")), "KQ"));
        talia.add(new Karta(new int[]{8, 7}, new int[]{5, 4}, 2, 1, 0, new ImageIcon(this.getClass().getResource("2K.png")), "K2"));
        talia.add(new Karta(new int[]{8, 8}, new int[]{5, 5}, 3, 1, 0, new ImageIcon(this.getClass().getResource("3K.png")), "K3"));
        talia.add(new Karta(new int[]{7, 8}, new int[]{4, 5}, 4, 1, 0, new ImageIcon(this.getClass().getResource("4K.png")), "K4"));
        talia.add(new Karta(new int[]{6, 8}, new int[]{4, 4}, 5, 1, 0, new ImageIcon(this.getClass().getResource("5K.png")), "K5"));
        talia.add(new Karta(new int[]{1, 0}, new int[]{3, 2}, 6, 3, 0, new ImageIcon(this.getClass().getResource("6T.png")), "T6"));
        talia.add(new Karta(new int[]{3, 9}, new int[]{3, 1}, 13, 4, 0, new ImageIcon(this.getClass().getResource("KP.png")), "PK"));
        talia.add(new Karta(new int[]{9, 4}, new int[]{5, 7}, 10, 2, 0, new ImageIcon(this.getClass().getResource("TC.png")), "CT"));
        talia.add(new Karta(new int[]{1, 6}, new int[]{5, 6}, 13, 1, 0, new ImageIcon(this.getClass().getResource("KK.png")), "KK"));
        talia.add(new Karta(new int[]{1, 5}, new int[]{4, 6}, 1, 1, 0, new ImageIcon(this.getClass().getResource("AK.png")), "KA"));
        talia.add(new Karta(new int[]{1, 4}, new int[]{3, 6}, 2, 3, 0, new ImageIcon(this.getClass().getResource("2T.png")), "T2"));
        talia.add(new Karta(new int[]{1, 3}, new int[]{3, 5}, 3, 3, 0, new ImageIcon(this.getClass().getResource("3T.png")), "T3"));
        talia.add(new Karta(new int[]{1, 2}, new int[]{3, 4}, 4, 3, 0, new ImageIcon(this.getClass().getResource("4T.png")), "T4"));
        talia.add(new Karta(new int[]{1, 1}, new int[]{3, 3}, 5, 3, 0, new ImageIcon(this.getClass().getResource("5T.png")), "T5"));
        talia.add(new Karta(new int[]{4, 9}, new int[]{2, 1}, 1, 4, 0, new ImageIcon(this.getClass().getResource("AP.png")), "PA"));
        talia.add(new Karta(new int[]{9, 5}, new int[]{4, 7}, 9, 2, 0, new ImageIcon(this.getClass().getResource("9C.png")), "C9"));
        talia.add(new Karta(new int[]{9, 6}, new int[]{3, 7}, 8, 2, 0, new ImageIcon(this.getClass().getResource("8C.png")), "C8"));
        talia.add(new Karta(new int[]{9, 7}, new int[]{2, 7}, 7, 2, 0, new ImageIcon(this.getClass().getResource("7C.png")), "C7"));
        talia.add(new Karta(new int[]{9, 8}, new int[]{2, 6}, 6, 2, 0, new ImageIcon(this.getClass().getResource("6C.png")), "C6"));
        talia.add(new Karta(new int[]{8, 9}, new int[]{2, 5}, 5, 2, 0, new ImageIcon(this.getClass().getResource("5C.png")), "C5"));
        talia.add(new Karta(new int[]{7, 9}, new int[]{2, 4}, 4, 2, 0, new ImageIcon(this.getClass().getResource("4C.png")), "C4"));
        talia.add(new Karta(new int[]{6, 9}, new int[]{2, 3}, 3, 2, 0, new ImageIcon(this.getClass().getResource("3C.png")), "C3"));
        talia.add(new Karta(new int[]{5, 9}, new int[]{2, 2}, 2, 2, 0, new ImageIcon(this.getClass().getResource("2C.png")), "C2")); talia.add(new Karta(new int[]{0, 0}, new int[]{0, 0}, 11, 2, 1, new ImageIcon(this.getClass().getResource("JC.png")),"CJ"));
        talia.add(new Karta(new int[]{0, 0}, new int[]{0, 0}, 11, 1, 2, new ImageIcon(this.getClass().getResource("JK.png")),"JK"));
        talia.add(new Karta(new int[]{0, 0}, new int[]{0, 0}, 11, 4, 2, new ImageIcon(this.getClass().getResource("JP.png")),"PJ"));
        talia.add(new Karta(new int[]{0, 0}, new int[]{0, 0}, 11, 3, 1, new ImageIcon(this.getClass().getResource("JT.png")),"TJ"));
        talia.add(new Karta(new int[]{0, 0}, new int[]{0, 0}, 11, 2, 1, new ImageIcon(this.getClass().getResource("JC.png")),"CJ"));
        talia.add(new Karta(new int[]{0, 0}, new int[]{0, 0}, 11, 1, 2, new ImageIcon(this.getClass().getResource("JK.png")),"JK"));
        talia.add(new Karta(new int[]{0, 0}, new int[]{0, 0}, 11, 4, 2, new ImageIcon(this.getClass().getResource("JP.png")),"PJ"));
        talia.add(new Karta(new int[]{0, 0}, new int[]{0, 0}, 11, 3, 1, new ImageIcon(this.getClass().getResource("JT.png")),"TJ"));
        }

    private void zagraj(Karta karta, int zagrane) {
        if (kres == false) {
            gracze.get(biezacy_gracz).getReka().remove(zagrane);
            if (talia.size() > 0) {
                gracze.get(biezacy_gracz).getReka().add(talia.get(talia.size() - 1));
                talia.remove(talia.size() - 1);
            }
            aktywna.setIcon(new ImageIcon(karta.symbol.getImage().getScaledInstance(86, 120, java.awt.Image.SCALE_SMOOTH)));
            switch (karta.specjal) {
                case Brak:
                    
                    if (tablica[karta.kordy[0][0]][karta.kordy[0][1]] == 0
                            || tablica[karta.kordy[1][0]][karta.kordy[1][1]] == 0) {
                        akcja = 3;
                        zagrana_karta = karta;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "To pole jest już zagrane. Zagraj inną kartę");
                    }
                    break;
                case Dzikun:
                    akcja = 2;
                    JOptionPane.showMessageDialog(rootPane, "Ten walet ma zabójczy wzrok.\nMoże zająć dowolne wolne miejsce\n"
                            + "Kilknij na tablicy kartę, gdzie chcesz dołożyc żeton");
                    break;
                case rozbojnik:
                    akcja = 1;
                    JOptionPane.showMessageDialog(rootPane, "Ten walet ma wzrok snajpera\nMoże skasować dowolny niewchodzący w sekwencje żeton\n"
                            + "Kilknij na tablicy kartę, gdzie chcesz usunąć żeton rywala");
                    break;
            }
        }
    }

    private void wykonaj_akcje(int poziom, int pion, Object pole) {
        System.out.println(poziom + " "+pion);
        System.out.println(zagrana_karta.getKordy()[0][0] + " "+zagrana_karta.getKordy()[0][1]);
        System.out.println(zagrana_karta.getKordy()[1][0] + " "+zagrana_karta.getKordy()[1][1]);
        switch (akcja) {
            case 3:
                if (tablica[poziom][pion] == 0&&(
                        (zagrana_karta.getKordy()[0][0]==poziom&&zagrana_karta.getKordy()[0][1]==pion)
                        ||(zagrana_karta.getKordy()[1][0]==poziom&&zagrana_karta.getKordy()[1][1]==pion))) {
                    akcja = 0;
                    int[] cel = new int[]{poziom, pion};
                    gracze.get(biezacy_gracz).zajmij_pole(cel, tablica);
                    tablica[poziom][pion] = gracze.get(biezacy_gracz).getDruzyna();
                    styl();
                    int sekewncje = 0;
                    sekewncje = gracze.get(biezacy_gracz).sekwencja(tablica);
                    if (sekewncje >= wygrana) {
                        JOptionPane.showMessageDialog(rootPane, "Koniec gry\n"
                                + "wygrała rużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        kres = true;
                    } else {
                        biezacy_gracz++;
                        if (biezacy_gracz == gracze.size()) {
                            biezacy_gracz = 0;
                        }
                        Reka1.setIcon(null);
                        Reka2.setIcon(null);
                        Reka3.setIcon(null);
                        Reka4.setIcon(null);
                        Reka5.setIcon(null);
                        Reka6.setIcon(null);
                        Reka7.setIcon(null);
                        aktywna.setIcon(null);
                        JOptionPane.showMessageDialog(rootPane, "Kolej gracza " + gracze.get(biezacy_gracz).getIndeks() + "\n"
                                + "Drużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        pokaz_karty(biezacy_gracz);
                    }

                }
                break;
            case 2:
                if (tablica[poziom][pion] == 0) {
                    akcja = 0;
                    int[] cel = new int[]{poziom, pion};
                    gracze.get(biezacy_gracz).zajmij_pole(cel, tablica);
                    tablica[poziom][pion] = gracze.get(biezacy_gracz).getDruzyna();
                    styl();
                    int sekewncje = 0;
                    sekewncje = gracze.get(biezacy_gracz).sekwencja(tablica);
                    if (sekewncje >= wygrana) {
                        JOptionPane.showMessageDialog(rootPane, "Koniec gry\n"
                                + "wygrała rużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        kres = true;
                    } else {
                        biezacy_gracz++;
                        if (biezacy_gracz == gracze.size()) {
                            biezacy_gracz = 0;
                        }
                        Reka1.setIcon(null);
                        Reka2.setIcon(null);
                        Reka3.setIcon(null);
                        Reka4.setIcon(null);
                        Reka5.setIcon(null);
                        Reka6.setIcon(null);
                        Reka7.setIcon(null);
                        JOptionPane.showMessageDialog(rootPane, "Kolej gracza " + gracze.get(biezacy_gracz).getIndeks() + "\n"
                                + "Drużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        pokaz_karty(biezacy_gracz);
                    }

                }
                break;
            case 1:
                if (tablica[poziom][pion] != gracze.get(biezacy_gracz).getDruzyna() && tablica[poziom][pion] != 0) {
                    boolean element = false;
                    for (Gracz g : gracze) {
                        int[] cel = new int[]{poziom, pion};
                        if (g.element_sekwencji(cel) == true) {
                            element = true;
                            break;
                        }
                    }
                    if (element == false) {
                        akcja = 0;

                        for (Gracz g : gracze) {
                            if (g.getDruzyna() == tablica[poziom][pion]) {
                                g.ofiara_rozbojnika(new int[]{poziom, pion});
                            }
                        }
                        tablica[poziom][pion] = 0;
                        biezacy_gracz++;
                        if (biezacy_gracz == gracze.size()) {
                            biezacy_gracz = 0;
                        }
                        Reka1.setIcon(null);
                        Reka2.setIcon(null);
                        Reka3.setIcon(null);
                        Reka4.setIcon(null);
                        Reka5.setIcon(null);
                        Reka6.setIcon(null);
                        Reka7.setIcon(null);
                        styl();

                        JOptionPane.showMessageDialog(rootPane, "Kolej gracza " + gracze.get(biezacy_gracz).getIndeks() + "\n"
                                + "Drużyna numer " + gracze.get(biezacy_gracz).getDruzyna());
                        pokaz_karty(biezacy_gracz);

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Nie można rozbijać gotowej sekwencji. Skasuj coś innego");
                    }
                }
                break;
        }
    }

    private void styl() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if(!((i==0&&j==0)||(i==0&&j==9)||(i==9&&j==0)||(i==9&&j==9))){
                switch (tablica[i][j]) {
                    case 0:
                        dopasuj_przycisk(i, j).setBorder(null);
                        break;
                    case 1:
                        dopasuj_przycisk(i, j).setBorder(new LineBorder(gracze.get(0).getKolor(), 6));
                        break;
                    case 2:
                        dopasuj_przycisk(i, j).setBorder(new LineBorder(gracze.get(1).getKolor(), 6));
                        break;
                    case 3:
                        dopasuj_przycisk(i, j).setBorder(new LineBorder(gracze.get(2).getKolor(), 6));
                        break;
                }
            }
            }
        }
    }

    private JButton dopasuj_przycisk(int i, int j) {
        switch (i) {
            case 0:
                switch (j) {
                    case 1:
                        return P21;
                    case 2:
                        return P31;
                    case 3:
                        return P41;
                    case 4:
                        return P51;
                    case 5:
                        return P61;
                    case 6:
                        return P71;
                    case 7:
                        return P81;
                    case 8:
                        return P91;
                }
            case 1:
                switch (j) {
                    case 0:
                        return T61;
                    case 1:
                        return T51;
                    case 2:
                        return T41;
                    case 3:
                        return T31;
                    case 4:
                        return T21;
                    case 5:
                        return KA1;
                    case 6:
                        return KK1;
                    case 7:
                        return KQ1;
                    case 8:
                        return KT1;
                    case 9:
                        return PT1;
                }
            case 2:
                switch (j) {
                    case 0:
                        return T71;
                    case 1:
                        return PA2;
                    case 2:
                        return C22;
                    case 3:
                        return C32;
                    case 4:
                        return C42;
                    case 5:
                        return C52;
                    case 6:
                        return C62;
                    case 7:
                        return C72;
                    case 8:
                        return K91;
                    case 9:
                        return PQ1;
                }
            case 3:
                switch (j) {
                    case 0:
                        return T81;
                    case 1:
                        return PK2;
                    case 2:
                        return T62;
                    case 3:
                        return T52;
                    case 4:
                        return T42;
                    case 5:
                        return T32;
                    case 6:
                        return T22;
                    case 7:
                        return C82;
                    case 8:
                        return K81;
                    case 9:
                        return PK1;
                }
            case 4:
                switch (j) {
                    case 0:
                        return T91;
                    case 1:
                        return PQ2;
                    case 2:
                        return T72;
                    case 3:
                        return K62;
                    case 4:
                        return K52;
                    case 5:
                        return K42;
                    case 6:
                        return KA2;
                    case 7:
                        return C92;
                    case 8:
                        return K71;
                    case 9:
                        return PA1;
                }
            case 5:
                switch (j) {
                    case 0:
                        return TT1;
                    case 1:
                        return PT2;
                    case 2:
                        return T82;
                    case 3:
                        return K72;
                    case 4:
                        return K22;
                    case 5:
                        return K32;
                    case 6:
                        return KK2;
                    case 7:
                        return CT2;
                    case 8:
                        return K61;
                    case 9:
                        return C21;
                }
            case 6:
                switch (j) {
                    case 0:
                        return TQ1;
                    case 1:
                        return P92;
                    case 2:
                        return T92;
                    case 3:
                        return K82;
                    case 4:
                        return K92;
                    case 5:
                        return KT2;
                    case 6:
                        return KQ2;
                    case 7:
                        return CQ2;
                    case 8:
                        return K51;
                    case 9:
                        return C31;
                }
            case 7:
                switch (j) {
                    case 0:
                        return TK1;
                    case 1:
                        return P82;
                    case 2:
                        return TT2;
                    case 3:
                        return TQ2;
                    case 4:
                        return TK2;
                    case 5:
                        return TA2;
                    case 6:
                        return CA2;
                    case 7:
                        return CK2;
                    case 8:
                        return K41;
                    case 9:
                        return C41;
                }
            case 8:
                switch (j) {
                    case 0:
                        return TA1;
                    case 1:
                        return P72;
                    case 2:
                        return P62;
                    case 3:
                        return P52;
                    case 4:
                        return P42;
                    case 5:
                        return P32;
                    case 6:
                        return P22;
                    case 7:
                        return K21;
                    case 8:
                        return K31;
                    case 9:
                        return C51;
                }
            case 9:
                switch (j) {
                    case 1:
                        return CA1;
                    case 2:
                        return CK1;
                    case 3:
                        return CQ1;
                    case 4:
                        return CT1;
                    case 5:
                        return C91;
                    case 6:
                        return C81;
                    case 7:
                        return C71;
                    case 8:
                        return C61;
                }
        }
        return null;
    }
}
