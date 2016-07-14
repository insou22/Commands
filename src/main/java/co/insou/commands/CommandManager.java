package co.insou.commands;

import org.bukkit.plugin.java.JavaPlugin;

public class CommandManager {

    private final JavaPlugin plugin;

    public CommandManager(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void register(CommandConsumer consumer) {
        plugin.getCommand(consumer.getCommand()).setExecutor(consumer);
    }

}
