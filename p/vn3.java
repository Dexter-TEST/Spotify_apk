package p.vn3;
import p.h12;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.zg0;
import java.lang.Object;
import com.google.common.collect.d;
import com.google.common.collect.g;
import p.t00;
import p.t63;
import java.lang.String;
import java.util.List;
import java.lang.Iterable;
import p.ab2;
import p.rm;
import p.ci5;
import p.un3;
import p.jg2;
import com.google.common.collect.c;
import java.util.AbstractCollection;

public final class vn3 implements h12	// class@002a2b from classes.dex
{
    public final t00 a;
    public final MetadataRoomDatabase b;
    public final zg0 c;

    public void vn3(MetadataRoomDatabase p0,zg0 p1){
       super();
       this.a = t00.b(g.A);
       this.b = p0;
       this.c = p1;
    }
    public static void a(t63 p0,String p1,List p2){
       p0.k(p1);
       if (p2 != null && !p2.isEmpty()) {
          c uoc = ab2.b(p2).a(new rm(1)).m(new un3(p1, 0)).d();
          if (!uoc.isEmpty()) {
             p0.m(uoc);
          }
       }
       return;
    }
}
