package designPattern.proxy.example1;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public class RealImage implements Image {

    private final String fileName;


    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("Displaying: " + fileName);
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }
}
