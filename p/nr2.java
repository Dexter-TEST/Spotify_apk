package p.nr2;
import p.wf2;
import p.tr2;
import p.wr2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.mo1;
import java.io.IOException;
import java.io.Closeable;
import p.we7;
import p.jc7;

public final class nr2 implements wf2	// class@0002d5 from classes2.dex
{
    public final wr2 a;
    public final tr2 b;

    public void nr2(tr2 p0,wr2 p1){
       co5.o(p0, "this$0");
       this.b = p0;
       super();
       this.a = p1;
    }
    public final Object invoke(){
       nr2 tb = this.b;
       nr2 ta = this.a;
       IOException iOException = null;
       try{
          ta.f(this);
          do {
          } while (ta.b(false, this));
          mo1 b = mo1.b;
          try{
             tb.b(b, mo1.x, iOException);
          label_0027 :
             we7.d(ta);
             return jc7.a;
          }catch(java.io.IOException e3){
          }
          tb.b(mo1.c, mo1.c, e3);
          goto label_0027 ;
       }catch(java.io.IOException e3){
          int i = mo1.t;
       }
    }
}
