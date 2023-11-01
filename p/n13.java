package p.n13;
import p.tt2;
import android.os.Parcelable;
import p.k13;
import java.lang.String;
import p.au2;
import p.t33;
import p.a23;
import java.lang.Object;
import p.co5;
import p.m13;
import p.o26;
import p.ay6;
import p.wf2;
import java.lang.Class;
import java.util.Map;
import p.m73;
import p.n26;
import p.eo5;
import p.st2;
import p.io2;
import p.ui3;
import java.lang.Number;
import android.os.Parcel;
import p.oi;

public class n13 implements tt2, Parcelable	// class@001f48 from classes.dex
{
    private final String a;
    private final a23 b;
    private final m13 c;
    private final ui3 t;
    public static final Parcelable$Creator CREATOR;
    public static final k13 v;
    private static final n13 w;

    static {
       n13.v = new k13();
       n13.w = k13.a("", null);
       n13.CREATOR = new t33(1);
    }
    public void n13(String p0,a23 p1){
       co5.o(p0, "name");
       co5.o(p1, "data");
       super();
       this.a = p0;
       this.b = p1;
       this.c = new m13(this, p0, p1);
       this.t = new ay6(new o26(12, this));
    }
    public static final n13 D(tt2 p0){
       n13.v.getClass();
       return k13.b(p0);
    }
    public static final n13 c(){
       return n13.w;
    }
    public static final m13 d(n13 p0){
       return p0.c;
    }
    public static final m73 e(Map p0){
       n13.v.getClass();
       return eo5.x(p0, n13.class, n26.K);
    }
    public static final st2 j(){
       n13.v.getClass();
       return n13.c().a();
    }
    public static final n13 m(String p0,au2 p1){
       n13.v.getClass();
       return k13.a(p0, p1);
    }
    public static final n13 u(){
       n13.v.getClass();
       return n13.c();
    }
    public final String C(){
       return this.a;
    }
    public st2 a(){
       return this.c;
    }
    public au2 b(){
       return this.q();
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof n13) {
          return false;
       }
       return io2.j(this.c, p0.c);
    }
    public int hashCode(){
       return this.t.getValue().intValue();
    }
    public String name(){
       return this.c.a;
    }
    public a23 q(){
       return this.c.b;
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.c.a);
       au2 uoau2 = null;
       if (oi.k(this.c.b, uoau2)) {
       }else {
          uoau2 = this.c.b;
       }
       eo5.d0(p1, p0, uoau2);
       return;
    }
    public final a23 y(){
       return this.b;
    }
}
