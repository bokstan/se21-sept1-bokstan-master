package cn.edu.whut.sept.zuul;

import java.util.Set;
import java.util.HashMap;
/**
 * Room 类表示游戏中的一个房间，包括房间的描述和与其他房间的连接关系。
 */

//Room被Game类关联
public class Room
{
    private String description;
    private HashMap<String, Room> exits;

    public Room(String description)
    {
        this.description = description;
        exits = new HashMap<>();
    }

    /**
     * 设置房间的出口.
     * @param direction 出口的方向.
     * @param neighbor 相邻房间.
     */
    public void setExit(String direction, Room neighbor)
    {
        exits.put(direction, neighbor);
    }

    /**
     * 获取房间的简化描述.
     * @return 房间的简化描述.
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * 获取房间的详细描述，包括出口信息.
     * @return 房间的详细描述.
     */
    public String getLongDescription()
    {
        return "You are " + description + ".\n" + getExitString();
    }

    /**
     * 获取房间的所有出口信息.
     * @return 包含所有出口信息的字符串.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * 根据方向获取相邻房间.
     * @param direction 出口的方向.
     * @return 相邻房间.
     */
    public Room getExit(String direction)
    {
        return exits.get(direction);
    }
}


