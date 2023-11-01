package p.ft;
import p.c;
import p.v74;
import p.r45;
import java.lang.String;
import android.os.Parcel;
import java.io.Serializable;

public final class ft extends c	// class@001638 from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       ft.CREATOR = new v74(8);
    }
    public void ft(r45 p0,String p1,String p2,String p3){
       super(p0, p1, p2, p3);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeSerializable(this.t);
    }
}
