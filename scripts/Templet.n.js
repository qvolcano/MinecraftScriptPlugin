<<<<<<< HEAD
var script=(function(){
	
	var script={
			context:{},
			events:{},
			enable:function(){
				for(var i in script.events){
					context.registerEvent(i);
				}
			},
			onEnable:function(){
				java.lang.System.out.println("asdsdsdsdsd")
			},
			onEvent:function(type,event){if(script[type]){script[type](event);}
		}
    }
    return script;
})();


script.onEnable=function() {
	context.console。log('脚本开启')
=======
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
	
>>>>>>> 6df1d3117892e2a1d8d416144d159f89cf4e300a
}