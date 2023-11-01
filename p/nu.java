package p.nu;
import p.i;
import p.t33;
import p.b;
import p.g;
import p.t10;
import p.e;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import java.lang.String;
import android.os.Parcel;
import android.os.Parcelable;

public final class nu extends i	// class@002053 from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       nu.CREATOR = new t33(17);
    }
    public void nu(b p0,g p1,t10 p2,e p3,ConfigurationResponse p4,String p5,int p6,boolean p7,boolean p8,boolean p9,boolean p10,boolean p11){
       super(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       i tw;
       p0.writeParcelable(this.a, p1);
       p0.writeParcelable(this.b, p1);
       p0.writeParcelable(this.c, p1);
       p0.writeParcelable(this.t, p1);
       p0.writeParcelable(this.v, p1);
       if ((tw = this.w) == null) {
          p0.writeInt(1);
       }else {
          p0.writeInt(0);
          p0.writeString(tw);
       }
       p0.writeInt(this.x);
       p0.writeInt(this.y);
       p0.writeInt(this.z);
       p0.writeInt(this.A);
       p0.writeInt(this.B);
       p0.writeInt(this.C);
       return;
    }
}
