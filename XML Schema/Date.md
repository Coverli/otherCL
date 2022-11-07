## 日期数据类型

日期数据类型（Date Data Type）用于定义日期。

日期使用此格式进行定义："YYYY-MM-DD"，其中：

- YYYY 表示年份
- MM 表示月份
- DD 表示天数

**注意：**所有的成分都是必需的

有关 schema 中日期声明的例子：

```scheme
<xs:element name="start" type="xs:date"/>
```

```xml
<start>2022-11-06</start>
```

### 时区

如需规定一个时区，您也可以通过在日期后加一个 "Z" 的方式，使用世界调整时间（UTC time）来输入一个日期 - 比如这样：

```xml
<start>2022-11-06Z</start>
```

或者也可以通过在日期后添加一个正的或负时间的方法，来规定以世界调整时间为准的偏移量 - 比如这样：

```xml
<start>2022-11-06-06:00</start>
或者
<start>2022-11-06+06:00</start>
```

## 时间数据类型

时间数据类型（Time Data Type）用于定义时间。

时间使用下面的格式来定义："hh:mm:ss"，其中

- hh 表示小时
- mm 表示分钟
- ss 表示秒

**注意：** 所有的成分都是必需的！

有关 schema 中时间声明的例子：

```scheme
<xs:element name="start" type="xs:time"/>
```

```xml
<start>09:00:00</start>
或者
<start>09:30:10.5</start>
```

### 时区

如需规定一个时区，您也可以通过在时间后加一个 "Z" 的方式，使用世界调整时间（UTC time）来输入一个时间 - 比如这样：

```xml
<start>09:30:10Z</start>
```

或者也可以通过在时间后添加一个正的或负时间的方法，来规定以世界调整时间为准的偏移量 - 比如这样：

```xml
<start>09:30:10-06:00</start>
或者
<start>09:30:10+06:00</start>
```

## 日期时间数据类型

日期时间数据类型（DateTime Data Type）用于定义日期和时间。

日期时间使用下面的格式进行定义："YYYY-MM-DDThh:mm:ss"，其中：

- YYYY 表示年份
- MM 表示月份
- DD 表示日
- T 表示必需的时间部分的起始
- hh 表示小时
- mm 表示分钟
- ss 表示秒

**注意：** 所有的成分都是必需的！

有关 schema 中日期时间声明的例子：

```scheme
<xs:element name="startdate" type="xs:dateTime"/>
```

```xml
<startdate>2022-11-06T09:00:00</startdate>
或者：
<startdate>2022-11-06T09:30:10.5</startdate>
```

### 时区

如需规定一个时区，您也可以通过在日期时间后加一个 "Z" 的方式，使用世界调整时间（UTC time）来输入一个日期时间 - 比如这样：

```xml
<startdate>2022-11-06T09:30:10Z</startdate>
```

或者也可以通过在时间后添加一个正的或负时间的方法，来规定以世界调整时间为准的偏移量 - 比如这样：

```xml
<startdate>2022-11-06T09:30:10-06:00</startdate>
或者
<startdate>2022-11-06T09:30:10+06:00</startdate>
```

## 持续时间数据类型

持续时间数据类型（Duration Data Type）用于规定时间间隔。

时间间隔使用下面的格式来规定："PnYnMnDTnHnMnS"，其中：

- P 表示周期(必需)
- nY 表示年数
- nM 表示月数
- nD 表示天数
- T 表示时间部分的起始 （如果您打算规定小时、分钟和秒，则此选项为必需）
- nH 表示小时数
- nM 表示分钟数
- nS 表示秒数

有关 schema 中持续时间声明的例子：

```scheme
<xs:element name="period" type="xs:duration"/>
```

```xml
<!-- 表示一个 5 年的周期 -->
<period>P5Y</period>
<!-- 表示一个 5 年、2 个月及 10 天的周期 -->
<period>P5Y2M10D</period>
<!-- 表示一个 5 年、2 个月、10 天及 15 小时的周期 -->
<period>P5Y2M10DT15H</period>
<!-- 表示一个 15 小时的周期 -->
<period>PT15H</period>
```

### 负的持续时间

如需规定一个负的持续时间，请在 P 之前输入减号：

```xml
<!-- 表示一个负 10 天的周期 -->
<period>-P10D</period>
```

## 日期和时间数据类型

| 名称       | 描述                                  |
| :--------- | :------------------------------------ |
| date       | 定义一个日期值                        |
| dateTime   | 定义一个日期和时间值                  |
| duration   | 定义一个时间间隔                      |
| gDay       | 定义日期的一个部分 - 天 (DD)          |
| gMonth     | 定义日期的一个部分 - 月 (MM)          |
| gMonthDay  | 定义日期的一个部分 - 月和天 (MM-DD)   |
| gYear      | 定义日期的一个部分 - 年 (YYYY)        |
| gYearMonth | 定义日期的一个部分 - 年和月 (YYYY-MM) |
| time       | 定义一个时间值                        |

## 对日期数据类型的限定

可与日期数据类型一同使用的限定：

- enumeration
- maxExclusive
- maxInclusive
- minExclusive
- minInclusive
- pattern
- whiteSpace