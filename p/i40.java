package p.i40;
import p.su0;
import java.lang.Object;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import p.co5;
import p.op5;
import p.u07;
import p.go0;
import p.fx5;
import java.util.Optional;
import p.zo4;

public final class i40 implements su0	// class@00191d from classes.dex
{
    public Object a;

    public void i40(int p0){
       if (p0 != 3) {
          super();
          return;
       }else {
          super(TimeUnit.MINUTES);
          return;
       }
    }
    public void i40(TimeUnit p0){
       co5.o(p0, "timeUnit");
       super();
       this.a = new op5(u07.h, p0);
    }
    public void i40(go0 p0){
       super();
       this.a = p0;
    }
    public void i40(su0 p0){
       this.a = p0;
       super();
    }
    public final Object a(Object p0){
       return zo4.l(this.a.a(p0));
    }
}
