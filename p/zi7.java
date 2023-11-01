package p.zi7;
import p.bj7;
import android.app.Application;
import java.lang.Class;
import p.vi7;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import p.me4;
import p.gg1;
import p.i01;
import java.lang.Object;
import java.util.LinkedHashMap;
import p.od;
import java.lang.IllegalArgumentException;
import java.lang.reflect.Constructor;
import p.co5;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class zi7 extends bj7	// class@002f05 from classes.dex
{
    public final Application b;
    public static zi7 c;

    public void zi7(Application p0){
       super();
       this.b = p0;
    }
    public final vi7 a(Class p0){
       zi7 tb;
       if ((tb = this.b) != null) {
          return this.c(p0, tb);
       }
       throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create\(modelClass: Class<T>, extras: CreationExtras\).");
    }
    public final vi7 b(Class p0,me4 p1){
       vi7 ovi7;
       Application uApplication;
       if (this.b != null) {
          ovi7 = this.a(p0);
       }else if((uApplication = p1.a.get(gg1.B)) != null){
          ovi7 = this.c(p0, uApplication);
       }else if(!od.class.isAssignableFrom(p0)){
          ovi7 = super.a(p0);
       }else {
          throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
       }
       return ovi7;
    }
    public final vi7 c(Class p0,Application p1){
       vi7 ovi7;
       if (od.class.isAssignableFrom(p0)) {
          int i = 1;
          try{
             Class[] uClassArray = new Class[i];
             uClassArray[0] = Application.class;
             Object[] objArray = new Object[i];
             objArray[0] = p1;
             ovi7 = p0.getConstructor(uClassArray).newInstance(objArray);
             co5.l(ovi7, "{\n                try {\n…          }\n            }");
          }catch(java.lang.NoSuchMethodException e7){
             throw new RuntimeException("Cannot create an instance of "+"{\n                try {\n…          }\n            }", e7);
          }catch(java.lang.IllegalAccessException e7){
             throw new RuntimeException("Cannot create an instance of "+"{\n                try {\n…          }\n            }", e7);
          }catch(java.lang.InstantiationException e7){
             throw new RuntimeException("Cannot create an instance of "+"{\n                try {\n…          }\n            }", e7);
          }catch(java.lang.reflect.InvocationTargetException e7){
             throw new RuntimeException("Cannot create an instance of "+"{\n                try {\n…          }\n            }", e7);
          }
       }else {
          ovi7 = super.a(p0);
       }
       return ovi7;
    }
}
