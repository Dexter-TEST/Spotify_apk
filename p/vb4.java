package p.vb4;
import android.os.Parcelable;
import p.ie5;
import java.lang.String;
import p.iq6;
import p.vk;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;

public final class vb4 implements Parcelable	// class@0029bd from classes.dex
{
    public final String a;
    public final iq6 b;
    public final vk c;
    public static final Parcelable$Creator CREATOR;

    static {
       vb4.CREATOR = new ie5(28);
    }
    public void vb4(String p0,iq6 p1,vk p2){
       co5.o(p0, "sectionId");
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
       if (!p0 instanceof vb4) {
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
       return true;
    }
    public final int hashCode(){
       vb4 tb;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       if ((tb = this.c) != null) {
          i1 = tb.hashCode();
       }
       return (i + i1);
    }
    public final String toString(){
       return "MobiusSearchResult\(sectionId="+this.a+", square="+this.b+", artist="+this.c+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeParcelable(this.b, p1);
       p0.writeParcelable(this.c, p1);
    }
}
