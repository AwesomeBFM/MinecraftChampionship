package dev.awesomebfm.minecraftchampionship.listeners;

import dev.awesomebfm.minecraftchampionship.events.VotingBegins;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.ArrayList;
import java.util.List;

public class VoteBeginsListener implements Listener {

    //region Slices
    private final ArrayList<Location> slice1 = new ArrayList<>(
            List.of(
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0)
            )
    );
    private final ArrayList<Location> slice2 = new ArrayList<>(
            List.of(
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0)
            )
    );
    private final ArrayList<Location> slice3 = new ArrayList<>(
            List.of(
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0)
            )
    );
    private final ArrayList<Location> slice4 = new ArrayList<>(
            List.of(
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0)
            )
    );
    private final ArrayList<Location> slice5 = new ArrayList<>(
            List.of(
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0)
            )
    );
    private final ArrayList<Location> slice6 = new ArrayList<>(
            List.of(
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0),
                    new Location(null, 0, 0, 0)
            )
    );
    //endregion


    @EventHandler
    public void onVoteBegins(VotingBegins event) {
        for (Location location : slice1) {
            location.getBlock().setType(Material.WHITE_CONCRETE);
        }
        for (Location location : slice2) {
            location.getBlock().setType(Material.WHITE_CONCRETE);
        }
        for (Location location : slice3) {
            location.getBlock().setType(Material.WHITE_CONCRETE);
        }
        for (Location location : slice4) {
            location.getBlock().setType(Material.WHITE_CONCRETE);
        }
        for (Location location : slice5) {
            location.getBlock().setType(Material.WHITE_CONCRETE);
        }
        for (Location location : slice6) {
            location.getBlock().setType(Material.WHITE_CONCRETE);
        }
    }
}
