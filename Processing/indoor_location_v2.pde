import android.net.wifi.WifiManager;
import android.net.wifi.ScanResult;
import java.util.List;

WifiManager wifiManager;


void setup(){
  
}

void draw()
{
  background(0);
  wifiManager = (WifiManager) getSystemService(WIFI_SERVICE);
  wifiManager.startScan(); //esse eh o segredo para atualizar
  List<ScanResult> results = wifiManager.getScanResults(); 
  
  ScanResult ap1 = results.get(0);
  //etc para mais APs ex. ScanResult ap2 = results.get(1);
  
  text(ap1.BSSID, width/6, height/6); //identificacao do AP numero 1
  text(ap1.level, width/5, height/5); //sinal do AP numero 1
  //fazer o mesmo para os outros APs
  
  
  
  
  
}
