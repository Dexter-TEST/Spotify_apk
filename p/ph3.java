package p.ph3;
import java.lang.Object;
import java.lang.Float;
import p.sv3;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import p.yl2;
import java.lang.String;
import java.lang.StringBuilder;

public class ph3	// class@002260 from classes.dex
{
    public final sv3 a;
    public final Object b;
    public Object c;
    public final Interpolator d;
    public final Interpolator e;
    public final Interpolator f;
    public final float g;
    public Float h;
    public float i;
    public float j;
    public int k;
    public int l;
    public float m;
    public float n;
    public PointF o;
    public PointF p;

    public void ph3(Object p0){
       super();
       this.i = -3987645.75f;
       this.j = -3987645.75f;
       this.k = 0x2ec8fb09;
       this.l = 0x2ec8fb09;
       this.m = Float.MIN_VALUE;
       this.n = Float.MIN_VALUE;
       this.o = null;
       this.p = null;
       this.a = null;
       this.b = p0;
       this.c = p0;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = Float.MIN_VALUE;
       this.h = Float.valueOf(Float.MAX_VALUE);
    }
    public void ph3(sv3 p0,PointF p1,PointF p2,Interpolator p3,Interpolator p4,Interpolator p5,float p6,Float p7){
       super();
       this.i = -3987645.75f;
       this.j = -3987645.75f;
       this.k = 0x2ec8fb09;
       this.l = 0x2ec8fb09;
       this.m = Float.MIN_VALUE;
       this.n = Float.MIN_VALUE;
       this.o = null;
       this.p = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
    }
    public void ph3(sv3 p0,Object p1,Object p2,Interpolator p3,float p4,Float p5){
       super();
       this.i = -3987645.75f;
       this.j = -3987645.75f;
       this.k = 0x2ec8fb09;
       this.l = 0x2ec8fb09;
       this.m = Float.MIN_VALUE;
       this.n = Float.MIN_VALUE;
       this.o = null;
       this.p = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = null;
       this.f = null;
       this.g = p4;
       this.h = p5;
    }
    public void ph3(sv3 p0,Object p1,Object p2,Interpolator p3,Interpolator p4,float p5){
       super();
       this.i = -3987645.75f;
       this.j = -3987645.75f;
       this.k = 0x2ec8fb09;
       this.l = 0x2ec8fb09;
       this.m = Float.MIN_VALUE;
       this.n = Float.MIN_VALUE;
       this.o = null;
       this.p = null;
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = null;
       this.e = p3;
       this.f = p4;
       this.g = p5;
       this.h = null;
    }
    public void ph3(yl2 p0,yl2 p1){
       super();
       this.i = -3987645.75f;
       this.j = -3987645.75f;
       this.k = 0x2ec8fb09;
       this.l = 0x2ec8fb09;
       this.m = Float.MIN_VALUE;
       this.n = Float.MIN_VALUE;
       this.o = null;
       this.p = null;
       this.a = null;
       this.b = p0;
       this.c = p1;
       this.d = null;
       this.e = null;
       this.f = null;
       this.g = Float.MIN_VALUE;
       this.h = Float.valueOf(Float.MAX_VALUE);
    }
    public final float a(){
       ph3 ta;
       float f = 0x3f800000;
       if ((ta = this.a) == null) {
          return f;
       }
       if (!(1 - this.n)) {
          this.n = (this.h == null)? f: ((this.h.floatValue() - this.g) / (ta.k - ta.j)) + this.b();
       }
       return this.n;
    }
    public final float b(){
       ph3 ta;
       if ((ta = this.a) == null) {
          return 0;
       }
       if (!(1 - this.m)) {
          sv3 j = ta.j;
          this.m = (this.g - j) / (ta.k - j);
       }
       return this.m;
    }
    public final boolean c(){
       boolean b = (this.d == null && (this.e == null && this.f == null))? true: false;
       return b;
    }
    public final String toString(){
       return "Keyframe{startValue="+this.b+", endValue="+this.c+", startFrame="+this.g+", endFrame="+this.h+", interpolator="+this.d+'}';
    }
}
