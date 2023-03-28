package modul2;
import java.util.ArrayList;

public class latihan1 {
    public static void main(String[] args){
        ArrayList<String> NamaHewan = new ArrayList<>();
        NamaHewan.add("Sapi");
        NamaHewan.add("Kelinci");
        NamaHewan.add("Kambing");
        NamaHewan.add("Unta");
        NamaHewan.add("Domba");

        System.out.println("Hewan :" +NamaHewan);
        System.out.println("Hewan yang dihapus : "+NamaHewan.get(1)+", "+NamaHewan.get(2)+", "+NamaHewan.get(3));

        NamaHewan.remove("Kelinci");
        NamaHewan.remove("Kambing");
        NamaHewan.remove("Unta");

        System.out.println("Hewan :" +NamaHewan);
    }
}
