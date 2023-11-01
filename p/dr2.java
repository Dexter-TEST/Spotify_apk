package p.dr2;
import p.yq2;
import p.er2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e70;
import java.lang.IllegalStateException;
import java.lang.Long;
import java.lang.IllegalArgumentException;

public final class dr2 extends yq2	// class@0001c2 from classes2.dex
{
    public boolean t;

    public void dr2(er2 p0){
       co5.o(p0, "this$0");
       super(p0);
    }
    public final void close(){
       if (this.b != null) {
          return;
       }
       if (this.t == null) {
          this.b();
       }
       this.b = true;
       return;
    }
    public final long o(e70 p0,long p1){
       co5.o(p0, "sink");
       int i = ((p1) >= 0)? 1: 0;
       if (i) {
          if ((this.b ^ 1)) {
             if (this.t != null) {
                return -1;
             }else {
                long l = super.o(p0, p1);
                if (!(l - -1)) {
                   this.t = true;
                   this.b();
                   return -1;
                }else {
                   return l;
                }
             }
          }else {
             throw new IllegalStateException("closed".toString());
          }
       }else {
          throw new IllegalArgumentException(co5.K(Long.valueOf(p1), "byteCount < 0: ").toString());
       }
    }
}
