package p.gw3;
import android.content.ComponentCallbacks2;
import p.iw3;
import java.lang.Object;
import android.content.res.Configuration;
import android.util.LruCache;

public final class gw3 implements ComponentCallbacks2	// class@001790 from classes.dex
{
    public final iw3 a;

    public void gw3(iw3 p0){
       super();
       this.a = p0;
    }
    public final void onConfigurationChanged(Configuration p0){
    }
    public final void onLowMemory(){
       this.a.a.evictAll();
    }
    public final void onTrimMemory(int p0){
       if (p0 >= 60) {
          this.a.a.evictAll();
       }
       return;
    }
}
