package xmltostring;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.juneau.http.annotation.Tag;
import org.testng.annotations.Test;
import xmltostring.PojoClass;

import java.nio.file.Files;
import java.nio.file.Paths;
public class TestClass {
    @Test
        public static void xmlFileToString() throws Exception {
            XmlMapper xml = new XmlMapper();
            String readContent = new String(Files.readAllBytes(Paths.get("C:\\Users\\PragatiSharma\\IdeaProjects\\xmltostringandobjectinobj\\src\\test\\java\\xmltostring\\Test.xml")));
           PojoClass Test = xml.readValue(readContent, PojoClass.class);
            String Name = Test.getFirstname();
            String lName = Test.getLastanme();
            System.out.println("Name = " + Name);
            System.out.println("Lastname = "+lName);
        }

    public static void main(String[] args) throws Exception {
        xmlFileToString();
    }
    }
