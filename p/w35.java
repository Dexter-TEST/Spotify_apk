package p.w35;
import android.view.View$BaseSavedState;
import p.t33;
import android.os.Parcel;
import com.spotify.litesignup.phonesignup.view.OneTimePassView;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Bundle;
import android.os.Parcelable;

public final class w35 extends View$BaseSavedState	// class@002abc from classes.dex
{
    public Bundle a;
    public static final Parcelable$Creator CREATOR;

    static {
       w35.CREATOR = new t33(19);
    }
    public void w35(Parcel p0){
       super(p0);
       this.a = p0.readBundle(OneTimePassView.class.getClassLoader());
    }
    public void w35(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeBundle(this.a);
    }
}
