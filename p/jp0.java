package p.jp0;
import java.util.List;
import java.lang.Object;
import java.lang.String;
import p.co5;
import javax.net.ssl.SSLSocket;
import p.ip0;
import p.kf0;
import java.util.Comparator;
import p.we7;
import p.jf4;
import p.dv0;
import java.util.Arrays;
import p.hp0;
import java.net.UnknownServiceException;
import java.lang.StringBuilder;

public final class jp0	// class@000265 from classes2.dex
{
    public final List a;
    public int b;
    public boolean c;
    public boolean d;

    public void jp0(List p0){
       co5.o(p0, "connectionSpecs");
       super();
       this.a = p0;
    }
    public final ip0 a(SSLSocket p0){
       ip0 oip0;
       boolean b;
       ip0 c;
       String[] enabledCiphe;
       String[] stringArray;
       ip0 d;
       String[] enabledProto;
       jp0 tb = this.b;
       jp0 ta = this.a;
       int i = ta.size();
       while (true) {
          if (tb < i) {
             int i1 = tb + 1;
             oip0 = ta.get(tb);
             if (oip0.b(p0)) {
                this.b = i1;
             label_001e :
                if (oip0 != null) {
                   jp0 tb1 = this.b;
                   i1 = ta.size();
                   while (true) {
                      int i2 = 1;
                      if (tb1 < i1) {
                         int i3 = tb1 + 1;
                         if (ta.get(tb1).b(p0)) {
                            b = true;
                         label_003d :
                            this.c = b;
                            ta = this.d;
                            if ((c = oip0.c) != null) {
                               enabledCiphe = p0.getEnabledCipherSuites();
                               co5.l(enabledCiphe, "sslSocket.enabledCipherSuites");
                               stringArray = we7.p(enabledCiphe, c, kf0.c);
                            }else {
                               stringArray = p0.getEnabledCipherSuites();
                            }
                            if ((d = oip0.d) != null) {
                               enabledProto = p0.getEnabledProtocols();
                               co5.l(enabledProto, "sslSocket.enabledProtocols");
                               enabledCiphe = we7.p(enabledProto, d, jf4.a);
                            }else {
                               enabledCiphe = p0.getEnabledProtocols();
                            }
                            enabledProto = p0.getSupportedCipherSuites();
                            co5.l(enabledProto, "supportedCipherSuites");
                            dv0 c1 = kf0.c;
                            int len = enabledProto.length;
                            int i4 = 0;
                            while (true) {
                               if (i4 < len) {
                                  int i5 = (!c1.compare(enabledProto[i4], "TLS_FALLBACK_SCSV"))? 1: 0;
                                  if (i5) {
                                  label_0097 :
                                     String str = "cipherSuitesIntersection";
                                     if (ta != null && i4 != -1) {
                                        co5.l(stringArray, str);
                                        object oobject = enabledProto[i4];
                                        co5.l(oobject, "supportedCipherSuites[indexOfFallbackScsv]");
                                        stringArray = Arrays.copyOf(stringArray, (stringArray.length + i2));
                                        co5.l(stringArray, "copyOf\(this, newSize\)");
                                        stringArray[(stringArray.length - 1)] = oobject;
                                     }
                                     hp0 oobject1 = new hp0(oip0);
                                     co5.l(stringArray, str);
                                     oobject1.b(Arrays.copyOf(stringArray, stringArray.length));
                                     co5.l(enabledCiphe, "tlsVersionsIntersection");
                                     oobject1.e(Arrays.copyOf(enabledCiphe, enabledCiphe.length));
                                     ip0 oip01 = oobject1.a();
                                     if (oip01.c() != null) {
                                        p0.setEnabledProtocols(oip01.d);
                                     }
                                     if (oip01.a() != null) {
                                        p0.setEnabledCipherSuites(oip01.c);
                                        break ;
                                     }
                                     break ;
                                  }else {
                                     i4 = i4 + 1;
                                  }
                               }else {
                                  i4 = -1;
                                  goto label_0097 ;
                               }
                            }
                            return oip0;
                         }else {
                            tb1 = i3;
                         }
                      }else {
                         b = false;
                         goto label_003d ;
                      }
                   }
                }else {
                   String[] enabledProto1 = p0.getEnabledProtocols();
                   co5.i(enabledProto1);
                   String str1 = Arrays.toString(enabledProto1);
                   co5.l(str1, "toString\(this\)");
                   throw new UnknownServiceException("Unable to find acceptable protocols. isFallback="+this.d+", modes="+ta+", supported protocols="+str1);
                }
             }else {
                tb = i1;
             }
          }else {
             oip0 = null;
             goto label_001e ;
          }
       }
    }
}
