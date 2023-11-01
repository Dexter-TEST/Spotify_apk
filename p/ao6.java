package p.ao6;
import p.wf2;
import p.gi3;
import java.lang.Object;
import java.util.Set;
import android.content.SharedPreferences;
import java.lang.String;
import p.co5;
import p.co6;
import p.rn6;
import p.go6;
import java.util.List;
import p.ld0;
import p.ry7;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import p.zn2;
import p.y7;
import p.ps2;

public final class ao6 extends gi3 implements wf2	// class@000fc3 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;
    public final Object t;

    public void ao6(Object p0,Object p1,Object p2,int p3){
       this.a = p3;
       this.c = p0;
       this.t = p1;
       this.b = p2;
       super(0);
    }
    public final Set a(){
       ao6 tb = this.b;
       ao6 tt = this.t;
       ao6 tc = this.c;
       switch (this.a){
           case 0:
             return tc.h().getStringSet(tt.a, tb);
           case 1:
             Set stringSet = tc.getStringSet(tt, tb);
             co5.i(stringSet);
             return stringSet;
           default:
             return tc.e.h().getStringSet(tt, tb);
       }
    }
    public final List c(){
       ld0 b;
       ao6 tb = this.b;
       ao6 tt = this.t;
       ao6 tc = this.c;
       switch (this.a){
           case 3:
             break;
           default:
             b = tc.b;
             co5.i(b);
             return b.c(tb.i.d, tt.a());
       }
       Iterable iterable = ((b = tc.b) == null)? null: b.c(tb, tt);
       if (iterable == null) {
          iterable = tt;
       }
       ArrayList uArrayList = new ArrayList(aj0.b0(iterable));
       Iterator iterator = iterable.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next());
       }
       return uArrayList;
    }
    public final Object invoke(){
       switch (this.a){
           case 0:
             return this.a();
           case 1:
             return this.a();
           case 2:
             return this.a();
           case 3:
             return this.c();
           default:
             return this.c();
       }
    }
}
