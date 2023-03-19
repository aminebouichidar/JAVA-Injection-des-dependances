package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class pres {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Scanner sc = new Scanner(new File("config.txt"));
        String daoClass = sc.nextLine();
        Class clasDao = Class.forName(daoClass);
        IDao dao= (IDao) clasDao.getConstructor().newInstance();
        //System.out.println(dao.getData());

        String metClass = sc.nextLine();
        Class CMetier = Class.forName(metClass);
        IMetier metier= (IMetier) CMetier.getConstructor().newInstance();

        Method setDao= CMetier.getMethod("setDao", IDao.class);
        setDao.invoke(metier, dao);
        System.out.println("Version dynamique");
        System.out.println(metier.Calcul());

    }
}
