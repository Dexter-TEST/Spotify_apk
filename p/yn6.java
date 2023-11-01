package p.yn6;
import p.wf2;
import p.gi3;
import android.animation.ObjectAnimator;
import android.widget.TextView;
import java.lang.Object;
import java.lang.Long;
import android.content.SharedPreferences;
import java.lang.String;
import p.co6;
import p.rn6;
import p.go6;
import android.view.View;
import p.jc7;

public final class yn6 extends gi3 implements wf2	// class@002df3 from classes.dex
{
    public final int a;
    public final long b;
    public final Object c;
    public final Object t;

    public void yn6(ObjectAnimator p0,long p1,TextView p2){
       this.a = 3;
       this.c = p0;
       this.b = p1;
       this.t = p2;
       super(0);
    }
    public void yn6(Object p0,Object p1,long p2,int p3){
       this.a = p3;
       this.c = p0;
       this.t = p1;
       this.b = p2;
       super(0);
    }
    public final Long a(){
       yn6 tb = this.b;
       yn6 tt = this.t;
       yn6 tc = this.c;
       switch (this.a){
           case 0:
             return Long.valueOf(tc.h().getLong(tt.a, tb));
           case 1:
             return Long.valueOf(tc.getLong(tt, tb));
           default:
             return Long.valueOf(tc.e.h().getLong(tt, tb));
       }
    }
    public final Object invoke(){
       switch (this.a){
           case 0:
             return this.a();
           case 1:
             return this.a();
           case 2:
             return this.a();
           default:
             this.c.setDuration(this.b);
             this.t.setVisibility(0);
             return jc7.a;
       }
    }
}
