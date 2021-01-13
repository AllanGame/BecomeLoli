package me.allangame.becomeloli;

import lombok.Getter;
import me.allangame.becomeloli.utils.Configuration;
import org.bukkit.plugin.java.JavaPlugin;

public class BecomeLoli extends JavaPlugin {

    @Getter private Configuration config;
    @Getter private static BecomeLoli instance;

    @Override
    public void onEnable() {
        instance = this;

        setupConfiguration();
        setupListeners();
        setupCommands();
    }

    @Override
    public void onDisable() {
    instance = null;
    }

    private void setupConfiguration(){
        this.config = new Configuration(this, "config");
    }

    private void setupCommands(){

    }

    private void setupListeners(){

    }


}
