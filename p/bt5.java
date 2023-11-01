package p.bt5;
import com.google.common.collect.d;
import p.m73;
import p.ct5;
import com.google.common.collect.c;
import java.lang.Object;
import p.qc7;
import p.e73;
import java.util.Map;

public final class bt5 extends d	// class@001131 from classes.dex
{
    public final m73 t;
    public final c v;

    public void bt5(m73 p0,ct5 p1){
       super();
       this.t = p0;
       this.v = p1;
    }
    public final c a(){
       return this.v;
    }
    public final int b(int p0,Object[] p1){
       return this.v.b(p0, p1);
    }
    public final boolean contains(Object p0){
       boolean b = (this.t.get(p0) != null)? true: false;
       return b;
    }
    public final boolean k(){
       return true;
    }
    public final qc7 l(){
       return this.v.q(0);
    }
    public final int size(){
       return this.t.size();
    }
}
