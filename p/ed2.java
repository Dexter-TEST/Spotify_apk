package p.ed2;
import android.os.Parcelable;
import p.q86;
import android.os.Bundle;
import java.lang.Object;
import android.os.Parcel;
import java.lang.ClassLoader;

public final class ed2 implements Parcelable	// class@001464 from classes.dex
{
    public final Bundle a;
    public static final Parcelable$Creator CREATOR;

    static {
       ed2.CREATOR = new q86(4);
    }
    public void ed2(Bundle p0){
       super();
       this.a = p0;
    }
    public void ed2(Parcel p0,ClassLoader p1){
       super();
       Bundle uBundle = p0.readBundle();
       this.a = uBundle;
       if (p1 != null && uBundle != null) {
          uBundle.setClassLoader(p1);
       }
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeBundle(this.a);
    }
}
