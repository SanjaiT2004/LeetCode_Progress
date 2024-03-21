class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int len = barcodes.length;
        for (int n : barcodes) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        for (int key : hm.keySet())
            pq.add(key);
        int i = 0;
        while (!pq.isEmpty()) {
            int poll = pq.poll();
            int val = hm.get(poll);
            while (val > 0) {
                barcodes[i] = poll;
                i += 2;
                val--;
                if (i >= len) {
                   i = 1; 
                }
            }
        }
        return barcodes;

    }
}