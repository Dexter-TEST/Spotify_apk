package p.kh;
import android.view.View$BaseSavedState;
import p.g44;
import android.os.Parcel;
import android.os.Parcelable;

public final class kh extends View$BaseSavedState	// class@001c17 from classes.dex
{
    public boolean a;
    public static final Parcelable$Creator CREATOR;

    static {
       kh.CREATOR = new g44(7);
    }
    public void kh(Parcel p0){
       super(p0);
       boolean b = (p0.readByte())? true: false;
       this.a = b;
       return;
    }
    public void kh(Parcelable p0){
       super(p0);
    }
    public final void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeByte((byte)this.a);
    }
}
