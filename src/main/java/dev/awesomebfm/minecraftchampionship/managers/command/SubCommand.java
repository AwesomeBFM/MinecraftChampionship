package dev.awesomebfm.minecraftchampionship.managers.command;

import org.bukkit.command.CommandSender;
import org.bukkit.permissions.Permission;

public abstract class SubCommand {
    public abstract String getName();
    public abstract String getDescription();
    public abstract String getPermission();
    public abstract String getSyntax();
    public abstract void execute(CommandSender sender, String[] args);
}
