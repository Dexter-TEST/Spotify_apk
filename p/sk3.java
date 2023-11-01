package p.sk3;
import android.os.Parcelable;
import p.g44;
import java.lang.Object;
import android.os.Parcel;

public final class sk3 implements Parcelable	// class@002646 from classes.dex
{
    public int a;
    public int b;
    public boolean c;
    public static final Parcelable$Creator CREATOR;

    static {
       sk3.CREATOR = new g44(15);
    }
    public void sk3(){
       super();
    }
    public void sk3(Parcel p0){
       super();
       this.a = p0.readInt();
       this.b = p0.readInt();
       boolean b = true;
       if (p0.readInt() == b) {
       }else {
          b = false;
       }
       this.c = b;
       return;
    }
    public void sk3(sk3 p0){
       super();
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
    }
}
