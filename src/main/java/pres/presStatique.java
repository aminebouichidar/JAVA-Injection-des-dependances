package pres;
import dao.DaoImpl2;
import metier.MetierImp2;

public class presStatique {
    public static void main(String[] args) {
        DaoImpl2 dao = new DaoImpl2();
        MetierImp2 metier = new MetierImp2();
        metier.setDao(dao);
        System.out.println("Version statique");
        System.out.println(metier.Calcul());
    }
}
