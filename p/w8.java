package p.w8;
import p.h9;
import p.ie5;
import p.de5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;
import android.os.Parcelable;

public final class w8 extends h9	// class@002aec from classes.dex
{
    public final de5 a;
    public static final Parcelable$Creator CREATOR;

    static {
       w8.CREATOR = new ie5(16);
    }
    public void w8(de5 p0){
       co5.o(p0, "pickerItem");
       super();
       this.a = p0;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof w8) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
    public final String toString(){
       return "ItemInsertedFromSearch\(pickerItem="+this.a+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeParcelable(this.a, p1);
    }
}
