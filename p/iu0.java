package p.iu0;
import p.hu0;
import p.fu0;
import p.ap0;
import java.lang.Object;
import java.lang.String;
import p.sb4;
import p.ju0;
import p.lu0;
import p.ob4;
import p.j93;
import p.ku0;
import p.hr0;
import p.rb4;

public final class iu0 extends hu0	// class@001a03 from classes.dex
{
    public final fu0 b;
    public final ap0 c;
    public Object d;

    public void iu0(fu0 p0,ap0 p1,Object p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final String a(){
       return "created";
    }
    public final void c(){
       this.c.dispose();
       iu0 tb = this.b;
       _monitor_enter(tb);
       tb.e = new ju0(tb, this.d);
       _monitor_exit(tb);
    }
    public final Object e(){
       return this.d;
    }
    public final void f(Object p0){
       this.d = p0;
    }
    public final void g(){
       iu0 tb = this.b;
       _monitor_enter(tb);
       lu0 v7 = new lu0(tb, this.c, tb.a, this.d, tb.c);
       tb.e = v7;
       v7.d.b(new ku0(0, v7));
       _monitor_exit(tb);
    }
}
