package p.ye6;
import p.a27;
import p.ze6;
import android.content.res.TypedArray;

public final class ye6 extends a27	// class@002da2 from classes.dex
{
    public final int c;

    public void ye6(int p0){
       this.c = p0;
       if (p0 != 1) {
          super(4, 0);
          p0.p = true;
          return;
       }else {
          super(4, 0);
          p0.p = false;
          return;
       }
    }
    public final a27 e(TypedArray p0){
       switch (this.c){
           case 1:
             super.e(p0);
             int i = 2;
             a27 tb = this.b;
             if (p0.hasValue(i)) {
                a27 uoa27 = tb;
                uoa27.e = (p0.getColor(i, uoa27.e) & 0xffffff) | (uoa27.e & 0xff000000);
             }
             if (p0.hasValue(12)) {
                tb.d = p0.getColor(12, tb.d);
             }
             break;
           default:
             return super.e(p0);
       }
       return this;
    }
}
