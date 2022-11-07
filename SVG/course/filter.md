## SVG 滤镜

SVG滤镜用来增加对SVG图形的特殊效果。

<defs> 和 <filter>

所有互联网的SVG滤镜定义在<defs>元素中。<defs>元素定义短并含有特殊元素（如滤镜）定义。

<filter>标签用来定义SVG滤镜。<filter>标签使用必需的id属性来定义向图形应用哪个滤镜？

SVG可用的滤镜是：

- feBlend - 与图像相结合的滤镜
- feColorMatrix - 用于彩色滤光片转换
- feComponentTransfer
- feComposite
- feConvolveMatrix
- feDiffuseLighting
- feDisplacementMap
- feFlood
- [feGaussianBlur](./feGaussianBlur.md)
- feImage
- feMerge
- feMorphology
- [feOffset - 过滤阴影](./feOffset.md)
- feSpecularLighting
- feTile
- feTurbulence
- feDistantLight - 用于照明过滤
- fePointLight - 用于照明过滤
- feSpotLight - 用于照明过滤

除此之外，您可以在每个 SVG 元素上使用多个滤镜！