class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String s : strs){
            encoded += String.format("%03d",s.length())+s+"~~";
        }
        System.out.println(encoded);
        return encoded;
    }

    public List<String> decode(String strr) {
        List<String> decoded = new ArrayList<>();
        String[] strary = strr.split("~~");
        if(strr.equals(""))return new ArrayList<>();
        System.out.print("input strr is "+strr);
        for(String s : strary){
            // String str="";
            // System.out.print(s.substring(0,3));
            int size = Integer.parseInt(s.substring(0,3));
            // int size = 5;
            String str = s.substring(3);
            str = str ==""?"":str;
            System.out.println("size is "+size+" string length is "+s.length()+" String is   "+str);
            decoded.add(str);
        }
        return decoded;
    }
}
