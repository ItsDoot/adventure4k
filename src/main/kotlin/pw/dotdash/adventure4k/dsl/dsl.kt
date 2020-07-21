package pw.dotdash.adventure4k.dsl

import net.kyori.adventure.key.Key
import net.kyori.adventure.text.*
import net.kyori.adventure.text.event.ClickEvent
import net.kyori.adventure.text.event.HoverEvent
import net.kyori.adventure.text.format.Style
import net.kyori.adventure.text.format.TextColor
import net.kyori.adventure.text.format.TextDecoration
import pw.dotdash.adventure4k.ext.toStyle

@AdventureDsl
inline fun text(
    content: String? = null,
    style: Style? = null,
    clickEvent: ClickEvent? = null,
    hoverEvent: HoverEvent<*>? = null,
    insertion: String? = null,
    init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
): TextComponent {
    val builder: TextComponent.Builder = TextComponent.builder()
        .content(content ?: "")
        .style(style ?: Style.empty())
        .clickEvent(clickEvent)
        .hoverEvent(hoverEvent)
        .insertion(insertion)

    DslComponentBuilder(builder).apply(init)

    return builder.build()
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
): TextComponent =
    text(content, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): TextComponent =
    text(content, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
    }

@AdventureDsl
inline fun newline(
    content: String? = null,
    style: Style? = null,
    clickEvent: ClickEvent? = null,
    hoverEvent: HoverEvent<*>? = null,
    insertion: String? = null,
    init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
): TextComponent =
    text(if (content == null) "\n" else "\n" + content, style, clickEvent, hoverEvent, insertion, init)

@AdventureDsl
inline fun newline(
    content: String? = null,
    color: TextColor,
    clickEvent: ClickEvent? = null,
    hoverEvent: HoverEvent<*>? = null,
    insertion: String? = null,
    decorations: Set<TextDecoration> = emptySet(),
    init: DslComponentBuilder<TextComponent, TextComponent.Builder>.() -> Unit = {}
): TextComponent =
    newline(content, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): TextComponent =
    newline(content, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
    }

@AdventureDsl
inline fun keybind(
    keybind: String,
    style: Style? = null,
    clickEvent: ClickEvent? = null,
    hoverEvent: HoverEvent<*>? = null,
    insertion: String? = null,
    init: DslComponentBuilder<KeybindComponent, KeybindComponent.Builder>.() -> Unit = {}
): KeybindComponent {
    val builder: KeybindComponent.Builder = KeybindComponent.builder()
        .keybind(keybind)
        .style(style ?: Style.empty())
        .clickEvent(clickEvent)
        .hoverEvent(hoverEvent)
        .insertion(insertion)

    DslComponentBuilder(builder).apply(init)

    return builder.build()
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
): KeybindComponent =
    keybind(keybind, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): KeybindComponent =
    keybind(keybind, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
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
): ScoreComponent {
    val builder: ScoreComponent.Builder = ScoreComponent.builder()
        .name(name)
        .objective(objective)
        .value(value)
        .style(style ?: Style.empty())
        .clickEvent(clickEvent)
        .hoverEvent(hoverEvent)
        .insertion(insertion)

    DslComponentBuilder(builder).apply(init)

    return builder.build()
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
): ScoreComponent =
    score(name, objective, value, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): ScoreComponent =
    score(name, objective, value, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
    }

@AdventureDsl
inline fun selector(
    pattern: String,
    style: Style? = null,
    clickEvent: ClickEvent? = null,
    hoverEvent: HoverEvent<*>? = null,
    insertion: String? = null,
    init: DslComponentBuilder<SelectorComponent, SelectorComponent.Builder>.() -> Unit = {}
): SelectorComponent {
    val builder: SelectorComponent.Builder = SelectorComponent.builder()
        .pattern(pattern)
        .style(style ?: Style.empty())
        .clickEvent(clickEvent)
        .hoverEvent(hoverEvent)
        .insertion(insertion)

    DslComponentBuilder(builder).apply(init)

    return builder.build()
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
): SelectorComponent =
    selector(pattern, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): SelectorComponent =
    selector(pattern, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
    }

@AdventureDsl
inline fun translatable(
    key: String,
    style: Style? = null,
    clickEvent: ClickEvent? = null,
    hoverEvent: HoverEvent<*>? = null,
    insertion: String? = null,
    init: DslComponentBuilder<TranslatableComponent, TranslatableComponent.Builder>.() -> Unit = {}
): TranslatableComponent {
    val builder: TranslatableComponent.Builder = TranslatableComponent.builder()
        .key(key)
        .style(style ?: Style.empty())
        .clickEvent(clickEvent)
        .hoverEvent(hoverEvent)
        .insertion(insertion)

    DslComponentBuilder(builder).apply(init)

    return builder.build()
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
): TranslatableComponent =
    translatable(key, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): TranslatableComponent =
    translatable(key, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
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
): BlockNBTComponent {
    val builder: BlockNBTComponent.Builder = BlockNBTComponent.builder()
        .nbtPath(nbtPath)
        .pos(pos)
        .style(style ?: Style.empty())
        .clickEvent(clickEvent)
        .hoverEvent(hoverEvent)
        .insertion(insertion)

    DslComponentBuilder(builder).apply(init)

    return builder.build()
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
): BlockNBTComponent =
    blockNbt(nbtPath, pos, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): BlockNBTComponent =
    blockNbt(nbtPath, pos, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
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
): EntityNBTComponent {
    val builder: EntityNBTComponent.Builder = EntityNBTComponent.builder()
        .nbtPath(nbtPath)
        .selector(selector)
        .style(style ?: Style.empty())
        .clickEvent(clickEvent)
        .hoverEvent(hoverEvent)
        .insertion(insertion)

    DslComponentBuilder(builder).apply(init)

    return builder.build()
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
): EntityNBTComponent =
    entityNbt(nbtPath, selector, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): EntityNBTComponent =
    entityNbt(nbtPath, selector, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
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
): StorageNBTComponent {
    val builder: StorageNBTComponent.Builder = StorageNBTComponent.builder()
        .nbtPath(nbtPath)
        .storage(storage)
        .style(style ?: Style.empty())
        .clickEvent(clickEvent)
        .hoverEvent(hoverEvent)
        .insertion(insertion)

    DslComponentBuilder(builder).apply(init)

    return builder.build()
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
): StorageNBTComponent =
    storageNbt(nbtPath, storage, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for (decoration: TextDecoration in decorations) {
            this.decoration(decoration, TextDecoration.State.TRUE)
        }
        this.init()
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
): StorageNBTComponent =
    storageNbt(nbtPath, storage, color.toStyle(), clickEvent, hoverEvent, insertion) {
        for ((decoration: TextDecoration, state: TextDecoration.State) in decorations) {
            this.decoration(decoration, state)
        }
        this.init()
    }