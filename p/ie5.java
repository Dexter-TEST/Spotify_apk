package p.ie5;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;
import p.vb4;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import p.iq6;
import p.vk;
import com.spotify.allboarding.entrypoint.EntryPoint;
import p.wa;
import p.ls6;
import p.n46;
import java.util.ArrayList;
import p.h9;
import java.util.List;
import p.g9;
import p.sl6;
import p.f9;
import p.e9;
import p.d9;
import p.c9;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import p.b9;
import p.de5;
import p.a9;
import p.z8;
import p.y8;
import p.nr0;
import p.x8;
import p.w8;
import p.v8;
import p.u8;
import p.t8;
import p.c5;
import p.m46;
import p.l46;
import p.j46;
import p.k5;
import p.k46;
import p.i46;
import p.h46;
import p.g46;
import p.f46;
import p.e46;
import p.je5;
import java.lang.Integer;
import p.mu;
import java.io.Serializable;
import p.i80;
import p.a27;
import p.r75;
import p.ii2;
import com.google.protobuf.c;
import p.yx1;
import com.spotify.login5.v3.proto.Challenges;
import com.spotify.login5.v3.identifiers.proto.PhoneNumber;
import java.lang.AssertionError;

public final class ie5 implements Parcelable$Creator	// class@00197a from classes.dex
{
    public final int a;

    public void ie5(int p0){
       this.a = p0;
       super();
    }
    public final Object createFromParcel(Parcel p0){
       String str1;
       int i1;
       iq6 obj1;
       String obj2;
       String obj3;
       ArrayList uArrayList1;
       int i4;
       boolean b1;
       String obj5;
       int i5;
       ArrayList uArrayList3;
       ArrayList uArrayList4;
       Parcelable parcelable;
       ArrayList uArrayList7;
       ii2 obj = p0;
       k5 ok5 = null;
       boolean b = true;
       int i = 0;
       String str = "parcel";
       switch (this.a){
           case 0:
             co5.o(obj, str);
             str1 = p0.readString();
             str = p0.readString();
             if (!p0.readInt()) {
                b = false;
             }
             return new je5(str1, str, b);
             break;
           case 1:
             co5.o(obj, str);
             str = p0.readString();
             String str2 = p0.readString();
             i1 = p0.readInt();
             ArrayList uArrayList = new ArrayList(i1);
             for (int i2 = 0; i2 != i1; i2 = i2 + 1) {
                uArrayList.add(obj.readParcelable(e46.class.getClassLoader()));
             }
             i1 = (!p0.readInt())? ok5: SearchConfiguration.CREATOR.createFromParcel(obj);
             obj1 = i1;
             i1 = (!p0.readInt())? ok5: k5.CREATOR.createFromParcel(obj);
             obj2 = i1;
             i1 = (!p0.readInt())? ok5: k5.CREATOR.createFromParcel(obj);
             obj3 = i1;
             int i3 = p0.readInt();
             i1 = p0.readInt();
             uArrayList1 = new ArrayList(i1);
             for (i4 = 0; i4 != i1; i4 = i4 + 1) {
                uArrayList1.add(je5.CREATOR.createFromParcel(obj));
             }
             ArrayList uArrayList2 = p0.createStringArrayList();
             sl6 osl6 = sl6.valueOf(p0.readString());
             b1 = (p0.readInt())? true: false;
             if (p0.readInt()) {
                ok5 = Integer.valueOf(p0.readInt());
             }
             e46 obj4 = new e46(str, str2, uArrayList, obj1, obj2, obj3, i3, uArrayList1, uArrayList2, osl6, b1, ok5);
             return obj;
             break;
           case 2:
             co5.o(obj, str);
             obj5 = p0.readString();
             i5 = p0.readInt();
             uArrayList3 = new ArrayList(i5);
             for (; i != i5; i = i + 1) {
                uArrayList3.add(obj.readParcelable(f46.class.getClassLoader()));
             }
             return new f46(obj5, uArrayList3);
             break;
           case 3:
             co5.o(obj, str);
             p0.readInt();
             return g46.a;
           case 4:
             co5.o(obj, str);
             p0.readInt();
             return h46.a;
           case 5:
             co5.o(obj, str);
             p0.readInt();
             return i46.a;
           case 6:
             co5.o(obj, str);
             obj5 = p0.readString();
             if (!p0.readInt()) {
                b = false;
             }
             int i6 = p0.readInt();
             uArrayList4 = new ArrayList(i6);
             for (; i != i6; i = i + 1) {
                uArrayList4.add(j46.CREATOR.createFromParcel(obj));
             }
             if (p0.readInt()) {
                ok5 = k5.CREATOR.createFromParcel(obj);
             }
             return new k46(obj5, b, uArrayList4, ok5);
             break;
           case 7:
             co5.o(obj, str);
             str1 = p0.readString();
             str = p0.readString();
             if (!p0.readInt()) {
                b = false;
             }
             return new j46(str1, str, b);
             break;
           case 8:
             co5.o(obj, str);
             obj5 = p0.readString();
             i5 = p0.readInt();
             uArrayList3 = new ArrayList(i5);
             for (; i != i5; i = i + 1) {
                uArrayList3.add(obj.readParcelable(l46.class.getClassLoader()));
             }
             return new l46(obj5, uArrayList3);
             break;
           case 9:
             co5.o(obj, str);
             p0.readInt();
             return m46.a;
           case 10:
             co5.o(obj, str);
             return new SearchConfiguration(p0.readString(), p0.readString(), p0.readString());
           case 11:
             co5.o(obj, str);
             obj2 = p0.readString();
             obj3 = p0.readString();
             i1 = p0.readInt();
             ArrayList uArrayList5 = new ArrayList(i1);
             for (i5 = 0; i5 != i1; i5 = i5 + 1) {
                uArrayList5.add(iq6.CREATOR.createFromParcel(obj));
             }
             uArrayList1 = p0.createStringArrayList();
             i4 = p0.readInt();
             String str3 = p0.readString();
             b1 = (p0.readInt())? true: false;
             String str4 = p0.readString();
             String str5 = p0.readString();
             boolean b2 = (p0.readInt())? true: false;
             obj1 = new iq6(obj2, obj3, uArrayList5, uArrayList1, i4, str3, b1, str4, str5, b2);
             return obj;
             break;
           case 12:
             co5.o(obj, str);
             String str6 = p0.readString();
             c5 uoc5 = obj.readParcelable(ls6.class.getClassLoader());
             parcelable = obj.readParcelable(ls6.class.getClassLoader());
             k5 ok51 = (!p0.readInt())? ok5: ls6.CREATOR.createFromParcel(obj);
             k5 ok52 = ok51;
             if (p0.readInt()) {
                ok5 = ls6.CREATOR.createFromParcel(obj);
             }
             ls6 v2 = new ls6(str6, uoc5, parcelable, ok52, ok5);
             return v2;
             break;
           case 13:
             co5.o(obj, str);
             return new t8(p0.readString());
           case 14:
             co5.o(obj, str);
             p0.readInt();
             return u8.a;
           case 15:
             co5.o(obj, str);
             nr0 onr0 = obj.readParcelable(v8.class.getClassLoader());
             if (!p0.readInt()) {
                b = false;
             }
             return new v8(onr0, b);
             break;
           case 16:
             co5.o(obj, str);
             return new w8(obj.readParcelable(w8.class.getClassLoader()));
           case 17:
             co5.o(obj, str);
             return new x8(EntryPoint.valueOf(p0.readString()));
           case 18:
             co5.o(obj, str);
             parcelable = obj.readParcelable(y8.class.getClassLoader());
             String str7 = p0.readString();
             ArrayList uArrayList6 = p0.createStringArrayList();
             i5 = p0.readInt();
             uArrayList7 = new ArrayList(i5);
             for (; i != i5; i = i + 1) {
                uArrayList7.add(obj.readParcelable(y8.class.getClassLoader()));
             }
             y8 obj6 = new y8(parcelable, str7, uArrayList6, uArrayList7, p0.readString());
             return obj;
             break;
           case 19:
             co5.o(obj, str);
             str1 = p0.readString();
             if (!p0.readInt()) {
                b = false;
             }
             return new z8(str1, b);
             break;
           case 20:
             co5.o(obj, str);
             return new a9(p0.readString());
           case 21:
             co5.o(obj, str);
             return new b9(p0.readString(), obj.readParcelable(b9.class.getClassLoader()), p0.readInt());
           case 22:
             co5.o(obj, str);
             return new c9(p0.readString(), obj.readParcelable(c9.class.getClassLoader()));
           case 23:
             co5.o(obj, str);
             str = p0.readString();
             uArrayList4 = p0.createStringArrayList();
             if (!p0.readInt()) {
                b = false;
             }
             if (p0.readInt()) {
                ok5 = EntryPoint.valueOf(p0.readString());
             }
             return new d9(str, uArrayList4, b, ok5);
             break;
           case 24:
             co5.o(obj, str);
             return new e9(p0.readString(), p0.readInt(), p0.readString());
           case 25:
             co5.o(obj, str);
             p0.readInt();
             return f9.a;
           case 26:
             co5.o(obj, str);
             return new g9(sl6.valueOf(p0.readString()), p0.readString());
           case 27:
             co5.o(obj, str);
             if (p0.readInt()) {
                ok5 = EntryPoint.valueOf(p0.readString());
             }
             k5 ok53 = ok5;
             wa owa = wa.class;
             Parcelable parcelable1 = obj.readParcelable(owa.getClassLoader());
             Parcelable parcelable2 = obj.readParcelable(owa.getClassLoader());
             i5 = p0.readInt();
             uArrayList7 = new ArrayList(i5);
             for (; i != i5; i = i + 1) {
                uArrayList7.add(obj.readParcelable(owa.getClassLoader()));
             }
             wa obj7 = new wa(ok53, parcelable1, parcelable2, uArrayList7, obj.readParcelable(owa.getClassLoader()));
             return obj;
             break;
           case 28:
             co5.o(obj, str);
             return new vb4(p0.readString(), obj.readParcelable(vb4.class.getClassLoader()), obj.readParcelable(vb4.class.getClassLoader()));
           default:
             i80 oi80 = p0.readSerializable();
             e14 t = mu.t;
             try{
                t.getClass();
                a27 b3 = t.b;
                ii2 oii2 = p0.createByteArray();
                b3.getClass();
                yx1 b4 = ii2.b;
                c uoc = c.access$200(b3.a, oii2, i, oii2.length, b4);
                ii2.a(uoc);
                e14 v = mu.v;
                try{
                   v.getClass();
                   a27 b5 = v.b;
                   obj = p0.createByteArray();
                   b5.getClass();
                   c uoc1 = c.access$200(b5.a, obj, i, obj.length, b4);
                   ii2.a(uoc1);
                   return new mu(oi80, uoc, uoc1);
                }catch(p.rc3 e0){
                   throw new AssertionError(e0);
                }
             }catch(p.rc3 e0){
                throw new AssertionError(e0);
             }
       }
    }
    public final Object[] newArray(int p0){
       switch (this.a){
           case 0:
             je5[] oje5Array = new je5[p0];
             return oje5Array;
           case 1:
             e46[] uoe46Array = new e46[p0];
             return uoe46Array;
           case 2:
             f46[] uof46Array = new f46[p0];
             return uof46Array;
           case 3:
             g46[] og46Array = new g46[p0];
             return og46Array;
           case 4:
             h46[] oh46Array = new h46[p0];
             return oh46Array;
           case 5:
             i46[] oi46Array = new i46[p0];
             return oi46Array;
           case 6:
             k46[] ok46Array = new k46[p0];
             return ok46Array;
           case 7:
             j46[] oj46Array = new j46[p0];
             return oj46Array;
           case 8:
             l46[] ol46Array = new l46[p0];
             return ol46Array;
           case 9:
             m46[] om46Array = new m46[p0];
             return om46Array;
           case 10:
             SearchConfiguration[] searchConfig = new SearchConfiguration[p0];
             return searchConfig;
           case 11:
             iq6[] oiq6Array = new iq6[p0];
             return oiq6Array;
           case 12:
             ls6[] ols6Array = new ls6[p0];
             return ols6Array;
           case 13:
             t8[] ot8Array = new t8[p0];
             return ot8Array;
           case 14:
             u8[] ou8Array = new u8[p0];
             return ou8Array;
           case 15:
             v8[] ov8Array = new v8[p0];
             return ov8Array;
           case 16:
             w8[] ow8Array = new w8[p0];
             return ow8Array;
           case 17:
             x8[] ox8Array = new x8[p0];
             return ox8Array;
           case 18:
             y8[] oy8Array = new y8[p0];
             return oy8Array;
           case 19:
             z8[] oz8Array = new z8[p0];
             return oz8Array;
           case 20:
             a9[] uoa9Array = new a9[p0];
             return uoa9Array;
           case 21:
             b9[] uob9Array = new b9[p0];
             return uob9Array;
           case 22:
             c9[] uoc9Array = new c9[p0];
             return uoc9Array;
           case 23:
             d9[] uod9Array = new d9[p0];
             return uod9Array;
           case 24:
             e9[] uoe9Array = new e9[p0];
             return uoe9Array;
           case 25:
             f9[] uof9Array = new f9[p0];
             return uof9Array;
           case 26:
             g9[] og9Array = new g9[p0];
             return og9Array;
           case 27:
             wa[] owaArray = new wa[p0];
             return owaArray;
           case 28:
             vb4[] ovb4Array = new vb4[p0];
             return ovb4Array;
           default:
             mu[] omuArray = new mu[p0];
             return omuArray;
       }
    }
}
