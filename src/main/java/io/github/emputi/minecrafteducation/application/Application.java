package io.github.emputi.minecrafteducation.application;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Application extends JavaPlugin
{
    private String convertColor(String name)
    {
        return ChatColor.translateAlternateColorCodes('&', name);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(label.equalsIgnoreCase("minecrafteducation"))
        {
            sender.sendMessage("&aMinecraft &6Education &fv1.0.0");
            sender.sendMessage(convertColor("&fCopyright 2019, ruskonert(ruskonert@gmail.com) all rights reserved."));
            sender.sendMessage(convertColor("&fFor report: https://github.com/emputi-osp/Minecraft-Education"));
        }
        return true;
    }

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage(convertColor("&a마인크래프트 &6교육 &f플러그인이 &b로드되었습니다."));
        Bukkit.getConsoleSender().sendMessage(convertColor("&e이제 교육 플러그인이 정상적으로 동작할 수 있습니다!"));
        Bukkit.getConsoleSender().sendMessage(convertColor("&fCopyright 2019, ruskonert(ruskonert@gmail.com) all rights reserved."));
        Bukkit.getConsoleSender().sendMessage(convertColor("&fFor report: https://github.com/emputi-osp/Minecraft-Education"));
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage(convertColor("&a마인크래프트 &6교육 &f플러그인이 &c언로드되었습니다."));
        Bukkit.getConsoleSender().sendMessage(convertColor("&e이제 교육 플러그인이 &c정상적으로 동작하지 않을 수 있습니다!"));
        Bukkit.getConsoleSender().sendMessage(convertColor("&fFor report: https://github.com/emputi-osp/Minecraft-Education"));
    }
}
