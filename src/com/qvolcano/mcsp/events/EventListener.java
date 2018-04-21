package com.qvolcano.mcsp.events;

import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockExpEvent;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.block.BlockGrowEvent;
import org.bukkit.event.block.BlockIgniteEvent;
import org.bukkit.event.block.BlockPhysicsEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.bukkit.event.block.BlockSpreadEvent;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.CreeperPowerEvent;
import org.bukkit.event.entity.EntityBreakDoorEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.event.entity.EntityCombustByBlockEvent;
import org.bukkit.event.entity.EntityCombustByEntityEvent;
import org.bukkit.event.entity.EntityCombustEvent;
import org.bukkit.event.entity.EntityCreatePortalEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.EntityPortalEvent;
import org.bukkit.event.entity.EntityPortalExitEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;
import org.bukkit.event.entity.EntityShootBowEvent;
import org.bukkit.event.entity.EntityTameEvent;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.entity.ExpBottleEvent;
import org.bukkit.event.entity.ExplosionPrimeEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.entity.PigZapEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SheepRegrowWoolEvent;
import org.bukkit.event.entity.SlimeSplitEvent;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.PlayerAnimationEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketFillEvent;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerChannelEvent;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEditBookEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerExpChangeEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerItemBreakEvent;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;
import org.bukkit.event.player.PlayerPortalEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRegisterChannelEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;
import org.bukkit.event.player.PlayerVelocityEvent;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;
import org.bukkit.event.server.RemoteServerCommandEvent;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.event.server.ServiceRegisterEvent;
import org.bukkit.event.server.ServiceUnregisterEvent;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;
import org.bukkit.event.vehicle.VehicleCreateEvent;
import org.bukkit.event.vehicle.VehicleDamageEvent;
import org.bukkit.event.vehicle.VehicleDestroyEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;
import org.bukkit.event.vehicle.VehicleExitEvent;
import org.bukkit.event.vehicle.VehicleMoveEvent;
import org.bukkit.event.weather.LightningStrikeEvent;
import org.bukkit.event.weather.ThunderChangeEvent;
import org.bukkit.event.weather.WeatherChangeEvent;
import org.bukkit.event.world.ChunkLoadEvent;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.event.world.PortalCreateEvent;
import org.bukkit.event.world.SpawnChangeEvent;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.event.world.WorldUnloadEvent;

public class EventListener implements Listener {
	
	public void dispatchEvent(String type,Event event) {
		
	}
	//org.bukkit.event.block

	@EventHandler
	public void onEvent(BlockBreakEvent e) {this.dispatchEvent("BlockBreakEvent",e);}
	@EventHandler
	public void onEvent(BlockBurnEvent e) {this.dispatchEvent("BlockBurnEvent",e);}
	@EventHandler
	public void onEvent(BlockCanBuildEvent e) {this.dispatchEvent("BlockCanBuildEvent",e);}
	@EventHandler
	public void onEvent(BlockDamageEvent e) {this.dispatchEvent("BlockDamageEvent",e);}
	@EventHandler
	public void onEvent(BlockDispenseEvent e) {this.dispatchEvent("BlockDispenseEvent",e);}
	@EventHandler
	public void onEvent(BlockExpEvent e) {this.dispatchEvent("BlockExpEvent",e);}
	@EventHandler
	public void onEvent(BlockFadeEvent e) {this.dispatchEvent("BlockFadeEvent",e);}
	@EventHandler
	public void onEvent(BlockFormEvent e) {this.dispatchEvent("BlockFormEvent",e);}
	@EventHandler
	public void onEvent(BlockFromToEvent e) {this.dispatchEvent("BlockFromToEvent",e);}
	@EventHandler
	public void onEvent(BlockGrowEvent e) {this.dispatchEvent("BlockGrowEvent",e);}
	@EventHandler
	public void onEvent(BlockIgniteEvent e) {this.dispatchEvent("BlockIgniteEvent",e);}
	@EventHandler
	public void onEvent(BlockPhysicsEvent e) {this.dispatchEvent("BlockPhysicsEvent",e);}
	@EventHandler
	public void onEvent(BlockPistonExtendEvent e) {this.dispatchEvent("BlockPistonExtendEvent",e);}
	@EventHandler
	public void onEvent(BlockPistonRetractEvent e) {this.dispatchEvent("BlockPistonRetractEvent",e);}
	@EventHandler
	public void onEvent(BlockPlaceEvent e) {this.dispatchEvent("BlockPlaceEvent",e);}
	@EventHandler
	public void onEvent(BlockRedstoneEvent e) {this.dispatchEvent("BlockRedstoneEvent",e);}
	@EventHandler
	public void onEvent(BlockSpreadEvent e) {this.dispatchEvent("BlockSpreadEvent",e);}

	//org.bukkit.event.enchantment

	@EventHandler
	public void onEvent(EnchantItemEvent e) {this.dispatchEvent("EnchantItemEvent",e);}
	@EventHandler
	public void onEvent(PrepareItemEnchantEvent e) {this.dispatchEvent("PrepareItemEnchantEvent",e);}

	//org.bukkit.event.entity

	@EventHandler
	public void onEvent(CreatureSpawnEvent e) {this.dispatchEvent("CreatureSpawnEvent",e);}
	@EventHandler
	public void onEvent(CreeperPowerEvent e) {this.dispatchEvent("CreeperPowerEvent",e);}
	@EventHandler
	public void onEvent(EntityBreakDoorEvent e) {this.dispatchEvent("EntityBreakDoorEvent",e);}
	@EventHandler
	public void onEvent(EntityChangeBlockEvent e) {this.dispatchEvent("EntityChangeBlockEvent",e);}
	@EventHandler
	public void onEvent(EntityCombustByBlockEvent e) {this.dispatchEvent("EntityCombustByBlockEvent",e);}
	@EventHandler
	public void onEvent(EntityCombustByEntityEvent e) {this.dispatchEvent("EntityCombustByEntityEvent",e);}
	@EventHandler
	public void onEvent(EntityCombustEvent e) {this.dispatchEvent("EntityCombustEvent",e);}
	@EventHandler
	public void onEvent(EntityCreatePortalEvent e) {this.dispatchEvent("EntityCreatePortalEvent",e);}
	@EventHandler
	public void onEvent(EntityDamageByBlockEvent e) {this.dispatchEvent("EntityDamageByBlockEvent",e);}
	@EventHandler
	public void onEvent(EntityDamageByEntityEvent e) {this.dispatchEvent("EntityDamageByEntityEvent",e);}
	@EventHandler
	public void onEvent(EntityDamageEvent e) {this.dispatchEvent("EntityDamageEvent",e);}
	@EventHandler
	public void onEvent(EntityDeathEvent e) {this.dispatchEvent("EntityDeathEvent",e);}
	@EventHandler
	public void onEvent(EntityExplodeEvent e) {this.dispatchEvent("EntityExplodeEvent",e);}
	@EventHandler
	public void onEvent(EntityInteractEvent e) {this.dispatchEvent("EntityInteractEvent",e);}
	@EventHandler
	public void onEvent(EntityPortalEnterEvent e) {this.dispatchEvent("EntityPortalEnterEvent",e);}
	@EventHandler
	public void onEvent(EntityPortalEvent e) {this.dispatchEvent("EntityPortalEvent",e);}
	@EventHandler
	public void onEvent(EntityPortalExitEvent e) {this.dispatchEvent("EntityPortalExitEvent",e);}
	@EventHandler
	public void onEvent(EntityRegainHealthEvent e) {this.dispatchEvent("EntityRegainHealthEvent",e);}
	@EventHandler
	public void onEvent(EntityShootBowEvent e) {this.dispatchEvent("EntityShootBowEvent",e);}
	@EventHandler
	public void onEvent(EntityTameEvent e) {this.dispatchEvent("EntityTameEvent",e);}
	@EventHandler
	public void onEvent(EntityTargetEvent e) {this.dispatchEvent("EntityTargetEvent",e);}
	@EventHandler
	public void onEvent(EntityTargetLivingEntityEvent e) {this.dispatchEvent("EntityTargetLivingEntityEvent",e);}
	@EventHandler
	public void onEvent(EntityTeleportEvent e) {this.dispatchEvent("EntityTeleportEvent",e);}
	@EventHandler
	public void onEvent(ExpBottleEvent e) {this.dispatchEvent("ExpBottleEvent",e);}
	@EventHandler
	public void onEvent(ExplosionPrimeEvent e) {this.dispatchEvent("ExplosionPrimeEvent",e);}
	@EventHandler
	public void onEvent(FoodLevelChangeEvent e) {this.dispatchEvent("FoodLevelChangeEvent",e);}
	@EventHandler
	public void onEvent(ItemDespawnEvent e) {this.dispatchEvent("ItemDespawnEvent",e);}
	@EventHandler
	public void onEvent(ItemSpawnEvent e) {this.dispatchEvent("ItemSpawnEvent",e);}
	@EventHandler
	public void onEvent(PigZapEvent e) {this.dispatchEvent("PigZapEvent",e);}
	@EventHandler
	public void onEvent(PlayerDeathEvent e) {this.dispatchEvent("PlayerDeathEvent",e);}
	@EventHandler
	public void onEvent(PotionSplashEvent e) {this.dispatchEvent("PotionSplashEvent",e);}
	@EventHandler
	public void onEvent(ProjectileHitEvent e) {this.dispatchEvent("ProjectileHitEvent",e);}
	@EventHandler
	public void onEvent(ProjectileLaunchEvent e) {this.dispatchEvent("ProjectileLaunchEvent",e);}
	@EventHandler
	public void onEvent(SheepDyeWoolEvent e) {this.dispatchEvent("SheepDyeWoolEvent",e);}
	@EventHandler
	public void onEvent(SheepRegrowWoolEvent e) {this.dispatchEvent("SheepRegrowWoolEvent",e);}
	@EventHandler
	public void onEvent(SlimeSplitEvent e) {this.dispatchEvent("SlimeSplitEvent",e);}

	//org.bukkit.event.hanging

	@EventHandler
	public void onEvent(HangingBreakByEntityEvent e) {this.dispatchEvent("HangingBreakByEntityEvent",e);}
	@EventHandler
	public void onEvent(HangingBreakEvent e) {this.dispatchEvent("HangingBreakEvent",e);}
	@EventHandler
	public void onEvent(HangingPlaceEvent e) {this.dispatchEvent("HangingPlaceEvent",e);}

	//org.bukkit.event.inventory

	@EventHandler
	public void onEvent(BrewEvent e) {this.dispatchEvent("BrewEvent",e);}
	@EventHandler
	public void onEvent(CraftItemEvent e) {this.dispatchEvent("CraftItemEvent",e);}
	@EventHandler
	public void onEvent(FurnaceBurnEvent e) {this.dispatchEvent("FurnaceBurnEvent",e);}
	@EventHandler
	public void onEvent(FurnaceExtractEvent e) {this.dispatchEvent("FurnaceExtractEvent",e);}
	@EventHandler
	public void onEvent(FurnaceSmeltEvent e) {this.dispatchEvent("FurnaceSmeltEvent",e);}
	@EventHandler
	public void onEvent(InventoryClickEvent e) {this.dispatchEvent("InventoryClickEvent",e);}
	@EventHandler
	public void onEvent(InventoryCloseEvent e) {this.dispatchEvent("InventoryCloseEvent",e);}
	@EventHandler
	public void onEvent(InventoryCreativeEvent e) {this.dispatchEvent("InventoryCreativeEvent",e);}
	@EventHandler
	public void onEvent(InventoryDragEvent e) {this.dispatchEvent("InventoryDragEvent",e);}
	@EventHandler
	public void onEvent(InventoryEvent e) {this.dispatchEvent("InventoryEvent",e);}
	@EventHandler
	public void onEvent(InventoryInteractEvent e) {this.dispatchEvent("InventoryInteractEvent",e);}
	@EventHandler
	public void onEvent(InventoryMoveItemEvent e) {this.dispatchEvent("InventoryMoveItemEvent",e);}
	@EventHandler
	public void onEvent(InventoryOpenEvent e) {this.dispatchEvent("InventoryOpenEvent",e);}
	@EventHandler
	public void onEvent(InventoryPickupItemEvent e) {this.dispatchEvent("InventoryPickupItemEvent",e);}
	@EventHandler
	public void onEvent(PrepareItemCraftEvent e) {this.dispatchEvent("PrepareItemCraftEvent",e);}

	//org.bukkit.event.player

	@EventHandler
	public void onEvent(AsyncPlayerChatEvent e) {this.dispatchEvent("AsyncPlayerChatEvent",e);}
	@EventHandler
	public void onEvent(AsyncPlayerPreLoginEvent e) {this.dispatchEvent("AsyncPlayerPreLoginEvent",e);}
	@EventHandler
	public void onEvent(PlayerAnimationEvent e) {this.dispatchEvent("PlayerAnimationEvent",e);}
	@EventHandler
	public void onEvent(PlayerBedEnterEvent e) {this.dispatchEvent("PlayerBedEnterEvent",e);}
	@EventHandler
	public void onEvent(PlayerBedLeaveEvent e) {this.dispatchEvent("PlayerBedLeaveEvent",e);}
	@EventHandler
	public void onEvent(PlayerBucketEmptyEvent e) {this.dispatchEvent("PlayerBucketEmptyEvent",e);}
	@EventHandler
	public void onEvent(PlayerBucketFillEvent e) {this.dispatchEvent("PlayerBucketFillEvent",e);}
	@EventHandler
	public void onEvent(PlayerChangedWorldEvent e) {this.dispatchEvent("PlayerChangedWorldEvent",e);}
	@EventHandler
	public void onEvent(PlayerChannelEvent e) {this.dispatchEvent("PlayerChannelEvent",e);}
	@EventHandler
	public void onEvent(PlayerChatTabCompleteEvent e) {this.dispatchEvent("PlayerChatTabCompleteEvent",e);}
	@EventHandler
	public void onEvent(PlayerCommandPreprocessEvent e) {this.dispatchEvent("PlayerCommandPreprocessEvent",e);}
	@EventHandler
	public void onEvent(PlayerDropItemEvent e) {this.dispatchEvent("PlayerDropItemEvent",e);}
	@EventHandler
	public void onEvent(PlayerEditBookEvent e) {this.dispatchEvent("PlayerEditBookEvent",e);}
	@EventHandler
	public void onEvent(PlayerEggThrowEvent e) {this.dispatchEvent("PlayerEggThrowEvent",e);}
	@EventHandler
	public void onEvent(PlayerExpChangeEvent e) {this.dispatchEvent("PlayerExpChangeEvent",e);}
	@EventHandler
	public void onEvent(PlayerFishEvent e) {this.dispatchEvent("PlayerFishEvent",e);}
	@EventHandler
	public void onEvent(PlayerGameModeChangeEvent e) {this.dispatchEvent("PlayerGameModeChangeEvent",e);}
	@EventHandler
	public void onEvent(PlayerInteractEntityEvent e) {this.dispatchEvent("PlayerInteractEntityEvent",e);}
	@EventHandler
	public void onEvent(PlayerInteractEvent e) {this.dispatchEvent("PlayerInteractEvent",e);}
	@EventHandler
	public void onEvent(PlayerItemBreakEvent e) {this.dispatchEvent("PlayerItemBreakEvent",e);}
	@EventHandler
	public void onEvent(PlayerItemConsumeEvent e) {this.dispatchEvent("PlayerItemConsumeEvent",e);}
	@EventHandler
	public void onEvent(PlayerItemHeldEvent e) {this.dispatchEvent("PlayerItemHeldEvent",e);}
	@EventHandler
	public void onEvent(PlayerJoinEvent e) {this.dispatchEvent("PlayerJoinEvent",e);}
	@EventHandler
	public void onEvent(PlayerKickEvent e) {this.dispatchEvent("PlayerKickEvent",e);}
	@EventHandler
	public void onEvent(PlayerLevelChangeEvent e) {this.dispatchEvent("PlayerLevelChangeEvent",e);}
	@EventHandler
	public void onEvent(PlayerLoginEvent e) {this.dispatchEvent("PlayerLoginEvent",e);}
	@EventHandler
	public void onEvent(PlayerMoveEvent e) {this.dispatchEvent("PlayerMoveEvent",e);}
	@EventHandler
	public void onEvent(PlayerPickupItemEvent e) {this.dispatchEvent("PlayerPickupItemEvent",e);}
	@EventHandler
	public void onEvent(PlayerPortalEvent e) {this.dispatchEvent("PlayerPortalEvent",e);}
	@EventHandler
	public void onEvent(PlayerQuitEvent e) {this.dispatchEvent("PlayerQuitEvent",e);}
	@EventHandler
	public void onEvent(PlayerRegisterChannelEvent e) {this.dispatchEvent("PlayerRegisterChannelEvent",e);}
	@EventHandler
	public void onEvent(PlayerRespawnEvent e) {this.dispatchEvent("PlayerRespawnEvent",e);}
	@EventHandler
	public void onEvent(PlayerShearEntityEvent e) {this.dispatchEvent("PlayerShearEntityEvent",e);}
	@EventHandler
	public void onEvent(PlayerTeleportEvent e) {this.dispatchEvent("PlayerTeleportEvent",e);}
	@EventHandler
	public void onEvent(PlayerToggleFlightEvent e) {this.dispatchEvent("PlayerToggleFlightEvent",e);}
	@EventHandler
	public void onEvent(PlayerToggleSneakEvent e) {this.dispatchEvent("PlayerToggleSneakEvent",e);}
	@EventHandler
	public void onEvent(PlayerToggleSprintEvent e) {this.dispatchEvent("PlayerToggleSprintEvent",e);}
	@EventHandler
	public void onEvent(PlayerUnregisterChannelEvent e) {this.dispatchEvent("PlayerUnregisterChannelEvent",e);}
	@EventHandler
	public void onEvent(PlayerVelocityEvent e) {this.dispatchEvent("PlayerVelocityEvent",e);}

	//org.bukkit.event.server

	@EventHandler
	public void onEvent(MapInitializeEvent e) {this.dispatchEvent("MapInitializeEvent",e);}
	@EventHandler
	public void onEvent(PluginDisableEvent e) {this.dispatchEvent("PluginDisableEvent",e);}
	@EventHandler
	public void onEvent(PluginEnableEvent e) {this.dispatchEvent("PluginEnableEvent",e);}
	@EventHandler
	public void onEvent(RemoteServerCommandEvent e) {this.dispatchEvent("RemoteServerCommandEvent",e);}
	@EventHandler
	public void onEvent(ServerCommandEvent e) {this.dispatchEvent("ServerCommandEvent",e);}
	@EventHandler
	public void onEvent(ServerListPingEvent e) {this.dispatchEvent("ServerListPingEvent",e);}
	@EventHandler
	public void onEvent(ServiceRegisterEvent e) {this.dispatchEvent("ServiceRegisterEvent",e);}
	@EventHandler
	public void onEvent(ServiceUnregisterEvent e) {this.dispatchEvent("ServiceUnregisterEvent",e);}

	//org.bukkit.event.vehicle

	@EventHandler
	public void onEvent(VehicleBlockCollisionEvent e) {this.dispatchEvent("VehicleBlockCollisionEvent",e);}
	@EventHandler
	public void onEvent(VehicleCreateEvent e) {this.dispatchEvent("VehicleCreateEvent",e);}
	@EventHandler
	public void onEvent(VehicleDamageEvent e) {this.dispatchEvent("VehicleDamageEvent",e);}
	@EventHandler
	public void onEvent(VehicleDestroyEvent e) {this.dispatchEvent("VehicleDestroyEvent",e);}
	@EventHandler
	public void onEvent(VehicleEnterEvent e) {this.dispatchEvent("VehicleEnterEvent",e);}
	@EventHandler
	public void onEvent(VehicleEntityCollisionEvent e) {this.dispatchEvent("VehicleEntityCollisionEvent",e);}
	@EventHandler
	public void onEvent(VehicleExitEvent e) {this.dispatchEvent("VehicleExitEvent",e);}
	@EventHandler
	public void onEvent(VehicleMoveEvent e) {this.dispatchEvent("VehicleMoveEvent",e);}
	//@EventHandler
	//public void onEvent(VehicleUpdateEvent e) {this.dispatchEvent("VehicleUpdateEvent",e);}

	//org.bukkit.event.weather

	@EventHandler
	public void onEvent(LightningStrikeEvent e) {this.dispatchEvent("LightningStrikeEvent",e);}
	@EventHandler
	public void onEvent(ThunderChangeEvent e) {this.dispatchEvent("ThunderChangeEvent",e);}
	@EventHandler
	public void onEvent(WeatherChangeEvent e) {this.dispatchEvent("WeatherChangeEvent",e);}

	//org.bukkit.event.world

	@EventHandler
	public void onEvent(ChunkLoadEvent e) {this.dispatchEvent("ChunkLoadEvent",e);}
	@EventHandler
	public void onEvent(ChunkPopulateEvent e) {this.dispatchEvent("ChunkPopulateEvent",e);}
	@EventHandler
	public void onEvent(ChunkUnloadEvent e) {this.dispatchEvent("ChunkUnloadEvent",e);}
	@EventHandler
	public void onEvent(PortalCreateEvent e) {this.dispatchEvent("PortalCreateEvent",e);}
	@EventHandler
	public void onEvent(SpawnChangeEvent e) {this.dispatchEvent("SpawnChangeEvent",e);}
	@EventHandler
	public void onEvent(StructureGrowEvent e) {this.dispatchEvent("StructureGrowEvent",e);}
	@EventHandler
	public void onEvent(WorldInitEvent e) {this.dispatchEvent("WorldInitEvent",e);}
	@EventHandler
	public void onEvent(WorldLoadEvent e) {this.dispatchEvent("WorldLoadEvent",e);}
	@EventHandler
	public void onEvent(WorldSaveEvent e) {this.dispatchEvent("WorldSaveEvent",e);}
	@EventHandler
	public void onEvent(WorldUnloadEvent e) {this.dispatchEvent("WorldUnloadEvent",e);}
}
