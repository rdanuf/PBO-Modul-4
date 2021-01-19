package View;

import Controller.AllObjectModel;
import Controller.PendudukController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;
public class AdminGUI {
    private static PendudukController penduduk = new PendudukController();
    JFrame Admin = new JFrame();
    JTable tabelpenduduk = new JTable();
    JScrollPane scrolladmin = new JScrollPane(tabelpenduduk);
    JButton kembali,verif,regis,view,update,delete;
    JLabel admin,namalabel,passlabel;
    JTextField namatext,passtext;
    public AdminGUI(){
        Admin.setSize(650,500);
        Admin.setLayout(null);
        Admin.getContentPane().setBackground(Color.MAGENTA);
        admin = new JLabel("Admin");
        admin.setBounds(250,30,200,30);
        admin.setFont(new Font("consolas",Font.BOLD,40));
        Admin.add(admin);
        
        regis = new JButton("Input Data");
        regis.setBounds(250,100,150,40);
        regis.setBackground(Color.WHITE);
        Admin.add(regis);
                
        view = new JButton("Lihat Data");
        view.setBounds(250,150,150,40);
        view.setBackground(Color.WHITE);
        Admin.add(view);

        update = new JButton("Update Data");
        update.setBounds(250,200,150,40);
        update.setBackground(Color.WHITE);
        Admin.add(update);
        
        delete = new JButton("Delete Data");
        delete.setBounds(250,250,150,40);
        delete.setBackground(Color.WHITE);
        Admin.add(delete);        
        
        namalabel = new JLabel("nama");
        namalabel.setBounds(50, 320,100,30);
        Admin.add(namalabel);
        namatext = new JTextField();
        namatext.setBounds(50, 350, 100, 30);
        Admin.add(namatext);
       
        passlabel = new JLabel("Password");
        passlabel.setBounds(200, 320, 100, 30);
        Admin.add(passlabel);
        passtext = new JTextField();
        passtext.setBounds(200, 350, 100, 30);
        Admin.add(passtext);
        
        verif = new JButton("verif");
        verif.setBounds(350, 350, 100, 30);
        verif.setBackground(Color.GREEN);
        Admin.add(verif);
        
        kembali = new JButton("kembali");
        kembali.setBounds(50, 400, 100, 30);
        kembali.setBackground(Color.red);
        Admin.add(kembali);
        
        Admin.setLocationRelativeTo(null);
        Admin.setVisible(true);
        Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
        kembali.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                Admin.dispose();
                GUI men = new GUI();    
            }
        });
        
        regis.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                RegistrasiGUI regis = new RegistrasiGUI(); 
                Admin.dispose();
            }
        });
        
        view.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                ViewGUI view = new ViewGUI(); 
                Admin.dispose();
            }
        });
        
        update.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                UpdateGUI update = new UpdateGUI(); 
                Admin.dispose();
            }
        });
        
        delete.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                DeleteGUI delete = new DeleteGUI(); 
                Admin.dispose();
            }
        });        
}
}