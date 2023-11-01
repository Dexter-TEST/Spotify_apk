package p.fc6;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import p.gc6;

public final class fc6	// class@0015a1 from classes.dex
{
    public final List a;
    public final List b;

    public void fc6(int p0,int p1){
       ArrayList uArrayList;
       super();
       List list = (!p0)? Collections.emptyList(): new ArrayList(p0);
       this.a = list;
       list = (!p1)? Collections.emptyList(): new ArrayList(p1);
       this.b = list;
       return;
    }
    public final gc6 a(){
       return new gc6(this.a, this.b);
    }
}
