package p.cl3;
import java.util.Map$Entry;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;

public final class cl3 implements Map$Entry	// class@00122c from classes.dex
{
    public cl3 a;
    public cl3 b;
    public cl3 c;
    public cl3 t;
    public cl3 v;
    public final Object w;
    public Object x;
    public int y;

    public void cl3(){
       super();
       this.w = null;
       this.v = this;
       this.t = this;
    }
    public void cl3(cl3 p0,Object p1,cl3 p2,cl3 p3){
       super();
       this.a = p0;
       this.w = p1;
       this.y = 1;
       this.t = p2;
       this.v = p3;
       p3.t = this;
       p2.v = this;
    }
    public final boolean equals(Object p0){
       cl3 tw;
       boolean b = false;
       if (p0 instanceof Map$Entry) {
          if ((tw = this.w) == null) {
             if (p0.getKey() != null) {
             label_0032 :
                return b;
             }
          }else if(tw.equals(p0.getKey())){
          }
          if ((tw = this.x) == null) {
             if (p0.getValue() != null) {
             }
          }else if(tw.equals(p0.getValue())){
          }
          b = true;
          goto label_0032 ;
       }else {
          goto label_0032 ;
       }
    }
    public final Object getKey(){
       return this.w;
    }
    public final Object getValue(){
       return this.x;
    }
    public final int hashCode(){
       cl3 tw;
       cl3 tx;
       int i = 0;
       int i1 = ((tw = this.w) == null)? 0: tw.hashCode();
       if ((tx = this.x) != null) {
          i = tx.hashCode();
       }
       return (i ^ i1);
    }
    public final Object setValue(Object p0){
       cl3 tx = this.x;
       this.x = p0;
       return tx;
    }
    public final String toString(){
       return this.w+"="+this.x;
    }
}
