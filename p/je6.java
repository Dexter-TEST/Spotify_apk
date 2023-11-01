package p.je6;
import java.util.concurrent.Callable;
import p.ke6;
import p.le6;
import java.lang.Object;
import p.ge6;
import p.wf2;
import java.util.UUID;
import java.nio.ByteBuffer;
import java.lang.String;
import android.util.Base64;
import p.co5;
import java.lang.Class;
import p.aq6;
import p.td7;
import java.lang.StringBuilder;
import java.lang.Enum;
import java.lang.IllegalArgumentException;
import java.util.LinkedHashMap;
import java.util.Map;
import com.spotify.share.linkgeneration.proto.UtmParameters;
import java.util.Set;
import java.util.Iterator;
import java.util.Map$Entry;
import android.net.Uri;
import android.net.Uri$Builder;
import p.he6;

public final class je6 implements Callable	// class@001abf from classes.dex
{
    public final ke6 a;
    public final le6 b;

    public void je6(ke6 p0,le6 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object call(){
       int i3;
       String str2;
       le6 b;
       int i4;
       String str3;
       le6 d;
       Iterator iterator;
       String key1;
       je6 ta = this.a;
       UUID uUID = ta.a.a.invoke();
       int i = 16;
       byte[] uobyteArray = new byte[i];
       ByteBuffer uByteBuffer = ByteBuffer.wrap(uobyteArray);
       uByteBuffer.putLong(uUID.getMostSignificantBits());
       uByteBuffer.putLong(uUID.getLeastSignificantBits());
       byte[] uobyteArray1 = uByteBuffer.array();
       String str = Base64.encodeToString(uobyteArray1, 9);
       co5.l(str, "encodeToString\(bytes.arr…DDING or Base64.URL_SAFE\)");
       je6 tb = this.b;
       ta.b.getClass();
       aq6 uoaq6 = td7.d(tb.a);
       int i1 = 1;
       int i2 = 0;
       if (uoaq6 != null) {
          String str1 = "https://open.spotify.com"+uoaq6.toString().replaceFirst("^spotify", "").replace(':', '/');
          if ((i3 = uoaq6.b.ordinal()) != i1 && (i3 != 2 && (i3 != 3 && (i3 != 5 && (i3 != 6 && (i3 != 7 && (i3 != 14 && (i3 != i && (i3 != 18 && i3 != 29))))))))) {
             if (i3 != 56) {
                if (i3 != 62 && i3 != 73) {
                   if (i3 != 75) {
                      if (i3 != 23 && (i3 != 24 && (i3 != 51 && i3 != 52))) {
                         switch (i3){
                             case 9:
                             case 10:
                               break;
                             case 11:
                               str2 = str1.replaceFirst("playlists", "collection/playlists");
                               break;
                             default:
                               switch (i3){
                                   case '@':
                                   case 'B':
                                   case 'C':
                                   case 'D':
                                   case 'A':
                                     break;
                                   default:
                                     Object[] objArray = new Object[i1];
                                     objArray[i2] = str1;
                                     throw new IllegalArgumentException(String.format("Unable to turn uri into string: %s", objArray));
                               }
                         }
                      }
                   }else {
                      str2 = str1.replaceFirst("home", "browse/featured");
                   }
                }
             }else {
                str1 = str1.replaceFirst("original-content", "original");
             }
          }
          str2 = str1;
       }else {
          str2 = null;
       }
       le6 a = tb.a;
       if (str2 != null) {
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          linkedHashMa.put("si", str);
          Map$Entry uEntry = ((b = tb.b) != null && b.length())? 0: 1;
          if (!i4) {
             linkedHashMa.put("context", b);
          }
          if ((b = tb.c) != null) {
             uEntry = ((str3 = b.i()) != null && str3.length())? 0: 1;
             if (!str3) {
                linkedHashMa.put("utm_source", b.i());
             }
             uEntry = ((str3 = b.h()) != null && str3.length())? 0: 1;
             if (!str3) {
                linkedHashMa.put("utm_medium", b.h());
             }
             uEntry = ((str3 = b.f()) != null && str3.length())? 0: 1;
             if (!str3) {
                linkedHashMa.put("utm_campaign", b.f());
             }
             uEntry = ((str3 = b.g()) != null && str3.length())? 0: 1;
             if (!str3) {
                linkedHashMa.put("utm_content", b.g());
             }
             uEntry = ((str3 = b.j()) != null && str3.length())? 0: 1;
             if (!str3) {
                linkedHashMa.put("utm_term", b.j());
             }
          }
          if ((d = tb.d) != null) {
             LinkedHashMap linkedHashMa1 = new LinkedHashMap();
             iterator = d.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                String key = uEntry.getKey();
                String value = uEntry.getValue();
                int i5 = (key.length() > 0)? 1: 0;
                if (i5) {
                   value = (value.length() > 0)? 1: 0;
                   if (value && !linkedHashMa.containsKey(key)) {
                      key = 1;
                   label_01d4 :
                      if (key) {
                         linkedHashMa1.put(uEntry.getKey(), uEntry.getValue());
                      }
                   }
                }
                key = 0;
                goto label_01d4 ;
             }
             iterator = linkedHashMa1.entrySet().iterator();
             while (iterator.hasNext()) {
                uEntry = iterator.next();
                key1 = uEntry.getKey();
                linkedHashMa.put(key1, uEntry.getValue());
             }
          }
          Uri$Builder uBuilder = Uri.parse(str2).buildUpon();
          iterator = linkedHashMa.entrySet().iterator();
          while (iterator.hasNext()) {
             uEntry = iterator.next();
             key1 = uEntry.getKey();
             uBuilder.appendQueryParameter(key1, uEntry.getValue());
          }
          str2 = uBuilder.build().toString();
          co5.l(str2, "builder.build\(\).toString\(\)");
          return new he6(str2, str, a);
       }else {
          throw new IllegalArgumentException("Invalid uri "+a);
       }
    }
}
