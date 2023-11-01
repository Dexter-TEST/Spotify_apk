package p.tf4;
import p.wf2;
import p.gi3;
import java.lang.Object;
import java.lang.Boolean;
import android.content.SharedPreferences;
import java.lang.String;
import p.co6;
import p.rn6;
import p.go6;
import p.uf4;
import p.qf4;
import p.jc7;

public final class tf4 extends gi3 implements wf2	// class@00275e from classes.dex
{
    public final int a;
    public final boolean b;
    public final Object c;
    public final Object t;

    public void tf4(Object p0,Object p1,boolean p2,int p3){
       this.a = p3;
       this.c = p0;
       this.t = p1;
       this.b = p2;
       super(0);
    }
    public final Boolean invoke(){
       tf4 tb = this.b;
       tf4 tt = this.t;
       tf4 tc = this.c;
       switch (this.a){
           case 1:
             return Boolean.valueOf(tc.h().getBoolean(tt.a, tb));
           case 2:
             return Boolean.valueOf(tc.getBoolean(tt, tb));
           default:
             return Boolean.valueOf(tc.e.h().getBoolean(tt, tb));
       }
    }
    public final Object invoke(){
       switch (this.a){
           case 0:
             this.c.d(this.t);
             return jc7.a;
           case 1:
             return this.invoke();
           case 2:
             return this.invoke();
           default:
             return this.invoke();
       }
    }
}
