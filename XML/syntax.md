## 首行必须有XML 声明

第一行是 XML 声明。它定义 XML 的版本（1.0）和所使用的编码

```xml
<?xml version="1.0" encoding="UTF-8">
```

## XML 文档必须有根元素

XML 必须包含根元素，它是所有其他元素的父元素，比如以下实例中 root 就是根元素

```xml
<root>
  <child>
    <subchild>.....</subchild>
  </child>
</root>
```

## 元素

### XML 命名规则

XML 元素必须遵循以下命名规则：

- 名称可以包含字母、数字以及其他的字符
- 名称不能以数字或者标点符号开始
- 名称不能以字母 xml（或者 XML、Xml 等等）开始
- 名称不能包含空格

可使用任何名称，没有保留的字词。

### 最佳命名习惯

名称具有描述性。使用下划线的名称也可以：<first_name>、<last_name>

名称应简短和简单，比如：<book_title>，而不是：<the_title_of_the_book>

避免 "-" 字符。如果按照这样的方式进行命名："first-name"，一些软件会认为从 first 里边减去 name。

避免 "." 字符。如果按照这样的方式进行命名："first.name"，一些软件会认为 "name" 是对象 "first" 的属性

避免 ":" 字符。冒号会被转换为命名空间来使用

XML 文档经常有一个对应的数据库，其中的字段会对应 XML 文档中的元素。有一个实用的经验，即使用数据库的命名规则来命名 XML 文档中的元素。在 XML 中，éòá 等非英语字母是完全合法的，不过需要留意，您的软件供应商不支持这些字符时可能出现的问题。

### XML 元素是可扩展的

XML 元素是可扩展，以携带更多的信息。

#### 实例

原 XML 文档

```xml
<note>
    <to>Tove</to>
    <from>Jani</from>
    <body>Don't forget me this weekend!</body>
</note>
```

往 XML 文档添加的一些额外信息

```xml
<note>
    <date>2008-01-10</date>
    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
</note>
```

那么读取XML文档的应用程序会中断或崩溃吗？

不会。这个应用程序仍然可以找到 XML 文档中的 <to>、<from> 以及 <body> 元素，并产生同样的输出。

XML 的优势之一，就是可以在不中断应用程序的情况下进行扩展。

### XML元素必须有关闭标签

在 XML 中，省略关闭标签是非法的。所有元素都**必须**有关闭标签

注意：声明不是 XML 文档本身的一部分，它没有关闭标签

### XML 标签对大小写敏感

XML 标签对大小写敏感。标签 <Letter> 与标签 <letter> 是不同的。

必须使用相同的大小写来编写打开标签和关闭标签：

```xml
<Message>这是错误的</message>
<message>这是正确的</message>
```

### XML 必须正确嵌套

在 **HTML** 中，常会看到没有正确嵌套的元素：

```html
<b><i>This text is bold and italic</b></i>
```

在 **XML** 中，所有元素都**必须**彼此正确地嵌套：

```xml
<b><i>This text is bold and italic</i></b>
```

## 属性

### XML 属性值必须加引号

与 HTML 类似，XML 元素也可拥有属性（名称/值的对）。

在 XML 中，XML 的属性值必须加引号，单引号或双引号都行。

如果属性值本身包含双引号，可以使用单引号。

```xml
<!-- 错误 -->
<person sex=female>
<!-- 正确 -->
<person sex="female">
<!-- 正确 -->
<person sex='female'>
<!-- 正确 -->
<gangster name='George "Shotgun" Ziegler'>
<!-- 或者使用字符实体 -->
<gangster name="George &quot;Shotgun&quot; Ziegler">
```

### 一个元素多个属性

一个元素可以有多个属性，它的基本格式为：

```xml
<元素名 属性名1="属性值1" 属性名2="属性值2">
```

### 属性名的唯一性

特定的属性名称在同一个元素标记中只能出现一次

### 属性值

属性值不能包括 <,>,&，如果一定要包含，也要使用实体

### 元素 vs. 属性

```xml
<person sex="female">
    <firstname>Anna</firstname>
    <lastname>Smith</lastname>
</person>
```

```xml
<person>
    <sex>female</sex>
    <firstname>Anna</firstname>
    <lastname>Smith</lastname>
</person>
```

在第一个实例中，sex 是一个属性。在第二个实例中，sex 是一个元素。这两个实例都提供相同的信息。

没有什么规矩规定什么时候该使用属性，什么时候该使用元素。在 HTML 中，属性用起来很便利，但是在 XML 中，应该尽量避免使用属性。

#### 实例：三个XML文档包含完全相同的信息

```xml
<!-- 使用 date 属性 -->
<note date="10/01/2008">
    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
</note>
```

```xml
<!-- 使用 date 元素 -->
<note>
    <date>10/01/2008</date>
    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
</note>
```

```xml
<!-- 使用了扩展的 date 元素 -->
<note>
    <date>
        <day>10</day>
        <month>01</month>
        <year>2008</year>
    </date>
    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
</note>
```

### 避免 XML 属性引起的问题

因使用属性而引起的一些问题：

- 属性不能包含多个值（元素可以）
- 属性不能包含树结构（元素可以）
- 属性不容易扩展（为未来的变化）

属性难以阅读和维护。请尽量使用元素来描述数据。使用属性来提供与数据无关的信息。

```xml
<!-- 不推荐 -->
<note day="10" month="01" year="2008"
to="Tove" from="Jani" heading="Reminder"
body="Don't forget me this weekend!">
</note>
```

## 实体引用

在 XML 中，一些字符拥有特殊的意义。

如果把字符 "<" 放在 XML 元素中，会发生错误，这是因为解析器会把它当作新元素的开始。为了避免这个错误，请用**实体引用**来代替 "<" 字符

```xml
<!-- 错误 -->
<message>if salary < 1000 then</message>
<!-- 正确 -->
<message>if salary &lt; 1000 then</message>
```

在 XML 中，有 5 个预定义的实体引用：

| 字符 | 实体引用 |
| ---- | -------- |
| <    | \&lt;    |
| >    | \&gt;    |
| &    | \&amp;   |
| '    | \&apos;  |
| "    | \&quot;  |

**注释：**在 XML 中，只有字符 "<" 和 "&" 确实是非法的。大于号是合法的，但是用实体引用来代替它是一个好习惯。

## XML 中的注释

在 XML 中编写注释的语法与 HTML 的语法很相似。

```xml
<!-- This is a comment -->
```

## XML的空格会被保留

HTML 会把多个连续的空格字符裁减（合并）为一个

在 XML 中，文档中的空格不会被删减。

| 输入和输出 | 源码和结果                        |
| ---------- | --------------------------------- |
| HTML       | `<p>Hello              World</p>` |
| 输出结果   | Hello World                       |
| XML        | `<p>Hello              World</p>` |
| 输出结果   | Hello              World          |

