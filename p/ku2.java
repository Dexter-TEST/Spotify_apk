package p.ku2;
import p.ju2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.au2;
import p.p33;
import p.iu2;
import p.k23;
import java.lang.Class;
import p.h23;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import java.util.Map;
import p.fu2;
import p.hu2;
import p.tu2;

public abstract class ku2 implements ju2	// class@001c84 from classes.dex
{
    public final Object a;

    public void ku2(ju2 p0){
       co5.o(p0, "inner");
       super();
       this.a = p0;
    }
    public final au2 C(){
       return this.a.C();
    }
    public final p33 D(){
       return this.a.D();
    }
    public final iu2 a(){
       k23.c.getClass();
       return h23.b(this).a();
    }
    public final au2 b(){
       return this.a.b();
    }
    public final String c(){
       return this.a.c();
    }
    public final au2 d(){
       return this.a.d();
    }
    public final List e(String p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = this.j().iterator();
       while (iterator.hasNext()) {
          Object obj = iterator.next();
          if (co5.c(obj.group(), p0)) {
             uArrayList.add(obj);
          }
       }
       return uArrayList;
    }
    public final String group(){
       return this.a.group();
    }
    public abstract List j();
    public final Map m(){
       return this.a.m();
    }
    public final fu2 q(){
       return this.a.q();
    }
    public final hu2 u(){
       return this.a.u();
    }
    public final tu2 y(){
       return this.a.y();
    }
}
