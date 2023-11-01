package p.qm2;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import android.content.Context;
import p.sz1;
import java.lang.ClassLoader;
import p.co5;

public final class qm2 implements Parcelable	// class@0023cc from classes.dex
{
    public final String a;
    public final Parcelable b;
    public static final Parcelable$Creator CREATOR;

    static {
       qm2.CREATOR = new g44(25);
    }
    public void qm2(Parcel p0){
       super();
       this.a = p0.readString();
       this.b = p0.readParcelable(sz1.a().getClassLoader());
    }
    public void qm2(Parcelable p0){
       super();
       this.a = "image/png";
       this.b = p0;
    }
    public final int describeContents(){
       return 1;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "out");
       p0.writeString(this.a);
       p0.writeParcelable(this.b, p1);
    }
}
