package p.h56;
import p.uy;
import p.xy5;
import java.lang.String;

public final class h56 extends uy	// class@0017e7 from classes.dex
{
    public final int d;

    public void h56(xy5 p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
             return "UPDATE playlists SET tag = NULL\nWHERE EXISTS \(SELECT * FROM favorite_playlists WHERE favorite_playlists.uri = playlists.uri\) AND tag=?";
           case 1:
             return "UPDATE shows SET tag = NULL\nWHERE EXISTS \(SELECT * FROM favorite_shows WHERE favorite_shows.uri = shows.uri\) AND tag=?";
           case 2:
             return "UPDATE tracks SET tag = NULL\nWHERE EXISTS \(SELECT * FROM favorite_tracks WHERE favorite_tracks.uri = tracks.uri\) AND tag=?";
           case 3:
             return "UPDATE albums SET tag = NULL\nWHERE albums.tag = ? AND albums.created > ?";
           case 4:
             return "UPDATE artists SET tag = NULL\nWHERE artists.tag = ? AND artists.created > ?";
           case 5:
             return "UPDATE episodes SET tag = NULL\nWHERE episodes.tag = ? AND episodes.created > ?";
           case 6:
             return "UPDATE playlists SET tag = NULL\nWHERE playlists.tag = ? AND playlists.created > ?";
           case 7:
             return "UPDATE shows SET tag = NULL\nWHERE shows.tag = ? AND shows.created > ?";
           case 8:
             return "UPDATE tracks SET tag = NULL\nWHERE tracks.tag = ? AND tracks.created > ?";
           case 9:
             return "UPDATE tracks SET tag = NULL\nWHERE EXISTS \(SELECT * FROM track_rows\nINNER JOIN albums ON track_rows.parent_uri = albums.uri\nWHERE albums.tag IS NULL AND track_rows.track_uri = tracks.uri\)";
           case 10:
             return "UPDATE albums SET tag = ?";
           case 11:
             return "UPDATE artists SET tag = NULL\nWHERE EXISTS \(SELECT * FROM album_artists\nINNER JOIN albums ON album_artists.album_uri = albums.uri\nWHERE albums.tag IS NULL AND album_artists.artist_uri = artists.uri\)";
           case 12:
             return "UPDATE tracks SET tag = NULL\nWHERE EXISTS \(SELECT * FROM track_rows\nINNER JOIN artists ON track_rows.parent_uri = artists.uri\nWHERE artists.tag IS NULL AND track_rows.track_uri = tracks.uri\)";
           case 13:
             return "UPDATE tracks SET tag = NULL\nWHERE EXISTS \(SELECT * FROM track_rows\nINNER JOIN playlists ON track_rows.parent_uri = playlists.uri\nWHERE playlists.tag IS NULL AND track_rows.track_uri = tracks.uri\)";
           case 14:
             return "UPDATE episodes SET tag = NULL\nWHERE EXISTS \(SELECT * FROM track_rows\nINNER JOIN playlists ON track_rows.parent_uri = playlists.uri\nWHERE playlists.tag IS NULL AND track_rows.track_uri = episodes.uri\)";
           case 15:
             return "UPDATE episodes SET tag = NULL\nWHERE EXISTS \(SELECT * FROM track_rows\nINNER JOIN shows ON track_rows.parent_uri = shows.uri\nWHERE shows.tag IS NULL AND track_rows.track_uri = episodes.uri\)";
           case 16:
             return "DELETE FROM albums WHERE tag = ?";
           case 17:
             return "DELETE FROM artists WHERE tag = ?";
           case 18:
             return "DELETE FROM episodes WHERE tag = ?";
           case 19:
             return "DELETE FROM playlists WHERE tag = ?";
           case 20:
             return "DELETE FROM shows WHERE tag = ?";
           case 21:
             return "UPDATE artists SET tag = ?";
           case 22:
             return "DELETE FROM tracks WHERE tag = ?";
           case 23:
             return "DELETE FROM images\nWHERE ROWID IN \(\nSELECT i.ROWID\nFROM images AS i\nINNER JOIN albums ON i.parent_uri = albums.uri\nWHERE albums.tag = ?\n\)";
           case 24:
             return "DELETE FROM images\nWHERE ROWID IN \(\nSELECT i.ROWID\nFROM images AS i\nINNER JOIN artists ON i.parent_uri = artists.uri\nWHERE artists.tag = ?\n\)";
           case 25:
             return "DELETE FROM images\nWHERE ROWID IN \(\nSELECT i.ROWID\nFROM images AS i\nINNER JOIN episodes ON i.parent_uri = episodes.uri\nWHERE episodes.tag = ?\n\)";
           case 26:
             return "DELETE FROM images\nWHERE ROWID IN \(\nSELECT i.ROWID\nFROM images AS i\nINNER JOIN playlists ON i.parent_uri = playlists.uri\nWHERE playlists.tag = ?\n\)";
           case 27:
             return "DELETE FROM images\nWHERE ROWID IN \(\nSELECT i.ROWID\nFROM images AS i\nINNER JOIN shows ON i.parent_uri = shows.uri\nWHERE shows.tag = ?\n\)";
           case 28:
             return "DELETE FROM track_rows\nWHERE ROWID IN \(\nSELECT t.ROWID\nFROM track_rows AS t\nLEFT JOIN tracks ON t.track_uri = tracks.uri\nLEFT JOIN episodes ON t.track_uri = episodes.uri\nWHERE \(tracks.uri IS NULL AND episodes.uri IS NULL\)\n\)";
           default:
             return "UPDATE episodes SET tag = ?";
       }
    }
}
