package p.xn6;
import p.wf2;
import p.gi3;
import java.lang.Object;
import java.lang.Integer;
import android.content.SharedPreferences;
import java.lang.String;
import p.co6;
import p.rn6;
import p.go6;

public final class xn6 extends gi3 implements wf2	// class@002cb2 from classes.dex
{
    public final int a;
    public final int b;
    public final Object c;
    public final Object t;

    public void xn6(Object p0,Object p1,int p2,int p3){
       this.a = p3;
       this.c = p0;
       this.t = p1;
       this.b = p2;
       super(0);
    }
    public final Integer a(){
       xn6 tb = this.b;
       xn6 tt = this.t;
       xn6 tc = this.c;
       switch (this.a){
           case 0:
             return Integer.valueOf(tc.h().getInt(tt.a, tb));
           case 1:
             return Integer.valueOf(tc.getInt(tt, tb));
           default:
             return Integer.valueOf(tc.e.h().getInt(tt, tb));
       }
    }
    public final Object invoke(){
       switch (this.a){
           case 0:
             return this.a();
           case 1:
             return this.a();
           default:
             return this.a();
       }
    }
}
