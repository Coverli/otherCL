## DTD 简介

文档类型定义（DTD）可定义合法的XML文档构建模块。它使用一系列合法的元素来定义文档的结构。

DTD 可被成行地声明于 XML 文档中，也可作为一个外部引用。

## 内部的 DOCTYPE 声明

假如 DTD 被包含在您的 XML 源文件中，它应当通过下面的语法包装在一个 DOCTYPE 声明中：

```xml
<!DOCTYPE root-element [element-declarations]>
```

root-element：根标签

## 外部文档声明

假如 DTD 位于 XML 源文件的外部，那么它应通过下面的语法被封装在一个 DOCTYPE 定义中：

```xml
<!DOCTYPE root-element SYSTEM "filename">
```

## 为什么使用 DTD？

* 通过 DTD，您的每一个 XML 文件均可携带一个有关其自身格式的描述。

* 通过 DTD，独立的团体可一致地使用某个标准的 DTD 来交换数据。

* 应用程序也可使用某个标准的 DTD 来验证从外部接收到的数据。

* 还可以使用 DTD 来验证数据。