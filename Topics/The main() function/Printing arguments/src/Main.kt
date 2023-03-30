    const val TASK_ARRAY_SIZE = 3
//    fun main(args: Array<String>) = println(
//        if (args.size != TASK_ARRAY_SIZE) { "Invalid number of program arguments" } else {
//            """
//            Argument 1: ${args[0]}. It has ${args[0].length} characters
//            Argument 2: ${args[1]}. It has ${args[1].length} characters
//            Argument 3: ${args[2]}. It has ${args[2].length} characters
//            """.trimIndent()
//        }
//    )

    fun main(args: Array<String>) {
        if (args.size != TASK_ARRAY_SIZE) return println("Invalid number of program arguments")
        args.forEachIndexed { index, arg -> println("Argument ${index + 1}: $arg. It has ${arg.length} characters") }
    }