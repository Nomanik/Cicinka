package me.noman_svk.hub.Utils;

import me.noman_svk.hub.Main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.weather.WeatherChangeEvent;

public class Utils implements Listener {
	
	@SuppressWarnings("unused")
	private Main main;
	public Utils(Main main) {
		this.main = main;
	}
@EventHandler
	public void onWeatherChange(WeatherChangeEvent e) {
		e.setCancelled(true);
	}
@EventHandler
    public void onFoodChange(FoodLevelChangeEvent e) {
	e.setCancelled(true);
}
@EventHandler
	public void onDamage(EntityDamageEvent e) {
		e.setCancelled(true);
	}
@EventHandler
	public void onBlockPlace(BlockPlaceEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			e.setCancelled(false);
		}
		else if(p.hasPermission("lobby.drop")) {
			e.setCancelled(true);
		}
	}
@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			e.setCancelled(false);
		}
		else if(p.hasPermission("lobby.drop")) {
			e.setCancelled(true);
		}
	}
@EventHandler
	public void onItemDrop(PlayerDropItemEvent  e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			e.setCancelled(false);
		}
		else if(p.hasPermission("lobby.drop")) {
			e.setCancelled(true);
		}
	}
@EventHandler
	public void onItemPickup(PlayerPickupItemEvent e) {
		Player p = e.getPlayer();
		if(p.isOp()) {
			e.setCancelled(false);
		}
		else if(p.hasPermission("lobby.drop")) {
			e.setCancelled(true);
		}
	}
}