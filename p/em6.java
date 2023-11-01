package p.em6;
import p.r15;
import p.n25;
import p.f25;
import p.hm6;
import java.lang.Object;
import p.j07;
import java.lang.String;
import p.co5;
import p.im6;
import p.ab3;
import java.lang.Exception;
import p.uv5;
import java.lang.Boolean;
import p.an5;
import p.ve;
import com.google.android.gms.common.api.Status;
import p.kb;
import java.lang.Class;
import p.xk2;
import java.lang.Throwable;
import p.jl;
import java.lang.Void;

public final class em6 implements r15, n25, f25	// class@0014b8 from classes.dex
{
    public final hm6 a;

    public void em6(hm6 p0){
       this.a = p0;
       super();
    }
    public void a(j07 p0){
       hm6 c;
       co5.o(p0, "it");
       em6 ta = this.a;
       if (p0.f()) {
          if ((c = ta.c) != null) {
             c.a.d("delete", "succeeded");
          }
       }else if((c = ta.c) != null){
          c.a.d("delete", "failed");
       }
       return;
    }
    public void c(Exception p0){
       hm6 c;
       co5.o(p0, "exception");
       em6 ta = this.a;
       if (!p0 instanceof uv5) {
          if ((c = ta.c) != null) {
             c.a.d("save", "failed");
          }
          ta.d.onNext(Boolean.FALSE);
          return;
       }else {
          ve ove = p0;
          if (ove.a.b != 6) {
             hm6.a(ta, ove);
             return;
          }else {
             kb okb = new kb(ta, 5, p0);
             ta.getClass();
             try{
                kb okb1 = new kb(ta, okb);
                ta.b.a(okb1);
             }catch(android.view.WindowManager$BadTokenException e5){
                jl.q("Failed to show smartlock nudge dialog as Activity is dead", e5);
                okb.invoke();
             }
             return;
          }
       }
    }
    public void onSuccess(Object p0){
       hm6 c;
       p0 = this.a;
       if ((c = p0.c) != null) {
          c.a.d("save", "succeeded");
       }
       p0.d.onNext(Boolean.TRUE);
       return;
    }
}
