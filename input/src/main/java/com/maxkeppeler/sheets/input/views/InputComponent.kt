/*
 *  Copyright (C) 2022. Maximilian Keppeler (https://www.maxkeppeler.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.maxkeppeler.sheets.input.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.maxkeppeler.sheets.input.models.Input
import com.maxkeppeler.sheets.core.R as RC

/**
 * Input component that displays the setup inputs.
 * @param modifier The modifier that is applied to this component.
 * @param input The list of input options.
 * @param onInputUpdated The listener that returns the updated input.
 * @param columns The amount of columns for the view.
 */
@Composable
internal fun InputComponent(
    modifier: Modifier,
    input: List<Input>,
    onInputUpdated: (Input) -> Unit,
    columns: Int
) {

    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(columns),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(RC.dimen.scd_small_100)),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(RC.dimen.scd_small_100))
    ) {
        items(
            items = input,
            span = { GridItemSpan(it.columns ?: columns) },
            itemContent = { input -> InputItemComponent(input, onInputUpdated) }
        )
    }
}
