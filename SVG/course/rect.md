### 实例 1

<rect> 标签可用来创建矩形，以及矩形的变种

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <rect width="300" height="100" style="fill:rgb(0,0,255);stroke-width:1;stroke:rgb(0,0,0)"/>
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <rect width="300" height="100" style="fill:rgb(0,0,255);stroke-width:1;stroke:rgb(0,0,0)"/>
</svg>

- rect 元素的 width 和 height 属性可定义矩形的高度和宽度
- style 属性用来定义 CSS 属性
- CSS 的 fill 属性定义矩形的填充颜色（rgb 值、颜色名或者十六进制值）
- CSS 的 stroke-width 属性定义矩形边框的宽度
- CSS 的 stroke 属性定义矩形边框的颜色

### 实例2

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <rect x="50" y="20" width="150" height="150"
          style="fill:blue;stroke:pink;stroke-width:5;fill-opacity:0.1;stroke-opacity:0.9"/>
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <rect x="50" y="20" width="150" height="150"
          style="fill:blue;stroke:pink;stroke-width:5;fill-opacity:0.1;stroke-opacity:0.9"/>
</svg>

- x 属性定义矩形的左侧位置（例如，x="0" 定义矩形到浏览器窗口左侧的距离是 0px）
- y 属性定义矩形的顶端位置（例如，y="0" 定义矩形到浏览器窗口顶端的距离是 0px）
- CSS 的 fill-opacity 属性定义填充颜色透明度（合法的范围是：0 - 1）
- CSS 的 stroke-opacity 属性定义轮廓颜色的透明度（合法的范围是：0 - 1）

### 实例 3

定义整个元素的不透明度

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <rect x="50" y="20" width="150" height="150"
          style="fill:blue;stroke:pink;stroke-width:5;opacity:0.5"/>
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <rect x="50" y="20" width="150" height="150"
          style="fill:blue;stroke:pink;stroke-width:5;opacity:0.5"/>
</svg>

- CSS opacity 属性用于定义了元素的透明值 (范围: 0 到 1)

### 实例4

创建一个圆角矩形

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <rect x="50" y="20" rx="20" ry="20" width="150" height="150"
          style="fill:red;stroke:black;stroke-width:5;opacity:0.5"/>
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <rect x="50" y="20" rx="20" ry="20" width="150" height="150"
          style="fill:red;stroke:black;stroke-width:5;opacity:0.5"/>
</svg>

- rx 和 ry 属性可使矩形产生圆角