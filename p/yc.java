package p.yc;
import p.gm5;
import p.eh2;
import p.cm5;
import java.lang.Object;
import p.gh2;
import p.st5;
import java.lang.Class;
import java.lang.String;
import p.vc;
import p.wy6;
import p.pp3;
import p.zo3;
import p.xc;
import p.uc;
import p.tc;
import p.ed;
import p.zc;
import p.ot5;
import p.co5;

public final class yc implements gm5, eh2	// class@002d92 from classes.dex
{
    public final int a;
    public final cm5 b;

    public void yc(cm5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final gh2 a(){
       gh2 v0;
       gh2 v01;
       yc tb = this.b;
       switch (this.a){
           case 0:
             v0 = new gh2(1, tb, zc.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/lyrics/configurationremoteproperties/AndroidLibsLyricsProperties;");
             return v0;
           case 1:
             v01 = new gh2(1, tb, ed.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/lyrics/endpointretrofit/AndroidLyricsEndpointRetrofitProperties;");
             return v0;
           case 3:
             v0 = new gh2(1, tb, tc.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/AndroidLibsAllboardingProperties;");
             return v0;
           case 4:
             v01 = new gh2(1, tb, uc.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/AndroidLibsAppstorageProperties;");
             return v0;
           case 5:
             v0 = new gh2(1, tb, xc.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/AndroidLibsEncoreConsumerEntrypointProperties;");
             return v0;
           case 6:
             v01 = new gh2(1, tb, zo3.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/LiteLyricsProperties;");
             return v0;
           case 7:
             v0 = new gh2(1, tb, pp3.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/LiteRemoteConfigProperties;");
             return v0;
           case 8:
             v01 = new gh2(1, tb, wy6.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/SystemsZeroRatingIdentificationImplReporterImplProperties;");
             return v0;
           case 9:
             gh2 v02 = new gh2(1, tb, vc.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/contextualaudio/AndroidLibsContextualaudioProperties;");
             return v0;
           case 10:
             gh2 v03 = new gh2(1, tb, st5.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/fetcherimpl/RemoteConfigurationClientAndroidProperties;");
             return v0;
           default:
             v01 = new gh2(1, tb, ot5.class, "parse", "parse\(Lcom/spotify/remoteconfig/runtime/PropertyParser;\)Lcom/spotify/remoteconfig/resolverimpl/RemoteConfigSnapshotIdProperties;");
             return v0;
       }
    }
    public final boolean equals(Object p0){
       boolean b = false;
       switch (this.a){
           case 0:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             break;
           case 1:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           case 3:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           case 4:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           case 5:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           case 6:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           case 7:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           case 8:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           case 9:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           case 10:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
             break;
           default:
             if (p0 instanceof gm5 && p0 instanceof eh2) {
                b = co5.c(this.a(), p0.a());
             }
             return b;
       }
       return b;
    }
    public final int hashCode(){
       switch (this.a){
           case 0:
             return this.a().e();
           case 1:
             return this.a().e();
           case 3:
             return this.a().e();
           case 4:
             return this.a().e();
           case 5:
             return this.a().e();
           case 6:
             return this.a().e();
           case 7:
             return this.a().e();
           case 8:
             return this.a().e();
           case 9:
             return this.a().e();
           case 10:
             return this.a().e();
           default:
             return this.a().e();
       }
    }
}
