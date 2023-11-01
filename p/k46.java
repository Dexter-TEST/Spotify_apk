package p.k46;
import p.n46;
import p.ie5;
import java.lang.String;
import java.util.List;
import p.k5;
import java.lang.Object;
import p.co5;
import p.kg4;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Iterator;
import p.j46;

public final class k46 implements n46	// class@001ba6 from classes.dex
{
    public final String a;
    public final boolean b;
    public final List c;
    public final k5 t;
    public static final Parcelable$Creator CREATOR;

    static {
       k46.CREATOR = new ie5(6);
    }
    public void k46(String p0,boolean p1,List p2,k5 p3){
       co5.o(p0, "pageTitle");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof k46) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (!co5.c(this.t, p0.t)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       k46 tb;
       int i = this.a.hashCode() * 31;
       if ((tb = this.b) != null) {
          tb = 1;
       }
       i = kg4.j(this.c, ((i + tb) * 31), 31);
       int i1 = ((tb = this.t) == null)? 0: tb.hashCode();
       return (i + i1);
    }
    public final String toString(){
       return "SingleItemPicker\(pageTitle="+this.a+", selectionRequired="+this.b+", items="+this.c+", primaryActionButton="+this.t+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeInt(this.b);
       k46 tc = this.c;
       p0.writeInt(tc.size());
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          iterator.next().writeToParcel(p0, p1);
       }
       if ((tc = this.t) == null) {
          p0.writeInt(0);
       }else {
          p0.writeInt(1);
          tc.writeToParcel(p0, p1);
       }
       return;
    }
}
