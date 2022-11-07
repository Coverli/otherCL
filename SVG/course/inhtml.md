SVG 文件可通过以下标签嵌入 HTML 文档：<embed>、<object> 或者 <iframe>。

SVG的代码可以直接嵌入到HTML页面中，或您可以直接链接到SVG文件。

### 使用 \<embed> 标签

- 优势：所有主要浏览器都支持，并允许使用脚本
- 缺点：不推荐在HTML4和XHTML中使用（但在HTML5允许）

```xml
<embed src="circle1.svg" type="image/svg+xml" />
```

### 使用 \<object> 标签

- 优势：所有主要浏览器都支持，并支持HTML4，XHTML和HTML5标准
- 缺点：不允许使用脚本。

```xml
<object data="circle1.svg" type="image/svg+xml"></object>
```

### 使用 \<iframe> 标签

- 优势：所有主要浏览器都支持，并允许使用脚本
- 缺点：不推荐在HTML4和XHTML中使用（但在HTML5允许）

```xml
<iframe src="circle1.svg"></iframe>
```

### 直接在HTML嵌入SVG代码

```html
<!DOCTYPE html>
<html>
<body>
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
   <circle cx="100" cy="50" r="40" stroke="black" stroke-width="2" fill="red" />
</svg> 
</body>
</html>
```

### 链接到 SVG 文件

还可以用 <a> 标签链接到一个 SVG 文件

```html
<a href="circle1.svg">查看 SVG 文件</a>
```

