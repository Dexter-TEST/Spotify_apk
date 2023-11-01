package p.w87;
import android.os.Parcelable;
import p.v74;
import java.lang.String;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import android.os.Parcel;
import java.lang.Enum;

public final class w87 implements Parcelable	// class@002aeb from classes.dex
{
    public final String a;
    public final TriggerType b;
    public final FormatType c;
    public static final Parcelable$Creator CREATOR;

    static {
       w87.CREATOR = new v74(3);
    }
    public void w87(String p0,TriggerType p1,FormatType p2){
       co5.o(p0, "pattern");
       co5.o(p1, "type");
       co5.o(p2, "format");
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
       if (!p0 instanceof w87) {
          return false;
       }
       if (!co5.c(this.a, p0.a)) {
          return false;
       }
       if (this.b != p0.b) {
          return false;
       }
       if (this.c != p0.c) {
          return false;
       }
       return true;
    }
    public final int hashCode(){
       return (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31));
    }
    public final String toString(){
       return "Trigger\(pattern="+this.a+", type="+this.b+", format="+this.c+')';
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeString(this.b.name());
       p0.writeString(this.c.name());
    }
}
