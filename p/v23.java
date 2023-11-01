package p.v23;
import p.p33;
import android.os.Parcelable;
import p.t23;
import com.google.common.collect.c;
import p.ys5;
import java.util.List;
import p.eb3;
import java.lang.String;
import p.t33;
import java.lang.Object;
import p.co5;
import p.u23;
import p.o26;
import p.ay6;
import p.wf2;
import p.o33;
import java.lang.Class;
import p.uk;
import p.io2;
import p.ui3;
import java.lang.Number;
import android.os.Parcel;

public class v23 implements p33, Parcelable	// class@00296a from classes.dex
{
    private final u23 a;
    private final ui3 b;
    public static final Parcelable$Creator CREATOR;
    public static final t23 c;
    private static final v23 t;

    static {
       v23.c = new t23();
       v23.t = new v23(null, eb3.p(ys5.v));
       v23.CREATOR = new t33(8);
    }
    public void v23(String p0,c p1){
       co5.o(p1, "actions");
       super();
       this.a = new u23(p0, p1);
       this.b = new ay6(new o26(18, this));
    }
    public static final v23 c(){
       return v23.t;
    }
    public static final u23 d(v23 p0){
       return p0.a;
    }
    public static final o33 e(){
       v23.c.getClass();
       return v23.c().y();
    }
    public static final v23 j(String p0,List p1){
       v23.c.getClass();
       return new v23(p0, eb3.p(p1));
    }
    public static final v23 m(String p0,String[] p1){
       v23.c.getClass();
       co5.o(p1, "actions");
       return new v23(p0, eb3.p(uk.h0(p1)));
    }
    public static final v23 q(p33 p0){
       v23.c.getClass();
       co5.o(p0, "other");
       if (p0 instanceof v23) {
       }else {
          v23 ov23 = new v23(p0.a(), eb3.p(p0.b()));
       }
       return p0;
    }
    public static final v23 u(p33 p0){
       v23.c.getClass();
       if (p0 != null) {
          if (p0 instanceof v23) {
          }else {
             v23 ov23 = new v23(p0.a(), eb3.p(p0.b()));
          }
       }else {
          p0 = null;
       }
       return p0;
    }
    public String a(){
       return this.a.a;
    }
    public List b(){
       return this.a.b;
    }
    public int describeContents(){
       return 0;
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof v23) {
          return false;
       }
       return io2.j(this.a, p0.a);
    }
    public int hashCode(){
       return this.b.getValue().intValue();
    }
    public void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.a.a);
       u23 b = this.a.b;
       co5.o(b, "strings");
       if (b.isEmpty()) {
          b = null;
       }
       p0.writeStringList(b);
       return;
    }
    public o33 y(){
       return this.a;
    }
}
