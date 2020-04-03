package zn.qyh.springboot01quickcreate.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @author 曲逸涵
 * @date 2020/2/10 11:25
 * @Email:2628908921@qq.com
 */

/**
 * @ResponseBody和@Controller可以被@RestController代替
 */
@RestController
public class HelloController {
    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello" + name;
    }
}
