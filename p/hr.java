package p.hr;
import java.lang.Object;
import p.ir;
import java.lang.String;
import p.kg4;
import java.lang.Long;
import java.lang.IllegalStateException;
import p.kr;
import java.lang.NullPointerException;

public final class hr	// class@0018ae from classes.dex
{
    public String a;
    public String b;
    public String c;
    public Long d;

    public void hr(){
       super();
    }
    public ir a(){
       String str = (this.b == null)? " uri": "";
       if (this.c == null) {
          str = str.concat(" name");
       }
       if (this.d == null) {
          str = kg4.l(str, " created");
       }
       if (str.isEmpty()) {
          ir str1 = new ir(this.a, this.b, this.c, this.d.longValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public kr b(){
       String str = (this.b == null)? " uri": "";
       if (this.c == null) {
          str = str.concat(" name");
       }
       if (this.d == null) {
          str = kg4.l(str, " created");
       }
       if (str.isEmpty()) {
          kr str1 = new kr(this.a, this.b, this.c, this.d.longValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public void c(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null name");
       }
       this.c = p0;
       return;
    }
    public void d(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       this.b = p0;
       return;
    }
}
