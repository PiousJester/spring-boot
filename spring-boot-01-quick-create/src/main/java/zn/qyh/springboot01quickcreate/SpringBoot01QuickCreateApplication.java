package zn.qyh.springboot01quickcreate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot01QuickCreateApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot01QuickCreateApplication.class, args);
    }

}
