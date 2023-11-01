package p.bd6;
import java.lang.Object;
import p.fz5;
import p.d0;
import p.gg1;
import p.ye7;
import p.ad6;
import p.lv1;
import p.uw0;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import p.ft5;
import android.graphics.RectF;
import java.lang.Class;

public final class bd6	// class@0010a4 from classes.dex
{
    public final lv1 a;
    public final lv1 b;
    public final lv1 c;
    public final lv1 d;
    public final uw0 e;
    public final uw0 f;
    public final uw0 g;
    public final uw0 h;
    public final gg1 i;
    public final gg1 j;
    public final gg1 k;
    public final gg1 l;

    public void bd6(){
       super();
       this.a = new fz5();
       this.b = new fz5();
       this.c = new fz5();
       this.d = new fz5();
       this.e = new d0(0);
       this.f = new d0(0);
       this.g = new d0(0);
       this.h = new d0(0);
       this.i = ye7.q();
       this.j = ye7.q();
       this.k = ye7.q();
       this.l = ye7.q();
    }
    public void bd6(ad6 p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.d = p0.d;
       this.e = p0.e;
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = p0.k;
       this.l = p0.l;
    }
    public static ad6 a(Context p0,int p1,int p2,d0 p3){
       ContextThemeWrapper uContextThem;
       if (p2) {
          p1 = p2;
          uContextThem = new ContextThemeWrapper(p0, p1);
       }
       TypedArray typedArray = uContextThem.obtainStyledAttributes(p1, lv1.F);
       p2 = typedArray.getInt(0, 0);
       int intx = typedArray.getInt(3, p2);
       int intx1 = typedArray.getInt(4, p2);
       int intx2 = typedArray.getInt(2, p2);
       uw0 ouw0 = bd6.c(typedArray, 5, p3);
       uw0 ouw01 = bd6.c(typedArray, 8, ouw0);
       uw0 ouw02 = bd6.c(typedArray, 9, ouw0);
       uw0 ouw03 = bd6.c(typedArray, 7, ouw0);
       ad6 uoad6 = new ad6(0);
       lv1 olv1 = ye7.o(intx);
       uoad6.a = olv1;
       ad6.d(olv1);
       uoad6.e = ouw01;
       olv1 = ye7.o(intx1);
       uoad6.b = olv1;
       ad6.d(olv1);
       uoad6.f = ouw02;
       olv1 = ye7.o(intx2);
       uoad6.c = olv1;
       ad6.d(olv1);
       uoad6.g = ouw03;
       olv1 = ye7.o(typedArray.getInt(1, p2));
       uoad6.d = olv1;
       ad6.d(olv1);
       uoad6.h = bd6.c(typedArray, 6, ouw0);
       typedArray.recycle();
       return uoad6;
    }
    public static ad6 b(Context p0,AttributeSet p1,int p2,int p3){
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.z, p2, p3);
       typedArray.recycle();
       return bd6.a(p0, typedArray.getResourceId(0, 0), typedArray.getResourceId(1, 0), new d0((float)0));
    }
    public static uw0 c(TypedArray p0,int p1,uw0 p2){
       TypedValue typedValue;
       TypedValue type;
       if ((typedValue = p0.peekValue(p1)) == null) {
          return p2;
       }
       if ((type = typedValue.type) == 5) {
          return new d0((float)TypedValue.complexToDimensionPixelSize(typedValue.data, p0.getResources().getDisplayMetrics()));
       }
       if (type == 6) {
          return new ft5(typedValue.getFraction(0x3f800000, 0x3f800000));
       }
       return p2;
    }
    public final boolean d(RectF p0){
       gg1 ogg1 = gg1.class;
       boolean b = true;
       int i = (this.l.getClass().equals(ogg1) && (this.j.getClass().equals(ogg1) && (this.i.getClass().equals(ogg1) && this.k.getClass().equals(ogg1))))? 1: 0;
       float f = this.e.a(p0);
       int i1 = (!(f - this.f.a(p0)) && (!(f - this.h.a(p0)) && !(f - this.g.a(p0))))? 1: 0;
       f = (this.b instanceof fz5 && (this.a instanceof fz5 && (this.c instanceof fz5 && this.d instanceof fz5)))? 1: 0;
       if (!i || (!i1 || !f)) {
          b = false;
       }
       return b;
    }
    public final bd6 e(float p0){
       ad6 uoad6 = new ad6(this);
       uoad6.e = new d0(p0);
       uoad6.f = new d0(p0);
       uoad6.g = new d0(p0);
       uoad6.h = new d0(p0);
       return new bd6(uoad6);
    }
}
