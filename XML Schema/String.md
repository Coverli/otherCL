## 字符串数据类型

字符串数据类型（String Data Type）可包含字符、换行、回车以及制表符。

关于 scheme 中字符串声明的例子：

```scheme
<xs:element name="customer" type="xs:string"/>
```

```xml
<customer>John Smith</customer>
<customer>       John Smith     </customer>
```

**注意：**如果使用字符串数据类型，XML 处理器就不会更改其中的值。

## 规格化字符串数据类型

规格化字符串数据类型（NormalizedString Data Type）源自于字符串数据类型。

规格化字符串数据类型同样可包含字符，但是 XML 处理器会移除折行，回车以及制表符。

关于 scheme 中规格化字符串数据类型声明的例子：

```scheme
<xs:element name="customer" type="xs:normalizedString"/>
```

```xml
<customer>John Smith</customer>
<customer>     John Smith     </customer>
```

**注意：**在上面的例子中，XML 处理器会使用空格替换所有的制表符。

## Token 数据类型

Token 数据类型（Token Data Type）同样源自于字符串数据类型。

Token 数据类型同样可包含字符，但是 XML 处理器会移除换行符、回车、制表符、开头和结尾的空格以及（连续的）空格。

关于 scheme 中 token 声明的例子：

```scheme
<xs:element name="customer" type="xs:token"/>
```

```xml
<customer>John Smith</customer>
<customer>     John Smith     </customer>
```

**注意：**在上面这个例子中，XML 解析器会移除制表符。

## 字符串数据类型

请注意，所有以下的数据类型均衍生于字符串数据类型（除了字符串数据类型本身）！

| 名称             | 描述                                                         |
| :--------------- | :----------------------------------------------------------- |
| ENTITIES         |                                                              |
| ENTITY           |                                                              |
| ID               | 在 XML 中提交 ID 属性的字符串 (仅与 schema 属性一同使用)     |
| IDREF            | 在 XML 中提交 IDREF 属性的字符串(仅与 schema 属性一同使用)   |
| IDREFS language  | 包含合法的语言 id 的字符串                                   |
| Name             | 包含合法 XML 名称的字符串                                    |
| NCName           |                                                              |
| NMTOKEN          | 在 XML 中提交 NMTOKEN 属性的字符串 (仅与 schema 属性一同使用) |
| NMTOKENS         |                                                              |
| normalizedString | 不包含换行符、回车或制表符的字符串                           |
| QName            |                                                              |
| string           | 字符串                                                       |
| token            | 不包含换行符、回车或制表符、开头或结尾空格或者多个连续空格的字符串 |

## 对字符串数据类型的限定

可与字符串数据类型一同使用的限定：

- enumeration
- length
- maxLength
- minLength
- pattern (NMTOKENS、IDREFS 以及 ENTITIES 无法使用此约束)
- whiteSpace

