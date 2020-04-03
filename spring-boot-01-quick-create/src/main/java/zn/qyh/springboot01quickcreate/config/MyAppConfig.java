package zn.qyh.springboot01quickcreate.config;

/**
 * @author 曲逸涵
 * @date 2020/2/13 4:19
 * @Email:2628908921@qq.com
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zn.qyh.springboot01quickcreate.service.HelloService;

/**
 * @Configuration:知名当前类是一个配置类,就是替代之前的spring配置文件 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {
    //讲方法的返回值添加到容器中,容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
