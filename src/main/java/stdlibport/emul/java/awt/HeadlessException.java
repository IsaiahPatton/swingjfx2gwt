package java.awt;

/**
 * Thrown when code that is dependent on a keyboard, display, or mouse
 * is called in an environment that does not support a keyboard, display,
 * or mouse.
 *
 * @since 1.4
 * @author  Michael Martak
 */
public class HeadlessException extends UnsupportedOperationException {

    private static final long serialVersionUID = 167183644944358563L;
    public HeadlessException() {}
    public HeadlessException(String msg) {
        super(msg);
    }

    public String getMessage() {
        String superMessage = super.getMessage();
        String headlessMessage = GraphicsEnvironment.getHeadlessMessage();

        if (superMessage == null) {
            return headlessMessage;
        } else if (headlessMessage == null) {
            return superMessage;
        } else {
            return superMessage + headlessMessage;
        }
    }

}