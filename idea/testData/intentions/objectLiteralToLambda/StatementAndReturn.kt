// WITH_RUNTIME
import java.io.File
import java.io.FileFilter

fun foo(filter: FileFilter) {}

fun bar() {
    foo(<caret>object: FileFilter {
        override fun accept(file: File): Boolean {
            val name = file.name
            return name.startsWith("a")
        }
    })
}