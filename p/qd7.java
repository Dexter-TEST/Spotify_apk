package p.qd7;
import p.oh3;
import java.lang.Object;
import p.u45;
import java.lang.String;
import android.net.Uri;
import p.co5;
import java.lang.StringBuilder;
import android.content.res.Resources;
import android.content.Context;
import android.content.res.Configuration;
import p.r;

public final class qd7 implements oh3	// class@002380 from classes.dex
{

    public void qd7(){
       super();
    }
    public final String a(Object p0,u45 p1){
       p0 = (co5.c(p0.getScheme(), "android.resource"))? p0+'-'+(p1.a.getResources().getConfiguration().uiMode & 0x30): p0.toString();
       return p0;
    }
}
