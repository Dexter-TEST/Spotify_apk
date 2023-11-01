package p.em7;
import p.dm7;
import p.os2;
import p.ps2;
import java.lang.String;
import java.lang.Object;

public final class em7 implements dm7	// class@0014b9 from classes.dex
{
    public static final ps2 a;

    static {
       ps2 ops2 = null;
       try{
          os2 oos2 = new os2();
          oos2.f(ops2, "https://api.spotify.com/");
          ops2 = oos2.b();
          em7.a = ops2;
       }catch(java.lang.IllegalArgumentException e0){
       }
    }
    public void em7(){
       super();
    }
}
