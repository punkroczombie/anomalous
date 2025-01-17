package com.zombie.anomalous.registry

import com.zombie.anomalous.Anomalous
import com.zombie.anomalous.item.DoorBehavior
import com.zombie.anomalous.item.SwitchBehavior
import xyz.xenondevs.nova.addon.registry.ItemRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage

@Init(stage = InitStage.PRE_PACK)
object Items : ItemRegistry by Anomalous.registry {
    val LOGO = registerItem("logo")
    val GATE_A_SIGN  = registerItem("gate_a_sign")
    val HCZ_SIGN = registerItem("hcz_sign")
    val EZ_SIGN = registerItem("ez_sign")

    val STEEL_DOOR = item("steel_door") {
        behaviors(DoorBehavior)
    }
    val SWITCH = item("switch") {
        behaviors(SwitchBehavior)
    }

    val ROAD = registerItem(Blocks.ROAD)
    val ROAD_MIDDLE = registerItem(Blocks.ROAD_MIDDLE)
    val STEEL_RAILING = registerItem(Blocks.STEEL_RAILING)
    val COPPER_PIPE = registerItem(Blocks.COPPER_PIPE)
    val CC_CAMERA = registerItem(Blocks.CC_CAMERA)
    val CEILING_TILE = registerItem(Blocks.CEILING_TILE)
    val WEAPON_DESK_FOOT = registerItem(Blocks.WEAPON_DESK_FOOT)
    val WEAPON_DESK_DESK_MONITOR = registerItem(Blocks.WEAPON_DESK_MONITOR)
    val WEAPON_DESK_DESK_PLATE = registerItem(Blocks.WEAPON_DESK_PLATE)
    val COPPER_DIAMOND_PLATE = registerItem(Blocks.COPPER_DIAMOND_PLATE)
    val CERAMIC_TILES = registerItem(Blocks.CERAMIC_TILES)
    val LIGHT = registerItem(Blocks.LIGHT)
    val LIGHT_SMALL = registerItem(Blocks.LIGHT_SMALL)
    val LIGHT_LONG = registerItem(Blocks.LIGHT_LONG)
    val ROUND_CONCRETE_WALL_BOTTOM = registerItem(Blocks.ROUND_CONCRETE_WALL_BOTTOM)
    val ROUND_CONCRETE_WALL_MIDDLE = registerItem(Blocks.ROUND_CONCRETE_WALL_MIDDLE)
    val ROUND_CONCRETE_WALL_TOP = registerItem(Blocks.ROUND_CONCRETE_WALL_TOP)
    val SCREEN = registerItem(Blocks.SCREEN)
    val SERVER_TOP = registerItem(Blocks.SERVER_TOP)
    val SERVER_BOTTOM = registerItem(Blocks.SERVER_BOTTOM)
    val TRIMMED_GLASS = registerItem(Blocks.TRIMMED_GLASS)
    val THIN_CONCRETE_WALL = registerItem(Blocks.THIN_CONCRETE_WALL)
    val VENT = registerItem(Blocks.VENT)
    val SC_WALL = registerItem(Blocks.SC_WALL)
    val ORANGE_ZONE_WALL = registerItem(Blocks.ORANGE_ZONE_WALL)
    val ORANGE_ZONE_TRIMMED_WALL = registerItem(Blocks.ORANGE_ZONE_TRIMMED_WALL)
    val ORANGE_ZONE_LINED_WALL = registerItem(Blocks.ORANGE_ZONE_LINED_WALL)
    val ORANGE_ZONE_SLOPED_WALL = registerItem(Blocks.ORANGE_ZONE_SLOPED_WALL)
    val ORANGE_ZONE_FLIPPED_SLOPED_WALL = registerItem(Blocks.ORANGE_ZONE_FLIPPED_SLOPED_WALL)
    val BLUE_ZONE_WALL = registerItem(Blocks.BLUE_ZONE_WALL)
    val BLUE_ZONE_TRIMMED_WALL = registerItem(Blocks.BLUE_ZONE_TRIMMED_WALL)
    val BLUE_ZONE_LINED_WALL = registerItem(Blocks.BLUE_ZONE_LINED_WALL)
    val BLUE_ZONE_SLOPED_WALL = registerItem(Blocks.BLUE_ZONE_SLOPED_WALL)
    val BLUE_ZONE_FLIPPED_SLOPED_WALL = registerItem(Blocks.BLUE_ZONE_FLIPPED_SLOPED_WALL)
    val RED_ZONE_WALL = registerItem(Blocks.RED_ZONE_WALL)
    val RED_ZONE_TRIMMED_WALL = registerItem(Blocks.RED_ZONE_TRIMMED_WALL)
    val RED_ZONE_LINED_WALL = registerItem(Blocks.RED_ZONE_LINED_WALL)
    val RED_ZONE_SLOPED_WALL = registerItem(Blocks.RED_ZONE_SLOPED_WALL)
    val RED_ZONE_FLIPPED_SLOPED_WALL = registerItem(Blocks.RED_ZONE_FLIPPED_SLOPED_WALL)
    val CONCRETE_WALL = registerItem(Blocks.CONCRETE_WALL)
    val CONCRETE_CORNER = registerItem(Blocks.CONCRETE_CORNER)
    val CONCRETE_PILLAR = registerItem(Blocks.CONCRETE_PILLAR)
    val WHITE_PIPE = registerItem(Blocks.WHITE_PIPE)
    val CONCRETE_RAILING = registerItem(Blocks.CONCRETE_RAILING)
    val DRAIN_COVER = registerItem(Blocks.DRAIN_COVER)
    val TUNNEL_TOP = registerItem(Blocks.TUNNEL_TOP)
    val TUNNEL_BOTTOM = registerItem(Blocks.TUNNEL_BOTTOM)
    val INTERCOM_SPEAKER = registerItem(Blocks.INTERCOM_SPEAKER)
    val ZONE_WALL = registerItem(Blocks.ZONE_WALL)
    val ZONE_WALL_CORNER = registerItem(Blocks.ZONE_WALL_CORNER)
    val HC_WALL_CORNER = registerItem(Blocks.HC_WALL_CORNER)
    val HC_WALL_SLOPE = registerItem(Blocks.HC_WALL_SLOPE)
    val HC_FLIPPED_WALL_SLOPE = registerItem(Blocks.HC_FLIPPED_WALL_SLOPE)
    val HC_WALL = registerItem(Blocks.HC_WALL)
}