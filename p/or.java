package p.or;
import p.b;
import p.t33;
import java.lang.String;
import com.spotify.login.signupapi.services.model.CallingCode;
import java.util.List;
import android.os.Parcel;
import java.util.Iterator;
import java.lang.Object;

public final class or extends b	// class@00217a from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       or.CREATOR = new t33(15);
    }
    public void or(String p0,CallingCode p1,List p2){
       super(p0, p1, p2);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       b ta;
       p1 = 1;
       int i = 0;
       if ((ta = this.a) == null) {
          p0.writeInt(p1);
       }else {
          p0.writeInt(i);
          p0.writeString(ta);
       }
       if ((ta = this.b) == null) {
          p0.writeInt(p1);
       }else {
          p0.writeInt(i);
          p0.writeString(ta.getCountryCode());
          p0.writeString(ta.getCallingCode());
       }
       b tc = this.c;
       p0.writeInt(tc.size());
       Iterator iterator = tc.iterator();
       while (iterator.hasNext()) {
          CallingCode uCallingCode = iterator.next();
          p0.writeString(uCallingCode.getCountryCode());
          p0.writeString(uCallingCode.getCallingCode());
       }
       return;
    }
}
