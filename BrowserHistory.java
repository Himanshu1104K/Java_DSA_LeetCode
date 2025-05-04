
class LinkedNode {
    String url;
    LinkedNode next;
    LinkedNode prev;

    public LinkedNode(String x) {
        this.url = x;
    }
}

class BrowserHistory {
    LinkedNode queue;

    public BrowserHistory(String homepage) {
        this.queue = new LinkedNode(homepage);
    }

    public void visit(String url) {
        LinkedNode newNode = new LinkedNode(url);
        queue.next = newNode;
        newNode.next = null;
        newNode.prev = queue;
        queue = newNode;
    }

    public String back(int steps) {
        while (queue.prev != null && steps-- > 0) {
            queue = queue.prev;
        }
        return queue.url;
    }

    public String forward(int steps) {
        while (queue.next != null && steps-- > 0) {
            queue = queue.next;
        }
        return queue.url;
    }
}