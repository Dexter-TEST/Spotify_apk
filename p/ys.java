package p.ys;
import java.lang.Object;
import p.zs;
import java.lang.String;
import p.kg4;
import java.lang.Integer;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.IllegalStateException;
import java.lang.NullPointerException;

public final class ys	// class@002e1e from classes.dex
{
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public Integer h;
    public Boolean i;
    public Boolean j;
    public Long k;
    public String l;
    public String m;

    public void ys(){
       super();
    }
    public final zs a(){
       ys oys = this;
       String str = (oys.b == null)? " uri": "";
       if (oys.c == null) {
          str = str.concat(" podcastUri");
       }
       if (oys.d == null) {
          str = kg4.l(str, " name");
       }
       if (oys.e == null) {
          str = kg4.l(str, " description");
       }
       if (oys.f == null) {
          str = kg4.l(str, " podcastName");
       }
       if (oys.g == null) {
          str = kg4.l(str, " releaseDate");
       }
       if (oys.h == null) {
          str = kg4.l(str, " duration");
       }
       if (oys.i == null) {
          str = kg4.l(str, " playable");
       }
       if (oys.j == null) {
          str = kg4.l(str, " explicit");
       }
       if (oys.k == null) {
          str = kg4.l(str, " created");
       }
       if (str.isEmpty()) {
          zs str1 = new zs(oys.a, oys.b, oys.c, oys.d, oys.e, oys.f, oys.g, oys.h.intValue(), oys.i.booleanValue(), oys.j.booleanValue(), oys.k.longValue(), oys.l, oys.m);
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final void b(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null description");
       }
       this.e = p0;
       return;
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
          throw new NullPointerException("Null podcastName");
       }
       this.f = p0;
       return;
    }
    public final void e(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null podcastUri");
       }
       this.c = p0;
       return;
    }
    public final void f(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null releaseDate");
       }
       this.g = p0;
       return;
    }
    public final void g(String p0){
       if (p0 == null) {
          throw new NullPointerException("Null uri");
       }
       this.b = p0;
       return;
    }
}
