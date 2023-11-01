package com.spotify.messaging.criticalmessaging.criticalmessagingsdk.mobius.states.RecordImpressionState;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class RecordImpressionState extends Enum	// class@000a17 from classes.dex
{
    private static final RecordImpressionState[] $VALUES;
    public static final RecordImpressionState FAILURE;
    public static final RecordImpressionState SUCCESS;

    private static final RecordImpressionState[] $values(){
       RecordImpressionState[] recordImpres = new RecordImpressionState[]{RecordImpressionState.SUCCESS,RecordImpressionState.FAILURE};
       return recordImpres;
    }
    static {
       RecordImpressionState.SUCCESS = new RecordImpressionState("SUCCESS", 0);
       RecordImpressionState.FAILURE = new RecordImpressionState("FAILURE", 1);
       RecordImpressionState.$VALUES = RecordImpressionState.$values();
    }
    private void RecordImpressionState(String p0,int p1){
       super(p0, p1);
    }
    public static RecordImpressionState valueOf(String p0){
       return Enum.valueOf(RecordImpressionState.class, p0);
    }
    public static RecordImpressionState[] values(){
       return RecordImpressionState.$VALUES.clone();
    }
}
