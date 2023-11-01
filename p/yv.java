package p.yv;
import java.lang.Object;
import java.lang.String;
import java.lang.NullPointerException;
import p.zv;
import p.kg4;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.IllegalStateException;

public final class yv	// class@002e39 from classes.dex
{
    public String a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Long g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;

    public void yv(){
       super();
    }
    public final void a(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null albumUri");
       }
       this.c = p0;
       return;
    }
    public final zv b(){
       yv oyv = this;
       String str = (oyv.b == null)? " uri": "";
       if (oyv.c == null) {
          str = str.concat(" albumUri");
       }
       if (oyv.d == null) {
          str = kg4.l(str, " name");
       }
       if (oyv.e == null) {
          str = kg4.l(str, " explicit");
       }
       if (oyv.f == null) {
          str = kg4.l(str, " playable");
       }
       if (oyv.g == null) {
          str = kg4.l(str, " created");
       }
       if (str.isEmpty()) {
          zv str1 = new zv(oyv.a, oyv.b, oyv.c, oyv.d, oyv.e.booleanValue(), oyv.f.booleanValue(), oyv.g.longValue(), oyv.h, oyv.i, oyv.j, oyv.k, oyv.l);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void c(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null name");
       }
       this.d = p0;
       return;
    }
    public final void d(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       this.b = p0;
       return;
    }
}
