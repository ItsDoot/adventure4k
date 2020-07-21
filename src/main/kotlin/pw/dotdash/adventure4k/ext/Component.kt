package pw.dotdash.adventure4k.ext

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.ComponentBuilder
import net.kyori.adventure.text.ComponentLike

operator fun Component.plus(component: Component): Component =
    this.append(component)

operator fun Component.plus(component: ComponentLike): Component =
    this.append(component)

operator fun Component.plus(builder: ComponentBuilder<*, *>): Component =
    this.append(builder)