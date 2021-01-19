package View;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;

public class DeleteGUI {
    JLabel hapusdata,nama;
    JFrame delete = new JFrame();
    JButton hapusbutton,kembali;
    JTextField textnamapen;
    
    public DeleteGUI(){
        delete.setSize(720, 600);
        delete.setLayout(null);
        delete.getContentPane().setBackground(Color.cyan);
        
        hapusdata = new JLabel("Hapus Data Penduduk");
        hapusdata.setFont(new Font("Consolas",Font.BOLD, 40));
        hapusdata.setBounds(170,135,600,60);
        delete.add(hapusdata);
        
        nama = new JLabel("NAMA");
        nama.setBounds(323,197,70,50);
        delete.add(nama);
        
        textnamapen = new JTextField();
        textnamapen.setBounds(248,240,200,40);
        delete.add(textnamapen);
        
        hapusbutton = new JButton("HAPUS");
        hapusbutton.setBounds(291,310,120,40);
        hapusbutton.setBackground(Color.ORANGE);
       delete.add(hapusbutton);
        
        kembali = new JButton("KEMBALI");
        kembali.setBounds(291,360,120,40);
        kembali.setBackground(Color.ORANGE);
        delete.add(kembali);
        
        delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        delete. setVisible(true);
        delete.setLocationRelativeTo(null);
        
        hapusbutton.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                
                Allobjctrl.penduduk.delete(namapen);
                JOptionPane.showMessageDialog(null,"DATA CUSTOMER BERHASIL DIHAPUS","INFORMATION",JOptionPane.INFORMATION_MESSAGE);
                kosong();
            }
        });
        kembali.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent ae){
 
                delete.dispose();
                AdminGUI admin = new AdminGUI();
            }
        });
    }
    void kosong(){
        textnamapen.setText(null);
    }
}
