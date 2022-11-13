package serializable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

/**
 * @author zijian.zeng@hand-china.com
 * @since 2022/11/4
 */
public class TestBean implements Serializable {

    private Integer id;

//    @JsonIgnore
    private transient String name;

    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonProperty("now")
    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) {

        ObjectMapper objectMapper = new ObjectMapper();
        String str = "{\"id\":1,\"name\":\"haha\"}";
//        objectMapper.setConfig(SerializationFeature.FAIL_ON_EMPTY_BEANS, )
//        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, true);
//        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);


        TestBean testBean = new TestBean();
        testBean.setName("zzj");
        testBean.setId(2323);
        testBean.setDate(new Date());

//        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
//        try {
//            String s = objectMapper.writeValueAsString(testBean);
            System.out.println(testBean.toString());
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        try {
////            TestBean testBean = objectMapper.readValue(str, TestBean.class);
//            JsonNode jsonNode = objectMapper.readTree(str);
//            System.out.println(jsonNode.get("name"));
////            System.out.println(testBean);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }


//        TestBean testBean = new TestBean();
//        testBean.setDate(new Date());
//        testBean.setId(1);
//        testBean.setName("zzj");
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("./test2.txt");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//            objectOutputStream.writeObject(testBean);
//        } catch (FileNotFoundException e ) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
