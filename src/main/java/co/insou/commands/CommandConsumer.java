package co.insou.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class CommandConsumer implements CommandExecutor {

    private final String command;
    private final boolean player;
    private final List<SubCommand> subCommands = new ArrayList<>();

    public CommandConsumer(String command, boolean player) {
        this.command = command;
        this.player = player;
    }

    public CommandConsumer addSubCommand(SubCommand subCommand) {
        subCommands.add(subCommand);
        return this;
    }

    @Override
    public final boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (player) {
            if (!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "You must be a player to perform this command!");
                return false;
            }
        }
        if (args.length > 0) {
            for (SubCommand subCommand : subCommands) {
                if (subCommand.substitute(args[0]) != null) {
                    subCommand.onCommand(sender, label, args);
                    return false;
                }
            }
        }
        onCommand(sender, label, args);
        return false;
    }

    public abstract void onCommand(CommandSender sender, String label, String[] args);

    public final String getCommand() {
        return command;
    }

}
