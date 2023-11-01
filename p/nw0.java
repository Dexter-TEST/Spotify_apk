package p.nw0;
import p.jg2;
import java.util.Map;
import java.lang.Object;
import p.sv;
import java.lang.Class;
import p.i77;
import java.lang.String;
import p.xe7;
import java.lang.Boolean;
import p.aq6;
import p.ts0;
import java.lang.Enum;

public final class nw0 implements jg2	// class@00205d from classes.dex
{
    public final int a;
    public final Map b;

    public void nw0(int p0,Map p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       int i;
       ts0 e;
       int i1;
       nw0 tb = this.b;
       switch (this.a){
           case 0:
           default:
             if ((i = p0.b.ordinal()) != 1) {
                if (i != 3) {
                   if (i != 5) {
                      if (i != 58) {
                         if (i != 9 && i != 10) {
                            e = ts0.E;
                            if (i != 22) {
                               if (i != 23) {
                                  if (i != 51 && i != 52) {
                                     switch (i){
                                         case '@':
                                           e = ts0.K;
                                           break;
                                         case 'A':
                                           e = ts0.L;
                                           break;
                                         case 'B':
                                           e = ts0.M;
                                           break;
                                         default:
                                           e = ts0.b;
                                     }
                                  }else if("video".equals(tb.get("media.type"))){
                                     p0 = ts0.G;
                                  }else {
                                     p0 = ts0.F;
                                  }
                                  e = p0;
                               }else if((i1 = p0.y.ordinal()) != 1){
                                  if (i1 != 3) {
                                     if (i1 != 5) {
                                        switch (i1){
                                            case 8:
                                              e = ts0.z;
                                              break;
                                            case 9:
                                            case 10:
                                              e = ts0.D;
                                              break;
                                            default:
                                        }
                                     }else {
                                        e = ts0.J;
                                     }
                                  }else {
                                     e = ts0.w;
                                  }
                               }else {
                                  e = ts0.x;
                               }
                            }
                         }else {
                            e = ts0.C;
                         }
                      }else {
                         e = ts0.y;
                      }
                   }else {
                      e = ts0.I;
                   }
                }else {
                   e = ts0.t;
                }
             }else {
                e = ts0.v;
             }
             return e;
       }
       p0.getClass();
       i77 oi77 = new i77(p0);
       oi77.d = xe7.J(tb.get("catalogue"));
       oi77.c = xe7.J(tb.get("country_code"));
       oi77.a = Boolean.valueOf("1".equals(tb.get("on-demand")));
       oi77.b = Boolean.valueOf("1".equals(tb.get("offline")));
       oi77.e = Boolean.valueOf("1".equals(tb.get("filter-explicit-content")));
       oi77.f = Boolean.valueOf("1".equals(tb.get("shows-collection")));
       return oi77.m();
    }
}
