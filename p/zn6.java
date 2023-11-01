package p.zn6;
import p.wf2;
import p.gi3;
import p.co6;
import p.rn6;
import java.lang.String;
import android.content.SharedPreferences;
import java.lang.Object;

public final class zn6 extends gi3 implements wf2	// class@002f31 from classes.dex
{
    public final int a;
    public final co6 b;
    public final rn6 c;
    public final String t;

    public void zn6(co6 p0,rn6 p1,String p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super(0);
    }
    public final String a(){
       zn6 tt = this.t;
       zn6 tc = this.c;
       zn6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.h().getString(tc.a, tt);
       }
       return tb.h().getString(tc.a, tt);
    }
    public final Object invoke(){
       switch (this.a){
           case 0:
           default:
             return this.a();
       }
       return this.a();
    }
}
