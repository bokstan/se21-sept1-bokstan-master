package cn.edu.whut.sept.zuul;

import java.util.Scanner;
/**
 * Parser 类负责解析用户输入，并将其转换为 Command 对象。
 */

//Command、CommandWords、Parser类用来处理输入和指令分析
//依赖于Command类和CommandWords类，并关联于Commandwords,形成特殊的组合关系，paser类为主体
public class Parser
{
    //关联CommandWords类，创建实例对象
    private CommandWords commands;
    private Scanner reader;

    public Parser()
    {
        commands = new CommandWords();

        //使用Scanner来处理用户输入
        reader = new Scanner(System.in);
    }

    /**
     * 从用户输入中获取命令用于判断输入的字符是否为CommandWords中存在的指令关键字字符，返回Command对象
     * @return 用户输入的 Command 对象.
     */
    public Command getCommand()
    {
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> ");

        //使用nextLine()获取字符串的使用
        //输入之间可以有空白，Enter是结束符，按下即获取输入回车之前的所有字符
        inputLine = reader.nextLine();

        //使用scanner将=用户输入分解为两个单词word1和word2
        Scanner tokenizer = new Scanner(inputLine);
        if(tokenizer.hasNext()) {
            word1 = tokenizer.next();   
            if(tokenizer.hasNext()) {
                word2 = tokenizer.next();
            }
        }

        //如果是符合要求的关键词指令则创建Command对象
        if(commands.isCommand(word1)) {
            return new Command(word1, word2);
        }
        else {
            return new Command(null, word2);
        }
    }

    /**
     * 显示所有指令.
     */
    public void showCommands()
    {
        commands.showAll();
    }
}
