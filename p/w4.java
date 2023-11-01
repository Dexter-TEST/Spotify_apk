package p.w4;
import p.c5;
import p.tv7;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class w4 extends c5	// class@002ac8 from classes.dex
{
    public final String b;
    public static final Parcelable$Creator CREATOR;

    static {
       w4.CREATOR = new tv7(17);
    }
    public void w4(String p0){
       co5.o(p0, "link");
       super(p0);
       this.b = p0;
    }
    public final String a(){
       return this.b;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof w4) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.b.hashCode();
    }
    public final String toString(){
       return hr7.a("Submit\(link=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.b);
    }
}
