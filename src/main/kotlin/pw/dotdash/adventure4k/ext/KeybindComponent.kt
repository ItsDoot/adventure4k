package pw.dotdash.adventure4k.ext

import net.kyori.adventure.text.KeybindComponent
import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration

fun String.toKeybind(): KeybindComponent = KeybindComponent.of(this)

fun String.toKeybind(style: Style): KeybindComponent = KeybindComponent.builder(this).style(style).build()

fun String.toKeybind(color: TextColor): KeybindComponent = KeybindComponent.of(this, color)

fun String.toKeybind(color: TextColor, vararg decorations: TextDecoration): KeybindComponent = KeybindComponent.of(this, color, *decorations)

fun String.toKeybind(color: TextColor, decorations: Set<TextDecoration>): KeybindComponent = KeybindComponent.of(this, color, decorations)