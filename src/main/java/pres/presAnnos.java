package pres;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presAnnos {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("metier", "dao");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("Version Spring annotation");
        System.out.println(metier.Calcul());
    }
}
