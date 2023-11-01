package p.nw6;
import java.io.Closeable;
import java.lang.String;
import java.lang.Object;
import android.database.Cursor;
import p.tw6;
import android.os.CancellationSignal;
import java.util.List;
import p.uw6;

public interface abstract nw6 implements Closeable	// class@002063 from classes.dex
{

    boolean G();
    boolean M();
    void Q();
    void R(String p0,Object[] p1);
    void S();
    Cursor a0(String p0);
    String d();
    Cursor f0(tw6 p0);
    void g();
    void h();
    Cursor i(tw6 p0,CancellationSignal p1);
    boolean isOpen();
    List n();
    void r(String p0);
    void setVersion(int p0);
    uw6 w(String p0);
}
