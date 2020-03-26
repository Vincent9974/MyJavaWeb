package Day6.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Dom4jAdd {
    public static void main(String[] args) throws IOException, DocumentException {
    addSex();
    }
    public static void addSex() throws DocumentException, IOException{
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("Day6\\p1.xml");
        Element root = document.getRootElement();
        Element p1 = root.element("p1");
        Element sex1 = p1.addElement("Sex");
        sex1.addElement("Female");
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Day6\\p1.xml"), OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.close();
    }
}
