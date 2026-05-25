package com.pandaled.ui.detail;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0011J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dJ\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\r\u0010 \u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0002\u0010!J\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020$J\u000e\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u001dJ\u0016\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00192\u0006\u0010)\u001a\u00020\u0019J\u000e\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020,J\b\u0010-\u001a\u00020\u0011H\u0002J\u0006\u0010.\u001a\u00020\u0011J\u0006\u0010/\u001a\u00020\u0011J\u000e\u00100\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u00101\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u00102\u001a\u00020\u0011J\u0006\u00103\u001a\u00020\u0011J\u000e\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u0019J\u000e\u00106\u001a\u00020\u00112\u0006\u00107\u001a\u000208J\u0016\u00109\u001a\u00020\u00112\u0006\u0010:\u001a\u00020\u001d2\u0006\u0010;\u001a\u00020\u001dJ\u0016\u0010<\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010=\u001a\u00020\u001fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006>"}, d2 = {"Lcom/pandaled/ui/detail/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/pandaled/ui/detail/DetailUiState;", "currentIndex", "Lcom/pandaled/data/model/ProjectIndex;", "currentProject", "Lcom/pandaled/data/model/Project;", "repository", "Lcom/pandaled/data/repository/ProjectRepository;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "addScene", "", "type", "Lcom/pandaled/data/model/SceneType;", "advancePreview", "autoSave", "clearTabSwitch", "deleteScene", "index", "", "dismissQrDialog", "generateShareQr", "label", "", "getSelectedScene", "Lcom/pandaled/data/model/Scene;", "getSelectedSceneIndex", "()Ljava/lang/Integer;", "launchFullScreen", "context", "Landroid/content/Context;", "loadProject", "projectId", "moveScene", "fromIndex", "toIndex", "navigateToMissingAsset", "missing", "Lcom/pandaled/data/model/MissingAsset;", "refreshState", "saveProject", "selectIdleScene", "selectScene", "selectTab", "startPreviewPlayback", "stopPreview", "triggerScenePreview", "sceneIndex", "updateIdleScene", "idleScene", "Lcom/pandaled/data/model/IdleScene;", "updateProjectInfo", "name", "startTime", "updateScene", "scene", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.pandaled.data.repository.ProjectRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.pandaled.ui.detail.DetailUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.pandaled.ui.detail.DetailUiState> uiState = null;
    @org.jetbrains.annotations.Nullable()
    private com.pandaled.data.model.Project currentProject;
    @org.jetbrains.annotations.Nullable()
    private com.pandaled.data.model.ProjectIndex currentIndex;
    
    public DetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.pandaled.ui.detail.DetailUiState> getUiState() {
        return null;
    }
    
    public final void loadProject(@org.jetbrains.annotations.NotNull()
    java.lang.String projectId) {
    }
    
    public final void selectIdleScene() {
    }
    
    public final void selectScene(int index) {
    }
    
    public final void moveScene(int fromIndex, int toIndex) {
    }
    
    public final void updateIdleScene(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.IdleScene idleScene) {
    }
    
    public final void updateScene(int index, @org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.Scene scene) {
    }
    
    public final void updateProjectInfo(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String startTime) {
    }
    
    public final void addScene(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.SceneType type) {
    }
    
    public final void deleteScene(int index) {
    }
    
    public final void startPreviewPlayback() {
    }
    
    public final void advancePreview() {
    }
    
    public final void stopPreview() {
    }
    
    /**
     * Re-show scene in preview on update.
     */
    public final void triggerScenePreview(int sceneIndex) {
    }
    
    public final void saveProject() {
    }
    
    public final void navigateToMissingAsset(@org.jetbrains.annotations.NotNull()
    com.pandaled.data.model.MissingAsset missing) {
    }
    
    public final void launchFullScreen(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void generateShareQr(@org.jetbrains.annotations.NotNull()
    java.lang.String label) {
    }
    
    public final void selectTab(int index) {
    }
    
    public final void clearTabSwitch() {
    }
    
    public final void dismissQrDialog() {
    }
    
    private final void autoSave() {
    }
    
    private final void refreshState() {
    }
    
    /**
     * Get the currently selected scene (or null if idleScene is selected).
     */
    @org.jetbrains.annotations.Nullable()
    public final com.pandaled.data.model.Scene getSelectedScene() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getSelectedSceneIndex() {
        return null;
    }
}