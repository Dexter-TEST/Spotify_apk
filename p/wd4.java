package p.wd4;
import java.lang.Runnable;
import p.ae4;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.c53;
import p.a53;
import p.vc3;
import p.tc3;

public final class wd4 implements Runnable	// class@002b15 from classes.dex
{
    public final int a;
    public final ae4 b;

    public void wd4(ae4 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       ae4 g;
       ae4 f;
       wd4 tb = this.b;
       String str = "this$0";
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(tb, str);
             g = tb.d;
             if ((f = tb.f) != null) {
                g.c(f);
                return;
             }else {
                co5.N("observer");
                throw null;
             }
       }
       try{
          co5.o(tb, str);
          if ((g = tb.g) != null) {
             tb.b = g.p(tb.h, tb.c);
             g = tb.d;
             if ((f = tb.f) != null) {
                g.a(f);
             }else {
                co5.N("observer");
                throw null;
             }
          }
          return;
       }catch(android.os.RemoteException e0){
       }
    }
}
