## XML 命名空间

XML 命名空间提供避免元素命名冲突的方法。

## 命名冲突

在 XML 中，元素名称是由开发者定义的，当两个不同的文档使用相同的元素名时，就会发生命名冲突。例如：

```xml
<!-- XML携带HTML表格的信息 -->
<table>
    <tr>
        <td>Apples</td>
        <td>Bananas</td>
    </tr>
</table>
```

```xml
<!-- XML文档携带有关桌子的信息 -->
<table>
    <name>African Coffee Table</name>
    <width>80</width>
    <length>120</length>
</table>
```

假如以上两个 XML 文档被一起使用，但由于两个文档都包含带有不同内容和定义的 <table> 元素，就会发生命名冲突。XML 解析器无法确定如何处理这类冲突。

## 使用前缀来避免命名冲突

在 XML 中的命名冲突可以通过使用名称前缀从而容易地避免。

```xml
<h:table>
    <h:tr>
        <h:td>Apples</h:td>
        <h:td>Bananas</h:td>
    </h:tr>
</h:table>
<f:table>
    <f:name>African Coffee Table</f:name>
    <f:width>80</f:width>
    <f:length>120</f:length>
</f:table>
```

## xmlns 属性

当在 XML 中使用前缀时，一个所谓的用于前缀的**命名空间**必须被定义。

命名空间是在元素的开始标签的 **xmlns 属性**中定义的。

命名空间声明的语法如下。xmlns:*前缀*="*URI*"。

```xml
<root>
    <h:table xmlns:h="http://www.w3.org/TR/html4/">
        <h:tr>
            <h:td>Apples</h:td>
            <h:td>Bananas</h:td>
        </h:tr>
    </h:table>
    <f:table xmlns:f="http://www.w3cschool.cc/furniture">
        <f:name>African Coffee Table</f:name>
        <f:width>80</f:width>
        <f:length>120</f:length>
    </f:table>
</root>
```

在上面的实例中，<table> 标签的 xmlns 属性定义了 h: 和 f: 前缀的合格命名空间。

当命名空间被定义在元素的开始标签中时，所有带有相同前缀的子元素都会与同一个命名空间相关联。

命名空间，可以在他们被使用的元素中或者在 XML 根元素中声明：

```xml
<root xmlns:h="http://www.w3.org/TR/html4/"
xmlns:f="http://www.w3cschool.cc/furniture">
    <h:table>
        <h:tr>
            <h:td>Apples</h:td>
            <h:td>Bananas</h:td>
        </h:tr>
    </h:table>
    <f:table>
        <f:name>African Coffee Table</f:name>
        <f:width>80</f:width>
        <f:length>120</f:length>
    </f:table>
</root>
```

**注释：**命名空间 URI 不会被解析器用于查找信息。

**统一资源标识符**（URI）是一串可以标识因特网资源的字符。

最常用的 URI 是用来标识因特网域名地址的**统一资源定位器**（URL）。另一个不那么常用的 URI 是**统一资源命名**（URN）

## 默认的命名空间

为元素定义默认的命名空间可以让我们省去在所有的子元素中使用前缀的工作。它的语法如下：

xmlns="*namespaceURI*"

```xml
<!-- XML携带HTML表格的信息 -->
<table xmlns="http://www.w3.org/TR/html4/">
    <tr>
        <td>Apples</td>
        <td>Bananas</td>
    </tr>
</table>
```

```xml
<!-- XML文档携带有关桌子的信息 -->
<table xmlns="http://www.w3schools.com/furniture">
    <name>African Coffee Table</name>
    <width>80</width>
    <length>120</length>
</table>
```

