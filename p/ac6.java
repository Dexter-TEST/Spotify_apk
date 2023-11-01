package p.ac6;
import java.lang.Long;
import java.util.UUID;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.content.Context;
import p.sz1;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.content.SharedPreferences$Editor;
import p.on6;

public final class ac6	// class@000f58 from classes.dex
{
    public final Long a;
    public Long b;
    public UUID c;
    public int d;
    public Long e;
    public on6 f;

    public void ac6(Long p0,Long p1){
       UUID uUID = UUID.randomUUID();
       co5.l(uUID, "randomUUID\(\)");
       super();
       this.a = p0;
       this.b = p1;
       this.c = uUID;
    }
    public final void a(){
       ac6 ta;
       ac6 tf;
       SharedPreferences$Editor uEditor = PreferenceManager.getDefaultSharedPreferences(sz1.a()).edit();
       long l = 0;
       long l1 = ((ta = this.a) == null)? l: ta.longValue();
       uEditor.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l1);
       if ((ta = this.b) != null) {
          l = ta.longValue();
       }
       uEditor.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", l);
       uEditor.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.d);
       uEditor.putString("com.facebook.appevents.SessionInfo.sessionId", this.c.toString());
       uEditor.apply();
       if ((tf = this.f) != null && tf != null) {
          SharedPreferences$Editor uEditor1 = PreferenceManager.getDefaultSharedPreferences(sz1.a()).edit();
          uEditor1.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", tf.a);
          uEditor1.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", tf.b);
          uEditor1.apply();
       }
       return;
    }
}
