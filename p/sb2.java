package p.sb2;
import p.jr0;
import java.lang.Object;
import p.tb2;
import p.si4;
import p.ub2;
import java.lang.String;
import p.wh6;
import java.util.ArrayList;

public final class sb2 implements jr0	// class@0025f5 from classes.dex
{
    public final int a;
    public final Object b;

    public void sb2(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(tb2 p0){
       ArrayList orDefault;
       switch (this.a){
           case 0:
             if (p0 == null) {
                p0 = new tb2(-3);
             }
             break;
           default:
             Object c = ub2.c;
             _monitor_enter(c);
             wh6 d = ub2.d;
             if ((orDefault = d.getOrDefault(this.b, null)) == null) {
                _monitor_exit(c);
             }else {
                d.remove(this.b);
                _monitor_exit(c);
                for (int i = 0; i < orDefault.size(); i = i + 1) {
                   orDefault.get(i).accept(p0);
                }
             }
             return;
       }
       this.b.d(p0);
       return;
    }
    public final void accept(Object p0){
       switch (this.a){
           case 0:
           default:
             this.a(p0);
             return;
       }
       this.a(p0);
       return;
    }
}
