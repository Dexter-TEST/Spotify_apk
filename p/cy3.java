package p.cy3;
import p.tu1;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.qw3;
import p.kg4;
import p.va4;
import com.spotify.lyrics.core.logger.events.proto.MinimumLyricsCharactersSeen;
import p.tp2;
import p.mw3;
import com.google.protobuf.c;
import com.google.protobuf.b;

public final class cy3	// class@00129f from classes.dex
{
    public final tu1 a;

    public void cy3(tu1 p0){
       co5.o(p0, "eventPublisher");
       super();
       this.a = p0;
    }
    public final void a(qw3 p0,String p1,String p2,int p3){
       co5.o(p0, "lyrics");
       co5.o(p1, "trackUri");
       co5.o(p2, "playbackId");
       kg4.t(p3, "format");
       va4 ova4 = MinimumLyricsCharactersSeen.l();
       ova4.h(p1);
       ova4.d(p2);
       ova4.c(tp2.c(p3));
       qw3 w = p0.w;
       ova4.e(w.b);
       ova4.f(w.a);
       ova4.g(tp2.x(p0.b));
       c uoc = ova4.build();
       co5.l(uoc, "newBuilder\(\)\n           …
                    .build\(\)");
       this.a.a(uoc);
    }
}
