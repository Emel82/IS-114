package oppgave;

import javax.swing.JOptionPane;
import java.awt.*;

public class initialer extends javax.swing.JFrame {
    private static Component frame;

    public static void main(String[] args){
        System.out.println(
           "0000     00   00         00\n"+
           "00  00   00  00        00  00\n"+
           "00   00  00 00        00    00\n"+
           "00   00  0000        0000000000\n"+
           "00   00  00 00      00        00\n"+
           "00  00   00  00    00          00\n"+
           "0000    00    00  00            00"
        );
        JOptionPane.showMessageDialog(frame,
                "Oblig 1 er levert 8.september 2022");
    }


}
