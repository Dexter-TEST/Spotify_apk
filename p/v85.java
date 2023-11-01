package p.v85;
import p.k95;
import com.spotify.legacyglue.icons.SpotifyIconView;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public final class v85 extends k95	// class@0029a2 from classes.dex
{

    public void v85(){
       super("SPOTIFY_ICON_VIEW", 13, SpotifyIconView.class);
    }
    public final View a(Context p0,AttributeSet p1,int p2){
       return new SpotifyIconView(p0, p1, p2);
    }
}
