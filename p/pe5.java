package p.pe5;
import p.se5;
import android.os.Build$VERSION;
import java.util.concurrent.Executor;
import p.mt7;
import java.lang.Class;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class pe5 extends se5	// class@0002fa from classes2.dex
{

    public void pe5(){
       boolean b = (Build$VERSION.SDK_INT >= 24)? true: false;
       super(b);
       return;
    }
    public final Executor a(){
       return new mt7(3);
    }
    public final Object b(Class p0,Object p1,Method p2,Object[] p3){
       if (Build$VERSION.SDK_INT >= 26) {
          return super.b(p0, p1, p2, p3);
       }
       throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }
}
