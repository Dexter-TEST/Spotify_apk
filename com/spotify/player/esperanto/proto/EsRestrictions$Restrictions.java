package com.spotify.player.esperanto.proto.EsRestrictions$Restrictions;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.hr1;
import com.google.protobuf.b;
import com.google.common.collect.d;
import p.f2;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsRestrictions$Restrictions extends c implements u74	// class@000b08 from classes.dex
{
    private bc3 disallowAddToQueueReasons_;
    private bc3 disallowInsertingIntoContextTracksReasons_;
    private bc3 disallowInsertingIntoNextTracksReasons_;
    private bc3 disallowInterruptingPlaybackReasons_;
    private bc3 disallowPausingReasons_;
    private bc3 disallowPeekingNextReasons_;
    private bc3 disallowPeekingPrevReasons_;
    private bc3 disallowRemoteControlReasons_;
    private bc3 disallowRemovingFromContextTracksReasons_;
    private bc3 disallowRemovingFromNextTracksReasons_;
    private bc3 disallowReorderingInContextTracksReasons_;
    private bc3 disallowReorderingInNextTracksReasons_;
    private bc3 disallowResumingReasons_;
    private bc3 disallowSeekingReasons_;
    private bc3 disallowSetQueueReasons_;
    private bc3 disallowSettingPlaybackSpeedReasons_;
    private bc3 disallowSkippingNextReasons_;
    private bc3 disallowSkippingPrevReasons_;
    private bc3 disallowTogglingRepeatContextReasons_;
    private bc3 disallowTogglingRepeatTrackReasons_;
    private bc3 disallowTogglingShuffleReasons_;
    private bc3 disallowTransferringPlaybackReasons_;
    private bc3 disallowUpdatingContextReasons_;
    private static final EsRestrictions$Restrictions DEFAULT_INSTANCE;
    public static final int DISALLOW_ADD_TO_QUEUE_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_INSERTING_INTO_CONTEXT_TRACKS_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_INSERTING_INTO_NEXT_TRACKS_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_INTERRUPTING_PLAYBACK_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_PAUSING_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_PEEKING_NEXT_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_PEEKING_PREV_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_REMOTE_CONTROL_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_REMOVING_FROM_CONTEXT_TRACKS_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_REMOVING_FROM_NEXT_TRACKS_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_REORDERING_IN_CONTEXT_TRACKS_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_REORDERING_IN_NEXT_TRACKS_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_RESUMING_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_SEEKING_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_SETTING_PLAYBACK_SPEED_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_SET_QUEUE_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_SKIPPING_NEXT_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_SKIPPING_PREV_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_TOGGLING_REPEAT_CONTEXT_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_TOGGLING_REPEAT_TRACK_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_TOGGLING_SHUFFLE_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_TRANSFERRING_PLAYBACK_REASONS_FIELD_NUMBER;
    public static final int DISALLOW_UPDATING_CONTEXT_REASONS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsRestrictions$Restrictions restrictions = new EsRestrictions$Restrictions();
       EsRestrictions$Restrictions.DEFAULT_INSTANCE = restrictions;
       c.registerDefaultInstance(EsRestrictions$Restrictions.class, restrictions);
    }
    private void EsRestrictions$Restrictions(){
       super();
       this.disallowPausingReasons_ = c.emptyProtobufList();
       this.disallowResumingReasons_ = c.emptyProtobufList();
       this.disallowSeekingReasons_ = c.emptyProtobufList();
       this.disallowPeekingPrevReasons_ = c.emptyProtobufList();
       this.disallowPeekingNextReasons_ = c.emptyProtobufList();
       this.disallowSkippingPrevReasons_ = c.emptyProtobufList();
       this.disallowSkippingNextReasons_ = c.emptyProtobufList();
       this.disallowTogglingRepeatContextReasons_ = c.emptyProtobufList();
       this.disallowTogglingRepeatTrackReasons_ = c.emptyProtobufList();
       this.disallowTogglingShuffleReasons_ = c.emptyProtobufList();
       this.disallowSetQueueReasons_ = c.emptyProtobufList();
       this.disallowInterruptingPlaybackReasons_ = c.emptyProtobufList();
       this.disallowTransferringPlaybackReasons_ = c.emptyProtobufList();
       this.disallowRemoteControlReasons_ = c.emptyProtobufList();
       this.disallowInsertingIntoNextTracksReasons_ = c.emptyProtobufList();
       this.disallowInsertingIntoContextTracksReasons_ = c.emptyProtobufList();
       this.disallowReorderingInNextTracksReasons_ = c.emptyProtobufList();
       this.disallowReorderingInContextTracksReasons_ = c.emptyProtobufList();
       this.disallowRemovingFromNextTracksReasons_ = c.emptyProtobufList();
       this.disallowRemovingFromContextTracksReasons_ = c.emptyProtobufList();
       this.disallowUpdatingContextReasons_ = c.emptyProtobufList();
       this.disallowAddToQueueReasons_ = c.emptyProtobufList();
       this.disallowSettingPlaybackSpeedReasons_ = c.emptyProtobufList();
    }
    public static EsRestrictions$Restrictions A(){
       return EsRestrictions$Restrictions.DEFAULT_INSTANCE;
    }
    public static EsRestrictions$Restrictions B(){
       return EsRestrictions$Restrictions.DEFAULT_INSTANCE;
    }
    public static hr1 Y(){
       return EsRestrictions$Restrictions.DEFAULT_INSTANCE.createBuilder();
    }
    public static void e(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowAddT = p0.disallowAddToQueueReasons_;
       if (disallowAddT.a == null) {
          p0.disallowAddToQueueReasons_ = c.mutableCopy(disallowAddT);
       }
       a.addAll(p1, p0.disallowAddToQueueReasons_);
       return;
    }
    public static void f(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowInse = p0.disallowInsertingIntoContextTracksReasons_;
       if (disallowInse.a == null) {
          p0.disallowInsertingIntoContextTracksReasons_ = c.mutableCopy(disallowInse);
       }
       a.addAll(p1, p0.disallowInsertingIntoContextTracksReasons_);
       return;
    }
    public static void g(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowInse = p0.disallowInsertingIntoNextTracksReasons_;
       if (disallowInse.a == null) {
          p0.disallowInsertingIntoNextTracksReasons_ = c.mutableCopy(disallowInse);
       }
       a.addAll(p1, p0.disallowInsertingIntoNextTracksReasons_);
       return;
    }
    public static void h(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowInte = p0.disallowInterruptingPlaybackReasons_;
       if (disallowInte.a == null) {
          p0.disallowInterruptingPlaybackReasons_ = c.mutableCopy(disallowInte);
       }
       a.addAll(p1, p0.disallowInterruptingPlaybackReasons_);
       return;
    }
    public static void i(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowPaus = p0.disallowPausingReasons_;
       if (disallowPaus.a == null) {
          p0.disallowPausingReasons_ = c.mutableCopy(disallowPaus);
       }
       a.addAll(p1, p0.disallowPausingReasons_);
       return;
    }
    public static void j(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowPeek = p0.disallowPeekingNextReasons_;
       if (disallowPeek.a == null) {
          p0.disallowPeekingNextReasons_ = c.mutableCopy(disallowPeek);
       }
       a.addAll(p1, p0.disallowPeekingNextReasons_);
       return;
    }
    public static void k(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowPeek = p0.disallowPeekingPrevReasons_;
       if (disallowPeek.a == null) {
          p0.disallowPeekingPrevReasons_ = c.mutableCopy(disallowPeek);
       }
       a.addAll(p1, p0.disallowPeekingPrevReasons_);
       return;
    }
    public static void l(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowRemo = p0.disallowRemoteControlReasons_;
       if (disallowRemo.a == null) {
          p0.disallowRemoteControlReasons_ = c.mutableCopy(disallowRemo);
       }
       a.addAll(p1, p0.disallowRemoteControlReasons_);
       return;
    }
    public static void m(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowRemo = p0.disallowRemovingFromContextTracksReasons_;
       if (disallowRemo.a == null) {
          p0.disallowRemovingFromContextTracksReasons_ = c.mutableCopy(disallowRemo);
       }
       a.addAll(p1, p0.disallowRemovingFromContextTracksReasons_);
       return;
    }
    public static void n(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowRemo = p0.disallowRemovingFromNextTracksReasons_;
       if (disallowRemo.a == null) {
          p0.disallowRemovingFromNextTracksReasons_ = c.mutableCopy(disallowRemo);
       }
       a.addAll(p1, p0.disallowRemovingFromNextTracksReasons_);
       return;
    }
    public static void o(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowReor = p0.disallowReorderingInContextTracksReasons_;
       if (disallowReor.a == null) {
          p0.disallowReorderingInContextTracksReasons_ = c.mutableCopy(disallowReor);
       }
       a.addAll(p1, p0.disallowReorderingInContextTracksReasons_);
       return;
    }
    public static void p(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowReor = p0.disallowReorderingInNextTracksReasons_;
       if (disallowReor.a == null) {
          p0.disallowReorderingInNextTracksReasons_ = c.mutableCopy(disallowReor);
       }
       a.addAll(p1, p0.disallowReorderingInNextTracksReasons_);
       return;
    }
    public static r75 parser(){
       return EsRestrictions$Restrictions.DEFAULT_INSTANCE.getParserForType();
    }
    public static void q(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowResu = p0.disallowResumingReasons_;
       if (disallowResu.a == null) {
          p0.disallowResumingReasons_ = c.mutableCopy(disallowResu);
       }
       a.addAll(p1, p0.disallowResumingReasons_);
       return;
    }
    public static void r(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowSeek = p0.disallowSeekingReasons_;
       if (disallowSeek.a == null) {
          p0.disallowSeekingReasons_ = c.mutableCopy(disallowSeek);
       }
       a.addAll(p1, p0.disallowSeekingReasons_);
       return;
    }
    public static void s(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowSetQ = p0.disallowSetQueueReasons_;
       if (disallowSetQ.a == null) {
          p0.disallowSetQueueReasons_ = c.mutableCopy(disallowSetQ);
       }
       a.addAll(p1, p0.disallowSetQueueReasons_);
       return;
    }
    public static void t(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowSkip = p0.disallowSkippingNextReasons_;
       if (disallowSkip.a == null) {
          p0.disallowSkippingNextReasons_ = c.mutableCopy(disallowSkip);
       }
       a.addAll(p1, p0.disallowSkippingNextReasons_);
       return;
    }
    public static void u(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowSkip = p0.disallowSkippingPrevReasons_;
       if (disallowSkip.a == null) {
          p0.disallowSkippingPrevReasons_ = c.mutableCopy(disallowSkip);
       }
       a.addAll(p1, p0.disallowSkippingPrevReasons_);
       return;
    }
    public static void v(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowTogg = p0.disallowTogglingRepeatContextReasons_;
       if (disallowTogg.a == null) {
          p0.disallowTogglingRepeatContextReasons_ = c.mutableCopy(disallowTogg);
       }
       a.addAll(p1, p0.disallowTogglingRepeatContextReasons_);
       return;
    }
    public static void w(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowTogg = p0.disallowTogglingRepeatTrackReasons_;
       if (disallowTogg.a == null) {
          p0.disallowTogglingRepeatTrackReasons_ = c.mutableCopy(disallowTogg);
       }
       a.addAll(p1, p0.disallowTogglingRepeatTrackReasons_);
       return;
    }
    public static void x(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowTogg = p0.disallowTogglingShuffleReasons_;
       if (disallowTogg.a == null) {
          p0.disallowTogglingShuffleReasons_ = c.mutableCopy(disallowTogg);
       }
       a.addAll(p1, p0.disallowTogglingShuffleReasons_);
       return;
    }
    public static void y(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowTran = p0.disallowTransferringPlaybackReasons_;
       if (disallowTran.a == null) {
          p0.disallowTransferringPlaybackReasons_ = c.mutableCopy(disallowTran);
       }
       a.addAll(p1, p0.disallowTransferringPlaybackReasons_);
       return;
    }
    public static void z(EsRestrictions$Restrictions p0,d p1){
       EsRestrictions$Restrictions disallowUpda = p0.disallowUpdatingContextReasons_;
       if (disallowUpda.a == null) {
          p0.disallowUpdatingContextReasons_ = c.mutableCopy(disallowUpda);
       }
       a.addAll(p1, p0.disallowUpdatingContextReasons_);
       return;
    }
    public final bc3 C(){
       return this.disallowAddToQueueReasons_;
    }
    public final bc3 D(){
       return this.disallowInsertingIntoContextTracksReasons_;
    }
    public final bc3 E(){
       return this.disallowInsertingIntoNextTracksReasons_;
    }
    public final bc3 F(){
       return this.disallowInterruptingPlaybackReasons_;
    }
    public final bc3 G(){
       return this.disallowPausingReasons_;
    }
    public final bc3 H(){
       return this.disallowPeekingNextReasons_;
    }
    public final bc3 I(){
       return this.disallowPeekingPrevReasons_;
    }
    public final bc3 J(){
       return this.disallowRemoteControlReasons_;
    }
    public final bc3 K(){
       return this.disallowRemovingFromContextTracksReasons_;
    }
    public final bc3 L(){
       return this.disallowRemovingFromNextTracksReasons_;
    }
    public final bc3 M(){
       return this.disallowReorderingInContextTracksReasons_;
    }
    public final bc3 N(){
       return this.disallowReorderingInNextTracksReasons_;
    }
    public final bc3 O(){
       return this.disallowResumingReasons_;
    }
    public final bc3 P(){
       return this.disallowSeekingReasons_;
    }
    public final bc3 Q(){
       return this.disallowSetQueueReasons_;
    }
    public final bc3 R(){
       return this.disallowSkippingNextReasons_;
    }
    public final bc3 S(){
       return this.disallowSkippingPrevReasons_;
    }
    public final bc3 T(){
       return this.disallowTogglingRepeatContextReasons_;
    }
    public final bc3 U(){
       return this.disallowTogglingRepeatTrackReasons_;
    }
    public final bc3 V(){
       return this.disallowTogglingShuffleReasons_;
    }
    public final bc3 W(){
       return this.disallowTransferringPlaybackReasons_;
    }
    public final bc3 X(){
       return this.disallowUpdatingContextReasons_;
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[23];
             objArray[0] = "disallowPausingReasons_";
             objArray[b] = "disallowResumingReasons_";
             objArray[2] = "disallowSeekingReasons_";
             objArray[3] = "disallowPeekingPrevReasons_";
             objArray[4] = "disallowPeekingNextReasons_";
             objArray[5] = "disallowSkippingPrevReasons_";
             objArray[6] = "disallowSkippingNextReasons_";
             objArray[7] = "disallowTogglingRepeatContextReasons_";
             objArray[8] = "disallowTogglingRepeatTrackReasons_";
             objArray[9] = "disallowTogglingShuffleReasons_";
             objArray[10] = "disallowSetQueueReasons_";
             objArray[11] = "disallowInterruptingPlaybackReasons_";
             objArray[12] = "disallowTransferringPlaybackReasons_";
             objArray[13] = "disallowRemoteControlReasons_";
             objArray[14] = "disallowInsertingIntoNextTracksReasons_";
             objArray[15] = "disallowInsertingIntoContextTracksReasons_";
             objArray[16] = "disallowReorderingInNextTracksReasons_";
             objArray[17] = "disallowReorderingInContextTracksReasons_";
             objArray[18] = "disallowRemovingFromNextTracksReasons_";
             objArray[19] = "disallowRemovingFromContextTracksReasons_";
             objArray[20] = "disallowUpdatingContextReasons_";
             objArray[21] = "disallowAddToQueueReasons_";
             objArray[22] = "disallowSettingPlaybackSpeedReasons_";
             return c.newMessageInfo(EsRestrictions$Restrictions.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x17\xff\x02\xff\x02\xff\x02\xff\x02\x01\x17\x17\xff\x02\xff\x02\x17\xff\x02\xff\x02\x01\x02\x02\x02\x02\x02\x03\x02\x02\x04\x02\x02\x05\x02\x02\x06\x02\x02\x07\x02\x02\b\x02\x02\t\x02\x02\n\x02\x02\x0b\x02\x02\f\x02\x02\r\x02\x02\x0e\x02\x02\x0f\x02\x02\x10\x02\x02\x11\x02\x02\x12\x02\x02\x13\x02\x02\x14\x02\x02\x15\x02\x02\x16\x02\x02\x17\x02\x02", objArray);
           case 3:
             return new EsRestrictions$Restrictions();
           case 4:
             return new hr1();
           case 5:
             return EsRestrictions$Restrictions.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsRestrictions$Restrictions.PARSER) == null) {
                _monitor_enter(EsRestrictions$Restrictions.class);
                if ((pARSER = EsRestrictions$Restrictions.PARSER) == null) {
                   pARSER = new ii2(EsRestrictions$Restrictions.DEFAULT_INSTANCE);
                   EsRestrictions$Restrictions.PARSER = pARSER;
                }
                _monitor_exit(EsRestrictions$Restrictions.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}
