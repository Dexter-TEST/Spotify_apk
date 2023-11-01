package p.sl7;
import p.vi5;
import p.tl7;
import java.lang.String;
import io.reactivex.rxjava3.core.Scheduler;
import p.aj5;
import java.lang.Object;
import p.co5;
import p.hi7;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.ti5;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.CharSequence;
import p.a32;
import p.si5;
import p.ri5;

public final class sl7 implements vi5	// class@002653 from classes.dex
{
    private final tl7 a;
    private final String b;
    private final String c;
    private final aj5 d;
    private final Single e;

    public void sl7(tl7 p0,String p1,String p2,Scheduler p3,aj5 p4){
       co5.o(p0, "systemPropertyGetter");
       co5.o(p1, "filename");
       co5.o(p2, "partnerId");
       co5.o(p3, "ioScheduler");
       co5.o(p4, "fileFactory");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p4;
       Single single = Single.fromCallable(new hi7(6, this)).subscribeOn(p3).cache();
       co5.l(single, "fromCallable\(::loadPrelo…heduler\)\n        .cache\(\)");
       this.e = single;
    }
    public static final ti5 b(sl7 p0){
       return p0.c();
    }
    private final ti5 c(){
       int i1;
       this.a.getClass();
       String str = String.class;
       int i = 1;
       try{
          i1 = 0;
          Class uClass = Class.forName("android.os.SystemProperties");
          Class[] uClassArray = new Class[2];
          uClassArray[i1] = str;
          uClassArray[i] = str;
          Object[] objArray = new Object[2];
          objArray[i1] = "ro.preinstall.path";
          objArray[i] = "null";
          str = uClass.getMethod("get", uClassArray).invoke(uClass, objArray);
          co5.j(str, "null cannot be cast to non-null type kotlin.String");
       }catch(java.lang.NoSuchMethodException e0){
          str = "";
       }catch(java.lang.IllegalAccessException e0){
       }catch(java.lang.reflect.InvocationTargetException e0){
       }catch(java.lang.ClassNotFoundException e0){
       }
       if (str.length() <= 0) {
          i = 0;
       }
       if (i && this.d.f(str, this.b).exists()) {
          return new si5(this.c, this.c, i1);
       }else {
          return ri5.a;
       }
    }
    public Single a(){
       return this.e;
    }
}
