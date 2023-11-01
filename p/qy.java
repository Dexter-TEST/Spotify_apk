package p.qy;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import p.az5;
import p.py;
import p.oy;
import p.my;
import p.ph3;
import p.ny;
import android.animation.TimeInterpolator;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public abstract class qy	// class@002440 from classes.dex
{
    public final ArrayList a;
    public boolean b;
    public final ny c;
    public float d;
    public Object e;
    public float f;
    public float g;

    public void qy(List p0){
       az5 uoaz5;
       py opy;
       super();
       this.a = new ArrayList(1);
       boolean b = false;
       this.b = b;
       this.d = 0;
       this.e = null;
       this.f = 0xbf800000;
       this.g = 0xbf800000;
       if (p0.isEmpty()) {
          uoaz5 = new az5(b);
       }else if(p0.size() == 1){
          opy = new py(p0);
       }else {
          opy = new oy(p0);
       }
       uoaz5 = opy;
       this.c = uoaz5;
       return;
    }
    public final void a(my p0){
       this.a.add(p0);
    }
    public final ph3 b(){
       return this.c.j();
    }
    public final float c(){
       ph3 oph3;
       if ((oph3 = this.b()) != null && !oph3.c()) {
          return oph3.d.getInterpolation(this.d());
       }
       return 0;
    }
    public final float d(){
       float f = 0;
       if (this.b != null) {
          return f;
       }
       ph3 oph3 = this.b();
       if (oph3.c()) {
          return f;
       }
       return ((this.d - oph3.b()) / (oph3.a() - oph3.b()));
    }
    public Object e(){
       ph3 e;
       ph3 f1;
       float f = this.d();
       if (this.c.h(f)) {
          return this.e;
       }
       ph3 oph3 = this.b();
       Object obj = ((e = oph3.e) != null && (f1 = oph3.f) != null)? this.g(oph3, f, e.getInterpolation(f), f1.getInterpolation(f)): this.f(oph3, this.c());
       this.e = obj;
       return obj;
    }
    public abstract Object f(ph3 p0,float p1);
    public Object g(ph3 p0,float p1,float p2,float p3){
       throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }
    public void h(float p0){
       qy tf1;
       qy tc = this.c;
       if (tc.isEmpty()) {
          return;
       }
       if (!(0xbf800000 - this.f)) {
          this.f = tc.i();
       }
       qy tf = this.f;
       if ((p0 - tf) < 0) {
          if (!(0xbf800000 - tf)) {
             this.f = tc.i();
          }
          tf1 = this.f;
       }else if(!(0xbf800000 - this.g)){
          this.g = tc.g();
       }
       tf = this.g;
       if ((tf - p0) > 0) {
          if (!(0xbf800000 - tf)) {
             this.g = tc.g();
          }
          tf1 = this.g;
       }
       if (!(this.d - tf1)) {
          return;
       }else {
          this.d = tf1;
          if (tc.m(tf1)) {
             int i = 0;
             while (true) {
                tc = this.a;
                if (i < tc.size()) {
                   tc.get(i).b();
                   i++;
                }
             }
          }
          return;
       }
    }
}
