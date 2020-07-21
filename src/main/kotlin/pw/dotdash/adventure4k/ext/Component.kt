package pw.dotdash.adventure4k.ext

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.TextComponent

operator fun Component.plus(other: Component): TextComponent =
    TextComponent.builder().append(this).append(other).build()