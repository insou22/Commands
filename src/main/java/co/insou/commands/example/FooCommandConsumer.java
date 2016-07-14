package co.insou.commands.example;

import co.insou.commands.CommandConsumer;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FooCommandConsumer extends CommandConsumer {

    public FooCommandConsumer() {
        super("foo", true);
        super.addSubCommand(new BarSubCommand()).addSubCommand(new BazSubCommand());
    }

    @Override
    public void onCommand(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage("Foo!");
    }

}
