##  \<any> 元素

\<any> 元素可以通过未被 schema 规定的元素来拓展 XML 文档！

下面这个例子是从名为 "family.xsd" 的 XML schema 中引用的片段。它展示了一个针对 "person" 元素的声明。

通过使用 \<any> 元素，可以通过任何元素（在 \<lastname> 之后）扩展 "person" 的内容：

```scheme
<xs:element name="person">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="firstname" type="xs:string"/>
      <xs:element name="lastname" type="xs:string"/>
      <xs:any minOccurs="0"/>
    </xs:sequence>
  </xs:complexType>
</xs:element>
```

现在，使用 "children" 元素来扩展 "person" 元素。这此种情况下可以这么做，即使以上这个 schema 的作者没有声明任何 "children" 元素。

请看这个 schema 文件，名为 "children.xsd"：

```scheme
<?xml version="1.0" encoding="ISO-8859-1"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
				targetNamespace="http://www.w3schools.com"
				xmlns="http://www.w3schools.com"
				elementFormDefault="qualified">

    <xs:element name="children">
      <xs:complexType>
        <xs:sequence>
          <xs:element name="childname" type="xs:string" maxOccurs="unbounded"/>
        </xs:sequence>
      </xs:complexType>
    </xs:element>
</xs:schema>
```

下面这个 XML 文件（名为 "Myfamily.xml"），使用了来自两个不同的 schema 中的成分，"family.xsd" 和 "children.xsd"：

```scheme
<?xml version="1.0" encoding="ISO-8859-1"?>
<persons xmlns="http://www.microsoft.com"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:schemaLocation="http://www.microsoft.com family.xsd
						   http://www.w3schools.com children.xsd">

    <person>
      <firstname>Hege</firstname>
      <lastname>Refsnes</lastname>
      <children>
        <childname>Cecilie</childname>
      </children>
    </person>
</persons>
```

上面这个 XML 文件是有效的，这是由于 schema "family.xsd" 允许我们通过在 "lastname" 元素后的可选元素来扩展 "person" 元素。

\<any> 和 \<anyAttribute> 均可用于制作可扩展的文档！它们使文档有能力包含未在主 XML schema 中声明过的附加元素。

## \<anyAttribute> 元素

\<anyAttribute> 元素可以通过未被 schema 规定的属性来扩展 XML 文档！

下面的例子是来自名为 "family.xsd" 的 XML schema 的一个片段。它展示了针对 "person" 元素的一个声明。通过使用 \<anyAttribute> 元素，就可以向 "person" 元素添加任意数量的属性：

```scheme
<xs:element name="person">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="firstname" type="xs:string"/>
      <xs:element name="lastname" type="xs:string"/>
    </xs:sequence>
    <xs:anyAttribute/>
  </xs:complexType>
</xs:element>
```

现在通过 "gender" 属性来扩展 "person" 元素。在这种情况下就可以这样做，即使这个 schema 的作者从未声明过任何 "gender" 属性。

请看这个 schema 文件，名为 "attribute.xsd"：

```scheme
<?xml version="1.0" encoding="ISO-8859-1"?>
<xs:schema xmlns:xs="http://www.w3.org/2001/XMLSchema"
				targetNamespace="http://www.w3schools.com"
				xmlns="http://www.w3schools.com"
				elementFormDefault="qualified">

    <xs:attribute name="gender">
      <xs:simpleType>
        <xs:restriction base="xs:string">
          <xs:pattern value="male|female"/>
        </xs:restriction>
      </xs:simpleType>
    </xs:attribute>
</xs:schema>
```

下面这个 XML（名为 "Myfamily.xml"），使用了来自不同 schema 的成分，"family.xsd" 和 "attribute.xsd"：

```scheme
<?xml version="1.0" encoding="ISO-8859-1"?>
<persons xmlns="http://www.microsoft.com"
		xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		xsi:SchemaLocation="http://www.microsoft.com family.xsd
						  http://www.w3schools.com attribute.xsd">

    <person gender="female">
      <firstname>Hege</firstname>
      <lastname>Refsnes</lastname>
    </person>
    <person gender="male">
      <firstname>Stale</firstname>
      <lastname>Refsnes</lastname>
    </person>
</persons>
```

上面这个 XML 文件是有效的，这是因为 schema "family.xsd" 允许我们向 "person" 元素添加属性。

\<any> 和 \<anyAttribute> 均可用于制作可扩展的文档！它们使文档有能力包含未在主 XML schema 中声明过的附加元素。