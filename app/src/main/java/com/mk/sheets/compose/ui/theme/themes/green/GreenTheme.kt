/*
 *  Copyright (C) 2022-2023. Maximilian Keppeler (https://www.maxkeppeler.com)
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
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color


private val md_theme_light_primary = Color(0xFF006C45)
private val md_theme_light_onPrimary = Color(0xFFFFFFFF)
private val md_theme_light_primaryContainer = Color(0xFF8DF8BE)
private val md_theme_light_onPrimaryContainer = Color(0xFF002112)
private val md_theme_light_secondary = Color(0xFF4E6355)
private val md_theme_light_onSecondary = Color(0xFFFFFFFF)
private val md_theme_light_secondaryContainer = Color(0xFFD0E8D7)
private val md_theme_light_onSecondaryContainer = Color(0xFF0B1F15)
private val md_theme_light_tertiary = Color(0xFF3C6471)
private val md_theme_light_onTertiary = Color(0xFFFFFFFF)
private val md_theme_light_tertiaryContainer = Color(0xFFBFE9F9)
private val md_theme_light_onTertiaryContainer = Color(0xFF001F28)
private val md_theme_light_error = Color(0xFFBA1A1A)
private val md_theme_light_errorContainer = Color(0xFFFFDAD6)
private val md_theme_light_onError = Color(0xFFFFFFFF)
private val md_theme_light_onErrorContainer = Color(0xFF410002)
private val md_theme_light_background = Color(0xFFFBFDF8)
private val md_theme_light_onBackground = Color(0xFF191C1A)
private val md_theme_light_surface = Color(0xFFFBFDF8)
private val md_theme_light_onSurface = Color(0xFF191C1A)
private val md_theme_light_surfaceVariant = Color(0xFFDCE5DC)
private val md_theme_light_onSurfaceVariant = Color(0xFF404943)
private val md_theme_light_outline = Color(0xFF707972)
private val md_theme_light_inverseOnSurface = Color(0xFFEFF1ED)
private val md_theme_light_inverseSurface = Color(0xFF2E312E)
private val md_theme_light_inversePrimary = Color(0xFF70DBA3)
private val md_theme_light_shadow = Color(0xFF000000)
private val md_theme_light_surfaceTint = Color(0xFF006C45)
private val md_theme_light_outlineVariant = Color(0xFFC0C9C0)
private val md_theme_light_scrim = Color(0xFF000000)

private val md_theme_dark_primary = Color(0xFF70DBA3)
private val md_theme_dark_onPrimary = Color(0xFF003822)
private val md_theme_dark_primaryContainer = Color(0xFF005233)
private val md_theme_dark_onPrimaryContainer = Color(0xFF8DF8BE)
private val md_theme_dark_secondary = Color(0xFFB5CCBB)
private val md_theme_dark_onSecondary = Color(0xFF203529)
private val md_theme_dark_secondaryContainer = Color(0xFF364B3E)
private val md_theme_dark_onSecondaryContainer = Color(0xFFD0E8D7)
private val md_theme_dark_tertiary = Color(0xFFA4CDDC)
private val md_theme_dark_onTertiary = Color(0xFF043542)
private val md_theme_dark_tertiaryContainer = Color(0xFF224C59)
private val md_theme_dark_onTertiaryContainer = Color(0xFFBFE9F9)
private val md_theme_dark_error = Color(0xFFFFB4AB)
private val md_theme_dark_errorContainer = Color(0xFF93000A)
private val md_theme_dark_onError = Color(0xFF690005)
private val md_theme_dark_onErrorContainer = Color(0xFFFFDAD6)
private val md_theme_dark_background = Color(0xFF191C1A)
private val md_theme_dark_onBackground = Color(0xFFE1E3DF)
private val md_theme_dark_surface = Color(0xFF191C1A)
private val md_theme_dark_onSurface = Color(0xFFE1E3DF)
private val md_theme_dark_surfaceVariant = Color(0xFF404943)
private val md_theme_dark_onSurfaceVariant = Color(0xFFC0C9C0)
private val md_theme_dark_outline = Color(0xFF8A938B)
private val md_theme_dark_inverseOnSurface = Color(0xFF191C1A)
private val md_theme_dark_inverseSurface = Color(0xFFE1E3DF)
private val md_theme_dark_inversePrimary = Color(0xFF006C45)
private val md_theme_dark_shadow = Color(0xFF000000)
private val md_theme_dark_surfaceTint = Color(0xFF70DBA3)
private val md_theme_dark_outlineVariant = Color(0xFF404943)
private val md_theme_dark_scrim = Color(0xFF000000)

val GreenLightColors = lightColorScheme(
    primary = md_theme_light_primary,
    onPrimary = md_theme_light_onPrimary,
    primaryContainer = md_theme_light_primaryContainer,
    onPrimaryContainer = md_theme_light_onPrimaryContainer,
    secondary = md_theme_light_secondary,
    onSecondary = md_theme_light_onSecondary,
    secondaryContainer = md_theme_light_secondaryContainer,
    onSecondaryContainer = md_theme_light_onSecondaryContainer,
    tertiary = md_theme_light_tertiary,
    onTertiary = md_theme_light_onTertiary,
    tertiaryContainer = md_theme_light_tertiaryContainer,
    onTertiaryContainer = md_theme_light_onTertiaryContainer,
    error = md_theme_light_error,
    errorContainer = md_theme_light_errorContainer,
    onError = md_theme_light_onError,
    onErrorContainer = md_theme_light_onErrorContainer,
    background = md_theme_light_background,
    onBackground = md_theme_light_onBackground,
    surface = md_theme_light_surface,
    onSurface = md_theme_light_onSurface,
    surfaceVariant = md_theme_light_surfaceVariant,
    onSurfaceVariant = md_theme_light_onSurfaceVariant,
    outline = md_theme_light_outline,
    inverseOnSurface = md_theme_light_inverseOnSurface,
    inverseSurface = md_theme_light_inverseSurface,
    inversePrimary = md_theme_light_inversePrimary,
    surfaceTint = md_theme_light_surfaceTint,
    outlineVariant = md_theme_light_outlineVariant,
    scrim = md_theme_light_scrim,
)


val GreenDarkColors = darkColorScheme(
    primary = md_theme_dark_primary,
    onPrimary = md_theme_dark_onPrimary,
    primaryContainer = md_theme_dark_primaryContainer,
    onPrimaryContainer = md_theme_dark_onPrimaryContainer,
    secondary = md_theme_dark_secondary,
    onSecondary = md_theme_dark_onSecondary,
    secondaryContainer = md_theme_dark_secondaryContainer,
    onSecondaryContainer = md_theme_dark_onSecondaryContainer,
    tertiary = md_theme_dark_tertiary,
    onTertiary = md_theme_dark_onTertiary,
    tertiaryContainer = md_theme_dark_tertiaryContainer,
    onTertiaryContainer = md_theme_dark_onTertiaryContainer,
    error = md_theme_dark_error,
    errorContainer = md_theme_dark_errorContainer,
    onError = md_theme_dark_onError,
    onErrorContainer = md_theme_dark_onErrorContainer,
    background = md_theme_dark_background,
    onBackground = md_theme_dark_onBackground,
    surface = md_theme_dark_surface,
    onSurface = md_theme_dark_onSurface,
    surfaceVariant = md_theme_dark_surfaceVariant,
    onSurfaceVariant = md_theme_dark_onSurfaceVariant,
    outline = md_theme_dark_outline,
    inverseOnSurface = md_theme_dark_inverseOnSurface,
    inverseSurface = md_theme_dark_inverseSurface,
    inversePrimary = md_theme_dark_inversePrimary,
    surfaceTint = md_theme_dark_surfaceTint,
    outlineVariant = md_theme_dark_outlineVariant,
    scrim = md_theme_dark_scrim,
)