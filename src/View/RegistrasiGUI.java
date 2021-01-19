package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
import java.util.Date;
public class RegistrasiGUI {
    JFrame Reg = new  JFrame();
    JLabel registrasi;
    JTextField textnama,textpass,texttempatlahir,texttgllahir,textkelamin,textagama,textstatus,textpekerjaan;
    JLabel labelnama,labelpass,labeltempatlahir,labeltgllahir,labelkelamin,labelagama,labelstatus,labelpekerjaan;
    JButton kembali,daftar;
    
    public RegistrasiGUI(){
        Reg.setSize(700,650);
        Reg.setLayout(null);
        Reg.getContentPane().setBackground(Color.cyan);
        
        registrasi = new JLabel("REGISTRASI");
        registrasi.setBounds(180,30,500,70);
        registrasi.setFont(new Font("Consolas",Font.CENTER_BASELINE,50));
        Reg.add(registrasi);
        
        labelnama = new JLabel("Nama");
        labelnama.setBounds(400, 120, 200, 30);
        Reg.add(labelnama);
        
        textnama = new JTextField();
        textnama.setBounds(400, 150, 200, 30);
        Reg.add(textnama);
        
        labelpass = new JLabel("Password");
        labelpass.setBounds(400, 180, 100, 30);
        Reg.add(labelpass);
        
        textpass = new JPasswordField();
        textpass.setBounds(400, 210, 200, 30);
        Reg.add(textpass);
    
        labeltempatlahir = new JLabel("Tempatlahir");
        labeltempatlahir.setBounds(400, 240, 200, 30);
        Reg.add(labeltempatlahir); 
        
        texttempatlahir = new JTextField();
        texttempatlahir.setBounds(400, 270, 200, 30);
        Reg.add(texttempatlahir);
        
        labeltgllahir = new JLabel("Tanggal Lahir (dd/mm/yyyy)");
        labeltgllahir.setBounds(400, 300, 200, 30);
        Reg.add(labeltgllahir);
    
        texttgllahir = new JTextField();
        texttgllahir.setBounds(400, 330, 200, 30);
        Reg.add(texttgllahir);    
    
        labelkelamin = new JLabel("Kelamin");
        labelkelamin.setBounds(400, 360, 200, 30);
        Reg.add(labelkelamin); 
        
        textkelamin = new JTextField();
        textkelamin.setBounds(400, 390, 200, 30);
        Reg.add(textkelamin);    
    
        labelagama = new JLabel("Agama");
        labelagama.setBounds(400, 410, 200, 30);
        Reg.add(labelagama); 
        
        textagama = new JTextField();
        textagama.setBounds(400, 440, 200, 30);
        Reg.add(textagama);    
    
        labelstatus = new JLabel("status");
        labelstatus.setBounds(400, 470, 200, 30);
        Reg.add(labelstatus); 
        
        textstatus = new JTextField();
        textstatus.setBounds(400, 500, 200, 30);
        Reg.add(textstatus);    
    
        labelpekerjaan = new JLabel("pekerjaan");
        labelpekerjaan.setBounds(400, 530, 200, 30);
        Reg.add(labelpekerjaan); 
        
        textpekerjaan = new JTextField();
        textpekerjaan.setBounds(400, 560, 200, 30);
        Reg.add(textpekerjaan);    

        daftar = new JButton("Input");
        daftar.setBounds(200, 535, 100, 40);
        daftar.setBackground(Color.GREEN);
        Reg.add(daftar);
        
        kembali = new JButton("Kembali");
        kembali.setBounds(30, 535, 100, 40);
        kembali.setBackground(Color.red);
        Reg.add(kembali);
        Reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Reg.setVisible(true);
        Reg.setLocationRelativeTo(null);        
    
        daftar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String nama = textnama.getText();
                    String tempatlahir = texttempatlahir.getText(); 
                    Date tglLahir = new Date(texttgllahir.getText());
                    String kelamin = textkelamin.getText();
                    String agama = textagama.getText();
                    String status = textstatus.getText();
                    String pekerjaan = textpekerjaan.getText();
                    Allobjctrl.penduduk.insertPenduduk(nama, agama, tempatlahir, tglLahir, kelamin, agama, status, pekerjaan);
                    JOptionPane.showMessageDialog(null,"Registrasi Berhasil","INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Format pengisian salah","INFORMATION", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        kembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Reg.dispose();
                AdminGUI admin = new AdminGUI();
                }
        });
    }
    void kosong(){
        textnama.setText(null);
        textpass.setText(null);
        texttempatlahir.setText(null);
        texttgllahir.setText(null);
        textkelamin.setText(null);
        textagama.setText(null);
        textstatus.setText(null);
        textpekerjaan.setText(null);
    }
    
}