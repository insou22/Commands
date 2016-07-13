package co.insou.commands.example;

import co.insou.commands.Commands;
import co.insou.commands.SubCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BarSubCommand extends SubCommand {

    private final Commands plugin;

    public BarSubCommand(Commands plugin) {
        super("bar");
        this.plugin = plugin;
        super.addAlias("barr").addAlias("barrr");
    }

    @Override
    public void onCommand(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("Bar!");
    }

}
