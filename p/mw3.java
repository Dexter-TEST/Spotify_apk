package p.mw3;
import android.os.Parcelable;
import p.t33;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;

public final class mw3 implements Parcelable	// class@001f1a from classes.dex
{
    public final String a;
    public final String b;
    public static final Parcelable$Creator CREATOR;

    static {
       mw3.CREATOR = new t33(25);
    }
    public void mw3(String p0,String p1){
       co5.o(p0, "id");
       co5.o(p1, "name");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof mw3) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (this.a.hashCode() * 31));
    }
    public final String toString(){
       return hr7.a("Provider\(id="+this.a+", name=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
    }
}
