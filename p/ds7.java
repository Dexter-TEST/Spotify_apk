package p.ds7;
import p.se5;
import java.lang.Object;
import java.util.ArrayList;
import p.cy5;
import java.util.List;
import p.qu0;
import p.u90;
import java.lang.String;
import java.util.Objects;
import p.os2;
import p.ps2;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import p.r90;
import p.g15;
import java.util.concurrent.Executor;
import java.util.Collection;
import java.lang.Class;
import p.q61;
import p.yk0;
import java.util.Arrays;
import java.util.Collections;
import p.k70;
import p.s45;
import java.lang.IllegalStateException;

public class ds7	// class@0013ac from classes.dex
{
    public boolean a;
    public Serializable b;
    public Object c;
    public Object d;
    public Object e;
    public Serializable f;
    public final Object g;

    public void ds7(){
       super();
       this.b = new ArrayList();
       this.f = new ArrayList();
       this.c = se5.c;
    }
    public void ds7(cy5 p0){
       super();
       this.b = new ArrayList();
       this.f = new ArrayList();
       this.c = se5.c;
       this.d = p0.b;
       this.e = p0.c;
       cy5 d = p0.d;
       int i = d.size() - this.c.a;
       int i1 = 1;
       for (int i2 = 1; i2 < i; i2 = i2 + 1) {
          this.b.add(d.get(i2));
       }
       d = p0.e;
       i = d.size();
       if (this.c.a != null) {
          i1 = 2;
       }
       i = i - i1;
       for (i1 = 0; i1 < i; i1 = i1 + 1) {
          this.f.add(d.get(i1));
       }
       this.g = p0.f;
       this.a = p0.g;
       return;
    }
    public final void a(u90 p0){
       Objects.requireNonNull(p0, "factory == null");
       this.f.add(p0);
    }
    public final void b(qu0 p0){
       Objects.requireNonNull(p0, "factory == null");
       this.b.add(p0);
    }
    public final void c(String p0){
       Objects.requireNonNull(p0, "baseUrl == null");
       os2 oos2 = new os2();
       oos2.f(null, p0);
       this.d(oos2.b());
    }
    public final void d(ps2 p0){
       ps2 f;
       Objects.requireNonNull(p0, "baseUrl == null");
       if (!(f = p0.f)) {
          throw new IllegalArgumentException("baseUrl must end in /: "+p0);
       }
       this.e = p0;
       return;
    }
    public final cy5 e(){
       ds7 td;
       Executor uExecutor;
       List list;
       if (this.e == null) {
          throw new IllegalStateException("Base URL required.");
       }
       if ((td = this.d) == null) {
          td = new g15();
       }
       ds7 uods7 = td;
       if ((td = this.g) == null) {
          uExecutor = this.c.a();
       }
       ds7 uods71 = uExecutor;
       ArrayList uArrayList = new ArrayList(this.f);
       ds7 tc = this.c;
       tc.getClass();
       q61 oq61 = new q61(uods71);
       int i = 1;
       if (tc.a != null) {
          u90[] ou90Array = new u90[]{yk0.a,oq61};
          list = Arrays.asList(ou90Array);
       }else {
          list = Collections.singletonList(oq61);
       }
       uArrayList.addAll(list);
       ArrayList uArrayList1 = new ArrayList(((this.b.size() + i) + this.c.a));
       uArrayList1.add(new k70());
       uArrayList1.addAll(this.b);
       List list1 = (this.c.a != null)? Collections.singletonList(s45.a): Collections.emptyList();
       uArrayList1.addAll(list1);
       cy5 v8 = new cy5(uods7, this.e, Collections.unmodifiableList(uArrayList1), Collections.unmodifiableList(uArrayList), uods71, this.a);
       return v8;
    }
}
