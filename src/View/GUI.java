package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUI {
    JFrame TampilanAwal = new JFrame();
    JLabel login,daftar,top;
    JRadioButton radioadmin,radiopenduduk;
    JTextField textnamalogin,textnamadaftar,textpasslogin,texttempatlahir,texttgllahir,textkelamin,textagama,textstatus,textpekerjaan;
    JLabel labelnamalogin,labelnamadaftar,labelpasslogin,labelpassdaftar,labeltempatlahir,labeltgllahir,labelkelamin,labelagama,labelstatus,labelpekerjaan;
    JButton check,reg;
    JPasswordField passwordlogin,passworddaftar;
    private boolean ceklogin = false;
    public GUI(){
        TampilanAwal.setSize(800, 650);
        TampilanAwal.setLayout(null);
        TampilanAwal.getContentPane().setBackground(Color.CYAN);
        
        top = new JLabel(" Sistem Pelayanan Data Penduduk ");
        top.setBounds(50,10,800,50);
        top.setFont(new Font("Consolas",Font.BOLD,40));
        TampilanAwal.add(top);
        
        login = new JLabel("Login");
        login.setBounds(100, 50, 100, 100);
        login.setFont(new Font("Consolas",Font.BOLD,30));
        TampilanAwal.add(login);
        
        radioadmin = new JRadioButton("Admin");
        radioadmin.setBounds(30, 150, 100, 30);
        radioadmin.setBackground(Color.red);
        TampilanAwal.add(radioadmin);
        
        radiopenduduk = new JRadioButton("Penduduk");
        radiopenduduk.setBounds(160, 150, 100, 30);
        radiopenduduk.setBackground(Color.red);
        TampilanAwal.add(radiopenduduk);
        
        labelnamalogin = new JLabel("Nama");
        labelnamalogin.setBounds(30, 180, 200, 30);
        TampilanAwal.add(labelnamalogin);
        
        textnamalogin = new JTextField();
        textnamalogin.setBounds(30, 210, 200, 30);
        TampilanAwal.add(textnamalogin);
        
        labelpasslogin = new JLabel("Password");
        labelpasslogin.setBounds(30, 240, 100, 30);
        TampilanAwal.add(labelpasslogin);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(30, 270, 200, 30);
        TampilanAwal.add(passwordlogin);

        check = new JButton("check");
        check.setBounds(90, 320, 100, 40);
        check.setBackground(Color.GREEN);
        TampilanAwal.add(check);
        
        daftar = new JLabel("Daftar");
        daftar.setFont(new Font("Consolas",Font.BOLD,30));
        daftar.setBounds(440, 50, 150, 100);
        TampilanAwal.add(daftar);  
        
        labelnamadaftar = new JLabel("Nama");
        labelnamadaftar.setBounds(400, 160, 100, 30);
        TampilanAwal.add(labelnamadaftar);
        
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(400, 185, 200, 30);
        TampilanAwal.add(textnamadaftar);

        labelpassdaftar = new JLabel("Password");
        labelpassdaftar.setBounds(400, 210, 100, 30);
        TampilanAwal.add(labelpassdaftar);
        
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(400, 235, 200, 30);
        TampilanAwal.add(passworddaftar);
    
        labeltempatlahir = new JLabel("Tempatlahir");
        labeltempatlahir.setBounds(400, 260, 200, 30);
        TampilanAwal.add(labeltempatlahir); 
        
        texttempatlahir = new JTextField();
        texttempatlahir.setBounds(400, 285, 200, 30);
        TampilanAwal.add(texttempatlahir);
        
        labeltgllahir = new JLabel("Tanggal Lahir (dd/mm/yyyy)");
        labeltgllahir.setBounds(400, 310, 200, 30);
        TampilanAwal.add(labeltgllahir);
    
        texttgllahir = new JTextField();
        texttgllahir.setBounds(400, 335, 200, 30);
        TampilanAwal.add(texttgllahir);    
    
        labelkelamin = new JLabel("Kelamin");
        labelkelamin.setBounds(400, 360, 200, 30);
        TampilanAwal.add(labelkelamin); 
        
        textkelamin = new JTextField();
        textkelamin.setBounds(400, 385, 200, 30);
        TampilanAwal.add(textkelamin);    
    
        labelagama = new JLabel("Agama");
        labelagama.setBounds(400, 410, 200, 30);
        TampilanAwal.add(labelagama); 
        
        textagama = new JTextField();
        textagama.setBounds(400, 435, 200, 30);
        TampilanAwal.add(textagama);    
    
        labelstatus = new JLabel("status");
        labelstatus.setBounds(400, 460, 200, 30);
        TampilanAwal.add(labelstatus); 
        
        textstatus = new JTextField();
        textstatus.setBounds(400, 485, 200, 30);
        TampilanAwal.add(textstatus);    
    
        labelpekerjaan = new JLabel("pekerjaan");
        labelpekerjaan.setBounds(400, 510, 200, 30);
        TampilanAwal.add(labelpekerjaan); 
        
        textpekerjaan = new JTextField();
        textpekerjaan.setBounds(400, 535, 200, 30);
        TampilanAwal.add(textpekerjaan);    
        reg = new JButton("Daftar");
        reg.setBounds(650, 535, 100, 40);
        reg.setBackground(Color.GREEN); 
        TampilanAwal.add(reg);
        TampilanAwal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TampilanAwal.setVisible(true);
        TampilanAwal.setLocationRelativeTo(null);
        
        radioadmin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(radioadmin.isSelected()){
                    radiopenduduk.setSelected(false);
                    ceklogin=true;
                }
            }
        });
        radiopenduduk.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(radiopenduduk.isSelected()){
                    radioadmin.setSelected(false);
                    ceklogin=false;
                }
            }
        });
        check.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                if(ceklogin==true){
                    try{
                        Allobjctrl.admin.dataAdmin();
                        Allobjctrl.admin.login(textnamalogin.getText(), passwordlogin.getText());
                        String nama = Allobjctrl.admin.adminEntity().getNama();
                        JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                        AdminGUI Admin = new AdminGUI();
                        TampilanAwal.dispose();
                    }catch(Exception exception){
                        JOptionPane.showMessageDialog(null, "NPM atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                    }
                        kosong();
                }else{
                    try{
                       Allobjctrl.penduduk.login(textnamalogin.getText(),passwordlogin.getText());
                       String nama = Allobjctrl.penduduk.pendudukEntity().getNamapen();
                       JOptionPane.showMessageDialog(null, "Selamat datang "+nama,"information", JOptionPane.INFORMATION_MESSAGE);
                       PendudukGUI penduduk = new PendudukGUI();
                       TampilanAwal.dispose();
                    }catch(Exception eception){
                        JOptionPane.showMessageDialog(null, "nama atau Password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                       kosong();
                    }
                }
            }
        });
        reg.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                try{
                    String nama = textnamadaftar.getText();
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
    }
    void kosong(){
        textnamadaftar.setText(null);
        passworddaftar.setText(null);
        textnamalogin.setText(null);
        passwordlogin.setText(null);
        texttempatlahir.setText(null);
        texttgllahir.setText(null);
        textkelamin.setText(null);
        textagama.setText(null);
        textstatus.setText(null);
        textpekerjaan.setText(null);
    }
}
