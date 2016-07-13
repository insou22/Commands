package co.insou.commands.example;

import co.insou.commands.Commands;
import co.insou.commands.SubCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BazSubCommand extends SubCommand {

    private final Commands plugin;

    public BazSubCommand(Commands plugin) {
        super("baz");
        this.plugin = plugin;
        super.addAlias("bazz").addAlias("bazzz");
    }

    @Override
    public void onCommand(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("Baz!");
    }

}
