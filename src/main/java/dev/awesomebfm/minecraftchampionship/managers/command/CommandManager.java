package dev.awesomebfm.minecraftchampionship.managers.command;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;

public class CommandManager implements CommandExecutor {

    ArrayList<SubCommand> subCommands = new ArrayList<>();

    public void registerSubCommand(SubCommand subCommand) {
        subCommands.add(subCommand);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0) {
            return true;
        }
        for (SubCommand subCommand: subCommands) {
            if (subCommand.getName().equalsIgnoreCase(args[0])) {
                if (sender.hasPermission(subCommand.getPermission())) {
                    subCommand.execute(sender, args);
                } else {
                    sender.sendMessage(ChatColor.RED + "ERROR: Missing Permission!");
                }
                return true;
            }
        }
        sender.sendMessage(ChatColor.RED + "ERROR: Subcommand Not Found!");
        return true;
    }
}
