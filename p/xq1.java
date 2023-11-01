package p.xq1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.prefs.esperanto.proto.EsPrefs$Value;
import com.google.protobuf.c;

public final class xq1 extends b implements u74	// class@002cc7 from classes.dex
{

    public void xq1(){
       super(EsPrefs$Value.g());
    }
    public final void c(boolean p0){
       this.copyOnWrite();
       EsPrefs$Value.e(this.instance, p0);
    }
    public final void d(long p0){
       this.copyOnWrite();
       EsPrefs$Value.f(this.instance, p0);
    }
}
