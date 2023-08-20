//package com.amazonbestsellingbooks.amazonbestsellingbooks.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//import org.springframework.core.env.Environment;
//
//import javax.sql.DataSource;
//
//public class DriverManagerDataSource{
//    @Autowired
//    private static Environment env;
//
//    @Bean(name ="ApacheHive")
//    @Primary
//    public static DataSource ApacheHiveDataSource()
//    {
//
//        DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.driverClassName("cdata.jdbc.apachehive.ApacheHiveDriver");
//        dataSourceBuilder.url("jdbc:apachehive:Server=127.0.0.1;Port=10000;TransportMode=BINARY;");
//        return dataSourceBuilder.build();
//    }
//
//    //@Override
//    public void setEnvironment( final Environment environment) {
//        env=environment;
//    }
//}
