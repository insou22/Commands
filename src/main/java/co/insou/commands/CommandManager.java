package co.insou.commands;

public class CommandManager {

    private final Commands plugin;

    public CommandManager(Commands plugin) {
        this.plugin = plugin;
    }

    public void register(CommandConsumer consumer) {
        plugin.getCommand(consumer.getCommand()).setExecutor(consumer);
    }

}
