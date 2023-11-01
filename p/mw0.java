package p.mw0;
import p.yf2;
import p.iv0;
import java.lang.Object;
import java.lang.Boolean;
import p.tv0;
import java.lang.Class;
import java.lang.String;
import com.spotify.base.java.logging.Logger;
import p.fn5;
import com.spotify.scrobble.esperanto.proto.PutIncognitoModeRequest;
import com.google.protobuf.c;
import com.google.protobuf.b;
import p.co5;
import p.s74;
import io.reactivex.rxjava3.core.Single;
import com.spotify.clientfoundations.esperanto.esperanto.ClientBase;
import p.a05;
import io.reactivex.rxjava3.core.Completable;
import p.rp0;
import com.spotify.playerlimited.player.models.ForceOffline;
import p.g20;
import com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import p.t65;
import java.util.Map;
import p.xe7;

public final class mw0 implements yf2	// class@001f17 from classes.dex
{
    public final int a;
    public final iv0 b;

    public void mw0(iv0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray;
       String str = "setting";
       int i = 0;
       mw0 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             co5.o(p0, str);
             objArray = new Object[]{p0};
             Logger.e("setDownloadBitrate\(%s\)", objArray);
             return tb.g(xe7.H(new t65("audio.sync_bitrate_enumeration", tv0.b(p0.a))));
           case 1:
             tb.getClass();
             return tb.j.c(new ForceOffline(p0.booleanValue()));
           case 2:
             p0 = p0.booleanValue();
             tb.getClass();
             objArray = new Object[]{Boolean.valueOf(p0)};
             Logger.e("setAllowSyncOverCellular\(%b\)", objArray);
             return tb.j.b(p0);
           case 3:
             p0 = p0.booleanValue();
             tb.getClass();
             objArray = new Object[]{Boolean.valueOf(p0)};
             Logger.e("setPrivateMode\(%b\)", objArray);
             fn5 uofn5 = PutIncognitoModeRequest.g();
             uofn5.c(p0);
             p0 = uofn5.build();
             co5.l(p0, "newBuilder\(\)\n           …
                    .build\(\)");
             tv0 b = tb.b;
             b.getClass();
             p0 = b.callSingle("spotify.scrobble.esperanto.proto.Scrobble", "PutIncognitoMode", p0);
             p0 = p0.map(new a05(19));
             co5.l(p0, "callSingle\(\"spotify.scro…     }\n                }\)");
             p0 = p0.ignoreElement();
             co5.l(p0, "scrobbleClient.PutIncogn…        \).ignoreElement\(\)");
             return p0;
           default:
             tb.getClass();
             co5.o(p0, str);
             objArray = new Object[]{p0};
             Logger.e("setStreamingBitrate\(%s\)", objArray);
             return tb.g(xe7.H(new t65("audio.play_bitrate_enumeration", tv0.b(p0.a))));
       }
    }
}
