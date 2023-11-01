package p.p24;
import android.graphics.drawable.Drawable$ConstantState;
import p.bd6;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p.q24;

public final class p24 extends Drawable$ConstantState	// class@0021da from classes.dex
{
    public bd6 a;
    public ci1 b;
    public ColorStateList c;
    public ColorStateList d;
    public final ColorStateList e;
    public ColorStateList f;
    public PorterDuff$Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public final float o;
    public final int p;
    public int q;
    public int r;
    public final int s;
    public final boolean t;
    public final Paint$Style u;

    public void p24(bd6 p0){
       super();
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = PorterDuff$Mode.SRC_IN;
       this.h = null;
       this.i = 0x3f800000;
       this.j = 0x3f800000;
       this.l = 255;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 0;
       this.t = false;
       this.u = Paint$Style.FILL_AND_STROKE;
       this.a = p0;
       this.b = null;
    }
    public void p24(p24 p0){
       super();
       this.c = null;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = PorterDuff$Mode.SRC_IN;
       this.h = null;
       this.i = 0x3f800000;
       this.j = 0x3f800000;
       this.l = 255;
       this.m = 0;
       this.n = 0;
       this.o = 0;
       this.p = 0;
       this.q = 0;
       this.r = 0;
       this.s = 0;
       this.t = false;
       this.u = Paint$Style.FILL_AND_STROKE;
       this.a = p0.a;
       this.b = p0.b;
       this.k = p0.k;
       this.c = p0.c;
       this.d = p0.d;
       this.g = p0.g;
       this.f = p0.f;
       this.l = p0.l;
       this.i = p0.i;
       this.r = p0.r;
       this.p = p0.p;
       this.t = p0.t;
       this.j = p0.j;
       this.m = p0.m;
       this.n = p0.n;
       this.o = p0.o;
       this.q = p0.q;
       this.s = p0.s;
       this.e = p0.e;
       this.u = p0.u;
       if (p0.h != null) {
          this.h = new Rect(p0.h);
       }
       return;
    }
    public final int getChangingConfigurations(){
       return 0;
    }
    public final Drawable newDrawable(){
       q24 oq24 = new q24(this);
       oq24.v = true;
       return oq24;
    }
}
