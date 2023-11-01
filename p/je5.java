package p.je5;
import android.os.Parcelable;
import p.ie5;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import p.tp2;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;

public final class je5 implements Parcelable	// class@001abe from classes.dex
{
    public final String a;
    public final String b;
    public final boolean c;
    public static final Parcelable$Creator CREATOR;

    static {
       je5.CREATOR = new ie5(0);
    }
    public void je5(String p0,String p1,boolean p2){
       co5.o(p0, "label");
       co5.o(p1, "uri");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public static je5 a(je5 p0,boolean p1){
       je5 a = p0.a;
       je5 b = p0.b;
       p0.getClass();
       co5.o(a, "label");
       co5.o(b, "uri");
       return new je5(a, b, p1);
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof je5) {
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
       je5 tc;
       int i = tp2.g(this.b, (this.a.hashCode() * 31), 31);
       if ((tc = this.c) != null) {
          tc = 1;
       }
       return (i + tc);
    }
    public final String toString(){
       return kg4.p("PickerTag\(label="+this.a+", uri="+this.b+", isSelected=", this.c, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeInt(this.c);
    }
}
