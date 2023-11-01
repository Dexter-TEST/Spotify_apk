package p.jt2;
import java.util.AbstractList;
import p.uu2;
import java.util.List;
import java.util.Collections;
import p.l33;
import p.it2;
import p.ne2;
import java.lang.Object;
import p.e33;
import p.ju2;
import java.lang.Class;
import p.m33;

public final class jt2 extends AbstractList	// class@001b3e from classes.dex
{
    public final uu2 a;
    public List b;
    public final e33 c;
    public final it2 t;
    public final ne2 v;

    public void jt2(uu2 p0){
       super();
       this.b = Collections.emptyList();
       this.t = new it2(this);
       this.v = new ne2(2, this);
       this.a = p0;
       this.c = new e33(p0);
    }
    public final Object get(int p0){
       ju2 oju2 = this.b.get(p0);
       oju2.getClass();
       return this.c.a(oju2);
    }
    public final int size(){
       return this.b.size();
    }
}
