package com.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.StringUtils;

public class FindPackageAndClassList {


  public List<Class> getClasses( List<String> parameter,Class annotationClass) {


    var scanner = new ClassPathScanningCandidateComponentProvider(false);
    scanner.addIncludeFilter(new AnnotationTypeFilter(annotationClass));

    var classes = new ArrayList<Class>();
    for (var packageName : parameter) {
      var beans = scanner.findCandidateComponents(packageName);
      for (var bean : beans) {
        try {
          var className = bean.getBeanClassName();
          Class clazz = Class.forName(className);

          classes.add(clazz);
        } catch (ClassNotFoundException e) {
        }
      }
    }
    return classes;
  }


}
