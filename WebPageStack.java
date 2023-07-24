import java.util.Stack;

class WebPageStack {
    private Stack<WebPage> stack;

    public WebPageStack() {
        stack = new Stack<>();
    }

    public void addWebPage(WebPage webpage) {
        stack.push(webpage);
    }

    public WebPage removeMostRecentWebPage() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.pop();
    }

    public WebPage peekMostRecentWebPage() {
        if (stack.isEmpty()) {
            return null;
        }
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
