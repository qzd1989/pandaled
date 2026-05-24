package com.pandaled.data.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\tH\u00c6\u0003J\t\u0010#\u001a\u00020\u000bH\u00c6\u0003J\t\u0010$\u001a\u00020\rH\u00c6\u0003J\t\u0010%\u001a\u00020\u000fH\u00c6\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010*\u001a\u00020(J\t\u0010+\u001a\u00020\u0007H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e\u00a8\u0006-"}, d2 = {"Lcom/pandaled/data/model/Scene;", "", "name", "", "type", "Lcom/pandaled/data/model/SceneType;", "duration", "", "playMode", "Lcom/pandaled/data/model/PlayMode;", "content", "Lcom/pandaled/data/model/SceneContent;", "transition", "Lcom/pandaled/data/model/Transition;", "appearance", "Lcom/pandaled/data/model/Appearance;", "(Ljava/lang/String;Lcom/pandaled/data/model/SceneType;ILcom/pandaled/data/model/PlayMode;Lcom/pandaled/data/model/SceneContent;Lcom/pandaled/data/model/Transition;Lcom/pandaled/data/model/Appearance;)V", "getAppearance", "()Lcom/pandaled/data/model/Appearance;", "getContent", "()Lcom/pandaled/data/model/SceneContent;", "getDuration", "()I", "getName", "()Ljava/lang/String;", "getPlayMode", "()Lcom/pandaled/data/model/PlayMode;", "getTransition", "()Lcom/pandaled/data/model/Transition;", "getType", "()Lcom/pandaled/data/model/SceneType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hasMissingAsset", "hashCode", "toString", "app_debug"})
public final class Scene {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull()
    private final com.pandaled.data.model.SceneType type = null;
    private final int duration = 0;
    @org.jetbrains.annotations.NotNull()
    private final com.pandaled.data.model.PlayMode playMode = null;
    @org.jetbrains.annotations.NotNull()
    private final com.pandaled.data.model.SceneContent content = null;
    @org.jetbrains.annotations.NotNull()
    private final com.pandaled.data.model.Transition transition = null;
    @org.jetbrains.annotations.NotNull()
    private final com.pandaled.data.model.Appearance appearance = null;
    
    public Scene(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneType type, int duration, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.PlayMode playMode, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneContent content, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Transition transition, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Appearance appearance) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.SceneType getType() {
        return null;
    }
    
    public final int getDuration() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.PlayMode getPlayMode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.SceneContent getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.Transition getTransition() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.Appearance getAppearance() {
        return null;
    }
    
    /**
     * Returns true if this scene has a null/empty source for image/video type.
     */
    public final boolean hasMissingAsset() {
        return false;
    }
    
    public Scene() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.SceneType component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.PlayMode component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.SceneContent component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.Transition component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.Appearance component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.model.Scene copy(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneType type, int duration, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.PlayMode playMode, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneContent content, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Transition transition, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Appearance appearance) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}