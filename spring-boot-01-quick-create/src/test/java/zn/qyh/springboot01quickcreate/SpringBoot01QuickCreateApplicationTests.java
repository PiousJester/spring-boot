package zn.qyh.springboot01quickcreate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import zn.qyh.springboot01quickcreate.domain.Person;

/**
 * SpringBoot单元测试
 * 可以在测试期间很方便的类似编码一样进行自动注入等容器的功能
 */
@SpringBootTest
class SpringBoot01QuickCreateApplicationTests {
    @Autowired
    Person person;
    @Autowired
    ApplicationContext ioc;

    @Test
    void testHelloService() {
        boolean b = ioc.containsBean("helloService");
        System.out.println(b);
    }

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
