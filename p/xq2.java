package p.xq2;
import p.ro2;
import p.j80;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.AbstractMap;
import java.lang.Integer;
import java.util.Map;
import java.util.Collections;
import p.co5;
import java.io.IOException;

public abstract class xq2	// class@0003c8 from classes2.dex
{
    public static final ro2[] a;
    public static final Map b;

    static {
       int i = 61;
       ro2[] oro2Array = new ro2[i];
       int i1 = 0;
       oro2Array[i1] = new ro2(ro2.i, "");
       j80 f = ro2.f;
       oro2Array[1] = new ro2(f, "GET");
       ro2 oro2 = new ro2(f, "POST");
       oro2Array[2] = oro2;
       f = ro2.g;
       oro2Array[3] = new ro2(f, "/");
       oro2 = new ro2(f, "/index.html");
       oro2Array[4] = oro2;
       f = ro2.h;
       oro2Array[5] = new ro2(f, "http");
       oro2 = new ro2(f, "https");
       oro2Array[6] = oro2;
       f = ro2.e;
       oro2Array[7] = new ro2(f, "200");
       oro2Array[8] = new ro2(f, "204");
       oro2Array[9] = new ro2(f, "206");
       oro2Array[10] = new ro2(f, "304");
       oro2Array[11] = new ro2(f, "400");
       oro2Array[12] = new ro2(f, "404");
       oro2 = new ro2(f, "500");
       oro2Array[13] = oro2;
       oro2Array[14] = new ro2("accept-charset", "");
       oro2Array[15] = new ro2("accept-encoding", "gzip, deflate");
       oro2Array[16] = new ro2("accept-language", "");
       oro2Array[17] = new ro2("accept-ranges", "");
       oro2Array[18] = new ro2("accept", "");
       oro2Array[19] = new ro2("access-control-allow-origin", "");
       oro2Array[20] = new ro2("age", "");
       oro2Array[21] = new ro2("allow", "");
       oro2Array[22] = new ro2("authorization", "");
       oro2Array[23] = new ro2("cache-control", "");
       oro2Array[24] = new ro2("content-disposition", "");
       oro2Array[25] = new ro2("content-encoding", "");
       oro2Array[26] = new ro2("content-language", "");
       oro2Array[27] = new ro2("content-length", "");
       oro2Array[28] = new ro2("content-location", "");
       oro2Array[29] = new ro2("content-range", "");
       oro2Array[30] = new ro2("content-type", "");
       oro2Array[31] = new ro2("cookie", "");
       oro2Array[32] = new ro2("date", "");
       oro2Array[33] = new ro2("etag", "");
       oro2Array[34] = new ro2("expect", "");
       oro2Array[35] = new ro2("expires", "");
       oro2Array[36] = new ro2("from", "");
       oro2Array[37] = new ro2("host", "");
       oro2Array[38] = new ro2("if-match", "");
       oro2Array[39] = new ro2("if-modified-since", "");
       oro2Array[40] = new ro2("if-none-match", "");
       oro2Array[41] = new ro2("if-range", "");
       oro2Array[42] = new ro2("if-unmodified-since", "");
       oro2Array[43] = new ro2("last-modified", "");
       oro2Array[44] = new ro2("link", "");
       oro2Array[45] = new ro2("location", "");
       oro2Array[46] = new ro2("max-forwards", "");
       oro2Array[47] = new ro2("proxy-authenticate", "");
       oro2Array[48] = new ro2("proxy-authorization", "");
       oro2Array[49] = new ro2("range", "");
       oro2Array[50] = new ro2("referer", "");
       oro2Array[51] = new ro2("refresh", "");
       oro2Array[52] = new ro2("retry-after", "");
       oro2Array[53] = new ro2("server", "");
       oro2Array[54] = new ro2("set-cookie", "");
       oro2Array[55] = new ro2("strict-transport-security", "");
       oro2Array[56] = new ro2("transfer-encoding", "");
       oro2Array[57] = new ro2("user-agent", "");
       oro2Array[58] = new ro2("vary", "");
       oro2Array[59] = new ro2("via", "");
       oro2Array[60] = new ro2("www-authenticate", "");
       xq2.a = oro2Array;
       LinkedHashMap linkedHashMa = new LinkedHashMap(i);
       while (i1 < i) {
          int i2 = i1 + 1;
          if (!linkedHashMa.containsKey(oro2Array[i1].a)) {
             linkedHashMa.put(oro2Array[i1].a, Integer.valueOf(i1));
          }
          i1 = i2;
       }
       Map map = Collections.unmodifiableMap(linkedHashMa);
       co5.l(map, "unmodifiableMap\(result\)");
       xq2.b = map;
    }
    public static void a(j80 p0){
       co5.o(p0, "name");
       int i = p0.d();
       byte i1 = 0;
       while (true) {
          if (i1 >= i) {
             return;
          }
          int i2 = i1 + 1;
          i1 = p0.i(i1);
          i1 = (65 <= i1 && i1 <= 90)? 1: 0;
          if (!i1) {
             i1 = i2;
          }else {
             break ;
          }
       }
       throw new IOException(co5.K(p0.q(), "PROTOCOL_ERROR response malformed: mixed case name: "));
    }
}
