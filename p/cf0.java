package p.cf0;
import p.ba6;
import p.nr0;
import p.tv7;
import java.lang.String;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class cf0 extends nr0 implements ba6	// class@0011f4 from classes.dex
{
    public final String a;
    public final String b;
    public final boolean c;
    public final String t;
    public static final Parcelable$Creator CREATOR;

    static {
       cf0.CREATOR = new tv7(22);
    }
    public void cf0(String p0,String p1,boolean p2,String p3){
       co5.o(p0, "uri");
       co5.o(p1, "text");
       co5.o(p3, "color");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final boolean J(){
       return this.c;
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
       if (!p0 instanceof cf0) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       if (!co5.c(this.t, p0.t)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       cf0 tc;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       if ((tc = this.c) != null) {
          tc = 1;
       }
       return (this.t.hashCode() + ((i + tc) * 31));
    }
    public final String toString(){
       return hr7.a("Chip\(uri="+this.a+", text="+this.b+", selected="+this.c+", color=", this.t, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeInt(this.c);
       p0.writeString(this.t);
    }
}
