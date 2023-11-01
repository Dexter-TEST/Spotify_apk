package p.st;
import p.f;
import p.t33;
import p.ou3;
import java.lang.String;
import android.os.Parcel;
import java.lang.Enum;

public final class st extends f	// class@00269b from classes.dex
{
    public static final Parcelable$Creator CREATOR;

    static {
       st.CREATOR = new t33(20);
    }
    public void st(ou3 p0,String p1,String p2,boolean p3,boolean p4,boolean p5){
       super(p0, p1, p2, p3, p4, p5);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeString(this.a.name());
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeInt(this.t);
       p0.writeInt(this.v);
       p0.writeInt(this.w);
    }
}
