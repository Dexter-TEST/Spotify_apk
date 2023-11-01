package p.dp3;
import android.content.Context;
import java.lang.Object;
import com.spotify.lite.database.room.NetworkRoomDatabase;
import java.lang.Class;
import java.lang.String;
import p.vy5;
import p.b17;
import p.xy5;

public final class dp3	// class@00138e from classes.dex
{
    public final NetworkRoomDatabase a;

    public void dp3(Context p0){
       super();
       this.a = b17.i(p0.getApplicationContext(), NetworkRoomDatabase.class, "lite.db").b();
    }
}
