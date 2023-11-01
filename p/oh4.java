package p.oh4;
import android.view.View$BaseSavedState;
import p.g44;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Object;
import java.lang.System;
import java.lang.Integer;
import p.en6;

public final class oh4 extends View$BaseSavedState	// class@00211f from classes.dex
{
    public int a;
    public static final Parcelable$Creator CREATOR;

    static {
       oh4.CREATOR = new g44(8);
    }
    public void oh4(Parcel p0){
       super(p0);
       this.a = p0.readInt();
    }
    public void oh4(Parcelable p0){
       super(p0);
    }
    public final String toString(){
       return en6.o("HorizontalScrollView.SavedState{"+Integer.toHexString(System.identityHashCode(this))+" scrollPosition=", this.a, "}");
    }
    public final void writeToParcel(Parcel p0,int p1){
       super.writeToParcel(p0, p1);
       p0.writeInt(this.a);
    }
}
