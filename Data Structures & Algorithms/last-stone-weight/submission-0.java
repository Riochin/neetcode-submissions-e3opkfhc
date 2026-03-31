class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int stone : stones){
            q.add(-stone);
        }

        while(q.size() > 1){
            int x = q.poll(); // -x > -y)
            int y = q.poll();
            if(x < y){  // 同じサイズの場合、どっちも消えるので、取り出したままで良い。
                q.offer(x - y); // eg. -3-(-1)=-2
            }
        }

        q.offer(0); // ifとかやらない、賢い
        return Math.abs(q.peek());
    }
}
