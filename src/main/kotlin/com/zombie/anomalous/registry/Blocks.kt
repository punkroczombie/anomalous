package com.zombie.anomalous.registry

import com.zombie.anomalous.Anomalous
import com.zombie.anomalous.block.BlockIlluminates
import org.bukkit.Material
import xyz.xenondevs.nova.addon.registry.BlockRegistry
import xyz.xenondevs.nova.initialize.Init
import xyz.xenondevs.nova.initialize.InitStage
import xyz.xenondevs.nova.resources.layout.block.BackingStateCategory
import xyz.xenondevs.nova.world.block.behavior.BlockDrops
import xyz.xenondevs.nova.world.block.behavior.BlockSounds
import xyz.xenondevs.nova.world.block.behavior.Breakable
import xyz.xenondevs.nova.world.block.sound.SoundGroup
import xyz.xenondevs.nova.world.block.state.property.DefaultScopedBlockStateProperties.FACING_CARTESIAN
import xyz.xenondevs.nova.world.block.state.property.DefaultScopedBlockStateProperties.FACING_HORIZONTAL
import xyz.xenondevs.nova.world.item.tool.VanillaToolCategories
import xyz.xenondevs.nova.world.item.tool.VanillaToolTiers

@Init(stage = InitStage.PRE_PACK)
object Blocks : BlockRegistry by Anomalous.registry {
    private val STONE =
        Breakable(2.0, VanillaToolCategories.PICKAXE, VanillaToolTiers.WOOD, true, Material.BLACK_CONCRETE)
    private val WOOD =
        Breakable(2.0, VanillaToolCategories.AXE, VanillaToolTiers.WOOD, false, Material.OAK_WOOD)
    private val FRAGILE_WOOD =
        Breakable(1.2, VanillaToolCategories.AXE, VanillaToolTiers.WOOD, false, Material.OAK_WOOD)
    private val METAL =
        Breakable(5.0, VanillaToolCategories.PICKAXE, VanillaToolTiers.STONE, true, Material.IRON_BLOCK)
    private val GLASS =
        Breakable(1.0, VanillaToolCategories.PICKAXE, VanillaToolTiers.WOOD, false, Material.GLASS)

    val ROAD =
        block("road") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val ROAD_MIDDLE =
        block("road_middle") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val STEEL_RAILING =
        block("steel_railing") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val COPPER_PIPE =
        block("copper_pipe") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            models {
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val CC_CAMERA =
        block("cc_camera") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val CEILING_TILE =
        block("ceiling_tile") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val WEAPON_DESK_FOOT =
        block("weapon_desk_foot") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val WEAPON_DESK_MONITOR =
        block("weapon_desk_monitor") {
            behaviors(
                BlockDrops,
                BlockIlluminates(7),
                METAL,
                BlockSounds(SoundGroup.METAL)
            )
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val WEAPON_DESK_PLATE =
        block("weapon_desk_plate") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            models {
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val COPPER_DIAMOND_PLATE =
        block("copper_diamond_plate") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val CERAMIC_TILES =
        block("ceramic_tiles") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val LIGHT =
        block("light") {
            behaviors(
                BlockDrops,
                BlockIlluminates(15),
                METAL,
                BlockSounds(SoundGroup.METAL)
            )
            stateProperties(FACING_CARTESIAN)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val LIGHT_SMALL =
        block("light_small") {
            behaviors(
                BlockDrops,
                BlockIlluminates(15),
                METAL,
                BlockSounds(SoundGroup.METAL)
            )
            stateProperties(FACING_CARTESIAN)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val LIGHT_LONG =
        block("light_long") {
            behaviors(
                BlockDrops,
                BlockIlluminates(15),
                METAL,
                BlockSounds(SoundGroup.METAL)
            )
            stateProperties(FACING_CARTESIAN)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val ROUND_CONCRETE_WALL_BOTTOM =
        block("round_concrete_wall_bottom") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val ROUND_CONCRETE_WALL_MIDDLE =
        block("round_concrete_wall_middle") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val ROUND_CONCRETE_WALL_TOP =
        block("round_concrete_wall_top") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val SCREEN =
        block("screen") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val SERVER_TOP =
        block("server_top") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val SERVER_BOTTOM =
        block("server_bottom") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val TRIMMED_GLASS =
        block("trimmed_glass") {
            behaviors(BlockDrops, GLASS, BlockSounds(SoundGroup.GLASS))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val THIN_CONCRETE_WALL =
        block("thin_concrete_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val VENT =
        block("vent") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            models {
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val SC_WALL =
        block("sc_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val ORANGE_ZONE_WALL =
        block("orange_zone_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val ORANGE_ZONE_TRIMMED_WALL =
        block("orange_zone_trimmed_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val ORANGE_ZONE_LINED_WALL =
        block("orange_zone_lined_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val ORANGE_ZONE_SLOPED_WALL =
        block("orange_zone_sloped_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val ORANGE_ZONE_FLIPPED_SLOPED_WALL =
        block("orange_zone_flipped_sloped_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val BLUE_ZONE_WALL =
        block("blue_zone_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val BLUE_ZONE_TRIMMED_WALL =
        block("blue_zone_trimmed_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val BLUE_ZONE_LINED_WALL =
        block("blue_zone_lined_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val BLUE_ZONE_SLOPED_WALL =
        block("blue_zone_sloped_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val BLUE_ZONE_FLIPPED_SLOPED_WALL =
        block("blue_zone_flipped_sloped_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val RED_ZONE_WALL =
        block("red_zone_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val RED_ZONE_TRIMMED_WALL =
        block("red_zone_trimmed_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val RED_ZONE_LINED_WALL =
        block("red_zone_lined_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val RED_ZONE_SLOPED_WALL =
        block("red_zone_sloped_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val RED_ZONE_FLIPPED_SLOPED_WALL =
        block("red_zone_flipped_sloped_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val CONCRETE_WALL =
        block("concrete_wall") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val CONCRETE_CORNER =
        block("concrete_corner") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val CONCRETE_PILLAR =
        block("concrete_pillar") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val WHITE_PIPE =
        block("white_pipe") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val CONCRETE_RAILING =
        block("concrete_railing") {
            behaviors(BlockDrops, STONE, BlockSounds(SoundGroup.STONE))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val DRAIN_COVER =
        block("drain_cover") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.HEAVY_CORE))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val TUNNEL_TOP =
        block("tunnel_top") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val TUNNEL_BOTTOM =
        block("tunnel_bottom") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val INTERCOM_SPEAKER =
        block("intercom_speaker") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val ZONE_WALL =
        block("zone_wall") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }
    val ZONE_WALL_CORNER =
        block("zone_wall_corner") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val HC_WALL_CORNER =
        block("hc_wall_corner") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val HC_WALL_SLOPE =
        block("hc_wall_slope") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val HC_FLIPPED_WALL_SLOPE =
        block("hc_flipped_wall_slope") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(BackingStateCategory.LEAVES)
            }
        }
    val HC_WALL =
        block("hc_wall") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            models {
                stateBacked(BackingStateCategory.MUSHROOM_BLOCK, BackingStateCategory.NOTE_BLOCK)
            }
        }

    /*
    @TODO: Implement the doors
    val STEEL_DOOR_TOP =
        tileEntity("steel_door_top", ::SteelDoorTopTileEntity) {
            behaviors(
                TileEntityInteractive
            )
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
            }

        }
    val STEEL_DOOR_BOTTOM =
        tileEntity("steel_door_bottom", ::SteelDoorBottomTileEntity) {
            behaviors(
                TileEntityInteractive
            )
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
            }
        }
     */

    /*
    @Todo: Implement the switch
    val SWITCH_CLOSED =
        block("switch_closed") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(
                    BackingStateCategory.valueOf("TRIPWIRE_ATTACHED"),
                    BackingStateCategory.valueOf("TRIPWIRE_UNATTACHED")
                )
            }
        }
    val SWITCH =
        block("switch") {
            behaviors(BlockDrops, METAL, BlockSounds(SoundGroup.METAL))
            stateProperties(FACING_HORIZONTAL)
            models {
                selectModel { defaultModel.rotated() }
                stateBacked(
                    BackingStateCategory.valueOf("TRIPWIRE_ATTACHED"),
                    BackingStateCategory.valueOf("TRIPWIRE_UNATTACHED")
                )
            }
        }
     */
}


