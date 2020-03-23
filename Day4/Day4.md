Day4

## 案例1 在末尾添加节点

* 第一步：用Get Id方法获得ul标签

* 第二步：创建li标签 document.createElement

* 第三步：创建text文本

* 第四步：把文本添加到li

* 第五步：把li添加到ul
## 2.元素对象

* 先用document里的方法获取element，然后再进行操作

* 方法：

  * 获取，设置，删除 属性里的值：get,set  remove （不能删除value）  

    ```js
    input1.setAttribute("class","class2");
    alert(input1.getAttribute("class"))
    ```

  

## 3.Node对象的属性其一

* nodeName

* nodeType

* nodeVaule

* 使用dom解析HTML时，需要HTML里面的标签，属性和文本都封装成对象

  ```js
  //获取标签对象
  	var span1 = document.getElementById("span1");
      alert(span1.nodeName);//span
      alert(span1.nodeValue);//null
      alert(span1.nodeType);//1
  
  //获取属性（在标签上）
      var id1= span1.getAttributeNode("id");
      alert(id1.nodeType);//2
      alert(id1.nodeValue);//span1
      alert(id1.nodeName);//id
  
  // 获取文本
      var text1 =span1.firstChild;
      alert(text1.nodeName);//#text
      alert(text1.nodeValue);//Java核心技术卷一
      alert(text1.nodeType);//3
  ```

  

## 4. Node对象的属性其二

* 父节点ul

  * parentNode ：得到父节点

  ```js
  <ul>
      <li>英语四级</li>
      <li>日语四级</li>
  </ul>
  ```

* 子节点li

  * ChildNodes：获取所有节点
  * firstchild： 获取第一个子节点
  * lastchild：获取最后一个子节点

* 同辈节点 nextsibling  previoussibling



## 5. 操作Dom树

* 插入节点

  * appendChild()

    -将子节点添加到末尾

    -特点：类似于剪切黏贴的关系

    

  * insertBefore(newNode,oldNode)方法

    -在某个节点之前插入一个新的节点

    -两个参数

    ​		--要插入的节点

    ​		--在谁之前插入

    -插入一个节点，节点不存在，创建

    ​		-1. 创建标签

    ​		-2创建文本

    ​		-3把文本添加到标签下面

  * removeChild（）

    ```html
    ul1.removeChild(li4);
    ```

  * replacChild（newNode，oldNode）

  * cloneNode 复制节点

* dom总结

  * 获取节点的使用方法

    --getElementById（）

    --getElementByName()

    --getElementByTagName()

  * 插入节点的方法

    --insertBefore

    --appendChild：在末尾添加

  * 删除节点的方法

    -removeChild

  * 替换

    replaceChild: 特点：通过父节点

  

## 6. innerHTML（***）

* 这个属性不是dom的组成部分

第一个作用：获取文本内容

第二个作用：想标签里设置代码



## 7. 案例2 动态显示时间（***）

* 得到当前时间

  var date = new Date();

  var d1 = date.toLocaleString();

* 每一秒获取时间

  setInterval方法

* 显示到页面上

  向div写时间

  ```js
  <div id="time">
  
  </div>
  <script type="text/javascript">
      function gettime() {
      var date =new Date();
      var date1=date.toLocaleString();
      var clock= document.getElementById("time");
      clock.innerHTML =date1;
      }
      //使用定时器实现
      setInterval("gettime()","1000");//用到了定时器
  </script>
  ```

  

## 8.案例三：全选练习

-创建一个页面

​		-复选框和按钮

​				-四个复选框表示爱好

​				-三个按钮：全选，全部选，反选

​		-步骤 checked的状态

## 9.案例四：下拉列表左右选择分析

* 下拉选择框

  ```
  <select >
      <option>111</option>
      <option>222</option>
      <option>333</option>
  </select>
  ```

```
1.获取select里的option
-getElementsBuTagName()返回数组
-遍历数组，得到每一个option
2.判断是否被选中
-属性selected
3.选中，放到右边
4.得到select2
5.添加选择方法
-appendchild()
```

## 10.案例5：省市联动

