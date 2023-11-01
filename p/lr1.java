package p.lr1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsSetRepeatingContext$SetRepeatingContextRequest;
import com.google.protobuf.c;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;

public final class lr1 extends b implements u74	// class@001da9 from classes.dex
{

    public void lr1(){
       super(EsSetRepeatingContext$SetRepeatingContextRequest.h());
    }
    public final void c(EsLoggingParams$LoggingParams p0){
       this.copyOnWrite();
       EsSetRepeatingContext$SetRepeatingContextRequest.e(this.instance, p0);
    }
    public final void d(EsCommandOptions$CommandOptions p0){
       this.copyOnWrite();
       EsSetRepeatingContext$SetRepeatingContextRequest.f(this.instance, p0);
    }
    public final void e(boolean p0){
       this.copyOnWrite();
       EsSetRepeatingContext$SetRepeatingContextRequest.g(this.instance, p0);
    }
}
