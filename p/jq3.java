package p.jq3;
import android.content.Context;
import java.lang.Object;
import com.spotify.lite.database.room.UserRoomDatabase;
import java.lang.Class;
import java.lang.String;
import p.vy5;
import p.b17;
import p.xy5;

public final class jq3	// class@001b25 from classes.dex
{
    public final UserRoomDatabase a;

    public void jq3(Context p0){
       super();
       this.a = b17.i(p0.getApplicationContext(), UserRoomDatabase.class, "user.db").b();
    }
}
