// Step 1: Define the custom exception
// Extending Exception (not RuntimeException) makes this a "checked" exception,
// meaning Java forces any method that throws it to either handle it or declare it.

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // passes the message up to the built-in Exception class
    }
}