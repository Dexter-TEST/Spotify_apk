package p.q14;
import p.xe7;
import p.t65;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedHashMap;
import p.ml1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Iterator;

public abstract class q14 extends xe7	// class@002311 from classes.dex
{

    public static final HashMap n0(t65[] p0){
       HashMap hashMap = new HashMap(xe7.F(p0.length));
       q14.p0(hashMap, p0);
       return hashMap;
    }
    public static final Map o0(t65[] p0){
       LinkedHashMap linkedHashMa;
       if (p0.length > 0) {
          linkedHashMa = new LinkedHashMap(xe7.F(p0.length));
          q14.p0(linkedHashMa, p0);
       }else {
          linkedHashMa = ml1.a;
       }
       return linkedHashMa;
    }
    public static final void p0(HashMap p0,t65[] p1){
       co5.o(p1, "pairs");
       int len = p1.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p1[i];
          p0.put(oobject.a, oobject.b);
       }
       return;
    }
    public static final Map q0(ArrayList p0){
       int i;
       ml1 a = ml1.a;
       if (i = p0.size()) {
          if (i != 1) {
             a = new LinkedHashMap(xe7.F(p0.size()));
             q14.s0(p0, a);
          }else {
             a = xe7.H(p0.get(0));
          }
       }
       return a;
    }
    public static final Map r0(Map p0){
       int i;
       LinkedHashMap linkedHashMa;
       co5.o(p0, "<this>");
       if (i = p0.size()) {
          linkedHashMa = (i != 1)? q14.t0(p0): xe7.i0(p0);
       }else {
          linkedHashMa = ml1.a;
       }
       return linkedHashMa;
    }
    public static final void s0(ArrayList p0,LinkedHashMap p1){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          t65 ot65 = iterator.next();
          p1.put(ot65.a, ot65.b);
       }
       return;
    }
    public static final LinkedHashMap t0(Map p0){
       co5.o(p0, "<this>");
       return new LinkedHashMap(p0);
    }
}
