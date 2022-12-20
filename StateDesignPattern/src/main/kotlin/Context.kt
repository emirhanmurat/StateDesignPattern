class Context {
    var state: State = StateA()
        set(value) {
            field = value
            println("State changed to: ${value::class.simpleName}")
        }

    fun request() {
        state.handleRequest()
    }
}