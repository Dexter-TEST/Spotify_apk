package p.tw7;
import p.oo4;
import java.lang.Object;
import p.o18;
import p.po4;
import p.m08;
import p.vg3;
import java.lang.String;

public final class tw7 implements oo4	// class@0027f9 from classes.dex
{
    public static final tw7 a;

    static {
       tw7.a = new tw7();
    }
    public void tw7(){
       super();
    }
    public final void a(Object p0,Object p1){
       p1.d("eventTimeMs", p0.a);
       p1.c(p0.b, "eventCode");
       p1.d("eventUptimeMs", p0.c);
       p1.c(p0.d, "sourceExtension");
       p1.c(p0.e, "sourceExtensionJsonProto3");
       p1.d("timezoneOffsetSeconds", p0.f);
       p1.c(p0.g, "networkConnectionInfo");
    }
}
