package io.github.emputi.minecrafteducation;

import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class 판단하기
{
    public static boolean 플레이어인가(CommandSender sender)
    {
        return sender instanceof Player;
    }
    public static boolean 콘솔인가(CommandSender sender)
    {
        return sender instanceof ConsoleCommandSender;
    }
    public static boolean 같은말인가(String 대상1, String 대상2)
    {
        return 대상1.equalsIgnoreCase(대상2);
    }
}
