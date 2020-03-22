# Day3

## 1.JS的String对象

* 创建String对象 ：var str ="abcde";

* 方法和属性（文档）

  * 属性：length：字符串的长度

  * 方法：

    1. 与HTML相关的方法

       -bold()：加粗

       -fontcolor():字体颜色

       -fontsize():字体大小

       -link():网页超链接

       -sub，sup下标上标

       ...等等可以在W3school帮助文档上查找

    2. 与java相似

       -concat：连接字符串

       -charAt： 返回对应位置字符串（越界不返回）

       -indexof：返回对应位置

       -split：按指定字符进行切分

       -replace；替换

       -substr:开始位，向后截取的个数

       -substring：开始位，结束位之前

```js
var s3="Vincent9974";
document.write(s3.substr(3,6));//cent99
document.write(s3.substring(7));//9974
```

## 2. java 的Array对象

1. 创建数组的方法（三种）

-var arr1 =[1,2,3];

-var arr2 =new Array(3);

-var arr3 =new Array{1,2,3};

2. 方法

-concat:连接数组，可连接多个

-jion:用给定的字符替换”，“逗号

-push 栈中放一个**元素**，返回新的长度

-pop 删除栈中对上面一个元素；返回删除的元素

-reverse 颠倒元素



## 3.Java的Date对象

```js
var date = new Date();//时间对象
```

-date.toLocateString() 获取时间

```js
document.write(date.toLocaleString());//2020/3/21 下午7:35:45
```

-getFullYear:得到当前的年

```js
document.write(date.getFullYear());//2020
```

-getMonth();得到当前的月 //返回的是0-11月，记得加1

```java
document.write(date.getMonth()+1);//3
```

-getDay():得到0-6 周日是0

-getDate():返回1-31

-getHours（）小时

-getMinutes()分钟

-getMilliseconds()秒

-getTime():获得1970至今的毫秒数

* 应用场景：使用毫秒数处理缓存的效果



## 4.Js的Math对象

1. 数学的运算
2. 里面的都是静态方法，不用new 直接使用

* 方法

  -ceil()：向上舍入

  -round()：向下舍入

  -floor()：四舍五入

* radom()：0-1之间的随机数

  ```
  Math.floor(Math.random()*10)//得到0-9 的随机数
  ```

## 5. Js的全局函数

* 不属于任何一个对象，直接写名称使用

-eval（）：执行Js代码（对象是方法也执行）

```JavaScript
var str="alert('1234')";
eval(str);
```

-encodeURL：编码

-decodeURL：解码

-isNaN:是数字false；不是ture

-praseInt:字符串转数字

## 6. JS的重载

* 什么是java的重载？ 方法名相同，参数不同

* js的重载？（面试题）

   不存在，只会调用最后一个函数。但可以模拟。（通过argument数组实现，实际没什么用）

  -把传递的参数保留在arguments里

## 7.JS的bom对象

* bom:broswer object model 浏览器对象模型

* 有那些对象？

  -navigator：获取（客户机）游览器信息

  

  ----navigator.appName

  -screen:获取屏幕信息

  ```js
  document.write(screen.width);
  document.write("<hr>");
  document.write(screen.height);// 1920*1080
  ```

  

  -location:请求URL地址

  href是属性

  ---收到URL地址 document.write(location.href);

  --设置URL地址：设置按钮，跳转另一个页面

  ```js
  <input type="button" value="tiaozhuan" onclick="href1()">
  function href1(){location.href="https://www.baidu.com";}
      //鼠标点击按钮跳转到百度
  ```

  

  -history:请求URL的历史记录 方法里定义

  --history.back();  返回页面

  --history.forward();到访问的下一个页面

  

  -***-window

  * 窗口对象

  * 顶层对象（所有的bom对象都是在window里操作的）

    --方法 ：

    -windo.alert():弹出提示框。

    -confirm()确认框。

    -promt:给用户一个输入框

    -open（）

    -close

-做定时器

--window.setInterval:每三秒显示一次

```js
setInterval("alert('123');",3000);
```

--setTimeout:只执行一次

--cleartimeout 清除...；通过setinterval会有返回值，clearinterval可以清除

--clearinterval 同上

## 8.js的dom对象

*  dom：document object model：文档对象模型
* 文档：超文本文档
* 对象:提供了属性和方法
* 模型：使用属性和方法来操作超文本标记文档

--可以使用js的dom里提供的对象里的属性和方法，对标记文档进行操作

--想要对标记文档进行操作，首先需要对标记文档里所有的内容封装成对象

--要想对标记型文档进行操作，解析标记文档

![](Day3.assets/htmltree.gif)

* 解析过程：根据HTML的层级结构，在内存中分配一个树形结构，把需要的HTML部分封装为对象，

  -document：整个文档 

  -element：标签对象

  -attribute：属性对象

  -text：文本独享

  

  ***DHTML：是很多数据的简称

  HTML：分装数据

  css:使用属性的属性值设置样式

  dom:操作HTML文档

  javascript:专门值得是js的语法和语句



## 9.document对象

* ***常用的方法：
* write（）方法：
  * 向页面输出值

* getElementById（）；

  -通过id得到元素（标签）

```js
<input type="text" id="nameid" value="aaa">
var input1= document.getElementById("nameid");
alert(input1.value);
input1.value="bbb";
```

* getElementsByName():

  -通过name的属性值返回标签

  -返回的是一个集合（数组）

* getElementsByTagName:通过标签<input>

## 10. window弹窗案例

opener：属性，获取当前窗口的窗口