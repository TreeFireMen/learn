package designPattern.chainOfResponsibility.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public class UserExistsMiddleware extends Middleware {

    private final Server server;

    public UserExistsMiddleware(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String passwd) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, passwd)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, passwd);
    }
}
