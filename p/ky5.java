package p.ky5;
import p.ny5;
import java.lang.String;
import p.gx5;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.co5;
import io.reactivex.rxjava3.core.Completable;
import java.lang.reflect.Type;

public final class ky5 extends ny5	// class@001ca9 from classes.dex
{

    public void ky5(){
       super("COMPLETABLE", 2);
    }
    public final Object a(gx5 p0,Observable p1){
       co5.o(p0, "converter");
       co5.o(p1, "source");
       Completable uCompletable = p1.ignoreElements();
       co5.l(uCompletable, "source.ignoreElements\(\)");
       return uCompletable;
    }
    public final boolean b(String p0,Type p1){
       boolean b = (!"SUB".equals(p0) && (!"GET".equals(p0) && p1.equals(Completable.class)))? true: false;
       return b;
    }
}
