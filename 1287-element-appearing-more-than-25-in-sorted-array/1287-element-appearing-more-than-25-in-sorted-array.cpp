class Solution {
public:
    int findSpecialInteger(vector<int>& arr) {
        int l=arr.size(), m=l/4, c=1;
        for (int i=1; i<l; i++) {
            if (arr[i]==arr[i-1]) c++;
            else if (c>m) return arr[i-1];
            else c=1;
        }
        if (c>m) return arr[l-1];
        return 1;
    }
};