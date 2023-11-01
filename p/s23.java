package p.s23;
import p.j13;
import android.os.Parcelable;
import p.p23;
import java.lang.String;
import p.au2;
import p.t33;
import p.a23;
import java.lang.Object;
import p.co5;
import p.r23;
import p.o26;
import p.ay6;
import p.wf2;
import p.i13;
import java.lang.Class;
import p.io2;
import p.ui3;
import java.lang.Number;
import android.os.Parcel;
import p.oi;
import p.eo5;

public class s23 implements j13, Parcelable	// class@0025a5 from classes.dex
{
    private final r23 a;
    private final ui3 b;
    public static final Parcelable$Creator CREATOR;
    public static final p23 c;
    private static final s23 t;

    static {
       s23.c = new p23();
       s23.t = p23.a(null, null, null);
       s23.CREATOR = new t33(7);
    }
    public void s23(String p0,String p1,a23 p2){
       co5.o(p2, "custom");
       super();
       this.a = new r23(this, p0, p1, p2);
       this.b = new ay6(new o26(17, this));
    }
    public static final s23 d(){
       return s23.t;
    }
    public static final r23 e(s23 p0){
       return p0.a;
    }
    public static final i13 j(){
       s23.c.getClass();
       return s23.d().u();
    }
    public static final s23 m(String p0,String p1,au2 p2){
       s23.c.getClass();
       return p23.a(p0, p1, p2);
    }
    public static final s23 q(j13 p0){
       s23.c.getClass();
       return p23.b(p0);
    }
    public String a(){
       return this.a.a;
    }
    public au2 b(){
       return this.a.c;
    }
    public String c(){
       return this.a.b;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof s23) {
          return false;
       }
       return io2.j(this.a, p0.a);
    }
    public int hashCode(){
       return this.b.getValue().intValue();
    }
    public i13 u(){
       return this.a;
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "parcel");
       p0.writeString(this.a.a);
       p0.writeString(this.a.b);
       au2 uoau2 = null;
       if (oi.k(this.a.c, uoau2)) {
       }else {
          uoau2 = this.a.c;
       }
       eo5.d0(p1, p0, uoau2);
       return;
    }
}
