//SWE303 DESIGN PATTERNS
//M. EMİRHAN MURAT
//B201202043
//HW3-PROJECT / DESIGN
/*the RequestValidator class, which validates requests before they are processed;
and the RequestLogger class, which logs requests and provides a method for retrieving the request history.

In the main function, we create a Context object, a RequestProcessor object, a RequestValidator object, and a RequestLogger object.
We then create three Request objects, set their states, and validate them using the RequestValidator object.
If a request is valid, it is added to the request processor and logged by the request logger.
Finally, we use the requestProcessor to process the requests and the Context object to handle requests in the StateA, StateB, and StateC states.
 */
fun main() {
    val context = Context()

    context.request()  // Output: Handling request in State A
    context.state = StateB()
    context.request()  // Output: Handling request in State B
    }
