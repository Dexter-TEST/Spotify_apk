package p.te2;
import p.ye2;
import p.ff2;
import java.lang.Class;
import java.lang.reflect.Constructor;
import java.lang.Object;
import p.af2;
import java.util.ArrayList;
import android.view.View;

public abstract class te2	// class@002753 from classes.dex
{
    public static final ye2 a;
    public static final af2 b;

    static {
       af2 uoaf2;
       ye2 oye2 = new ye2();
       try{
          te2.a = oye2;
          Class[] uClassArray = new Class[0];
          Object[] objArray = new Object[0];
          uoaf2 = ff2.class.getDeclaredConstructor(uClassArray).newInstance(objArray);
       }catch(java.lang.Exception e0){
          uoaf2 = null;
       }
       te2.b = uoaf2;
    }
    public static void a(ArrayList p0,int p1){
       if (p0 == null) {
          return;
       }
       for (int i = p0.size() - 1; i >= 0; i = i - 1) {
          p0.get(i).setVisibility(p1);
       }
       return;
    }
}
