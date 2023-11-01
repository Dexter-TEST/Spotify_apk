package p.zo1;
import p.u74;
import com.google.protobuf.b;
import com.spotify.player.esperanto.proto.EsContextPage$ContextPage;
import com.google.protobuf.c;
import java.util.ArrayList;
import p.m73;
import p.g14;
import java.util.Map;
import java.lang.String;

public final class zo1 extends b implements u74	// class@002f35 from classes.dex
{

    public void zo1(){
       super(EsContextPage$ContextPage.j());
    }
    public final void c(ArrayList p0){
       this.copyOnWrite();
       EsContextPage$ContextPage.e(this.instance, p0);
    }
    public final void d(m73 p0){
       this.copyOnWrite();
       EsContextPage$ContextPage.f(this.instance).putAll(p0);
    }
    public final void e(boolean p0){
       this.copyOnWrite();
       EsContextPage$ContextPage.g(this.instance, p0);
    }
    public final void f(String p0){
       this.copyOnWrite();
       EsContextPage$ContextPage.h(this.instance, p0);
    }
    public final void g(String p0){
       this.copyOnWrite();
       EsContextPage$ContextPage.i(this.instance, p0);
    }
}
