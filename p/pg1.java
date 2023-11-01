package p.pg1;
import p.og2;
import android.content.Context;
import java.lang.Object;
import com.spotify.webapi.service.models.Pager;
import p.or7;
import java.lang.Boolean;
import java.lang.String;
import p.us;

public final class pg1 implements og2	// class@002255 from classes.dex
{
    public final Context a;

    public void pg1(Context p0){
       this.a = p0;
    }
    public final Object apply(Object p0){
       p0 = new or7();
       p0.c = Boolean.FALSE;
       p0.a = this.a.getString(R.string.title_favorite_songs);
       p0.b = "https://misc.scdn.co/lite/favorites-mix.png?format=webp";
       return p0.b();
    }
}
