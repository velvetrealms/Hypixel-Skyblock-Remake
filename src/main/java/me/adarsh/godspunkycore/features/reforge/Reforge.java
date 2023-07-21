package me.adarsh.godspunkycore.features.reforge;

import me.adarsh.godspunkycore.features.item.GenericItemType;
import me.adarsh.godspunkycore.features.item.RarityValue;

import java.util.Arrays;
import java.util.List;

public interface Reforge {
    String getName();

    default RarityValue<Double> getStrength() {
        return RarityValue.zeroDouble();
    }

    default RarityValue<Double> getCritChance() {
        return RarityValue.zeroDouble();
    }

    default RarityValue<Double> getCritDamage() {
        return RarityValue.zeroDouble();
    }

    default RarityValue<Double> getIntelligence() {
        return RarityValue.zeroDouble();
    }

    default RarityValue<Double> getDefence() {
        return RarityValue.zeroDouble();
    }

    default RarityValue<Double> getHealth() {
        return RarityValue.zeroDouble();
    }

    default RarityValue<Double> getSpeed() {
        return RarityValue.zeroDouble();
    }

    default List<GenericItemType> getCompatibleTypes() {
        return Arrays.asList(GenericItemType.values());
    }

    static Reforge blank() {
        return () -> "Blank";
    }

    default RarityValue<Double> getFerocity() {
        return RarityValue.zeroDouble();
    }

    default RarityValue<Double> getAttackSpeed() {
        return RarityValue.zeroDouble();
    }
}