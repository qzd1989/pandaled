package com.pandaled.ui.detail.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000\u00bc\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a4\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007\u001a&\u0010\u000e\u001a\u00020\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a4\u0010\u0010\u001a\u00020\u00012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f2\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a.\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00010\u0007\u00a2\u0006\u0002\b\u0018\u00a2\u0006\u0002\b\u0019H\u0003\u001a\u0010\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u0015H\u0003\u001a.\u0010\u001c\u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a&\u0010 \u001a\u00020\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u001d2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a$\u0010!\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020#2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a$\u0010$\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020%2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a4\u0010&\u001a\u00020\u00012\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a_\u0010,\u001a\u00020\u00012\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010*2\u0012\u00102\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010\u00072\u0018\u00103\u001a\u0014\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0001042\b\b\u0002\u00105\u001a\u000206H\u0007\u00a2\u0006\u0002\u00107\u001a$\u00108\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020%2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a>\u00109\u001a\u00020\u00012\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150;0\f2\u0006\u0010<\u001a\u00020\u00152\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a$\u0010>\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020%2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00010\u0007H\u0007\u001a \u0010?\u001a\u00020\u00152\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u0015H\u0002\u001a\u0010\u0010E\u001a\u00020\u00152\u0006\u0010F\u001a\u00020GH\u0003\u001a\u0010\u0010H\u001a\u00020\u00152\u0006\u0010F\u001a\u00020\u0005H\u0003\u001a\u0010\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020KH\u0003\u001a\u0010\u0010L\u001a\u00020\u00152\u0006\u0010F\u001a\u00020MH\u0003\u00a8\u0006N"}, d2 = {"AppearanceEditor", "", "appearance", "Lcom/pandaled/data/model/Appearance;", "sceneType", "Lcom/pandaled/data/model/SceneType;", "onUpdate", "Lkotlin/Function1;", "BackgroundColorEditor", "bg", "Lcom/pandaled/data/model/ColorConfig;", "modes", "", "Lcom/pandaled/data/model/ColorType;", "ColorConfigEditor", "colorConfig", "DotMaskEditor", "overlays", "Lcom/pandaled/data/model/Overlay;", "EditorSection", "title", "", "content", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "FieldLabel", "text", "IdleClockCountdownEditor", "Lcom/pandaled/data/model/IdleSceneContent;", "isClock", "", "IdleImageEditor", "IdleSceneEditor", "idleScene", "Lcom/pandaled/data/model/IdleScene;", "ImageContentEditor", "Lcom/pandaled/data/model/SceneContent;", "SceneEditor", "scene", "Lcom/pandaled/data/model/Scene;", "sceneIndex", "", "isHighlighted", "SceneEditorColumn", "project", "Lcom/pandaled/data/model/Project;", "selectedTarget", "Lcom/pandaled/ui/detail/EditorTarget;", "highlightedSceneIndex", "onUpdateIdleScene", "onUpdateScene", "Lkotlin/Function2;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/pandaled/data/model/Project;Lcom/pandaled/ui/detail/EditorTarget;Ljava/lang/Integer;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;)V", "TextContentEditor", "TypeSelector", "options", "Lkotlin/Pair;", "selected", "onSelect", "VideoContentEditor", "copyToAppStorage", "context", "Landroid/content/Context;", "uri", "Landroid/net/Uri;", "prefix", "idleSceneTypeLabel", "type", "Lcom/pandaled/data/model/IdleSceneType;", "sceneTypeLabel", "scrollDirectionLabel", "dir", "Lcom/pandaled/data/model/ScrollDirection;", "transitionTypeLabel", "Lcom/pandaled/data/model/TransitionType;", "app_debug"})
public final class SceneEditorColumnKt {
    
    /**
     * Right column: detailed editor for the currently selected idleScene or scene.
     * When the user edits a field, the preview re-plays that scene.
     */
    @androidx.compose.runtime.Composable()
    public static final void SceneEditorColumn(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Project project, @org.jetbrains.annotations.NotNull()
    com.pandaled.ui.detail.EditorTarget selectedTarget, @org.jetbrains.annotations.Nullable()
    java.lang.Integer highlightedSceneIndex, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.IdleScene, kotlin.Unit> onUpdateIdleScene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super com.pandaled.data.model.Scene, kotlin.Unit> onUpdateScene, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void EditorSection(java.lang.String title, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.ColumnScope, kotlin.Unit> content) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void FieldLabel(java.lang.String text) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IdleSceneEditor(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.IdleScene idleScene, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.IdleScene, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IdleClockCountdownEditor(@org.jetbrains.annotations.Nullable()
    com.pandaled.data.model.IdleSceneContent content, boolean isClock, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.IdleSceneContent, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IdleImageEditor(@org.jetbrains.annotations.Nullable()
    com.pandaled.data.model.IdleSceneContent content, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.IdleSceneContent, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SceneEditor(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Scene scene, int sceneIndex, boolean isHighlighted, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.Scene, kotlin.Unit> onUpdate) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void TypeSelector(@org.jetbrains.annotations.NotNull()
    java.util.List<kotlin.Pair<java.lang.String, java.lang.String>> options, @org.jetbrains.annotations.NotNull()
    java.lang.String selected, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSelect) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TextContentEditor(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneContent content, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.SceneContent, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ImageContentEditor(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneContent content, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.SceneContent, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void VideoContentEditor(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneContent content, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.SceneContent, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ColorConfigEditor(@org.jetbrains.annotations.Nullable()
    com.pandaled.data.model.ColorConfig colorConfig, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.ColorConfig, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void BackgroundColorEditor(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.ColorConfig bg, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.ColorConfig, kotlin.Unit> onUpdate, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.pandaled.data.model.ColorType> modes) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void AppearanceEditor(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Appearance appearance, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneType sceneType, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.pandaled.data.model.Appearance, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DotMaskEditor(@org.jetbrains.annotations.Nullable()
    java.util.List<com.pandaled.data.model.Overlay> overlays, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.pandaled.data.model.Overlay>, kotlin.Unit> onUpdate) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final java.lang.String idleSceneTypeLabel(com.pandaled.data.model.IdleSceneType type) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    private static final java.lang.String sceneTypeLabel(com.pandaled.data.model.SceneType type) {
        return null;
    }
    
    private static final java.lang.String copyToAppStorage(android.content.Context context, android.net.Uri uri, java.lang.String prefix) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    private static final java.lang.String transitionTypeLabel(com.pandaled.data.model.TransitionType type) {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    private static final java.lang.String scrollDirectionLabel(com.pandaled.data.model.ScrollDirection dir) {
        return null;
    }
}