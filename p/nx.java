package p.nx;
import java.util.HashSet;
import p.ox;
import java.lang.Character;
import java.lang.Object;
import java.util.AbstractCollection;

public final class nx extends HashSet	// class@00206e from classes.dex
{

    public void nx(){
       super();
       byte[] a = ox.a;
       int len = a.length;
       for (int i = 0; i < len; i = i + 1) {
          int i1 = a[i] & 0x00ff;
          this.add(Character.valueOf((char)i1));
       }
       return;
    }
}
