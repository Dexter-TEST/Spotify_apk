package p.cc1;
import p.zf2;
import p.gi3;
import java.lang.Object;
import java.io.IOException;
import p.ec1;
import java.lang.String;
import p.co5;
import p.dc1;
import p.we7;
import p.jc7;
import java.lang.Throwable;
import kotlinx.coroutines.sync.a;
import p.ib3;
import java.lang.CharSequence;
import p.av6;
import p.h0;
import p.i80;
import p.nt5;
import java.lang.Class;
import p.ay;
import java.util.Locale;
import java.io.File;
import java.util.List;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p.w32;
import p.vv7;
import java.lang.Boolean;
import java.lang.Number;
import p.ym6;
import p.dj0;
import android.app.Activity;
import android.view.View;
import p.je5;
import p.es0;
import p.r46;
import p.p46;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import p.yi7;
import p.eb;
import p.ba;
import p.ma;
import p.ub4;
import p.q46;

public final class cc1 extends gi3 implements zf2	// class@0011da from classes.dex
{
    public final int a;
    public final Object b;

    public void cc1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super(1);
    }
    public final void a(IOException p0){
       cc1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             co5.o(p0, "it");
             tb.D = true;
             return;
       }
       tb.B = true;
       return;
    }
    public final Object invoke(Object p0){
       Activity uActivity;
       w32 ow321;
       jc7 a = jc7.a;
       String str = "it";
       cc1 tb = this.b;
       switch (this.a){
           case 0:
             this.a(p0);
             return a;
           case 1:
             co5.o(p0, "response");
             if (p0 instanceof p46) {
                tb.R.getValue().e(new ba(p0));
             }else if(co5.c(p0, q46.a)){
                tb.finish();
             }
             return a;
             break;
           case 2:
             co5.o(p0, "tag");
             tb.d.invoke(p0);
             return a;
           case 4:
             p0 = p0.intValue();
             p0 = ((uActivity = dj0.l0(tb.g)) != null)? uActivity.findViewById(p0): null;
             return p0;
             break;
           case 5:
             co5.o(p0, "path");
             boolean b = false;
             if (!tb instanceof Collection || !tb.isEmpty()) {
                Iterator iterator = tb.iterator();
                while (iterator.hasNext()) {
                   File uFile = iterator.next();
                   if (!co5.c(p0, uFile)) {
                      co5.o(uFile, "other");
                      w32 ow32 = vv7.T(p0);
                      ow321 = vv7.T(uFile);
                      if (co5.c(ow32.a, ow321.a)) {
                         ow32 = ow32.b;
                         ow321 = ow321.b;
                         if (ow32.size() >= ow321.size()) {
                            boolean b1 = ow32.subList(b, ow321.size()).equals(ow321);
                         label_00b8 :
                            if (ow321) {
                               ow321 = 1;
                            label_00bd :
                               if (ow321) {
                                  b = true;
                                  break ;
                               }
                            }
                         }
                      }
                      ow321 = 0;
                      goto label_00b8 ;
                   }
                   ow321 = 0;
                   goto label_00bd ;
                }
             }
             return Boolean.valueOf(b);
             break;
           case 6:
             co5.l(p0, str);
             tb.getClass();
             p0 = ay.e.c(p0.p());
             co5.l(p0, "base16\(\).encode\(this.toByteArray\(\)\)");
             p0 = p0.toLowerCase(Locale.ROOT);
             co5.l(p0, "this as java.lang.String\).toLowerCase\(Locale.ROOT\)");
             return p0.concat(", ");
           case 7:
             p0 = (p0 == tb)? "\(this Collection\)": String.valueOf(p0);
             return p0;
             break;
           case 9:
             co5.o(p0, str);
             return av6.E0(tb, p0);
           case 10:
             tb.b();
             return a;
           default:
             this.a(p0);
             return a;
       }
    }
}
