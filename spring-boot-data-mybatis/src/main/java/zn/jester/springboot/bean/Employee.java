package zn.jester.springboot.bean;

/**
 * @author 曲逸涵
 * @date 2020/3/31 16:28
 * @Email:2628908921@qq.com
 */
public class Employee {
    private Integer id;
    private String latName;
    private Integer gender;
    private String Email;
    private Integer dId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLatName() {
        return latName;
    }

    public void setLatName(String latName) {
        this.latName = latName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"latName\":\"")
                .append(latName).append('\"');
        sb.append(",\"gender\":")
                .append(gender);
        sb.append(",\"Email\":\"")
                .append(Email).append('\"');
        sb.append(",\"dId\":")
                .append(dId);
        sb.append('}');
        return sb.toString();
    }
}
