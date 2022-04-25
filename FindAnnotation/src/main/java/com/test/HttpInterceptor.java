package com.test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.stereotype.Component;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface HttpInterceptor {

  /**
   * Defines the name of the service bean when registered to the underlying context. If left unspecified
   * the name of the service bean is generated using {@link org.springframework.beans.factory.annotation.Qualifier},
   * If no Qualifier annotation, we would use full class name instead.
   *
   * @return the name of the bean.
   */
  String name() default "";
  /**
   * Alias for the {@link #value()} attribute. Allows for more concise annotation
   * declarations e.g.: {@code @RetrofitService("ai")} instead of
   * {@code @RetrofitService(retrofit="ai")}.
   *
   * @return the specified retrofit instance to build endpoint
   */
  String value() default "";

}
