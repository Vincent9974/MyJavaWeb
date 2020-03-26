package Day6.dom4j;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class dom4jText {
    public static void main(String[] args) throws Exception {
      selectName();
    }
    public static  void selectName() throws Exception{
        //查询所有name元素里面的值
        /*1.创建解析器
        2.得到document
        3，得到根节点
        4.得到所有的p1标签
        5.得到name标签
        6.得到name里的text值
        * */

        SAXReader saxReader = new SAXReader();
        Document document = saxReader.read("Day6\\p1.xml");
        Element root = document.getRootElement();
        List<Element> list = root.elements("p1");
        for (Element element :list){
            //Element是每一个p1元素
            //得到p1下面的name元素
            Element name1= element.element("age");
            String s = name1.getText();
            System.out.println(s);
        }

    }
}
