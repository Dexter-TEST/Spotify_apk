package p.qr2;
import p.i07;
import java.lang.String;
import p.tr2;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import p.co5;
import p.mo1;
import p.as2;
import java.lang.Integer;
import java.util.Set;
import java.io.IOException;

public final class qr2 extends i07	// class@000312 from classes2.dex
{
    public final int e;
    public final tr2 f;
    public final int g;
    public final Object h;

    public void qr2(String p0,tr2 p1,int p2,Object p3,int p4){
       this.e = p4;
       this.f = p1;
       this.g = p2;
       this.h = p3;
       super(p0, true);
    }
    private void b(){
       qr2 th = this.h;
       this.f.C.getClass();
       String str = "requestHeaders";
       try{
          co5.o(th, str);
          this.f.P.g0(this.g, mo1.x);
          qr2 tf = this.f;
          _monitor_enter(tf);
          this.f.R.remove(Integer.valueOf(this.g));
          _monitor_exit(tf);
          return;
       }catch(java.io.IOException e0){
       }
    }
    public final long a(){
       qr2 tf;
       switch (this.e){
           case 0:
           case 1:
             tf = this.f;
             try{
                qr2 th = this.h;
                tf.getClass();
                co5.o(th, "statusCode");
                tf.P.g0(this.g, th);
             }catch(java.io.IOException e3){
                tf.f(e3);
             }
             return -1;
             break;
           default:
             this.b();
             return -1;
       }
       this.f.C.getClass();
       co5.o(this.h, "errorCode");
       tf = this.f;
       _monitor_enter(tf);
       this.f.R.remove(Integer.valueOf(this.g));
       _monitor_exit(tf);
       return -1;
    }
}
