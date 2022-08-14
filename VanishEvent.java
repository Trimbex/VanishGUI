package vanishproject.vanishproject;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import org.bukkit.Material;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerJoinEvent;


public class VanishEvent implements Listener {

    public VanishEvent(Vanishproject plugin) {
        this.plugin = plugin;
    }


    Vanishproject plugin;

    @EventHandler
    public void GUIintereact(InventoryClickEvent e) {

        Player p = (Player) e.getWhoClicked();
        if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Vanish?"))
        {
            e.setCancelled(true);
        }
        if (e.getClickedInventory().getTitle().equalsIgnoreCase(ChatColor.GREEN + "" + ChatColor.BOLD + "Choose an option")) {

            if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("Yes")) {


                for (Player people : Bukkit.getOnlinePlayers()) ;
                {
                    p.performCommand("Vanishon");


                }
            } else if (e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase("No")) {
                for (Player people : Bukkit.getOnlinePlayers());
                {
                    p.performCommand("Vanishoff");
                }
            }
        }


    }


    public void playerjoin(PlayerJoinEvent k)
    {
        Player player = k.getPlayer();

        k.setJoinMessage("Welcome " + player + " this vanish plugin is made by SCREAMMMMMMMMMMM");
        for(int i = 0 ; i < plugin.vanish.size(); i++)

        {
            player.hidePlayer(plugin.vanish.get(i));




        }

        }



        }



