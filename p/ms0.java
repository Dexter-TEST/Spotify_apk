package p.ms0;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract class ms0	// class@001ef3 from classes.dex
{

    public static void a(Context p0,Intent[] p1,Bundle p2){
       p0.startActivities(p1, p2);
    }
    public static void b(Context p0,Intent p1,Bundle p2){
       p0.startActivity(p1, p2);
    }
}
