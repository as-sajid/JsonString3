import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
public class JsonString3 {
    public static void main(String[] args) throws Exception {
        String jsonstring ="{\"name\":\"Sam\",\"age\":100}";
        ObjectMapper mapper=new ObjectMapper();
        VbPlayer vbp=mapper.readValue(jsonstring, VbPlayer.class);
        /*In place of json string an external file can also be specified*/
        System.out.println(vbp.name);
        System.out.println(vbp.age);
        /* Deserializzing objects that contain other objects */
        jsonstring = "{\"make\": \"Dell\", \"model\": \"Game Pad\", \"myProcessor\":{\"processorName\":\"Intel\", \"speed\":2100} }";
        Computer pc = mapper.readValue(jsonstring, Computer.class);
        System.out.println(pc.make +","+pc.myProcessor.processorName+"\n");
    }
}
