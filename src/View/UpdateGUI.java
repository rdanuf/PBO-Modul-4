package View;

import Entity.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
public class UpdateGUI {
    JButton tombolacc,kembali;
    JFrame upgui = new JFrame();
    JTextArea area = new JTextArea();
    JLabel update,namaupdate,passupdate,tempatlahirupdate,tgllahirupdate,kelaminupadate,agamaupdate,statusupdate,pekerjaanupdate;
    JTextField textnamaupdate,textpassupdate,texttempatlahirupdate,texttgllahirupdate,textkelaminupadate,textagamaupdate,textstatusupdate,textpekerjaanupdate;
    
    public UpdateGUI(){
        
        upgui.setSize(800,600);
        upgui.setLayout(null);
        upgui.getContentPane().setBackground(Color.CYAN);
        
        update = new JLabel("UPDATE DATA PENDUDUK");
        update.setFont(new Font("consolas",Font.BOLD,40));
        update.setBounds(160,100,400,80);
        upgui.add(update);
        
        namaupdate = new JLabel("Nama");
        namaupdate.setBounds(300,180,100,30);
        upgui.add(namaupdate);
        
        textnamaupdate = new JTextField();
        textnamaupdate.setBounds(250,210,200,30);
        upgui.add(textnamaupdate);
        
        passupdate = new JLabel("Pass");
        passupdate.setBounds(300,240,100,30);
        upgui.add(passupdate);
        
        textpassupdate = new JTextField();
        textpassupdate.setBounds(250,270,200,30);
        upgui.add(textpassupdate);
        
        tempatlahirupdate = new JLabel("Tempat Lahir");
        tempatlahirupdate.setBounds(300,300,100,30);
        upgui.add(tempatlahirupdate);
        
        texttempatlahirupdate = new JTextField();
        texttempatlahirupdate.setBounds(250,330,200,30);
        upgui.add(texttempatlahirupdate);    
        
        tgllahirupdate = new JLabel("Tanggal Lahir (mm/dd/yyyy)");
        tgllahirupdate.setBounds(300,300,100,30);
        upgui.add(tgllahirupdate);
        
        texttgllahirupdate = new JTextField();
        texttgllahirupdate.setBounds(250,330,200,30);
        upgui.add(texttgllahirupdate);         
        
        kelaminupadate = new JLabel("Kelamin (L/P)");
        kelaminupadate.setBounds(300,360,100,30);
        upgui.add(kelaminupadate);
        
        textkelaminupadate = new JTextField();
        textkelaminupadate.setBounds(250,390,200,30);
        upgui.add(textkelaminupadate);    
        
        agamaupdate = new JLabel("AGAMA");
        agamaupdate.setBounds(300,420,100,30);
        upgui.add(agamaupdate);
        
        textagamaupdate = new JTextField();
        textagamaupdate.setBounds(250,450,200,30);
        upgui.add(textagamaupdate);  
        
        statusupdate = new JLabel("Status");
        statusupdate.setBounds(300,480,100,30);
        upgui.add(statusupdate);
        
        textstatusupdate = new JTextField();
        textstatusupdate.setBounds(250,510,200,30);
        upgui.add(textstatusupdate); 
        
        pekerjaanupdate = new JLabel("PEKERJAAN");
        pekerjaanupdate.setBounds(300,540,100,30);
        upgui.add(pekerjaanupdate);
        
        textpekerjaanupdate = new JTextField();
        textpekerjaanupdate.setBounds(250,570,200,30);
        upgui.add(textpekerjaanupdate);       
        
        tombolacc = new JButton("KONFIRMASI");
        tombolacc.setBounds(150,600,120,40);
        tombolacc.setBackground(Color.ORANGE);
        upgui.add(tombolacc);
        
        kembali = new JButton("KEMBALI");
        kembali.setBounds(50,600,120,40);
        kembali.setBackground(Color.ORANGE);
        upgui.add(kembali);
        upgui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        upgui. setVisible(true);
        upgui.setLocationRelativeTo(null);

        kembali.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent ae){
                upgui.dispose();
                AdminGUI admin = new AdminGUI();
            }
        });
    }
}
