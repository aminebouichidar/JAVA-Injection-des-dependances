package metier;
//import dao.DaoImpl;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImp2 implements IMetier{
    @Autowired
    private IDao dao;

    // Couplage faible
    @Override
    public double Calcul() {
        double t= dao.getData();
        double result= t+100;
        return result;
    }
    public  void setDao(IDao dao){
        this.dao=dao;
    }
}
