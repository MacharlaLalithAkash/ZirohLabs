//package MediaWiki;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.io.*;
//
//public class Converter {
//
//    public Employee jsonToObj(String json) {
//        Gson gson = new Gson();
//        return gson.fromJson(json, Employee.class);
//    }
//
//    public void objToJson(Object obj) {
//        Gson gson = new GsonBuilder().setPrettyPrinting().create();
//
//        try (FileWriter writer = new FileWriter("D:\\Test\\staff.json")) {
//            gson.toJson(obj, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
