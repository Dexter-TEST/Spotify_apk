package p.ax;
import android.os.Parcelable;
import p.tv7;
import android.content.Context;
import java.lang.Object;
import p.lv1;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import p.ry7;
import java.lang.String;
import android.os.Parcel;

public final class ax implements Parcelable	// class@001013 from classes.dex
{
    public final boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public final int F;
    public final int G;
    public int a;
    public int b;
    public int c;
    public int t;
    public int v;
    public final String w;
    public final int x;
    public final int y;
    public int z;
    public static final Parcelable$Creator CREATOR;

    static {
       ax.CREATOR = new tv7(8);
    }
    public void ax(Context p0){
       super();
       this.c = 255;
       this.t = -1;
       TypedArray typedArray = p0.obtainStyledAttributes(R.style.TextAppearance.MaterialComponents.Badge, lv1.I);
       typedArray.getDimension(0, 0);
       ColorStateList uColorStateL = ry7.x(p0, typedArray, 3);
       ry7.x(p0, typedArray, 4);
       ry7.x(p0, typedArray, 5);
       typedArray.getInt(2, 0);
       typedArray.getInt(1, 1);
       int i = 12;
       if (typedArray.hasValue(i)) {
       }else {
          i = 10;
       }
       typedArray.getResourceId(i, 0);
       typedArray.getString(i);
       typedArray.getBoolean(14, 0);
       ry7.x(p0, typedArray, 6);
       typedArray.getFloat(7, 0);
       typedArray.getFloat(8, 0);
       typedArray.getFloat(9, 0);
       typedArray.recycle();
       typedArray = p0.obtainStyledAttributes(R.style.TextAppearance.MaterialComponents.Badge, lv1.A);
       typedArray.hasValue(0);
       typedArray.getFloat(0, 0);
       typedArray.recycle();
       this.b = uColorStateL.getDefaultColor();
       this.w = p0.getString(R.string.mtrl_badge_numberless_content_description);
       this.x = 0x7f100007;
       this.y = 0x7f120232;
       this.A = true;
       return;
    }
    public void ax(Parcel p0){
       super();
       this.c = 255;
       this.t = -1;
       this.a = p0.readInt();
       this.b = p0.readInt();
       this.c = p0.readInt();
       this.t = p0.readInt();
       this.v = p0.readInt();
       this.w = p0.readString();
       this.x = p0.readInt();
       this.z = p0.readInt();
       this.B = p0.readInt();
       this.C = p0.readInt();
       this.D = p0.readInt();
       this.E = p0.readInt();
       this.F = p0.readInt();
       this.G = p0.readInt();
       boolean b = (p0.readInt())? true: false;
       this.A = b;
       return;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeInt(this.b);
       p0.writeInt(this.c);
       p0.writeInt(this.t);
       p0.writeInt(this.v);
       p0.writeString(this.w);
       p0.writeInt(this.x);
       p0.writeInt(this.z);
       p0.writeInt(this.B);
       p0.writeInt(this.C);
       p0.writeInt(this.D);
       p0.writeInt(this.E);
       p0.writeInt(this.F);
       p0.writeInt(this.G);
       p0.writeInt(this.A);
    }
}
