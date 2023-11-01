package p.y16;
import java.util.Iterator;
import p.z16;
import p.w16;
import p.v16;
import java.lang.Object;

public abstract class y16 extends z16 implements Iterator	// class@002d2f from classes.dex
{
    public w16 a;
    public w16 b;

    public void y16(w16 p0,w16 p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final void a(w16 p0){
       w16 ow16;
       y16 ta;
       if (this.a == p0 && p0 == this.b) {
          ow16 = null;
          this.b = ow16;
          this.a = ow16;
       }
       if ((ta = this.a) == p0) {
          switch (this.c){
              case 0:
                ow16 = ta.t;
                break;
              default:
                ow16 = ta.c;
          }
          this.a = ow16;
       }
       if (this.b == p0) {
          this.b = this.b();
       }
       return;
    }
    public final w16 b(){
       w16 c;
       y16 tb = this.b;
       y16 ta = this.a;
       if (tb == ta || ta == null) {
          return null;
       }
       switch (this.c){
           case 0:
             c = tb.c;
             break;
           default:
             c = tb.t;
       }
       return c;
    }
    public final boolean hasNext(){
       boolean b = (this.b != null)? true: false;
       return b;
    }
    public final Object next(){
       y16 tb = this.b;
       this.b = this.b();
       return tb;
    }
}
