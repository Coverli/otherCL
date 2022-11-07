## \<schema> 元素

\<schema> 元素是每一个 XML Schema 的根元素，\<schema> 元素可包含属性。一个 schema 声明往往看上去类似这样：

```scheme
<?xml version="1.0"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
	targetNamespace="http://www.runoob.com"
	xmlns="http://www.runoob.com"
	elementFormDefault="qualified">
...
...
</xs:schema>
```

* xmlns:xs="http://www.w3.org/2001/XMLSchema"：显示 schema 中用到的元素和数据类型来自命名空间 "http://www.w3.org/2001/XMLSchema"。同时它还规定了来自命名空间 "http://www.w3.org/2001/XMLSchema" 的元素和数据类型应该使用前缀 xs

* targetNamespace="http://www.runoob.com"：显示被此 schema 定义的元素 (note, to, from, heading, body) 来自命名空间 "http://www.runoob.com"。

* xmlns="http://www.runoob.com"：指出默认的命名空间是 "http://www.runoob.com"。
* elementFormDefault="qualified"：指出任何 XML 实例文档所使用的且在此 schema 中声明过的元素必须被命名空间限定。

## XML 文档中引用 Schema

```xml
<?xml version="1.0"?>
<note xmlns="http://www.runoob.com"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.runoob.com note.xsd">

    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
</note>
```

* xmlns="http://www.runoob.com"：规定了默认命名空间的声明。此声明会告知 schema 验证器，在此 XML 文档中使用的所有元素都被声明于 "http://www.runoob.com" 这个命名空间。
* **xmlns:xsi** 定义了一个命名空间前缀 xsi 对应的唯一字符串 http://www.w3.org/2001/XMLSchema-instance。 但是这个 xmlns:xsi 在不同的 xml 文档中似乎都会出现。 这是因为， xsi 已经成为了一个业界默认的用于 XSD(（XML Schema Definition) 文件的命名空间。

```scheme
xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd"
```

上面这行的语法其实是：

```scheme
xsi:schemaLocation = "键" "值"
```

即 xsi 命名空间下 schemaLocation 元素的值为一个由空格分开的键值对。

前一个"键" http://maven.apache.org/POM/4.0.0 指代 【命名空间】， 只是一个全局唯一字符串而已。

后一个值指代 【XSD location URI】 , 这个值指示了前一个命名空间所对应的 XSD 文件的位置， xml parser 可以利用这个信息获取到 XSD 文件， 从而通过 XSD 文件对所有属于 命名空间 http://maven.apache.org/POM/4.0.0 的元素结构进行校验， 因此这个值必然是可以访问的， 且访问到的内容是一个 XSD 文件的内容。