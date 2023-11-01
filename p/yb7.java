package p.yb7;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Object;

public final class yb7 extends IllegalStateException	// class@002d89 from classes.dex
{

    public void yb7(Throwable p0){
       super("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What\'s-different-in-2.0#error-handling | "+p0, p0);
    }
}
