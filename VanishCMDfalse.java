package vanishproject.vanishproject;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class VanishCMDfalse implements CommandExecutor {
    public VanishCMDfalse(Vanishproject plugin) {
        this.plugin = plugin;
    }

    Vanishproject plugin;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;

        if(sender instanceof Player) {

            {
                player.showPlayer(player);
                plugin.vanish.remove(player);
                player.closeInventory();
                player.sendMessage("You are no longer in vanish mode!");

            }



        }








        return true;
    }
}
