package p.cn0;
import p.um5;
import java.util.Set;
import java.lang.Object;
import p.en0;
import java.util.HashSet;
import java.util.Iterator;
import p.vi3;
import java.util.Collections;

public final class cn0 implements um5	// class@00123b from classes.dex
{
    public final Set a;

    public void cn0(Set p0){
       this.a = p0;
    }
    public final Object get(){
       HashSet hashSet = new HashSet();
       Iterator iterator = this.a.iterator();
       while (iterator.hasNext()) {
          hashSet.add(iterator.next().get());
       }
       return Collections.unmodifiableSet(hashSet);
    }
}
