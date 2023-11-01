package p.d12;
import p.uy;
import p.xy5;
import java.lang.String;

public final class d12 extends uy	// class@0012ba from classes.dex
{
    public final int d;

    public void d12(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
             return "DELETE FROM favorite_playlists";
           case 1:
             return "DELETE FROM favorite_albums\nWHERE uri = ?";
           case 2:
             return "DELETE FROM favorite_albums";
           case 3:
             return "DELETE FROM favorite_artists\nWHERE uri = ?";
           case 4:
             return "DELETE FROM favorite_artists";
           case 5:
             return "DELETE FROM favorite_shows\nWHERE uri = ?";
           case 6:
             return "DELETE FROM favorite_shows";
           case 7:
             return "DELETE FROM favorite_episodes\nWHERE uri = ?";
           case 8:
             return "DELETE FROM favorite_episodes";
           case 9:
             return "DELETE FROM favorite_tracks\nWHERE uri = ?";
           case 10:
             return "DELETE FROM favorite_tracks";
           default:
             return "DELETE FROM favorite_playlists\nWHERE uri = ?";
       }
    }
}
