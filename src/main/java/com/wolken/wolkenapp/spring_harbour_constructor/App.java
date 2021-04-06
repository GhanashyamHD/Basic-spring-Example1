package com.wolken.wolkenapp.spring_harbour_constructor;



import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.HarbourBean;
import com.wolken.wolkenapp.bean.ShipsBean;

/**
 * Hello world!
 *=
 */
public class App 
{
    public static void main( String[] args )
    {
    	Logger logger = Logger.getLogger(App.class);
   
       	
       ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
       HarbourBean bean = applicationContext.getBean(HarbourBean.class);
       System.out.println(bean.getHarbourName()+" "+bean.getWaterSource()+" "+bean.getShipsBean());
       ShipsBean bean2 = applicationContext.getBean(ShipsBean.class);
       System.out.println(bean2.getShipName()+" "+bean2.getType());
       logger.info(bean.getHarbourName());
       bean.openTime();
       bean2.locate();
       
    }
}
