package p.s60;
import p.wz3;
import io.reactivex.rxjava3.core.Observer;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.fg;
import android.os.Build$VERSION;
import android.content.BroadcastReceiver;
import android.content.Intent;
import p.p3;

public final class s60 extends wz3	// class@0025c6 from classes.dex
{
    public final Observer b;
    public final Context c;
    public final fg t;

    public void s60(Observer p0,Context p1,IntentFilter p2,Boolean p3){
       int i;
       co5.o(p0, "observer");
       co5.o(p1, "context");
       co5.o(p2, "intentFilter");
       super();
       this.b = p0;
       this.c = p1;
       fg uofg = new fg(5, this);
       this.t = uofg;
       if (Build$VERSION.SDK_INT <= 33) {
          p1.registerReceiver(uofg, p2);
       }else if(p3 == null){
          p1.registerReceiver(uofg, p2);
       }else if(p3.booleanValue()){
          i = 2;
       }else {
          i = 4;
       }
       p3.s(p1, uofg, p2, i);
       return;
    }
    public final void f(){
       this.c.unregisterReceiver(this.t);
    }
}
