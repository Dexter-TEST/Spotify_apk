package p.gc4;
import p.t65;
import java.lang.Object;
import java.util.HashMap;
import p.q14;
import java.util.Map;
import p.qz3;
import p.b17;
import java.lang.String;
import p.ic4;
import java.util.Set;
import p.co5;
import java.util.Iterator;
import java.lang.IllegalStateException;

public final class gc4	// class@0016e1 from classes.dex
{
    public final qz3 a;
    public final qz3 b;
    public final qz3 c;
    public final qz3 d;
    public final qz3 e;
    public final qz3 f;
    public final qz3 g;
    public final qz3 h;
    public final qz3 i;
    public final qz3 j;
    public final qz3 k;
    public final HashMap l;
    public static final HashMap m;

    static {
       t65[] ot65Array = new t65[]{new t65("embedding.weight", "embed.weight"),new t65("dense1.weight", "fc1.weight"),new t65("dense2.weight", "fc2.weight"),new t65("dense3.weight", "fc3.weight"),new t65("dense1.bias", "fc1.bias"),new t65("dense2.bias", "fc2.bias"),new t65("dense3.bias", "fc3.bias")};
       gc4.m = q14.n0(ot65Array);
    }
    public void gc4(HashMap p0){
       super();
       String[] obj = p0.get("embed.weight");
       String str = "Required value was null.";
       if (obj == null) {
          throw new IllegalStateException(str.toString());
       }
       this.a = obj;
       if ((obj = p0.get("convs.0.weight")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.b = b17.C(obj);
       if ((obj = p0.get("convs.1.weight")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.c = b17.C(obj);
       if ((obj = p0.get("convs.2.weight")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.d = b17.C(obj);
       if ((obj = p0.get("convs.0.bias")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.e = obj;
       if ((obj = p0.get("convs.1.bias")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.f = obj;
       if ((obj = p0.get("convs.2.bias")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.g = obj;
       if ((obj = p0.get("fc1.weight")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.h = b17.B(obj);
       if ((obj = p0.get("fc2.weight")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.i = b17.B(obj);
       if ((obj = p0.get("fc1.bias")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.j = obj;
       if ((obj = p0.get("fc2.bias")) == null) {
          throw new IllegalStateException(str.toString());
       }
       this.k = obj;
       this.l = new HashMap();
       obj = new String[]{ic4.a.a(),ic4.b.a()};
       Iterator iterator = co5.I(obj).iterator();
       while (iterator.hasNext()) {
          str = iterator.next();
          String str1 = co5.K(".weight", str);
          str = co5.K(".bias", str);
          qz3 oqz3 = p0.get(str1);
          qz3 oqz31 = p0.get(str);
          if (oqz3 != null) {
             this.l.put(str1, b17.B(oqz3));
          }
          if (oqz31 != null) {
             this.l.put(str, oqz31);
          }
       }
       return;
    }
}
