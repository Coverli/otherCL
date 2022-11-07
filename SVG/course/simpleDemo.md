**SVG 文件推荐使用 .svg（全部小写）作为此类文件的扩展名。**

```xml
<svg version="1.1"
  baseProfile="full"
  width="300" height="200"
  xmlns="http://www.w3.org/2000/svg">
  <rect width="100%" height="100%" stroke="red" stroke-width="4" fill="yellow" />
  <circle cx="150" cy="100" r="80" fill="green" />
  <text x="150" y="115" font-size="16" text-anchor="middle" fill="white">SVG TEST</text>
</svg>
```

<svg version="1.1"
  baseProfile="full"
  width="300" height="200"
  xmlns="http://www.w3.org/2000/svg">
  <rect width="100%" height="100%" stroke="red" stroke-width="4" fill="yellow" />
  <circle cx="150" cy="100" r="80" fill="green" />
  <text x="150" y="115" font-size="16" text-anchor="middle" fill="white">SVG TEST</text>
</svg>

**SVG 代码解析：**

SVG 代码以 **<svg>** 元素开始，包括开启标签 **<svg>** 和关闭标签 </svg> 。这是根元素。width 和 height 属性可设置此 SVG 文档的宽度和高度。version 属性可定义所使用的 SVG 版本，xmlns 属性可定义 SVG 命名空间。

SVG 的 <rect> 用来创建一个矩形，通过 fill 把背景颜色设为黄色。

SVG 的 <circle> 用来创建一个圆。cx 和 cy 属性定义圆中心的 x 和 y 坐标。如果忽略这两个属性，那么圆点会被设置为 (0, 0)，r 属性定义圆的半径。 一个半径 80px 的绿色圆圈 <circle> 绘制在红色矩形的正中央 （向右偏移 150px，向下偏移115px）。

stroke 和 stroke-width 属性控制如何显示形状的轮廓。我们把圆的轮廓设置为 4px 宽，红色边框。

fill 属性设置形状内的颜色。我们把填充颜色设置为红色。

关闭标签 **</svg>** 的作用是关闭 SVG 元素和文档本身。

**注释：**所有的开启标签必须有关闭标签！