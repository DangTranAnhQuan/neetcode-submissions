class Solution {
public:
    bool isAnagram(string s, string t) {
        if (s.length() != t.length())
            return false;

        int cnt[256] = {0};
        for (int i = 0; i < s.length(); i++)
            cnt[s[i]]++;
        
        for (int i = 0; i < t.length(); i++)
            cnt[t[i]]--;
        
        for (int i = 0; i < 256; i++)
            if (cnt[i] > 0)
                return false;
        return true;
    }
};
