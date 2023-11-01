package p.ge5;
import p.he5;
import p.tv7;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.co5;
import p.en6;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class ge5 extends he5	// class@0016f1 from classes.dex
{
    public final int a;
    public final int b;
    public final String c;
    public static final Parcelable$Creator CREATOR;

    static {
       ge5.CREATOR = new tv7(29);
    }
    public void ge5(int p0,int p1,String p2){
       kg4.t(p1, "type");
       co5.o(p2, "parentClickedItemUri");
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
       if (!p0 instanceof ge5) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.c.hashCode() + ((en6.A(this.b) + (this.a * 31)) * 31));
    }
    public final String toString(){
       return hr7.a("SkeletonView\(sectionIdx="+this.a+", type="+kg4.D(this.b)+", parentClickedItemUri=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(this.a);
       p0.writeString(kg4.z(this.b));
       p0.writeString(this.c);
    }
}
