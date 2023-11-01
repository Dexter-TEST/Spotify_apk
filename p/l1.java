package p.l1;
import java.util.AbstractMap;
import p.i1;
import java.util.Map;
import java.util.Set;
import p.j1;
import java.util.Collection;
import p.ck0;
import java.util.Iterator;
import java.lang.Object;
import p.k1;
import p.w51;
import java.lang.Class;
import java.util.List;
import java.util.RandomAccess;
import p.n1;
import p.o1;
import p.q1;
import p.w1;
import p.m1;
import p.ik;
import java.util.ArrayList;
import java.lang.String;

public final class l1 extends AbstractMap	// class@001cc9 from classes.dex
{
    public j1 a;
    public ck0 b;
    public final Map c;
    public final i1 t;

    public void l1(i1 p0,Map p1){
       this.t = p0;
       super();
       this.c = p1;
    }
    public final Set a(){
       l1 ta;
       if ((ta = this.a) == null) {
          ta = new j1(this);
          this.a = ta;
       }
       return ta;
    }
    public final Collection b(){
       l1 tb;
       if ((tb = this.b) == null) {
          tb = new ck0(this);
          this.b = tb;
       }
       return tb;
    }
    public final void clear(){
       l1 tt = this.t;
       i1 c = tt.c;
       if (this.c == c) {
          Iterator iterator = c.values().iterator();
          while (iterator.hasNext()) {
             iterator.next().clear();
          }
          tt.c.clear();
          tt.t = 0;
       }else {
          w51.n(new k1(this));
       }
       return;
    }
    public final boolean containsKey(Object p0){
       boolean b;
       l1 tc = this.c;
       try{
          tc.getClass();
          b = tc.containsKey(p0);
       }catch(java.lang.ClassCastException e0){
          b = false;
       }catch(java.lang.NullPointerException e0){
       }
       return b;
    }
    public final Set entrySet(){
       return this.a();
    }
    public final boolean equals(Object p0){
       boolean b = (this != p0 && !this.c.equals(p0))? false: true;
       return b;
    }
    public final Object get(Object p0){
       int i;
       Object obj;
       l1 tc = this.c;
       tc.getClass();
       try{
          i = 0;
          obj = tc.get(p0);
       }catch(java.lang.ClassCastException e0){
          obj = i;
       }catch(java.lang.NullPointerException e0){
       }
       if (obj != null) {
          l1 tt = this.t;
          tt.getClass();
          n1 on1 = (obj instanceof RandomAccess)? new n1(tt, p0, obj, i): new q1(tt, p0, obj, i);
          n1 on11 = on1;
       }
       return i;
    }
    public final int hashCode(){
       return this.c.hashCode();
    }
    public final Set keySet(){
       w1 a;
       l1 tt = this.t;
       if ((a = tt.a) == null) {
          a = new m1(tt, tt.c);
          tt.a = a;
       }
       return a;
    }
    public final Object remove(Object p0){
       if ((p0 = this.c.remove(p0)) == null) {
          p0 = null;
       }else {
          l1 tt = this.t;
          l1 ol1 = tt;
          ol1.getClass();
          ArrayList uArrayList = new ArrayList(ol1.v);
          uArrayList.addAll(p0);
          tt.t = tt.t - p0.size();
          p0.clear();
          p0 = uArrayList;
       }
       return p0;
    }
    public final int size(){
       return this.c.size();
    }
    public final String toString(){
       return this.c.toString();
    }
    public final Collection values(){
       return this.b();
    }
}
