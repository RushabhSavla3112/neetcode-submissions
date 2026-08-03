class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<HashMap<Character, Integer>> hml = new ArrayList<>();
        HashMap<ArrayList<Integer>, String> hm = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            // Array<Integer> cl = new ArrayList<>(26);
            ArrayList<Integer> cl = new ArrayList<>(Collections.nCopies(26, 0));
            // HashMap<Character, Integer> hm = new HashMap<>();
            for (Character c : strs[i].toCharArray()) {
                int psn = c - 'a';
                // cl.get(psn)++;
                cl.set(psn, cl.get(psn) + 1);
                // hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
            String j = hm.getOrDefault(cl, "") + "~" + i;
            hm.put(cl, j);
            // hml.add(hm);
        }
        for (Map.Entry<ArrayList<Integer>, String> entry : hm.entrySet()) {
            String s = entry.getValue();
            String[] ls = s.split("~");
            System.out.print(ls);
            List<String> ress = new ArrayList<>();
            for(int i = 0; i < ls.length; i++){
                if(!ls[i].equals("")){
                int index = Integer.parseInt(ls[i]);
                System.out.print(strs[index]);
                            ress.add(strs[index]);

                }
            }
            res.add(ress);
        }
        return res;
    }
}
