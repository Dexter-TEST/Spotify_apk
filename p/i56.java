package p.i56;
import p.uy;
import p.xy5;
import java.lang.String;

public final class i56 extends uy	// class@00192c from classes.dex
{
    public final int d;

    public void i56(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
             return "UPDATE playlists SET tag = ?";
           case 1:
             return "UPDATE shows SET tag = ?";
           case 2:
             return "UPDATE tracks SET tag = ?";
           case 3:
             return "UPDATE albums SET tag = NULL\nWHERE EXISTS \(SELECT * FROM favorite_albums WHERE favorite_albums.uri = albums.uri\) AND tag=?";
           case 4:
             return "UPDATE artists SET tag = NULL\nWHERE EXISTS \(SELECT * FROM favorite_artists WHERE favorite_artists.uri = artists.uri\) AND tag=?";
           default:
             return "UPDATE episodes SET tag = NULL\nWHERE EXISTS \(SELECT * FROM favorite_episodes WHERE favorite_episodes.uri = episodes.uri\) AND tag=?";
       }
    }
}
