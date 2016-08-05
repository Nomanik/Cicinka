package me.noman_svk.hub.Utils;

import me.noman_svk.hub.Main;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class VIPMenu implements Listener {
	
	@SuppressWarnings("unused")
	private Main main;
	public VIPMenu(Main main) {
		this.main = main;
	}

private void openGui(Player p) {
	   Inventory inv = Bukkit.createInventory(null, 27, ChatColor.BLUE + "§9§lVIP§8§l»");
	   
	   ItemStack vipsk = new ItemStack(Material.DIAMOND);
	   ItemMeta vipskMeta = vipsk.getItemMeta();
	   ItemStack vyhody = new ItemStack(Material.BOOK);
	   ItemMeta vyhodyMeta = vyhody.getItemMeta();
	   ItemStack vipcz = new ItemStack(Material.DIAMOND);
	   ItemMeta vipczMeta = vipcz.getItemMeta();
	    
	   vipskMeta.setDisplayName("§9§lVIP §8§l» §7SK §8§l«");
       vipskMeta.setLore(Arrays.asList("§7Configuration...", "§7Pripravujeme..."));
	   vipsk.setItemMeta(vipskMeta);
	   vyhodyMeta.setDisplayName("§9§lVIP §7vyhody!");
	   vyhodyMeta.setLore(Arrays.asList("§7Configuration...", "§7Pripravujeme..."));
	   vyhody.setItemMeta(vyhodyMeta);
	   vipczMeta.setDisplayName("§9§lVIP §8§l» §7SK §8§l«");
       vipczMeta.setLore(Arrays.asList("§7Configuration...", "§7Pripravujeme..."));
	   vipcz.setItemMeta(vipczMeta);

	   inv.setItem(10, vipsk);
	   p.openInventory(inv);
	   inv.setItem(13, vyhody);
	   p.openInventory(inv);
	   inv.setItem(16, vipcz);
	   p.openInventory(inv);
   }
   @EventHandler
   public void onInventoryClick(InventoryClickEvent e) {
	   if(!ChatColor.stripColor(e.getInventory().getName()).equalsIgnoreCase("VIP»"))
		   return;
	   Player p = (Player) e.getWhoClicked();
	   e.setCancelled(true);
	   if(e.getCurrentItem()==null || e.getCurrentItem().getType()==Material.AIR || e.getCurrentItem().hasItemMeta()) {
		   p.closeInventory();
		   return;
	   }
	   switch (e.getCurrentItem().getType()) {
	   default:
		   p.closeInventory();
		   break;
	   }
   }
   
   @EventHandler
   public void onPlayerInteract(PlayerInteractEvent e) {
	ItemStack is = e.getItem();
	if(e.getAction() == Action.PHYSICAL || is == null || is.getType() == Material.AIR)
		return;
	if(is.getType()==Material.GOLD_INGOT)
		openGui(e.getPlayer());
   }
   
}

