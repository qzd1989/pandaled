package com.pandaled.data.local;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0002\u0010\u000fJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u000eJ\"\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0086@\u00a2\u0006\u0002\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/pandaled/data/local/JsonFileManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gson", "Lcom/google/gson/Gson;", "projectsDir", "Ljava/io/File;", "getProjectsDir", "()Ljava/io/File;", "deleteProject", "", "fileName", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadProject", "Lcom/pandaled/data/model/Project;", "parseFromJson", "json", "saveProject", "project", "(Lcom/pandaled/data/model/Project;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toJson", "app_debug"})
public final class JsonFileManager {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    public JsonFileManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    private final java.io.File getProjectsDir() {
        return null;
    }
    
    /**
     * Save a Project to a JSON file.
     * @return the file name (not full path) used.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveProject(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Project project, @org.jetbrains.annotations.Nullable()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    /**
     * Load a Project from a JSON file by its filename.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadProject(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pandaled.data.model.Project> $completion) {
        return null;
    }
    
    /**
     * Delete a project JSON file.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteProject(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    /**
     * Parse a Project from a raw JSON string (used for QR import).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.pandaled.data.model.Project parseFromJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
        return null;
    }
    
    /**
     * Serialize a Project to a JSON string.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String toJson(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Project project) {
        return null;
    }
}