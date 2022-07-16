package net.gravyarts.c418records.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;


public class RecordDiscItem extends MusicDiscItem {

	public RecordDiscItem(int comparatorOutput, SoundEvent sound, Settings settings) 
	{
		super(comparatorOutput, sound, settings);
	}
	
}
