package p.hm5;
import p.ui5;
import p.aj5;
import java.lang.Object;
import java.lang.String;
import p.a32;
import java.util.Properties;
import p.x32;
import p.f32;
import java.io.Reader;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;

public final class hm5 implements ui5	// class@00187f from classes.dex
{
    public final aj5 a;

    public void hm5(aj5 p0){
       super();
       this.a = p0;
    }
    public final String a(){
       hm5 ta = this.a;
       String str = "/oem/etc/spotify.preload";
       if (ta.a(str).exists()) {
          return str;
       }
       str = "/product/etc/spotify.preload";
       if (ta.a(str).exists()) {
          return str;
       }
       str = "/data/etc/appchannel/spotify.preload";
       if (!ta.a(str).exists()) {
          str = "/system/etc/spotify.preload";
       }
       return str;
    }
    public final String b(String p0){
       Properties properties = new Properties();
       String str = this.a();
       try{
          x32 ox32 = this.a.a.c(str);
          properties.load(ox32);
          if (ox32 != null) {
             ox32.close();
          }
       }catch(java.io.FileNotFoundException e0){
       }catch(java.io.IOException e2){
          Object[] objArray = new Object[0];
          Logger.c(e2, "", objArray);
       }
       return properties.getProperty(p0, e0);
    }
}
