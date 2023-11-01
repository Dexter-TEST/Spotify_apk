package p.ar1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsPreparePlayOptions$PreparePlayOptions;
import com.google.protobuf.c;
import com.google.common.collect.d;
import p.m73;
import p.g14;
import java.util.Map;
import p.zq1;
import java.lang.String;
import p.h80;
import com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import p.cr1;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import com.spotify.player.esperanto.proto.EsSkipToTrack$SkipToTrack;

public final class ar1 extends b implements u74	// class@000fd9 from classes.dex
{

    public void ar1(){
       super(EsPreparePlayOptions$PreparePlayOptions.r());
    }
    public final void c(d p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.e(this.instance, p0);
    }
    public final void d(m73 p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.f(this.instance).putAll(p0);
    }
    public final void e(boolean p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.g(this.instance, p0);
    }
    public final void f(zq1 p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.h(this.instance, p0);
    }
    public final void g(boolean p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.i(this.instance, p0);
    }
    public final void h(String p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.j(this.instance, p0);
    }
    public final void i(h80 p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.k(this.instance, p0);
    }
    public final void j(EsContextPlayerOptions$ContextPlayerOptionOverrides p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.l(this.instance, p0);
    }
    public final void k(cr1 p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.m(this.instance, p0);
    }
    public final void l(EsOptional$OptionalInt64 p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.n(this.instance, p0);
    }
    public final void m(String p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.o(this.instance, p0);
    }
    public final void n(EsSkipToTrack$SkipToTrack p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.p(this.instance, p0);
    }
    public final void o(boolean p0){
       this.copyOnWrite();
       EsPreparePlayOptions$PreparePlayOptions.q(this.instance, p0);
    }
}
