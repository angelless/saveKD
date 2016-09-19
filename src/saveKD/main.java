package saveKD

public class main extends PluginBase implements Listener {
HashMap<String,LinkedTreeMap> userKD;
public void onEnable(){
Config config = new Config(this.getDataForder()+"/config.json",Config.JSON);
for(String key : config.getKeys()){
if(config.get(key) instanceof LinkedTreeMap<>()){

}
}
this.userKD = 

}

}
