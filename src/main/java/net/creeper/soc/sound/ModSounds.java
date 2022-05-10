package net.creeper.soc.sound;

import net.creeper.soc.StoryOfCreeper;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent MORGEN_MUSIC = registerSoundEvent("morgen_music");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(StoryOfCreeper.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
