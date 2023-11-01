package p.pk3;
import java.lang.Object;
import p.w45;
import android.view.View;
import p.x45;
import java.lang.Math;
import java.lang.String;
import java.lang.StringBuilder;
import p.kg4;

public final class pk3	// class@00227b from classes.dex
{
    public w45 a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;

    public void pk3(){
       super();
       this.d();
    }
    public final void a(){
       int i = (this.d != null)? this.a.i(): this.a.n();
       this.c = i;
       return;
    }
    public final void b(View p0,int p1){
       this.c = (this.d != null)? this.a.p() + this.a.e(p0): this.a.g(p0);
       this.b = p1;
       return;
    }
    public final void c(View p0,int p1){
       int i;
       int i1;
       int i2;
       if ((i = this.a.p()) >= 0) {
          this.b(p0, p1);
          return;
       }else {
          this.b = p1;
          if (this.d != null) {
             p1 = (this.a.i() - i) - this.a.e(p0);
             this.c = this.a.i() - p1;
             if (p1 > 0) {
                i = this.a.n();
                if ((i1 = (this.c - this.a.f(p0)) - (Math.min((this.a.g(p0) - i), 0) + i)) < 0) {
                   this.c = Math.min(p1, (- i1)) + this.c;
                }
             }
          }else {
             p1 = this.a.g(p0);
             i1 = p1 - this.a.n();
             this.c = p1;
             if (i1 > 0 && (i2 = (this.a.i() - Math.min(0, ((this.a.i() - i) - this.a.e(p0)))) - (this.a.f(p0) + p1)) < 0) {
                this.c = this.c - Math.min(i1, (- i2));
             }
          }
          return;
       }
    }
    public final void d(){
       this.b = -1;
       this.c = Integer.MIN_VALUE;
       this.d = false;
       this.e = false;
    }
    public final String toString(){
       return kg4.p("AnchorInfo{mPosition="+this.b+", mCoordinate="+this.c+", mLayoutFromEnd="+this.d+", mValid=", this.e, '}');
    }
}
