package entity;

/**
 * @author Zhangmh
 * @date 2020/4/1217:09
 * @Description: 员工信息表
 */
public class Employee {
    private String name;
    private Integer age;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
