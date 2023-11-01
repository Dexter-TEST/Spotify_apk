package p.pn1;
import p.yf2;
import p.qn1;
import p.aq6;
import java.lang.Object;
import p.av2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import p.yp6;
import java.lang.String;
import java.lang.StringBuilder;
import android.content.Intent;
import p.xj0;
import p.zh0;
import p.b90;
import io.reactivex.rxjava3.core.Observable;
import p.d90;
import p.bo1;
import java.lang.Enum;
import p.w94;
import p.jl;
import p.uv1;
import p.e8;
import java.util.Objects;
import p.v94;
import p.r94;
import p.sg2;
import p.sb4;
import p.ti3;
import p.td7;
import p.u94;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.bn1;
import p.p54;
import p.qn3;
import java.lang.Boolean;
import p.jc7;
import android.view.View;
import io.reactivex.rxjava3.core.Completable;
import p.wn3;
import p.ox7;

public final class pn1 implements yf2	// class@002293 from classes.dex
{
    public final int a;
    public final qn1 b;
    public final aq6 c;

    public void pn1(qn1 p0,aq6 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final Object apply(Object p0){
       aq6 b1;
       aq6 b2;
       Observable observable;
       uv1 ouv1;
       e8 uoe8;
       pn1 opn1 = this;
       int i = 1;
       pn1 c = opn1.c;
       pn1 b = opn1.b;
       switch (opn1.a){
           case 0:
             break;
           default:
             return ox7.B(b.C.v.c(c, (i ^ b.J.isSelected())));
       }
       qn1 c1 = b.C;
       Context uContext = b.requireContext();
       c1.getClass();
       String dataString = ((b1 = c.b) != yp6.A && b1 != yp6.B)? null: xj0.s(uContext, "spotify:internal:edit-playlist:"+c.toString()).getDataString();
       int i1 = 6;
       if ((b2 = c.b) == yp6.G) {
          observable = d90.a(new zh0(c1, i1, c));
       }else {
          bo1 c2 = c1.C;
          c2.getClass();
          int i2 = b2.ordinal();
          int i3 = 10;
          int i4 = 9;
          w94 b3 = c2.b;
          if (i2 != i) {
             int i5 = 3;
             if (i2 != i5) {
                ad5 s = w94.s;
                if (i2 != 5) {
                   ad5 t = w94.t;
                   int i6 = 14;
                   if (i2 != i6) {
                      if (i2 != 64) {
                         if (i2 != i4 && i2 != i3) {
                            if (i2 != 51) {
                               if (i2 != 52) {
                                  jl.d("Invalid context URI, "+c);
                                  ouv1 = new uv1(c);
                               }else {
                                  Objects.requireNonNull(b3);
                                  ouv1 = new e8(c2.a(c, new v94(b3, 15), s, s), c2.j, i5);
                               }
                            }else {
                               Objects.requireNonNull(b3);
                               uoe8 = new e8(c2.a(c, new v94(b3, i), new v94(b3, 2), new v94(b3, i5)), c2.l, 5);
                            label_0257 :
                               ouv1 = uoe8;
                            }
                         }else {
                            Objects.requireNonNull(b3);
                            ouv1 = new e8(c2.a(td7.c(c), new v94(b3, 12), new v94(b3, 13), new v94(b3, i6)), c2.k, 4);
                         }
                      }else {
                         Objects.requireNonNull(b3);
                         ouv1 = new e8(c2.a(c, t, new v94(b3, 5), new v94(b3, 6)), c2.n, 2);
                      }
                   }else if((b2 = c.t) != null && (b2.startsWith("tracks-list:") && (b2 = td7.d(b2.substring(12))) != null)){
                      if ((i6 = b2.b.ordinal()) != i) {
                         if (i6 != i5) {
                            if (i6 != 64) {
                               if (i6 != i4 && i6 != i3) {
                                  jl.d("Invalid tracks list URI, "+b2);
                                  ouv1 = new uv1(b2);
                               }else {
                                  Objects.requireNonNull(b3);
                                  ouv1 = new e8(c2.a(td7.c(b2), new v94(b3, 23), new v94(b3, 24), new v94(b3, 25)), c2.q, 4);
                               }
                            }else {
                               Objects.requireNonNull(b3);
                               ouv1 = new e8(c2.a(b2, t, new v94(b3, 26), new v94(b3, 17)), c2.r, 2);
                            }
                         }else {
                            Objects.requireNonNull(b3);
                            ouv1 = new e8(c2.a(b2, new v94(b3, 16), new v94(b3, 18), new v94(b3, 19)), c2.o, 0);
                         }
                      }else {
                         Objects.requireNonNull(b3);
                         uoe8 = new e8(c2.a(b2, new v94(b3, 20), new v94(b3, 21), new v94(b3, 22)), c2.p, i);
                         goto label_0257 ;
                      }
                   }else {
                      jl.d("Invalid internal context URI, "+c);
                      ouv1 = new uv1(c);
                   }
                }else {
                   Objects.requireNonNull(b3);
                   ouv1 = new e8(c2.a(c, new v94(b3, 4), s, s), c2.m, 6);
                }
             }else {
                Objects.requireNonNull(b3);
                i2 = 0;
                ouv1 = new e8(c2.a(c, new v94(b3, i2), new v94(b3, 7), new v94(b3, 8)), c2.h, i2);
             }
          }else {
             Objects.requireNonNull(b3);
             uoe8 = new e8(c2.a(c, new v94(b3, i4), new v94(b3, i3), new v94(b3, 11)), c2.i, i);
             goto label_0257 ;
          }
          c1.G = ouv1;
          observable = ouv1.c();
       }
       return observable.compose(c1.w).compose(c1.x).compose(new bn1(c1.t.e().map(new qn3(c, 2)).startWithItem(Boolean.FALSE).distinctUntilChanged(), dataString)).compose(c1.z).compose(c1.A);
    }
}
