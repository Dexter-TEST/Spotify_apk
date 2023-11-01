package p.jg0;
import android.os.Parcelable;
import p.v74;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.ActionType;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.kg4;
import android.os.Parcel;
import java.lang.Enum;

public final class jg0 implements Parcelable	// class@001acb from classes.dex
{
    public final ActionType a;
    public final String b;
    public final String c;
    public final boolean t;
    public static final Parcelable$Creator CREATOR;

    static {
       jg0.CREATOR = new v74(1);
    }
    public void jg0(ActionType p0,String p1,String p2,boolean p3){
       co5.o(p0, "action");
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
       if (!p0 instanceof jg0) {
          return false;
       }
       if (this.a != p0.a) {
          return false;
       }
       if (!co5.c(this.b, p0.b)) {
          return false;
       }
       if (!co5.c(this.c, p0.c)) {
          return false;
       }
       if (this.t != p0.t) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       jg0 tb;
       jg0 tt;
       int i = this.a.hashCode() * 31;
       int i1 = 0;
       int i2 = ((tb = this.b) == null)? 0: tb.hashCode();
       i = (i + i2) * 31;
       if ((tb = this.c) != null) {
          i1 = tb.hashCode();
       }
       i = (i + i1) * 31;
       if ((tt = this.t) != null) {
          tt = 1;
       }
       return (i + tt);
    }
    public final String toString(){
       return kg4.p("ClickAction\(action="+this.a+", url="+this.b+", trackingUrl="+this.c+", shouldDismiss=", this.t, ')');
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a.name());
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeInt(this.t);
    }
}
