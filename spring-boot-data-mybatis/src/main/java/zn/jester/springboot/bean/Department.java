package zn.jester.springboot.bean;

/**
 * @author 曲逸涵
 * @date 2020/3/31 16:31
 * @Email:2628908921@qq.com
 */
public class Department {
    private Integer id;
    private String departmentName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"departmentName\":\"")
                .append(departmentName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
