package View;

import Entity.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.*;

public class PendudukGUI {
    JFrame Penduduk = new JFrame();
    JButton kembali,checkdata;
    JTextArea area = new JTextArea();
    JLabel datapenduduk;
    int cek = Allobjctrl.penduduk.cekData(Allobjctrl.penduduk.pendudukEntity().getNamapen());
    public PendudukGUI(){
        Penduduk.setSize(720,600);
        Penduduk.setLayout(null);
        Penduduk.getContentPane().setBackground(Color.DARK_GRAY);
        datapenduduk = new JLabel("Data Penduduk");
        datapenduduk.setFont(new Font("Times New Roman",Font.BOLD,30));
        datapenduduk.setBounds(90, 30, 200, 30);
        Penduduk.add(datapenduduk);
        kembali = new JButton("Back");
        kembali.setBounds(30,500,100,30);
        kembali.setBackground(Color.red);
        Penduduk.add(kembali);
        Penduduk.setVisible(true);
        Penduduk.setLocationRelativeTo(null);
        Penduduk.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
        String datapraktikan(){
        int cek = Allobjctrl.penduduk.cek(Allobjctrl.penduduk.pendudukEntity().getNamapen());
        String cekverif;
        if(Allobjctrl.penduduk.cekData(cek).IsVerified()==false){
            cekverif = "belum diverifikasi";
        }else{
            cekverif = "sudah diverifikasi";
        }
        String text = "Npm = "+Allobjctrl.penduduk.showDaftarPrak(cek).getPraktikan().getNpm()+"\n"
                +"Nama = "+Allobjctrl.penduduk.showDaftarPrak(cek).getPraktikan().getNama()+"\n"
                +"No Telp = "+Allobjctrl.penduduk.showDaftarPrak(cek).getPraktikan().getNo_telp()+"\n"
                +"Tanggal Lahir = "+new SimpleDateFormat("dd-MM-yyyy").format(Allobjctrl.Praktikan.showDaftarPrak(cek).getPraktikan().getTglLahir())+"\n"
                +"Verifikasi = "+cekverif+"\n";
        return text;
    }
}
