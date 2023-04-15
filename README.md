# Scoreboard-API

## Exemple

```java
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        ScoreboardAPI scoreboard = new ScoreboardAPI(player, ChatColor.RED + "Exemple");

        scoreboard.setScore(ChatColor.GRAY + "Player : " + Bukkit.getOnlinePlayers().size() + "/" + Bukkit.getMaxPlayers(), 0);
        scoreboard.setScore(ChatColor.GRAY + "Hello World !", 1);
        scoreboard.setScore(ChatColor.GRAY + "Pseudo: " + player.getName(), 2);
    }
    ```
