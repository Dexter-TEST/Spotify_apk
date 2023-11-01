package p.pk;
import java.util.Map;
import p.wh6;
import java.lang.Object;
import java.lang.System;
import java.util.Set;
import p.kk;
import java.util.Collection;
import p.mk;
import java.lang.Class;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map$Entry;
import p.ok;

public final class pk extends wh6 implements Map	// class@002280 from classes.dex
{
    public ok A;
    public kk y;
    public mk z;

    public void pk(){
       super();
    }
    public void pk(int p0){
       super(p0);
    }
    public void pk(pk p0){
       super();
       if (p0 != null) {
          wh6 c = p0.c;
          this.b((this.c + c));
          int i = 0;
          if (this.c == null) {
             if (c > null) {
                System.arraycopy(p0.a, i, this.a, i, c);
                System.arraycopy(p0.b, i, this.b, i, (c << 1));
                this.c = c;
             }
          }else {
             for (; i < c; i = i + 1) {
                this.put(p0.h(i), p0.j(i));
             }
          }
       }
       return;
    }
    public final Set entrySet(){
       pk ty;
       if ((ty = this.y) == null) {
          ty = new kk(0, this);
          this.y = ty;
       }
       return ty;
    }
    public final boolean k(Collection p0){
       wh6 tc = this.c;
       int i = tc - 1;
       while (i >= 0) {
          if (!p0.contains(this.h(i))) {
             this.i(i);
          }
          i = i - 1;
       }
       boolean b = (tc != this.c)? true: false;
       return b;
    }
    public final Set keySet(){
       pk tz;
       if ((tz = this.z) == null) {
          tz = new mk(this);
          this.z = tz;
       }
       return tz;
    }
    public final Object[] l(int p0,Object[] p1){
       wh6 tc = this.c;
       if (p1.length < tc) {
          p1 = Array.newInstance(p1.getClass().getComponentType(), tc);
       }
       for (int i = 0; i < tc; i = i + 1) {
          int i1 = i << 1;
          i1 = i1 + p0;
          p1[i] = this.b[i1];
       }
       if (p1.length > tc) {
          p1[tc] = null;
       }
       return p1;
    }
    public final void putAll(Map p0){
       this.b((p0.size() + this.c));
       Iterator iterator = p0.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          Object key = uEntry.getKey();
          this.put(key, uEntry.getValue());
       }
       return;
    }
    public final Collection values(){
       pk tA;
       if ((tA = this.A) == null) {
          tA = new ok(this);
          this.A = tA;
       }
       return tA;
    }
}
