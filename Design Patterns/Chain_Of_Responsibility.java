/*
8. Chain of Responsibility (CoR) - behavioral patterns.
Chain of Responsibility allows multiple handlers to process a request, one after another, until one of them handles it.
Each handler decides:
“Should I handle this? Or pass it to the next handler?”

Imagine customer support:
Level 1 support → can solve simple issues
Level 2 support → handles medium issues
Level 3 support → handles serious issues
If L1 can't solve it → passes to L2 → if L2 can't solve → passes to L3.
*/

/*
COMPLETE EXAMPLE — Request Handling System
1 Abstract Handler
public abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}
2 Concrete Handler 1 — INFO Logger
public class InfoLogger extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("INFO")) {
            System.out.println("INFO Logger handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
3 Concrete Handler 2 — DEBUG Logger
public class DebugLogger extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("DEBUG")) {
            System.out.println("DEBUG Logger handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
4 Concrete Handler 3 — ERROR Logger
public class ErrorLogger extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("ERROR")) {
            System.out.println("ERROR Logger handled the request.");
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}
5 Building the Chain (Client) Main
    public static void main(String[] args) {
        Handler info = new InfoLogger();
        Handler debug = new DebugLogger();
        Handler error = new ErrorLogger();

        // Creating the chain: info → debug → error
        info.setNext(debug);
        debug.setNext(error);

        // Test requests
        info.handleRequest("INFO");
        info.handleRequest("DEBUG");
        info.handleRequest("ERROR");
    }
*/