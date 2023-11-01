package p.nk;
import java.util.Iterator;
import java.util.Map$Entry;
import p.pk;
import java.lang.Object;
import p.wh6;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;

public final class nk implements Iterator, Map$Entry	// class@001ffa from classes.dex
{
    public int a;
    public int b;
    public boolean c;
    public final pk t;

    public void nk(pk p0){
       this.t = p0;
       super();
       this.a = p0.c - 1;
       this.b = -1;
    }
    public final boolean equals(Object p0){
       if (this.c == null) {
          throw new IllegalStateException("This container does not support retaining Map.Entry objects");
       }
       boolean b = false;
       if (!p0 instanceof Map$Entry) {
          return b;
       }
       Object key = p0.getKey();
       nk tt = this.t;
       Object obj = tt.h(this.b);
       key = (key != obj && (key == null && key.equals(obj)))? 0: 1;
       if (key) {
          p0 = p0.getValue();
          key = tt.j(this.b);
          int i = (p0 != key && (p0 == null && p0.equals(key)))? 0: 1;
          if (i) {
             b = true;
          }
       }
       return b;
    }
    public final Object getKey(){
       if (this.c != null) {
          return this.t.h(this.b);
       }
       throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    public final Object getValue(){
       if (this.c != null) {
          return this.t.j(this.b);
       }
       throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }
    public final boolean hasNext(){
       boolean b = (this.b < this.a)? true: false;
       return b;
    }
    public final int hashCode(){
       if (this.c == null) {
          throw new IllegalStateException("This container does not support retaining Map.Entry objects");
       }
       nk tt = this.t;
       Object obj = tt.h(this.b);
       Object obj1 = tt.j(this.b);
       int i = 0;
       int i1 = (obj == null)? 0: obj.hashCode();
       if (obj1 != null) {
          i = obj1.hashCode();
       }
       return (i1 ^ i);
    }
    public final Object next(){
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       this.b = this.b + 1;
       this.c = true;
       return this;
    }
    public final void remove(){
       if (this.c == null) {
          throw new IllegalStateException();
       }
       this.t.i(this.b);
       this.b = this.b - 1;
       this.a = this.a - 1;
       this.c = false;
       return;
    }
    public final Object setValue(Object p0){
       if (this.c == null) {
          throw new IllegalStateException("This container does not support retaining Map.Entry objects");
       }
       int i = (this.b << 1) + 1;
       wh6 b = this.t.b;
       object oobject = b[i];
       b[i] = p0;
       return oobject;
    }
    public final String toString(){
       return this.getKey()+"="+this.getValue();
    }
}
