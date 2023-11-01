package p.hq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.google.protobuf.c;
import java.lang.String;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;

public final class hq1 extends b implements u74	// class@00189f from classes.dex
{

    public void hq1(){
       super(EsLoggingParams$LoggingParams.h());
    }
    public final void c(String p0){
       this.copyOnWrite();
       EsLoggingParams$LoggingParams.e(this.instance, p0);
    }
    public final void d(String p0){
       this.copyOnWrite();
       EsLoggingParams$LoggingParams.f(this.instance, p0);
    }
    public final void e(EsOptional$OptionalInt64 p0){
       this.copyOnWrite();
       EsLoggingParams$LoggingParams.g(this.instance, p0);
    }
}
