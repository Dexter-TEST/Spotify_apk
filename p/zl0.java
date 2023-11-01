package p.zl0;
import java.util.HashSet;
import p.wm0;
import java.util.Set;
import java.lang.Object;
import java.util.Collections;
import java.lang.Class;
import p.kq0;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.Collection;
import p.uf;
import java.lang.StringBuilder;
import java.util.Arrays;

public final class zl0	// class@002f19 from classes.dex
{
    public final Set a;
    public final Set b;
    public final int c;
    public final int d;
    public final wm0 e;
    public final Set f;

    public void zl0(HashSet p0,HashSet p1,int p2,int p3,wm0 p4,Set p5){
       super();
       this.a = Collections.unmodifiableSet(p0);
       this.b = Collections.unmodifiableSet(p1);
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = Collections.unmodifiableSet(p5);
    }
    public static kq0 a(Class p0){
       Class[] uClassArray = new Class[0];
       return new kq0(p0, uClassArray);
    }
    public static zl0 b(Object p0,Class p1,Class[] p2){
       HashSet hashSet = new HashSet();
       HashSet hashSet1 = new HashSet();
       HashSet hashSet2 = new HashSet();
       hashSet.add(p1);
       int len = p2.length;
       int i = 0;
       int i1 = 0;
       while (true) {
          if (i1 < len) {
             if (p2[i1] != null) {
                i1 = i1 + 1;
             }else {
                break ;
             }
          }else {
             Collections.addAll(hashSet, p2);
             zl0 p0 = new zl0(new HashSet(hashSet), new HashSet(hashSet1), 0, 0, new uf(i, p0), hashSet2);
             return p0;
          }
       }
       throw new NullPointerException("Null interface");
    }
    public final String toString(){
       return "Component<"+Arrays.toString(this.a.toArray())+">{"+this.c+", type="+this.d+", deps="+Arrays.toString(this.b.toArray())+"}";
    }
}
