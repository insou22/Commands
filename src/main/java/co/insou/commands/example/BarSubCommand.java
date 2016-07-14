package co.insou.commands.example;

import co.insou.commands.SubCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class BarSubCommand extends SubCommand {

    public BarSubCommand() {
        super("bar");
        super.addAlias("barr").addAlias("barrr");
    }

    @Override
    public void onCommand(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("Bar!");
    }

}
