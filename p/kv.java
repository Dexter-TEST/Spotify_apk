package p.kv;
import java.lang.Object;
import p.lv;
import java.lang.String;
import p.kg4;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;

public final class kv	// class@001c92 from classes.dex
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public Long f;
    public Boolean g;

    public void kv(){
       super();
    }
    public final lv a(){
       String str = (this.b == null)? " uri": "";
       if (this.c == null) {
          str = str.concat(" name");
       }
       if (this.d == null) {
          str = kg4.l(str, " description");
       }
       if (this.e == null) {
          str = kg4.l(str, " publisher");
       }
       if (this.f == null) {
          str = kg4.l(str, " created");
       }
       if (this.g == null) {
          str = kg4.l(str, " explicit");
       }
       if (str.isEmpty()) {
          lv str1 = new lv(this.a, this.b, this.c, this.d, this.e, this.f.longValue(), this.g.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void b(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null description");
       }
       this.d = p0;
       return;
    }
    public final void c(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null name");
       }
       this.c = p0;
       return;
    }
    public final void d(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null publisher");
       }
       this.e = p0;
       return;
    }
    public final void e(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       this.b = p0;
       return;
    }
}
