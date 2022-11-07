## 实现

使用了一个整形的 ArrayList<Integer> 来模拟数据带，所以指向数据带的指针，可以使用一个 int 变量来模拟，我们使用一个 char[ ] 数组来存放指令集，还是使用一个 int 变量来做指令执行的指针，他代表执行到指令的具体位置。

```java
/**
* 当前指针
*/
private int currentPointer = 0;
 
/**
* 模拟指针指向的数据带
* 使用ArrayList数据结构来模拟，实现过程中，需要自己越界问题
*/
private List<Integer> band = new ArrayList<>();
 
/**
* 存储输入的指令集,以便后续程序调研
* */
private char[] chars;
 
/**
* 指令指针
* */
private int currentCmdPointer = 0;
```

`+` `-` `,` `.` `<` `<` 这几个指令的含义相当容易理解，只需要注意边界即可。

```java
/**
 * 获取键盘输入的字节流，写入当前指针指向的数据带
 * */
private void input() {
    try {
        this.band.add(this.currentPointer, (int) System.in.read());
    } catch (IOException e) {
        e.printStackTrace();
    }
}

/**
 * 将当前指针指向的数据带值的ASCII码打印
 * */
private void print() {
    System.out.printf("%c",this.band.get(this.currentPointer));
}
 
/**
 * 指针向又移一
 * */
private void forward() {
    this.currentPointer++;
    //处理越界
    if(this.currentPointer >= this.band.size()-1){
        this.band.add(0);
    }
}

/**
 * 指针向左移一
 * */
private void backward() {
    --this.currentPointer;
    //处理越界
    this.currentPointer = this.currentPointer < 0 ? 0 : this.currentPointer;
}

/**
 * 当前指针指向的数据带值-1
 * */
private void reduce() {
    Integer temp = this.band.get(this.currentPointer);
    temp--;
    this.band.set(this.currentPointer,temp);
}

/**
 * 当前指针指向的数据带值+1
 * */
private void increase() {
    //规避数据越界问题
    for(int i = this.band.size(); i<=this.currentPointer;i++){
        this.band.add(0);
    }
    //获取当前指针值，+1，并写回
    Integer temp = this.band.get(this.currentPointer);
    temp++;
    this.band.set(this.currentPointer,temp);
}
```

`[` `]` 两部分的指令含义相对复杂一点，需要理解其含义，

`[` 相当于进入循环体，在符合条件后，跳过循环，`]`相当于循环的结尾判断，

如果不符合条件，将从头继续执行循环。

```java
/**
 * 循环结束
 * 如果当前指针指向的数据带值不为 0，则跳到与之匹配的 '['后一条指令
 * */
private void whileEnd() {
    if(this.band.get(this.currentPointer)!=0){
        while(true){
            if(this.chars[--this.currentCmdPointer]=='['){
                break;
            }
        }
    }
}

/**
 * 循环开始
 * 如果当前指针指向的数据带值为 0，则跳到与之匹配的 ']'后一条指令
 * */
private void whileEntity() {
    if(this.band.get(this.currentPointer)==0){
        while(true){
            if(this.chars[this.currentCmdPointer++]==']'){
                break;
            }
        }
    }
}
```

