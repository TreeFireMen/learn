package designPattern.factory.code_example1;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public abstract class Dialog {
    public void render() {
        Button button = createButton();
        button.render();
    }

    protected abstract Button createButton();
}
