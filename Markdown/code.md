<!-- 如果是段落上的一个函数或片段的代码可以用反引号把它包起来（`） -->

`printf()` 函数

<!-- 代码区块使用 4 个空格或者一个制表符（Tab 键） -->

    function test () {
        var p = document.createElement("p");
        p.innerHTML = "代码块输出";
    }

<!-- 也可以用 ``` 包裹一段代码，并指定一种语言（也可以不指定） -->

```java
public class markdown {
	@Test
    void writeCode () {
        System.out.print("测试在Markdown文件中写代码块");
    }
}
```

```python 
import pymysql
db = pymysql.connect(
    host='localhost',
    user='root',
    password='123456',
    database='demo01'
)
cursor = db.cursor()
cursor.execute("SELECT VERSION()")
data = cursor.fetchone()
print("Database version : %s " % data)
db.close()
```