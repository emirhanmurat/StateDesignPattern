interface State {
    fun handleRequest()
}

class StateA: State {
    override fun handleRequest() {
        println("Handling request in State A")
    }
}

class StateB: State {
    override fun handleRequest() {
        println("Handling request in State B")
    }
}