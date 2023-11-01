package p.ad;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.LinkedHashMap;
import p.g15;
import java.lang.Package;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import java.util.Map;
import p.fr2;
import p.u07;
import p.q14;

public abstract class ad	// class@000163 from classes2.dex
{
    public static final CopyOnWriteArraySet a;
    public static final Map b;

    static {
       Package package;
       ad.a = new CopyOnWriteArraySet();
       LinkedHashMap linkedHashMa = new LinkedHashMap();
       g15 og15 = g15.class;
       String str = ((package = og15.getPackage()) == null)? null: package.getName();
       if (str != null) {
          linkedHashMa.put(str, "OkHttp");
       }
       linkedHashMa.put(og15.getName(), "okhttp.OkHttpClient");
       linkedHashMa.put(fr2.class.getName(), "okhttp.Http2");
       linkedHashMa.put(u07.class.getName(), "okhttp.TaskRunner");
       linkedHashMa.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
       ad.b = q14.r0(linkedHashMa);
    }
}
