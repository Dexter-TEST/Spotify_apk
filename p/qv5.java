package p.qv5;
import java.util.List;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Iterable;
import p.aj0;
import java.util.Iterator;
import com.spotify.cosmos.cosmonaut.Converter$Factory;
import com.spotify.cosmos.cosmonaut.Converter;
import java.lang.reflect.Type;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;
import java.lang.String;

public final class qv5	// class@002422 from classes.dex
{
    public final ArrayList a;

    public void qv5(List p0){
       super();
       ArrayList uArrayList = new ArrayList(aj0.b0(p0));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().createRequestConverter());
       }
       this.a = uArrayList;
       return;
    }
    public final Converter a(Type p0){
       Converter uConverter;
       Iterator iterator = this.a.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new IllegalArgumentException(p0+" is not supported by RequestTransformers");
          }
          uConverter = iterator.next();
          if (uConverter.canHandle(p0)) {
             break ;
          }
       }
       return uConverter;
    }
}
