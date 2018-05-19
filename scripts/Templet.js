context.event({
	EnableEvent:function(){
	},
	PlayerJoinEvent:function(event){
		context.broadcastMessage("t@@@@@@@@@@@@@@@@@@@@@@@@@@@")
		var player=event.getPlayer()
		context.log(player.getDisplayName())
	}

})

context.recipes({
	test:{
		shape:["aaa","bbb","ccc"],
		input:{a:11,b:22,c:33},
		output:22
	}
})