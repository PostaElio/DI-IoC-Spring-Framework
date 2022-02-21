package com.example.injeciondependencyspring;

import org.apache.naming.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

public class MySpringApp {

        public static void main(String[] args) {
            //Si usamos Spring en aplicaciones Java independientes y usamos anotaciones para la configuración,
            //podemos usar esto para inicializar el contenedor y obtener los objetos de bean.
            //Recibe una clase que tenga la anotacion @configuration
            ApplicationContext wea1 = new AnnotationConfigApplicationContext();

            //Si tenemos un archivo xml de configuración de Spring Bean en una aplicación independiente,
            //entonces podemos usar esta clase para cargar el archivo y obtener el objeto contenedor.
            //Recibe un archivo xml, e.i "applicationContext.xml"
            ApplicationContext wea2 = new ClassPathXmlApplicationContext();

            //This is similar to ClassPathXmlApplicationContext except that the xml configuration file can
            //be loaded from anywhere in the file system.
            ApplicationContext wea3 = new FileSystemXmlApplicationContext();

            //For web applications
            ApplicationContext wea4 = new AnnotationConfigWebApplicationContext();
            ApplicationContext wea5 = new XmlWebApplicationContext();




            AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
            ctx.register(ConfigurationBeans.class);
            ctx.refresh();

            // MyBean mb1 = ctx.getBean(MyBean.class);

            // MyBean mb2 = ctx.getBean(MyBean.class);

            ctx.close();
            System.out.println("hollaaaasdasd");
        }

    }
