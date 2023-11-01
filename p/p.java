package p.p;
import p.a81;
import p.mc1;
import p.vz3;
import p.sn2;
import p.f87;
import p.r;
import p.zw0;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.Drawable;
import p.n63;
import p.en6;
import p.a91;
import p.uc1;
import coil.target.GenericViewTarget;
import p.gq5;
import android.widget.ImageView;
import p.cd2;
import java.lang.Integer;
import android.content.Context;
import p.ry7;

public abstract class p	// class@00221e from classes.dex
{
    public static final a81 a;

    static {
       j71 b = mc1.b;
       a81 v16 = new a81(vz3.a.w, b, b, b, f87.a, 3, r.b, true, false, null, null, null, 1, 1, 1);
       p.a = v16;
    }
    public static final boolean a(n63 p0){
       int i;
       boolean b;
       if (i = en6.A(p0.i)) {
          b = true;
          if (i != b) {
             if (i == 2) {
                n63 b1 = p0.B;
                if (p0.L.b != null || !b1 instanceof uc1) {
                   p0 = p0.c;
                   if (!p0 instanceof GenericViewTarget || (!b1 instanceof gq5 || (!p0.f() instanceof ImageView || p0.f() != b1.a))) {
                   label_0042 :
                      b = false;
                   }
                }
             }else {
                throw new cd2(10);
             }
          }
       }else {
          goto label_0042 ;
       }
       return b;
    }
    public static final Drawable b(n63 p0,Drawable p1,Integer p2,Drawable p3){
       if (p1 == null) {
          if (p2 != null) {
             p1 = (!p2.intValue())? null: ry7.A(p0.a, p2.intValue());
          }else {
             p1 = p3;
          }
       }
       return p1;
    }
}
