## 什么是简易元素？

简易元素指那些仅包含文本的元素。它不会包含任何其他的元素或属性。

不过，"仅包含文本"这个限定却很容易造成误解。文本有很多类型。它可以是 XML Schema 定义中包括的类型中的一种（布尔、字符串、数据等等），或者它也可以是您自行定义的定制类型。

也可向数据类型添加限定（即 facets），以此来限制它的内容，或者您可以要求数据匹配某种特定的模式。

## 定义简易元素

```scheme
<xs:element name="xxx" type="yyy"/>
```

此处 xxx 指元素的名称，yyy 指元素的数据类型。XML Schema 拥有很多内建的数据类型。

### 最常用的数据类型是：

- xs:string
- xs:decimal
- xs:integer
- xs:boolean
- xs:date
- xs:time

### 实例

```xml
<lastname>Refsnes</lastname>
<age>36</age>
<dateborn>1970-03-27</dateborn>
```

```scheme
<xs:element name="lastname" type="xs:string"/>
<xs:element name="age" type="xs:integer"/>
<xs:element name="dateborn" type="xs:date"/>
```

## 默认值和固定值

简易元素可拥有指定的默认值或固定值。

当没有其他的值被规定时，默认值就会自动分配给元素。

固定值同样会自动分配给元素，并且您无法规定另外一个值。

```scheme
<!-- 默认值是 "red" -->
<xs:element name="color" type="xs:string" default="red"/>
<!-- 固定值是 "red" -->
<xs:element name="color" type="xs:string" fixed="red"/>
```

