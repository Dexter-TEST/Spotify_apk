package p.be5;
import p.wf2;
import p.gi3;
import android.content.Context;
import java.lang.Object;
import p.gk4;
import p.ae5;
import android.content.Intent;
import p.xj0;
import p.vv7;
import android.app.PendingIntent;

public final class be5 extends gi3 implements wf2	// class@0010ab from classes.dex
{
    public final int a;
    public final Context b;

    public void be5(Context p0,int p1){
       this.a = p1;
       this.b = p0;
       super(0);
    }
    public final Object invoke(){
       be5 tb = this.b;
       switch (this.a){
           case 0:
             return new ae5(tb);
           case 1:
             return new gk4(tb);
           default:
             return PendingIntent.getActivity(tb, 0, xj0.q(tb), vv7.d(0));
       }
    }
}
