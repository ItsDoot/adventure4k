package pw.dotdash.adventure4k.ext

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.ComponentBuilder
import net.kyori.adventure.text.TextComponent
import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration

fun String.toText(): TextComponent = TextComponent.of(this)

fun String.toText(style: Style): TextComponent = TextComponent.of(this, style)

fun String.toText(color: TextColor): TextComponent = TextComponent.of(this, color)

fun String.toText(color: TextColor, vararg decorations: TextDecoration): TextComponent = TextComponent.of(this, color, *decorations)

fun String.toText(color: TextColor, decorations: Set<TextDecoration>): TextComponent = TextComponent.of(this, color, decorations)

fun Boolean.toText(): TextComponent = TextComponent.of(this)

fun Boolean.toText(style: Style): TextComponent = TextComponent.of(this, style)

fun Boolean.toText(color: TextColor): TextComponent = TextComponent.of(this, color)

fun Boolean.toText(color: TextColor, vararg decorations: TextDecoration): TextComponent = TextComponent.of(this, color, *decorations)

fun Boolean.toText(color: TextColor, decorations: Set<TextDecoration>): TextComponent = TextComponent.of(this, color, decorations)

fun Char.toText(): TextComponent = TextComponent.of(this)

fun Char.toText(style: Style): TextComponent = TextComponent.of(this, style)

fun Char.toText(color: TextColor): TextComponent = TextComponent.of(this, color)

fun Char.toText(color: TextColor, vararg decorations: TextDecoration): TextComponent = TextComponent.of(this, color, *decorations)

fun Char.toText(color: TextColor, decorations: Set<TextDecoration>): TextComponent = TextComponent.of(this, color, decorations)

fun Double.toText(): TextComponent = TextComponent.of(this)

fun Double.toText(style: Style): TextComponent = TextComponent.of(this, style)

fun Double.toText(color: TextColor): TextComponent = TextComponent.of(this, color)

fun Double.toText(color: TextColor, vararg decorations: TextDecoration): TextComponent = TextComponent.of(this, color, *decorations)

fun Double.toText(color: TextColor, decorations: Set<TextDecoration>): TextComponent = TextComponent.of(this, color, decorations)

fun Float.toText(): TextComponent = TextComponent.of(this)

fun Float.toText(style: Style): TextComponent = TextComponent.of(this, style)

fun Float.toText(color: TextColor): TextComponent = TextComponent.of(this, color)

fun Float.toText(color: TextColor, vararg decorations: TextDecoration): TextComponent = TextComponent.of(this, color, *decorations)

fun Float.toText(color: TextColor, decorations: Set<TextDecoration>): TextComponent = TextComponent.of(this, color, decorations)

fun Int.toText(): TextComponent = TextComponent.of(this)

fun Int.toText(style: Style): TextComponent = TextComponent.of(this, style)

fun Int.toText(color: TextColor): TextComponent = TextComponent.of(this, color)

fun Int.toText(color: TextColor, vararg decorations: TextDecoration): TextComponent = TextComponent.of(this, color, *decorations)

fun Int.toText(color: TextColor, decorations: Set<TextDecoration>): TextComponent = TextComponent.of(this, color, decorations)

fun Long.toText(): TextComponent = TextComponent.of(this)

fun Long.toText(style: Style): TextComponent = TextComponent.of(this, style)

fun Long.toText(color: TextColor): TextComponent = TextComponent.of(this, color)

fun Long.toText(color: TextColor, vararg decorations: TextDecoration): TextComponent = TextComponent.of(this, color, *decorations)

fun Long.toText(color: TextColor, decorations: Set<TextDecoration>): TextComponent = TextComponent.of(this, color, decorations)

fun <T> Iterable<T>.joinToText(
    separator: Component = TextComponent.of(", "),
    prefix: Component = TextComponent.empty(),
    postfix: Component = TextComponent.empty(),
    limit: Int = -1,
    truncated: Component = TextComponent.of("..."),
    transform: ((T) -> Component)? = null
): TextComponent =
    this.iterator().joinToText(separator, prefix, postfix, limit, truncated, transform)

fun <T> Sequence<T>.joinToText(
    separator: Component = TextComponent.of(", "),
    prefix: Component = TextComponent.empty(),
    postfix: Component = TextComponent.empty(),
    limit: Int = -1,
    truncated: Component = TextComponent.of("..."),
    transform: ((T) -> Component)? = null
): TextComponent =
    this.iterator().joinToText(separator, prefix, postfix, limit, truncated, transform)

fun <T> Array<T>.joinToText(
    separator: Component = TextComponent.of(", "),
    prefix: Component = TextComponent.empty(),
    postfix: Component = TextComponent.empty(),
    limit: Int = -1,
    truncated: Component = TextComponent.of("..."),
    transform: ((T) -> Component)? = null
): TextComponent =
    this.iterator().joinToText(separator, prefix, postfix, limit, truncated, transform)

private fun <T> Iterator<T>.joinToText(
    separator: Component = TextComponent.of(", "),
    prefix: Component = TextComponent.empty(),
    postfix: Component = TextComponent.empty(),
    limit: Int = -1,
    truncated: Component = TextComponent.of("..."),
    transform: ((T) -> Component)? = null
): TextComponent {
    val builder: TextComponent.Builder = TextComponent.builder()
    var count = 0

    builder.append(prefix)

    for (element: T in this) {
        if (++count > 1) {
            builder.append(separator)
        }

        if (limit in 0 until count) {
            break
        }

        builder.appendElement(element, transform)
    }

    if (limit in 0 until count) {
        builder.append(truncated)
    }

    builder.append(postfix)

    return builder.build()
}

private fun <T> ComponentBuilder<*, *>.appendElement(element: T, transform: ((T) -> Component)?) {
    when {
        transform != null -> this.append(transform(element))
        element is Component -> this.append(element)
        element is String -> this.append(TextComponent.of(element))
        else -> this.append(element.toString())
    }
}