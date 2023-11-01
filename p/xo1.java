package p.xo1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsContext$Context;
import com.google.protobuf.c;
import java.util.ArrayList;
import p.m73;
import p.g14;
import java.util.Map;
import com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import java.lang.String;

public final class xo1 extends b implements u74	// class@002cb6 from classes.dex
{

    public void xo1(){
       super(EsContext$Context.k());
    }
    public final void c(ArrayList p0){
       this.copyOnWrite();
       EsContext$Context.e(this.instance, p0);
    }
    public final void d(m73 p0){
       this.copyOnWrite();
       EsContext$Context.f(this.instance).putAll(p0);
    }
    public final void e(boolean p0){
       this.copyOnWrite();
       EsContext$Context.g(this.instance, p0);
    }
    public final void f(EsRestrictions$Restrictions p0){
       this.copyOnWrite();
       EsContext$Context.h(this.instance, p0);
    }
    public final void g(String p0){
       this.copyOnWrite();
       EsContext$Context.i(this.instance, p0);
    }
    public final void h(String p0){
       this.copyOnWrite();
       EsContext$Context.j(this.instance, p0);
    }
}
