package com.pandaled.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010\u0012J\u001e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0086@\u00a2\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0014J\u0016\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u001e\u0010 \u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u0014H\u0086@\u00a2\u0006\u0002\u0010!R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/pandaled/data/repository/ProjectRepository;", "", "projectDao", "Lcom/pandaled/data/local/ProjectDao;", "jsonFileManager", "Lcom/pandaled/data/local/JsonFileManager;", "(Lcom/pandaled/data/local/ProjectDao;Lcom/pandaled/data/local/JsonFileManager;)V", "deleteProject", "", "index", "Lcom/pandaled/data/model/ProjectIndex;", "(Lcom/pandaled/data/model/ProjectIndex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllProjectIndices", "Lkotlinx/coroutines/flow/Flow;", "", "getProjectIndex", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "importFromJson", "Lcom/pandaled/data/model/Project;", "json", "loadProject", "fileName", "moveProject", "from", "to", "(Lcom/pandaled/data/model/ProjectIndex;Lcom/pandaled/data/model/ProjectIndex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "projectToJson", "project", "saveProject", "(Lcom/pandaled/data/model/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateProject", "(Lcom/pandaled/data/model/ProjectIndex;Lcom/pandaled/data/model/Project;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class ProjectRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.pandaled.data.local.ProjectDao projectDao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.pandaled.data.local.JsonFileManager jsonFileManager = null;
    
    public ProjectRepository(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.local.ProjectDao projectDao, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.local.JsonFileManager jsonFileManager) {
        super();
    }
    
    /**
     * Observe all project indices (name + pointer).
     */
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.pandaled.data.model.ProjectIndex>> getAllProjectIndices() {
        return null;
    }
    
    /**
     * Get a single index by id.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProjectIndex(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pandaled.data.model.ProjectIndex> $completion) {
        return null;
    }
    
    /**
     * Load full project detail from JSON.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadProject(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pandaled.data.model.Project> $completion) {
        return null;
    }
    
    /**
     * Save a new project (both index + JSON file). Assigns next orderIndex.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveProject(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Project project, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    /**
     * Update an existing project. Updates lastModified to now.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProject(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.ProjectIndex index, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Project project, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Move a project to a new position. Reassigns all orderIndex values.
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object moveProject(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.ProjectIndex from, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.ProjectIndex to, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Delete a project (index + JSON file).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteProject(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.ProjectIndex index, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    /**
     * Import a project from a JSON string (e.g. from QR code).
     */
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object importFromJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pandaled.data.model.Project> $completion) {
        return null;
    }
    
    /**
     * Serialize a project to JSON string (for QR export).
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String projectToJson(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Project project) {
        return null;
    }
}