package cn.bf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Brainfuck解析实现
 * @author: Coverli
 * */
public class BF {

    public static void main(String[] args) {
        List<String> cmds = new ArrayList<>();
        // 输入输出循环...
        String str = ",[.,]";
        //cmds.add(str);

        //25868716
        str = "+++++[>++++++++++<-]>.+++.+++.--.++.-.------.+++++.";
        cmds.add(str);

        //2
        str = "+++++[>++++++++++<-]>.";
        cmds.add(str);

        //1
        str = ">+++++++[<+++++++>-]<.";
        cmds.add(str);

        //hello world!
        str = ">++++++++[<+++++++++++++>-]<.---.+++++++..+++.>++++++++[<---------->-]<+.>++++++++[<+++++++++++>-]<-.--------.+++.------.--------.>++++++[<----------->-]<-.";
        cmds.add(str);

        //hello sange!
        str = ">++++++++[<+++++++++++++>-]<.---.+++++++..+++.>++++++++[<---------->-]<+.>+++++++++[<+++++++++>-]<++.>+++[<------>-]<.+++++++++++++.-------.--.>++++++[<----------->-]<--.";
        cmds.add(str);

        //hello Shostakovich
        str = "++++++++++[>+>+++>+++++++>++++++++++<<<<-]>>>>++++.---.+++++++..+++.<<++.>+++++++++++++.>-------.+++++++.++++.+.<++++++++++++++.>---------.++++.+++++++.<++++++++.------.+++++.";
        cmds.add(str);

        cmds.stream().forEach(it->{System.out.println(it);new BF().parser(it);System.out.println("");});

        // new BF().parser(cmds.get(4));
    }

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

    /**
     * 将输入转换成指令集，并遍历执行指令集
     * */
    public void parser(String input){
        chars = input.toCharArray();
        for(currentCmdPointer = 0; currentCmdPointer < chars.length ; currentCmdPointer++){
            this.charcmd(chars[this.currentCmdPointer]);
        }
    };

    /**
     * 指令集
     * */
    private void charcmd(char c){
        switch (c){
            case '+': this.increase();break;
            case '-': this.reduce();break;
            case '>': this.forward();break;
            case '<': this.backward();break;
            case '.': this.print();break;
            case ',': this.input();break;
            case '[': this.whileEntity();break;
            case ']': this.whileEnd();break;
            default:break;
        }
    }

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
}
