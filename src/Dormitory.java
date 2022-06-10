import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

public class Dormitory extends Room{
    FileOutputStream file;
    Room rooms;
    public Dormitory() {

    }

    public void saveRooms(String filepath) throws ParserConfigurationException, SAXException, IOException {
        //an instance of factory that gives a document builder
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        //an instance of builder to parse the specified xml file
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.newDocument();
        Element rootElement = doc.createElement("dormitory");
        doc.appendChild(rootElement);

        Element room = doc.createElement("room");
        doc.appendChild(room);

        Element roomnumber = doc.createElement("roomnumber");
        roomnumber.setTextContent("213");
        doc.appendChild(roomnumber);

        Element students = doc.createElement("students");
        students.setTextContent("6");
        doc.appendChild(students);

        try {
            file = new FileOutputStream("dormitory.xml");
            System.out.println("XML file Created");
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    public void loadRooms(String filepath){



    }



    public int getFreeCapacity() {
        return 0;
    }

    public int getRooms() {
        return 0;
    }


}
