package com.tntmodders.takumi.network;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;

public interface MessageToServer {
    IMessage handleServerSide(EntityPlayer player);
}
