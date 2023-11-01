package p.j01;
import p.o2;
import p.dj2;
import java.lang.String;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import java.lang.Object;
import p.w51;
import android.os.Parcel;
import p.is7;
import android.os.Parcelable;

public final class j01 extends o2	// class@001a3a from classes.dex
{
    public final int a;
    public final boolean b;
    public final String[] c;
    public final CredentialPickerConfig t;
    public final CredentialPickerConfig v;
    public final boolean w;
    public final String x;
    public final String y;
    public final boolean z;
    public static final Parcelable$Creator CREATOR;

    static {
       j01.CREATOR = new dj2(12);
    }
    public void j01(int p0,boolean p1,String[] p2,CredentialPickerConfig p3,CredentialPickerConfig p4,boolean p5,String p6,String p7,boolean p8){
       CredentialPickerConfig p3;
       super();
       this.a = p0;
       this.b = p1;
       w51.k(p2);
       this.c = p2;
       if (p3 == null) {
          boolean b = true;
          p3 = new CredentialPickerConfig(2, b, false, b, false);
       }
       this.t = p3;
       if (p4 == null) {
          p3 = new CredentialPickerConfig(2, true, false, true, false);
       }
       this.v = p4;
       if (p0 < 3) {
          this.w = true;
          this.x = null;
          this.y = null;
       }else {
          this.w = p5;
          this.x = p6;
          this.y = p7;
       }
       this.z = p8;
       return;
    }
    public final void writeToParcel(Parcel p0,int p1){
       j01 tc;
       int i = is7.F(p0, 0x4f45);
       is7.I(p0, 1, 4);
       p0.writeInt(this.b);
       if ((tc = this.c) == null) {
       }else {
          p0.writeStringArray(tc);
          is7.J(p0, is7.F(p0, 2));
       }
       is7.B(p0, 3, this.t, p1);
       is7.B(p0, 4, this.v, p1);
       is7.I(p0, 5, 4);
       p0.writeInt(this.w);
       is7.C(p0, 6, this.x);
       is7.C(p0, 7, this.y);
       is7.I(p0, 8, 4);
       p0.writeInt(this.z);
       is7.I(p0, 1000, 4);
       p0.writeInt(this.a);
       is7.J(p0, i);
       return;
    }
}
