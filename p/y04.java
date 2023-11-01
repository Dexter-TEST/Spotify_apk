package p.y04;
import java.util.Map$Entry;
import p.ch3;
import p.a14;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.io2;
import java.lang.StringBuilder;

public final class y04 implements Map$Entry, ch3	// class@002d23 from classes.dex
{
    public final a14 a;
    public final int b;

    public void y04(a14 p0,int p1){
       co5.o(p0, "map");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final boolean equals(Object p0){
       boolean b = (p0 instanceof Map$Entry && (co5.c(p0.getKey(), this.getKey()) && co5.c(p0.getValue(), this.getValue())))? true: false;
       return b;
    }
    public final Object getKey(){
       return this.a.a[this.b];
    }
    public final Object getValue(){
       a14 b = this.a.b;
       co5.i(b);
       return b[this.b];
    }
    public final int hashCode(){
       Object value;
       Object key = this.getKey();
       int i = 0;
       int i1 = (key != null)? key.hashCode(): 0;
       if ((value = this.getValue()) != null) {
          i = value.hashCode();
       }
       return (i1 ^ i);
    }
    public final Object setValue(Object p0){
       a14 b;
       y04 ta = this.a;
       ta.b();
       if ((b = ta.b) != null) {
       }else {
          b = io2.b(ta.a.length);
          ta.b = b;
       }
       ta = this.b;
       object oobject = b[ta];
       b[ta] = p0;
       return oobject;
    }
    public final String toString(){
       return this.getKey()+'='+this.getValue();
    }
}
