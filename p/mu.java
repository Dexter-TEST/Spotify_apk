package p.mu;
import p.h;
import p.e14;
import p.ie5;
import p.i80;
import com.spotify.login5.v3.proto.Challenges;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import android.os.Parcel;
import java.io.Serializable;
import java.lang.Class;
import java.lang.Object;
import p.s74;

public final class mu extends h	// class@001f0d from classes.dex
{
    public static final Parcelable$Creator CREATOR;
    public static final e14 t;
    public static final e14 v;

    static {
       mu.t = new e14(0);
       mu.v = new e14(1);
       mu.CREATOR = new ie5(29);
    }
    public void mu(i80 p0,Challenges p1,PhoneNumber p2){
       super(p0, p1, p2);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeSerializable(this.a);
       mu.t.getClass();
       p0.writeByteArray(this.b.toByteArray());
       mu.v.getClass();
       p0.writeByteArray(this.c.toByteArray());
    }
}
