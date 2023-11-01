package p.vq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.prefs.esperanto.proto.EsPrefs$SetParams;
import com.google.protobuf.c;
import java.util.Map;
import p.g14;

public final class vq1 extends b implements u74	// class@002a43 from classes.dex
{

    public void vq1(){
       super(EsPrefs$SetParams.f());
    }
    public final void c(Map p0){
       this.copyOnWrite();
       EsPrefs$SetParams.e(this.instance).putAll(p0);
    }
}
