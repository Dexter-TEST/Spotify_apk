package p.v07;
import java.lang.Iterable;
import android.content.Context;
import java.lang.Object;
import java.util.ArrayList;
import io.reactivex.rxjava3.core.ObservableSource;
import android.content.ComponentName;
import android.content.Intent;
import p.ej4;
import java.lang.String;
import android.util.Log;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import p.n6;
import android.os.Bundle;
import p.ms0;
import java.lang.IllegalStateException;
import java.util.Iterator;
import p.u20;
import io.reactivex.rxjava3.core.Observer;
import p.sc7;

public final class v07 implements Iterable	// class@00295a from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void v07(Context p0){
       this.a = 0;
       super();
       this.b = new ArrayList();
       this.c = p0;
    }
    public void v07(ObservableSource p0,Object p1){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(ComponentName p0){
       v07 tc = this.c;
       v07 tb = this.b;
       int i = tb.size();
       try{
          for (Intent intent = ej4.O(tc, p0); intent != null; intent = ej4.O(tc, intent.getComponent())) {
             tb.add(i, intent);
          }
          return;
       }catch(android.content.pm.PackageManager$NameNotFoundException e5){
          Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
          throw new IllegalArgumentException(e5);
       }
    }
    public final void b(){
       v07 tb = this.b;
       if (tb.isEmpty()) {
          throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
       }
       Intent[] intentArray = new Intent[0];
       Intent[] intentArray1 = tb.toArray(intentArray);
       intentArray1[0] = new Intent(intentArray1[0]).addFlags(0x1000c000);
       ms0.a(this.c, intentArray1, null);
       return;
    }
    public final Iterator iterator(){
       v07 tb = this.b;
       switch (this.a){
           case 0:
           default:
             u20 ou20 = new u20(this.c);
             tb.subscribe(ou20);
             return new sc7(ou20);
       }
       return tb.iterator();
    }
}
