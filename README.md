# adventure4k

A DSL and extensions to make using [adventure](https://github.com/KyoriPowered/adventure) in Kotlin a bit nicer.

## DSL Example

```kotlin
val textComponent: TextComponent =
    text("You're a ", color = NamedTextColor.GRAY) {
        text("Bunny", color = NamedTextColor.LIGHT_PURPLE)
        text("! Press ")
        keybind("key.jump", color = NamedTextColor.LIGHT_PURPLE, decorations = setOf(TextDecoration.BOLD))
        text(" to jump!")
    }
```