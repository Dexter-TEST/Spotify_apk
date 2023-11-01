package p.cm6;
import java.util.Map$Entry;
import java.lang.Comparable;
import p.zl6;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class cm6 implements Map$Entry, Comparable	// class@001238 from classes.dex
{
    public final Comparable a;
    public Object b;
    public final zl6 c;

    public void cm6(zl6 p0,Comparable p1,Object p2){
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public final int compareTo(Object p0){
       return this.a.compareTo(p0.a);
    }
    public final boolean equals(Object p0){
       cm6 ta;
       int i;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof Map$Entry) {
          return false;
       }
       cm6 key = p0.getKey();
       if ((ta = this.a) == null) {
          key = (key == null)? 1: 0;
       }else {
          boolean b1 = ta.equals(key);
       }
       if (key) {
          key = this.b;
          p0 = p0.getValue();
          if (key == null) {
             i = (p0 == null)? 1: 0;
          }else {
             i = key.equals(p0);
          }
          if (i) {
          label_0036 :
             return b;
          }
       }
       b = false;
       goto label_0036 ;
    }
    public final Object getKey(){
       return this.a;
    }
    public final Object getValue(){
       return this.b;
    }
    public final int hashCode(){
       cm6 ta;
       cm6 tb;
       int i = 0;
       int i1 = ((ta = this.a) == null)? 0: ta.hashCode();
       if ((tb = this.b) != null) {
          i = tb.hashCode();
       }
       return (i ^ i1);
    }
    public final Object setValue(Object p0){
       this.c.b();
       cm6 tb = this.b;
       this.b = p0;
       return tb;
    }
    public final String toString(){
       return this.a+"="+this.b;
    }
}
