package com.pandaled.util

import android.app.Activity
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.interstitial.InterstitialAd
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback

object AdManager {

    private const val INTERSTITIAL_UNIT_ID = "ca-app-pub-7768614948828316/2394673168"

    /** Load ad, then show it immediately. Falls through on failure. */
    fun loadAndShow(activity: Activity, onDismissed: () -> Unit) {
        InterstitialAd.load(
            activity,
            INTERSTITIAL_UNIT_ID,
            com.google.android.gms.ads.AdRequest.Builder().build(),
            object : InterstitialAdLoadCallback() {
                override fun onAdLoaded(ad: InterstitialAd) {
                    ad.fullScreenContentCallback = object : com.google.android.gms.ads.FullScreenContentCallback() {
                        override fun onAdDismissedFullScreenContent() {
                            onDismissed()
                        }

                        override fun onAdFailedToShowFullScreenContent(error: com.google.android.gms.ads.AdError) {
                            onDismissed()
                        }
                    }
                    ad.show(activity)
                }

                override fun onAdFailedToLoad(error: LoadAdError) {
                    onDismissed()
                }
            }
        )
    }
}
