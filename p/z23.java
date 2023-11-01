package p.z23;
import p.b43;
import android.os.Parcelable;
import p.w23;
import java.lang.String;
import p.ju2;
import java.util.List;
import p.au2;
import p.t33;
import p.k23;
import com.google.common.collect.c;
import p.a23;
import java.lang.Object;
import p.co5;
import p.y23;
import p.o26;
import p.ay6;
import p.wf2;
import java.lang.Class;
import p.a43;
import p.io2;
import p.ui3;
import java.lang.Number;
import android.os.Parcel;
import p.oi;
import p.eo5;

public class z23 implements b43, Parcelable	// class@002e74 from classes.dex
{
    private final y23 a;
    private final ui3 b;
    public static final Parcelable$Creator CREATOR;
    public static final w23 c;
    public static final z23 t;

    static {
       z23.c = new w23();
       z23.t = w23.a(null, null, null, null, null, null, null);
       z23.CREATOR = new t33(9);
    }
    public void z23(String p0,String p1,k23 p2,c p3,c p4,String p5,a23 p6){
       int i = this;
       co5.o(p3, "body");
       Object obj = p4;
       co5.o(obj, "overlays");
       Object obj1 = p6;
       co5.o(obj1, "custom");
       super();
       y23 v10 = new y23(this, p0, p1, p2, p3, obj, p5, obj1);
       i.a = v10;
       i.b = new ay6(new o26(19, this));
    }
    public static final z23 C(String p0,String p1,ju2 p2,List p3,List p4,String p5,au2 p6){
       z23.c.getClass();
       return w23.a(p0, p1, p2, p3, p4, p5, p6);
    }
    public static final z23 M(b43 p0){
       z23.c.getClass();
       co5.o(p0, "other");
       if (p0 instanceof z23) {
       }else {
          z23 oz23 = w23.a(p0.c(), p0.d(), p0.e(), p0.m(), p0.j(), p0.q(), p0.b());
       }
       return p0;
    }
    public static final y23 u(z23 p0){
       return p0.a;
    }
    public static final a43 y(){
       z23.c.getClass();
       return z23.t.a();
    }
    public a23 D(){
       return this.a.g;
    }
    public k23 L(){
       return this.a.c;
    }
    public a43 a(){
       return this.a;
    }
    public au2 b(){
       return this.D();
    }
    public String c(){
       return this.a.a;
    }
    public String d(){
       return this.a.b;
    }
    public int describeContents(){
       return 0;
    }
    public ju2 e(){
       return this.L();
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof z23) {
          return false;
       }
       return io2.j(this.a, p0.a);
    }
    public int hashCode(){
       return this.b.getValue().intValue();
    }
    public List j(){
       return this.a.e;
    }
    public List m(){
       return this.a.d;
    }
    public String q(){
       return this.a.f;
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.a.a);
       p0.writeString(this.a.b);
       ju2 oju2 = null;
       ju2 oju21 = (oi.f(this.a.c, oju2))? oju2: this.a.c;
       eo5.d0(p1, p0, oju21);
       oi.o(p0, this.a.d);
       oi.o(p0, this.a.e);
       p0.writeString(this.a.f);
       if (!oi.k(this.a.g, oju2)) {
          oju2 = this.a.g;
       }
       eo5.d0(p1, p0, oju2);
       return;
    }
}
