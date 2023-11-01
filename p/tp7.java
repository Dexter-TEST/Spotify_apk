package p.tp7;
import p.sp7;
import p.xp7;
import android.view.WindowInsets;
import p.aa3;
import p.qp7;
import android.graphics.Insets;
import p.jy6;
import android.view.View;

public class tp7 extends sp7	// class@0027ba from classes.dex
{
    public aa3 n;
    public aa3 o;
    public aa3 p;

    public void tp7(xp7 p0,WindowInsets p1){
       super(p0, p1);
       this.n = null;
       this.o = null;
       this.p = null;
    }
    public aa3 g(){
       if (this.o == null) {
          this.o = aa3.b(jy6.x(this.c));
       }
       return this.o;
    }
    public aa3 i(){
       if (this.n == null) {
          this.n = aa3.b(jy6.c(this.c));
       }
       return this.n;
    }
    public aa3 k(){
       if (this.p == null) {
          this.p = aa3.b(jy6.t(this.c));
       }
       return this.p;
    }
    public xp7 l(int p0,int p1,int p2,int p3){
       return xp7.g(jy6.f(this.c, p0, p1, p2, p3), null);
    }
    public void q(aa3 p0){
    }
}
