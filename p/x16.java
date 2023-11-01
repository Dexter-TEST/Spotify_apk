package p.x16;
import java.util.Iterator;
import p.z16;
import p.a26;
import p.w16;
import java.lang.Object;

public final class x16 extends z16 implements Iterator	// class@002bed from classes.dex
{
    public w16 a;
    public boolean b;
    public final a26 c;

    public void x16(a26 p0){
       this.c = p0;
       super();
       this.b = true;
    }
    public final void a(w16 p0){
       x16 ta = this.a;
       if (p0 == ta) {
          p0 = ta.t;
          this.a = p0;
          boolean b = (p0 == null)? true: false;
          this.b = b;
       }
       return;
    }
    public final boolean hasNext(){
       x16 ta;
       boolean b = true;
       if (this.b != null) {
          if (this.c.a == null) {
             b = false;
          }
          return b;
       }else if((ta = this.a) != null && ta.c != null){
          b = false;
       }
       return b;
    }
    public final Object next(){
       x16 ta;
       w16 c;
       if (this.b != null) {
          this.b = false;
          this.a = this.c.a;
       }else if((ta = this.a) != null){
          c = ta.c;
       }else {
          c = null;
       }
       this.a = c;
       return this.a;
    }
}
