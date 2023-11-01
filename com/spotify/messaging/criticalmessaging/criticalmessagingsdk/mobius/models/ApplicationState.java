package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.mobius.models.ApplicationState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ApplicationState extends Enum	// class@000a14 from classes.dex
{
    private static final ApplicationState[] $VALUES;
    public static final ApplicationState BACKGROUND;
    public static final ApplicationState FOREGROUND;

    private static final ApplicationState[] $values(){
       ApplicationState[] uApplication = new ApplicationState[]{ApplicationState.FOREGROUND,ApplicationState.BACKGROUND};
       return uApplication;
    }
    static {
       ApplicationState.FOREGROUND = new ApplicationState("FOREGROUND", 0);
       ApplicationState.BACKGROUND = new ApplicationState("BACKGROUND", 1);
       ApplicationState.$VALUES = ApplicationState.$values();
    }
    private void ApplicationState(String p0,int p1){
       super(p0, p1);
    }
    public static ApplicationState valueOf(String p0){
       return Enum.valueOf(ApplicationState.class, p0);
    }
    public static ApplicationState[] values(){
       return ApplicationState.$VALUES.clone();
    }
}
