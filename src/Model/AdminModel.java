package Model;
import Entity.AdminEntity;
import java.util.ArrayList;
public class AdminModel implements ModelInterface 
{
    private ArrayList<AdminEntity> adminEntityArrayList; 
    public AdminModel()
    {
        adminEntityArrayList = new ArrayList<AdminEntity>();
    }
    public void insertAdmin (AdminEntity admin)
    {
        adminEntityArrayList.add(admin);
    }
    @Override

    public int cekData(String nama,String pass){
        int loop = 0;
        for(AdminEntity admin : adminEntityArrayList)
        {
            if(admin.getNama().equals(nama) && admin.getPass().equals(pass))
            {
                break;
            }else{
                loop++;
            }
        }
        return loop;
    }
    public AdminEntity showDataAdmin(int index){
        return adminEntityArrayList.get(index);
    }
}