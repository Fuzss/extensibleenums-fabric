package fuzs.extensibleenums.mixin.accessor;

import net.minecraft.world.entity.raid.Raid;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(Raid.RaiderType.class)
public interface RaiderTypeAccessor {

    @Accessor(value = "VALUES")
    @Mutable
    static void setValues(Raid.RaiderType[] values) {
        throw new IllegalStateException();
    }
}
