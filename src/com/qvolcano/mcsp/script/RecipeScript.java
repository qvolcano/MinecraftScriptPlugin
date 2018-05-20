package com.qvolcano.mcsp.script;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.mozilla.javascript.NativeObject;

import com.qvolcano.mcsp.Script;

public class RecipeScript extends Script {

	private String source;

	public RecipeScript(String source,JavaPlugin javaPlugin) {
		super(javaPlugin);
		// TODO Auto-generated constructor stub
		this.source = source;
	}
	
	@Override
	public void onEnable() throws Exception {
		Object jsonData = new JSONParser().parse(this.source);
		if (jsonData instanceof JSONArray) {
			
			
		}else {
			JSONObject jsonObject=(JSONObject)jsonData;
			JSONArray json_shape=(JSONArray)jsonObject.get("shape");
			JSONObject json_input=(JSONObject)jsonObject.get("input");
			JSONObject json_output=(JSONObject)jsonObject.get("output");
			String[] shapes=(String[]) json_shape.toArray(new String[]{});
			HashMap<String, Integer> inputMap=new HashMap<>();
			HashMap<String, Integer> outMap=new HashMap<>();
			for (Object key: json_input.keySet()) {
				inputMap.put((String)key,Integer.valueOf((String)json_input.get(key)));
			}
			for (Object key: json_output.keySet()) {
				outMap.put((String)key, (Integer) Integer.valueOf((String)json_output.get(key)));
			}
			
			addShapedRecipe(outMap.get("id"),shapes,inputMap);
		}
		
	}
	
	public boolean addShapedRecipe(Integer result,String[] shape,HashMap<String, Integer> items) {
		ItemStack resultItem=new ItemStack(result);
		resultItem.setAmount(1);
		ShapedRecipe recipe=new ShapedRecipe(resultItem);
		recipe.shape(shape);
		for(Entry<String, Integer> i:items.entrySet()) {
			String key=(String) i.getKey();
			Integer value=(Integer) i.getValue();
			ItemStack stack = new ItemStack((Integer)items.get(key));
			stack.setAmount(value);
			recipe.setIngredient(key.charAt(0),stack.getType());
		}
		return javaPlugin.getServer().addRecipe(recipe);
	}
}
