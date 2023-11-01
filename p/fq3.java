package p.fq3;
import android.content.Context;
import java.lang.Object;
import com.spotify.lite.database.room.TasteOnboardingRoomDatabase;
import java.lang.Class;
import java.lang.String;
import p.vy5;
import p.b17;
import p.xy5;

public final class fq3	// class@001619 from classes.dex
{
    public final TasteOnboardingRoomDatabase a;

    public void fq3(Context p0){
       super();
       this.a = b17.i(p0.getApplicationContext(), TasteOnboardingRoomDatabase.class, "taste-onboarding.db").b();
    }
}
