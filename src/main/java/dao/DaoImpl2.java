package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DaoImpl2 implements IDao{
    @Autowired
    @Override
    public double getData(){
        double data = 1949;
        return data;
    }
}
