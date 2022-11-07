## 使用 CSS 显示 XML

通过使用 CSS（Cascading Style Sheets 层叠样式表），可以添加显示信息到 XML 文档中。

使用以下代码把XML文件链接到CSS文件

````xml
<?xml-stylesheet type="text/css" href="test.css"?>
````

### 实例

XML文件

```xml
<?xml version="1.0" encoding="utf-8"?>
<?xml-stylesheet type="text/css" href="cd_catalog.css"?>
<CATALOG>
	<CD>
		<TITLE>Empire Burlesque</TITLE>
		<ARTIST>Bob Dylan</ARTIST>
		<COUNTRY>USA</COUNTRY>
		<COMPANY>Columbia</COMPANY>
		<PRICE>10.90</PRICE>
		<YEAR>1985</YEAR>
	</CD>
	<CD>
		<TITLE>Hide your heart</TITLE>
		<ARTIST>Bonnie Tyler</ARTIST>
		<COUNTRY>UK</COUNTRY>
		<COMPANY>CBS Records</COMPANY>
		<PRICE>9.90</PRICE>
		<YEAR>1988</YEAR>
	</CD>
</CATALOG>
```

CSS文件

```css

CATALOG {
    background-color: #ffffff;
    width: 100%;
}
CD {
    display: block;
    margin-bottom: 30pt;
    margin-left: 0;
}
TITLE {
    color: #FF0000;
    font-size: 20pt;
}
ARTIST {
    color: #0000FF;
    font-size: 20pt;
}
COUNTRY,PRICE,YEAR,COMPANY {
    display: block;
    color: #000000;
    margin-left: 20pt;
}
```

