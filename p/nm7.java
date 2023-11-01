package p.nm7;
import p.om2;
import java.lang.String;
import p.om7;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import p.xm2;
import p.co5;
import p.oz1;
import p.oy1;
import org.json.JSONObject;
import p.ny1;
import java.lang.Exception;

public final class nm7 implements om2	// class@00200b from classes.dex
{
    public final String[] a;
    public final int b;
    public final om7 c;
    public final CountDownLatch d;

    public void nm7(String[] p0,int p1,om7 p2,CountDownLatch p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void a(xm2 p0){
       String str2;
       String str3;
       nm7 tb = this.b;
       nm7 ta = this.a;
       co5.o(ta, "$results");
       co5.o(this.c, "this$0");
       nm7 td = this.d;
       String str = "$latch";
       try{
          co5.o(td, str);
          xm2 c = p0.c;
          String str1 = "Error staging photo.";
          if (c != null) {
             if ((str2 = c.a()) != null) {
                str1 = str2;
             }
             throw new oy1(p0, str1);
          }else if((p0 = p0.b) != null){
             if ((str3 = p0.optString("uri")) != null) {
                ta[tb] = str3;
             }else {
                throw new ny1(str1);
             }
          }else {
             throw new ny1(str1);
          }
       }catch(java.lang.Exception e7){
          this.c.d[tb] = e7;
       }
       td.countDown();
       return;
    }
}
