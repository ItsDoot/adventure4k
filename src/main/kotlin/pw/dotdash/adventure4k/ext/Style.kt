package pw.dotdash.adventure4k.ext

import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration

fun TextColor.toStyle(): Style {
    // blame kotlin overload ambiguity
    return Style.of(this as TextColor?)
}

fun TextColor.toStyle(vararg decorations: TextDecoration): Style =
    Style.builder()
        .color(this)
        .decorate(*decorations)
        .build()

fun TextColor.toStyle(vararg decorations: Pair<TextDecoration, TextDecoration.State>): Style {
    val builder: Style.Builder = Style.builder()
        .color(this)

    for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
        builder.decoration(decoration, state)
    }

    return builder.build()
}

@JvmName("toStyleBoolean")
fun TextColor.toStyle(vararg decorations: Pair<TextDecoration, Boolean>): Style {
    val builder: Style.Builder = Style.builder()
        .color(this)

    for ((decoration: TextDecoration, state: Boolean) in decorations) {
        builder.decoration(decoration, state)
    }

    return builder.build()
}