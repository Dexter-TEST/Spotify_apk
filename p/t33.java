package p.t33;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;
import p.pw3;
import p.kw3;
import p.ow3;
import java.util.ArrayList;
import java.util.List;
import p.nw3;
import p.mw3;
import p.lw3;
import p.tp2;
import p.qw3;
import com.spotify.login.termsandconditions.acceptance.AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel;
import java.lang.ClassLoader;
import java.lang.Class;
import p.st;
import p.ou3;
import java.lang.Enum;
import p.w35;
import p.v35;
import p.nu;
import p.nd5;
import android.os.Parcelable;
import p.b;
import p.g;
import p.t10;
import p.e;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.eu;
import p.mu;
import p.h;
import p.na5;
import p.ra5;
import p.or;
import com.spotify.login.signupapi.services.model.CallingCode;
import p.la0;
import p.sl;
import p.lw;
import p.er6;
import java.lang.IllegalArgumentException;
import p.br6;
import p.dr6;
import p.zq6;
import p.ry7;
import p.lx2;
import p.ts2;
import p.k23;
import p.eo5;
import com.google.common.collect.c;
import p.oi;
import p.a23;
import p.au2;
import p.o13;
import p.z23;
import java.util.Collection;
import p.ys5;
import p.v23;
import p.eb3;
import p.s23;
import p.p23;
import p.o23;
import p.c23;
import p.g23;
import p.n13;
import p.m73;
import p.fu2;
import p.tu2;
import p.hu2;
import p.p33;
import java.util.Map;
import p.h23;
import p.j13;
import p.d23;
import p.b23;
import android.os.Bundle;
import java.util.Set;
import android.os.BaseBundle;
import p.k13;
import p.u33;
import p.cm1;

public final class t33 implements Parcelable$Creator	// class@0026f0 from classes.dex
{
    public final int a;

    public void t33(int p0){
       this.a = p0;
       super();
    }
    public final Object createFromParcel(Parcel p0){
       String str2;
       Bundle uBundle;
       a23 uoa23;
       Parcelable$Creator cREATOR;
       ArrayList uArrayList;
       c uoc;
       String str4;
       int i2;
       er6 uoer6;
       er6 uoer61;
       int b;
       int i5;
       boolean i6;
       boolean i7;
       lw v2;
       ArrayList uArrayList1;
       String str6;
       String str7;
       CallingCode uCallingCode1;
       na5 ona5;
       ra5 ora5;
       boolean b2;
       boolean b6;
       st v23;
       Parcel parcel = p0;
       CallingCode uCallingCode = null;
       String str = "in";
       String str1 = "parcel";
       int i = 0;
       int i1 = 1;
       switch (this.a){
           case 0:
             return new u33(parcel);
           case 1:
             co5.o(parcel, str);
             str2 = p0.readString();
             co5.i(str2);
             n13.v.getClass();
             return k13.a(str2, eo5.K(parcel, a23.CREATOR));
           case 2:
             co5.o(parcel, "source");
             if ((uBundle = parcel.readBundle(au2.class.getClassLoader())) != null) {
                Set set = uBundle.keySet();
                co5.l(set, "bundle.keySet\(\)");
                if ((set.isEmpty() ^ i1)) {
                   a23.b.getClass();
                   uoa23 = new a23(uBundle);
                label_0515 :
                   return uoa23;
                }
             }
             uoa23 = a23.C();
             goto label_0515 ;
             break;
           case 3:
             co5.o(parcel, str);
             str2 = p0.readString();
             String str3 = p0.readString();
             co5.i(str2);
             co5.i(str3);
             c23.t.getClass();
             return b23.a(str2, str3);
           case 4:
             co5.o(parcel, str);
             cREATOR = s23.CREATOR;
             s23 os23 = eo5.K(parcel, cREATOR);
             s23 os231 = eo5.K(parcel, cREATOR);
             g23.c.getClass();
             return d23.a(os23, os231, eo5.E(parcel, cREATOR), p0.readString());
           case 5:
             co5.o(parcel, str);
             cREATOR = a23.CREATOR;
             a23 uoa231 = eo5.K(parcel, cREATOR);
             a23 uoa232 = eo5.K(parcel, cREATOR);
             k23.c.getClass();
             return h23.a(eo5.K(parcel, c23.CREATOR), eo5.K(parcel, o23.CREATOR), eo5.K(parcel, g23.CREATOR), uoa231, uoa232, eo5.K(parcel, cREATOR), eo5.K(parcel, v23.CREATOR), p0.readString(), p0.readString(), eo5.E(parcel, n13.CREATOR), oi.l(p0));
           case 6:
             co5.o(parcel, str);
             o23.c.getClass();
             return new o23(p0.readString(), p0.readString(), p0.readString(), p0.readString());
           case 7:
             co5.o(parcel, str);
             s23.c.getClass();
             return p23.a(p0.readString(), p0.readString(), eo5.K(parcel, a23.CREATOR));
           case 8:
             co5.o(parcel, str);
             str2 = p0.readString();
             if ((uArrayList = p0.createStringArrayList()) != null) {
                uoc = c.o(uArrayList);
                str4 = "copyOf\(strings\)";
             }else {
                uoc = ys5.v;
                str4 = "of\(\)";
             }
             co5.l(uoc, str4);
             v23.c.getClass();
             return new v23(str2, eb3.p(uoc));
             break;
           case 9:
             co5.o(parcel, str);
             a23.b.getClass();
             z23 parcel1 = new z23(p0.readString(), p0.readString(), eo5.K(parcel, k23.CREATOR), oi.l(p0), oi.l(p0), p0.readString(), o13.b(eo5.K(parcel, a23.CREATOR)));
             return parcel;
           case 10:
             return new ts2(parcel);
           case 11:
             return new lx2(parcel);
           case 12:
             if (i2 = p0.readInt()) {
                if (i2 != i1) {
                   if (i2 != 2) {
                      if (i2 == 3) {
                         uoer6 = new er6();
                      }else {
                         throw new IllegalArgumentException();
                      }
                   }else if(p0.readInt()){
                      i2 = true;
                   }else {
                      i2 = false;
                   }
                   uoer61 = new br6(i2);
                label_035a :
                   b = (p0.readInt() == i1)? true: false;
                   int i3 = (p0.readInt() == i1)? 1: 0;
                   int i4 = (p0.readInt() == i1)? 1: 0;
                   i5 = (p0.readInt() == i1)? 1: 0;
                   i6 = (p0.readInt() == i1)? 1: 0;
                   i7 = (p0.readInt() == i1)? 1: 0;
                   uoc = (p0.readInt() == i1)? 1: 0;
                   v2 = new lw(uoer61, b, i3, i4, i5, i6, i7, uoc);
                   return v2;
                }else {
                   uoer6 = new dr6();
                }
             }else {
                uoer6 = new zq6();
             }
             uoer61 = uoer6;
             goto label_035a ;
             break;
           case 13:
             return new sl(parcel);
           case 14:
             co5.o(parcel, str1);
             return new la0(p0.readString(), p0.readString(), p0.readString());
           case 15:
             str = (!p0.readInt())? p0.readString(): uCallingCode;
             if (!p0.readInt()) {
                str1 = p0.readString();
                str1.getClass();
                String str5 = p0.readString();
                str5.getClass();
                uCallingCode = new CallingCode(str1, str5);
             }
             b = p0.readInt();
             uArrayList1 = new ArrayList(b);
             for (; i < b; i = i + 1) {
                str6 = p0.readString();
                str6.getClass();
                str7 = p0.readString();
                str7.getClass();
                uArrayList1.add(new CallingCode(str6, str7));
             }
             return new or(str, uCallingCode, uArrayList1);
             break;
           case 16:
             String str8 = (!p0.readInt())? p0.readString(): uCallingCode;
             Parcelable parcelable = parcel.readParcelable(g.class.getClassLoader());
             if (!p0.readInt()) {
                str1 = p0.readString();
                str1.getClass();
                ona5 = new na5(mu.CREATOR.createFromParcel(parcel), str1, p0.readInt(), p0.readInt());
             }else {
                ona5 = uCallingCode;
             }
             if (!p0.readInt()) {
                str6 = p0.readString();
                str6.getClass();
                ora5 = new ra5(str6);
             }else {
                ora5 = uCallingCode;
             }
             String str9 = (!p0.readInt())? p0.readString(): uCallingCode;
             if (!p0.readInt()) {
                str4 = p0.readString();
             }
             CallingCode uCallingCode2 = str4;
             boolean b1 = (p0.readInt() == i1)? true: false;
             eu v21 = new eu(str8, parcelable, ona5, ora5, str9, uCallingCode2, b1, p0.readLong(), p0.readLong());
             return v2;
             break;
           case 17:
             Parcelable parcelable1 = parcel.readParcelable(nd5.class.getClassLoader());
             Parcelable parcelable2 = parcel.readParcelable(nd5.class.getClassLoader());
             Parcelable parcelable3 = parcel.readParcelable(nd5.class.getClassLoader());
             Parcelable parcelable4 = parcel.readParcelable(nd5.class.getClassLoader());
             ConfigurationResponse uConfigurati = parcel.readParcelable(nd5.class.getClassLoader());
             if (!p0.readInt()) {
                str4 = p0.readString();
             }
             i7 = p0.readInt();
             b2 = (p0.readInt() == i1)? true: false;
             boolean b3 = (p0.readInt() == i1)? true: false;
             boolean b4 = (p0.readInt() == i1)? true: false;
             boolean b5 = (p0.readInt() == i1)? true: false;
             b6 = (p0.readInt() == i1)? true: false;
             nu v22 = new nu(parcelable1, parcelable2, parcelable3, parcelable4, uConfigurati, str4, i7, b2, b3, b4, b5, b6);
             return v2;
             break;
           case 18:
             return new v35(p0.readString(), p0.readString(), p0.readString());
           case 19:
             return new w35(parcel);
           case 20:
             Enum uEnum = Enum.valueOf(ou3.class, p0.readString());
             str6 = p0.readString();
             str7 = p0.readString();
             i6 = (p0.readInt() == i1)? true: false;
             i7 = (p0.readInt() == i1)? true: false;
             b2 = (p0.readInt() == i1)? true: false;
             v23 = new st(uEnum, str6, str7, i6, i7, b2);
             return v2;
             break;
           case 21:
             co5.o(parcel, str1);
             tp2.v(parcel.readValue(AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel.class.getClassLoader()));
             tp2.v(parcel.readValue(AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel.class.getClassLoader()));
             tp2.v(parcel.readValue(AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel.class.getClassLoader()));
             tp2.v(parcel.readValue(AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel.class.getClassLoader()));
             if (p0.readInt()) {
                i = true;
             }
             AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel termsAndPriv = new AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel(i);
             throw uCallingCode;
             break;
           case 22:
             co5.o(parcel, str1);
             return new kw3(p0.readInt(), p0.readInt(), p0.readInt());
           case 23:
             co5.o(parcel, str1);
             int i8 = p0.readInt();
             ArrayList uArrayList2 = new ArrayList(i8);
             for (i2 = 0; i2 != i8; i2 = i2 + 1) {
                uArrayList2.add(lw3.CREATOR.createFromParcel(parcel));
             }
             i5 = tp2.F(p0.readString());
             i8 = p0.readInt();
             ArrayList uArrayList3 = new ArrayList(i8);
             for (i2 = 0; i2 != i8; i2 = i2 + 1) {
                uArrayList3.add(ow3.CREATOR.createFromParcel(parcel));
             }
             String str10 = p0.readString();
             b2 = (p0.readInt())? true: false;
             Object obj = mw3.CREATOR.createFromParcel(parcel);
             Object obj1 = kw3.CREATOR.createFromParcel(parcel);
             Object obj2 = pw3.CREATOR.createFromParcel(parcel);
             b6 = (p0.readInt())? true: false;
             qw3 parcel2 = new qw3(uArrayList2, i5, uArrayList3, str10, b2, obj, obj1, obj2, b6);
             return parcel;
             break;
           case 24:
             co5.o(parcel, str1);
             long l = p0.readLong();
             str = p0.readString();
             b = p0.readInt();
             uArrayList1 = new ArrayList(b);
             for (; i != b; i = i + 1) {
                uArrayList1.add(nw3.CREATOR.createFromParcel(parcel));
             }
             return new lw3(str, l, uArrayList1);
             break;
           case 25:
             co5.o(parcel, str1);
             return new mw3(p0.readString(), p0.readString());
           case 26:
             co5.o(parcel, str1);
             return new nw3(p0.readInt(), p0.readInt());
           case 27:
             co5.o(parcel, str1);
             str4 = p0.readString();
             ArrayList uArrayList4 = p0.createStringArrayList();
             if (p0.readInt()) {
                i = true;
             }
             return new ow3(str4, uArrayList4, i);
             break;
           case 28:
             co5.o(parcel, str1);
             if (p0.readInt()) {
                i = true;
             }
             return new pw3(i, kw3.CREATOR.createFromParcel(parcel));
             break;
           default:
             co5.o(parcel, str1);
             p0.readInt();
             return cm1.a;
       }
    }
    public final Object[] newArray(int p0){
       switch (this.a){
           case 0:
             u33[] ou33Array = new u33[p0];
             return ou33Array;
           case 1:
             n13[] on13Array = new n13[p0];
             return on13Array;
           case 2:
             a23[] uoa23Array = new a23[p0];
             return uoa23Array;
           case 3:
             c23[] uoc23Array = new c23[p0];
             return uoc23Array;
           case 4:
             g23[] og23Array = new g23[p0];
             return og23Array;
           case 5:
             k23[] ok23Array = new k23[p0];
             return ok23Array;
           case 6:
             o23[] oo23Array = new o23[p0];
             return oo23Array;
           case 7:
             s23[] os23Array = new s23[p0];
             return os23Array;
           case 8:
             v23[] ov23Array = new v23[p0];
             return ov23Array;
           case 9:
             z23[] oz23Array = new z23[p0];
             return oz23Array;
           case 10:
             ts2[] ots2Array = new ts2[p0];
             return ots2Array;
           case 11:
             lx2[] olx2Array = new lx2[p0];
             return olx2Array;
           case 12:
             lw[] olwArray = new lw[p0];
             return olwArray;
           case 13:
             sl[] oslArray = new sl[p0];
             return oslArray;
           case 14:
             la0[] ola0Array = new la0[p0];
             return ola0Array;
           case 15:
             or[] oorArray = new or[p0];
             return oorArray;
           case 16:
             eu[] uoeuArray = new eu[p0];
             return uoeuArray;
           case 17:
             nu[] onuArray = new nu[p0];
             return onuArray;
           case 18:
             v35[] ov35Array = new v35[p0];
             return ov35Array;
           case 19:
             w35[] ow35Array = new w35[p0];
             return ow35Array;
           case 20:
             st[] ostArray = new st[p0];
             return ostArray;
           case 21:
             AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel[] termsAndPriv = new AcceptanceDataModel$TermsAndPrivacySeparatedAcceptanceModel[p0];
             return termsAndPriv;
           case 22:
             kw3[] okw3Array = new kw3[p0];
             return okw3Array;
           case 23:
             qw3[] oqw3Array = new qw3[p0];
             return oqw3Array;
           case 24:
             lw3[] olw3Array = new lw3[p0];
             return olw3Array;
           case 25:
             mw3[] omw3Array = new mw3[p0];
             return omw3Array;
           case 26:
             nw3[] onw3Array = new nw3[p0];
             return onw3Array;
           case 27:
             ow3[] oow3Array = new ow3[p0];
             return oow3Array;
           case 28:
             pw3[] opw3Array = new pw3[p0];
             return opw3Array;
           default:
             cm1[] uocm1Array = new cm1[p0];
             return uocm1Array;
       }
    }
}
