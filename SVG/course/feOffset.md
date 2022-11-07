## SVG \<feOffset>

## 实例 1

<feOffset>元素是用于创建阴影效果。我们的想法是采取一个SVG图形（图像或元素）并移动它在xy平面上一点儿。

第一个例子偏移一个矩形（带<feOffset>），然后混合偏移图像顶部（含<feBlend>）

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <defs>
    <filter id="f1" x="0" y="0" width="200%" height="200%">
      <feOffset result="offOut" in="SourceGraphic" dx="20" dy="20" />
      <feBlend in="SourceGraphic" in2="offOut" mode="normal" />
    </filter>
  </defs>
  <rect width="90" height="90" stroke="green" stroke-width="3" fill="yellow" filter="url(#f1)" />
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <defs>
    <filter id="f1" x="0" y="0" width="200%" height="200%">
      <feOffset result="offOut" in="SourceGraphic" dx="20" dy="20" />
      <feBlend in="SourceGraphic" in2="offOut" mode="normal" />
    </filter>
  </defs>
  <rect width="90" height="90" stroke="green" stroke-width="3" fill="yellow" filter="url(#f1)" />
</svg>

- <filter>元素id属性定义一个滤镜的唯一名称
- <rect>元素的滤镜属性用来把元素链接到"f1"滤镜

## 实例 2

现在，偏移图像可以变的模糊（含 <feGaussianBlur>）

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <defs>
    <filter id="f1" x="0" y="0" width="200%" height="200%">
      <feOffset result="offOut" in="SourceGraphic" dx="20" dy="20" />
      <feGaussianBlur result="blurOut" in="offOut" stdDeviation="10" />
      <feBlend in="SourceGraphic" in2="blurOut" mode="normal" />
    </filter>
  </defs>
  <rect width="90" height="90" stroke="green" stroke-width="3" fill="yellow" filter="url(#f1)" />
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <defs>
    <filter id="f1" x="0" y="0" width="200%" height="200%">
      <feOffset result="offOut" in="SourceGraphic" dx="20" dy="20" />
      <feGaussianBlur result="blurOut" in="offOut" stdDeviation="10" />
      <feBlend in="SourceGraphic" in2="blurOut" mode="normal" />
    </filter>
  </defs>
  <rect width="90" height="90" stroke="green" stroke-width="3" fill="yellow" filter="url(#f1)" />
</svg>

- <feGaussianBlur>元素的stdDeviation属性定义了模糊量

## 实例 3

现在，制作一个黑色的阴影

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <defs>
    <filter id="f1" x="0" y="0" width="200%" height="200%">
      <feOffset result="offOut" in="SourceAlpha" dx="20" dy="20" />
      <feGaussianBlur result="blurOut" in="offOut" stdDeviation="10" />
      <feBlend in="SourceGraphic" in2="blurOut" mode="normal" />
    </filter>
  </defs>
  <rect width="90" height="90" stroke="green" stroke-width="3" fill="yellow" filter="url(#f1)" />
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <defs>
    <filter id="f1" x="0" y="0" width="200%" height="200%">
      <feOffset result="offOut" in="SourceAlpha" dx="20" dy="20" />
      <feGaussianBlur result="blurOut" in="offOut" stdDeviation="10" />
      <feBlend in="SourceGraphic" in2="blurOut" mode="normal" />
    </filter>
  </defs>
  <rect width="90" height="90" stroke="green" stroke-width="3" fill="yellow" filter="url(#f1)" />
</svg>

- <feOffset>元素的属性改为"SourceAlpha"在Alpha通道使用残影，而不是整个RGBA像素

## 实例 4

现在为阴影涂上一层颜色

```xml
<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <defs>
    <filter id="f1" x="0" y="0" width="200%" height="200%">
      <feOffset result="offOut" in="SourceGraphic" dx="20" dy="20" />
      <feColorMatrix result="matrixOut" in="offOut" type="matrix"
      values="0.2 0 0 0 0 0 0.2 0 0 0 0 0 0.2 0 0 0 0 0 1 0" />
      <feGaussianBlur result="blurOut" in="matrixOut" stdDeviation="10" />
      <feBlend in="SourceGraphic" in2="blurOut" mode="normal" />
    </filter>
  </defs>
  <rect width="90" height="90" stroke="green" stroke-width="3" fill="yellow" filter="url(#f1)" />
</svg>
```

<svg xmlns="http://www.w3.org/2000/svg" version="1.1">
  <defs>
    <filter id="f1" x="0" y="0" width="200%" height="200%">
      <feOffset result="offOut" in="SourceGraphic" dx="20" dy="20" />
      <feColorMatrix result="matrixOut" in="offOut" type="matrix"
      values="0.2 0 0 0 0 0 0.2 0 0 0 0 0 0.2 0 0 0 0 0 1 0" />
      <feGaussianBlur result="blurOut" in="matrixOut" stdDeviation="10" />
      <feBlend in="SourceGraphic" in2="blurOut" mode="normal" />
    </filter>
  </defs>
  <rect width="90" height="90" stroke="green" stroke-width="3" fill="yellow" filter="url(#f1)" />
</svg>

- <feColorMatrix>过滤器是用来转换偏移的图像使之更接近黑色的颜色。 '0.2'矩阵的三个值都获取乘以红色，绿色和蓝色通道。降低其值带来的颜色至黑色（黑色为0）

## feColorMatrix变换矩阵的定义和说明

feColorMatrix 的 matrix 是一个 4*5 的矩阵。前面 4 列是颜色通道的比例系数，最后一列是常量偏移

![](https://www.runoob.com/wp-content/uploads/2017/09/20160422110932437.png)

上面公式中的 rr 表示 red to red 系数，以此类推。c1~c4 表示常量偏移。

第一个 4*5 矩阵为变换矩阵，第二个单列矩阵为待变换对象的像素值。右侧单列矩阵为矩阵 1 和 2 的点积结果。

这个变换矩阵看起来比较复杂，在实践上常使用一个简化的对角矩阵，即除了 rr/gg/bb/aa 取值非零外，其余行列取值为 0，这就退化成了简单的各颜色通道的独立调整。

feColorMatrix的语法:

```xml
<filter id="f1" x="0%" y="0%" width="100%" height="100%">  
  <feColorMatrix   
     result="original" id="c1" type="matrix"   
     values="1 0 0 0 0    
             0 1 0 0 0   
             0 0 1 0 0   
             0 0 0 1 0" />  
</filter>
```

上述feColorMatrix过滤器的类型值为matrix，除此之外，还有saturate（饱和度）和hueRotate（色相旋转），取值比较简单。

显然当变换矩阵为单位对角矩阵时，变换结果和原值相等。

也可以尝试调整比例系数，比如把rr的值设置为0，即去除图像中的red颜色通道含量

