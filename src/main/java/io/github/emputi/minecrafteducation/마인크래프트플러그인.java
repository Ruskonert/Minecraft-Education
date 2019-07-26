package io.github.emputi.minecrafteducation;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class 마인크래프트플러그인 extends JavaPlugin {
    @Override
    public final void onEnable() {
        this.시작하기();
    }

    protected abstract void 시작하기();
    protected abstract void 종료하기();
    protected abstract void 명령어처리하기(Player 보낸플레이어, String 입력된명령어, String[] 명령어인자);


    @Override
    public final boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof ConsoleCommandSender)
            return true;
        Player sender2 = (Player)sender;
        this.명령어처리하기(sender2, label, args);
        return true;
    }

    @Override
    public final void onDisable() {
        this.종료하기();
    }
}
