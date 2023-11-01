package p.lh3;
import p.tb0;
import p.nh3;
import p.mh3;
import java.lang.Object;
import p.co6;
import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;

public final class lh3 implements tb0	// class@001d53 from classes.dex
{
    public final nh3 a;
    public final SharedPreferences$OnSharedPreferenceChangeListener b;

    public void lh3(nh3 p0,mh3 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void cancel(){
       this.a.a.h().unregisterOnSharedPreferenceChangeListener(this.b);
    }
}
