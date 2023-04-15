package fr.alouchi.scoreboard;

/**
 * MIT License
 *
 * Copyright (c) 2023 Alouchi
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;

/**
 * @author AlouchiCC
 * @version 1.0.1
 * @github https://github.com/MoiLaVie/ScoreboardAPI
 */

public class ScoreboardAPI {

    private Scoreboard scoreboard;
    private Objective objective;
    private Player player;

    /**
     * @param player
     * @param displayName
     */
    public ScoreboardAPI(Player player, String displayName) {
        this.player = player;
        scoreboard = Bukkit.getScoreboardManager().getNewScoreboard();
        objective = scoreboard.registerNewObjective("objective", "dummy");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName(displayName);
        player.setScoreboard(scoreboard);
    }

    /**
     * @param displayName
     */
    public void setDisplayName(String displayName) {
        objective.setDisplayName(displayName);
    }

    /**
     * @param entry
     * @param score
     */
    public void setScore(String entry, int score) {
        objective.getScore(entry).setScore(score);
    }

    /**
     * @param entry
     */
    public void removeScore(String entry) {
        scoreboard.resetScores(entry);
    }
    public void clear() {
        for (String entry : scoreboard.getEntries()) {
            scoreboard.resetScores(entry);
        }
    }

    /**
     * @return
     */
    public Player getPlayer() {
        return player;
    }
}
