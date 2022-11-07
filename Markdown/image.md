<!-- 
    Markdown 图片语法格式如下：
        ![alt 属性文本](图片地址)
        ![alt 属性文本](图片地址 "可选标题")
-->

![加载失败](https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png)

![加载失败](https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png "谷歌图标")

<!-- 也可以像网址那样对图片网址使用变量 -->

这个链接用 1 作为网址变量 ![Google][1]

然后在文档的结尾为变量赋值（网址）

[1]: https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png

<!--
    Markdown 还没有办法指定图片的高度与宽度，
    如果需要的话，可以使用普通的 <img> 标签
-->

<img src="https://www.google.com/images/branding/googlelogo/2x/googlelogo_color_92x30dp.png" width="50%">

