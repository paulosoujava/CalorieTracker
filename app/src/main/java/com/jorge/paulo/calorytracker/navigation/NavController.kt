package com.jorge.paulo.calorytracker.navigation

import androidx.navigation.NavController
import com.jorge.paulo.core.util.UiEvent


fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}