## DTD - 实体

实体是用于定义引用普通文本或特殊字符的快捷方式的变量。

- 实体引用是对实体的引用。
- 实体可在内部或外部进行声明。

## 内部实体声明

语法

```dtd
<!ENTITY entity-name "entity-value">
```

实例

```dtd
DTD 实例:
<!ENTITY writer "Donald Duck.">
<!ENTITY copyright "Copyright runoob.com">

XML 实例：
<author>&writer;&copyright;</author>
```

**注意：** 一个实体由三部分构成: 一个和号 (&), 一个实体名称, 以及一个分号 (;)。

## 外部实体声明

语法

```dtd
<!ENTITY entity-name SYSTEM "URI/URL">
```

实例

```dtd
DTD 实例:
<!ENTITY writer SYSTEM "http://www.runoob.com/entities.dtd">
<!ENTITY copyright SYSTEM "http://www.runoob.com/entities.dtd">

XML example:
<author>&writer;&copyright;</author>
```

