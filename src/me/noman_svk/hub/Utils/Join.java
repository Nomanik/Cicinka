package me.noman_svk.hub.Utils;

import me.noman_svk.hub.Main;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Join implements Listener {
	
	
	@SuppressWarnings("unused")
	private Main main;
	public Join(Main main) {
		this.main = main;
	}
	
   @EventHandler
	public void onJoin(PlayerJoinEvent e) {
	    
		ItemStack VisOn = new ItemStack(Material.SLIME_BALL);
		ItemMeta VisOnMeta = VisOn.getItemMeta();
		VisOnMeta.setDisplayName("§2&lPlayer §aON");
		VisOn.setItemMeta(VisOnMeta);
		ItemStack vip = new ItemStack(Material.GOLD_INGOT);
		ItemMeta vipmeta = vip.getItemMeta();
		vipmeta.setDisplayName("§9§lVIP §7(Right click)");
		vip.setItemMeta(vipmeta);
		Player p = e.getPlayer();
		e.setJoinMessage(null);
		p.setExp(0);
		p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 99999999, 3, true),true);
		p.getInventory().clear();
		
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("");
		p.sendMessage("§2§lNETWORK§8§l» §aYou have been connected to §2§lHUB1§a.");
		p.setFoodLevel(20);
		p.setMaxHealth(2.0);

		if(p.getInventory().contains(Material.SLIME_BALL)) {
			p.getInventory().removeItem(VisOn);
			p.getInventory().setItem(8, VisOn);
		}
	    p.getInventory().setItem(8, VisOn);
     	if(p.getInventory().contains(Material.GOLD_INGOT)) {
		    p.getInventory().removeItem(vip);
		    p.getInventory().setItem(7, vip);
		    }
		    p.getInventory().setItem(7, vip);
	}
}

