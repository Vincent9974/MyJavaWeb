package Day6.utils;

import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import javax.swing.text.Document;
import java.io.*;
import java.util.List;



public class Dom4jUtils {
////返回document
    public static Document getDocument(String url) throws DocumentException {
        Document document = null;
        try {
            SAXReader saxReader = new SAXReader();
            document = (Document) saxReader.read(new File(url)); // 读取XML文件,获得document对象
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return document;
    }

   public static void xmlWriters(String path,Document document) throws IOException {
       OutputFormat format = OutputFormat.createPrettyPrint();
       XMLWriter xmlWriter = new XMLWriter(new FileOutputStream(path), format);
       xmlWriter.write(document);
       xmlWriter.close();
   }
}
