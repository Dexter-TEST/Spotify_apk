package p.di4;
import p.eq0;
import java.lang.String;
import p.es3;
import java.lang.Object;
import p.co5;
import p.tq0;
import p.jr7;
import p.zq0;
import p.ji4;
import android.os.Build$VERSION;
import java.lang.Class;

public final class di4 extends eq0	// class@001352 from classes.dex
{

    static {
       co5.l(es3.d("NetworkNotRoamingCtrlr"), "tagWithPrefix\(\"NetworkNotRoamingCtrlr\"\)");
    }
    public void di4(tq0 p0){
       co5.o(p0, "tracker");
       super(p0);
    }
    public final boolean a(jr7 p0){
       co5.o(p0, "workSpec");
       boolean b = (p0.j.a == 4)? true: false;
       return b;
    }
    public final boolean b(Object p0){
       boolean b;
       co5.o(p0, "value");
       ji4 a = p0.a;
       if (Build$VERSION.SDK_INT < 24) {
          es3.c().getClass();
          if (a == null) {
             b = true;
          label_0023 :
             return b;
          }
       }else if(a != null && p0.d != null){
       }
       b = false;
       goto label_0023 ;
    }
}
