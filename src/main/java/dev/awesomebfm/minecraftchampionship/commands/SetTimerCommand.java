package dev.awesomebfm.minecraftchampionship.commands;

import dev.awesomebfm.minecraftchampionship.managers.command.SubCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;

public class SetTimerCommand extends SubCommand {
    @Override
    public String getName() {
        return "set";
    }

    @Override
    public String getDescription() {
        return "set the time on the timer";
    }

    @Override
    public String getPermission() {
        return "mcc.timer";
    }

    @Override
    public String getSyntax() {
        return "/timer set <minutes> <seconds>";
    }

    @Override
    public void execute(CommandSender sender, String[] args) {
        if (args.length == 1) {
            sender.sendMessage("ERROR: Please enter a time!");
            sender.sendMessage(getSyntax());
            return;
        }
        int minutes = Integer.parseInt(args[1]);
        int seconds = 0;
        if (args.length == 2) {
            seconds = Integer.parseInt(args[2]);
        }

    }
}
