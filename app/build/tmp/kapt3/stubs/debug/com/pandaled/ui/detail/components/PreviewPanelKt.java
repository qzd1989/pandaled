package com.pandaled.ui.detail.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000l\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a0\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007\u001a8\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0007\u001a\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a<\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007\u001a\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\"\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0003H\u0007\u001a\u0010\u0010&\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u0017\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0003H\u0002\u00a2\u0006\u0002\u0010*\u001a\u0018\u0010+\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0002\u00a8\u0006."}, d2 = {"ClockRenderer", "", "format", "", "fontKey", "configuredSize", "", "colorHex", "CountdownRenderer", "startTime", "DotMaskOverlay", "overlay", "Lcom/pandaled/data/model/Overlay;", "IdleSceneRenderer", "idleScene", "Lcom/pandaled/data/model/IdleScene;", "ImageSceneRenderer", "scene", "Lcom/pandaled/data/model/Scene;", "PreviewPanel", "project", "Lcom/pandaled/data/model/Project;", "currentPreviewIndex", "isPlaying", "", "sceneName", "selectedTarget", "Lcom/pandaled/ui/detail/EditorTarget;", "modifier", "Landroidx/compose/ui/Modifier;", "SceneRenderer", "TextSceneRenderer", "TransitionOverlay", "type", "Lcom/pandaled/data/model/TransitionType;", "duration", "", "bgColor", "VideoSceneRenderer", "parseColor", "Landroidx/compose/ui/graphics/Color;", "hex", "(Ljava/lang/String;)J", "relativeTextSizePx", "", "viewportShortSide", "app_debug"})
public final class PreviewPanelKt {
    
    /**
     * LED-style preview panel that renders the current scene / idleScene.
     *
     * - idleScene: shows clock/countdown text, image, or black screen
     * - text scene: renders text with scroll/mirror/blink
     * - image scene: loads local image
     * - video scene: placeholder (video in ExoPlayer is complex; show play icon)
     */
    @androidx.compose.runtime.Composable()
    public static final void PreviewPanel(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Project project, int currentPreviewIndex, boolean isPlaying, @org.jetbrains.annotations.NotNull()
    java.lang.String sceneName, @org.jetbrains.annotations.NotNull()
    com.pandaled.ui.detail.EditorTarget selectedTarget, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IdleSceneRenderer(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.IdleScene idleScene, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ClockRenderer(@org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.Nullable()
    java.lang.String fontKey, int configuredSize, @org.jetbrains.annotations.NotNull()
    java.lang.String colorHex) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void CountdownRenderer(@org.jetbrains.annotations.NotNull()
    java.lang.String format, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime, @org.jetbrains.annotations.Nullable()
    java.lang.String fontKey, int configuredSize, @org.jetbrains.annotations.NotNull()
    java.lang.String colorHex) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void SceneRenderer(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Scene scene) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TextSceneRenderer(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Scene scene) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void ImageSceneRenderer(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Scene scene) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void VideoSceneRenderer(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Scene scene) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void DotMaskOverlay(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Overlay overlay) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void TransitionOverlay(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.TransitionType type, long duration, @org.jetbrains.annotations.NotNull()
    java.lang.String bgColor) {
    }
    
    private static final long parseColor(java.lang.String hex) {
        return 0L;
    }
    
    private static final float relativeTextSizePx(int configuredSize, float viewportShortSide) {
        return 0.0F;
    }
}