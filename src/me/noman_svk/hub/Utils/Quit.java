package me.noman_svk.hub.Utils;

import me.noman_svk.hub.Main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class Quit implements Listener {
	
	@SuppressWarnings("unused")
	private Main main;
	public Quit(Main main) {
		this.main = main;
	}
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		e.setQuitMessage(null);
	}

}
