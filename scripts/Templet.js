context.event({
	EnableEvent:function(){
		context.log("script enable")
	},
	PlayerJoinEvent:function(event){
		context.log("player logion!!")
		var player=event.getPlayer()
		context.log(player.getDisplayName())
	}

})