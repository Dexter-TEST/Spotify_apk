package p.tv7;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;
import p.fe5;
import p.ee5;
import p.de5;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import p.nr0;
import java.util.ArrayList;
import java.util.List;
import p.iq6;
import p.xc4;
import p.vk;
import p.wc4;
import p.nc3;
import p.cf0;
import p.jx;
import p.k5;
import p.y4;
import p.w4;
import p.u4;
import p.t4;
import p.q46;
import p.en6;
import p.p46;
import p.s47;
import p.uc4;
import p.s51;
import p.n90;
import p.o90;
import p.ax;
import p.do5;
import p.pu7;
import p.fp0;
import p.iu7;
import p.ou7;
import p.gu7;
import p.fu7;
import android.content.Intent;
import p.et7;
import com.google.android.gms.auth.api.credentials.Credential;
import p.rv7;
import p.nv7;
import p.q12;
import android.app.PendingIntent;
import p.ge5;
import p.kg4;

public final class tv7 implements Parcelable$Creator	// class@0027f0 from classes.dex
{
    public final int a;

    public void tv7(int p0){
       this.a = p0;
       super();
    }
    public final Object createFromParcel(Parcel p0){
       int i5;
       int i6;
       int i7;
       int i8;
       int i9;
       PendingIntent pendingInten2;
       String str5;
       jx v2;
       String str7;
       String str8;
       Parcel parcel = p0;
       int i = 3;
       int i1 = 2;
       int i2 = 0xffff;
       PendingIntent pendingInten = null;
       String str = "parcel";
       int i3 = 0;
       int i4 = 1;
       switch (this.a){
           case 0:
             i5 = do5.A0(p0);
             str = pendingInten;
             i6 = 0;
             while (p0.dataPosition() < i5) {
                i7 = p0.readInt();
                if ((i8 = i7 & i2) != i4) {
                   if (i8 != i1) {
                      if (i8 != i) {
                         if (i8 != 4) {
                            do5.s0(parcel, i7);
                         }else {
                            str = do5.m(parcel, i7);
                         }
                      }else {
                         pendingInten = do5.l(parcel, i7, PendingIntent.CREATOR);
                      }
                   }else {
                      i6 = do5.d0(parcel, i7);
                   }
                }else {
                   i3 = do5.d0(parcel, i7);
                }
             }
             do5.q(parcel, i5);
             return new fp0(i3, i6, pendingInten, str);
             break;
           case 1:
             i5 = do5.A0(p0);
             long l = -1;
             while (p0.dataPosition() < i5) {
                i9 = p0.readInt();
                if ((i8 = i9 & i2) != i4) {
                   if (i8 != i1) {
                      if (i8 != i) {
                         do5.s0(parcel, i9);
                      }else {
                         do5.C0(parcel, i9, 8);
                         l = p0.readLong();
                      }
                   }else {
                      i3 = do5.d0(parcel, i9);
                   }
                }else {
                   pendingInten = do5.m(parcel, i9);
                }
             }
             do5.q(parcel, i5);
             return new q12(i3, l, pendingInten);
             break;
           case 2:
             i5 = do5.A0(p0);
             while (p0.dataPosition() < i5) {
                i = p0.readInt();
                if ((i1 = i & i2) != i4) {
                   do5.s0(parcel, i);
                }else {
                   pendingInten = do5.l(parcel, i, Credential.CREATOR);
                }
             }
             do5.q(parcel, i5);
             return new nv7(pendingInten);
             break;
           case 3:
             i5 = do5.A0(p0);
             while (p0.dataPosition() < i5) {
                i = p0.readInt();
                if ((i1 = i & i2) != i4) {
                   do5.s0(parcel, i);
                }else {
                   pendingInten = do5.l(parcel, i, Credential.CREATOR);
                }
             }
             do5.q(parcel, i5);
             return new rv7(pendingInten);
             break;
           case 4:
             i5 = do5.A0(p0);
             i9 = 0;
             while (p0.dataPosition() < i5) {
                i6 = p0.readInt();
                if ((i7 = i6 & i2) != i4) {
                   if (i7 != i1) {
                      if (i7 != i) {
                         do5.s0(parcel, i6);
                      }else {
                         pendingInten = do5.l(parcel, i6, Intent.CREATOR);
                      }
                   }else {
                      i9 = do5.d0(parcel, i6);
                   }
                }else {
                   i3 = do5.d0(parcel, i6);
                }
             }
             do5.q(parcel, i5);
             return new et7(i3, i9, pendingInten);
             break;
           case 5:
             i5 = do5.A0(p0);
             PendingIntent pendingInten1 = pendingInten;
             pendingInten2 = pendingInten1;
             while (p0.dataPosition() < i5) {
                i3 = p0.readInt();
                if ((i6 = i3 & i2) != i4) {
                   if (i6 != i1) {
                      do5.s0(parcel, i3);
                   }else {
                      pendingInten1 = do5.m(parcel, i3);
                   }
                }else {
                   i9 = do5.f0(parcel, i3);
                   i3 = p0.dataPosition();
                   if (!i9) {
                      pendingInten2 = pendingInten;
                   }else {
                      i3 = i3 + i9;
                      parcel.setDataPosition(i3);
                      pendingInten2 = p0.createStringArrayList();
                   }
                }
             }
             do5.q(parcel, i5);
             return new fu7(pendingInten1, pendingInten2);
             break;
           case 6:
             i5 = do5.A0(p0);
             while (p0.dataPosition() < i5) {
                i = p0.readInt();
                if ((i9 = i & i2) != i4) {
                   if (i9 != i1) {
                      do5.s0(parcel, i);
                   }else {
                      pendingInten = do5.l(parcel, i, ou7.CREATOR);
                   }
                }else {
                   i3 = do5.d0(parcel, i);
                }
             }
             do5.q(parcel, i5);
             return new gu7(i3, pendingInten);
             break;
           case 7:
             i5 = do5.A0(p0);
             pendingInten2 = pendingInten;
             while (p0.dataPosition() < i5) {
                i6 = p0.readInt();
                if ((i7 = i6 & i2) != i4) {
                   if (i7 != i1) {
                      if (i7 != i) {
                         do5.s0(parcel, i6);
                      }else {
                         pu7 opu7 = do5.l(parcel, i6, pu7.CREATOR);
                      }
                   }else {
                      pendingInten = do5.l(parcel, i6, fp0.CREATOR);
                   }
                }else {
                   i3 = do5.d0(parcel, i6);
                }
             }
             do5.q(parcel, i5);
             return new iu7(i3, pendingInten, pendingInten2);
             break;
           case 8:
             return new ax(parcel);
           case 9:
             return new o90(parcel.readParcelable(uc4.class.getClassLoader()), parcel.readParcelable(uc4.class.getClassLoader()), parcel.readParcelable(n90.class.getClassLoader()), parcel.readParcelable(uc4.class.getClassLoader()));
           case 10:
             return new s51(p0.readLong());
           case 11:
             return uc4.a(p0.readInt(), p0.readInt());
           case 12:
             return new s47(parcel);
           case 13:
             co5.o(parcel, str);
             i5 = en6.F(p0.readString());
             i = p0.readInt();
             ArrayList uArrayList = new ArrayList(i);
             for (; i3 != i; i3 = i3 + 1) {
                uArrayList.add(parcel.readParcelable(p46.class.getClassLoader()));
             }
             return new p46(i5, uArrayList);
             break;
           case 14:
             co5.o(parcel, str);
             p0.readInt();
             return q46.a;
           case 15:
             co5.o(parcel, str);
             p0.readInt();
             return t4.b;
           case 16:
             co5.o(parcel, str);
             p0.readInt();
             return u4.b;
           case 17:
             co5.o(parcel, str);
             return new w4(p0.readString());
           case 18:
             co5.o(parcel, str);
             return new y4(p0.readString());
           case 19:
             co5.o(parcel, str);
             return new k5(p0.readString());
           case 20:
             co5.o(parcel, str);
             String str1 = p0.readString();
             String str2 = p0.readString();
             i5 = p0.readInt();
             ArrayList uArrayList1 = new ArrayList(i5);
             for (i1 = 0; i1 != i5; i1 = i1 + 1) {
                uArrayList1.add(vk.CREATOR.createFromParcel(parcel));
             }
             ArrayList uArrayList2 = p0.createStringArrayList();
             int i10 = p0.readInt();
             String str3 = p0.readString();
             boolean b = (p0.readInt())? true: false;
             String str4 = p0.readString();
             boolean b1 = (p0.readInt())? true: false;
             vk parcel1 = new vk(str1, str2, uArrayList1, uArrayList2, i10, str3, b, str4, b1);
             return parcel;
             break;
           case 21:
             co5.o(parcel, str);
             str5 = p0.readString();
             String str6 = p0.readString();
             ArrayList uArrayList3 = p0.createStringArrayList();
             boolean b2 = (p0.readInt())? true: false;
             v2 = new jx(str5, str6, uArrayList3, b2, p0.readString());
             return v2;
             break;
           case 22:
             co5.o(parcel, str);
             str7 = p0.readString();
             str8 = p0.readString();
             if (p0.readInt()) {
                i3 = true;
             }
             return new cf0(str7, str8, i3, p0.readString());
             break;
           case 23:
             co5.o(parcel, str);
             p0.readInt();
             return nc3.a;
           case 24:
             co5.o(parcel, str);
             str7 = p0.readString();
             str8 = p0.readString();
             i5 = p0.readInt();
             ArrayList uArrayList4 = new ArrayList(i5);
             for (; i3 != i5; i3 = i3 + 1) {
                uArrayList4.add(vk.CREATOR.createFromParcel(parcel));
             }
             wc4 parcel2 = new wc4(str7, str8, uArrayList4, p0.createStringArrayList(), p0.readInt(), p0.readString(), p0.readString());
             return parcel;
             break;
           case 25:
             co5.o(parcel, str);
             String str9 = p0.readString();
             String str10 = p0.readString();
             i5 = p0.readInt();
             ArrayList uArrayList5 = new ArrayList(i5);
             for (; i3 != i5; i3 = i3 + 1) {
                uArrayList5.add(iq6.CREATOR.createFromParcel(parcel));
             }
             xc4 parcel3 = new xc4(str9, str10, uArrayList5, p0.createStringArrayList(), p0.readInt(), p0.readString(), p0.readString());
             return parcel;
             break;
           case 26:
             co5.o(parcel, str);
             String str11 = p0.readString();
             int i11 = p0.readInt();
             Parcelable parcelable = parcel.readParcelable(de5.class.getClassLoader());
             str7 = (p0.readInt())? 1: 0;
             str5 = (p0.readInt())? 1: 0;
             ArrayList uArrayList6 = p0.createStringArrayList();
             parcel = (p0.readInt())? 1: 0;
             de5 v21 = new de5(str11, i11, parcelable, str7, str5, uArrayList6, parcel);
             return v2;
             break;
           case 27:
             co5.o(parcel, str);
             return new ee5(p0.readString(), p0.readString());
           case 28:
             co5.o(parcel, str);
             p0.readInt();
             return fe5.a;
           default:
             co5.o(parcel, str);
             return new ge5(p0.readInt(), kg4.I(p0.readString()), p0.readString());
       }
    }
    public final Object[] newArray(int p0){
       switch (this.a){
           case 0:
             fp0[] uofp0Array = new fp0[p0];
             return uofp0Array;
           case 1:
             q12[] oq12Array = new q12[p0];
             return oq12Array;
           case 2:
             nv7[] onv7Array = new nv7[p0];
             return onv7Array;
           case 3:
             rv7[] orv7Array = new rv7[p0];
             return orv7Array;
           case 4:
             et7[] uoet7Array = new et7[p0];
             return uoet7Array;
           case 5:
             fu7[] uofu7Array = new fu7[p0];
             return uofu7Array;
           case 6:
             gu7[] ogu7Array = new gu7[p0];
             return ogu7Array;
           case 7:
             iu7[] oiu7Array = new iu7[p0];
             return oiu7Array;
           case 8:
             ax[] uoaxArray = new ax[p0];
             return uoaxArray;
           case 9:
             o90[] oo90Array = new o90[p0];
             return oo90Array;
           case 10:
             s51[] os51Array = new s51[p0];
             return os51Array;
           case 11:
             uc4[] ouc4Array = new uc4[p0];
             return ouc4Array;
           case 12:
             s47[] os47Array = new s47[p0];
             return os47Array;
           case 13:
             p46[] op46Array = new p46[p0];
             return op46Array;
           case 14:
             q46[] oq46Array = new q46[p0];
             return oq46Array;
           case 15:
             t4[] ot4Array = new t4[p0];
             return ot4Array;
           case 16:
             u4[] ou4Array = new u4[p0];
             return ou4Array;
           case 17:
             w4[] ow4Array = new w4[p0];
             return ow4Array;
           case 18:
             y4[] oy4Array = new y4[p0];
             return oy4Array;
           case 19:
             k5[] ok5Array = new k5[p0];
             return ok5Array;
           case 20:
             vk[] ovkArray = new vk[p0];
             return ovkArray;
           case 21:
             jx[] ojxArray = new jx[p0];
             return ojxArray;
           case 22:
             cf0[] uocf0Array = new cf0[p0];
             return uocf0Array;
           case 23:
             nc3[] onc3Array = new nc3[p0];
             return onc3Array;
           case 24:
             wc4[] owc4Array = new wc4[p0];
             return owc4Array;
           case 25:
             xc4[] oxc4Array = new xc4[p0];
             return oxc4Array;
           case 26:
             de5[] uode5Array = new de5[p0];
             return uode5Array;
           case 27:
             ee5[] uoee5Array = new ee5[p0];
             return uoee5Array;
           case 28:
             fe5[] uofe5Array = new fe5[p0];
             return uofe5Array;
           default:
             ge5[] oge5Array = new ge5[p0];
             return oge5Array;
       }
    }
}
