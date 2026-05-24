package com.pandaled.data.model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/pandaled/data/model/ScrollDirection;", "", "(Ljava/lang/String;I)V", "LEFT_TO_RIGHT", "RIGHT_TO_LEFT", "TOP_TO_BOTTOM", "BOTTOM_TO_TOP", "app_debug"})
public enum ScrollDirection {
    @com.google.gson.annotations.SerializedName(value = "leftToRight")
    /*public static final*/ LEFT_TO_RIGHT /* = new LEFT_TO_RIGHT() */,
    @com.google.gson.annotations.SerializedName(value = "rightToLeft")
    /*public static final*/ RIGHT_TO_LEFT /* = new RIGHT_TO_LEFT() */,
    @com.google.gson.annotations.SerializedName(value = "topToBottom")
    /*public static final*/ TOP_TO_BOTTOM /* = new TOP_TO_BOTTOM() */,
    @com.google.gson.annotations.SerializedName(value = "bottomToTop")
    /*public static final*/ BOTTOM_TO_TOP /* = new BOTTOM_TO_TOP() */;
    
    ScrollDirection() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<com.pandaled.data.model.ScrollDirection> getEntries() {
        return null;
    }
}