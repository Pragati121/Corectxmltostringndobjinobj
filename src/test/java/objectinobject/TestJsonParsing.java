package objectinobject;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestJsonParsing {
    @Test
    public static void ObjectOfObject() throws IOException {
        //Itwillreadallthedatainttheformofbytesthatiswhyimcreatingherebyte
        byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\PragatiSharma\\IdeaProjects\\xmltostringandobjectinobj\\src\\test\\java\\objectinobject\\data.json"));
        ObjectMapper mapper = new ObjectMapper();
        Information information = mapper.readValue(jsonData, Information.class);
        System.out.println("Name is"+"  "+information.getFirstname());
        System.out.println("Lastname is"+" "+information.getLastname());
        System.out.println("State is"+" "+information.getAddress().getState());
        System.out.println("country is"+" "+information.getAddress().getCountry());
        System.out.println("district is "+" "+information.getAddress().getAbc().getDistt());
        System.out.println("Pincode is "+" "+information.getAddress().getAbc().getPin());
    }

    public static void main(String[] args) throws IOException {
        ObjectOfObject();
    }
}
