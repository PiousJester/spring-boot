package zn.qyh.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author 曲逸涵
 * @date 2020/3/27 21:45
 * @Email:2628908921@qq.com
 */
@Controller
public class HelloController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @ResponseBody
    @GetMapping("/query")
    public Map<String,Object> map(){
        List<Map<String,Object>> list=jdbcTemplate.queryForList("select * FROM department");
        return list.get(0);
    }

}
