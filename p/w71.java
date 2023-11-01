package p.w71;
import p.vi5;
import p.yi2;
import p.ui5;
import p.fm5;
import java.lang.String;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import p.co5;
import p.hi7;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.Single;
import p.ti5;
import p.zf2;
import p.si5;
import p.hm5;
import java.lang.Class;
import java.util.Properties;
import p.x32;
import p.aj5;
import java.io.Reader;
import java.lang.Throwable;
import com.spotify.base.java.logging.Logger;
import p.av6;
import p.ri5;
import p.l06;
import p.v71;
import p.yi5;
import java.lang.System;
import java.lang.CharSequence;

public class w71 implements vi5	// class@002adc from classes.dex
{
    private final yi2 a;
    private final ui5 b;
    private final fm5 c;
    private final String d;
    private final String e;
    private final Single f;

    public void w71(yi2 p0,ui5 p1,fm5 p2,String p3,String p4,Scheduler p5){
       co5.o(p0, "getPropExecutor");
       co5.o(p1, "preloadFileUtil");
       co5.o(p2, "propertyExtractor");
       co5.o(p3, "propKeyReferrer");
       co5.o(p4, "propKeyPartner");
       co5.o(p5, "ioScheduler");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       Single single = Single.fromCallable(new hi7(5, this)).subscribeOn(p5).cache();
       co5.l(single, "fromCallable\(::loadPrelo…ler\)\n            .cache\(\)");
       this.f = single;
    }
    public static final yi2 b(w71 p0){
       return p0.a;
    }
    public static final fm5 c(w71 p0){
       return p0.c;
    }
    public static final ti5 d(w71 p0){
       return p0.f();
    }
    public static final Object e(w71 p0,String p1,zf2 p2){
       return p0.j(p1, p2);
    }
    private final ti5 f(){
       si5 osi5;
       if ((osi5 = this.i(this.d, this.e)) != null) {
       }else if((osi5 = this.h(this.d, this.e)) != null){
          osi5 = this.g();
       }
       return osi5;
    }
    private final ti5 g(){
       int i1;
       String str1;
       si5 osi5;
       Object[] objArray;
       w71 tb = this.b;
       tb.getClass();
       Properties properties = new Properties();
       String str = tb.a();
       try{
          int i = 1;
          x32 ox32 = tb.a.c(str);
          properties.load(ox32);
          if (ox32 != null) {
             try{
                ox32.close();
             label_0026 :
                i1 = 1;
             }catch(java.io.FileNotFoundException e0){
                objArray = 1;
                i1 = 0;
             }catch(java.io.IOException e0){
                i1 = 1;
             }
             objArray = new Object[0];
             Logger.c(e0, "", objArray);
          }else {
             goto label_0026 ;
          }
       }catch(java.io.FileNotFoundException e0){
       }catch(java.io.IOException e0){
          i1 = 0;
       }
    }
    private final si5 h(String p0,String p1){
       return this.j(this.a.a(p1), new v71(this, p0, 0));
    }
    private final si5 i(String p0,String p1){
       this.c.getClass();
       return this.j(System.getProperty(p1), new v71(this, p0, 1));
    }
    private final Object j(String p0,zf2 p1){
       Object obj = null;
       if (p0 != null) {
          int i = (p0.length() > 0)? 1: 0;
          if (!i) {
             p0 = obj;
          }
          if (p0 != null) {
             obj = p1.invoke(p0);
          }
       }
       return obj;
    }
    public Single a(){
       return this.f;
    }
}
