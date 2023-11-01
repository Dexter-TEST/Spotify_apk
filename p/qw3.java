package p.qw3;
import android.os.Parcelable;
import p.t33;
import java.util.ArrayList;
import java.lang.String;
import p.mw3;
import p.kw3;
import p.pw3;
import p.kg4;
import java.lang.Object;
import p.co5;
import p.en6;
import java.util.List;
import p.tp2;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Iterator;
import p.lw3;
import p.ow3;

public final class qw3 implements Parcelable	// class@002429 from classes.dex
{
    public final List a;
    public final int b;
    public final List c;
    public final String t;
    public final boolean v;
    public final mw3 w;
    public final kw3 x;
    public final pw3 y;
    public final boolean z;
    public static final Parcelable$Creator CREATOR;

    static {
       qw3.CREATOR = new t33(23);
    }
    public void qw3(ArrayList p0,int p1,ArrayList p2,String p3,boolean p4,mw3 p5,kw3 p6,pw3 p7,boolean p8){
       kg4.t(p1, "syncStatus");
       co5.o(p3, "language");
       co5.o(p5, "provider");
       co5.o(p6, "colors");
       co5.o(p7, "vocalRemovalStatus");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
       this.x = p6;
       this.y = p7;
       this.z = p8;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof qw3) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.t, p0.t)) {
          return false;
       }
       if (this.v != p0.v) {
          return false;
       }
       if (!co5.c(this.w, p0.w)) {
          return false;
       }
       if (!co5.c(this.x, p0.x)) {
          return false;
       }
       if (!co5.c(this.y, p0.y)) {
          return false;
       }
       if (this.z != p0.z) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       qw3 tv;
       qw3 tz;
       int i = tp2.g(this.t, kg4.j(this.c, ((en6.A(this.b) + (this.a.hashCode() * 31)) * 31), 31), 31);
       int i1 = 1;
       if ((tv = this.v) != null) {
          tv = 1;
       }
       int i2 = (this.y.hashCode() + ((this.x.hashCode() + ((this.w.hashCode() + ((i + tv) * 31)) * 31)) * 31)) * 31;
       if ((tz = this.z) == null) {
          i1 = tz;
       }
       return (i2 + i1);
    }
    public final String toString(){
       return kg4.p("Lyrics\(lines="+this.a+", syncStatus="+tp2.D(this.b)+", translations="+this.c+", language="+this.t+", isRTL="+this.v+", provider="+this.w+", colors="+this.x+", vocalRemovalStatus="+this.y+", showUpsell=", this.z, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       qw3 ta = this.a;
       p0.writeInt(ta.size());
       Iterator iterator = ta.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, p1);
       }
       p0.writeString(tp2.x(this.b));
       ta = this.c;
       p0.writeInt(ta.size());
       iterator = ta.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, p1);
       }
       p0.writeString(this.t);
       p0.writeInt(this.v);
       this.w.writeToParcel(p0, p1);
       this.x.writeToParcel(p0, p1);
       this.y.writeToParcel(p0, p1);
       p0.writeInt(this.z);
       return;
    }
}
