package p.e8;
import p.gg;
import p.sb4;
import p.ti3;
import java.lang.Object;
import p.aq6;
import java.util.List;
import p.yp6;
import java.lang.String;
import java.util.Collections;
import p.ys5;
import p.ry7;
import com.google.common.collect.c;
import java.lang.Iterable;
import p.ab2;
import p.pp;
import p.ci5;

public final class e8 extends gg	// class@00143e from classes.dex
{
    public final int c;

    public void e8(sb4 p0,ti3 p1,int p2){
       this.c = p2;
       super(p0, p1);
    }
    public final List e(aq6 p0){
       List list;
       c uoc;
       switch (this.c){
           case 0:
             list = ((list = this.a()) == null)? Collections.emptyList(): ry7.U(ry7.S(list));
             return list;
             break;
           case 1:
             list = ((list = this.a()) == null)? Collections.emptyList(): ry7.U(ry7.S(list));
             return list;
             break;
           case 2:
             uoc = ((list = this.a()) != null && !list.isEmpty())? ry7.U(ry7.S(list)): Collections.emptyList();
             return list;
             break;
           case 3:
           case 4:
             list = ((list = this.a()) == null)? Collections.emptyList(): ry7.U(ry7.S(ab2.b(list).a(new pp(5)).d()));
             return list;
             break;
           case 5:
             if (p0.b == yp6.m0) {
                list = Collections.singletonList(p0.toString());
             }else if((list = this.a()) == null){
                list = Collections.emptyList();
             }else {
                uoc = ry7.U(ry7.S(list));
             }
             return list;
             break;
           default:
             return Collections.singletonList(p0.toString());
       }
       return Collections.singletonList(p0.toString());
    }
}
