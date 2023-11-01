package p.b21;
import p.ao2;
import android.app.Application;
import com.spotify.lite.app.LiteApplication;
import p.a51;
import java.lang.Class;
import java.lang.Object;
import p.p31;
import p.v84;
import p.fv1;
import java.lang.IllegalStateException;
import java.lang.String;
import p.sc;

public abstract class b21 extends Application implements ao2	// class@00103a from classes.dex
{
    public nc1 a;

    public void b21(){
       super();
    }
    public final void a(){
       if (this.a == null) {
          _monitor_enter(this);
          if (this.a == null) {
             LiteApplication.N.getClass();
             p31 v0 = new p31(new v84(9), new fv1(), new fv1(), new fv1(), this);
             v0.a(this);
             if (this.a == null) {
                throw new IllegalStateException("The AndroidInjector returned from applicationInjector\(\) did not inject the DaggerApplication");
             }
          }
          _monitor_exit(this);
       }
       return;
    }
    public final sc d(){
       this.a();
       return this.a;
    }
    public void onCreate(){
       super.onCreate();
       this.a();
    }
}
