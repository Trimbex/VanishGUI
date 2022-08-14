package vanishproject.vanishproject;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.Potion;


public class VanishGUI implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(sender instanceof Player)
        {
            Player p = (Player) sender;
            Inventory vanishinv = Bukkit.createInventory(p,9, ChatColor.GREEN + "" + ChatColor.BOLD + "Choose an option");
            ItemStack yes = new ItemStack(Material.WOOL,1, (byte)5);
            ItemStack no = new ItemStack(Material.WOOL, 1, (byte)14);
            ItemStack vanish = new ItemStack(Material.FEATHER);
            ItemMeta vanishmeta = vanish.getItemMeta();
            ItemMeta yesmeta = yes.getItemMeta();
            ItemMeta nometa = no.getItemMeta();

            vanishmeta.setDisplayName("Vanish?");
            yesmeta.setDisplayName("Yes");
            nometa.setDisplayName("No");

            vanish.setItemMeta(vanishmeta);
            yes.setItemMeta(yesmeta);
            no.setItemMeta(nometa);

            vanishinv.setItem(2,yes);
            vanishinv.setItem(4,vanish);
            vanishinv.setItem(6,no);
            p.openInventory(vanishinv);










        }
        return false;
    }
}
