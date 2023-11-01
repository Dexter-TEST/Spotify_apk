package p.u73;
import android.os.Parcelable;
import p.v74;
import java.lang.String;
import java.util.HashMap;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import java.lang.Object;
import p.co5;
import p.tp2;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import p.jg0;
import java.lang.Enum;

public final class u73 implements Parcelable	// class@002858 from classes.dex
{
    public final String a;
    public final Map b;
    public final String c;
    public final String t;
    public final String v;
    public final FormatType w;
    public static final Parcelable$Creator CREATOR;

    static {
       u73.CREATOR = new v74(2);
    }
    public void u73(String p0,HashMap p1,String p2,String p3,String p4,FormatType p5){
       co5.o(p0, "htmlContent");
       co5.o(p2, "impressionUrl");
       co5.o(p3, "id");
       co5.o(p4, "uuid");
       co5.o(p5, "formatType");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
       this.v = p4;
       this.w = p5;
    }
    public final int describeContents(){
       return 0;
    }
    public final boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof u73) {
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
       if (this.w != p0.w) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.w.hashCode() + tp2.g(this.v, tp2.g(this.t, tp2.g(this.c, ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31), 31), 31), 31));
    }
    public final String toString(){
       return "InAppMessage\(htmlContent="+this.a+", clickActions="+this.b+", impressionUrl="+this.c+", id="+this.t+", uuid="+this.v+", formatType="+this.w+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       u73 tb = this.b;
       p0.writeInt(tb.size());
       Iterator iterator = tb.entrySet().iterator();
       while (iterator.hasNext()) {
          Map$Entry uEntry = iterator.next();
          p0.writeString(uEntry.getKey());
          uEntry.getValue().writeToParcel(p0, p1);
       }
       p0.writeString(this.c);
       p0.writeString(this.t);
       p0.writeString(this.v);
       p0.writeString(this.w.name());
       return;
    }
}
