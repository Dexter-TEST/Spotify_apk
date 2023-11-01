package p.rb2;
import java.util.concurrent.Callable;
import java.lang.String;
import android.content.Context;
import p.ob2;
import java.lang.Object;
import p.tb2;
import p.ub2;

public final class rb2 implements Callable	// class@0024b2 from classes.dex
{
    public final int a;
    public final String b;
    public final Context c;
    public final ob2 t;
    public final int v;

    public void rb2(String p0,Context p1,ob2 p2,int p3,int p4){
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       super();
    }
    public final tb2 a(){
       rb2 tc = this.c;
       rb2 tb = this.b;
       rb2 tv = this.v;
       rb2 tt = this.t;
       switch (this.a){
           case 0:
           default:
             tb2 otb2 = ub2.a(tb, tc, tt, tv);
             return otb2;
       }
       return ub2.a(tb, tc, tt, tv);
    }
    public final Object call(){
       switch (this.a){
           case 0:
           default:
             return this.a();
       }
       return this.a();
    }
}
