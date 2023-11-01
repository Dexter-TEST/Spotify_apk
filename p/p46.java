package p.p46;
import p.r46;
import p.tv7;
import p.ll1;
import java.util.List;
import java.lang.String;
import p.kg4;
import java.lang.Object;
import p.co5;
import p.en6;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Iterator;
import android.os.Parcelable;

public final class p46 implements r46	// class@0021ee from classes.dex
{
    public final int a;
    public final List b;
    public static final Parcelable$Creator CREATOR;

    static {
       p46.CREATOR = new tv7(13);
    }
    public void p46(int p0,int p1){
       if ((p1 & 0x01)) {
          p0 = 1;
       }
       ll1 a = ((p1 & 0x02))? ll1.a: null;
       super(p0, a);
       return;
    }
    public void p46(int p0,List p1){
       kg4.t(p0, "action");
       co5.o(p1, "selected");
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
       if (!p0 instanceof p46) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.b.hashCode() + (en6.A(this.a) * 31));
    }
    public final String toString(){
       return kg4.o("Conclude\(action="+en6.B(this.a)+", selected=", this.b, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(en6.v(this.a));
       p46 tb = this.b;
       p0.writeInt(tb.size());
       Iterator iterator = tb.iterator();
       while (iterator.hasNext()) {
          p0.writeParcelable(iterator.next(), p1);
       }
       return;
    }
}
