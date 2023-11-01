package p.ba0;
import p.zg3;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import p.tf0;
import p.ns5;
import p.o55;
import p.uf0;

public abstract class ba0 implements zg3, Serializable	// class@001083 from classes.dex
{
    public zg3 a;
    public final Object b;
    public final Class c;
    public final String t;
    public final String v;
    public final boolean w;

    public void ba0(Object p0,Class p1,String p2,String p3,boolean p4){
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
    }
    public abstract zg3 a();
    public final tf0 c(){
       ba0 tc;
       tf0 otf0;
       if ((tc = this.c) == null) {
          otf0 = null;
       }else if(this.w != null){
          ns5.a.getClass();
          otf0 = new o55(tc);
       }else {
          otf0 = ns5.a(tc);
       }
       return otf0;
    }
}
