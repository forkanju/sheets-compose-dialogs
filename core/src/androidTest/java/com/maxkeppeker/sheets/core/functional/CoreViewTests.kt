@file:OptIn(ExperimentalMaterial3Api::class)

package com.maxkeppeker.sheets.core.functional

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.maxkeppeker.sheets.core.CoreView
import com.maxkeppeker.sheets.core.models.CoreSelection
import com.maxkeppeker.sheets.core.models.base.SelectionButton
import com.maxkeppeker.sheets.core.models.base.SheetState
import com.maxkeppeler.sheets.test.utils.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CoreViewTests {

    @get:Rule
    val rule = createComposeRule()

    @Test
    fun coreViewVisible() {
        rule.setContentAndWaitForIdle {
            CoreView(
                sheetState = SheetState(visible = true),
                selection = CoreSelection(),
                body = { },
            )
        }
        rule.onView().assertExists()
        rule.onView().assertIsDisplayed()
    }

    @Test
    fun coreViewNotVisible() {
        rule.setContentAndWaitForIdle {
            CoreView(
                sheetState = SheetState(visible = false),
                selection = CoreSelection(),
                body = { },
            )
        }
        rule.onView().assertExists()
        rule.onView().assertIsDisplayed()
    }

    @Test
    fun coreViewInvokesPositiveButton() {
        var positiveCalled = false
        rule.setContent {
            CoreView(
                sheetState = SheetState(visible = true),
                selection = CoreSelection(
                    onPositiveClick = { positiveCalled = true },
                ),
                body = { },
            )
        }
        rule.onPositiveButton().performClick()
        rule.onView().assertExists()
        assert(positiveCalled)
    }

    @Test
    fun coreViewInvokesNegativeButton() {
        var negativeCalled = false
        rule.setContent {
            CoreView(
                sheetState = SheetState(visible = true),
                selection = CoreSelection(
                    onNegativeClick = { negativeCalled = true },
                ),
                body = { },
            )
        }
        rule.onNegativeButton().performClick()
        rule.onView().assertExists()
        assert(negativeCalled)
    }

    @Test
    fun coreViewInvokesExtraButton() {
        var extraCalled = false
        rule.setContent {
            CoreView(
                sheetState = SheetState(visible = true),
                selection = CoreSelection(
                    extraButton = SelectionButton("test"),
                    onExtraButtonClick = { extraCalled = true },
                ),
                body = { },
            )
        }
        rule.onExtraButton().performClick()
        rule.onView().assertExists()
        assert(extraCalled)
    }

    @Test
    fun coreViewDisplaysBody() {
        var bodyCalled = false
        rule.setContent {
            CoreView(
                selection = CoreSelection(),
                sheetState = SheetState(visible = true),
                body = { bodyCalled = true },
            )
        }
        assert(bodyCalled)
    }

}