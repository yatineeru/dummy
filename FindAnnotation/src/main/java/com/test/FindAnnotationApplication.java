package com.test;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
