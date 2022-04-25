package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.type.AnnotationMetadata;

@SpringBootApplication
public class FindAnnotationApplication {

  public static void main(String[] args){
    FindAnnotationApplication find=new FindAnnotationApplication();
    FindPackageAndClassList instance = new FindPackageAndClassList();
    String pack = FindAnnotationApplication.class.getPackage().getName();
    List<String> packages =Arrays.asList(pack);
    List<Class> lst=instance.getClasses(packages,HttpInterceptor.class);

    System.out.println(pack);
    System.out.println(lst);


  }


  public  GenericBeanDefinition createBeanDefinition(Class<?> beanClass) {
    GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
    beanDefinition.setBeanClass(beanClass);
    beanDefinition.setAutowireMode(GenericBeanDefinition.AUTOWIRE_NO);
    beanDefinition.getFactoryBeanName();
    return beanDefinition;
  }

}
