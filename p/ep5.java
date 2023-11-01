package p.ep5;
import java.lang.Exception;
import java.lang.String;
import java.lang.System;
import java.lang.StackTraceElement;
import java.lang.Throwable;

public abstract class ep5 extends Exception	// class@0014d2 from classes.dex
{
    public static final boolean a;
    public static final StackTraceElement[] b;

    static {
       boolean b = (System.getProperty("surefire.test.class.path") != null)? true: false;
       ep5.a = b;
       StackTraceElement[] stackTraceEl = new StackTraceElement[0];
       ep5.b = stackTraceEl;
    }
    public void ep5(){
       super();
    }
    public synchronized final Throwable fillInStackTrace(){
       return null;
    }
}
