package p.lx5;
import p.ix5;
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

public final class lx5	// class@001de2 from classes.dex
{
    public final ArrayList a;
    public static final ix5 b;

    static {
       lx5.b = new ix5();
    }
    public void lx5(List p0){
       super();
       ArrayList uArrayList = new ArrayList(aj0.b0(p0));
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next().createResponseConverter());
       }
       this.a = uArrayList;
       return;
    }
    public final Converter a(Type p0){
       Converter uConverter;
       Iterator iterator = this.a.iterator();
       while (true) {
          if (!iterator.hasNext()) {
             throw new IllegalArgumentException(p0+" is not supported by ResponseTransformers");
          }
          uConverter = iterator.next();
          if (uConverter.canHandle(p0)) {
             break ;
          }
       }
       return uConverter;
    }
}
