package cn.edu.whut.sept.zuul;
/**
 * CommandWords 类表示游戏中允许的命令关键字集合。
 * 目前包括 "go"、"quit" 和 "help" 三个命令。
 */

//Command、CommandWords、Parser类用来处理输入和指令分析
//被Paser类依赖和关联
public class CommandWords
{
    //使用静态常量来表示有效的指令，作为程序中的关键字 指令作为关键字在类和实例之间不变.
    private static final String[] validCommands = {
            "go", "quit", "help"
    };

    /**
     * CommandWords 类的构造方法。
     * 当前没有需要执行操作
     */
    public CommandWords()
    {
        // nothing to do at the moment...
    }

    /**
     * 检查给定字符串是否是有效的命令。
     * @param aString 要检查的字符串
     * @return 如果字符串是有效命令则返回 true，否则返回 false
     */
    public boolean isCommand(String aString)
    {
        for(int i = 0; i < validCommands.length; i++) {
            if(validCommands[i].equals(aString))
                return true;
        }
        return false;
    }

    /**
     * 显示所有有效的命令关键字。
     * 输出到控制台，以供玩家参考。
     */
    public void showAll()
    {
        for(String command: validCommands) {
            System.out.print(command + "  ");
        }
        System.out.println();
    }
}
