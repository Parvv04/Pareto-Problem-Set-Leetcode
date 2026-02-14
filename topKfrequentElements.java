class topKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequencies = new HashMap<>();
        PriorityQueue<Integer> minheap = new PriorityQueue<>((a,b) -> frequencies.get(a) - frequencies.get(b));
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int freq = 0;
            if(frequencies.containsKey(nums[i])){
                freq = frequencies.get(nums[i]);
                freq++;
                frequencies.put(nums[i],freq);
            }
            else{
                frequencies.put(nums[i],1);
            }
        }
        for(Integer no : frequencies.keySet()){
            minheap.add(no);
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        while(!minheap.isEmpty()){
            output.add(minheap.poll());
        }
        int[] arr = new int[k];
        for(int i = 0; i < k; i++){
            arr[i] = output.get(i);
        }
        return arr;
    }
}