package XmlToStringParsing;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
public class XmlParserCLass {
@Test
    public static void Method() throws ParserConfigurationException {

        try {
            String filepath = "C:\\Users\\PragatiSharma\\IdeaProjects\\xmltostringandobjectinobj\\src\\test\\java\\XmlToStringParsing\\XmlFile.xml";
            File file = new File(filepath);
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder dbuilder = dbf.newDocumentBuilder();
            Document doc = dbuilder.parse(file);
            doc.getDocumentElement().normalize();
            System.out.println(doc.getDocumentElement().getNodeName());
            NodeList nodelist = doc.getElementsByTagName("laptop");
            int tLength = nodelist.getLength();
            System.out.println(tLength);
            for(int i =0;i<tLength;i++){
                Node node = nodelist.item(i);
                if (node.getNodeType()==Node.ELEMENT_NODE)
                {
                    Element element = (Element)node;
                    System.out.println("laptop brand is" +"  "+element.getElementsByTagName("laptopName").item(0).getTextContent());
                    System.out.println("laptop Price is" +" "+element.getElementsByTagName("price").item(0).getTextContent());
                    System.out.println("Ram of Laptop is" +"  "+element.getElementsByTagName("Ram").item(0).getTextContent());
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ParserConfigurationException {
        Method();
    }
}


