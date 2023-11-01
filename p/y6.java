package p.y6;
import android.os.Parcelable;
import p.g44;
import android.content.Intent;
import java.lang.Object;
import android.os.Parcel;
import android.os.Parcelable$Creator;
import java.lang.String;
import java.lang.StringBuilder;

public final class y6 implements Parcelable	// class@002d5e from classes.dex
{
    public final int a;
    public final Intent b;
    public static final Parcelable$Creator CREATOR;

    static {
       y6.CREATOR = new g44(5);
    }
    public void y6(Intent p0,int p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public void y6(Parcel p0){
       super();
       this.a = p0.readInt();
       Intent intent = (!p0.readInt())? null: Intent.CREATOR.createFromParcel(p0);
       this.b = intent;
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final String toString(){
       y6 ta;
       String str1;
       String str = "ActivityResult{resultCode=";
       if ((ta = this.a) != -1) {
          str1 = (ta != null)? String.valueOf(ta): "RESULT_CANCELED";
       }else {
          str1 = "RESULT_OK";
       }
       return str+str1+", data="+this.b+'}';
    }
    public final void writeToParcel(Parcel p0,int p1){
       y6 tb;
       p0.writeInt(this.a);
       int i = ((tb = this.b) == null)? 0: 1;
       p0.writeInt(i);
       if (tb != null) {
          tb.writeToParcel(p0, p1);
       }
       return;
    }
}
