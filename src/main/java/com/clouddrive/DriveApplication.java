package com.clouddrive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by bpj on 19-4-28.
 */
@SpringBootApplication
@ServletComponentScan
public class DriveApplication {
    public static void main(String[] args) {
        SpringApplication.run(DriveApplication.class,args);
    }
}
