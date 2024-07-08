class Solution {
    public String simplifyPath(String path) {
        int count=0;
        if (path.length()==1) return path;
        String res="";
        Stack<String> s1 = new Stack<>();
        String[] directories = path.split("/+");
        for (int i=directories.length-1;i>=0;i--) {
            if (directories[i].equals("..")) {count++; continue;}
            if (directories[i].equals(".")) continue;
            if (count>0) count--; 
            else s1.add(directories[i]);
        }
        while (!s1.isEmpty()) {
            if (s1.peek().equals("")) s1.pop();
            else res+="/"+s1.pop();
        }
        if (res.length()==0) return "/";
        else return res;
    }
}