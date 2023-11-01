package p.wi0;
import p.yf2;
import java.util.Set;
import p.xi0;
import java.lang.Object;
import java.lang.String;
import io.reactivex.rxjava3.core.CompletableSource;
import p.ti0;
import com.spotify.collection2.v2.proto.Collection2V2$WriteRequest;
import java.util.Iterator;
import p.si0;
import com.spotify.collection2.v2.proto.Collection2V2$CollectionItem;
import com.google.protobuf.c;
import com.google.protobuf.b;
import io.reactivex.rxjava3.core.Completable;
import p.ui0;

public final class wi0 implements yf2	// class@002b3e from classes.dex
{
    public final int a;
    public final Set b;
    public final boolean c;
    public final xi0 t;

    public void wi0(Set p0,boolean p1,xi0 p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final CompletableSource a(String p0){
       ti0 oti0;
       Iterator iterator;
       si0 osi0;
       int i;
       wi0 tc = this.c;
       wi0 tt = this.t;
       wi0 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             oti0 = Collection2V2$WriteRequest.i();
             oti0.d("show");
             oti0.e(p0);
             iterator = tb.iterator();
             while (iterator.hasNext()) {
                osi0 = Collection2V2$CollectionItem.h();
                i = tc ^ 0x01;
                osi0.c(i);
                osi0.d(iterator.next());
                oti0.c(osi0.build());
             }
             return tt.a.a(oti0.build());
       }
       oti0 = Collection2V2$WriteRequest.i();
       oti0.d("artist");
       oti0.e(p0);
       iterator = tb.iterator();
       while (iterator.hasNext()) {
          osi0 = Collection2V2$CollectionItem.h();
          i = tc ^ 0x01;
          osi0.c(i);
          osi0.d(iterator.next());
          oti0.c(osi0.build());
       }
       return tt.a.a(oti0.build());
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
           default:
             return this.a(p0);
       }
       return this.a(p0);
    }
}
