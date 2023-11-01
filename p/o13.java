package p.o13;
import java.lang.Object;
import p.zt2;
import p.a23;
import p.au2;
import android.os.Bundle;
import java.lang.String;
import p.co5;

public final class o13	// class@00208d from classes.dex
{

    public void o13(){
       super();
    }
    public static zt2 a(){
       return a23.C().a();
    }
    public static a23 b(au2 p0){
       a23 uoa23;
       if (p0 == null) {
          uoa23 = new a23(new Bundle());
       }else if(p0 instanceof a23){
       }else {
          uoa23 = o13.a().a(p0).d();
          co5.j(uoa23, "null cannot be cast to non-null type com.spotify.hubs.model.immutable.HubsImmutableComponentBundle");
       }
       return uoa23;
    }
}
