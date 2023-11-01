package p.fa3;
import p.da3;
import p.ea3;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import p.mi;
import java.lang.Iterable;
import p.zf2;
import p.dj0;
import java.lang.CharSequence;
import p.av6;

public final class fa3 implements da3	// class@00158c from classes.dex
{
    public final ea3 a;

    public void fa3(ea3 p0){
       super();
       this.a = p0;
    }
    public final String a(String p0){
       ArrayList uArrayList = new ArrayList();
       String str = mi.t(p0, "utm_campaign");
       int i = 0;
       int i1 = (str.length() > 0)? 1: 0;
       if (i1) {
          uArrayList.add("utm_campaign=".concat(str));
       }
       str = mi.t(p0, "utm_medium");
       i1 = (str.length() > 0)? 1: 0;
       if (i1) {
          uArrayList.add("utm_medium=".concat(str));
       }
       p0 = mi.t(p0, "utm_source");
       if (p0.length() > 0) {
          i = 1;
       }
       if (i) {
          uArrayList.add("utm_source=".concat(p0));
       }
       return dj0.q0(uArrayList, "&", null, null, null, 62);
    }
    public final boolean b(String p0){
       boolean b = (!this.a.b(p0) && (av6.f0(p0, "utm_campaign") && (!av6.f0(p0, "utm_medium") && !av6.f0(p0, "utm_source"))))? true: false;
       return b;
    }
}
