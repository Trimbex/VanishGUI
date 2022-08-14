package vanishproject.vanishproject;

import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public final class Vanishproject extends JavaPlugin {
    public ArrayList<Player> vanish = new ArrayList<>();


    @Override
    public void onEnable() {
        // Plugin startup logic

getCommand("Vanish").setExecutor(new VanishGUI());
getCommand("Vanishon").setExecutor(new VanishCMDtrue(this));
getCommand("Vanishoff").setExecutor(new VanishCMDfalse(this));

getServer().getPluginManager().registerEvents(new VanishEvent(this),this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
