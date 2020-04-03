package zn.qyh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @author 曲逸涵
 * @date 2020/2/8 16:51
 * @Email:2628908921@qq.com
 */

/**
 * @SpringBootApplication来标注一个主程序类,说明这是一个spring boot应用
 */
@SpringBootApplication
public class HelloWorldTest {
    public static void main(String[] args) {
        //spring 应用启动起来
        SpringApplication.run(HelloWorldTest.class, args);
    }
}
