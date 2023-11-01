package p.o94;
import java.util.LinkedHashSet;
import android.os.Build$VERSION;
import java.util.Collection;
import java.util.Set;
import p.dj0;
import p.pl1;
import p.zq0;

public abstract class o94	// class@0020d6 from classes.dex
{
    public static final zq0 a;

    static {
       LinkedHashSet linkedHashSe = new LinkedHashSet();
       Set set = (Build$VERSION.SDK_INT >= 24)? dj0.F0(linkedHashSe): pl1.a;
       zq0 v11 = new zq0(2, false, false, false, false, -1, -1, set);
       o94.a = v11;
    }
}
