package p.xt;
import java.lang.Object;
import java.util.Set;
import java.lang.NullPointerException;
import java.lang.String;
import p.co5;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.lang.StringBuilder;

public final class xt	// class@002ce8 from classes.dex
{
    public final Object a;
    public final Set b;

    public void xt(Object p0,Set p1){
       super();
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Null effects");
       }
       this.b = p1;
       return;
    }
    public static xt a(Set p0){
       return new xt(null, co5.B(p0));
    }
    public static xt d(Object p0){
       return new xt(p0, Collections.emptySet());
    }
    public static xt e(){
       return new xt(null, Collections.emptySet());
    }
    public final boolean b(){
       boolean b = (this.a != null)? true: false;
       return b;
    }
    public final Object c(){
       if (this.b()) {
          return this.a;
       }
       throw new NoSuchElementException("there is no model in this Next<>");
    }
    public final boolean equals(Object p0){
       xt ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof xt) {
          return false;
       }
       if ((ta = this.a) == null) {
          if (p0.a == null) {
          label_001c :
             if (this.b.equals(p0.b)) {
             label_0028 :
                return b;
             }
          }
       }else if(ta.equals(p0.a)){
          goto label_001c ;
       }
       b = false;
       goto label_0028 ;
    }
    public final int hashCode(){
       xt ta;
       int i = ((ta = this.a) == null)? 0: ta.hashCode();
       return (((i ^ 0xf4243) * 0xf4243) ^ this.b.hashCode());
    }
    public final String toString(){
       return "Next{model="+this.a+", effects="+this.b+"}";
    }
}
