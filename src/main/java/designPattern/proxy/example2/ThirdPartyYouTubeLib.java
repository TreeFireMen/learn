package designPattern.proxy.example2;

import java.util.HashMap;

/**
 * 远程服务接口
 *
 * @author zijian.zeng@hand-china.com
 * @since 2022-11-14
 */
public interface ThirdPartyYouTubeLib {

    HashMap<String, Video> popularVideos();

    Video getVideo(String videoId);

}
