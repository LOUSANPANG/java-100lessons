/**
    算数运算符
        + - * / % ++ --
        int x = 5;
        x/2 = 2;
        x%2 = 1;

    赋值运算符
        = += -= /= %=
        int x = 1;
        x += 10;

    关系运算符

    逻辑运算

    位bit运算

 */

public class Test {
    public static void main(String[] args) {
        // 算数运算符
        // 先赋值再运算 运算中：自增在前的先自增再备份、自增在后的先备份再自增 最后将备份赋值给变量。
        int a = 1;
        // int b = a++;
        // System.out.println(b); // 1
        // int b = ++a;
        // System.out.println(b); // 2
        // a = a++;
        // System.out.println(a); // 1

        // 赋值运算符
        // 
        byte a = 1; // 1常量32bit位 赋值就相当于自动转化了
        // a+=2;//3 +=一个符号 自动转化 =自动转化
        // x = x + 2; // 编译出错 类型从int转化为byte可能有损失。 x空间是8bit、常量区2是32bit，在加法的时候 8bit1转换成32bit，在赋值类型不一致。
        x = (byte)(x + 2);

    }
}