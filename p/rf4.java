package p.rf4;
import android.os.Parcelable;
import p.g44;
import android.os.Parcel;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Bundle;
import p.qf4;
import p.gg4;
import p.u26;
import android.content.Context;
import p.uj3;
import p.bg4;
import p.xg4;
import p.gg1;

public final class rf4 implements Parcelable	// class@0024d8 from classes.dex
{
    public final String a;
    public final int b;
    public final Bundle c;
    public final Bundle t;
    public static final Parcelable$Creator CREATOR;

    static {
       rf4.CREATOR = new g44(14);
    }
    public void rf4(Parcel p0){
       co5.o(p0, "inParcel");
       super();
       String str = p0.readString();
       co5.i(str);
       this.a = str;
       this.b = p0.readInt();
       this.c = p0.readBundle(rf4.class.getClassLoader());
       Bundle uBundle = p0.readBundle(rf4.class.getClassLoader());
       co5.i(uBundle);
       this.t = uBundle;
    }
    public void rf4(qf4 p0){
       co5.o(p0, "entry");
       super();
       this.a = p0.w;
       this.b = p0.b.y;
       this.c = p0.c;
       Bundle uBundle = new Bundle();
       this.t = uBundle;
       p0.z.c(uBundle);
    }
    public final qf4 a(Context p0,gg4 p1,uj3 p2,bg4 p3){
       rf4 tc;
       co5.o(p0, "context");
       co5.o(p2, "hostLifecycleState");
       if ((tc = this.c) != null) {
          tc.setClassLoader(p0.getClassLoader());
       }else {
          tc = 0;
       }
       return gg1.q(p0, p1, tc, p2, p3, this.a, this.t);
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "parcel");
       p0.writeString(this.a);
       p0.writeInt(this.b);
       p0.writeBundle(this.c);
       p0.writeBundle(this.t);
    }
}
