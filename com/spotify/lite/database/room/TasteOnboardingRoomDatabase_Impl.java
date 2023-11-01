package com.spotify.lite.database.room.TasteOnboardingRoomDatabase_Impl;
import com.spotify.lite.database.room.TasteOnboardingRoomDatabase;
import p.xy5;
import p.rw6;
import p.nw6;
import java.lang.String;
import android.database.Cursor;
import p.vc3;
import java.util.HashMap;
import p.o51;
import p.yy5;
import p.mq7;
import android.content.Context;
import p.ow6;
import p.pw6;
import p.qw6;
import java.util.LinkedHashMap;
import java.util.List;
import p.ka4;
import java.lang.Object;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.Collections;
import p.b17;

public final class TasteOnboardingRoomDatabase_Impl extends TasteOnboardingRoomDatabase	// class@000919 from classes.dex
{

    public void TasteOnboardingRoomDatabase_Impl(){
       super();
    }
    public final void d(){
       this.a();
       nw6 onw6 = this.i().Y();
       this.c();
       onw6.r("DELETE FROM `taste`");
       this.r();
       this.m();
       onw6.a0("PRAGMA wal_checkpoint\(FULL\)").close();
       if (!onw6.G()) {
          onw6.r("VACUUM");
       }
       return;
    }
    public final vc3 f(){
       String[] stringArray = new String[]{"taste"};
       return new vc3(this, new HashMap(0), new HashMap(0), stringArray);
    }
    public final rw6 g(o51 p0){
       ow6 oow6 = pw6.a(p0.a);
       oow6.b = p0.b;
       oow6.c = new yy5(p0, new mq7(this, 1, 6), "dc68c03b4b5061612782f1ff3cbeb4d8", "701409e8d779205b4263ca5ca6598864");
       return p0.c.f(oow6.a());
    }
    public final List h(LinkedHashMap p0){
       ka4[] oka4Array = new ka4[0];
       return Arrays.asList(oka4Array);
    }
    public final Set j(){
       return new HashSet();
    }
    public final Map k(){
       HashMap hashMap = new HashMap();
       hashMap.put(b17.class, Collections.emptyList());
       return hashMap;
    }
}
