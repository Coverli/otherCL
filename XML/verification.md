## XML 验证

拥有正确语法的 XML 被称为"形式良好"的 XML。

通过验证的XML是"合法"的 XML。

## 验证 XML 文档

合法的 XML 文档是"形式良好"的 XML 文档，这也符合文档类型定义（DTD）的规则：

```xml
<?xml version="1.0" encoding="ISO-8859-1"?>
<!DOCTYPE note SYSTEM "Note.dtd">
<note>
    <to>Tove</to>
    <from>Jani</from>
    <heading>Reminder</heading>
    <body>Don't forget me this weekend!</body>
</note>
```

在上面的实例中，DOCTYPE 声明是对外部 DTD 文件的引用。

## XML DTD

DTD 的目的是定义 XML 文档的结构。它使用一系列合法的元素来定义文档结构

```dtd
<!DOCTYPE note
[
    <!ELEMENT note (to,from,heading,body)>
    <!ELEMENT to (#PCDATA)>
    <!ELEMENT from (#PCDATA)>
    <!ELEMENT heading (#PCDATA)>
    <!ELEMENT body (#PCDATA)>
]>
```

## XML Schema

W3C 支持一种基于 XML 的 DTD 代替者，它名为 XML Schema

```schema
<xs:element name="note">
    <xs:complexType>
        <xs:sequence>
            <xs:element name="to" type="xs:string"/>
            <xs:element name="from" type="xs:string"/>
            <xs:element name="heading" type="xs:string"/>
            <xs:element name="body" type="xs:string"/>
        </xs:sequence>
    </xs:complexType>
</xs:element>
```

