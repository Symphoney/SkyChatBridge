package com.skyworld.skychatbridge;

import org.bukkit.plugin.java.JavaPlugin;

public final class SkyChatBridge extends JavaPlugin {

    private DiscordManager discordManager;

    @Override
    public void onEnable() {
        saveDefaultConfig();

        discordManager = new DiscordManager(this);
        if (discordManager.start()) {
            getServer().getPluginManager().registerEvents(new MinecraftChatListener(discordManager), this);
        }
    }

    @Override
    public void onDisable() {
        if (discordManager != null) {
            discordManager.shutdown();
        }
    }
}
