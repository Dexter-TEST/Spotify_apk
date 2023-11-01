package p.m70;
import android.os.Bundle;
import java.lang.String;
import android.util.Size;
import java.lang.Object;
import p.co5;
import android.util.SizeF;

public abstract class m70	// class@001e39 from classes.dex
{

    public static final void a(Bundle p0,String p1,Size p2){
       co5.o(p0, "bundle");
       co5.o(p1, "key");
       p0.putSize(p1, p2);
    }
    public static final void b(Bundle p0,String p1,SizeF p2){
       co5.o(p0, "bundle");
       co5.o(p1, "key");
       p0.putSizeF(p1, p2);
    }
}
