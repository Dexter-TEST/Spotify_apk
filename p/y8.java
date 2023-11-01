package p.y8;
import p.h9;
import p.ie5;
import p.nr0;
import java.lang.String;
import java.util.ArrayList;
import java.util.List;
import java.lang.Object;
import p.co5;
import p.kg4;
import java.lang.StringBuilder;
import p.hr7;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

public final class y8 extends h9	// class@002d6f from classes.dex
{
    public final nr0 a;
    public final String b;
    public final List c;
    public final List t;
    public final String v;
    public static final Parcelable$Creator CREATOR;

    static {
       y8.CREATOR = new ie5(18);
    }
    public void y8(nr0 p0,String p1,ArrayList p2,List p3,String p4){
       co5.o(p0, "clickedItem");
       co5.o(p2, "currentDisplayedUris");
       co5.o(p3, "relatedItems");
       co5.o(p4, "moreUrl");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof y8) {
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
       if (!co5.c(this.t, p0.t)) {
          return false;
       }
       if (!co5.c(this.v, p0.v)) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       y8 tb;
       int i = this.a.hashCode() * 31;
       int i1 = ((tb = this.b) == null)? 0: tb.hashCode();
       return (this.v.hashCode() + kg4.j(this.t, kg4.j(this.c, ((i + i1) * 31), 31), 31));
    }
    public final String toString(){
       return hr7.a("LoadMoreItems\(clickedItem="+this.a+", activeTag="+this.b+", currentDisplayedUris="+this.c+", relatedItems="+this.t+", moreUrl=", this.v, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeParcelable(this.a, p1);
       p0.writeString(this.b);
       p0.writeStringList(this.c);
       y8 tt = this.t;
       p0.writeInt(tt.size());
       Iterator iterator = tt.iterator();
       while (iterator.hasNext()) {
          p0.writeParcelable(iterator.next(), p1);
       }
       p0.writeString(this.v);
       return;
    }
}
