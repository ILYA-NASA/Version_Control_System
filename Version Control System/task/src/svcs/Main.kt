package svcs

import java.io.File

fun main(args: Array<String>) {
    when {
        args.isEmpty() -> controller("--help")
        args.size < 2 -> controller(args[0])
        else -> controller(args[0], args[1])
    }
//    controller("config", "Max")
//    controller("config")
}

fun controller(arg0: String, arg1: String = "") = when (arg0) {
    "--help" -> println(
        """
        These are SVCS commands:
        config     Get and set a username.
        add        Add a file to the index.
        log        Show commit logs.
        commit     Save changes.
        checkout   Restore a file.
    """.trimIndent()
    )

    "config" -> usedConfig(arg1)
    "add" -> usedAdd(arg1)
    "log" -> println("Show commit logs.")
    "commit" -> println("Save changes.")
    "checkout" -> println("Restore a file.")
    else -> println("'$arg0' is not a SVCS command.")
}

fun usedConfig(arg1: String = "") {
    val separator = File.separator
    val vcsDir = File("vcs")
    vcsDir.mkdir()
    val configFile = File("vcs${separator}config.txt")
    configFile.writeText(arg1)
    when {
        arg1.isEmpty() && configFile.readText().isEmpty() -> println("Please, tell me who you are.")
        arg1.isEmpty() -> println("The username is ${configFile.readText()}.")
        else -> {
            configFile.writeText(arg1)
            println("The username is ${configFile.readText()}.")
        }
    }
}

fun usedAdd(arg1: String = "") {
    val separator = File.separator
    val vcsDir = File("vcs")
    vcsDir.mkdir()
    val addFile = File("vcs${separator}index.txt")
    when {
        arg1.isEmpty() && addFile.readText().isEmpty() -> println("Add a file to the index.")
        arg1.isEmpty() -> println("Tracked files: ${addFile.readText()}")
        else -> {
            addFile.appendText("\n$arg1")
            println("The file '$arg1' is tracked.")
        }
    }
}