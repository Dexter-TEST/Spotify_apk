package com.spotify.legacyglue.gluelib.components.toolbar.ToolbarSide;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ToolbarSide extends Enum	// class@0008ee from classes.dex
{
    private static final ToolbarSide[] $VALUES;
    public static final ToolbarSide END;
    public static final ToolbarSide START;

    static {
       ToolbarSide toolbarSide = new ToolbarSide("START", 0);
       ToolbarSide.START = toolbarSide;
       ToolbarSide toolbarSide1 = new ToolbarSide("END", 1);
       ToolbarSide.END = toolbarSide1;
       ToolbarSide[] toolbarSideA = new ToolbarSide[]{toolbarSide,toolbarSide1};
       ToolbarSide.$VALUES = toolbarSideA;
    }
    private void ToolbarSide(String p0,int p1){
       super(p0, p1);
    }
    public static ToolbarSide valueOf(String p0){
       return Enum.valueOf(ToolbarSide.class, p0);
    }
    public static ToolbarSide[] values(){
       return ToolbarSide.$VALUES.clone();
    }
}
