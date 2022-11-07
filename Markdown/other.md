<!--
    Markdown支持的 HTML 元素
    不在 Markdown 涵盖范围之内的标签，都可以直接在文档里面用 HTML 撰写
    目前支持的 HTML 元素有：
        <kbd> <b> <i> <em> <sup> <sub> <br>等
-->

使用 <kbd>Ctrl</kbd>+<kbd>Alt</kbd>+<kbd>Del</kbd> 重启电脑

<!--
    Markdown 使用了很多特殊符号来表示特定的意义，
    如果需要显示特定的符号则需要使用转义字符，
    Markdown 使用反斜杠转义特殊字符

    Markdown 支持以下这些符号前面加上反斜杠来帮助插入普通的符号：
    \   反斜线
    `   反引号
    *   星号
    _   下划线
    {}  花括号
    []  方括号
    ()  小括号
    #   井字号
    +   加号
    -   减号
    .   英文句点
    !   感叹号
-->

**文本加粗** 
\*\* 正常显示星号 \*\*

<!--
    使用 KaTeX 或者 MathJax 来渲染数学表达式
    KaTeX 拥有比 MathJax 更快的性能，但是它却少了很多 MathJax 拥有的特性。
    可以查看 KaTeX supported functions/symbols 来了解 KaTeX 支持那些符号和函数。

    默认下的分隔符：
        $...$ 或者 \(...\) 中的数学表达式将会在行内显示
        $$...$$ 或者 \[...\] 或者 ```math 中的数学表达式将会在块内显示
-->
链接地址：

[KaTeX](https://github.com/KaTeX/KaTeX)

[MathJax](https://github.com/mathjax/MathJax)

$$
\begin{Bmatrix}
   a & b \\
   c & d
\end{Bmatrix}
$$
$$
\begin{CD}
   A @>a>> B \\
@VbVV @AAcA \\
   C @= D
\end{CD}
$$