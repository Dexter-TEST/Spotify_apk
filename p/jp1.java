package p.jp1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import com.google.protobuf.c;
import p.m73;
import p.g14;
import java.util.Map;
import java.lang.String;

public final class jp1 extends b implements u74	// class@001b1b from classes.dex
{

    public void jp1(){
       super(EsContextTrack$ContextTrack.h());
    }
    public final void c(m73 p0){
       this.copyOnWrite();
       EsContextTrack$ContextTrack.e(this.instance).putAll(p0);
    }
    public final void d(String p0){
       this.copyOnWrite();
       EsContextTrack$ContextTrack.f(this.instance, p0);
    }
    public final void e(String p0){
       this.copyOnWrite();
       EsContextTrack$ContextTrack.g(this.instance, p0);
    }
}
