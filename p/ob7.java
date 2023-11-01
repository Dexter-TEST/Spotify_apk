package p.ob7;
import p.fb7;
import p.kb7;
import p.hb7;
import java.util.ArrayList;
import p.gb7;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.Collection;
import p.dj0;
import java.util.List;
import p.ib7;
import p.pb7;

public final class ob7 extends fb7	// class@0020ec from classes.dex
{
    public ib7 d;

    public void ob7(){
       super();
    }
    public final gb7 b(kb7 p0,hb7 p1,ArrayList p2){
       ob7 td;
       pb7 opb7;
       co5.o(p0, "location");
       co5.o(p2, "errors");
       ArrayList uArrayList = dj0.C0(p2);
       if ((td = this.d) != null) {
          uArrayList.addAll(td.a());
          opb7 = new pb7(p0, p1, uArrayList, td);
       }else {
          uArrayList.add("No action!");
          opb7 = new pb7(p0, p1, p2, ib7.e);
       }
       return opb7;
    }
}
