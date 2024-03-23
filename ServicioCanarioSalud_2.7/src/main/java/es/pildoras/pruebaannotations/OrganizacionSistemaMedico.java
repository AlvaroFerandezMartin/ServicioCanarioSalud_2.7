package es.pildoras.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrganizacionSistemaMedico {

    public static void main(String[] args) {
    	
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

     
        Medico medicoJuan = context.getBean("medico",Medico.class);
        
        
       System.out.println(medicoJuan.getNuemeroPacientes());

        
        System.out.println(medicoJuan.Fichar());
        System.out.println(medicoJuan.Descanso());
        System.out.println(medicoJuan.Salida());
        

        context.close();
    }
}
