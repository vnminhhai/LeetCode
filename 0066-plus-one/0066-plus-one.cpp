class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        short s=digits.size();
        bool c=true;
        for (short i=s-1; i>=0; i--) {
            if (c) if (++digits[i]==10) {c=true; digits[i]=0;}
            else c=false;
        }
        if (c) digits.insert(digits.begin(),1);
        return digits;
    }
};