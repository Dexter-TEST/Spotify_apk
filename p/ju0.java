package p.ju0;
import p.hu0;
import p.fu0;
import java.lang.Object;
import java.lang.String;
import p.xo0;
import p.sb4;
import java.lang.Class;
import p.nb1;
import p.ku0;
import p.hr0;
import p.ap0;
import p.iu0;

public final class ju0 extends hu0	// class@001b45 from classes.dex
{
    public final fu0 b;
    public Object c;

    public void ju0(fu0 p0,Object p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final String a(){
       return "init";
    }
    public final void b(xo0 p0){
       ju0 tc = this.c;
       ju0 tb = this.b;
       tb.getClass();
       ap0 uoap0 = new nb1(p0).d(new ku0(2, tb));
       _monitor_enter(tb);
       if (tc == null) {
          tc = tb.b;
       }
       tb.e = new iu0(tb, uoap0, tc);
       _monitor_exit(tb);
       return;
    }
    public final Object e(){
       return this.c;
    }
    public final void f(Object p0){
       this.c = p0;
    }
}
