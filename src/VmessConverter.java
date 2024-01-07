import java.util.Base64;
import org.json.JSONObject;

public class VmessConverter {
    /**
     * Convert JSON to vmess URL
     *
     * @param jsonStr JSON string to convert
     * @return vmess URL
     */
    public static String jsonToVmess(String jsonStr) {
        JSONObject jsonObj = new JSONObject(jsonStr);
        String v = jsonObj.getString("v");
        String ps = jsonObj.getString("ps");
        String add = jsonObj.getString("add");
        int port = jsonObj.getInt("port");
        String id = jsonObj.getString("id");
        String aid = jsonObj.getString("aid");
        String net = jsonObj.getString("net");
        String type = jsonObj.getString("type");
        String host = "";
        if (jsonObj.has("host") && !jsonObj.isNull("host")) {
            host = jsonObj.getString("host");
        }
        JSONObject tlsSettings = new JSONObject();
        if (jsonObj.has("tls") && !jsonObj.isNull("tls")) {
            boolean enable = jsonObj.getBoolean("tls");
            if (enable) {
                tlsSettings.put("allowInsecure", false);
                tlsSettings.put("serverName", host);
            }
        }
        JSONObject vmessObj = new JSONObject();
        vmessObj.put("v", v);
        vmessObj.put("ps", ps);
        vmessObj.put("add", add);
        vmessObj.put("port", port);
        vmessObj.put("id", id);
        vmessObj.put("aid", aid);
        vmessObj.put("net", net);
        vmessObj.put("type", type);
        vmessObj.put("tlsSettings", tlsSettings);
        String vmessStr = vmessObj.toString();
        return "vmess://" + Base64.getUrlEncoder().encodeToString(vmessStr.getBytes());
    }

    /**
     * Main method that accepts a JSON string as input
     *
     * @param args Command-line arguments (expects one argument, the JSON string)
     */
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java VmessConverter <jsonString>");
            return;
        }
        
        String jsonString = args[0];
        String vmessAddress = jsonToVmess(jsonString);
        System.out.println("Vmess address: " + vmessAddress);
    }
}
