package org.example;

import org.example.LifeCycleBean.Example;
import org.example.autowiring.teacher;
import org.example.beans.Person;
import org.example.referance.Second;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args )
    {
        //it is for student bean
//        ApplicationContext context =new ClassPathXmlApplicationContext("Student_Config.xml");
//        Student student1=(Student) context.getBean("student1");
//        System.out.println(student1);
//        Student student2=(Student) context.getBean("student2");
//        System.out.println(student2);


        //it is for collection bean
//
//        ApplicationContext context =new ClassPathXmlApplicationContext("Collection_Config.xml");
//        Collection person1=(Collection) context.getBean("list1");
//        System.out.println(person1);
//        System.out.println(person1.getCourses());
//        System.out.println(person1.getPhones());
//        System.out.println(person1.getId());


        //it is for reference bean
//        ApplicationContext context=new ClassPathXmlApplicationContext("Reference_Config.xml");
//        Second result=(Second) context.getBean("SecondRef");
//        System.out.println(result);
//        System.out.println(result.sum());
//
//

        //for constructor injection

//        ApplicationContext context=new ClassPathXmlApplicationContext("Person_Config.xml");
//        Person obj=(Person) context.getBean("person");
//        System.out.println(obj);

        //lifecycle of bean
//        AbstractApplicationContext context=new ClassPathXmlApplicationContext("BeanLifeCycle.xml");
//        context.registerShutdownHook();
//        Example obj=(Example) context.getBean("example");
//        System.out.println(obj);
//        AbstractApplicationContext context=new ClassPathXmlApplicationContext("autowiring.xml");
//        teacher t=(teacher) context.getBean("teacher");
//        System.out.println(t);
    }
}
