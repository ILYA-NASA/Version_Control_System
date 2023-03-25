package svcs

fun main(args: Array<String>) {
    println(if (args.isEmpty()) info("--help") else info(args[0]))
}

fun info(arg: String) = when (arg) {
    "--help" -> """
        These are SVCS commands:
        config     Get and set a username.
        add        Add a file to the index.
        log        Show commit logs.
        commit     Save changes.
        checkout   Restore a file.
    """.trimIndent()

    "config" -> "Get and set a username."
    "add" -> "Add a file to the index."
    "log" -> "Show commit logs."
    "commit" -> "Save changes."
    "checkout" -> "Restore a file."
    else -> "'$arg' is not a SVCS command."
}