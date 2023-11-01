package p.cz;
import p.ez;
import android.content.Context;
import p.vt;
import java.lang.Object;
import p.r45;
import p.au2;
import p.a43;
import java.lang.String;
import p.iu2;
import p.ty0;
import p.bu2;
import p.su2;
import p.gu2;
import p.i13;
import java.util.List;
import p.ju2;
import p.r70;
import p.k23;
import java.util.Iterator;
import p.fz2;
import p.jl6;

public abstract class cz extends ez	// class@0012ad from classes.dex
{
    public final Context a;
    public final boolean b;

    public void cz(Context p0,boolean p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final au2 a(vt p0,Object p1,r45 p2){
       return null;
    }
    public final a43 b(vt p0,Object p1,r45 p2,a43 p3){
       String str1;
       List list;
       ju2[] oju2Array;
       cz ta = this.a;
       String str = this.e(ta, p1);
       iu2 oiu2 = ty0.k().j("lite:textHeader", bu2.c.a).s(ty0.z().d(str).c(ta.getString(R.string.entity_title_shuffled_track_list)));
       if ((str1 = this.c(p1)) != null) {
          oiu2 = oiu2.p(ty0.o().c(ty0.n().g(str1)));
       }
       if ((list = p2.f()) != null && !p0.a()) {
          p1 = this.f(ta, p0, p1, list);
          ju2[] oju2Array1 = new ju2[]{r70.b(ta, p0)};
          a43 uoa43 = p3.i(oiu2.a(oju2Array1).g()).a(p1);
          if (!p0.b()) {
             if (this.b == null) {
                Iterator iterator = p1.iterator();
                int i = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      if (!iterator.next().b().y("hubs:glue:muted", 0)) {
                         i++;
                      }
                      if (i >= 15) {
                         iterator = 0;
                      }
                   }else {
                      iterator = 1;
                   }
                   if (!iterator) {
                      break ;
                   }
                }
                return uoa43;
             }
             oju2Array = new ju2[]{ty0.k().j("lite:shuffledTrack", bu2.t.a).s(ty0.z().b(this.d(ta, str))).g()};
             uoa43 = uoa43.b(oju2Array);
          }else {
          }
       }else {
          oju2Array = new ju2[]{jl6.b(ta)};
          return p3.i(oiu2.a(oju2Array).g()).a(jl6.b);
       }
    }
    public abstract String c(Object p0);
    public abstract String d(Context p0,String p1);
    public abstract String e(Context p0,Object p1);
    public abstract List f(Context p0,vt p1,Object p2,List p3);
}
