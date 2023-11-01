package p.t52;
import p.o52;
import android.view.ViewGroup$MarginLayoutParams;
import p.dj2;
import android.content.Context;
import android.util.AttributeSet;
import p.w51;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.view.ViewGroup$LayoutParams;

public final class t52 extends ViewGroup$MarginLayoutParams implements o52	// class@002701 from classes.dex
{
    public final boolean A;
    public final int a;
    public final float b;
    public final float c;
    public final int t;
    public final float v;
    public int w;
    public int x;
    public final int y;
    public final int z;
    public static final Parcelable$Creator CREATOR;

    static {
       t52.CREATOR = new dj2(7);
    }
    public void t52(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a = 1;
       this.b = 0;
       this.c = 0x3f800000;
       this.t = -1;
       this.v = 0xbf800000;
       this.w = -1;
       this.x = -1;
       this.y = 0xffffff;
       this.z = 0xffffff;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, w51.z);
       this.a = typedArray.getInt(8, 1);
       this.b = typedArray.getFloat(2, 0);
       this.c = typedArray.getFloat(3, 0x3f800000);
       this.t = typedArray.getInt(0, -1);
       this.v = typedArray.getFraction(1, 1, 1, 0xbf800000);
       this.w = typedArray.getDimensionPixelSize(7, -1);
       this.x = typedArray.getDimensionPixelSize(6, -1);
       this.y = typedArray.getDimensionPixelSize(5, 0xffffff);
       this.z = typedArray.getDimensionPixelSize(4, 0xffffff);
       this.A = typedArray.getBoolean(9, 0);
       typedArray.recycle();
    }
    public void t52(Parcel p0){
       int i = 0;
       super(i, i);
       this.a = 1;
       this.b = 0;
       this.c = 0x3f800000;
       this.t = -1;
       this.v = 0xbf800000;
       this.w = -1;
       this.x = -1;
       this.y = 0xffffff;
       this.z = 0xffffff;
       this.a = p0.readInt();
       this.b = p0.readFloat();
       this.c = p0.readFloat();
       this.t = p0.readInt();
       this.v = p0.readFloat();
       this.w = p0.readInt();
       this.x = p0.readInt();
       this.y = p0.readInt();
       this.z = p0.readInt();
       if (p0.readByte()) {
          i = true;
       }
       this.A = i;
       this.bottomMargin = p0.readInt();
       this.leftMargin = p0.readInt();
       this.rightMargin = p0.readInt();
       this.topMargin = p0.readInt();
       this.height = p0.readInt();
       this.width = p0.readInt();
       return;
    }
    public void t52(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 1;
       this.b = 0;
       this.c = 0x3f800000;
       this.t = -1;
       this.v = 0xbf800000;
       this.w = -1;
       this.x = -1;
       this.y = 0xffffff;
       this.z = 0xffffff;
    }
    public void t52(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.a = 1;
       this.b = 0;
       this.c = 0x3f800000;
       this.t = -1;
       this.v = 0xbf800000;
       this.w = -1;
       this.x = -1;
       this.y = 0xffffff;
       this.z = 0xffffff;
    }
    public void t52(t52 p0){
       super(p0);
       this.a = 1;
       this.b = 0;
       this.c = 0x3f800000;
       this.t = -1;
       this.v = 0xbf800000;
       this.w = -1;
       this.x = -1;
       this.y = 0xffffff;
       this.z = 0xffffff;
       this.a = p0.a;
       this.b = p0.b;
       this.c = p0.c;
       this.t = p0.t;
       this.v = p0.v;
       this.w = p0.w;
       this.x = p0.x;
       this.y = p0.y;
       this.z = p0.z;
       this.A = p0.A;
    }
    public final void A(int p0){
       this.w = p0;
    }
    public final int B(){
       return this.bottomMargin;
    }
    public final int E(){
       return this.leftMargin;
    }
    public final int I(){
       return this.y;
    }
    public final int K(){
       return this.topMargin;
    }
    public final int describeContents(){
       return 0;
    }
    public final void g(int p0){
       this.x = p0;
    }
    public final int getOrder(){
       return this.a;
    }
    public final float i(){
       return this.b;
    }
    public final int k(){
       return this.height;
    }
    public final float l(){
       return this.v;
    }
    public final int n(){
       return this.t;
    }
    public final float o(){
       return this.c;
    }
    public final int r(){
       return this.rightMargin;
    }
    public final int s(){
       return this.x;
    }
    public final int t(){
       return this.w;
    }
    public final boolean w(){
       return this.A;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeInt(this.a);
       p0.writeFloat(this.b);
       p0.writeFloat(this.c);
       p0.writeInt(this.t);
       p0.writeFloat(this.v);
       p0.writeInt(this.w);
       p0.writeInt(this.x);
       p0.writeInt(this.y);
       p0.writeInt(this.z);
       p0.writeByte(this.A);
       p0.writeInt(this.bottomMargin);
       p0.writeInt(this.leftMargin);
       p0.writeInt(this.rightMargin);
       p0.writeInt(this.topMargin);
       p0.writeInt(this.height);
       p0.writeInt(this.width);
    }
    public final int x(){
       return this.width;
    }
    public final int z(){
       return this.z;
    }
}
