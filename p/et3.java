package p.et3;
import android.os.Parcelable;
import p.dj2;
import android.os.Parcel;
import java.lang.Object;
import p.eo5;
import java.lang.String;
import p.ct3;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Collection;
import p.o61;
import p.bv3;
import p.nh0;
import java.util.Set;
import java.util.UUID;
import p.co5;
import java.util.Iterator;
import p.lu3;
import p.dt3;
import java.lang.Enum;

public final class et3 implements Parcelable	// class@0014f3 from classes.dex
{
    public String A;
    public boolean B;
    public final bv3 C;
    public boolean D;
    public boolean E;
    public final String F;
    public final String G;
    public final String H;
    public final nh0 I;
    public final ct3 a;
    public Set b;
    public final o61 c;
    public final String t;
    public final String v;
    public boolean w;
    public final String x;
    public final String y;
    public final String z;
    public static final Parcelable$Creator CREATOR;

    static {
       et3.CREATOR = new dj2(4);
    }
    public void et3(Parcel p0){
       String str2;
       super();
       String str = p0.readString();
       eo5.C(str, "loginBehavior");
       this.a = ct3.valueOf(str);
       ArrayList str1 = new ArrayList();
       p0.readStringList(str1);
       this.b = new HashSet(str1);
       o61 oo61 = ((str = p0.readString()) != null)? o61.valueOf(str): o61.b;
       this.c = oo61;
       str = p0.readString();
       eo5.C(str, "applicationId");
       this.t = str;
       str = p0.readString();
       eo5.C(str, "authId");
       this.v = str;
       boolean b = true;
       boolean b1 = (p0.readByte())? true: false;
       this.w = b1;
       this.x = p0.readString();
       str = p0.readString();
       eo5.C(str, "authType");
       this.y = str;
       this.z = p0.readString();
       this.A = p0.readString();
       b1 = (p0.readByte())? true: false;
       this.B = b1;
       bv3 uobv3 = ((str = p0.readString()) != null)? bv3.valueOf(str): bv3.b;
       this.C = uobv3;
       b1 = (p0.readByte())? true: false;
       this.D = b1;
       if (!p0.readByte()) {
          b = false;
       }
       this.E = b;
       str = p0.readString();
       eo5.C(str, "nonce");
       this.F = str;
       this.G = p0.readString();
       this.H = p0.readString();
       nh0 onh0 = ((str2 = p0.readString()) == null)? null: nh0.valueOf(str2);
       this.I = onh0;
       return;
    }
    public void et3(Set p0,String p1,String p2,bv3 p3,String p4,String p5,String p6,nh0 p7){
       super();
       this.a = ct3.x;
       this.b = p0;
       this.c = o61.c;
       this.y = "rerequest";
       this.t = p1;
       this.v = p2;
       if (p3 == null) {
          p3 = bv3.b;
       }
       this.C = p3;
       if (p4 != null) {
          int i = (!p4.length())? 1: 0;
          if (!i) {
             this.F = p4;
          label_003b :
             this.G = p5;
             this.H = p6;
             this.I = p7;
             return;
          }
       }
       String str = UUID.randomUUID().toString();
       co5.l(str, "randomUUID\(\).toString\(\)");
       this.F = str;
       goto label_003b ;
    }
    public final boolean a(){
       Iterator iterator = this.b.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             return false;
          }
          if (dt3.p(iterator.next())) {
             break ;
          }
       }
       return true;
    }
    public final int describeContents(){
       return 0;
    }
    public final void writeToParcel(Parcel p0,int p1){
       et3 tI;
       co5.o(p0, "dest");
       p0.writeString(this.a.name());
       p0.writeStringList(new ArrayList(this.b));
       p0.writeString(this.c.name());
       p0.writeString(this.t);
       p0.writeString(this.v);
       p0.writeByte((byte)this.w);
       p0.writeString(this.x);
       p0.writeString(this.y);
       p0.writeString(this.z);
       p0.writeString(this.A);
       p0.writeByte((byte)this.B);
       p0.writeString(this.C.name());
       p0.writeByte((byte)this.D);
       p0.writeByte((byte)this.E);
       p0.writeString(this.F);
       p0.writeString(this.G);
       p0.writeString(this.H);
       String str = ((tI = this.I) == null)? null: tI.name();
       p0.writeString(str);
       return;
    }
}
