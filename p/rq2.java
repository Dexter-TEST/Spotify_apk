package p.rq2;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.String;
import java.util.HashSet;
import p.w51;
import java.util.Collection;
import java.lang.Object;
import java.util.Collections;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import p.k12;
import p.yf2;

public final class rq2 implements ObservableTransformer	// class@002539 from classes.dex
{
    public static final HashSet a;

    static {
       String[] stringArray = new String[]{"lite:sectionHeaderMediumStart","lite:sectionHeaderWithRecommendationMediumStart"};
       HashSet hashSet = new HashSet(w51.c(2));
       Collections.addAll(hashSet, stringArray);
       rq2.a = hashSet;
    }
    public void rq2(){
       super();
    }
    public final ObservableSource apply(Observable p0){
       return p0.map(new k12(21));
    }
}
