package p.ht;
import p.d;
import p.v74;
import p.c;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.String;
import android.os.Parcel;
import android.os.Parcelable;

public final class ht extends d	// class@0018bf from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       ht.CREATOR = new v74(9);
    }
    public void ht(boolean p0,c p1,ConfigurationResponse p2,String p3,boolean p4){
       super(p0, p1, p2, p3, p4);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       d tt;
       p0.writeInt(this.a);
       p0.writeParcelable(this.b, p1);
       p0.writeParcelable(this.c, p1);
       if ((tt = this.t) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeString(tt);
       }
       p0.writeInt(this.v);
       return;
    }
}
