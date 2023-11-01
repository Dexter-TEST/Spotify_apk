package p.g23;
import p.hu2;
import android.os.Parcelable;
import p.d23;
import p.j13;
import java.util.Map;
import java.lang.String;
import p.t33;
import p.s23;
import p.m73;
import java.lang.Object;
import p.co5;
import p.f23;
import p.o26;
import p.ay6;
import p.wf2;
import java.lang.Class;
import p.gu2;
import p.io2;
import p.ui3;
import java.lang.Number;
import android.os.Parcel;
import p.eo5;
import p.ry7;
import p.pc;

public class g23 implements hu2, Parcelable	// class@001686 from classes.dex
{
    private final f23 a;
    private final ui3 b;
    public static final Parcelable$Creator CREATOR;
    public static final d23 c;
    private static final g23 t;

    static {
       g23.c = new d23();
       g23.t = d23.a(null, null, null, null);
       g23.CREATOR = new t33(4);
    }
    public void g23(s23 p0,s23 p1,m73 p2,String p3){
       co5.o(p2, "custom");
       super();
       f23 v0 = new f23(this, p0, p1, p2, p3);
       this.a = v0;
       this.b = new ay6(new o26(14, this));
    }
    public static final g23 D(){
       g23.c.getClass();
       return g23.j();
    }
    public static final g23 L(hu2 p0){
       g23.c.getClass();
       g23 og23 = (p0 != null)? d23.b(p0): g23.j();
       return og23;
    }
    public static final g23 M(hu2 p0){
       g23.c.getClass();
       return d23.b(p0);
    }
    public static final g23 j(){
       return g23.t;
    }
    public static final f23 m(g23 p0){
       return p0.a;
    }
    public static final gu2 u(){
       g23.c.getClass();
       return g23.j().a();
    }
    public static final g23 y(j13 p0,j13 p1,Map p2,String p3){
       g23.c.getClass();
       return d23.a(p0, p1, p2, p3);
    }
    public m73 C(){
       return this.a.c;
    }
    public s23 N(){
       return this.a.a;
    }
    public gu2 a(){
       return this.a;
    }
    public Map b(){
       return this.C();
    }
    public j13 c(){
       return this.q();
    }
    public String d(){
       return this.a.d;
    }
    public int describeContents(){
       return 0;
    }
    public j13 e(){
       return this.N();
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof g23) {
          return false;
       }
       return io2.j(this.a, p0.a);
    }
    public int hashCode(){
       return this.b.getValue().intValue();
    }
    public s23 q(){
       return this.a.b;
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "parcel");
       eo5.d0(p1, p0, this.a.a);
       eo5.d0(p1, p0, this.a.b);
       eo5.Z(p0, this.a.c, ry7.F, p1);
       p0.writeString(this.a.d);
    }
}
