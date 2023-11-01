package p.vi3;
import p.um5;
import java.lang.Object;

public final class vi3 implements um5	// class@0029fe from classes.dex
{
    public Object a;
    public um5 b;
    public static final Object c;

    static {
       vi3.c = new Object();
    }
    public void vi3(um5 p0){
       super();
       this.a = vi3.c;
       this.b = p0;
    }
    public final Object get(){
       vi3 ta = this.a;
       Object c = vi3.c;
       if (ta == c) {
          _monitor_enter(this);
          if ((ta = this.a) == c) {
             ta = this.b.get();
             this.a = ta;
             this.b = null;
          }
          _monitor_exit(this);
       }
       return ta;
    }
}
