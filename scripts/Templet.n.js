var script=(function(){
	
	var script={
			context:{},
			events:{},
			enable:function(){
				for(var i in script.events){
					context.registerEvent(i);
				}
			},
			onEvent:function(type,event){if(script[type]){script[type](event);}
		}
    }
    return script;
})();


script.events.PlayerLoginEvent=function(event){
	
}