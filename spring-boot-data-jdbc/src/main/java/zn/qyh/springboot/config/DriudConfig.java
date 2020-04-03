package zn.qyh.springboot.config;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 曲逸涵
 * @date 2020/3/31 14:08
 * @Email:2628908921@qq.com
 */
@Configuration
public class DriudConfig {
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid(){
        return new DruidDataSource();
    }
    //配置一个Druid的监控
    //1.配置一个管理后台的servlet
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams  =new HashMap<>();
        initParams.put("loginUsername","admin");
        initParams.put("loginPassword","123456");
        initParams.put("allow","");//默认是允许所有访问
        servletRegistrationBean.setInitParameters(initParams);
        return servletRegistrationBean;
    }
    //2.配置一个监控的filter
    @Bean
    public FilterRegistrationBean WebStatFilter(){
        FilterRegistrationBean <WebStatFilter> filterRegistrationBean=new FilterRegistrationBean(new WebStatFilter());
        Map<String,String> init=new HashMap<>();
        init.put("exclusions","*js,*css,/druid/*");
        filterRegistrationBean.setInitParameters(init);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        return filterRegistrationBean;
    }
}
