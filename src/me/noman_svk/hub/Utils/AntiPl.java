package me.noman_svk.hub.Utils;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import me.noman_svk.hub.Main;

public class AntiPl implements Listener {
	
	@SuppressWarnings("unused")
	private Main main;
	public AntiPl(Main main) {
		this.main = main;
}

@EventHandler
public void onPlayerCommand(PlayerCommandPreprocessEvent e)
{
  if (!e.getPlayer().isOp())
  {
    if (e.getMessage().startsWith("/pl"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("pl"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/plugins"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("pl"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/?"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("?"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/ver"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("ver"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/version"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("ver"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/bukkit:pl"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("bukkit:pl"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/bukkit:plugins"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("bukkit:plugins"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/bukkit:version"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("bukkit:version"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/bukkit:ver"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("bukkit:ver"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/bukkit:?"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("bukkit:?"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l██§f§l█§9§l██§f§l█§9§l██");
      e.getPlayer().sendMessage("§9§l████████      §7Hey!");
      e.getPlayer().sendMessage("§9§l█§f§l██████§9§l█      §7You dont have permissions!");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l█§f§l█§9§l████§f§l█§9§l█");
      e.getPlayer().sendMessage("§9§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("/antipl"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§2§l████████");
      e.getPlayer().sendMessage("§2§l██§a§l█§2§l██§a§l█§2§l██");
      e.getPlayer().sendMessage("§2§l██§a§l█§2§l██§a§l█§2§l██");
      e.getPlayer().sendMessage("§2§l████████                  §aHey!");
      e.getPlayer().sendMessage("§2§l█§a§l█§2§l████§a§l█§2§l█      §aThis plugin created Noman_SVK!");
      e.getPlayer().sendMessage("§2§l█§a§l█§2§l████§a§l█§2§l█");
      e.getPlayer().sendMessage("§2§l█§a§l██████§2§l█");
      e.getPlayer().sendMessage("§2§l████████");
      e.getPlayer().sendMessage("§9");
    }
    if (e.getMessage().startsWith("antipl"))
    {
      e.setCancelled(true);
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§a");	
      e.getPlayer().sendMessage("§2§l████████");
      e.getPlayer().sendMessage("§2§l██§a§l█§2§l██§a§l█§2§l██");
      e.getPlayer().sendMessage("§2§l██§a§l█§2§l██§a§l█§2§l██");
      e.getPlayer().sendMessage("§2§l████████                  §aHey!");
      e.getPlayer().sendMessage("§2§l█§a§l█§2§l████§a§l█§2§l█      §aThis plugin created Noman_SVK!");
      e.getPlayer().sendMessage("§2§l█§a§l█§2§l████§a§l█§2§l█");
      e.getPlayer().sendMessage("§2§l█§a§l██████§2§l█");
      e.getPlayer().sendMessage("§2§l████████");
      e.getPlayer().sendMessage("§9");
    }
  }
}
}
