package p.gf3;
import p.ff3;
import java.lang.Object;
import java.util.HashMap;
import p.cf3;
import p.df3;
import java.lang.String;
import p.ef3;
import java.lang.Boolean;
import java.util.Date;
import java.lang.Class;
import p.oo4;

public final class gf3	// class@0016f8 from classes.dex
{
    public final HashMap a;
    public final HashMap b;
    public final cf3 c;
    public boolean d;
    public static final ff3 e;

    static {
       gf3.e = new ff3();
    }
    public void gf3(){
       super();
       HashMap hashMap = new HashMap();
       this.a = hashMap;
       HashMap hashMap1 = new HashMap();
       this.b = hashMap1;
       this.c = cf3.a;
       this.d = false;
       hashMap1.put(String.class, df3.a);
       hashMap.remove(String.class);
       hashMap1.put(Boolean.class, ef3.a);
       hashMap.remove(Boolean.class);
       hashMap1.put(Date.class, gf3.e);
       hashMap.remove(Date.class);
    }
    public final gf3 a(Class p0,oo4 p1){
       this.a.put(p0, p1);
       this.b.remove(p0);
       return this;
    }
}
