# Day6

## 1.schema约束

约束比dtd更复杂

* dtd语法：<!ELEMENT 元素名称 约束>

* 一个xml中可以有多个schema，多个schema使用空间进行区分

* dtd里有PCDATA类型，但是在schema里面可以支持更多的数据类型

* W3C提供了属性和标签——>schema——>xml

  创建步骤

  （1）看xml中有多少个元素

  <element>

  （2）简单元素和复杂元素

复杂元素：

```xml
<element name="person">
    <complexType>//复杂元素
        <sequence>
            <element name="name" type="string"></element>//简单
            <element name="age" type="int"></element>
        </sequence>
    </complexType>
</element>
```

简单元素： <element name="name" type="string"></element>

（3）xml引入

```xml
<person
        xmlns="http://www.w3schools.com"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://www.w3schools.com 1.xsd ">
       <name>Alex</name>
    <age>35</age>
</person>
```

xmlns:xs="http://www.w3.org/2001/XMLSchema"

显示 schema 中用到的元素和数据类型来自命名空间  "http://www.w3.org/2001/XMLSchema"。同时它还规定了来自命名空间  "http://www.w3.org/2001/XMLSchema" 的元素和数据类型应该使用前缀 xs：



elementFormDefault="qualified"

指出任何 XML 实例文档所使用的且在此 schema 中声明过的元素必须被命名空间限定。



## 2. XMLSchema 复杂元素指示器

* ALL：表示只出现一次
* Choice ：只能出现其中的一个
* Squence：元素按照顺序出现
* MaxOccurs：最多出现次数，unbounded无限，‘2’两次...

* <any></any> 表示任意元素



## 3. sax 解析原理

* 在java.xml.parsers 包里面

  SAXParserFactory.newSAXParser() 方法得到

  -parse（File f,DefaultHandler dh）

  **两个参数：第一个是xml的路径，第二个是事件处理器

执行下列方法    startElement    character   endElement





## 4.使用jaxp的sax方式解析xml

sax里不能实现增删改操作，只能查询

打印出整个文档

执行处parse方法，第一个参数xml路径，第二个参数是 事件处理器

创建一个类，继承事件处理器（start character end）并重写里面的方法

* 获取name元素的值

  -定义一个 Boolean 变量 flag =false

  -当读到name元素 设置 flag=ture  执行方法

  -完成方法后 再 设置成  flag=false

  

## 5.使用dom4j解析xml

* dom4j ，是一个组织，针对xml解析，提供解析器 dom4j

* dom4j不是javase的一部分，想要用如下步骤

  -导入jar包，创建lib文件夹，复制

  -File->Project Structure->Moudle->添加

* 得到document

```xml
SAXReader reader = new SAXReader();
Document document = reader.read(url);
```

* document的父接口是node
* document里面的方法 getRootElement（）;获取根节点，返回Element

* Element也是一个接口，父接口是Node

  ​	-Element和Node里面方法

  ​	-getParent（）：获取父节点

  ​	-addElement：添加标签



## 6. 使用dom4j查询xml

* ```JAVA
  //查询所有name元素里面的值
  /*1.创建解析器
  2.得到document
  3，得到根节点
  4.得到所有的p1标签
  5.得到name标签
  6.得到name里的text值
  ```

```java
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
```



## 7.使用dom4j实现添加操作

* 在第一个p1标签末尾添加一个元素<sex></sex>

```java
//创建解析器，读取文件，得到根节点，得到p1标签
SAXReader saxReader = new SAXReader();
Document document = saxReader.read("Day6\\p1.xml");
Element root = document.getRootElement();
Element p1 = root.element("p1");
//在p1标签下添加Sex元素，Sex中添加Female文本
Element sex1 = p1.addElement("Sex");
sex1.addElement("Female");
//回写xml，
XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Day6\\p1.xml"), OutputFormat.createPrettyPrint());
xmlWriter.write(document);
xmlWriter.close();
```



## 8.在特定节点添加一个元素

* 在第一个p1下面age标签之前添加<school>ecit.edu.cn</school>

```java
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
OutputFormat format = OutputFormat.createPrettyPrint();
XMLWriter xmlWriter = new XMLWriter(new FileOutputStream("Day6\\p1.xml"), OutputFormat.createPrettyPrint());
xmlWriter.write(document);
xmlWriter.close();
```



##  9.使用dom4j支持xpath的操作

* 可以直接获取到某个元素

* 第一种形式

  ​	/AA/BB/CC   类似文件路径

* 第二种形式

  ​	//DD   得到所有的DD

* 第三种

  ​	*得到所有的元素

* 第四种

  ​	BB[1]:表示第一个BB元素

  ​	BB[last]:表示最后一个BB元素

* 第五种 

  ​	//BBB[@ID] :表示只要BBB的元素上面有id属性，都得到

* 第六种

  //BBB[@ID='b1'] 表示元素名称是BBB,在BBB上面有id属性，且属性值为b1

  

## 10.使用dom4支持xpath的具体操作

** 在默认的情况下，dom4j 不支持xpath