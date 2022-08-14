package vanishproject.vanishproject;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

import java.util.ArrayList;

public class VanishCMDtrue implements CommandExecutor, Listener {
    public VanishCMDtrue(Vanishproject plugin) {
        this.plugin = plugin;
    }

    Vanishproject plugin;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            Player player = (Player) sender;

        if(sender instanceof Player) {

            {
        player.hidePlayer(player);
        plugin.vanish.add(player);
        player.closeInventory();
        player.sendMessage("You are now in vanish mode!");

    }




}








        return true;
    }
}
