package designPattern.builder.else_example;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-12
 */
public abstract class Computer {
    protected String board;
    protected String display;
    protected String os;


    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getOs() {
        return os;
    }

    public abstract void setOs();


    @Override
    public String toString() {
        return "Computer{" +
                "board='" + board + '\'' +
                ", display='" + display + '\'' +
                ", os='" + os + '\'' +
                '}';
    }
}
