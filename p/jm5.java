package p.jm5;
import java.io.Serializable;
import java.lang.String;
import java.lang.Object;
import p.wf0;
import java.lang.Class;
import java.lang.StringBuilder;

public final class jm5 implements Serializable	// class@001b06 from classes.dex
{
    public final String a;
    public final String b;
    public cb6 c;
    public static final jm5 t;
    public static final jm5 v;

    static {
       jm5.t = new jm5("", null);
       jm5.v = new jm5("", null);
    }
    public void jm5(String p0,String p1){
       super();
       if (p0 == null) {
          p0 = "";
       }
       this.a = p0;
       this.b = p1;
       return;
    }
    public final boolean a(){
       boolean b = (this.b == null && this.a.isEmpty())? true: false;
       return b;
    }
    public final boolean equals(Object p0){
       jm5 ta;
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (p0 == null) {
          return false;
       }
       if (p0.getClass() != jm5.class) {
          return false;
       }
       jm5 a = p0.a;
       if ((ta = this.a) == null) {
          if (a != null) {
             return false;
          }
       }else if(!ta.equals(a)){
          return false;
       }
       p0 = p0.b;
       if ((a = this.b) == null) {
          if (p0 != null) {
             b = false;
          }
          return b;
       }else {
          return a.equals(p0);
       }
    }
    public final int hashCode(){
       jm5 tb;
       jm5 ta = this.a;
       if ((tb = this.b) == null) {
          return ta.hashCode();
       }
       return (ta.hashCode() ^ tb.hashCode());
    }
    public Object readResolve(){
       jm5 ta;
       if (this.b == null && ((ta = this.a) == null && !"".equals(ta))) {
          return jm5.t;
       }
       return this;
    }
    public final String toString(){
       jm5 tb;
       jm5 ta = this.a;
       if ((tb = this.b) == null) {
          return ta;
       }
       return "{"+tb+"}"+ta;
    }
}
