## 十进制数据类型

十进制数据类型用于规定一个数值。

关于 scheme 中十进制数声明的例子

```scheme
<xs:element name="prize" type="xs:decimal"/>
```

```xml
<prize>999.50</prize>
<prize>+999.5450</prize>
<prize>-999.5230</prize>
<prize>0</prize>
<prize>14</prize>
```

**注意：** 可规定的十进制数字的最大位数是 18 位。

## 整数数据类型

整数数据类型用于规定无小数成分的数值。

关于 scheme 中整数声明的例子

```scheme
<xs:element name="prize" type="xs:integer"/>
```

```xml
<prize>999</prize>
<prize>+999</prize>
<prize>-999</prize>
<prize>0</prize>
```

## 数值数据类型

请注意，下面所有的数据类型均源自于十进制数据类型（除 decimal 本身以外）！

| 名字               | 秒数                               |
| :----------------- | :--------------------------------- |
| byte               | 有正负的 8 位整数                  |
| decimal            | 十进制数                           |
| int                | 有正负的 32 位整数                 |
| integer            | 整数值                             |
| long               | 有正负的 64 位整数                 |
| negativeInteger    | 仅包含负值的整数 ( .., -2, -1.)    |
| nonNegativeInteger | 仅包含非负值的整数 (0, 1, 2, ..)   |
| nonPositiveInteger | 仅包含非正值的整数 (.., -2, -1, 0) |
| positiveInteger    | 仅包含正值的整数 (1, 2, ..)        |
| short              | 有正负的 16 位整数                 |
| unsignedLong       | 无正负的 64 位整数                 |
| unsignedInt        | 无正负的 32 位整数                 |
| unsignedShort      | 无正负的 16 位整数                 |
| unsignedByte       | 无正负的 8 位整数                  |

## 对数值数据类型的限定（Restriction）

可与数值数据类型一同使用的限定：

- enumeration
- fractionDigits
- maxExclusive
- maxInclusive
- minExclusive
- minInclusive
- pattern
- totalDigits
- whiteSpace

