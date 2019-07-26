package io.github.emputi.minecrafteducation;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class 가져오기 {
    public static Player 플레이어(String 플레이어의이름)
    {
        return Bukkit.getPlayer(플레이어의이름);
    }

    public static ConsoleCommandSender 콘솔()
    {
        return Bukkit.getConsoleSender();
    }

    public Block 블럭(double x좌표, double y좌표, double z좌표)
    {
        Location location = new Location(Bukkit.getWorld("world"), x좌표, y좌표, z좌표);
        return location.getBlock();
    }

    public 위치 플레이어좌표가져오기(Player 누구)
    {
        return new 위치(누구.getLocation());
    }

}
