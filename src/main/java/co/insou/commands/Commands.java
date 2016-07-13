package co.insou.commands;

import co.insou.commands.example.FooCommandConsumer;
import org.bukkit.plugin.java.JavaPlugin;

public class Commands extends JavaPlugin {

    @Override
    public void onEnable() {
        CommandManager commandManager = new CommandManager(this);
        commandManager.register(new FooCommandConsumer(this));
    }

}
