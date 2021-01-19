package View;
import Entity.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.Font;
public class ViewGUI {
    JButton kembali,tampilkan;
    JFrame view = new JFrame();
    JTextArea area = new JTextArea();
    JLabel datapenduduk;
    int index;
    int cek = Allobjctrl.penduduk.cekData(Allobjctrl.penduduk.pendudukEntity().getNamapen());
    
    public ViewGUI(){
        view.setSize(800,650);
        view.setLayout(null);
        view.getContentPane().setBackground(Color.CYAN);
        
        datapenduduk = new JLabel("Data Penduduk");
        datapenduduk.setBounds(180,70,500,70);
        datapenduduk.setFont(new Font("Consolas",Font.BOLD,50));
        datapenduduk.setForeground(Color.WHITE);
        view.add(datapenduduk);
        
        area.setBounds(180,150,350,200);
        area.setFont(new Font("Consolas",Font.BOLD,10));
        view.add(area);
        
        tampilkan = new JButton("TAMPILKAN");
        tampilkan.setBounds(285,375,130,40);
        tampilkan.setBackground(Color.LIGHT_GRAY);
        view.add(tampilkan);
        
        kembali = new JButton("kembali");
        kembali.setBounds(285,375,130,40);
        kembali.setBackground(Color.red);
        view.add(kembali);
        
        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view. setVisible(true);
        view.setLocationRelativeTo(null);
    
        kembali.addActionListener(new ActionListener(){
            @Override
        public void actionPerformed(ActionEvent ae){
                view.dispose();
                AdminGUI admin = new AdminGUI();
            }
        });
    
        tampilkan.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent ae){
                area.setText(dataPenduduk());
            }
        });
    }
    public String dataPenduduk(){
        String text = "Nama :"+Allobjctrl.penduduk.pendudukEntity().getNamapen()+
                "\nTempat lahir :"+Allobjctrl.penduduk.pendudukEntity().getTempatlahir()+
                "\nTanggal Lahir :"+Allobjctrl.penduduk.pendudukEntity().getTglLahir()+
                "\nKelamin :"+Allobjctrl.penduduk.pendudukEntity().getKelamin()+
                "\nAgama :"+Allobjctrl.penduduk.pendudukEntity().getAgama()+
                "\nStatus :"+Allobjctrl.penduduk.pendudukEntity().getStatus()+
                "\nPekerjaan :"+Allobjctrl.penduduk.pendudukEntity().getPekerjaan();
                
                
        return text;        
    }
}
