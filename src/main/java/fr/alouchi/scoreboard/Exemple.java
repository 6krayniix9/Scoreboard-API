package fr.alouchi.scoreboard;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Exemple implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ScoreboardAPI scoreboard = new ScoreboardAPI(player, ChatColor.RED + "Exemple");

        scoreboard.setScore(ChatColor.GRAY + "Player : " + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers(), 0);
        scoreboard.setScore(ChatColor.GRAY + "Hello World !", 1);
        scoreboard.setScore(ChatColor.GRAY + "Pseudo: " + player.getName(), 2);
    }
}
