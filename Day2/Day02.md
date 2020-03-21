# Day02

## 1.Day01复习

1. HTML思想

   * 把操作的数据用标签包起来，通过修改标签的属性值来实现数据样式的变化

2. 图像标签 <Img src="ip地址+端口号">

3. 超链接标签 <a href"  "  target="_blank"><a/>

4. 表格标签

   * 技巧 table>tr *>td * +tab键 

   

5. 表单标签

* <form><form/> 
      -action method enctype
      meehod get post
      type="text"（普通输入项）
      password (密码输入项)
      radio(单选) name value
      checkbox(复选)name value
      selection option(下拉框)
      textarea（文本域）
      type="hidden"
      type="file"
      submit(提交)

## 2.CSS
### 1. css 简介
css：层叠样式表：
层叠：一层一层
样式表：很多属性值（css参考手册）
使页面的显示效果更加好
css将网页内容和显示样式进行分离，提高了显示功能

### 2. css和HTML的结合方式（4种） 
* 在每个HTML标签上都有一个属性style，使HTML和css结合
 <div style="background-color: antiquewhite"> (设置背景颜色)

<style type="text/css">@import "typea.css";</style>用css

* 使用HTML的一个标签实现<style> 标签，写在head里
  
  <style type="text/css">div{}</style> 在head里定义一个方法
*  在style标签里 使用语句

@import url(css文件的路径)；先创建css文件，

<style type="text/css">@import "typea.css";</style>用css

* 使用头标签   link引入css文件

```html
<link rel="stylesheet" type="text/css" href="typea.css">
```
第三种有些游览器不起所用，一般用第四种

优先级：由上到下，由内到外，优先级由低变高

##  3.css选择器（3种基本选择器）

* 对哪个标签里面的数据进行操作

（1）class选择器

先在style标签内创建.class1{}然后<div class="class1">

（2）标签选择器 

```html
div{ background-color: red;}
```

（3）id选择器

和class差不多用#

* 优先级     **style>id>class>标签** 

## 4.css的扩展选择器

1. 关联选择器(中间要加空格)  

   * 设置嵌套样式  div p{ background-coloe:red}

   * ```
     <div><p>wwwwwwwww</p></div>
     ```

2. 组合选择器  (加,逗号)

   * div,p{background_color=""}

   * 把div和p 标签设置成相同的样式，把不同的标签设置成相同的样式

3. 伪元素选择器(jquery 动态效果)

   * css提供了定义好的样式可供直接使用

   * 超链接的状态（css参考文档 >css2选择符>伪类和对象）

     * 原始状态  鼠标悬停状态  点击状态  点击之后的状态

     * :link           :hover               :active       :visited

## 5.css的盒子模型

* 在进行布局前要把数据封装到一块一块的区域内（div）

1. 边框 border

   border:2px solid blue；统一设置
2. 内边距 padding
使用padding统一设置 ；
也可以通过id定制
3. 外边距 margin (同上)

## 6.css的布局漂浮

float：文件流流向

## 7.css的布局定位

position：

-absolute：可以将对象从文档流中拖出；可以top，let属性进行定位，可层叠

-relative：不可层叠

## 8.文图混排

## 9.图片上显示文字



   ===================================================

# JavaScript

## 1.js的简介

1. javascript ：基于对象和事件驱动的语言，应用于客户端

-基于对象：提供了很多对象，可以直接拿过来用

-事件驱动：HTML做网页静态效果，js动态效果

-客户端：专门指游览器

2. js的特定：
   * 交互性（动态交互） 
   * 安全性（不能访问本地磁盘文件）
   *  跨平台性（只要支持js游览器都可以运行）

3. js和java的区别 （雷锋和雷峰塔）没有任何关系
   * java是sun，现在oracle；js是网景公司
   * java面向对象，JavaScript是基于对象
   * java强类型，js弱类型 （类型种类不怎么要求）
   * js只需解析就可以执行，而java要先编译

4. js的组成

   三部分组成

   * ECMAScript

     -ECMA制定的基本语法

   * BOM

     -浏览器对象模型broswer object model

   * DOM

     - 文档对象模型document object model 

## 2.js和html的结合方式（两种）

1. 使用<script type="text/javascript"> 标签

2. 使用<script>标签引入一个外部js文件（和css一样）里面就不要标签里写代码了

   <script type="text/javascript" src="1js.js">



## 3.js的原始类型和声明变量

1.  5个 初始变量：

-String ：字符串

-number：数字类型

-boolean：布尔值

-null：表示引用的对象为空

-undifined：定义一个变量，没有赋值



2. var相当于泛型
3. typeof()查看变量类型

## 4.JS的语句

* if
* switch
* while
* for

## 5. JS的运算符

* JS里不区分小数和整数
* 字符串+number 得到字符串；字符串-number得到number
* 布尔值相当于数字
* ==与===区别：==比较值；===比较值和类型
* document.wirte(""); 相当于java中的sout

## 6. 9*9乘法表

```javascript
<script type="text/javascript">
    document.write("<table border='1' bordercolor='red'>>")
    document.write("<tr>")
    for(var i=1;i<10;i++){
        for(var j=1;j<=i; j++){
            document.write("<td>")
            document.write(i+"*"+j+"="+i*j+"&nbsp");
            document.write("</td>")
        }
        document.write("<tr>")
    }
document.write("</table>")
</script>
```

## 7.JS的数组

* 数组里可以有任意类型的值

* 定义方式（3种）
  *  var arr=[1,2,3];   	var arr1=[1,2,"4"];
  *  var array2= new Array(5);  for(;;)
  * var array3 = new Array{1,2,3}

## 8.JS的函数

* ```javascript
  function add(a,b) {
      var sum=a+b;
      alert(sum)
  }  不用定义数据类型
  ```

* ```js
  var action3= function (m,n) {
  alert(m+n);
  }  //还能住么玩!惊了
  ```

## 9.JS的全局变量和局部变量

* 全局变量：在script标签中定义一个变量，在js部分都可以调用
* 局部变量：在方法中定义，只能在方法使用

## 10. script放置的位置

* 一般放在</body>后面

## 11.今天内容总结

* css和html结合方式：