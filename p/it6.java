package p.it6;
import p.yf2;
import com.spotify.litesettings.settings.StorageLocationSettingsActivity;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.util.ArrayList;
import java.lang.String;
import android.content.Context;
import java.util.Iterator;
import p.tv;
import p.kt6;
import java.io.File;
import android.text.format.Formatter;
import p.lt6;
import p.eq3;
import p.ij;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;
import p.rk0;
import io.reactivex.rxjava3.core.CompletableSource;

public final class it6 implements yf2	// class@001a01 from classes.dex
{
    public final int a;
    public final StorageLocationSettingsActivity b;

    public void it6(StorageLocationSettingsActivity p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       it6 oit6 = this;
       int i = 1;
       it6 b = oit6.b;
       switch (oit6.a){
           case 0:
             break;
           default:
             lt6 t = b.X.t;
             t.getClass();
             return new rk0(Completable.j(new ij(t, 29, p0)), id.a(), 1);
       }
       List list = p0;
       b.getClass();
       ArrayList uArrayList = new ArrayList(list.size());
       String str = b.getString(R.string.settings_storage_location_out_of_space);
       Iterator iterator = list.iterator();
       long l = 0;
       while (iterator.hasNext()) {
          tv otv = iterator.next();
          if (otv.f != null) {
             l = l + otv.d;
             l = l + otv.e;
          }
       }
       int i1 = 0;
       while (i1 < list.size()) {
          Object obj = list.get(i1);
          long l1 = l + 0x3200000;
          int i2 = ((obj.c - l1) >= 0)? 1: 0;
          long l2 = (long)i1;
          int i3 = (i2)? 1: 2;
          Object[] objArray = new Object[i];
          objArray[0] = Formatter.formatShortFileSize(b, obj.c);
          kt6 v13 = new kt6(l2, i3, obj.a, obj.k.getAbsolutePath(), b.getString(R.string.settings_storage_location_available, objArray), str, obj, i2);
          uArrayList.add(v13);
          i2 = i1 + 1;
          list = list;
          i = 1;
       }
       return uArrayList;
    }
}
