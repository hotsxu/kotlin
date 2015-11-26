// "Rename to 'setValue'" "true"
// ERROR: 'get' method convention on type 'CustomDelegate' is deprecated. Rename to 'getValue'

class CustomDelegate {
    operator fun get(thisRef: Any?, prop: PropertyMetadata): String = ""
    operator fun set(thisRef: Any?, prop: PropertyMetadata, value: String) {}
}

class Example {
    var a: String <caret>by CustomDelegate()
}
