package p.vi7;
import java.lang.Object;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.Closeable;
import java.lang.RuntimeException;
import java.lang.Throwable;
import androidx.lifecycle.SavedStateHandleController;

public abstract class vi7	// class@002a02 from classes.dex
{
    public final HashMap a;
    public final LinkedHashSet b;
    public boolean c;

    public void vi7(){
       super();
       this.a = new HashMap();
       this.b = new LinkedHashSet();
       this.c = false;
    }
    public static void a(Object p0){
       if (p0 instanceof Closeable) {
          try{
             p0.close();
          }catch(java.io.IOException e1){
             throw new RuntimeException(e1);
          }
       }
       return;
    }
    public void b(){
    }
    public final void c(SavedStateHandleController p0){
       Object obj;
       String str = "androidx.lifecycle.savedstate.vm.tag";
       vi7 ta = this.a;
       _monitor_enter(ta);
       if ((obj = this.a.get(str)) == null) {
          this.a.put(str, p0);
       }
       _monitor_exit(ta);
       if (obj != null) {
          p0 = obj;
       }
       if (this.c != null) {
          vi7.a(p0);
       }
       return;
    }
}
