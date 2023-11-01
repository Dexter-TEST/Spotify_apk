package p.ob1;
import p.hr0;
import p.vc1;
import p.er7;
import java.lang.Object;
import p.ap0;
import p.ja3;
import java.lang.Runnable;

public final class ob1 implements hr0, vc1	// class@0020e6 from classes.dex
{
    public final int a;
    public final hr0 b;
    public boolean c;
    public final vc1 t;

    public void ob1(er7 p0,ob1 p1){
       this.a = 1;
       super();
       this.c = false;
       this.t = p0;
       this.b = p1;
    }
    public void ob1(hr0 p0,ap0 p1){
       this.a = 0;
       super();
       this.b = p0;
       this.t = p1;
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
             if (this.c == null) {
                this.b.accept(p0);
             }
             break;
           default:
             if (this.c == null) {
                this.t.post(new ja3(this, 16, p0));
             }
             return;
       }
       return;
    }
    public final void dispose(){
       ob1 tt;
       switch (this.a){
           case 0:
             break;
           default:
             this.c = true;
             this.t.dispose();
             return;
       }
       this.c = true;
       if ((tt = this.t) != null) {
          tt.dispose();
       }
       return;
    }
}
