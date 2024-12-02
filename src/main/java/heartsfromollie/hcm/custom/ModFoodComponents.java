package heartsfromollie.hcm.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {

    public static final FoodComponent BERRY_JAM_COOKIE = new FoodComponent.Builder().hunger(3).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 300),1f).build();

    public static final FoodComponent OATMEAL_COOKIE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION,120),1f).build();

    public static final FoodComponent WHITE_CHOCOLATE_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.6f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 120),1f).build();

    public static final FoodComponent SPRINKLE_COOKIE = new FoodComponent.Builder().hunger(2).saturationModifier(0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 120),0.5f).build();
}
