package Day6.dom4j;

import Day6.utils.Dom4jUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import javax.sql.RowSetInternal;
import javax.sql.rowset.WebRowSet;
import javax.sql.rowset.spi.XmlWriter;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.sax.SAXResult;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Writer;
import java.sql.SQLException;
import java.util.List;

public class AddBefore {
    public static void main(String[] args) throws IOException, DocumentException {
addAgeBefore();
    }
    public static void addAgeBefore() throws DocumentException, IOException {
        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("Day6\\p1.xml");
        Element root = document.getRootElement();
        Element p1 = root.element("p1");
        List<Element> list = p1.elements();
        //创建添加的元素,使用帮助类
        Element school = DocumentHelper.createElement("school");
        school.setText("sdju");
        list.add(1, school);
        //以上是存在内存中的
     /*   OutputFormat format = OutputFormat.createPrettyPrint();
        XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Day6\\p1.xml"), OutputFormat.createPrettyPrint());
        xmlWriter.write(document);
        xmlWriter.close();*/
        Dom4jUtils.xmlWriters("Day6\\p1.xml", (javax.swing.text.Document) document);
    }
}
