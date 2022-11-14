package designPattern.proxy.example1;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public class ProxyImage implements Image {


    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }


    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
            realImage.display();
    }
}
