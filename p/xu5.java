package p.xu5;
import java.lang.String;
import p.b7;
import p.xq7;
import p.fy0;
import java.lang.Object;
import p.ru5;
import p.t63;
import android.util.Log;
import p.d01;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.Throwable;

public final class xu5	// class@002cee from classes.dex
{
    public final d01 a;
    public final String b;
    public final String c;
    public final int d;
    public final b7 e;
    public final fy0 f;
    public Thread g;
    public static final short[] h;

    static {
       xu5.h = new short[6]{10,20,30,'<','x',300};
    }
    public void xu5(String p0,String p1,int p2,b7 p3,xq7 p4,fy0 p5){
       super();
       this.a = p4;
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p5;
    }
    public final boolean a(ru5 p0,boolean p1){
       boolean b;
       String str = "FirebaseCrashlytics";
       try{
          t63 ot63 = new t63(this.b, this.c, p0, 6);
          xu5 td = this.d;
          b = true;
          if (td == 3) {
             Log.isLoggable(str, 3);
          }else if(td == 2 && p0.b() == b){
             Log.isLoggable(str, 3);
          }else {
             p1 = this.a.b(ot63, p1);
             p0.d();
          label_002d :
             if (i) {
                this.e.getClass();
                p0.remove();
             label_004b :
                return b;
             }
          }
          int i = 1;
          goto label_002d ;
       }catch(java.lang.Exception e8){
          Log.e(str, "Error occurred sending report "+p0, e8);
       }
       b = false;
       goto label_004b ;
    }
}
