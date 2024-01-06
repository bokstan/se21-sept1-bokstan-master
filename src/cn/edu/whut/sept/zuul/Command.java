package cn.edu.whut.sept.zuul;
/**
 * Command 类表示玩家输入的游戏命令。
 * 每个命令由两个部分组成：命令关键字和第二个单词（可能是方向、目标等）。
 */

//Command、CommandWords、Parser类用来处理输入和指令分析
//被Parser类依赖
public class Command
{
    /**
     * 创建两个参数，commandWord和secondWord
     */
    private String commandWord;

    //secondWord可为空
    private String secondWord;

    /**
     * Command 类的构造方法，用于创建一个新的命令对象。
     *
     * @param firstWord  命令的第一个单词，即命令关键字
     * @param secondWord 命令的第二个单词，可能为 null
     */
    public Command(String firstWord, String secondWord)
    {
        commandWord = firstWord;
        this.secondWord = secondWord;
    }

    /**
     * 获取命令的关键字。
     * @return 命令的关键字
     */
    public String getCommandWord()
    {
        return commandWord;
    }

    /**
     * 获取命令的第二个单词。
     * @return 命令的第二个单词，可能为 null
     */
    public String getSecondWord()
    {
        return secondWord;
    }

    /**
     * 检查命令是否未知。
     * @return 如果命令未知则返回 true，否则返回 false
     */
    public boolean isUnknown()
    {
        return (commandWord == null);
    }

    /**
     * 检查命令是否有第二个单词。
     * @return 如果命令有第二个单词则返回 true，否则返回 false
     */
    public boolean hasSecondWord()
    {
        return (secondWord != null);
    }
}
