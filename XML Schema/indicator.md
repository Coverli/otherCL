## XSD 指示器

通过指示器，我们可以控制在文档中使用元素的方式。有七种指示器：

Order 指示器：

- All
- Choice
- Sequence

Occurrence 指示器：

- maxOccurs
- minOccurs

Group 指示器：

- Group name
- attributeGroup name

## Order 指示器

Order 指示器用于定义元素的顺序。

### All 指示器

\<all> 指示器规定子元素可以按照任意顺序出现，且每个子元素必须只出现一次：

```scheme
<xs:element name="person">
  <xs:complexType>
    <xs:all>
      <xs:element name="firstname" type="xs:string"/>
      <xs:element name="lastname" type="xs:string"/>
    </xs:all>
  </xs:complexType>
</xs:element>
```

**注意：** 当使用 \<all> 指示器时，可以把 \<minOccurs> 设置为 0 或者 1，而只能把 \<maxOccurs> 指示器设置为 1

### Choice 指示器

\<choice> 指示器规定可出现某个子元素或者可出现另外一个子元素（非此即彼）：

```scheme
<xs:element name="person">
  <xs:complexType>
    <xs:choice>
      <xs:element name="employee" type="employee"/>
      <xs:element name="member" type="member"/>
    </xs:choice>
  </xs:complexType>
</xs:element>
```

### Sequence 指示器

\<sequence> 规定子元素必须按照特定的顺序出现：

```scheme
<xs:element name="person">
   <xs:complexType>
    <xs:sequence>
      <xs:element name="firstname" type="xs:string"/>
      <xs:element name="lastname" type="xs:string"/>
    </xs:sequence>
  </xs:complexType>
</xs:element>
```

## Occurrence 指示器

Occurrence 指示器用于定义某个元素出现的频率。

**注意：** 对于所有的 "Order" 和 "Group" 指示器（any、all、choice、sequence、group name 以及 group reference），其中的 maxOccurs 以及 minOccurs 的默认值均为 1。

### maxOccurs 指示器

\<maxOccurs> 指示器可规定某个元素可出现的最大次数：

```scheme
<xs:element name="person">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="full_name" type="xs:string"/>
      <xs:element name="child_name" type="xs:string" maxOccurs="10"/>
    </xs:sequence>
  </xs:complexType>
</xs:element>
```

上面的例子表明，子元素 "child_name" 可在 "person" 元素中最少出现一次（其中 minOccurs 的默认值是 1），最多出现 10 次。

### minOccurs 指示器

\<minOccurs> 指示器可规定某个元素能够出现的最小次数：

```scheme
<xs:element name="person">
  <xs:complexType>
    <xs:sequence>
      <xs:element name="full_name" type="xs:string"/>
      <xs:element name="child_name" type="xs:string" maxOccurs="10" minOccurs="0"/>
    </xs:sequence>
  </xs:complexType>
</xs:element>
```

上面的例子表明，子元素 "child_name" 可在 "person" 元素中出现最少 0 次，最多出现 10 次。

**提示：**如需使某个元素的出现次数不受限制，请使用 maxOccurs="unbounded" 这个声明

## Group 指示器

Group 指示器用于定义相关的数批元素。

### 元素组

元素组通过 group 声明进行定义：

```scheme
<xs:group name="groupname">
...
</xs:group>
```

**注意：**必须在 group 声明内部定义一个 all、choice 或者 sequence 元素。

#### 实例

定义名为 "persongroup" 的 group，它定义了必须按照精确的顺序出现的一组元素：

```scheme
<xs:group name="persongroup">
  <xs:sequence>
    <xs:element name="firstname" type="xs:string"/>
    <xs:element name="lastname" type="xs:string"/>
    <xs:element name="birthday" type="xs:date"/>
  </xs:sequence>
</xs:group>
```

在把 group 定义完毕以后，就可以在另一个定义中引用它了

```scheme
<xs:element name="person" type="personinfo"/>
<xs:complexType name="personinfo">
  <xs:sequence>
    <xs:group ref="persongroup"/>
    <xs:element name="country" type="xs:string"/>
  </xs:sequence>
</xs:complexType>
```

### 属性组

属性组通过 attributeGroup 声明来进行定义：

```scheme
<xs:attributeGroup name="groupname">
...
</xs:attributeGroup>
```

#### 实例

定义名为 "personattrgroup" 的一个属性组：

```scheme
<xs:attributeGroup name="personattrgroup">
  <xs:attribute name="firstname" type="xs:string"/>
  <xs:attribute name="lastname" type="xs:string"/>
  <xs:attribute name="birthday" type="xs:date"/>
</xs:attributeGroup>
```

在已定义完毕属性组之后，就可以在另一个定义中引用它了：

```scheme
<xs:element name="person">
  <xs:complexType>
    <xs:attributeGroup ref="personattrgroup"/>
  </xs:complexType>
</xs:element>
```

