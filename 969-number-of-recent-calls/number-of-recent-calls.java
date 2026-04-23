class RecentCounter {

    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        // Add current request time
        q.add(t);

        // Remove all old requests (older than t - 3000)
        while (!q.isEmpty() && q.peek() < t - 3000) {
            q.remove();
        }

        // Remaining size is answer
        return q.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */