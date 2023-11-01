package p.m94;
import com.spotify.lite.database.room.MetadataRoomDatabase;
import p.ew0;
import java.lang.Object;
import p.aq6;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import p.pp;
import p.yf2;
import p.qo3;
import p.ok0;
import p.sp;

public final class m94	// class@001e4e from classes.dex
{
    public final MetadataRoomDatabase a;
    public final ew0 b;

    public void m94(MetadataRoomDatabase p0,ew0 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Completable a(aq6 p0){
       return this.b.d(p0).map(new pp(21)).distinctUntilChanged().switchMapCompletable(new sp(new ok0(2, new qo3(this, 1, p0)), 3));
    }
}
