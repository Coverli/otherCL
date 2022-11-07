## 声明一个元素

在 DTD 中，XML 元素通过元素声明来进行声明。元素声明使用下面的语法：

```dtd
<!ELEMENT element-name category>
或
<!ELEMENT element-name (element-content)>
```

element-name：元素名称

category：类别

element-content：元素内容

## 空元素

空元素通过类别关键词EMPTY进行声明：

```dtd
<!ELEMENT element-name EMPTY>
实例:
<!ELEMENT br EMPTY>
XML文件:
<br/>
```

## 只有 PCDATA 的元素

只有 PCDATA 的元素通过圆括号中的 #PCDATA 进行声明：

```dtd
<!ELEMENT element-name (#PCDATA)>
实例:
<!ELEMENT from (#PCDATA)>
```

## 带有任何内容的元素

通过类别关键词 ANY 声明的元素，可包含任何可解析数据的组合：

```dtd
<!ELEMENT element-name ANY>
实例:
<!ELEMENT note ANY>
```

## 带有子元素（序列）的元素

带有一个或多个子元素的元素通过圆括号中的子元素名进行声明：

```dtd
<!ELEMENT element-name (child1)>
或
<!ELEMENT element-name (child1,child2,...)>

实例:
<!ELEMENT note (to,from,heading,body)>
```

当子元素按照由逗号分隔开的序列进行声明时，这些子元素必须按照相同的顺序出现在文档中。

在一个完整的声明中，子元素也必须被声明，同时子元素也可拥有子元素。

## 声明只出现一次的元素

```dtd
<!ELEMENT element-name (child-name)>

实例:
<!ELEMENT note (message)>
```

声明了：message 子元素必须出现一次，并且必须只在 "note" 元素中出现一次。

## 声明最少出现一次的元素

```dtd
<!ELEMENT element-name (child-name+)>

实例:
<!ELEMENT note (message+)>
```

中的加号（+）声明了：message 子元素必须在 "note" 元素内出现至少一次。

## 声明出现零次或多次的元素

```dtd
<!ELEMENT element-name (child-name*)>

实例:
<!ELEMENT note (message*)>
```

中的星号（*）声明了：子元素 message 可在 "note" 元素内出现零次或多次。

## 声明出现零次或一次的元素

```dtd
<!ELEMENT element-name (child-name?)>

实例:
<!ELEMENT note (message?)>
```

中的问号(?)声明了：子元素 message 可在 "note" 元素内出现零次或一次。

## 声明"非.../即..."类型的内容

```dtd
实例:
<!ELEMENT note (to,from,header,(message|body))>
```

"note" 元素必须包含 "to" 元素、"from" 元素、"header" 元素，以及非 "message" 元素即 "body" 元素。

## 声明混合型的内容

```dtd
实例:
<!ELEMENT note (#PCDATA|to|from|header|message)*>
```

"note" 元素可包含出现零次或多次的 PCDATA、"to"、"from"、"header" 或者 "message"。
