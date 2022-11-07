## 什么是属性？

简易元素无法拥有属性。假如某个元素拥有属性，它就会被当作某种复合类型。但是属性本身总是作为简易类型被声明的。

## 声明属性

```scheme
<xs:attribute name="xxx" type="yyy"/>
```

xxx 指属性名称，yyy 则规定属性的数据类型。XML Schema 拥有很多内建的数据类型

### 最常用的类型是

- xs:string
- xs:decimal
- xs:integer
- xs:boolean
- xs:date
- xs:time

### 实例

```xml
<lastname lang="EN">Smith</lastname>
```

```scheme
<xs:attribute name="lang" type="xs:string"/>
```

## 默认值和固定值

属性可拥有指定的默认值或固定值。

当没有其他的值被规定时，默认值就会自动分配给元素。

固定值同样会自动分配给元素，并且您无法规定另外的值。

```scheme
<!-- 默认值是"EN" -->
<xs:attribute name="lang" type="xs:string" default="EN"/>
<!-- 固定值是"EN" -->
<xs:attribute name="lang" type="xs:string" fixed="EN"/>
```

## 可选的和必需的属性

在默认的情况下，属性是可选的。如需规定属性为必选，请使用 "use" 属性：

```scheme
<xs:attribute name="lang" type="xs:string" use="required"/>
```

