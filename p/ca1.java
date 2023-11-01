package p.ca1;
import android.os.Parcelable;
import p.g44;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;

public final class ca1 implements Parcelable	// class@0011c8 from classes.dex
{
    public String a;
    public String b;
    public String c;
    public long t;
    public long v;
    public static final Parcelable$Creator CREATOR;

    static {
       ca1.CREATOR = new g44(28);
    }
    public void ca1(){
       super();
    }
    public void ca1(Parcel p0){
       co5.o(p0, "parcel");
       super();
       this.a = p0.readString();
       this.b = p0.readString();
       this.c = p0.readString();
       this.t = p0.readLong();
       this.v = p0.readLong();
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       co5.o(p0, "dest");
       p0.writeString(this.a);
       p0.writeString(this.b);
       p0.writeString(this.c);
       p0.writeLong(this.t);
       p0.writeLong(this.v);
    }
}
