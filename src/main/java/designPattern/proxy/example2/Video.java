package designPattern.proxy.example2;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public class Video {
    public String id;
    public String title;
    public String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
