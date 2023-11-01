package p.t14;
import p.nr6;
import p.kc3;
import java.lang.Object;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;
import java.lang.String;
import p.hc3;
import p.ic3;
import java.lang.Math;
import p.uv1;
import p.n91;
import p.jc3;
import java.lang.IllegalArgumentException;
import p.wh7;
import android.view.View;
import p.dh7;
import android.graphics.Canvas;
import java.util.Locale;

public final class t14 implements nr6	// class@0026de from classes.dex
{
    public final int a;
    public float b;
    public float c;
    public final Object t;

    public void t14(float p0,float p1,kc3 p2){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
    }
    public void t14(StateListAnimatorButton p0){
       this.a = 2;
       this.t = p0;
       super();
       this.b = 0x3f800000;
       this.c = 0x3f800000;
    }
    public void t14(StateListAnimatorButton p0,int p1){
       this.a = 2;
       super(p0);
    }
    public void t14(String p0,float p1,float p2){
       this.a = 0;
       super();
       this.t = p0;
       this.c = p2;
       this.b = p1;
    }
    public static t14 c(float p0){
       if (t14.d(0, p0)) {
          return new t14(0, 0, new hc3(0));
       }
       return new t14(0, p0, new ic3(p0));
    }
    public static boolean d(float p0,float p1){
       boolean b = (((double)Math.abs((p0 - p1)) - 0x3eb0c6f7a0b5ed8d) < 0)? true: false;
       return b;
    }
    public final float a(){
       return this.b;
    }
    public final t14 b(){
       if (t14.d(this.b, this.c)) {
          return this;
       }
       t14 ot14 = new t14(this.b, this.c, new uv1(27, this));
       return new t14(ot14.b, ot14.c, new n91(this, ot14));
    }
    public final t14 e(float p0){
       t14 tb = this.b;
       t14 tc = this.c;
       if (t14.d(tb, tc)) {
          throw new IllegalArgumentException("Can\'t remap from an empty domain");
       }
       float f = 0;
       if (t14.d(p0, f)) {
          tb = new t14(p0, p0, new hc3(p0));
       }else {
          t14 ot14 = new t14(p0, f, new jc3(tb, tc, p0));
          tb = new t14(ot14.b, ot14.c, new n91(this, ot14));
       }
       return tb;
    }
    public final void f(float p0){
       this.b = p0;
       dh7.k(this.t);
    }
    public final void g(Canvas p0){
       p0.save();
       t14 tt = this.t;
       p0.translate(((float)tt.getWidth() / 2.00f), ((float)tt.getHeight() / 2.00f));
       p0.scale(this.b, this.c);
       p0.translate(((float)(- tt.getWidth()) / 2.00f), ((float)(- tt.getHeight()) / 2.00f));
       StateListAnimatorButton.a(tt, p0);
       p0.restore();
    }
    public final void h(float p0){
       this.c = p0;
       dh7.k(this.t);
    }
    public final float i(float p0){
       if (t14.d(this.b, this.c)) {
          return this.b;
       }
       return this.t.d(this.b, this.c, p0);
    }
    public final float n(){
       return this.c;
    }
    public final String toString(){
       switch (this.a){
           case 1:
           default:
             return super.toString();
       }
       Object[] objArray = new Object[]{this.t};
       return String.format(Locale.US, "IntervalTransformer: %s", objArray);
    }
}
