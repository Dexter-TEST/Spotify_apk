package p.jr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsSeekTo$SeekToRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.kr1;

public final class jr1 extends b implements u74	// class@001b2c from classes.dex
{

    public void jr1(){
       super(EsSeekTo$SeekToRequest.i());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsSeekTo$SeekToRequest.e(this.instance, p0);
    }
    public final void d(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsSeekTo$SeekToRequest.f(this.instance, p0);
    }
    public final void e(long p0){
       this.copyOnWrite();
       EsSeekTo$SeekToRequest.g(this.instance, p0);
    }
    public final void f(kr1 p0){
       this.copyOnWrite();
       EsSeekTo$SeekToRequest.h(this.instance, p0);
    }
}
