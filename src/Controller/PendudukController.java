package Controller;
import Entity.PendudukEntity;
import java.util.Date;
public class PendudukController implements ControllerInterface {
    int indexLogin = 0;
    public PendudukController(){
    }
    @Override
    public int login (String namapen, String passpen){
        int cekdata = AllObjectModel.pendudukModel.cekData(namapen, passpen);
        return cekdata;
    }
    public void insertPenduduk(String namapen,String passpen,String tempatlahir,Date tglLahir,String kelamin,String agama,String status,String pekerjaan){
        AllObjectModel.pendudukModel.insertPenduduk(new PendudukEntity(namapen,passpen,tempatlahir,tglLahir,kelamin,agama,status,pekerjaan));
    }

    public int cekData(String namapen){
        int cekdatav = AllObjectModel.pendudukModel.cekdataview(namapen);
        return cekdatav;
    }
    public PendudukEntity pendudukEntity(){
        return  AllObjectModel.pendudukModel.getPendudukEntityArrayList(indexLogin);
    }
    public void delete(int index){
        AllObjectModel.pendudukModel.delete(index);    
    }
}
