package reflect.testAnnotation;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-12-11
 */
@Table("db_student")
public class Student {

    @TableField(name = "db_name", type = "varChar", length = 3)
    private String name;
    @TableField(name = "db_age", type = "int", length = 2)
    private Integer age;
    @TableField(name = "db_id", type = "int", length = 10)
    private Long id;

    public Student() {
    }

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
