## 实例 1

<ellipse> 元素是用来创建一个椭圆：

椭圆与圆很相似。不同之处在于椭圆有不同的x和y半径，而圆的x和y半径是相同的

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <ellipse cx="300" cy="80" rx="100" ry="50"
             style="fill:yellow;stroke:purple;stroke-width:2"/>
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <ellipse cx="300" cy="80" rx="100" ry="50"
             style="fill:yellow;stroke:purple;stroke-width:2"/>
</svg>

- CX属性定义的椭圆中心的x坐标
- CY属性定义的椭圆中心的y坐标
- RX属性定义的水平半径
- RY属性定义的垂直半径

## 实例 2

下面的例子创建了三个累叠而上的椭圆：

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <ellipse cx="240" cy="100" rx="220" ry="30" style="fill:purple"/>
  <ellipse cx="220" cy="70" rx="190" ry="20" style="fill:lime"/>
  <ellipse cx="210" cy="45" rx="170" ry="15" style="fill:yellow"/>
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <ellipse cx="240" cy="100" rx="220" ry="30" style="fill:purple"/>
  <ellipse cx="220" cy="70" rx="190" ry="20" style="fill:lime"/>
  <ellipse cx="210" cy="45" rx="170" ry="15" style="fill:yellow"/>
</svg>

## 实例 3

下面的例子组合了两个椭圆（一个黄的和一个白的）

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <ellipse cx="240" cy="50" rx="220" ry="30" style="fill:yellow"/>
  <ellipse cx="220" cy="50" rx="190" ry="20" style="fill:white"/>
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
    <ellipse cx="240" cy="50" rx="220" ry="30" style="fill:yellow"/>
    <ellipse cx="220" cy="50" rx="190" ry="20" style="fill:white"/>
</svg>