package me.Sentaan.findMyFriend;

import org.bukkit.plugin.java.JavaPlugin;

import me.Sentaan.findMyFriend.listeners.CompassListener;

public class Main extends JavaPlugin {
	
	public String tracked = "";
	
	@Override
	public void onEnable() {
		new CompassListener(this);
		System.out.println("(!) Find my Friend now online");
	}
	public void onDisable() {
		System.out.println("(!) Find my Friend now offline");
	}
}