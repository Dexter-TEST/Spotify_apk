package p.e90;
import p.nn6;
import p.g70;
import p.y80;
import p.gp5;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import p.we7;
import p.b57;
import p.e70;
import java.lang.String;
import p.co5;
import p.el6;
import p.f70;

public final class e90 implements nn6	// class@0001cf from classes2.dex
{
    public boolean a;
    public final g70 b;
    public final g90 c;
    public final f70 t;

    public void e90(g70 p0,y80 p1,gp5 p2){
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final void close(){
       if (this.a == null && !we7.h(this, TimeUnit.MILLISECONDS)) {
          this.a = true;
          this.c.a();
       }
       this.b.close();
       return;
    }
    public final b57 e(){
       return this.b.e();
    }
    public final long o(e70 p0,long p1){
       int i;
       co5.o(p0, "sink");
       try{
          i = 1;
          p1 = this.b.o(p0, p1);
          e90 tt = this.t;
          if (!(p1 - -1)) {
             if (this.a == null) {
                this.a = i;
                tt.close();
             }
             return -1;
          }else {
             p0.g0((p0.b - p1), p1, tt.c());
             tt.K();
             return p1;
          }
       }catch(java.io.IOException e10){
          if (this.a == null) {
             this.a = i;
             this.c.a();
          }
          throw e10;
       }
    }
}
