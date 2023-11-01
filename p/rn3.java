package p.rn3;
import p.b5;
import p.vn3;
import p.aq6;
import java.lang.Object;
import java.lang.Class;
import p.yp6;
import p.g12;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.x02;
import java.lang.String;
import p.xy5;
import p.rn1;
import p.uw6;
import p.uy;
import p.sw6;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.Enum;
import p.y02;
import p.a12;
import java.util.HashSet;
import p.t00;
import java.util.Collection;
import p.c12;
import p.q02;
import p.u02;

public final class rn3 implements b5	// class@00251f from classes.dex
{
    public final int a;
    public final vn3 b;
    public final aq6 c;
    public final boolean t;

    public void rn3(vn3 p0,aq6 p1,boolean p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final void run(){
       g12 og12;
       g12 a;
       String str1;
       g12 a1;
       uw6 ouw6;
       int i = 1;
       rn3 tt = this.t;
       String str = "Unsupported uri: ";
       rn3 tc = this.c;
       rn3 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             if (tc.b == yp6.m0) {
                vn3 b = tb.b;
                if (tt != null) {
                   og12 = b.w();
                   a = og12.a;
                   a.b();
                   a.c();
                   og12.g.h(new x02(tc.toString()));
                   a.r();
                   a.m();
                }else {
                   og12 = b.w();
                   str1 = tc.toString();
                   a1 = og12.a;
                   a1.b();
                   og12 = og12.r;
                   ouw6 = og12.c();
                   if (str1 == null) {
                      ouw6.z(i);
                   }else {
                      ouw6.s(i, str1);
                   }
                   a1.c();
                   ouw6.u();
                   a1.r();
                   a1.m();
                   og12.f(ouw6);
                }
             }else {
                throw new IllegalArgumentException(str+tc);
             }
             break;
           default:
             tb.getClass();
             int i1 = tc.b.ordinal();
             vn3 b1 = tb.b;
             if (i1 != i) {
                if (i1 != 3) {
                   if (i1 != 5) {
                      if (i1 != 16) {
                         if (i1 != 51) {
                            if (i1 != 9 && i1 != 10) {
                               throw new IllegalArgumentException(str+tc);
                            }else if(tt != null){
                               og12 = b1.w();
                               a = og12.a;
                               a.b();
                               a.c();
                               og12.c.h(new y02(tc.toString()));
                               a.r();
                               a.m();
                            }else {
                               og12 = b1.w();
                               str1 = tc.toString();
                               a1 = og12.a;
                               a1.b();
                               og12 = og12.j;
                               ouw6 = og12.c();
                               if (str1 == null) {
                                  ouw6.z(i);
                               }else {
                                  ouw6.s(i, str1);
                               }
                               a1.c();
                               ouw6.u();
                               a1.r();
                               a1.m();
                               og12.f(ouw6);
                            }
                         }else if(tt != null){
                            og12 = b1.w();
                            a = og12.a;
                            a.b();
                            a.c();
                            og12.f.h(new a12(tc.toString()));
                            a.r();
                            a.m();
                         }else {
                            og12 = b1.w();
                            str1 = tc.toString();
                            a1 = og12.a;
                            a1.b();
                            og12 = og12.p;
                            ouw6 = og12.c();
                            if (str1 == null) {
                               ouw6.z(i);
                            }else {
                               ouw6.s(i, str1);
                            }
                            a1.c();
                            ouw6.u();
                            a1.r();
                            a1.m();
                            og12.f(ouw6);
                         }
                      }else {
                         vn3 a2 = tb.a;
                         HashSet hashSet = new HashSet(a2.c());
                         if (tt != null) {
                            hashSet.add(tc.toString());
                         }else {
                            hashSet.remove(tc.toString());
                         }
                         a2.onNext(hashSet);
                      }
                   }else if(tt != null){
                      og12 = b1.w();
                      a = og12.a;
                      a.b();
                      a.c();
                      og12.b.h(new c12(tc.toString()));
                      a.r();
                      a.m();
                   }else {
                      og12 = b1.w();
                      str1 = tc.toString();
                      a1 = og12.a;
                      a1.b();
                      og12 = og12.h;
                      ouw6 = og12.c();
                      if (str1 == null) {
                         ouw6.z(i);
                      }else {
                         ouw6.s(i, str1);
                      }
                      a1.c();
                      ouw6.u();
                      a1.r();
                      a1.m();
                      og12.f(ouw6);
                   }
                }else if(tt != null){
                   og12 = b1.w();
                   a = og12.a;
                   a.b();
                   a.c();
                   og12.d.h(new q02(tc.toString()));
                   a.r();
                   a.m();
                }else {
                   og12 = b1.w();
                   str1 = tc.toString();
                   a1 = og12.a;
                   a1.b();
                   og12 = og12.l;
                   ouw6 = og12.c();
                   if (str1 == null) {
                      ouw6.z(i);
                   }else {
                      ouw6.s(i, str1);
                   }
                   a1.c();
                   ouw6.u();
                   a1.r();
                   a1.m();
                   og12.f(ouw6);
                }
             }else if(tt != null){
                og12 = b1.w();
                a = og12.a;
                a.b();
                a.c();
                og12.e.h(new u02(tc.toString()));
                a.r();
                a.m();
             }else {
                og12 = b1.w();
                str1 = tc.toString();
                a1 = og12.a;
                a1.b();
                og12 = og12.n;
                ouw6 = og12.c();
                if (str1 == null) {
                   ouw6.z(i);
                }else {
                   ouw6.s(i, str1);
                }
                a1.c();
                ouw6.u();
                a1.r();
                a1.m();
                og12.f(ouw6);
             }
             return;
       }
       return;
    }
}
