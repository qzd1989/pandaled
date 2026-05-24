package com.pandaled;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lcom/pandaled/PandaLedApp;", "Landroid/app/Application;", "()V", "<set-?>", "Lcom/pandaled/data/local/AppDatabase;", "database", "getDatabase", "()Lcom/pandaled/data/local/AppDatabase;", "Lcom/pandaled/data/local/JsonFileManager;", "jsonFileManager", "getJsonFileManager", "()Lcom/pandaled/data/local/JsonFileManager;", "Lcom/pandaled/data/repository/ProjectRepository;", "projectRepository", "getProjectRepository", "()Lcom/pandaled/data/repository/ProjectRepository;", "onCreate", "", "Companion", "app_debug"})
public final class PandaLedApp extends android.app.Application {
    private com.pandaled.data.local.AppDatabase database;
    private com.pandaled.data.local.JsonFileManager jsonFileManager;
    private com.pandaled.data.repository.ProjectRepository projectRepository;
    private static com.pandaled.PandaLedApp instance;
    @org.jetbrains.annotations.NotNull()
    public static final com.pandaled.PandaLedApp.Companion Companion = null;
    
    public PandaLedApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.local.AppDatabase getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.local.JsonFileManager getJsonFileManager() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.pandaled.data.repository.ProjectRepository getProjectRepository() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/pandaled/PandaLedApp$Companion;", "", "()V", "<set-?>", "Lcom/pandaled/PandaLedApp;", "instance", "getInstance", "()Lcom/pandaled/PandaLedApp;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.pandaled.PandaLedApp getInstance() {
            return null;
        }
    }
}