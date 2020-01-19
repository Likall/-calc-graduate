package pers.ll.gacs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ImportAutoConfiguration(MyBatisConfig.class)
public class GacsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GacsApplication.class, args);
    }

}
