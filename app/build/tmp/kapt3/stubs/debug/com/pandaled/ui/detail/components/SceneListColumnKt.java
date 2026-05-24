package com.pandaled.ui.detail.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u00a3\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000e2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007\u00a2\u0006\u0002\u0010\u0016\u001a\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003\u001a\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0012H\u0003\u00a8\u0006\u001c"}, d2 = {"SceneListColumn", "", "idleScene", "Lcom/pandaled/data/model/IdleScene;", "scenes", "", "Lcom/pandaled/data/model/Scene;", "selectedTarget", "Lcom/pandaled/ui/detail/EditorTarget;", "highlightedSceneIndex", "", "onSelectIdle", "Lkotlin/Function0;", "onSelectScene", "Lkotlin/Function1;", "onMoveScene", "Lkotlin/Function2;", "onAddScene", "Lcom/pandaled/data/model/SceneType;", "onDeleteScene", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/pandaled/data/model/IdleScene;Ljava/util/List;Lcom/pandaled/ui/detail/EditorTarget;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;)V", "idleSceneTypeLabel", "", "type", "Lcom/pandaled/data/model/IdleSceneType;", "sceneTypeLabel", "app_debug"})
public final class SceneListColumnKt {
    
    /**
     * Middle column: idleScene (fixed at top) + scenes list (draggable to reorder).
     */
    @androidx.compose.runtime.Composable()
    public static final void SceneListColumn(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.IdleScene idleScene, @org.jetbrains.annotations.NotNull()
    java.util.List<com.pandaled.data.model.Scene> scenes, @org.jetbrains.annotations.NotNull()
    com.pandaled.ui.detail.EditorTarget selectedTarget, @org.jetbrains.annotations.Nullable()
    java.lang.Integer highlightedSceneIndex, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onSelectIdle, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSelectScene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> onMoveScene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.SceneType, kotlin.Unit> onAddScene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onDeleteScene, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final java.lang.String idleSceneTypeLabel(com.pandaled.data.model.IdleSceneType type) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    private static final java.lang.String sceneTypeLabel(com.pandaled.data.model.SceneType type) {
        return null;
    }
}