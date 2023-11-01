package p.wg4;
import android.app.Activity;
import android.content.Intent;

public abstract class wg4	// class@002b30 from classes.dex
{

    public static Intent a(Activity p0){
       return p0.getParentActivityIntent();
    }
    public static boolean b(Activity p0,Intent p1){
       return p0.navigateUpTo(p1);
    }
    public static boolean c(Activity p0,Intent p1){
       return p0.shouldUpRecreateTask(p1);
    }
}
