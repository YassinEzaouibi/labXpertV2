package com.yassin.labxpert;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.applet.AppletContext;
import java.util.Arrays;

@SpringBootApplication
public class LabXpertApplication {

    public static void main(String[] args) {
        SpringApplication.run(LabXpertApplication.class, args);
    }
   /* @Bean
    public CommandLineRunner cmdlr (ApplicationContext apc){
        return args -> {
            System.out.println("spring boot beans:");
            String[] beans = apc.getBeanDefinitionNames();
            Arrays.sort(beans);
            for (String beanName: beans){
                System.out.println(beanName);
            }
        };
    }*/

}
