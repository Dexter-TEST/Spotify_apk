package p.id5;
import p.oa5;
import io.reactivex.rxjava3.core.Observable;
import p.kc5;
import p.j35;
import p.jc5;
import p.q35;
import java.lang.Object;
import java.lang.String;
import p.na5;
import p.zg0;
import p.ic;
import java.lang.Class;
import java.lang.System;
import p.e35;
import p.yb5;

public abstract class id5	// class@001972 from classes.dex
{

    public static Observable a(oa5 p0){
       return Observable.just(new kc5(p0), new jc5(new j35(p0)));
    }
    public static Observable b(String p0,String p1,String p2,na5 p3,zg0 p4){
       e35 p4;
       p4.getClass();
       p4 = new e35(p0, p1, p2, p3, System.currentTimeMillis());
       return Observable.just(new jc5(p4), new yb5());
    }
}
