package p.e54;
import p.d54;
import android.content.Context;
import java.lang.String;
import android.media.session.MediaSession;
import android.os.Bundle;

public final class e54 extends d54	// class@001420 from classes.dex
{

    public void e54(Context p0,String p1){
       super(p0, p1);
    }
    public final MediaSession m(Context p0,String p1){
       return new MediaSession(p0, p1, null);
    }
}
