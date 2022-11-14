package designPattern.chainOfResponsibility.example2;

/**
 * 检查用户角色
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String passwd) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, passwd);
    }
}
