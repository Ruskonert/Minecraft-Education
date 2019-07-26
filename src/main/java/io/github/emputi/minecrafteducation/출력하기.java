package io.github.emputi.minecrafteducation;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class 출력하기 {
    public static void 메세지를콘솔로보내기(String 메세지)
    {
        Bukkit.getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('#',메세지));
    }

    public static void 메세지보내기(String 메세지, CommandSender 수신자)
    {
        수신자.sendMessage(ChatColor.translateAlternateColorCodes('#',메세지));
    }

    public static void 메세지를플레이어에게보내기(String 메세지, String 누구에게)
    {
        Player player = Bukkit.getPlayer(누구에게);
        if(player == null)
        {
            try {
                throw new Exception("플레이어 오류: " + 누구에게 + "님은 존재하지 않는 플레이어입니다.");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        else
        {
            player.sendMessage(ChatColor.translateAlternateColorCodes('#',메세지));
        }
    }

}
