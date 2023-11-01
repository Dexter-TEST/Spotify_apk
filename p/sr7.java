package p.sr7;
import java.lang.String;
import p.es3;
import java.lang.Object;
import android.content.Context;
import androidx.work.WorkerParameters;
import p.fm3;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.Throwable;
import java.lang.reflect.Constructor;
import java.lang.IllegalStateException;

public final class sr7	// class@002688 from classes.dex
{
    public static final String a;

    static {
       sr7.a = es3.d("WorkerFactory");
    }
    public void sr7(){
       super();
    }
    public static fm3 a(Context p0,String p1,WorkerParameters p2){
       fm3 uofm3 = null;
       Class uClass = Class.forName(p1).asSubclass(fm3.class);
       if (uClass != null) {
          Class[] uClassArray = new Class[]{Context.class,WorkerParameters.class};
          Object[] objArray = new Object[]{p0,p2};
          uofm3 = uClass.getDeclaredConstructor(uClassArray).newInstance(objArray);
       }
       if (uofm3 != null && uofm3.t != null) {
          throw new IllegalStateException("WorkerFactory \("+sr7.class.getName()+"\) returned an instance of a ListenableWorker \("+p1+"\) which has already been invoked. createWorker\(\) must always return a new instance of a ListenableWorker.");
       }else {
          return uofm3;
       }
    }
}
