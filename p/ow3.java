package p.ow3;
import android.os.Parcelable;
import p.t33;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import p.kg4;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class ow3 implements Parcelable	// class@0021a2 from classes.dex
{
    public final String a;
    public final List b;
    public final boolean c;
    public static final Parcelable$Creator CREATOR;

    static {
       ow3.CREATOR = new t33(27);
    }
    public void ow3(String p0,List p1,boolean p2){
       co5.o(p0, "language");
       co5.o(p1, "translatedLines");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof ow3) {
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
       return true;
    }
    public final int hashCode(){
       ow3 tc;
       int i = kg4.j(this.b, (this.a.hashCode() * 31), 31);
       if ((tc = this.c) != null) {
          tc = 1;
       }
       return (i + tc);
    }
    public final String toString(){
       return kg4.p("Translation\(language="+this.a+", translatedLines="+this.b+", isRTL=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeStringList(this.b);
       p0.writeInt(this.c);
    }
}
