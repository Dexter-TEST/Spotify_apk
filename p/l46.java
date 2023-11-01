package p.l46;
import p.n46;
import p.ie5;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Parcelable;

public final class l46 implements n46	// class@001ce2 from classes.dex
{
    public final String a;
    public final List b;
    public static final Parcelable$Creator CREATOR;

    static {
       l46.CREATOR = new ie5(8);
    }
    public void l46(String p0,List p1){
       co5.o(p0, "title");
       super();
       this.a = p0;
       this.b = p1;
    }
    public static l46 a(l46 p0,List p1){
       l46 a = p0.a;
       p0.getClass();
       co5.o(a, "title");
       co5.o(p1, "selectedContent");
       return new l46(a, p1);
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof l46) {
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
       return kg4.o("Summary\(title="+this.a+", selectedContent=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       l46 tb = this.b;
       p0.writeInt(tb.size());
       Iterator iterator = tb.iterator();
       while (iterator.hasNext()) {
          p0.writeParcelable(iterator.next(), p1);
       }
       return;
    }
}
