package com.clouddrive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by bpj on 19-4-28.
 */
@SpringBootApplication
@ServletComponentScan
public class DriveApplication extends SpringBootServletInitializer{
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(DriveApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(DriveApplication.class,args);
    }
}
