package com.alz8rt.drill;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Alz8rtDrill extends JavaPlugin {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("drillgive")) {
            if (!(sender instanceof Player)) return true;
            Player p = (Player) sender;

            ItemStack pick = new ItemStack(Material.NETHERITE_PICKAXE);
            ItemMeta meta = pick.getItemMeta();
            meta.setDisplayName("§cAlz8rt Drill");
            meta.setUnbreakable(true);
            pick.setItemMeta(meta);

            p.getInventory().addItem(pick);
            p.sendMessage("§aتم إعطاؤك الـ Drill!");
        }
        return true;
    }

    @Override
    public void onEnable() {
        getLogger().info("Alz8rtDrill Enabled");
    }
}
