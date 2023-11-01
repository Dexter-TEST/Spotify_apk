package p.ga1;
import p.cu1;
import java.lang.Object;
import java.lang.String;
import p.u65;
import p.et0;
import com.google.protobuf.c;
import p.m56;
import java.lang.Class;
import p.n56;
import p.kg4;
import p.k56;
import com.spotify.contexts.Sdk;
import com.google.protobuf.b;
import p.pa3;
import com.spotify.contexts.InstallationId;
import p.li5;
import p.i80;
import p.h80;
import p.y91;
import com.spotify.contexts.DeviceAndroid;
import android.os.Build;
import android.os.Build$VERSION;
import p.oe7;
import p.tg0;
import com.spotify.liteinstrumentation.instrumentation.contexts.proto.ClientId;
import p.ay;
import p.wx;
import p.ap5;
import java.lang.StringBuilder;
import p.en6;
import java.util.Arrays;
import java.lang.IllegalStateException;
import java.lang.Character;
import p.xe7;
import p.xx;

public final class ga1 implements cu1	// class@0016cc from classes.dex
{
    public final int a;
    public final Object b;

    public void ga1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final String a(){
       switch (this.a){
           case 0:
             return "context_device_android";
           case 1:
             return "context_installation_id";
           case 2:
             return "context_sdk";
           default:
             return "context_client_id";
       }
    }
    public final u65 b(){
       switch (this.a){
           case 0:
             return et0.a(this);
           case 1:
             return et0.a(this);
           case 2:
             return et0.a(this);
           default:
             return et0.a(this);
       }
    }
    public final c c(){
       byte[] bytes;
       ay c;
       byte i4;
       byte i5;
       wx owx;
       byte[] uobyteArray;
       int i = 0;
       switch (this.a){
           case 0:
             y91 oy91 = DeviceAndroid.l();
             oy91.d(Build.MANUFACTURER);
             oy91.f(Build$VERSION.RELEASE);
             oy91.g(Build$VERSION.SDK_INT);
             oy91.e(Build.MODEL);
             oy91.c(this.b.j());
             return oy91.build();
           case 1:
             pa3 opa3 = InstallationId.g();
             bytes = this.b.d().getBytes();
             opa3.c(i80.c(bytes, i, bytes.length));
             return opa3.build();
           case 2:
             this.b.getClass();
             this.b.getClass();
             String str = (this.b.a != null)? "1.1.0-essopt-bs": "1.1.0-essopt";
             if (this.b.b != null) {
                str = str.concat("-startupsend");
             }
             if (this.b.c != null) {
                str = kg4.l(str, "-onlinesend");
             }
             if (this.b.d != null) {
                str = kg4.l(str, "-dynamicmixedauth");
             }
             this.b.getClass();
             if (this.b.e != null) {
                str = kg4.l(str, "-sendonbcd");
             }
             k56 ok56 = Sdk.h();
             ok56.d(str);
             ok56.c();
             return ok56.build();
             break;
           default:
             tg0 otg0 = ClientId.g();
             xx e = ay.e;
             if ((c = e.c) == null) {
                c = e.a;
                wx b = c.b;
                int len = b.length;
                int i1 = 0;
                while (true) {
                   int i2 = 90;
                   int i3 = 65;
                   if (i1 < len) {
                      char c1 = ((c1 = b[i1]) >= i3 && c1 <= i2)? 1: 0;
                      if (c1) {
                         len = 1;
                      label_00ea :
                         if (len) {
                            len = b.length;
                            i1 = 0;
                            while (true) {
                               if (i1 < len) {
                                  c1 = ((c1 = b[i1]) >= 'a' && c1 <= 'z')? 1: 0;
                                  if (c1) {
                                     len = 1;
                                  label_0107 :
                                     ap5.j("Cannot call lowerCase\(\) on a mixed-case alphabet", (len ^ 1));
                                     char[] uocharArray = new char[b.length];
                                     for (i1 = 0; i1 < b.length; i1 = i1 + 1) {
                                        i4 = ((c1 = b[i1]) >= i3 && c1 <= i2)? 1: 0;
                                        if (i4) {
                                           i5 = c1 ^ 0x20;
                                           c1 = (char)i5;
                                        }
                                        uocharArray[i1] = c1;
                                     }
                                     b = new wx(en6.p("", c.a, ".lowerCase\(\)"), uocharArray);
                                     if (c.i != null && b.i == null) {
                                        owx = b.g;
                                        uobyteArray = Arrays.copyOf(owx, owx.length);
                                        while (true) {
                                           if (i3 <= i2) {
                                              i1 = i3 | 0x20;
                                              i5 = owx[i3];
                                              i4 = owx[i1];
                                              int i6 = -1;
                                              if (i5 == i6) {
                                                 uobyteArray[i3] = i4;
                                              }else if(i4 == i6){
                                                 i4 = 1;
                                              }else {
                                                 i4 = 0;
                                              }
                                              char c2 = (char)i3;
                                              char c3 = (char)i1;
                                              if (i4) {
                                                 uobyteArray[i1] = i5;
                                              }else {
                                                 Object[] objArray = new Object[]{Character.valueOf(c2),Character.valueOf(c3)};
                                                 throw new IllegalStateException(xe7.E("Can\'t ignoreCase\(\) since \'%s\' and \'%s\' encode different values", objArray));
                                              }
                                              i3 = i3 + 1;
                                           }else {
                                              owx = new wx(en6.p("", b.a, ".ignoreCase\(\)"), b.b, uobyteArray, 1);
                                           }
                                        }
                                     }else {
                                        owx = b;
                                     }
                                  }else {
                                     i1 = i1 + 1;
                                  }
                               }else {
                                  len = 0;
                                  goto label_0107 ;
                               }
                            }
                         }
                         c = (c == e.a)? e: new xx(c);
                         e.c = c;
                         break ;
                      }else {
                         i1 = i1 + 1;
                      }
                   }else {
                      uobyteArray = 0;
                      goto label_00ea ;
                   }
                }
             }
             bytes = c.a(this.b);
             otg0.c(i80.c(bytes, i, bytes.length));
             return otg0.build();
       }
    }
}
