package p.at5;
import com.google.common.collect.d;
import p.m73;
import java.lang.Object;
import com.google.common.collect.c;
import java.util.Map$Entry;
import p.qc7;
import p.e73;
import p.zs5;

public final class at5 extends d	// class@000fed from classes.dex
{
    public final m73 t;
    public final Object[] v;
    public final int w;
    public final int x;

    public void at5(m73 p0,Object[] p1,int p2,int p3){
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
       this.x = p3;
    }
    public final int b(int p0,Object[] p1){
       return this.a().b(p0, p1);
    }
    public final boolean contains(Object p0){
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          Object key = p0.getKey();
          if ((p0 = p0.getValue()) != null && p0.equals(this.t.get(key))) {
             b = true;
          }
       }
       return b;
    }
    public final boolean k(){
       return true;
    }
    public final qc7 l(){
       return this.a().q(0);
    }
    public final c q(){
       return new zs5(this);
    }
    public final int size(){
       return this.x;
    }
}
