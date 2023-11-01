package p.sl;
import android.os.Parcelable;
import p.t33;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.lang.Class;
import java.lang.ClassLoader;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

public final class sl implements Parcelable	// class@002654 from classes.dex
{
    public final int a;
    public final int b;
    public final String c;
    public final Bundle t;
    public Fragment v;
    public static final Parcelable$Creator CREATOR;

    static {
       sl.CREATOR = new t33(13);
    }
    public void sl(Parcel p0){
       super();
       this.a = p0.readInt();
       this.b = p0.readInt();
       String str = p0.readString();
       str.getClass();
       this.c = str;
       this.t = p0.readBundle(sl.class.getClassLoader());
    }
    public void sl(Fragment p0,int p1,int p2){
       super();
       this.a = p1;
       this.b = p2;
       this.c = p0.getClass().getName();
       this.t = p0.getArguments();
       this.v = p0;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeString(this.c);
       p0.writeBundle(this.t);
    }
}
