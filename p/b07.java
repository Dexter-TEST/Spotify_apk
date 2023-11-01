package p.b07;
import p.ub3;
import java.lang.Object;
import java.lang.String;
import p.rn6;
import p.av6;
import java.util.HashSet;
import java.lang.AssertionError;

public final class b07 implements ub3	// class@00102d from classes.dex
{

    public void b07(int p0){
       super();
    }
    public void b07(int p0,int p1){
       switch (p0){
           case 1:
             super(1);
             return;
           case 2:
             super(2);
             return;
           case 3:
             super(3);
             return;
           case 4:
             super(4);
             return;
           case 5:
             super(5);
             return;
           case 6:
             super(6);
             return;
           case 7:
             super(7);
             return;
           case 10:
             super(10);
             return;
           case 11:
             super(11);
             return;
           case 12:
             super(12);
             return;
           case 13:
             super(13);
             return;
           case 15:
             super(15);
             return;
           case 16:
             super(16);
             return;
           case 17:
             super(17);
             return;
           case 19:
             super(19);
             return;
           case 20:
             super(20);
             return;
           case 22:
             super(22);
             return;
           case 25:
             super(25);
             return;
           case 26:
             super(26);
             return;
           case 27:
             super(27);
             return;
           case 28:
             super(28);
             return;
           case 29:
             super(29);
             return;
           default:
             super(0);
             return;
       }
    }
    public static rn6 b(String p0){
       if (av6.D0(p0, "__", false)) {
          throw new AssertionError("Cannot create key in protected namespace");
       }
       HashSet c = rn6.c;
       if (c.contains(p0)) {
          throw new AssertionError("Requesting same string for a key previously defined somewhere else: ".concat(p0));
       }
       c.add(p0);
       return new rn6(p0);
    }
    public synchronized final rn6 a(String p0){
       return b07.b(p0);
    }
    public synchronized final rn6 c(){
       return b07.b("ON_DEMAND_SET");
    }
}
