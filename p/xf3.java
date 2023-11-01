package p.xf3;
import java.io.Serializable;
import java.lang.Object;
import java.lang.String;
import java.lang.NullPointerException;
import java.lang.StringBuilder;
import java.lang.Class;

public final class xf3 implements Serializable	// class@002c67 from classes.dex
{
    public final Object a;
    public final String b;
    public final int c;
    public String t;

    public void xf3(Object p0,String p1){
       super();
       this.c = -1;
       this.a = p0;
       if (p1 == null) {
          throw new NullPointerException("Cannot pass null fieldName");
       }
       this.b = p1;
       return;
    }
    public final String a(){
       xf3 ta;
       if (this.t == null) {
          StringBuilder str = "";
          if ((ta = this.a) == null) {
             str = str+"UNKNOWN";
          }else if(ta instanceof Class){
          }else {
             ta = ta.getClass();
          }
          int i = 0;
          while (ta.isArray()) {
             ta = ta.getComponentType();
             i = i + 1;
          }
          str = str+ta.getName();
          while ((i = i - 1) >= 0) {
             str = str.append("[]");
          }
          str = str+'[';
          if ((ta = this.b) != null) {
             str = str+'"'+ta+'"';
          }else if((ta = this.c) >= null){
             str = str+ta;
          }else {
             str = str+'?';
          }
          this.t = str+']';
       }
       return this.t;
    }
    public final String toString(){
       return this.a();
    }
    public Object writeReplace(){
       this.a();
       return this;
    }
}
