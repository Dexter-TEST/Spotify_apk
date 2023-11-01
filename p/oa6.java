package p.oa6;
import p.pa6;
import p.la6;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Object;

public abstract class oa6 extends pa6	// class@0020e2 from classes.dex
{

    public static final ArrayList H(la6 p0){
       ArrayList uArrayList = new ArrayList();
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          uArrayList.add(iterator.next());
       }
       return uArrayList;
    }
}
