package p.kw3;
import android.os.Parcelable;
import p.t33;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;
import android.os.Parcel;
import p.co5;

public final class kw3 implements Parcelable	// class@001c95 from classes.dex
{
    public final int a;
    public final int b;
    public final int c;
    public static final Parcelable$Creator CREATOR;

    static {
       kw3.CREATOR = new t33(22);
    }
    public void kw3(int p0,int p1,int p2){
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
       if (!p0 instanceof kw3) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return ((((this.a * 31) + this.b) * 31) + this.c);
    }
    public final String toString(){
       return tp2.n("Colors\(background="+this.a+", text="+this.b+", highlightedText=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
    }
}
