## 元素替换

通过 XML Schema，一个元素可对另一个元素进行替换。

在 XML schema 中定义一个 substitutionGroup。首先声明主元素，然后声明次元素，这些次元素可声明它们能够替换主元素。

```scheme
<xs:element name="name" type="xs:string"/>
<xs:element name="navn" substitutionGroup="name"/>
```

在上面的例子中，"name" 元素是主元素，而 "navn" 元素可替代 "name" 元素。

有效的 XML 文档如下（根据上面的 schema）：

```xml
<name>John Smith</name>
等价于
<navn>John Smith</navn>
```

## 阻止元素替换

为防止其他的元素替换某个指定的元素，请使用 block 属性：

```scheme
<xs:element name="name" type="xs:string" block="substitution"/>
<xs:element name="navn" substitutionGroup="name"/>
```

```xml
合法的 XML 文档:
<name>John Smith</name>
不合法的 XML 文档:
<navn>John Smith</navn>
```

## 使用 substitutionGroup

可替换元素的类型必须和主元素相同，或者从主元素衍生而来。假如可替换元素的类型与主元素的类型相同，那就不必规定可替换元素的类型了。

请注意，substitutionGroup 中的所有元素（主元素和可替换元素）必须被声明为全局元素，否则就无法工作！

全局元素指 "schema" 元素的直接子元素！本地元素（Local elements）指嵌套在其他元素中的元素。