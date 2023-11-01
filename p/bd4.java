package p.bd4;
import com.spotify.cosmos.cosmonaut.Converter$Factory;
import com.squareup.moshi.Moshi;
import java.lang.Object;
import com.spotify.cosmos.cosmonaut.Converter;
import p.ad4;

public final class bd4 implements Converter$Factory	// class@0010a2 from classes.dex
{
    public final Moshi a;

    public void bd4(Moshi p0){
       this.a = p0;
    }
    public final Converter createRequestConverter(){
       return new ad4(this, 0);
    }
    public final Converter createResponseConverter(){
       return new ad4(this, 1);
    }
}
