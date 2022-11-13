package designPattern.builder.else_example;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class MacBookBuilder extends Builder {

    private MacBook macBook = new MacBook();

    public MacBookBuilder() {
    }

    @Override
    void buildBoard(String board) {
        macBook.setBoard(board);
    }

    @Override
    void buildDisplay(String display) {
        macBook.setDisplay(display);
    }

    @Override
    void buildOs() {
       macBook.setOs();
    }

    @Override
    Computer build() {
        return macBook;
    }
}
