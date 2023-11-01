package p.nh3;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.tn6;
import p.rn6;
import p.bo6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.ObservableEmitter;
import p.mh3;
import p.co6;
import android.content.SharedPreferences;
import android.content.SharedPreferences$OnSharedPreferenceChangeListener;
import p.lh3;
import p.tb0;

public final class nh3 implements ObservableOnSubscribe	// class@001fda from classes.dex
{
    public final tn6 a;
    public final rn6 b;
    public final ng2 c;

    public void nh3(tn6 p0,rn6 p1,bo6 p2){
       co5.o(p0, "prefs");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
    }
    public final void subscribe(ObservableEmitter p0){
       co5.o(p0, "emitter");
       mh3 omh3 = new mh3(p0, this.b.a, this);
       this.a.h().registerOnSharedPreferenceChangeListener(omh3);
       p0.setCancellable(new lh3(this, omh3));
    }
}
