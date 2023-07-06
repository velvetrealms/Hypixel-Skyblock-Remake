package me.adarsh.godspunkycore.features.entity.dungeon.bosses;

import me.adarsh.godspunkycore.features.entity.EntityFunction;
import me.adarsh.godspunkycore.features.entity.EntityStatistics;
import me.adarsh.godspunkycore.features.entity.ZombieStatistics;

public class Sadan implements ZombieStatistics, EntityStatistics, EntityFunction {
    @Override
    public String getEntityName() {
        return "✪ Sadan ✪";
    }

    @Override
    public boolean isBaby() {
        return false;
    }

    @Override
    public boolean isVillager() {
        return false;
    }

    @Override
    public double getEntityMaxHealth() {
        return 40000000.0;
    }

    @Override
    public double getDamageDealt() {
        return 34340.0;
    }


    @Override
    public double getXPDropped() {
        return 100.0;
    }
    @Override
    public double getMovementSpeed() {
        return 0.4;
    }
}



