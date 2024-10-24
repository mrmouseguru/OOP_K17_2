package buoi6.p1;
/**
 * Write a description of class Cho here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cho extends DongVat
{
   
    public Cho(){
        tuoi = 3;
        
    }
    
    public String toString(){
        return "tuoi: " + tuoi;
    }
    @Override //annotation : chú thích hàm này là
    //hàm ghi đè override
    public void keu() {
    	System.out.print("Cho sua gau gau ...");
    }

}
