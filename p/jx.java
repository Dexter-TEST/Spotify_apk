package p.jx;
import p.wz6;
import p.ba6;
import p.b63;
import p.nr0;
import p.tv7;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import p.tp2;
import p.kg4;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class jx extends nr0 implements wz6, ba6, b63	// class@001b67 from classes.dex
{
    public final String a;
    public final String b;
    public final List c;
    public final boolean t;
    public final String v;
    public static final Parcelable$Creator CREATOR;

    static {
       jx.CREATOR = new tv7(21);
    }
    public void jx(String p0,String p1,List p2,boolean p3,String p4){
       co5.o(p0, "uri");
       co5.o(p1, "text");
       co5.o(p2, "tags");
       co5.o(p4, "imageUrl");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final String F(){
       return this.v;
    }
    public final List H(){
       return this.c;
    }
    public final boolean J(){
       return this.t;
    }
    public final String a(){
       return this.a;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof jx) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (this.t != p0.t) {
          return false;
       }
       if (!co5.c(this.v, p0.v)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       jx tt;
       int i = kg4.j(this.c, tp2.g(this.b, (this.a.hashCode() * 31), 31), 31);
       if ((tt = this.t) != null) {
          tt = 1;
       }
       return (this.v.hashCode() + ((i + tt) * 31));
    }
    public final String toString(){
       return hr7.a("Banner\(uri="+this.a+", text="+this.b+", tags="+this.c+", selected="+this.t+", imageUrl=", this.v, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeStringList(this.c);
       p0.writeInt(this.t);
       p0.writeString(this.v);
    }
}
