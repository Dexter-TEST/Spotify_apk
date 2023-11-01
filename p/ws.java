package p.ws;
import p.ks6;
import java.lang.String;
import p.vi1;
import java.util.Map;
import java.lang.Object;
import p.j8;
import p.qi1;
import java.util.Collections;
import java.lang.Boolean;
import java.lang.NullPointerException;
import java.lang.Class;
import p.ui1;
import p.si1;
import p.ti1;
import java.util.HashMap;
import java.lang.StringBuilder;

public final class ws implements ks6	// class@002b9d from classes.dex
{
    public final String a;
    public final vi1 b;
    public final boolean c;
    public final Map t;

    public void ws(String p0,vi1 p1,boolean p2,Map p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public static j8 c(){
       Map map;
       j8 oj8 = new j8(13);
       oj8.b = "";
       oj8.h(new qi1());
       if ((map = Collections.emptyMap()) == null) {
          throw new NullPointerException("Null validatedEmailStates");
       }
       oj8.v = map;
       oj8.t = Boolean.FALSE;
       return oj8;
    }
    public final boolean a(){
       ws tb = this.b;
       tb.getClass();
       v1 = tb instanceof ui1;
       v0 = tb instanceof si1;
       boolean b = (v1 && tb)? true: false;
       return b;
    }
    public final boolean b(){
       ws tb = this.b;
       tb.getClass();
       boolean b = (!tb instanceof si1 && !tb instanceof ti1)? false: true;
       return b;
    }
    public final ws d(vi1 p0){
       HashMap hashMap = new HashMap(this.t);
       hashMap.put(this.a, p0);
       j8 oj8 = new j8(this, 0);
       oj8.v = hashMap;
       oj8.h(p0);
       return oj8.f();
    }
    public final boolean equals(Object p0){
       boolean b = true;
       if (p0 == this) {
          return b;
       }
       if (!p0 instanceof ws) {
          return false;
       }
       if (!this.a.equals(p0.a) || (!this.b.equals(p0.b) || (this.c != p0.c || !this.t.equals(p0.t)))) {
          b = false;
       }
       return b;
    }
    public final int hashCode(){
       int i = 0xf4243;
       int i1 = (((this.a.hashCode() ^ i) * i) ^ this.b.hashCode()) * i;
       int i2 = (this.c != null)? 1231: 1237;
       return (((i1 ^ i2) * i) ^ this.t.hashCode());
    }
    public final String toString(){
       return "EmailModel{email="+this.a+", emailState="+this.b+", emailHasFocus="+this.c+", validatedEmailStates="+this.t+"}";
    }
}
