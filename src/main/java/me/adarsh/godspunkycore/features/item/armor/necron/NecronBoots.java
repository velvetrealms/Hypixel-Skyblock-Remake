package me.adarsh.godspunkycore.features.item.armor.necron;

import me.adarsh.godspunkycore.features.item.GenericItemType;
import me.adarsh.godspunkycore.features.item.MaterialFunction;
import me.adarsh.godspunkycore.features.item.Rarity;
import me.adarsh.godspunkycore.features.item.SpecificItemType;
import me.adarsh.godspunkycore.features.item.armor.LeatherArmorStatistics;

public class NecronBoots implements LeatherArmorStatistics, MaterialFunction {
    @Override
    public SpecificItemType getSpecificType() {
        return SpecificItemType.BOOTS;
    }

    @Override
    public double getBaseStrength() {
        return 40;
    }

    @Override
    public double getBaseCritDamage() {
        return 0.30;
    }

    @Override
    public double getBaseIntelligence() {
        return 10;
    }

    @Override
    public double getBaseHealth() {
        return 145;
    }

    @Override
    public double getBaseDefense() {
        return 85;
    }

    @Override
    public String getDisplayName() {
        return "Necron's Boots";
    }

    @Override
    public Rarity getRarity() {
        return Rarity.LEGENDARY;
    }

    @Override
    public GenericItemType getType() {
        return GenericItemType.ARMOR;
    }

    @Override
    public int getColor() {
        return 0xE76E3C;
    }
}
