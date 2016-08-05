package me.noman_svk.hub.Utils;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;

import me.noman_svk.hub.Main;

public class DoubleJump implements Listener {
	
	@SuppressWarnings("unused")
	private Main main;
	public DoubleJump(Main main) {
		this.main = main;
}
	
@EventHandler
public void onPlayerToggleFlight(PlayerToggleFlightEvent e)
{
  Player player = e.getPlayer();
  if (player.getGameMode() == GameMode.CREATIVE) {
    return;
  }
  e.setCancelled(true);
  player.setAllowFlight(false);
  player.setFlying(false);
  player.setVelocity(player.getLocation().getDirection().multiply(1.5D).setY(1));
  player.getWorld().playSound(player.getLocation(), Sound.ENDERDRAGON_WINGS, 1.0F, 1.0F);
}

@EventHandler
public void onPlayerMove(PlayerMoveEvent e)
{
  Player player = e.getPlayer();
  if ((player.getGameMode() != GameMode.CREATIVE) && 
    (player.getLocation().subtract(0.0D, 1.0D, 0.0D).getBlock().getType() != Material.AIR) && 
    (!player.isFlying())) {
    player.setAllowFlight(true);
  }
}
}