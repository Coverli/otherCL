## DTD - 属性

在 DTD 中，属性通过 ATTLIST 声明来进行声明。

## 声明属性

属性声明使用下列语法：

```dtd
<!ATTLIST element-name attribute-name attribute-type attribute-value>

DTD 实例:
<!ATTLIST payment type CDATA "check">

XML 实例:
<payment type="check" />
```

* attribute-name：属性名字

* attribute-type：属性类型

* attribute-value：属性值

以下是 **属性类型**的选项：

| 类型            | 描述                          |
| --------------- | ----------------------------- |
| CDATA           | 值为字符数据 (character data) |
| (en1\|en2\|...) | 此值是枚举列表中的一个值      |
| ID              | 值为唯一的 id                 |
| IDREF           | 值为另外一个元素的 id         |
| IDREFS          | 值为其他 id 的列表            |
| NMTOKEN         | 值为合法的 XML 名称           |
| NMTOKENS        | 值为合法的 XML 名称的列表     |
| ENTITY          | 值是一个实体                  |
| ENTITYS         | 值是一个实体列表              |
| NOTATION        | 此值是符号的名称              |
| xml:            | 值是一个预定义的 XML 值       |

默认**属性值**可使用下列值 :

| 值           | 解释           |
| ------------ | -------------- |
| 默认属性值   | 属性的默认值   |
| #REQUIRED    | 属性值是必需的 |
| \#IMPLIED    | 属性不是必需的 |
| #FIXED value | 属性值是固定的 |

## 默认属性值

```dtd
DTD:
<!ELEMENT square EMPTY>
<!ATTLIST square width CDATA "0">

合法的 XML:
<square width="100" />
```

"square" 被定义为带有 CDATA 类型的 "width" 属性的空元素。如果宽度没有被设定，其默认值为0 

## #REQUIRED

语法

```dtd
<!ATTLIST element-name attribute-name attribute-type #REQUIRED>
```

实例

```dtd
DTD:
<!ATTLIST person number CDATA #REQUIRED>

合法的 XML:
<person number="5677" />

非法的 XML:
<person/>
```

## #IMPLIED

语法

```dtd
<!ATTLIST element-name attribute-name attribute-type #IMPLIED>
```

实例

```dtd
DTD:
<!ATTLIST contact fax CDATA #IMPLIED>

合法的 XML:
<contact fax="555-667788" />

合法的 XML:
<contact/>
```

## #FIXED

语法

```dtd
<!ATTLIST element-name attribute-name attribute-type #FIXED "value">
```

实例

```dtd
DTD:
<!ATTLIST sender company CDATA #FIXED "Microsoft">

合法的 XML:
<sender company="Microsoft" />

非法的 XML:
<sender company="W3Schools" />
```

## 列举属性值

语法

```dtd
<!ATTLIST element-name attribute-name (en1|en2|..) default-value>
```

实例

```dtd
DTD:
<!ATTLIST payment type (check|cash) "cash">

XML 例子:
<payment type="check" />
或
<payment type="cash" />
```

