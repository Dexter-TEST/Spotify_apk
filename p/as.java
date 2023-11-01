package p.as;
import java.lang.Object;
import p.c0;
import p.iz0;
import p.bs;
import java.lang.Long;
import java.lang.Boolean;
import java.lang.Integer;
import p.vt;
import java.lang.String;
import p.kg4;
import p.uy0;
import p.hz0;
import p.gz0;
import p.vy0;
import p.i73;
import java.lang.IllegalStateException;
import p.aq6;
import p.r45;

public final class as	// class@000fe7 from classes.dex
{
    public Boolean a;
    public Comparable b;
    public Serializable c;
    public Serializable d;
    public Serializable e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;

    public void as(int p0){
       if (p0 != 1) {
          super();
          return;
       }else {
          super();
          c0 a = c0.a;
          this.c = a;
          this.d = a;
          this.e = a;
          this.f = a;
          this.g = a;
          this.h = a;
          this.i = a;
          this.j = a;
          return;
       }
    }
    public void as(iz0 p0){
       super();
       this.b = p0.a;
       this.c = p0.b;
       this.d = Long.valueOf(p0.c);
       this.e = p0.d;
       this.a = Boolean.valueOf(p0.e);
       this.f = p0.f;
       this.g = p0.g;
       this.h = p0.h;
       this.i = p0.i;
       this.j = p0.j;
       this.k = Integer.valueOf(p0.k);
    }
    public void as(vt p0){
       super();
       c0 a = c0.a;
       this.c = a;
       this.d = a;
       this.e = a;
       this.f = a;
       this.g = a;
       this.h = a;
       this.i = a;
       this.j = a;
       this.b = p0.a;
       this.c = p0.b;
       this.d = p0.c;
       this.e = p0.d;
       this.f = p0.e;
       this.g = p0.f;
       this.h = p0.g;
       this.i = p0.h;
       this.j = p0.i;
       this.a = Boolean.valueOf(p0.j);
       this.k = Boolean.valueOf(p0.k);
    }
    public final bs a(){
       String str = (this.b == null)? " generator": "";
       if (this.c == null) {
          str = str.concat(" identifier");
       }
       if (this.d == null) {
          str = kg4.l(str, " startedAt");
       }
       if (this.a == null) {
          str = kg4.l(str, " crashed");
       }
       if (this.f == null) {
          str = kg4.l(str, " app");
       }
       if (this.k == null) {
          str = kg4.l(str, " generatorType");
       }
       if (str.isEmpty()) {
          bs str1 = new bs(this.b, this.c, this.d.longValue(), this.e, this.a.booleanValue(), this.f, this.g, this.h, this.i, this.j, this.k.intValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
    public final vt b(){
       String str = (this.b == null)? " contextUri": "";
       if (this.a == null) {
          str = str.concat(" timeoutReached");
       }
       if (this.k == null) {
          str = kg4.l(str, " bodyLoadingStarted");
       }
       if (str.isEmpty()) {
          vt str1 = new vt(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.a.booleanValue(), this.k.booleanValue());
          return str;
       }else {
          throw new IllegalStateException("Missing required properties:".concat(str));
       }
    }
}
