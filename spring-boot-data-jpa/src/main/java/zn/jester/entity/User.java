package zn.jester.entity;



import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;

/**
 * @author 曲逸涵
 * @date 2020/4/1 17:06
 * @Email:2628908921@qq.com
 */
@Entity //告诉JPA这是一个实体类(和数据表映射的类)
@Table(name="tbl_user") //用@Table指定和那个数据表对应。如果省略默认表名就是user
public class User {
    @Id//这是一个主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键

    private Integer id;
    @Column(name="last_name",length = 50)//这是个数据表对应的一个列
    private String lastName;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"lastName\":\"")
                .append(lastName).append('\"');
        sb.append(",\"email\":\"")
                .append(email).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
