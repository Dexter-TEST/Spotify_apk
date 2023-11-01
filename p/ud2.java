package p.ud2;
import p.md2;
import androidx.fragment.app.o;
import java.lang.ClassLoader;
import java.lang.String;
import androidx.fragment.app.Fragment;
import p.nd2;
import java.lang.Class;
import java.lang.Object;
import android.content.Context;
import android.os.Bundle;

public final class ud2 extends md2	// class@00288b from classes.dex
{
    public final o b;

    public void ud2(o p0){
       this.b = p0;
       super();
    }
    public final Fragment a(ClassLoader p0,String p1){
       o u = this.b.u;
       u.getClass();
       return Fragment.instantiate(u.b, p1, null);
    }
}
