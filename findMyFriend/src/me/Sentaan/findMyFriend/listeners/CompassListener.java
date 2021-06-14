package me.Sentaan.findMyFriend.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;

import me.Sentaan.findMyFriend.Main;

public class CompassListener implements Listener{
	
	private Main plugin;
	
	public CompassListener(Main plugin) {
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void CompassClick(PlayerInteractEvent event) {
		Player p1 = event.getPlayer();
		Material held = event.getItem().getType();
		Action act = event.getAction();
				
				if (held == Material.COMPASS && (act == Action.RIGHT_CLICK_AIR || act == Action.RIGHT_CLICK_BLOCK)) {
					
					Player trckd = p1.getServer().getPlayer(this.plugin.tracked);
					p1.setCompassTarget(trckd.getLocation());
					p1.sendMessage("Now you can always find"+this.plugin.tracked);
				}
	}
}