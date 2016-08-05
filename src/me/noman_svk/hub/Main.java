package me.noman_svk.hub;

import me.noman_svk.hub.Utils.AntiPl;
import me.noman_svk.hub.Utils.DoubleJump;
import me.noman_svk.hub.Utils.Join;
import me.noman_svk.hub.Utils.VIPMenu;
import me.noman_svk.hub.Utils.Quit;
import me.noman_svk.hub.Utils.Utils;
import me.noman_svk.hub.Utils.Visibility;

import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	PluginManager pm = getServer().getPluginManager();
	
	public void onEnable() {
		System.out.print("[Lobby] Plugin bol aktivovany!");
		getServer().getPluginManager().registerEvents(this, this);
		pm.registerEvents(new Join(this), this);
		pm.registerEvents(new DoubleJump(this), this);
		pm.registerEvents(new Visibility(this), this);
		pm.registerEvents(new Quit(this), this);
		pm.registerEvents(new Utils(this), this);
		pm.registerEvents(new VIPMenu(this), this);
		pm.registerEvents(new AntiPl(this), this);
    }
}
