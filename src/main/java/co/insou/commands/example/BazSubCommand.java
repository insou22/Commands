package co.insou.commands.example;

import co.insou.commands.SubCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BazSubCommand extends SubCommand {

    public BazSubCommand() {
        super("baz");
        super.addAlias("bazz").addAlias("bazzz");
    }

    @Override
    public void onCommand(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("Baz!");
    }

}
