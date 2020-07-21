package pw.dotdash.adventure4k.dsl

import net.kyori.adventure.key.Key
import net.kyori.adventure.text.*
import net.kyori.adventure.text.event.ClickEvent
import net.kyori.adventure.text.event.HoverEvent
import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration

@AdventureDsl
data class DslComponentBuilder<C : BuildableComponent<C, B>, B : ComponentBuilder<C, B>> @PublishedApi internal constructor(
    val delegate: B
) : ComponentBuilder<C, B> by delegate {

    operator fun Component.unaryPlus() {
        this@DslComponentBuilder.delegate.append(this)
    }

    operator fun String.unaryPlus() {
        this@DslComponentBuilder.delegate.append(this)
    }

    @AdventureDsl
    inline fun text(
        content: String? = null,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.text(content, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun text(
        content: String? = null,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.text(content, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun text(
        content: String? = null,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.text(content, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun newline(
        content: String? = null,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.newline(content, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun newline(
        content: String? = null,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.newline(content, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun newline(
        content: String? = null,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.newline(content, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun keybind(
        keybind: String,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<KeybindComponent, KeybindComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.keybind(keybind, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun keybind(
        keybind: String,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<KeybindComponent, KeybindComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.keybind(keybind, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun keybind(
        keybind: String,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<KeybindComponent, KeybindComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.keybind(keybind, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun score(
        name: String,
        objective: String,
        value: String? = null,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<ScoreComponent, ScoreComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.score(name, objective, value, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun score(
        name: String,
        objective: String,
        value: String? = null,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<ScoreComponent, ScoreComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.score(name, objective, value, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun score(
        name: String,
        objective: String,
        value: String? = null,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<ScoreComponent, ScoreComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.score(name, objective, value, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun selector(
        pattern: String,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<SelectorComponent, SelectorComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.selector(pattern, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun selector(
        pattern: String,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<SelectorComponent, SelectorComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.selector(pattern, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun selector(
        pattern: String,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<SelectorComponent, SelectorComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.selector(pattern, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun translatable(
        key: String,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<TranslatableComponent, TranslatableComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.translatable(key, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun translatable(
        key: String,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<TranslatableComponent, TranslatableComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.translatable(key, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun translatable(
        key: String,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<TranslatableComponent, TranslatableComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.translatable(key, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }
    
    @AdventureDsl
    inline fun blockNbt(
        nbtPath: String,
        pos: BlockNBTComponent.Pos,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<BlockNBTComponent, BlockNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.blockNbt(nbtPath, pos, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun blockNbt(
        nbtPath: String,
        pos: BlockNBTComponent.Pos,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<BlockNBTComponent, BlockNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.blockNbt(nbtPath, pos, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun blockNbt(
        nbtPath: String,
        pos: BlockNBTComponent.Pos,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<BlockNBTComponent, BlockNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.blockNbt(nbtPath, pos, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun entityNbt(
        nbtPath: String,
        selector: String,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<EntityNBTComponent, EntityNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.entityNbt(nbtPath, selector, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun entityNbt(
        nbtPath: String,
        selector: String,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<EntityNBTComponent, EntityNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.entityNbt(nbtPath, selector, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun entityNbt(
        nbtPath: String,
        selector: String,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<EntityNBTComponent, EntityNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.entityNbt(nbtPath, selector, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun storageNbt(
        nbtPath: String,
        storage: Key,
        style: Style? = null,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        init: DslComponentBuilder<StorageNBTComponent, StorageNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.storageNbt(nbtPath, storage, style, clickEvent, hoverEvent, insertion, init)
        )
    }

    @AdventureDsl
    inline fun storageNbt(
        nbtPath: String,
        storage: Key,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Set<TextDecoration> = emptySet(),
        init: DslComponentBuilder<StorageNBTComponent, StorageNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.storageNbt(nbtPath, storage, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }

    @AdventureDsl
    inline fun storageNbt(
        nbtPath: String,
        storage: Key,
        color: TextColor,
        clickEvent: ClickEvent? = null,
        hoverEvent: HoverEvent<*>? = null,
        insertion: String? = null,
        decorations: Map<TextDecoration, TextDecoration.State>,
        init: DslComponentBuilder<StorageNBTComponent, StorageNBTComponent.Builder>.() -> Unit = {}
    ) {
        this.delegate.append(
            pw.dotdash.adventure4k.dsl.storageNbt(nbtPath, storage, color, clickEvent, hoverEvent, insertion, decorations, init)
        )
    }
}