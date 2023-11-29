/**
 * Created by tomasz_taw
 * Date: 29.11.2023
 * Time: 16:50
 * Project Name: minecraftApi
 * Description:
 */
package pl.taw.minecraft;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/minecraft")
public class MinecraftController {

    @GetMapping("/players")
    public List<String> getOnlinePlayers() {
        List<String> playerNames = new ArrayList<>();
        for (Player player : Bukkit.getServer().getOnlinePlayers()) {
            playerNames.add(player.getName());
        }
        return playerNames;
    }

    @GetMapping("/worlds")
    public List<String> getWorlds() {
        List<String> worldNames = new ArrayList<>();
        for (World world : Bukkit.getServer().getWorlds()) {
            worldNames.add(world.getName());
        }
        return worldNames;
    }
}
