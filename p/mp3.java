package p.mp3;
import android.content.Context;
import java.lang.Object;
import com.spotify.lite.database.room.RecentPlayRoomDatabase;
import java.lang.Class;
import java.lang.String;
import p.vy5;
import p.b17;
import p.xy5;

public final class mp3	// class@001edd from classes.dex
{
    public final RecentPlayRoomDatabase a;

    public void mp3(Context p0){
       super();
       this.a = b17.i(p0.getApplicationContext(), RecentPlayRoomDatabase.class, "recent-plays.db").b();
    }
}
