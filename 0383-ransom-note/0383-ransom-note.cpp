class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        int mag[26];
                
        for (int i=0; i<26; i++) {
            mag[i]=0;
        }
        for (int i=0; i<magazine.length(); ++i) {
            mag[magazine[i]-'a']++;
        }
        for (int i=0; i<ransomNote.length(); ++i) {
            if (mag[ransomNote[i]-'a']--<1) return false;
        }
        return true;
    }
};