package com.skyworld.skychatbridge;

import org.bukkit.plugin.java.JavaPlugin;

public final class SkyChatBridge extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        saveDefaultConfig();
        boolean enabled = getConfig().getBoolean("discord.enabled");
        String token = getConfig().getString("discord.token");
        String guildId = getConfig().getString("discord.guild-id");
        String channelId = getConfig().getString("discord.channel-id");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
