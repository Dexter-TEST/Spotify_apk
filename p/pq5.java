package p.pq5;
import p.jg2;
import java.lang.Object;
import p.pz5;
import java.lang.String;
import com.spotify.searchview.proto.RelatedEntity;
import p.d96;
import com.spotify.webapi.service.models.ArtistSimple;
import com.spotify.litenetwork.webapi.model.RecommendedArtist;
import p.jr;
import p.xm0;
import p.kr;
import p.te5;

public final class pq5 implements jg2	// class@0022b1 from classes.dex
{
    public final int a;

    public void pq5(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       String str = null;
       switch (this.a){
           case 0:
             if (p0 != null) {
                str = p0.b;
             }
             return str;
             break;
           case 1:
             return p0.name;
           case 2:
             if (p0 != null) {
                str = p0.getName();
             }
             return str;
             break;
           case 3:
             return p0.a();
           default:
             if (p0 != null) {
                p0 = p0.a.c;
                if (!te5.a(p0)) {
                   str = p0;
                }
             }
             return str;
       }
    }
}
