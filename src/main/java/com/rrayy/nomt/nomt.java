package com.rrayy.nomt;

import java.util.ArrayList;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;

public class nomt extends JavaPlugin implements Listener {
    ArrayList<Material> unbreakable = new ArrayList<Material>() {{
        add(Material.OAK_LOG);
        add(Material.SPRUCE_LOG);
        add(Material.BIRCH_LOG);
        add(Material.JUNGLE_LOG);
        add(Material.ACACIA_LOG);
        add(Material.DARK_OAK_LOG);
        add(Material.MANGROVE_LOG);
        add(Material.CRIMSON_STEM);
        add(Material.WARPED_STEM);
        add(Material.STONE);
        add(Material.COBBLESTONE);
        add(Material.IRON_ORE);
        add(Material.GOLD_ORE);
        add(Material.DIAMOND_ORE);
        add(Material.EMERALD_ORE);
        add(Material.LAPIS_ORE);
        add(Material.REDSTONE_ORE);
        add(Material.COAL_ORE);
        add(Material.COPPER_ORE);
        add(Material.NETHER_QUARTZ_ORE);
        add(Material.NETHER_GOLD_ORE);
        add(Material.ANCIENT_DEBRIS);
        add(Material.NETHERITE_BLOCK);
        add(Material.DEEPSLATE);
        add(Material.DEEPSLATE_COAL_ORE);
        add(Material.DEEPSLATE_COPPER_ORE);
        add(Material.DEEPSLATE_DIAMOND_ORE);
        add(Material.DEEPSLATE_EMERALD_ORE);
        add(Material.DEEPSLATE_GOLD_ORE);
        add(Material.DEEPSLATE_IRON_ORE);
        add(Material.DEEPSLATE_LAPIS_ORE);
        add(Material.DEEPSLATE_REDSTONE_ORE);
        add(Material.DIAMOND_BLOCK);
        add(Material.EMERALD_BLOCK);
        add(Material.GOLD_BLOCK);
        add(Material.IRON_BLOCK);
        add(Material.LAPIS_BLOCK);
        add(Material.REDSTONE_BLOCK);
        add(Material.COAL_BLOCK);
        add(Material.COPPER_BLOCK);
        add(Material.BASALT);
        add(Material.BLACKSTONE);
        add(Material.NETHERITE_BLOCK);
        add(Material.RAW_COPPER_BLOCK);
        add(Material.RAW_IRON_BLOCK);
        add(Material.RAW_GOLD_BLOCK);
    }};

    @Override
    public void onEnable() {
        // 이벤트 리스너 등록
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("No-Material 플러그인이 활성화되었습니다!");
    }

    @Override
    public void onDisable() {
        getLogger().info("No-Material 플러그인이 비활성화되었습니다.");
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        Player player = event.getPlayer();

        if (unbreakable.contains(block.getType())) {
            player.spigot().sendMessage(ChatMessageType.ACTION_BAR, new TextComponent(ChatColor.RED + "이 자원은 캘 수 없습니다!"));
            event.setCancelled(true);
        }
    }
}
