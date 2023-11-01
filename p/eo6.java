package p.eo6;
import p.wf2;
import p.gi3;
import android.content.SharedPreferences;
import java.lang.String;
import java.lang.Object;
import p.co5;

public final class eo6 extends gi3 implements wf2	// class@0014ca from classes.dex
{
    public final int a;
    public final SharedPreferences b;
    public final String c;
    public final String t;

    public void eo6(SharedPreferences p0,String p1,String p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super(0);
    }
    public final String a(){
       String str;
       eo6 tb = this.b;
       eo6 tt = this.t;
       eo6 tc = this.c;
       switch (this.a){
           case 0:
           default:
             str = tb.getString(tc, tt);
             co5.i(str);
             return str;
       }
       str = tb.getString(tc, tt);
       co5.i(str);
       return str;
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
