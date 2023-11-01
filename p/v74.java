package p.v74;
import android.os.Parcelable$Creator;
import java.lang.Object;
import android.os.Parcel;
import p.i60;
import java.lang.String;
import p.ht;
import p.d;
import java.lang.ClassLoader;
import java.lang.Class;
import android.os.Parcelable;
import p.c;
import com.spotify.login.signupapi.services.model.ConfigurationResponse;
import p.ft;
import java.io.Serializable;
import p.r45;
import p.kt;
import p.ei2;
import java.lang.Enum;
import p.nr;
import java.util.Calendar;
import p.co5;
import p.uk7;
import p.r12;
import p.w87;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.TriggerType;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.FormatType;
import java.util.LinkedHashMap;
import p.jg0;
import java.util.AbstractMap;
import p.u73;
import java.util.HashMap;
import com.spotify.messaging.inappmessaging.inappmessagingsdk.domain.models.ActionType;
import p.w74;
import com.spotify.messaging.criticalmessaging.criticalmessagingview.models.ViewType;
import p.yr0;

public final class v74 implements Parcelable$Creator	// class@002998 from classes.dex
{
    public final int a;

    public void v74(int p0){
       this.a = p0;
       super();
    }
    public final Object createFromParcel(Parcel p0){
       w74 v2;
       String str8;
       Object obj = p0;
       Calendar uCalendar = null;
       String str = "parcel";
       boolean b = false;
       int i = 1;
       switch (this.a){
           case 0:
             co5.o(obj, str);
             long l = p0.readLong();
             String str1 = p0.readString();
             long l1 = p0.readLong();
             String str2 = p0.readString();
             String str3 = p0.readString();
             String str4 = p0.readString();
             ViewType viewType = ViewType.valueOf(p0.readString());
             boolean b1 = (p0.readInt())? true: false;
             String str5 = p0.readString();
             boolean b2 = (p0.readInt())? true: false;
             v2 = new w74(l, str1, l1, str2, str3, str4, viewType, b1, str5, b2);
             return v2;
             break;
           case 1:
             co5.o(obj, str);
             ActionType uActionType = ActionType.valueOf(p0.readString());
             str = p0.readString();
             String str6 = p0.readString();
             if (p0.readInt()) {
                b = true;
             }
             return new jg0(uActionType, str, str6, b);
             break;
           case 2:
             co5.o(obj, str);
             String str7 = p0.readString();
             int i1 = p0.readInt();
             LinkedHashMap linkedHashMa = new LinkedHashMap(i1);
             while (true) {
                str8 = p0.readString();
                if (b != i1) {
                   linkedHashMa.put(str8, jg0.CREATOR.createFromParcel(obj));
                   b = b + 1;
                }else {
                   break ;
                }
             }
             u73 obj1 = new u73(str7, linkedHashMa, str8, p0.readString(), p0.readString(), FormatType.valueOf(p0.readString()));
             return obj;
             break;
           case 3:
             co5.o(obj, str);
             return new w87(p0.readString(), TriggerType.valueOf(p0.readString()), FormatType.valueOf(p0.readString()));
           case 4:
             co5.o(obj, str);
             return new r12(p0.readString());
           case 5:
             co5.o(obj, str);
             return new uk7(p0.readString());
           case 6:
             if (!p0.readInt()) {
                uCalendar = p0.readSerializable();
             }
             if (p0.readInt() == i) {
                b = true;
             }
             return new nr(uCalendar, b, p0.readInt());
             break;
           case 7:
             Enum uEnum = Enum.valueOf(ei2.class, p0.readString());
             boolean b3 = (p0.readInt() == i)? true: false;
             boolean b4 = (p0.readInt() == i)? true: false;
             boolean b5 = (p0.readInt() == i)? true: false;
             boolean b6 = (p0.readInt() == i)? true: false;
             kt v21 = new kt(uEnum, b3, b4, b5, b6);
             return v2;
             break;
           case 8:
             return new ft(p0.readSerializable(), p0.readString(), p0.readString(), p0.readString());
           case 9:
             str = (p0.readInt() == i)? 1: 0;
             c uoc = obj.readParcelable(d.class.getClassLoader());
             Parcelable parcelable = obj.readParcelable(d.class.getClassLoader());
             if (!p0.readInt()) {
                uCalendar = p0.readString();
             }
             Calendar uCalendar1 = uCalendar;
             obj = (p0.readInt() == i)? 1: 0;
             ht v8 = new ht(str, uoc, parcelable, uCalendar1, obj);
             return v8;
             break;
           case 10:
             return p0.readString();
           case 11:
             return new i60(obj);
           default:
             return new yr0(obj);
       }
    }
    public final Object[] newArray(int p0){
       switch (this.a){
           case 0:
             w74[] ow74Array = new w74[p0];
             return ow74Array;
           case 1:
             jg0[] ojg0Array = new jg0[p0];
             return ojg0Array;
           case 2:
             u73[] ou73Array = new u73[p0];
             return ou73Array;
           case 3:
             w87[] ow87Array = new w87[p0];
             return ow87Array;
           case 4:
             r12[] or12Array = new r12[p0];
             return or12Array;
           case 5:
             uk7[] ouk7Array = new uk7[p0];
             return ouk7Array;
           case 6:
             nr[] onrArray = new nr[p0];
             return onrArray;
           case 7:
             kt[] oktArray = new kt[p0];
             return oktArray;
           case 8:
             ft[] uoftArray = new ft[p0];
             return uoftArray;
           case 9:
             ht[] ohtArray = new ht[p0];
             return ohtArray;
           case 10:
             String[] stringArray = new String[p0];
             return stringArray;
           case 11:
             i60[] oi60Array = new i60[p0];
             return oi60Array;
           default:
             yr0[] oyr0Array = new yr0[p0];
             return oyr0Array;
       }
    }
}
