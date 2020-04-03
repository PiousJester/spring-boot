package zn.qyh.springboot01quickcreate.domain;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 曲逸涵
 * @date 2020/2/11 20:05
 * @Email:2628908921@qq.com
 */

/**
 * 将配置文件中配置的每一个属性的值,映射到这个组件中
 *
 * @ConfigurationProperties:告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定; prefix:"person":配置文件中哪个下面的所有属性进行---映射
 * 该注解默认从全局配置文件中获取值
 */
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private Integer age;
    private String lastName;
    private Boolean boss;
    private Date birth;
    private Map<String, Object> maps;
    private List<Object> lists;
    private Dog dog;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"age\":")
                .append(age);
        sb.append(",\"lastName\":\"")
                .append(lastName).append('\"');
        sb.append(",\"boss\":")
                .append(boss);
        sb.append(",\"birth\":\"")
                .append(birth).append('\"');
        sb.append(",\"maps\":")
                .append(maps);
        sb.append(",\"lists\":")
                .append(lists);
        sb.append(",\"dog\":")
                .append(dog);
        sb.append('}');
        return sb.toString();
    }
}
