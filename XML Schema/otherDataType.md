## 布尔数据类型

布尔数据类型（Boolean Data Type）用于规定 true 或 false 值。

关于 scheme 中逻辑声明的例子

```scheme
<xs:attribute name="disabled" type="xs:boolean"/>
```

```xml
<prize disabled="true">999</prize>
```

**注意：** 合法的布尔值是 true、false、1（表示 true） 以及 0（表示 false）。

## 二进制数据类型

二进制数据类型（Binary Data Types）用于表达二进制形式的数据。

我们可使用两种二进制数据类型：

- base64Binary (Base64 编码的二进制数据)
- hexBinary (十六进制编码的二进制数据)

关于 scheme 中 hexBinary 声明的例子：

```scheme
<xs:element name="blobsrc" type="xs:hexBinary"/>
```

```xml
<blobsrc>0100010</blobsrc>
```

## AnyURI 数据类型

anyURI 数据类型（AnyURI Data Type）用于规定 URI。

关于 scheme 中 anyURI 声明的例子：

```scheme
<xs:attribute name="src" type="xs:anyURI"/>
```

```xml
<pic src="http://www.w3schools.com/images/smiley.gif" />
```

**注意：** 如果某个 URI 含有空格，请用 %20 替换它们。

## 杂项数据类型

| 名称         | 描述                      |
| :----------- | :------------------------ |
| anyURI       | 用于规定 URI              |
| base64Binary | Base64 编码的二进制数据   |
| boolean      | 用于规定 true 或 false 值 |
| double       |                           |
| float        |                           |
| hexBinary    | 十六进制编码的二进制数据  |
| NOTATION     |                           |
| QName        |                           |

## 对杂项数据类型的限定

可与杂项数据类型一同使用的限定：

- enumeration (布尔数据类型无法使用此约束*)
- length (布尔数据类型无法使用此约束)
- maxLength (布尔数据类型无法使用此约束)
- minLength (布尔数据类型无法使用此约束)
- pattern
- whiteSpace

