package p.hf2;
import p.bo2;
import p.v26;
import p.ej7;
import androidx.fragment.app.Fragment;
import p.dj7;
import java.lang.Object;
import p.kj3;
import p.fk3;
import p.ek3;
import p.u26;
import p.ir2;
import p.ry7;
import p.i01;
import android.content.Context;
import android.content.ContextWrapper;
import android.app.Application;
import p.me4;
import p.gg1;
import java.util.Map;
import android.os.Bundle;
import p.vj3;
import p.t26;

public final class hf2 implements bo2, v26, ej7	// class@00183d from classes.dex
{
    public final Fragment a;
    public final dj7 b;
    public fk3 c;
    public u26 t;

    public void hf2(Fragment p0,dj7 p1){
       super();
       this.c = null;
       this.t = null;
       this.a = p0;
       this.b = p1;
    }
    public final void b(kj3 p0){
       this.c.f(p0);
    }
    public final void c(){
       if (this.c == null) {
          this.c = new fk3(this);
          u26 ou26 = ir2.p(this);
          this.t = ou26;
          ou26.a();
          ry7.o(this);
       }
       return;
    }
    public final i01 getDefaultViewModelCreationExtras(){
       me4 ome4;
       hf2 ta = this.a;
       Context applicationC = ta.requireContext().getApplicationContext();
       while (true) {
          if (applicationC instanceof ContextWrapper) {
             if (applicationC instanceof Application) {
             label_001d :
                ome4 = new me4(0);
                i01 a = ome4.a;
                if (applicationC != null) {
                   a.put(gg1.B, applicationC);
                }
                a.put(ry7.I, this);
                a.put(ry7.J, this);
                if (ta.getArguments() != null) {
                   a.put(ry7.K, ta.getArguments());
                   break ;
                }
                break ;
             }else {
                applicationC = applicationC.getBaseContext();
             }
          }else {
             applicationC = null;
             goto label_001d ;
          }
       }
       return ome4;
    }
    public final vj3 getLifecycle(){
       this.c();
       return this.c;
    }
    public final t26 getSavedStateRegistry(){
       this.c();
       return this.t.b;
    }
    public final dj7 getViewModelStore(){
       this.c();
       return this.b;
    }
}
