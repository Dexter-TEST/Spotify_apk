package p.qq6;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import java.util.Arrays;

public final class qq6 implements Parcelable	// class@0023f7 from classes.dex
{
    public int a;
    public int b;
    public int[] c;
    public boolean t;
    public static final Parcelable$Creator CREATOR;

    static {
       qq6.CREATOR = new g44(16);
    }
    public void qq6(Parcel p0){
       int i;
       super();
       this.a = p0.readInt();
       this.b = p0.readInt();
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.t = b;
       if ((i = p0.readInt()) > 0) {
          int[] ointArray = new int[i];
          this.c = ointArray;
          p0.readIntArray(ointArray);
       }
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final String toString(){
       return "FullSpanItem{mPosition="+this.a+", mGapDir="+this.b+", mHasUnwantedGapAfter="+this.t+", mGapPerSpan="+Arrays.toString(this.c)+'}';
    }
    public final void writeToParcel(Parcel p0,int p1){
       qq6 tc;
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.t);
       if ((tc = this.c) != null && tc.length > 0) {
          p0.writeInt(tc.length);
          p0.writeIntArray(this.c);
       }else {
          p0.writeInt(0);
       }
       return;
    }
}
