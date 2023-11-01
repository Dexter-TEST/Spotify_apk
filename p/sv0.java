package p.sv0;
import p.yf2;
import p.tv0;
import java.lang.String;
import java.lang.Integer;
import java.lang.Object;
import com.spotify.playerlimited.player.models.OfflineTracksResourceResponse;
import p.co5;
import com.spotify.playerlimited.player.models.OfflineTracksResource;
import java.util.List;
import com.google.common.collect.c;
import p.w51;
import java.util.Iterator;
import java.lang.Iterable;
import com.spotify.playerlimited.player.models.OfflineResource;
import p.lq5;
import p.nt0;
import java.lang.StringBuilder;
import p.en6;
import p.ur;
import p.do5;
import java.util.Arrays;
import p.ys5;
import p.ou;
import io.reactivex.rxjava3.core.Single;
import p.cs1;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;

public final class sv0 implements yf2	// class@0026a4 from classes.dex
{
    public final tv0 a;
    public final String b;
    public final String c;
    public final Integer t;
    public final boolean v;
    public final boolean w;

    public void sv0(tv0 p0,String p1,String p2,Integer p3,boolean p4,boolean p5){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       super();
    }
    public final Object apply(Object p0){
       OfflineTracksResource c;
       OfflineTracksResourceResponse a1;
       OfflineTracksResource c1;
       Iterator iterator;
       OfflineResource a2;
       co5.o(p0, "res");
       OfflineTracksResourceResponse a = p0.a;
       sv0 ta = this.a;
       if (a != null && (c = a.c) != null) {
          int i = 1;
          int i1 = 0;
          if (c.isEmpty() != i) {
             iterator = 0;
          }
          if (!i) {
             w51.h(4, "initialCapacity");
             Object[] objArray = new Object[4];
             if ((a1 = p0.a) != null && (c1 = a1.c) != null) {
                iterator = c1.iterator();
                int i2 = 0;
                while (iterator.hasNext()) {
                   if ((a2 = iterator.next().a) != null) {
                      lq5 olq5 = nt0.a(a2);
                      int i3 = i2 + 1;
                      olq5.l(en6.r(a2).append(i2).toString());
                      ur our = olq5.e();
                      int i4 = i1 + 1;
                      if (objArray.length < i4) {
                         objArray = Arrays.copyOf(objArray, do5.t(objArray.length, i4));
                      }
                      objArray[i1] = our;
                      i1 = i4;
                      i2 = i3;
                   }
                }
             }
             if ((p0 = p0.a) != null && (p0 = p0.c) != null) {
                p0.size();
             }
             p0 = Completable.k(ta.f.a(ta.d(this.b, c.m(i1, objArray), null, this.t, this.v, this.w)));
          label_00b1 :
             return p0;
          }
       }
       p0 = Completable.k(ta.f.a(ta.d(this.b, null, this.c, this.t, this.v, this.w)));
       goto label_00b1 ;
    }
}
