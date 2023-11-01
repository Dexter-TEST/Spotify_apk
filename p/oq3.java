package p.oq3;
import androidx.lifecycle.b;
import p.xz4;
import java.lang.Object;
import p.ek3;

public abstract class oq3	// class@00216d from classes.dex
{
    public final xz4 a;
    public boolean b;
    public int c;
    public final b t;

    public void oq3(b p0,xz4 p1){
       this.t = p0;
       super();
       this.c = -1;
       this.a = p1;
    }
    public final void b(boolean p0){
       if (p0 == this.b) {
          return;
       }
       this.b = p0;
       int i = (p0)? 1: -1;
       oq3 tt = this.t;
       b c = tt.c;
       tt.c = i + c;
       if (tt.d == null) {
          tt.d = true;
          while (true) {
             i = false;
             b c1 = tt.c;
             if (c != c1) {
                int i1 = (c == null && c1 > null)? 1: 0;
                c = (c > null && c1 == null)? 1: 0;
                if (i1) {
                   tt.h();
                }else if(c){
                   tt.i();
                }
                c = c1;
             }else {
                break ;
             }
          }
          tt.d = i;
       }
       if (this.b != null) {
          tt.d(this);
       }
       return;
    }
    public void c(){
    }
    public boolean d(ek3 p0){
       return false;
    }
    public abstract boolean e();
}
