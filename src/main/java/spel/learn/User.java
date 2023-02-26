package spel.learn;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2023-02-26
 */
public class User {
    private String name;
    private int age;
    private boolean isAdmin;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public static void main(String[] args) {
        SpelExpressionParser parser = new SpelExpressionParser();
        User user = new User();
        user.setAdmin(true);
        user.setAge(10);
        user.setName("zzj");

        Expression expression = parser.parseExpression("age > 11 ? '管理' : '普通用户'");
        String value = expression.getValue(user, String.class);
        System.out.println(value);

    }
}
