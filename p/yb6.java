package p.yb6;
import p.vn;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.util.ArrayList;
import p.ki;
import java.util.List;

public final class yb6	// class@002d88 from classes.dex
{
    public final vn a;
    public final String b;
    public ArrayList c;
    public final ArrayList d;
    public int e;

    public void yb6(vn p0,String p1){
       co5.o(p1, "anonymousAppDeviceGUID");
       super();
       this.a = p0;
       this.b = p1;
       this.c = new ArrayList();
       this.d = new ArrayList();
    }
    public synchronized final void a(ki p0){
       co5.o(p0, "event");
       if (((this.c.size() + this.d.size())) >= 1000) {
          this.e = this.e + 1;
       }else {
          this.c.add(p0);
       }
       return;
    }
    public synchronized final int b(){
       return this.c.size();
    }
    public synchronized final List c(){
       yb6 tc = this.c;
       this.c = new ArrayList();
       return tc;
    }
}
