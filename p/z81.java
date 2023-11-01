package p.z81;
import p.dn6;
import p.y81;
import java.lang.Object;
import javax.net.ssl.SSLSocket;
import java.lang.String;
import java.util.List;
import p.co5;

public final class z81 implements dn6	// class@0003ee from classes2.dex
{
    public final y81 a;
    public dn6 b;

    public void z81(y81 p0){
       this.a = p0;
    }
    public final String a(SSLSocket p0){
       _monitor_enter(this);
       if (this.b == null && this.a.b(p0)) {
          this.b = this.a.g(p0);
       }
       z81 tb = this.b;
       _monitor_exit(this);
       String str = (tb == null)? null: tb.a(p0);
       return str;
    }
    public final boolean b(SSLSocket p0){
       return this.a.b(p0);
    }
    public final boolean c(){
       return true;
    }
    public final void d(SSLSocket p0,String p1,List p2){
       co5.o(p2, "protocols");
       _monitor_enter(this);
       if (this.b == null && this.a.b(p0)) {
          this.b = this.a.g(p0);
       }
       z81 tb = this.b;
       _monitor_exit(this);
       if (tb != null) {
          tb.d(p0, p1, p2);
       }
       return;
    }
}
