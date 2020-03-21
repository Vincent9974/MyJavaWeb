# DAY01

## 1.html的简介

* 什么是html?

HyperText Markup Language ：超文本标记语言，网页语言

* 超文本，超出文本范畴，互动性更强
* 标记：html所有的操作通过标记实现，<标签>

* 第一个HTML程序
  * 用标签封装
  * <font size="5" color="red">我的第一个HTML程序</font>
  * 不需要知道所有标签，会查就行了

* HTML的规范

  * 一个HTML文件有头有尾，有开始标签到结束标签

  * HTML包含两部分内容

  * <head></head> 设置相关信息

  * 和<body></body>显示在页面上的内容

* HTML不区分大小写
* 换行<br/>

* html的操作思想
  * 在网页中有很多数据，不同数据需要不同的显示效果
  * 通过修改标签修改标签内数据的变化

## 2.HTML中常用的标签

### 2.1文字标签

修改文字的样式

* -<font></font>
  * size:文字大小
  * color：文字颜色（英文单词和16进制）

### 2.2注释标签

* ctrl+alt+？选中注释<!-- -->

* 标题标签，水平标签和特殊字符

  * 标题标签<h1>....<h6>

    * 从h1到h6依次变小，且自动换行

  * 水平线标签<hr>

    <hr/> 一行分割线

### 2.3列表标签

—显示如下效果

​		国务院

​			外交部

​			工业信息化部

​			...

```html
<dl><dt></dt><dd></dd></dl>
<dl><dt>国务院</dt>
<dd>外交部</dd>
</dl>
dl(definition List定义列表)
dt(definition term 定义术语2)
dd（definition description 定义描述）
<ol>
    <li>外交部</li>
    <li>农业部</li>
</ol>（ol标签中选择type）
ol(Order List有序列表)
li(List term 列表项目)
ul(无序列表)
```



* 图像标签 <img >
  * src:路径
  * width，height：图片大小

### 2.4 超链接标签（有用）

* 连接资源 href：链接资源的地址

  * ```html
    <a href="1list.html" target="_self">
        herf：链接的资源的网址
        target：设置打开方式，默认当前页面打开
    ```

* 定位资源 target：设置打开的方式，默认是当前页面打开

### 2.5 表格标签

* table		 tr(table row)  		td(table datacell)

```html
<table border="2" bordercolor="red" cellpadding="20">
    <!-- 4X3-->
<tr>
    <td>姓名</td>  <td>性别</td>  <td>年龄</td>
</tr>
    <tr>
        <td>张艺兴</td>  <td>男</td>  <td>20</td>
    </tr>
    <tr>
        <td>蔡徐坤</td>  <td>男</td>  <td>20</td>
    </tr>
    <tr>
        <td>祖冲之</td>  <td>男</td>  <td>600</td>
    </tr>
</table>
```

* table中属性 border        bordercolor		cellpadding 
* tr中  align（排列）:left center right
* th(table header cell)
* idea快速生成表格table>tr*4>td3 +table
* 跨行  <td rowspan="3">20</td>
* 跨列  <td colspan="3">人员信息</td>

——————————————————————————————

