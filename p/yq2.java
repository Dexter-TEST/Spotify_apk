package p.yq2;
import p.nn6;
import p.er2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.yc2;
import p.b57;
import java.lang.IllegalStateException;
import java.lang.Integer;
import p.e70;
import p.np5;

public abstract class yq2 implements nn6	// class@0003e2 from classes2.dex
{
    public final yc2 a;
    public boolean b;
    public final er2 c;

    public void yq2(er2 p0){
       co5.o(p0, "this$0");
       this.c = p0;
       super();
       this.a = new yc2(p0.c.e());
    }
    public final void b(){
       yq2 tc = this.c;
       er2 e = tc.e;
       int i = 6;
       if (e == i) {
          return;
       }
       if (e != 5) {
          throw new IllegalStateException(co5.K(Integer.valueOf(tc.e), "state: "));
       }
       yq2 ta = this.a;
       yc2 e1 = ta.e;
       ta.e = b57.d;
       e1.a();
       e1.b();
       tc.e = i;
       return;
    }
    public final b57 e(){
       return this.a;
    }
    public long o(e70 p0,long p1){
       yq2 tc = this.c;
       String str = "sink";
       try{
          co5.o(p0, str);
          return tc.c.o(p0, p1);
       }catch(java.io.IOException e3){
          tc.b.l();
          this.b();
          throw e3;
       }
    }
}
