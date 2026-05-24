package com.pandaled.ui.player;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u001e\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bH\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0002\u00a2\u0006\u0002\u0010\u0013\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\bH\u0002\u00a8\u0006\u0016"}, d2 = {"FullScreenContent", "", "project", "Lcom/pandaled/data/model/Project;", "onExit", "Lkotlin/Function0;", "FullScreenPlayer", "projectId", "", "FullScreenTransitionOverlay", "scene", "Lcom/pandaled/data/model/Scene;", "IdleSceneFullRenderer", "idleScene", "Lcom/pandaled/data/model/IdleScene;", "startTime", "SceneFullRenderer", "parseProjectStartMs", "", "(Ljava/lang/String;)Ljava/lang/Long;", "shouldShowIdleBeforeStart", "", "app_debug"})
public final class FullScreenActivityKt {
    
    @androidx.compose.runtime.Composable()
    public static final void FullScreenPlayer(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onExit) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FullScreenContent(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Project project, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onExit) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IdleSceneFullRenderer(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.IdleScene idleScene, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SceneFullRenderer(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Scene scene) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void FullScreenTransitionOverlay(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Scene scene) {
    }
    
    private static final java.lang.Long parseProjectStartMs(java.lang.String startTime) {
        return null;
    }
    
    private static final boolean shouldShowIdleBeforeStart(java.lang.String startTime) {
        return false;
    }
}