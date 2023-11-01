package p.pp0;
import java.lang.Object;
import java.util.concurrent.ConcurrentHashMap;
import android.content.Context;
import android.content.ServiceConnection;
import p.i08;

public final class pp0	// class@0022a3 from classes.dex
{
    public final ConcurrentHashMap a;
    public static final Object b;
    public static pp0 c;

    static {
       pp0.b = new Object();
    }
    public void pp0(){
       super();
       this.a = new ConcurrentHashMap();
    }
    public final void a(Context p0,ServiceConnection p1){
       if ((p1 instanceof i08 ^ 0x01)) {
          pp0 ta = this.a;
          if (ta.containsKey(p1)) {
             ServiceConnection serviceConne = ta.get(p1);
             try{
                p0.unbindService(serviceConne);
                e0.remove(p1);
                return;
             }catch(java.lang.IllegalArgumentException e0){
             }catch(java.lang.IllegalStateException e0){
             }catch(java.util.NoSuchElementException e0){
             }
          }
       }
       try{
          p0.unbindService(p1);
          return;
       }catch(java.lang.IllegalArgumentException e0){
       }catch(java.lang.IllegalStateException e0){
       }catch(java.util.NoSuchElementException e0){
       }
    }
}
