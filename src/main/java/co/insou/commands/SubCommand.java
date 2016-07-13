package co.insou.commands;

import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.List;

public abstract class SubCommand {

    private final String name;
    private final List<String> aliases = new ArrayList<>();

    public SubCommand(String name) {
        this.name = name.toLowerCase();
    }

    public final SubCommand addAlias(String alias) {
        aliases.add(alias.toLowerCase());
        return this;
    }

    public final String getName() {
        return name;
    }

    public final List<String> getAliases() {
        return aliases;
    }

    public final String substitute(String alias) {
        alias = alias.toLowerCase();
        if (alias.equals(name) || aliases.contains(alias)) {
            return name;
        }
        return null;
    }

    public abstract void onCommand(CommandSender sender, String label, String[] args);

}
