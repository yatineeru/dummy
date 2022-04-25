package com.test;

import org.aopalliance.intercept.Interceptor;

@HttpInterceptor(name = "network-interceptor")
public class NetworkInterceptor implements Interceptor {

  /*private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(NetworkInterceptor.class);
  private final HttpLoggingInterceptor httpLoggingInterceptor;
  private final RetrofitProperties properties;
  public NetworkInterceptor(RetrofitProperties properties) {
    this.properties = properties;
    httpLoggingInterceptor = new HttpLoggingInterceptor();
//        httpLoggingInterceptor.setLevel(this.properties.getLogLevel());
  }

  @NotNull
  @Override
  public Response intercept(@NotNull Chain chain) throws IOException {
    return httpLoggingInterceptor.intercept(chain);
  }

  *//**
   * TODO we can set network trace to spring boot log level
   *
   * @param level
   * @return
   *//*
  public HttpLoggingInterceptor.Logger httpLoggingInterceptorLogger(LogLevel level) {
    if (level == LogLevel.DEBUG) {
      return logger::debug;
    } else if (level == LogLevel.ERROR) {
      return logger::error;
    } else if (level == LogLevel.INFO) {
      return logger::info;
    } else if (level == LogLevel.WARN) {
      return logger::warn;
    }
    throw new UnsupportedOperationException("We don't support this log level currently.");
  }*/

}

