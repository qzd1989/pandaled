package com.pandaled.ui.detail.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a.\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0002\u001a\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0007\u001a\u0010\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u000e\u00a2\u0006\u0002\n\u0000\"\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u0017"}, d2 = {"assetTypefaceCache", "", "", "Landroid/graphics/Typeface;", "enFonts", "", "Lcom/pandaled/ui/detail/components/FontOption;", "getEnFonts", "()Ljava/util/List;", "zhFonts", "getZhFonts", "FontFamilySelector", "", "selectedKey", "onSelect", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "assetTypeface", "path", "localeFonts", "typefaceForKey", "key", "app_debug"})
public final class FontFamilySelectorKt {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.pandaled.ui.detail.components.FontOption> zhFonts = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<com.pandaled.ui.detail.components.FontOption> enFonts = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.Map<java.lang.String, android.graphics.Typeface> assetTypefaceCache;
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.pandaled.ui.detail.components.FontOption> getZhFonts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.pandaled.ui.detail.components.FontOption> getEnFonts() {
        return null;
    }
    
    /**
     * Active font list based on app locale.
     */
    @androidx.compose.runtime.Composable()
    @org.jetbrains.annotations.NotNull()
    public static final java.util.List<com.pandaled.ui.detail.components.FontOption> localeFonts() {
        return null;
    }
    
    /**
     * Look up a Typeface by font key.
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.Typeface typefaceForKey(@org.jetbrains.annotations.Nullable()
    java.lang.String key) {
        return null;
    }
    
    private static final android.graphics.Typeface assetTypeface(java.lang.String path) {
        return null;
    }
    
    /**
     * Horizontal row of font selector buttons, each showing "Abc" in that font.
     */
    @androidx.compose.runtime.Composable()
    public static final void FontFamilySelector(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedKey, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSelect, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
}