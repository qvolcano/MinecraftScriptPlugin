
var script=(function(){
    var Entity=function(){
        return {id:0}
    }

    var Block=function(){
        return {}
    }

    var Chunk=function(){
        return {}
    }

    var Player=function(){
        return {}
    }

    var Item=function(){
        return {}
    }

    var World=function(){
        return {}
    }

    var script={
        command:function(cmd){

        },

        getPlayer:function(name){return Player()},
        getWorld:function(name){return World()},
        getChunk:function(){return Chunk()},
        getBlock:function(x,y,z){return Block()},

        onCommand:{call,name,param},
        onTime:{call,time:0},
        onBedEnter:{call},
        onBedLeave:{call},
        onBlockDamage:{call},
        onBreak:{call},
        onMine:{call},
        onBucketEmpty:{call},
        onBucketFill:{call},
        onBurn:{call},
        onCanBuildCheck:{call},
        onChat:{call},
        onChunkGenerate:{call},
        onChunkLoad:{call},
        onChunkUnload:{call},
        onClick:{call},
        onCombust:{call},
        onConnect:{call},
        onConsume:{call},
        onCraft:{call},
        onCreeperPower:{call},
        onDamage:{call,attacker:Entity(),target:Entity()},
        onDeath:{call,killer:Enity},
        onDispense:{call},
        onDrop:{call},
        onEndermanSheep:{call},
        onExperienceSpawn:{call},
        onExplode:{call},
        onExplosionPrime:{call},
        onFade:{call},
        onFirstJoin:{call},
        onFishing:{call},
        onFlow:{call},
        onForm:{call},
        onFuelBurn:{call},
        onGamemodeChange:{call},
        onGrow:{call},
        onHeal:{call},
        onHungerMeterChange:{call},
        onIgnition:{call},
        onItemBreak:{call},
        onItemSpawn:{call},
        onJoin:{call},
        onKick:{call},
        onLeavesDecay:{call},
        onLevelChange:{call},
        onLightningStrike:{call},
        onMoveOn:{call},
        onPhysics:{call},
        onPickUp:{call},
        onPigZap:{call},
        onPistonExtend:{call},
        onPistonRetract:{call},
        onPlace:{call},
        onPortal:{call},
        onPortalCreate:{call},
        onPortalEnter:{call},
        onPressurePlate:{call},
        onPressureTrip:{call},
        onProjectileHit:{call},
        onQuit:{call},
        onRedstone:{call},
        onRegionEnter:{call},
        onRegionLeave:{call},
        onRespawn:{call},
        onScriptLoad:{call},
        onScriptUnload:{call},
        onShoot:{call},
        onSignChange:{call},
        onSkriptStart:{call},
        onSkriptStop:{call},
        onSmelt:{call},
        onSneakToggle:{call},
        onSpawn:{call},
        onSpawnChange:{call},
        onSpread:{call},
        onSprintToggle:{call},
        onTame:{call},
        onTarget:{call},
        onTeleport:{call},
        onThrowingofanEgg:{call},
        onToolChange:{call},
        onVehicleCreate:{call},
        onVehicleDamage:{call},
        onVehicleDestroy:{call},
        onVehicleEnter:{call},
        onVehicleExit:{call},
        onWeatherChange:{call},
        onWorldInit:{call},
        onWorldLoad:{call},
        onWorldSave:{call},
        onWorldUnload:{call},
        onZombieBreakDoor:{call},
    }
    return script;
})()


script.onEnabled.call=function(){
}
script.onTime.call=function(){

}
script.onCommand.call=function(){
    
}