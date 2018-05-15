package com.qvolcano.utils;

import java.util.HashMap;

import org.bukkit.event.block.*;
import org.bukkit.event.enchantment.*;
import org.bukkit.event.entity.*;
import org.bukkit.event.hanging.*;
import org.bukkit.event.inventory.*;
import org.bukkit.event.player.*;
import org.bukkit.event.server.*;
import org.bukkit.event.vehicle.*;
import org.bukkit.event.weather.*;
import org.bukkit.event.world.*;


public class EventEnum {
	@SuppressWarnings("rawtypes")
	static public HashMap<String, Class> EVENT_MAP=new HashMap<>();
	static {
		//org.bukkit.event.block
		EVENT_MAP.put("BlockBreakEvent",BlockBreakEvent.class);
		EVENT_MAP.put("BlockBurnEvent",BlockBurnEvent.class);
		EVENT_MAP.put("BlockCanBuildEvent",BlockCanBuildEvent.class);
		EVENT_MAP.put("BlockDamageEvent",BlockDamageEvent.class);
		EVENT_MAP.put("BlockDispenseEvent",BlockDispenseEvent.class);
		EVENT_MAP.put("BlockExpEvent",BlockExpEvent.class);
		EVENT_MAP.put("BlockFadeEvent",BlockFadeEvent.class);
		EVENT_MAP.put("BlockFormEvent",BlockFormEvent.class);
		EVENT_MAP.put("BlockFromToEvent",BlockFromToEvent.class);
		EVENT_MAP.put("BlockGrowEvent",BlockGrowEvent.class);
		EVENT_MAP.put("BlockIgniteEvent",BlockIgniteEvent.class);
		EVENT_MAP.put("BlockPhysicsEvent",BlockPhysicsEvent.class);
		EVENT_MAP.put("BlockPistonExtendEvent",BlockPistonExtendEvent.class);
		EVENT_MAP.put("BlockPistonRetractEvent",BlockPistonRetractEvent.class);
		EVENT_MAP.put("BlockPlaceEvent",BlockPlaceEvent.class);
		EVENT_MAP.put("BlockRedstoneEvent",BlockRedstoneEvent.class);
		EVENT_MAP.put("BlockSpreadEvent",BlockSpreadEvent.class);
		//org.bukkit.event.enchantment

		EVENT_MAP.put("EnchantItemEvent",EnchantItemEvent.class);
		EVENT_MAP.put("PrepareItemEnchantEvent",PrepareItemEnchantEvent.class);
		//org.bukkit.event.entity

		EVENT_MAP.put("CreatureSpawnEvent",CreatureSpawnEvent.class);
		EVENT_MAP.put("CreeperPowerEvent",CreeperPowerEvent.class);
		EVENT_MAP.put("EntityBreakDoorEvent",EntityBreakDoorEvent.class);
		EVENT_MAP.put("EntityChangeBlockEvent",EntityChangeBlockEvent.class);
		EVENT_MAP.put("EntityCombustByBlockEvent",EntityCombustByBlockEvent.class);
		EVENT_MAP.put("EntityCombustByEntityEvent",EntityCombustByEntityEvent.class);
		EVENT_MAP.put("EntityCombustEvent",EntityCombustEvent.class);
		EVENT_MAP.put("EntityCreatePortalEvent",EntityCreatePortalEvent.class);
		EVENT_MAP.put("EntityDamageByBlockEvent",EntityDamageByBlockEvent.class);
		EVENT_MAP.put("EntityDamageByEntityEvent",EntityDamageByEntityEvent.class);
		EVENT_MAP.put("EntityDamageEvent",EntityDamageEvent.class);
		EVENT_MAP.put("EntityDeathEvent",EntityDeathEvent.class);
		EVENT_MAP.put("EntityExplodeEvent",EntityExplodeEvent.class);
		EVENT_MAP.put("EntityInteractEvent",EntityInteractEvent.class);
		EVENT_MAP.put("EntityPortalEnterEvent",EntityPortalEnterEvent.class);
		EVENT_MAP.put("EntityPortalEvent",EntityPortalEvent.class);
		EVENT_MAP.put("EntityPortalExitEvent",EntityPortalExitEvent.class);
		EVENT_MAP.put("EntityRegainHealthEvent",EntityRegainHealthEvent.class);
		EVENT_MAP.put("EntityShootBowEvent",EntityShootBowEvent.class);
		EVENT_MAP.put("EntityTameEvent",EntityTameEvent.class);
		EVENT_MAP.put("EntityTargetEvent",EntityTargetEvent.class);
		EVENT_MAP.put("EntityTargetLivingEntityEvent",EntityTargetLivingEntityEvent.class);
		EVENT_MAP.put("EntityTeleportEvent",EntityTeleportEvent.class);
		EVENT_MAP.put("ExpBottleEvent",ExpBottleEvent.class);
		EVENT_MAP.put("ExplosionPrimeEvent",ExplosionPrimeEvent.class);
		EVENT_MAP.put("FoodLevelChangeEvent",FoodLevelChangeEvent.class);
		EVENT_MAP.put("ItemDespawnEvent",ItemDespawnEvent.class);
		EVENT_MAP.put("ItemSpawnEvent",ItemSpawnEvent.class);
		EVENT_MAP.put("PigZapEvent",PigZapEvent.class);
		EVENT_MAP.put("PlayerDeathEvent",PlayerDeathEvent.class);
		EVENT_MAP.put("PotionSplashEvent",PotionSplashEvent.class);
		EVENT_MAP.put("ProjectileHitEvent",ProjectileHitEvent.class);
		EVENT_MAP.put("ProjectileLaunchEvent",ProjectileLaunchEvent.class);
		EVENT_MAP.put("SheepDyeWoolEvent",SheepDyeWoolEvent.class);
		EVENT_MAP.put("SheepRegrowWoolEvent",SheepRegrowWoolEvent.class);
		EVENT_MAP.put("SlimeSplitEvent",SlimeSplitEvent.class);
		//org.bukkit.event.hanging

		EVENT_MAP.put("HangingBreakByEntityEvent",HangingBreakByEntityEvent.class);
		EVENT_MAP.put("HangingBreakEvent",HangingBreakEvent.class);
		EVENT_MAP.put("HangingPlaceEvent",HangingPlaceEvent.class);
		//org.bukkit.event.inventory

		EVENT_MAP.put("BrewEvent",BrewEvent.class);
		EVENT_MAP.put("CraftItemEvent",CraftItemEvent.class);
		EVENT_MAP.put("FurnaceBurnEvent",FurnaceBurnEvent.class);
		EVENT_MAP.put("FurnaceExtractEvent",FurnaceExtractEvent.class);
		EVENT_MAP.put("FurnaceSmeltEvent",FurnaceSmeltEvent.class);
		EVENT_MAP.put("InventoryClickEvent",InventoryClickEvent.class);
		EVENT_MAP.put("InventoryCloseEvent",InventoryCloseEvent.class);
		EVENT_MAP.put("InventoryCreativeEvent",InventoryCreativeEvent.class);
		EVENT_MAP.put("InventoryDragEvent",InventoryDragEvent.class);
		EVENT_MAP.put("InventoryEvent",InventoryEvent.class);
		EVENT_MAP.put("InventoryInteractEvent",InventoryInteractEvent.class);
		EVENT_MAP.put("InventoryMoveItemEvent",InventoryMoveItemEvent.class);
		EVENT_MAP.put("InventoryOpenEvent",InventoryOpenEvent.class);
		EVENT_MAP.put("InventoryPickupItemEvent",InventoryPickupItemEvent.class);
		EVENT_MAP.put("PrepareItemCraftEvent",PrepareItemCraftEvent.class);
		//org.bukkit.event.player

		EVENT_MAP.put("AsyncPlayerChatEvent",AsyncPlayerChatEvent.class);
		EVENT_MAP.put("AsyncPlayerPreLoginEvent",AsyncPlayerPreLoginEvent.class);
		EVENT_MAP.put("PlayerAnimationEvent",PlayerAnimationEvent.class);
		EVENT_MAP.put("PlayerBedEnterEvent",PlayerBedEnterEvent.class);
		EVENT_MAP.put("PlayerBedLeaveEvent",PlayerBedLeaveEvent.class);
		EVENT_MAP.put("PlayerBucketEmptyEvent",PlayerBucketEmptyEvent.class);
		EVENT_MAP.put("PlayerBucketFillEvent",PlayerBucketFillEvent.class);
		EVENT_MAP.put("PlayerChangedWorldEvent",PlayerChangedWorldEvent.class);
		EVENT_MAP.put("PlayerChannelEvent",PlayerChannelEvent.class);
		EVENT_MAP.put("PlayerChatTabCompleteEvent",PlayerChatTabCompleteEvent.class);
		EVENT_MAP.put("PlayerCommandPreprocessEvent",PlayerCommandPreprocessEvent.class);
		EVENT_MAP.put("PlayerDropItemEvent",PlayerDropItemEvent.class);
		EVENT_MAP.put("PlayerEditBookEvent",PlayerEditBookEvent.class);
		EVENT_MAP.put("PlayerEggThrowEvent",PlayerEggThrowEvent.class);
		EVENT_MAP.put("PlayerExpChangeEvent",PlayerExpChangeEvent.class);
		EVENT_MAP.put("PlayerFishEvent",PlayerFishEvent.class);
		EVENT_MAP.put("PlayerGameModeChangeEvent",PlayerGameModeChangeEvent.class);
		EVENT_MAP.put("PlayerInteractEntityEvent",PlayerInteractEntityEvent.class);
		EVENT_MAP.put("PlayerInteractEvent",PlayerInteractEvent.class);
		EVENT_MAP.put("PlayerItemBreakEvent",PlayerItemBreakEvent.class);
		EVENT_MAP.put("PlayerItemConsumeEvent",PlayerItemConsumeEvent.class);
		EVENT_MAP.put("PlayerItemHeldEvent",PlayerItemHeldEvent.class);
		EVENT_MAP.put("PlayerJoinEvent",PlayerJoinEvent.class);
		EVENT_MAP.put("PlayerKickEvent",PlayerKickEvent.class);
		EVENT_MAP.put("PlayerLevelChangeEvent",PlayerLevelChangeEvent.class);
		EVENT_MAP.put("PlayerLoginEvent",PlayerLoginEvent.class);
		EVENT_MAP.put("PlayerMoveEvent",PlayerMoveEvent.class);
		EVENT_MAP.put("PlayerPickupItemEvent",PlayerPickupItemEvent.class);
		EVENT_MAP.put("PlayerPortalEvent",PlayerPortalEvent.class);
		EVENT_MAP.put("PlayerQuitEvent",PlayerQuitEvent.class);
		EVENT_MAP.put("PlayerRegisterChannelEvent",PlayerRegisterChannelEvent.class);
		EVENT_MAP.put("PlayerRespawnEvent",PlayerRespawnEvent.class);
		EVENT_MAP.put("PlayerShearEntityEvent",PlayerShearEntityEvent.class);
		EVENT_MAP.put("PlayerTeleportEvent",PlayerTeleportEvent.class);
		EVENT_MAP.put("PlayerToggleFlightEvent",PlayerToggleFlightEvent.class);
		EVENT_MAP.put("PlayerToggleSneakEvent",PlayerToggleSneakEvent.class);
		EVENT_MAP.put("PlayerToggleSprintEvent",PlayerToggleSprintEvent.class);
		EVENT_MAP.put("PlayerUnregisterChannelEvent",PlayerUnregisterChannelEvent.class);
		EVENT_MAP.put("PlayerVelocityEvent",PlayerVelocityEvent.class);
		//org.bukkit.event.server

		EVENT_MAP.put("MapInitializeEvent",MapInitializeEvent.class);
		EVENT_MAP.put("PluginDisableEvent",PluginDisableEvent.class);
		EVENT_MAP.put("PluginEnableEvent",PluginEnableEvent.class);
		EVENT_MAP.put("RemoteServerCommandEvent",RemoteServerCommandEvent.class);
		EVENT_MAP.put("ServerCommandEvent",ServerCommandEvent.class);
		EVENT_MAP.put("ServerListPingEvent",ServerListPingEvent.class);
		EVENT_MAP.put("ServiceRegisterEvent",ServiceRegisterEvent.class);
		EVENT_MAP.put("ServiceUnregisterEvent",ServiceUnregisterEvent.class);
		//org.bukkit.event.vehicle

		EVENT_MAP.put("VehicleBlockCollisionEvent",VehicleBlockCollisionEvent.class);
		EVENT_MAP.put("VehicleCreateEvent",VehicleCreateEvent.class);
		EVENT_MAP.put("VehicleDamageEvent",VehicleDamageEvent.class);
		EVENT_MAP.put("VehicleDestroyEvent",VehicleDestroyEvent.class);
		EVENT_MAP.put("VehicleEnterEvent",VehicleEnterEvent.class);
		EVENT_MAP.put("VehicleEntityCollisionEvent",VehicleEntityCollisionEvent.class);
		EVENT_MAP.put("VehicleExitEvent",VehicleExitEvent.class);
		EVENT_MAP.put("VehicleMoveEvent",VehicleMoveEvent.class);
		//
		EVENT_MAP.put("VehicleUpdateEvent",VehicleUpdateEvent.class);
		//org.bukkit.event.weather

		EVENT_MAP.put("LightningStrikeEvent",LightningStrikeEvent.class);
		EVENT_MAP.put("ThunderChangeEvent",ThunderChangeEvent.class);
		EVENT_MAP.put("WeatherChangeEvent",WeatherChangeEvent.class);
		//org.bukkit.event.world

		EVENT_MAP.put("ChunkLoadEvent",ChunkLoadEvent.class);
		EVENT_MAP.put("ChunkPopulateEvent",ChunkPopulateEvent.class);
		EVENT_MAP.put("ChunkUnloadEvent",ChunkUnloadEvent.class);
		EVENT_MAP.put("PortalCreateEvent",PortalCreateEvent.class);
		EVENT_MAP.put("SpawnChangeEvent",SpawnChangeEvent.class);
		EVENT_MAP.put("StructureGrowEvent",StructureGrowEvent.class);
		EVENT_MAP.put("WorldInitEvent",WorldInitEvent.class);
		EVENT_MAP.put("WorldLoadEvent",WorldLoadEvent.class);
		EVENT_MAP.put("WorldSaveEvent",WorldSaveEvent.class);
		EVENT_MAP.put("WorldUnloadEvent",WorldUnloadEvent.class);	
		
	}
}
