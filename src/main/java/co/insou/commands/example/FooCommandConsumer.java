package co.insou.commands.example;

import co.insou.commands.CommandConsumer;
import co.insou.commands.Commands;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FooCommandConsumer extends CommandConsumer {

    private final Commands plugin;

    public FooCommandConsumer(Commands plugin) {
        super("foo", true);
        this.plugin = plugin;
        super.addSubCommand(new BarSubCommand(plugin)).addSubCommand(new BazSubCommand(plugin));
    }

    @Override
    public void onCommand(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("Foo!");
    }

}
