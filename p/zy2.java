package p.zy2;
import android.util.LruCache;
import p.az2;
import p.iw3;
import java.lang.Object;
import p.yy2;
import java.lang.Class;
import java.lang.Enum;
import p.en6;
import java.lang.String;
import p.tp2;
import p.jl;
import android.content.Context;
import p.sp6;
import android.graphics.drawable.Drawable;
import p.ox7;
import p.hw3;

public final class zy2 extends LruCache	// class@002f8c from classes.dex
{
    public final int a;
    public final Object b;

    public void zy2(az2 p0){
       this.a = 0;
       this.b = p0;
       super(30);
    }
    public void zy2(iw3 p0,int p1){
       this.a = 1;
       this.b = p0;
       super(p1);
    }
    public final Object create(Object p0){
       int i;
       float f;
       int i1;
       switch (this.a){
           case 0:
             zy2 tb = this.b;
             tb.getClass();
             if ((i = p0.a.ordinal()) != 45 && (i != 97 && (i != 188 && (i != 215 && (i != 270 && i != 355))))) {
                f = Float.NaN;
             }else {
                yy2 c = p0.c;
                if (i1 = en6.A(c)) {
                   if (i1 != 1) {
                      if (i1 != 2) {
                         if (i1 != 3) {
                            jl.d("Unmapped size : ".concat(tp2.z(c)));
                            f = 0x3f800000;
                         }else {
                            f = 0x3f400000;
                         }
                      }else {
                         f = 0x3f28f5c3;
                      }
                   }else {
                      f = 0x3f000000;
                   }
                }else {
                   f = 0x3ea8f5c3;
                }
             }
             az2 d = tb.d;
             az2 b = tb.b;
             p0 = p0.a;
             p0 = (p0.b == 1)? ox7.b(b, p0, f, d): ox7.a(b, p0, f, d);
             break;
           default:
             return super.create(p0);
       }
       return p0;
    }
    public final int sizeOf(Object p0,Object p1){
       switch (this.a){
           case 0:
             break;
           default:
             return p1.b;
       }
       int i = en6.A(p0.b);
       int i1 = 1;
       if (i) {
          i1 = (i != i1)? 3: 2;
       }
       return i1;
    }
}
