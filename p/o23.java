package p.o23;
import p.tu2;
import android.os.Parcelable;
import p.l23;
import java.lang.String;
import p.t33;
import java.lang.Object;
import p.n23;
import p.o26;
import p.ay6;
import p.wf2;
import java.lang.Class;
import p.su2;
import p.io2;
import p.ui3;
import java.lang.Number;
import android.os.Parcel;
import p.co5;

public class o23 implements tu2, Parcelable	// class@002096 from classes.dex
{
    private final n23 a;
    private final ui3 b;
    public static final Parcelable$Creator CREATOR;
    public static final l23 c;
    private static final o23 t;

    static {
       o23.c = new l23();
       o23.t = new o23(null, null, null, null);
       o23.CREATOR = new t33(6);
    }
    public void o23(String p0,String p1,String p2,String p3){
       super();
       n23 v6 = new n23(this, p0, p1, p2, p3);
       this.a = v6;
       this.b = new ay6(new o26(16, this));
    }
    public static final o23 C(tu2 p0){
       o23.c.getClass();
       o23 oo23 = (p0 != null)? l23.a(p0): o23.b();
       return oo23;
    }
    public static final o23 D(tu2 p0){
       o23.c.getClass();
       return l23.a(p0);
    }
    public static final o23 b(){
       return o23.t;
    }
    public static final n23 c(o23 p0){
       return p0.a;
    }
    public static final su2 q(){
       o23.c.getClass();
       return o23.b().a();
    }
    public static final o23 u(String p0,String p1,String p2,String p3){
       o23.c.getClass();
       return new o23(p0, p1, p2, p3);
    }
    public static final o23 y(){
       o23.c.getClass();
       return o23.b();
    }
    public su2 a(){
       return this.a;
    }
    public String d(){
       return this.a.a;
    }
    public int describeContents(){
       return 0;
    }
    public String e(){
       return this.a.d;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof o23) {
          return false;
       }
       return io2.j(this.a, p0.a);
    }
    public int hashCode(){
       return this.b.getValue().intValue();
    }
    public String j(){
       return this.a.c;
    }
    public String m(){
       return this.a.b;
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "parcel");
       p0.writeString(this.a.a);
       p0.writeString(this.a.b);
       p0.writeString(this.a.c);
       p0.writeString(this.a.d);
    }
}
