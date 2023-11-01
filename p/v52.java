package p.v52;
import p.o52;
import p.ir5;
import p.dj2;
import android.content.Context;
import android.util.AttributeSet;
import android.os.Parcel;
import android.view.ViewGroup$MarginLayoutParams;

public final class v52 extends ir5 implements o52	// class@002984 from classes.dex
{
    public int A;
    public final int B;
    public final int C;
    public final boolean D;
    public final float v;
    public final float w;
    public final int x;
    public final float y;
    public int z;
    public static final Parcelable$Creator CREATOR;

    static {
       v52.CREATOR = new dj2(8);
    }
    public void v52(){
       super(-2, -2);
       this.v = 0;
       this.w = 0x3f800000;
       this.x = -1;
       this.y = 0xbf800000;
       this.B = 0xffffff;
       this.C = 0xffffff;
    }
    public void v52(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = 0;
       this.w = 0x3f800000;
       this.x = -1;
       this.y = 0xbf800000;
       this.B = 0xffffff;
       this.C = 0xffffff;
    }
    public void v52(Parcel p0){
       super(-2, -2);
       this.v = 0;
       this.w = 0x3f800000;
       this.x = -1;
       this.y = 0xbf800000;
       this.B = 0xffffff;
       this.C = 0xffffff;
       this.v = p0.readFloat();
       this.w = p0.readFloat();
       this.x = p0.readInt();
       this.y = p0.readFloat();
       this.z = p0.readInt();
       this.A = p0.readInt();
       this.B = p0.readInt();
       this.C = p0.readInt();
       boolean b = (p0.readByte())? true: false;
       this.D = b;
       this.bottomMargin = p0.readInt();
       this.leftMargin = p0.readInt();
       this.rightMargin = p0.readInt();
       this.topMargin = p0.readInt();
       this.height = p0.readInt();
       this.width = p0.readInt();
       return;
    }
    public final void A(int p0){
       this.z = p0;
    }
    public final int B(){
       return this.bottomMargin;
    }
    public final int E(){
       return this.leftMargin;
    }
    public final int I(){
       return this.B;
    }
    public final int K(){
       return this.topMargin;
    }
    public final int describeContents(){
       return 0;
    }
    public final void g(int p0){
       this.A = p0;
    }
    public final int getOrder(){
       return 1;
    }
    public final float i(){
       return this.v;
    }
    public final int k(){
       return this.height;
    }
    public final float l(){
       return this.y;
    }
    public final int n(){
       return this.x;
    }
    public final float o(){
       return this.w;
    }
    public final int r(){
       return this.rightMargin;
    }
    public final int s(){
       return this.A;
    }
    public final int t(){
       return this.z;
    }
    public final boolean w(){
       return this.D;
    }
    public final void writeToParcel(Parcel p0,int p1){
       p0.writeFloat(this.v);
       p0.writeFloat(this.w);
       p0.writeInt(this.x);
       p0.writeFloat(this.y);
       p0.writeInt(this.z);
       p0.writeInt(this.A);
       p0.writeInt(this.B);
       p0.writeInt(this.C);
       p0.writeByte(this.D);
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
       return this.C;
    }
}
