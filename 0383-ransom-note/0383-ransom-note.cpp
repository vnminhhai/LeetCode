class Solution {
public:
    bool canConstruct(string ransomNote, string magazine) {
        map<char,int> mag;
        for (int i=0; i<magazine.length(); ++i) {
            if (mag.count(magazine[i])==0)
                mag.insert(pair<char,int>(magazine[i],1));
            else mag.at(magazine[i])++;
        }
        for (int i=0; i<ransomNote.length(); ++i) {
            if (mag.count(ransomNote[i])==0) return false;
            else {
                mag.at(ransomNote[i])--;
                if (mag.at(ransomNote[i])==0) mag.erase(ransomNote[i]);
            }
        }
        
        return true;
    }
};