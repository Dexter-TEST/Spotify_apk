package p.ia4;
import java.lang.Object;
import java.util.LinkedHashMap;
import p.m73;
import java.lang.String;
import p.co5;
import p.n75;
import java.util.Map;
import p.q14;
import p.ka4;
import java.lang.Integer;
import java.util.TreeMap;
import java.util.Objects;

public final class ia4	// class@001956 from classes.dex
{
    public Map a;

    public void ia4(){
       super();
       this.a = new LinkedHashMap();
    }
    public void ia4(m73 p0){
       co5.o(p0, "map");
       super();
       this.a = p0;
    }
    public void ia4(n75 p0){
       super();
       this.a = q14.t0(p0.a);
    }
    public final void a(ka4[] p0){
       TreeMap treeMap;
       co5.o(p0, "migrations");
       int len = p0.length;
       for (int i = 0; i < len; i = i + 1) {
          object oobject = p0[i];
          ia4 ta = this.a;
          Integer integer = Integer.valueOf(oobject.a);
          if ((treeMap = ta.get(integer)) == null) {
             treeMap = new TreeMap();
             ta.put(integer, treeMap);
          }
          ka4 b = oobject.b;
          if (treeMap.containsKey(Integer.valueOf(b))) {
             Objects.toString(treeMap.get(Integer.valueOf(b)));
             oobject.toString();
          }
          treeMap.put(Integer.valueOf(b), oobject);
       }
       return;
    }
}
