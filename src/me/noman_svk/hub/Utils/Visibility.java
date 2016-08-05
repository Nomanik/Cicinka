package me.noman_svk.hub.Utils;

import me.noman_svk.hub.Main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class Visibility implements Listener{
	
	@SuppressWarnings("unused")
	private Main main;
	public Visibility(Main main) {
		this.main = main;
	}
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		ItemStack VisOn = new ItemStack(Material.SLIME_BALL);
		ItemMeta VisOnMeta = VisOn.getItemMeta();
		VisOnMeta.setDisplayName("§2&lPlayers §aON");
		VisOn.setItemMeta(VisOnMeta);
		Player p = e.getPlayer();
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
		if(p.getItemInHand().getType() == Material.MAGMA_CREAM) {
			for(Player hide : Bukkit.getOnlinePlayers()) {
				p.showPlayer(hide);
				p.sendMessage(MessageHandler.prefix + "Players on!");
				ItemStack VisOff = new ItemStack(Material.MAGMA_CREAM);
				ItemMeta VisOffMeta = VisOff.getItemMeta();
				VisOffMeta.setDisplayName("§2&lPlayers §aOFF");
				VisOff.setItemMeta(VisOffMeta);
				p.getInventory().getItemInHand();
				p.getInventory().setItemInHand(VisOn);
				return;
				
			}
		}
		}
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK || e.getAction() == Action.RIGHT_CLICK_AIR) {
		if(p.getItemInHand().getType() == Material.SLIME_BALL) {
			for(Player hide : Bukkit.getOnlinePlayers()) {
				p.hidePlayer(hide);
				p.sendMessage(MessageHandler.prefix + "Players off!");
				ItemStack VisOff = new ItemStack(Material.MAGMA_CREAM);
				ItemMeta VisOffMeta = VisOff.getItemMeta();
				VisOffMeta.setDisplayName("§2&lPlayers §aOFF");
				VisOff.setItemMeta(VisOffMeta);
				p.getInventory().getItemInHand();
				p.getInventory().setItemInHand(VisOff);
				return;
				
			}
		
		}
		}
		
	}
	

}
