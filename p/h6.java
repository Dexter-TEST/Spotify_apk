package p.h6;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.content.IntentSender;

public abstract class h6	// class@0017f2 from classes.dex
{

    public static void a(Activity p0){
       p0.finishAffinity();
    }
    public static void b(Activity p0,Intent p1,int p2,Bundle p3){
       p0.startActivityForResult(p1, p2, p3);
    }
    public static void c(Activity p0,IntentSender p1,int p2,Intent p3,int p4,int p5,int p6,Bundle p7){
       p0.startIntentSenderForResult(p1, p2, p3, p4, p5, p6, p7);
    }
}
