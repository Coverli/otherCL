## 实例 1

<polygon> 标签用来创建含有不少于三个边的图形。

多边形是由直线组成，其形状是"封闭"的（所有的线条 连接起来）。

```xml
<svg  height="210" width="500">
  <polygon points="200,10 250,190 160,210"
  style="fill:lime;stroke:purple;stroke-width:1"/>
</svg>
```

<svg  height="210" width="500">
  <polygon points="200,10 250,190 160,210"
  style="fill:lime;stroke:purple;stroke-width:1"/>
</svg>

- points 属性定义多边形每个角的 x 和 y 坐标

## 实例 2

下面的示例创建一个四边的多边形

```xml
<svg height="250" width="500">
  <polygon points="220,10 300,210 170,250 123,234" style="fill:lime;stroke:purple;stroke-width:1" />
</svg>
```

<svg height="250" width="500">
  <polygon points="220,10 300,210 170,250 123,234" style="fill:lime;stroke:purple;stroke-width:1" />
</svg>

## 实例 3

使用 <polygon> 元素创建一个星型

```xml
<svg height="210" width="500">
  <polygon points="100,10 40,198 190,78 10,78 160,198"
  style="fill:lime;stroke:purple;stroke-width:5;fill-rule:nonzero;" />
</svg>
```

<svg height="210" width="500">
  <polygon points="100,10 40,198 190,78 10,78 160,198"
  style="fill:lime;stroke:purple;stroke-width:5;fill-rule:nonzero;" />
</svg>

## 实例 4

改变 fill-rule 属性为 "evenodd"

```xml
<svg height="210" width="500">
  <polygon points="100,10 40,198 190,78 10,78 160,198"
  style="fill:lime;stroke:purple;stroke-width:5;fill-rule:evenodd;" />
</svg>
```

<svg height="210" width="500">
  <polygon points="100,10 40,198 190,78 10,78 160,198"
  style="fill:lime;stroke:purple;stroke-width:5;fill-rule:evenodd;" />
</svg>

SVG的图形填充规则通过fill-rule属性来指定。

## fill-rule

| *有效值:*                                                    | nonzero \| evenodd \| inherit |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| *默认值:*                                                    | nonzero                                                      |
| *应用于:*                                                    | shape形状类元素和文字内容类元素                              |
| *可继承:*                                                    | 是                                                           |
| *比例:*                                                      | 无                                                           |
| *媒体:*                                                      | 可见                                                         |
| *动画可用:* | 是                                                           |

**fill-rule** 

属性用于指定使用哪一种算法去判断画布上的某区域是否属于该图形“内部” （内部区域将被填充）。对一个简单的无交叉的路径，哪块区域是“内部” 是很直观清除的。但是，对一个复杂的路径，比如自相交或者一个子路径包围另一个子路径，“内部”的理解就不那么明确了。fill-rule 属性提供两种选项用于指定如何判断图形的“内部”：nonzero和evenodd

**nonzero**

字面意思是“非零”。按该规则，要判断一个点是否在图形内，从该点作任意方向的一条射线，然后检测射线与图形路径的交点情况。从0开始计数，路径从左向右穿过射线则计数加1，从右向左穿过射线则计数减1。得出计数结果后，如果结果是0，则认为点在图形外部，否则认为在内部。下图演示了nonzero规则:

<svg width="12cm" height="4cm" viewBox="0 0 1200 400" version="1.1"
     xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
    <desc>Example fillrule-nonzero - demonstrates fill-rule:nonzero</desc>
    <rect x="1" y="1" width="1198" height="398" fill="none" stroke="blue" />
    <defs>
        <path id="Triangle" d="M 16,0 L -8,9 v-18 z" fill="black" stroke="none" />
    </defs>
    <g fill-rule="nonzero" fill="red" stroke="black" stroke-width="3" >
    <path d="M 250,75 L 323,301 131,161 369,161 177,301 z" />
    <use xlink:href="#Triangle" transform="translate(306.21 249) rotate(72)"
         overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(175.16,193.2) rotate(216)"
         overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(314.26,161) rotate(0)"
         overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(221.16,268.8) rotate(144)"
         overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(233.21,126.98) rotate(288)"
         overflow="visible"  />
    <path d="M 600,81 A 107,107 0 0,1 600,295 A 107,107 0 0,1 600,81 z
             M 600,139 A 49,49 0 0,1 600,237 A 49,49 0 0,1 600,139 z" />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(0) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(120) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(240) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(60) translate(49,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(180) translate(49,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(300) translate(49,0) rotate(90)" overflow="visible"  />
    <path d="M 950,81 A 107,107 0 0,1 950,295 A 107,107 0 0,1 950,81 z
             M 950,139 A 49,49 0 0,0 950,237 A 49,49 0 0,0 950,139 z" />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(0) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(120) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(240) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(60) translate(49,0) rotate(-90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(180) translate(49,0) rotate(-90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(300) translate(49,0) rotate(-90)" overflow="visible"  />
    </g>
</svg>

**evenodd**

字面意思是“奇偶”。按该规则，要判断一个点是否在图形内，从该点作任意方向的一条射线，然后检测射线与图形路径的交点的数量。如果结果是奇数则认为点在内部，是偶数则认为点在外部。下图演示了evenodd 规则:

<svg width="12cm" height="4cm" viewBox="0 0 1200 400"  version="1.1"
     xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink">
    <desc>Example fillrule-evenodd - demonstrates fill-rule:evenodd</desc>
    <rect x="1" y="1" width="1198" height="398" fill="none" stroke="blue" />
    <defs>
    	<path id="Triangle" d="M 16,0 L -8,9 v-18 z" fill="black" stroke="none" />
	</defs>
    <g fill-rule="evenodd" fill="red" stroke="black" stroke-width="3" >
    <path d="M 250,75 L 323,301 131,161 369,161 177,301 z" />
    <use xlink:href="#Triangle" transform="translate(306.21 249) rotate(72)"
         overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(175.16,193.2) rotate(216)"
         overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(314.26,161) rotate(0)"
         overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(221.16,268.8) rotate(144)"
         overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(233.21,126.98) rotate(288)"
         overflow="visible"  />
    <path d="M 600,81 A 107,107 0 0,1 600,295 A 107,107 0 0,1 600,81 z
             M 600,139 A 49,49 0 0,1 600,237 A 49,49 0 0,1 600,139 z" />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(0) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(120) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(240) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(60) translate(49,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(180) translate(49,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(600,188) rotate(300) translate(49,0) rotate(90)" overflow="visible"  />
    <path d="M 950,81 A 107,107 0 0,1 950,295 A 107,107 0 0,1 950,81 z
             M 950,139 A 49,49 0 0,0 950,237 A 49,49 0 0,0 950,139 z" />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(0) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(120) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(240) translate(107,0) rotate(90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(60) translate(49,0) rotate(-90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(180) translate(49,0) rotate(-90)" overflow="visible"  />
    <use xlink:href="#Triangle" transform="translate(950,188) rotate(300) translate(49,0) rotate(-90)" overflow="visible"  />
    </g>
</svg>

**提示:** 上述解释未指出当路径片段与射线重合或者相切的时候怎么办，因为任意方向的射线都可以，那么只需要简单的选择另一条没有这种特殊情况的射线即可。