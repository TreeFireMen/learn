package designPattern.factory.code_example1;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-13
 */
public class WindowsDialog extends Dialog{
    @Override
    protected Button createButton() {
        return new WindowsButton();
    }
}
