package p.g44;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import java.lang.String;
import p.co5;
import p.ca1;
import p.e11;
import p.ml5;
import p.qm2;
import p.oz1;
import p.ny1;
import p.bq;
import p.aq;
import p.yp;
import p.a3;
import java.util.LinkedHashMap;
import java.util.Map;
import p.x54;
import androidx.versionedparcelable.ParcelImpl;
import p.rq6;
import p.qq6;
import p.sk3;
import p.rf4;
import androidx.fragment.app.q;
import p.be2;
import p.wd2;
import p.rw;
import androidx.fragment.app.b;
import p.oh4;
import p.kh;
import p.lb3;
import android.content.IntentSender;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import android.content.Intent;
import p.y6;
import p.zx5;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.media.MediaDescription;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import p.fa1;

public final class g44 implements Parcelable$Creator	// class@00169a from classes.dex
{
    public final int a;

    public void g44(int p0){
       this.a = p0;
       super();
    }
    public final Object createFromParcel(Parcel p0){
       String str = "parcel";
       String str1 = "inParcel";
       String str2 = "source";
       switch (this.a){
           case 0:
             return new MediaBrowserCompat$MediaItem(p0);
           case 1:
             return MediaDescriptionCompat.a(MediaDescription.CREATOR.createFromParcel(p0));
           case 2:
             return new MediaMetadataCompat(p0);
           case 3:
             return new RatingCompat(p0.readFloat(), p0.readInt());
           case 4:
             return new zx5(p0);
           case 5:
             return new y6(p0);
           case 6:
             co5.o(p0, str1);
             Parcelable parcelable = p0.readParcelable(IntentSender.class.getClassLoader());
             co5.i(parcelable);
             return new lb3(parcelable, p0.readParcelable(Intent.class.getClassLoader()), p0.readInt(), p0.readInt());
           case 7:
             return new kh(p0);
           case 8:
             return new oh4(p0);
           case 9:
             return new b(p0);
           case 10:
             return new rw(p0);
           case 11:
             return new wd2(p0);
           case 12:
             return new be2(p0);
           case 13:
             return new q(p0);
           case 14:
             co5.o(p0, str1);
             return new rf4(p0);
           case 15:
             return new sk3(p0);
           case 16:
             return new qq6(p0);
           case 17:
             return new rq6(p0);
           case 18:
             return new ParcelImpl(p0);
           case 19:
             String str3 = p0.readString();
             co5.i(str3);
             int i = p0.readInt();
             LinkedHashMap linkedHashMa = new LinkedHashMap(i);
             for (int i1 = 0; i1 < i; i1 = i1 + 1) {
                String str4 = p0.readString();
                co5.i(str4);
                String str5 = p0.readString();
                co5.i(str5);
                linkedHashMa.put(str4, str5);
             }
             return new x54(str3, linkedHashMa);
             break;
           case 20:
             co5.o(p0, str2);
             return new a3(p0);
           case 21:
             co5.o(p0, str2);
             return new yp(p0);
           case 22:
             co5.o(p0, str2);
             return new aq(p0);
           case 23:
             co5.o(p0, str2);
             return new bq(p0);
           case 24:
             co5.o(p0, str);
             oz1 v0 = new oz1(p0.readInt(), p0.readInt(), p0.readInt(), p0.readString(), p0.readString(), p0.readString(), p0.readString(), null, null, false);
             return v0;
           case 25:
             co5.o(p0, str2);
             return new qm2(p0);
           case 26:
             co5.o(p0, str2);
             return new ml5(p0);
           case 27:
             co5.o(p0, str2);
             return new e11(p0);
           case 28:
             co5.o(p0, str);
             return new ca1(p0);
           default:
             co5.o(p0, str2);
             return new fa1(p0);
       }
    }
    public final Object[] newArray(int p0){
       switch (this.a){
           case 0:
             MediaBrowserCompat$MediaItem[] mediaItemArr = new MediaBrowserCompat$MediaItem[p0];
             return mediaItemArr;
           case 1:
             MediaDescriptionCompat[] mediaDescrip = new MediaDescriptionCompat[p0];
             return mediaDescrip;
           case 2:
             MediaMetadataCompat[] mediaMetadat = new MediaMetadataCompat[p0];
             return mediaMetadat;
           case 3:
             RatingCompat[] ratingCompat = new RatingCompat[p0];
             return ratingCompat;
           case 4:
             zx5[] ozx5Array = new zx5[p0];
             return ozx5Array;
           case 5:
             y6[] oy6Array = new y6[p0];
             return oy6Array;
           case 6:
             lb3[] olb3Array = new lb3[p0];
             return olb3Array;
           case 7:
             kh[] okhArray = new kh[p0];
             return okhArray;
           case 8:
             oh4[] ooh4Array = new oh4[p0];
             return ooh4Array;
           case 9:
             b[] uobArray = new b[p0];
             return uobArray;
           case 10:
             rw[] orwArray = new rw[p0];
             return orwArray;
           case 11:
             wd2[] owd2Array = new wd2[p0];
             return owd2Array;
           case 12:
             be2[] uobe2Array = new be2[p0];
             return uobe2Array;
           case 13:
             q[] oqArray = new q[p0];
             return oqArray;
           case 14:
             rf4[] orf4Array = new rf4[p0];
             return orf4Array;
           case 15:
             sk3[] osk3Array = new sk3[p0];
             return osk3Array;
           case 16:
             qq6[] oqq6Array = new qq6[p0];
             return oqq6Array;
           case 17:
             rq6[] orq6Array = new rq6[p0];
             return orq6Array;
           case 18:
             ParcelImpl[] parcelImplAr = new ParcelImpl[p0];
             return parcelImplAr;
           case 19:
             x54[] ox54Array = new x54[p0];
             return ox54Array;
           case 20:
             a3[] uoa3Array = new a3[p0];
             return uoa3Array;
           case 21:
             yp[] oypArray = new yp[p0];
             return oypArray;
           case 22:
             aq[] uoaqArray = new aq[p0];
             return uoaqArray;
           case 23:
             bq[] uobqArray = new bq[p0];
             return uobqArray;
           case 24:
             oz1[] ooz1Array = new oz1[p0];
             return ooz1Array;
           case 25:
             qm2[] oqm2Array = new qm2[p0];
             return oqm2Array;
           case 26:
             ml5[] oml5Array = new ml5[p0];
             return oml5Array;
           case 27:
             e11[] uoe11Array = new e11[p0];
             return uoe11Array;
           case 28:
             ca1[] uoca1Array = new ca1[p0];
             return uoca1Array;
           default:
             fa1[] uofa1Array = new fa1[p0];
             return uofa1Array;
       }
    }
}
