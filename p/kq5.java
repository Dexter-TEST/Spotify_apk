package p.kq5;
import p.uy;
import com.spotify.lite.database.room.RecentPlayRoomDatabase;
import p.xy5;
import java.lang.String;

public final class kq5 extends uy	// class@001c64 from classes.dex
{
    public final int d;

    public void kq5(RecentPlayRoomDatabase p0,int p1){
       this.d = p1;
       super(p0);
    }
    public final String d(){
       switch (this.d){
           case 0:
           default:
             return "DELETE FROM recent_play WHERE id NOT IN \(SELECT id from recent_play ORDER BY timestamp DESC LIMIT 99\)";
       }
       return "DELETE FROM recent_play WHERE uri = ?";
    }
}
