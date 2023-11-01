package p.f8;
import p.cz;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import p.jr;
import java.util.List;
import p.lt;
import p.xm0;
import p.gr;
import p.kr;
import p.ir;
import p.vt;
import java.util.ArrayList;

public final class f8 extends cz	// class@00157f from classes.dex
{
    public final int c;

    public void f8(Context p0,int p1){
       this.c = p1;
       super(p0, true);
    }
    public final String c(Object p0){
       String str = null;
       switch (this.c){
           case 0:
             if ((p0 = xm0.c(p0.c)) != null) {
                str = p0.a;
             }
             break;
           case 1:
             if ((p0 = xm0.c(p0.b)) != null) {
                str = p0.a;
             }
             return str;
             break;
           default:
             return "https://misc.scdn.co/lite/favorites-mix.png?format=webp";
       }
       return str;
    }
    public final String d(Context p0,String p1){
       Object[] objArray;
       switch (this.c){
           case 0:
             objArray = new Object[]{p1};
             return p0.getString(R.string.component_shuffled_track_album_or_artist_description, objArray);
           case 1:
             objArray = new Object[]{p1};
             return p0.getString(R.string.component_shuffled_track_album_or_artist_description, objArray);
           default:
             return p0.getString(R.string.component_shuffled_track_playlist_description);
       }
    }
    public final String e(Context p0,Object p1){
       switch (this.c){
           case 0:
             return p1.a.c;
           case 1:
             return p1.a.c;
           default:
             return p0.getString(R.string.entity_title_favorite_songs);
       }
    }
    public final List f(Context p0,vt p1,Object p2,List p3){
       switch (this.c){
           case 0:
             return xm0.i(p1, p3);
           case 1:
             return xm0.i(p1, p3);
           default:
             return xm0.i(p1, p3);
       }
    }
}
